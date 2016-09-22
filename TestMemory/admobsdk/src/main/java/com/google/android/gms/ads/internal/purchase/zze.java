package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgc;
import com.google.android.gms.internal.zzge.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;

@zzhb
public class zze extends zzge.zza
  implements ServiceConnection
{
  private final Activity mActivity;
  zzh zzFD;
  private Context zzFK;
  private zzgc zzFL;
  private zzb zzFC;
  private zzf zzFM;
  private zzj zzFN;
  private zzk zzFF;
  private String zzFO = null;

  public zze(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    this.zzFD = zzh.zzy(this.mActivity.getApplicationContext());
  }

  public void onCreate()
  {
    GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = GInAppPurchaseManagerInfoParcel.zzc(this.mActivity.getIntent());
    this.zzFN = localGInAppPurchaseManagerInfoParcel.zzFy;
    this.zzFF = localGInAppPurchaseManagerInfoParcel.zzrI;
    this.zzFL = localGInAppPurchaseManagerInfoParcel.zzFw;
    this.zzFC = new zzb(this.mActivity.getApplicationContext());
    this.zzFK = localGInAppPurchaseManagerInfoParcel.zzFx;
    int i = this.mActivity.getResources().getConfiguration().orientation;
    if (i == 2)
      this.mActivity.setRequestedOrientation(zzr.zzbE().zzhv());
    else
      this.mActivity.setRequestedOrientation(zzr.zzbE().zzhw());
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    this.mActivity.bindService(localIntent, this, 1);
  }

  public void onDestroy()
  {
    this.mActivity.unbindService(this);
    this.zzFC.destroy();
  }

  public void onActivityResult(int requestCode, int resultCode, Intent data)
  {
    if (requestCode == 1001)
    {
      boolean bool = false;
      try
      {
        int i = zzr.zzbM().zzd(data);
        if (resultCode == -1)
        {
          zzr.zzbM();
          if (i == 0)
          {
            if (!this.zzFF.zza(this.zzFO, resultCode, data))
              break label67;
            bool = true;
            break label67;
          }
        }
        this.zzFD.zza(this.zzFM);
        label67: this.zzFL.recordPlayBillingResolution(i);
        this.mActivity.finish();
        zza(this.zzFL.getProductId(), bool, resultCode, data);
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzaK("Fail to process purchase result.");
        this.mActivity.finish();
      }
      finally
      {
        this.zzFO = null;
      }
    }
  }

  public void onServiceDisconnected(ComponentName name)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }

  public void onServiceConnected(ComponentName name, IBinder service)
  {
    this.zzFC.zzN(service);
    try
    {
      this.zzFO = this.zzFF.zzfZ();
      Bundle localBundle = this.zzFC.zzb(this.mActivity.getPackageName(), this.zzFL.getProductId(), this.zzFO);
      PendingIntent localPendingIntent = (PendingIntent)localBundle.getParcelable("BUY_INTENT");
      if (localPendingIntent == null)
      {
        int i = zzr.zzbM().zzd(localBundle);
        this.zzFL.recordPlayBillingResolution(i);
        zza(this.zzFL.getProductId(), false, i, null);
        this.mActivity.finish();
      }
      else
      {
        this.zzFM = new zzf(this.zzFL.getProductId(), this.zzFO);
        this.zzFD.zzb(this.zzFM);
        this.mActivity.startIntentSenderForResult(localPendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException1)
    {
      zzin.zzd("Error when connecting in-app billing service", localSendIntentException1);
      this.mActivity.finish();
    }
  }

  protected void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    if (this.zzFN != null)
      this.zzFN.zza(paramString, paramBoolean, paramInt, paramIntent, this.zzFM);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zze
 * JD-Core Version:    0.6.0
 */