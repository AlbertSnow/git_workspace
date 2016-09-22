package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

@zzhb
public class zzgl
  implements InAppPurchase
{
  private final zzgc zzFL;

  public zzgl(zzgc paramzzgc)
  {
    this.zzFL = paramzzgc;
  }

  public String getProductId()
  {
    try
    {
      return this.zzFL.getProductId();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getProductId to InAppPurchase", localRemoteException);
    }
    return null;
  }

  public void recordResolution(int resolution)
  {
    try
    {
      this.zzFL.recordResolution(resolution);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward recordResolution to InAppPurchase", localRemoteException);
    }
  }

  public void recordPlayBillingResolution(int billingResponseCode)
  {
    try
    {
      this.zzFL.recordPlayBillingResolution(billingResponseCode);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgl
 * JD-Core Version:    0.6.0
 */