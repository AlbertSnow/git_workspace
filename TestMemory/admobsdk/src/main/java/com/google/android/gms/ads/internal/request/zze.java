package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zze extends com.google.android.gms.common.internal.zzj<zzj>
{
  final int zzHr;

  public zze(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramLooper, 8, zzf.zzat(paramContext), paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzHr = paramInt;
  }

  protected String zzgu()
  {
    return "com.google.android.gms.ads.service.START";
  }

  protected String zzgv()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }

  protected zzj zzV(IBinder paramIBinder)
  {
    return zzj.zza.zzX(paramIBinder);
  }

  public zzj zzgw()
    throws DeadObjectException
  {
    return (zzj)super.zzqJ();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zze
 * JD-Core Version:    0.6.0
 */