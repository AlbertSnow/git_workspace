package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzgy
  implements zzgw.zza<zze>
{
  private final boolean zzHc;
  private final boolean zzHd;

  public zzgy(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzHc = paramBoolean1;
    this.zzHd = paramBoolean2;
  }

  public zze zzc(zzgw paramzzgw, JSONObject paramJSONObject)
    throws JSONException, InterruptedException, ExecutionException
  {
    List localList = paramzzgw.zza(paramJSONObject, "images", true, this.zzHc, this.zzHd);
    zzjg localzzjg1 = paramzzgw.zza(paramJSONObject, "secondary_image", false, this.zzHc);
    zzjg localzzjg2 = paramzzgw.zzf(paramJSONObject);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      zzjg localzzjg3 = (zzjg)localIterator.next();
      localArrayList.add(localzzjg3.get());
    }
    return new zze(paramJSONObject.getString("headline"), localArrayList, paramJSONObject.getString("body"), (zzch)localzzjg1.get(), paramJSONObject.getString("call_to_action"), paramJSONObject.getString("advertiser"), (zza)localzzjg2.get(), new Bundle());
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgy
 * JD-Core Version:    0.6.0
 */