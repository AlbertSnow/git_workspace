package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzch.zza;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzc extends zzch.zza
{
  private final Drawable zzxU;
  private final Uri mUri;
  private final double zzxV;

  public zzc(Drawable paramDrawable, Uri paramUri, double paramDouble)
  {
    this.zzxU = paramDrawable;
    this.mUri = paramUri;
    this.zzxV = paramDouble;
  }

  public zzd zzdJ()
    throws RemoteException
  {
    return zze.zzC(this.zzxU);
  }

  public Uri getUri()
    throws RemoteException
  {
    return this.mUri;
  }

  public double getScale()
  {
    return this.zzxV;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzc
 * JD-Core Version:    0.6.0
 */