package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzgx
  implements zzgw.zza<zzd>
{
  private final boolean zzHc;
  private final boolean zzHd;

  public zzgx(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzHc = paramBoolean1;
    this.zzHd = paramBoolean2;
  }

  public zzd zzb(zzgw paramzzgw, JSONObject paramJSONObject)
    throws JSONException, InterruptedException, ExecutionException
  {
    List localList = paramzzgw.zza(paramJSONObject, "images", true, this.zzHc, this.zzHd);
    zzjg localzzjg1 = paramzzgw.zza(paramJSONObject, "app_icon", true, this.zzHc);
    zzjg localzzjg2 = paramzzgw.zzf(paramJSONObject);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      zzjg localzzjg3 = (zzjg)localIterator.next();
      localArrayList.add(localzzjg3.get());
    }
    return new zzd(paramJSONObject.getString("headline"), localArrayList, paramJSONObject.getString("body"), (zzch)localzzjg1.get(), paramJSONObject.getString("call_to_action"), paramJSONObject.optDouble("rating", -1.0D), paramJSONObject.optString("store"), paramJSONObject.optString("price"), (zza)localzzjg2.get(), new Bundle());
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgx
 * JD-Core Version:    0.6.0
 */