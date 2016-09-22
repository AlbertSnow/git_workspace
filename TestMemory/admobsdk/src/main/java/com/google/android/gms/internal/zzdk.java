package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzdk
  implements zzdf
{
  final HashMap<String, zzjd<JSONObject>> zzzz = new HashMap();

  public Future<JSONObject> zzR(String paramString)
  {
    zzjd localzzjd = new zzjd();
    this.zzzz.put(paramString, localzzjd);
    return localzzjd;
  }

  public void zzd(String paramString1, String paramString2)
  {
    zzin.zzaI("Received ad from the cache.");
    zzjd localzzjd = (zzjd)this.zzzz.get(paramString1);
    if (localzzjd == null)
    {
      zzin.e("Could not find the ad request for the corresponding ad response.");
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString2);
      localzzjd.zzg(localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Failed constructing JSON object from value passed from javascript", localJSONException);
      localzzjd.zzg(null);
    }
    finally
    {
      this.zzzz.remove(paramString1);
    }
  }

  public void zzS(String paramString)
  {
    zzjd localzzjd = (zzjd)this.zzzz.get(paramString);
    if (localzzjd == null)
    {
      zzin.e("Could not find the ad request for the corresponding ad response.");
      return;
    }
    if (!localzzjd.isDone())
      localzzjd.cancel(true);
    this.zzzz.remove(paramString);
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("fetched_ad");
    zzd(str1, str2);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdk
 * JD-Core Version:    0.6.0
 */