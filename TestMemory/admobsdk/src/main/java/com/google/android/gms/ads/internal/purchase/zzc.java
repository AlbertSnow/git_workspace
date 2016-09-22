package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@zzhb
public class zzc extends zzim
  implements ServiceConnection
{
  private final Object zzpV = new Object();
  private boolean zzFB = false;
  private Context mContext;
  private zzgh zzAK;
  private zzb zzFC;
  private zzh zzFD;
  private List<zzf> zzFE = null;
  private zzk zzFF;

  public zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk)
  {
    this(paramContext, paramzzgh, paramzzk, new zzb(paramContext), zzh.zzy(paramContext.getApplicationContext()));
  }

  zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk, zzb paramzzb, zzh paramzzh)
  {
    this.mContext = paramContext;
    this.zzAK = paramzzgh;
    this.zzFF = paramzzk;
    this.zzFC = paramzzb;
    this.zzFD = paramzzh;
    this.zzFE = this.zzFD.zzg(10L);
  }

  public void zzbr()
  {
    synchronized (this.zzpV)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      com.google.android.gms.common.stats.zzb.zzrP().zza(this.mContext, localIntent, this, 1);
      zze(SystemClock.elapsedRealtime());
      com.google.android.gms.common.stats.zzb.zzrP().zza(this.mContext, this);
      this.zzFC.destroy();
    }
  }

  public void onStop()
  {
    synchronized (this.zzpV)
    {
      com.google.android.gms.common.stats.zzb.zzrP().zza(this.mContext, this);
      this.zzFC.destroy();
    }
  }

  public void onServiceDisconnected(ComponentName name)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }

  public void onServiceConnected(ComponentName name, IBinder service)
  {
    synchronized (this.zzpV)
    {
      this.zzFC.zzN(service);
      zzfW();
      this.zzFB = true;
      this.zzpV.notify();
    }
  }

  protected void zzfW()
  {
    if (this.zzFE.isEmpty())
      return;
    HashMap localHashMap = new HashMap();
    Object localObject1 = this.zzFE.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zzf)((Iterator)localObject1).next();
      localHashMap.put(((zzf)localObject2).zzFR, localObject2);
    }
    localObject1 = null;
    do
    {
      localObject2 = this.zzFC.zzi(this.mContext.getPackageName(), (String)localObject1);
      if (localObject2 == null)
        break;
      int i = zzr.zzbM().zzd((Bundle)localObject2);
      if (i != 0)
        break;
      ArrayList localArrayList1 = ((Bundle)localObject2).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
      ArrayList localArrayList2 = ((Bundle)localObject2).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
      ArrayList localArrayList3 = ((Bundle)localObject2).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
      localObject1 = ((Bundle)localObject2).getString("INAPP_CONTINUATION_TOKEN");
      for (int j = 0; j < localArrayList1.size(); j++)
      {
        if (!localHashMap.containsKey(localArrayList1.get(j)))
          continue;
        String str2 = (String)localArrayList1.get(j);
        String str3 = (String)localArrayList2.get(j);
        String str4 = (String)localArrayList3.get(j);
        zzf localzzf = (zzf)localHashMap.get(str2);
        String str5 = zzr.zzbM().zzaq(str3);
        if (!localzzf.zzFQ.equals(str5))
          continue;
        zza(localzzf, str3, str4);
        localHashMap.remove(str2);
      }
    }
    while ((localObject1 != null) && (!localHashMap.isEmpty()));
    Object localObject2 = localHashMap.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str1 = (String)((Iterator)localObject2).next();
      this.zzFD.zza((zzf)localHashMap.get(str1));
    }
  }

  protected void zza(zzf paramzzf, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    zzr.zzbM();
    localIntent.putExtra("RESPONSE_CODE", 0);
    zzr.zzbM();
    localIntent.putExtra("INAPP_PURCHASE_DATA", paramString1);
    zzr.zzbM();
    localIntent.putExtra("INAPP_DATA_SIGNATURE", paramString2);
    zzir.zzMc.post(new Runnable(paramzzf, localIntent)
    {
      public void run()
      {
        try
        {
          if (zzc.zza(zzc.this).zza(this.zzFG.zzFQ, -1, this.val$intent))
            zzc.zzc(zzc.this).zza(new zzg(zzc.zzb(zzc.this), this.zzFG.zzFR, true, -1, this.val$intent, this.zzFG));
          else
            zzc.zzc(zzc.this).zza(new zzg(zzc.zzb(zzc.this), this.zzFG.zzFR, false, -1, this.val$intent, this.zzFG));
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzaK("Fail to verify and dispatch pending transaction");
        }
      }
    });
  }

  private void zze(long paramLong)
  {
    do
    {
      if (zzf(paramLong))
        continue;
      zzin.v("Timeout waiting for pending transaction to be processed.");
    }
    while (!this.zzFB);
  }

  private boolean zzf(long paramLong)
  {
    long l = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.zzpV.wait(l);
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzaK("waitWithTimeout_lock interrupted");
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzc
 * JD-Core Version:    0.6.0
 */