package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzde
{
  public static final zzdf zzyX = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
    }
  };
  public static final zzdf zzyY = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      String str1 = (String)paramMap.get("urls");
      if (TextUtils.isEmpty(str1))
      {
        zzin.zzaK("URLs missing in canOpenURLs GMSG.");
        return;
      }
      String[] arrayOfString1 = str1.split(",");
      HashMap localHashMap = new HashMap();
      PackageManager localPackageManager = paramzzjp.getContext().getPackageManager();
      for (String str2 : arrayOfString1)
      {
        String[] arrayOfString3 = str2.split(";", 2);
        String str3 = arrayOfString3[0].trim();
        String str4 = arrayOfString3.length > 1 ? arrayOfString3[1].trim() : "android.intent.action.VIEW";
        Uri localUri = Uri.parse(str3);
        Intent localIntent = new Intent(str4, localUri);
        ResolveInfo localResolveInfo = localPackageManager.resolveActivity(localIntent, 65536);
        localHashMap.put(str2, Boolean.valueOf(localResolveInfo != null));
      }
      paramzzjp.zza("openableURLs", localHashMap);
    }
  };
  public static final zzdf zzyZ = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      PackageManager localPackageManager = paramzzjp.getContext().getPackageManager();
      String str1 = (String)paramMap.get("data");
      JSONObject localJSONObject1;
      try
      {
        localJSONObject1 = new JSONObject(str1);
      }
      catch (JSONException localJSONException1)
      {
        paramzzjp.zzb("openableIntents", new JSONObject());
        return;
      }
      JSONArray localJSONArray;
      try
      {
        localJSONArray = localJSONObject1.getJSONArray("intents");
      }
      catch (JSONException localJSONException2)
      {
        paramzzjp.zzb("openableIntents", new JSONObject());
        return;
      }
      JSONObject localJSONObject2 = new JSONObject();
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject3;
        try
        {
          localJSONObject3 = localJSONArray.getJSONObject(i);
        }
        catch (JSONException localJSONException3)
        {
          zzin.zzb("Error parsing the intent data.", localJSONException3);
          continue;
        }
        String str2 = localJSONObject3.optString("id");
        String str3 = localJSONObject3.optString("u");
        String str4 = localJSONObject3.optString("i");
        String str5 = localJSONObject3.optString("m");
        String str6 = localJSONObject3.optString("p");
        String str7 = localJSONObject3.optString("c");
        String str8 = localJSONObject3.optString("f");
        String str9 = localJSONObject3.optString("e");
        Intent localIntent = new Intent();
        if (!TextUtils.isEmpty(str3))
          localIntent.setData(Uri.parse(str3));
        if (!TextUtils.isEmpty(str4))
          localIntent.setAction(str4);
        if (!TextUtils.isEmpty(str5))
          localIntent.setType(str5);
        if (!TextUtils.isEmpty(str6))
          localIntent.setPackage(str6);
        if (!TextUtils.isEmpty(str7))
        {
          localObject = str7.split("/", 2);
          if (localObject.length == 2)
            localIntent.setComponent(new ComponentName(localObject[0], localObject[1]));
        }
        Object localObject = localPackageManager.resolveActivity(localIntent, 65536);
        boolean bool = localObject != null;
        try
        {
          localJSONObject2.put(str2, bool);
        }
        catch (JSONException localJSONException4)
        {
          zzin.zzb("Error constructing openable urls response.", localJSONException4);
        }
      }
      paramzzjp.zzb("openableIntents", localJSONObject2);
    }
  };
  public static final zzdf zzza = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      String str = (String)paramMap.get("u");
      if (str == null)
      {
        zzin.zzaK("URL missing from click GMSG.");
        return;
      }
      Uri localUri = Uri.parse(str);
      try
      {
        zzan localzzan = paramzzjp.zzhW();
        if ((localzzan != null) && (localzzan.zzb(localUri)))
          localUri = localzzan.zza(localUri, paramzzjp.getContext());
      }
      catch (zzao localzzao)
      {
        zzin.zzaK("Unable to append parameter to URL: " + str);
      }
      str = localUri.toString();
      zziy localzziy = new zziy(paramzzjp.getContext(), paramzzjp.zzhX().afmaVersion, str);
      localzziy.zzhn();
    }
  };
  public static final zzdf zzzb = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd1 = paramzzjp.zzhS();
      if (localzzd1 != null)
      {
        localzzd1.close();
      }
      else
      {
        com.google.android.gms.ads.internal.overlay.zzd localzzd2 = paramzzjp.zzhT();
        if (localzzd2 != null)
          localzzd2.close();
        else
          zzin.zzaK("A GMSG tried to close something that wasn't an overlay.");
      }
    }
  };
  public static final zzdf zzzc = new zzdf()
  {
    private void zzc(zzjp paramzzjp)
    {
      zzin.zzaJ("Received support message, responding.");
      boolean bool = false;
      com.google.android.gms.ads.internal.zzd localzzd = paramzzjp.zzhR();
      if (localzzd != null)
      {
        localObject = localzzd.zzpy;
        if (localObject != null)
          bool = ((zzm)localObject).zzfM();
      }
      Object localObject = new JSONObject();
      try
      {
        ((JSONObject)localObject).put("event", "checkSupport");
        ((JSONObject)localObject).put("supports", bool);
        paramzzjp.zzb("appStreaming", (JSONObject)localObject);
      }
      catch (Throwable localThrowable)
      {
      }
    }

    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if ("checkSupport".equals(paramMap.get("action")))
      {
        zzc(paramzzjp);
        return;
      }
      com.google.android.gms.ads.internal.overlay.zzd localzzd = paramzzjp.zzhS();
      if (localzzd != null)
        localzzd.zzg(paramzzjp, paramMap);
    }
  };
  public static final zzdf zzzd = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      paramzzjp.zzE("1".equals(paramMap.get("custom_close")));
    }
  };
  public static final zzdf zzze = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      String str = (String)paramMap.get("u");
      if (str == null)
      {
        zzin.zzaK("URL missing from httpTrack GMSG.");
        return;
      }
      zziy localzziy = new zziy(paramzzjp.getContext(), paramzzjp.zzhX().afmaVersion, str);
      localzziy.zzhn();
    }
  };
  public static final zzdf zzzf = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      zzin.zzaJ("Received log message: " + (String)paramMap.get("string"));
    }
  };
  public static final zzdf zzzg = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      String str1 = (String)paramMap.get("tx");
      String str2 = (String)paramMap.get("ty");
      String str3 = (String)paramMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(str3);
        zzan localzzan = paramzzjp.zzhW();
        if (localzzan != null)
        {
          zzaj localzzaj = localzzan.zzab();
          localzzaj.zza(i, j, k);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzaK("Could not parse touch parameters from gmsg.");
      }
    }
  };
  public static final zzdf zzzh = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if (!((Boolean)zzbt.zzwT.get()).booleanValue())
        return;
      String str = (String)paramMap.get("disabled");
      boolean bool = Boolean.parseBoolean(str);
      paramzzjp.zzF(!bool);
    }
  };
  public static final zzdf zzzi = new zzdo();
  public static final zzdf zzzj = new zzds();
  public static final zzdf zzzk = new zzdd();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzde
 * JD-Core Version:    0.6.0
 */