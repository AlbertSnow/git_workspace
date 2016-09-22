package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzhb
public class zzci extends NativeAd.Image
{
  private final zzch zzyL;
  private final Drawable mDrawable;
  private final Uri mUri;
  private final double zzxV;

  public zzci(zzch paramzzch)
  {
    this.zzyL = paramzzch;
    Drawable localDrawable = null;
    try
    {
      zzd localzzd = this.zzyL.zzdJ();
      if (localzzd != null)
        localDrawable = (Drawable)zze.zzp(localzzd);
    }
    catch (RemoteException localRemoteException1)
    {
      zzb.zzb("Failed to get drawable.", localRemoteException1);
    }
    this.mDrawable = localDrawable;
    Uri localUri = null;
    try
    {
      localUri = this.zzyL.getUri();
    }
    catch (RemoteException localRemoteException2)
    {
      zzb.zzb("Failed to get uri.", localRemoteException2);
    }
    this.mUri = localUri;
    double d = 1.0D;
    try
    {
      d = this.zzyL.getScale();
    }
    catch (RemoteException localRemoteException3)
    {
      zzb.zzb("Failed to get scale.", localRemoteException3);
    }
    this.zzxV = d;
  }

  public Drawable getDrawable()
  {
    return this.mDrawable;
  }

  public Uri getUri()
  {
    return this.mUri;
  }

  public double getScale()
  {
    return this.zzxV;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzci
 * JD-Core Version:    0.6.0
 */