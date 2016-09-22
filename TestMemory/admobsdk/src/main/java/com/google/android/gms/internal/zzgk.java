package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

@zzhb
public class zzgk
  implements InAppPurchaseResult
{
  private final zzgg zzGb;

  public zzgk(zzgg paramzzgg)
  {
    this.zzGb = paramzzgg;
  }

  public boolean isVerified()
  {
    try
    {
      return this.zzGb.isVerified();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward isVerified to InAppPurchaseResult", localRemoteException);
    }
    return false;
  }

  public String getProductId()
  {
    try
    {
      return this.zzGb.getProductId();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getProductId to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }

  public Intent getPurchaseData()
  {
    try
    {
      return this.zzGb.getPurchaseData();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }

  public int getResultCode()
  {
    try
    {
      return this.zzGb.getResultCode();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return 0;
  }

  public void finishPurchase()
  {
    try
    {
      this.zzGb.finishPurchase();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward finishPurchase to InAppPurchaseResult", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgk
 * JD-Core Version:    0.6.0
 */