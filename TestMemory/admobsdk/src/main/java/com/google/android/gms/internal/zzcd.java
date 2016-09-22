package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

@zzhb
public class zzcd
  implements CustomRenderedAd
{
  private final zzce zzxH;

  public zzcd(zzce paramzzce)
  {
    this.zzxH = paramzzce;
  }

  public String getBaseUrl()
  {
    try
    {
      return this.zzxH.zzdF();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate getBaseURL to CustomRenderedAd", localRemoteException);
    }
    return null;
  }

  public String getContent()
  {
    try
    {
      return this.zzxH.getContent();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate getContent to CustomRenderedAd", localRemoteException);
    }
    return null;
  }

  public void onAdRendered(View view)
  {
    try
    {
      this.zzxH.zzb(view != null ? zze.zzC(view) : null);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate onAdRendered to CustomRenderedAd", localRemoteException);
    }
  }

  public void recordClick()
  {
    try
    {
      this.zzxH.recordClick();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate recordClick to CustomRenderedAd", localRemoteException);
    }
  }

  public void recordImpression()
  {
    try
    {
      this.zzxH.recordImpression();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate recordImpression to CustomRenderedAd", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcd
 * JD-Core Version:    0.6.0
 */