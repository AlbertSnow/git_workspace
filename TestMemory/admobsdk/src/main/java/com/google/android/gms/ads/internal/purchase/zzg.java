package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgg.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;

@zzhb
public final class zzg extends zzgg.zza
  implements ServiceConnection
{
  private boolean zzFS = false;
  private Context mContext;
  private int zzFT;
  private Intent zzFU;
  private zzf zzFM;
  private String zzFI;
  zzb zzFC;

  public zzg(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    this.zzFI = paramString;
    this.zzFT = paramInt;
    this.zzFU = paramIntent;
    this.zzFS = paramBoolean;
    this.mContext = paramContext;
    this.zzFM = paramzzf;
  }

  public boolean isVerified()
  {
    return this.zzFS;
  }

  public String getProductId()
  {
    return this.zzFI;
  }

  public Intent getPurchaseData()
  {
    return this.zzFU;
  }

  public int getResultCode()
  {
    return this.zzFT;
  }

  public void finishPurchase()
  {
    int i = zzr.zzbM().zzd(this.zzFU);
    if ((this.zzFT != -1) || (i != 0))
      return;
    this.zzFC = new zzb(this.mContext);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    com.google.android.gms.common.stats.zzb.zzrP().zza(this.mContext, localIntent, this, 1);
  }

  public void onServiceDisconnected(ComponentName name)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }

  public void onServiceConnected(ComponentName name, IBinder service)
  {
    zzin.zzaJ("In-app billing service connected.");
    this.zzFC.zzN(service);
    String str1 = zzr.zzbM().zze(this.zzFU);
    String str2 = zzr.zzbM().zzar(str1);
    if (str2 == null)
      return;
    int i = this.zzFC.zzh(this.mContext.getPackageName(), str2);
    if (i == 0)
    {
      zzh localzzh = zzh.zzy(this.mContext);
      localzzh.zza(this.zzFM);
    }
    com.google.android.gms.common.stats.zzb.zzrP().zza(this.mContext, this);
    this.zzFC.destroy();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzg
 * JD-Core Version:    0.6.0
 */