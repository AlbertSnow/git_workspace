package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzdg
  implements zzdf
{
  private final Context mContext;
  private final VersionInfoParcel zzpT;

  public zzdg(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    this.mContext = paramContext;
    this.zzpT = paramVersionInfoParcel;
  }

  protected zzb zzc(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("http_request_id");
    String str2 = paramJSONObject.optString("url");
    String str3 = paramJSONObject.optString("post_body", null);
    URL localURL = null;
    try
    {
      localURL = new URL(str2);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      zzin.zzb("Error constructing http request.", localMalformedURLException);
    }
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("headers");
    if (localJSONArray == null)
      localJSONArray = new JSONArray();
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.optJSONObject(i);
      if (localJSONObject == null)
        continue;
      String str4 = localJSONObject.optString("key");
      String str5 = localJSONObject.optString("value");
      localArrayList.add(new zza(str4, str5));
    }
    return new zzb(str1, localURL, localArrayList, str3);
  }

  protected JSONObject zza(zzd paramzzd)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("http_request_id", paramzzd.zzdU());
      if (paramzzd.getBody() != null)
        localJSONObject.put("body", paramzzd.getBody());
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = paramzzd.zzdZ().iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        localJSONArray.put(new JSONObject().put("key", localzza.getKey()).put("value", localzza.getValue()));
      }
      localJSONObject.put("headers", localJSONArray);
      localJSONObject.put("response_code", paramzzd.getResponseCode());
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error constructing JSON for http response.", localJSONException);
    }
    return localJSONObject;
  }

  protected zzc zza(zzb paramzzb)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramzzb.zzdV().openConnection();
      zzr.zzbC().zza(this.mContext, this.zzpT.afmaVersion, false, localHttpURLConnection);
      Object localObject1 = paramzzb.zzdW().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zza)((Iterator)localObject1).next();
        localHttpURLConnection.addRequestProperty(((zza)localObject2).getKey(), ((zza)localObject2).getValue());
      }
      if (!TextUtils.isEmpty(paramzzb.zzdX()))
      {
        localHttpURLConnection.setDoOutput(true);
        localObject1 = paramzzb.zzdX().getBytes();
        localHttpURLConnection.setFixedLengthStreamingMode(localObject1.length);
        localObject2 = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
        ((BufferedOutputStream)localObject2).write(localObject1);
        ((BufferedOutputStream)localObject2).close();
      }
      localObject1 = new ArrayList();
      if (localHttpURLConnection.getHeaderFields() != null)
      {
        localObject2 = localHttpURLConnection.getHeaderFields().entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
          Iterator localIterator = ((List)localEntry.getValue()).iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            ((ArrayList)localObject1).add(new zza((String)localEntry.getKey(), str));
          }
        }
      }
      Object localObject2 = new zzd(paramzzb.zzdU(), localHttpURLConnection.getResponseCode(), (List)localObject1, zzr.zzbC().zza(new InputStreamReader(localHttpURLConnection.getInputStream())));
      return new zzc(true, (zzd)localObject2, null);
    }
    catch (Exception localException)
    {
    }
    return (zzc)(zzc)new zzc(false, null, localException.toString());
  }

  public JSONObject zzQ(String paramString)
  {
    JSONObject localJSONObject1;
    try
    {
      localJSONObject1 = new JSONObject(paramString);
    }
    catch (JSONException localJSONException1)
    {
      zzin.e("The request is not a valid JSON.");
      try
      {
        return new JSONObject().put("success", false);
      }
      catch (JSONException localJSONException2)
      {
        return new JSONObject();
      }
    }
    JSONObject localJSONObject2 = new JSONObject();
    String str = "";
    try
    {
      str = localJSONObject1.optString("http_request_id");
      zzb localzzb = zzc(localJSONObject1);
      zzc localzzc = zza(localzzb);
      if (localzzc.isSuccess())
      {
        JSONObject localJSONObject3 = zza(localzzc.zzdY());
        localJSONObject2.put("response", localJSONObject3);
        localJSONObject2.put("success", true);
      }
      else
      {
        localJSONObject2.put("response", new JSONObject().put("http_request_id", str));
        localJSONObject2.put("success", false);
        localJSONObject2.put("reason", localzzc.getReason());
      }
    }
    catch (Exception localException)
    {
      try
      {
        localJSONObject2.put("response", new JSONObject().put("http_request_id", str));
        localJSONObject2.put("success", false);
        localJSONObject2.put("reason", localException.toString());
      }
      catch (JSONException localJSONException3)
      {
      }
    }
    return localJSONObject2;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    zziq.zza(new Runnable(paramMap, paramzzjp)
    {
      public void run()
      {
        zzin.zzaI("Received Http request.");
        String str = (String)this.zzyy.get("http_request");
        JSONObject localJSONObject = zzdg.this.zzQ(str);
        if (localJSONObject == null)
        {
          zzin.e("Response should not be null.");
          return;
        }
        zzir.zzMc.post(new Runnable(localJSONObject)
        {
          public void run()
          {
            zzdg.1.this.zzzl.zzb("fetchHttpRequestCompleted", this.zzzn);
            zzin.zzaI("Dispatched http response.");
          }
        });
      }
    });
  }

  @zzhb
  class zzc
  {
    private final zzdg.zzd zzzt;
    private final boolean zzzu;
    private final String zzzv;

    public zzc(boolean paramzzd, zzdg.zzd paramString, String arg4)
    {
      this.zzzu = paramzzd;
      this.zzzt = paramString;
      Object localObject;
      this.zzzv = localObject;
    }

    public String getReason()
    {
      return this.zzzv;
    }

    public zzdg.zzd zzdY()
    {
      return this.zzzt;
    }

    public boolean isSuccess()
    {
      return this.zzzu;
    }
  }

  @zzhb
  static class zzd
  {
    private final String zzzp;
    private final int zzzw;
    private final List<zzdg.zza> zzzx;
    private final String zzxY;

    public zzd(String paramString1, int paramInt, List<zzdg.zza> paramList, String paramString2)
    {
      this.zzzp = paramString1;
      this.zzzw = paramInt;
      if (paramList == null)
        this.zzzx = new ArrayList();
      else
        this.zzzx = paramList;
      this.zzxY = paramString2;
    }

    public String zzdU()
    {
      return this.zzzp;
    }

    public int getResponseCode()
    {
      return this.zzzw;
    }

    public Iterable<zzdg.zza> zzdZ()
    {
      return this.zzzx;
    }

    public String getBody()
    {
      return this.zzxY;
    }
  }

  @zzhb
  static class zzb
  {
    private final String zzzp;
    private final URL zzzq;
    private final ArrayList<zzdg.zza> zzzr;
    private final String zzzs;

    public zzb(String paramString1, URL paramURL, ArrayList<zzdg.zza> paramArrayList, String paramString2)
    {
      this.zzzp = paramString1;
      this.zzzq = paramURL;
      if (paramArrayList == null)
        this.zzzr = new ArrayList();
      else
        this.zzzr = paramArrayList;
      this.zzzs = paramString2;
    }

    public String zzdU()
    {
      return this.zzzp;
    }

    public URL zzdV()
    {
      return this.zzzq;
    }

    public ArrayList<zzdg.zza> zzdW()
    {
      return this.zzzr;
    }

    public String zzdX()
    {
      return this.zzzs;
    }
  }

  @zzhb
  static class zza
  {
    private final String zzvs;
    private final String mValue;

    public zza(String paramString1, String paramString2)
    {
      this.zzvs = paramString1;
      this.mValue = paramString2;
    }

    public String getKey()
    {
      return this.zzvs;
    }

    public String getValue()
    {
      return this.mValue;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdg
 * JD-Core Version:    0.6.0
 */