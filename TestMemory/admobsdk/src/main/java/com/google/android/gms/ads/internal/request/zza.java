package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzim;

@zzhb
public class zza
{
  public zzim zza(Context paramContext, AdRequestInfoParcel.zza paramzza, zzan paramzzan, zza paramzza1)
  {
    Object localObject;
    if (paramzza.zzHt.extras.getBundle("sdk_less_server_data") != null)
      localObject = new zzm(paramContext, paramzza, paramzza1);
    else
      localObject = new zzb(paramContext, paramzza, paramzzan, paramzza1);
    ((zzim)localObject).zzhn();
    return (zzim)localObject;
  }

  public static abstract interface zza
  {
    public abstract void zza(zzif.zza paramzza);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zza
 * JD-Core Version:    0.6.0
 */