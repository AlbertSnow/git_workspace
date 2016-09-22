package com.google.android.gms.internal;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzgz
  implements zzgw.zza<zzf>
{
  private final boolean zzHc;

  public zzgz(boolean paramBoolean)
  {
    this.zzHc = paramBoolean;
  }

  public zzf zzd(zzgw paramzzgw, JSONObject paramJSONObject)
    throws JSONException, InterruptedException, ExecutionException
  {
    SimpleArrayMap localSimpleArrayMap1 = new SimpleArrayMap();
    SimpleArrayMap localSimpleArrayMap2 = new SimpleArrayMap();
    zzjg localzzjg = paramzzgw.zzf(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.getJSONArray("custom_assets");
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i);
      String str = localJSONObject.getString("type");
      if ("string".equals(str))
        zza(localJSONObject, localSimpleArrayMap2);
      else if ("image".equals(str))
        zza(paramzzgw, localJSONObject, localSimpleArrayMap1);
      else
        zzin.zzaK("Unknown custom asset type: " + str);
    }
    return new zzf(paramJSONObject.getString("custom_template_id"), zzc(localSimpleArrayMap1), localSimpleArrayMap2, (zza)localzzjg.get());
  }

  private void zza(JSONObject paramJSONObject, SimpleArrayMap<String, String> paramSimpleArrayMap)
    throws JSONException
  {
    String str1 = paramJSONObject.getString("name");
    String str2 = paramJSONObject.getString("string_value");
    paramSimpleArrayMap.put(str1, str2);
  }

  private void zza(zzgw paramzzgw, JSONObject paramJSONObject, SimpleArrayMap<String, Future<zzc>> paramSimpleArrayMap)
    throws JSONException
  {
    String str = paramJSONObject.getString("name");
    paramSimpleArrayMap.put(str, paramzzgw.zza(paramJSONObject, "image_value", this.zzHc));
  }

  private <K, V> SimpleArrayMap<K, V> zzc(SimpleArrayMap<K, Future<V>> paramSimpleArrayMap)
    throws InterruptedException, ExecutionException
  {
    SimpleArrayMap localSimpleArrayMap = new SimpleArrayMap();
    for (int i = 0; i < paramSimpleArrayMap.size(); i++)
      localSimpleArrayMap.put(paramSimpleArrayMap.keyAt(i), ((Future)paramSimpleArrayMap.valueAt(i)).get());
    return localSimpleArrayMap;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgz
 * JD-Core Version:    0.6.0
 */