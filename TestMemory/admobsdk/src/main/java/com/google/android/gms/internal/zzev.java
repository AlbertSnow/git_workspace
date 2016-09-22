package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzev
  implements zzem
{
  private final AdRequestInfoParcel zzCu;
  private final zzex zzpn;
  private final Context mContext;
  private final Object zzpV = new Object();
  private final zzeo zzCf;
  private final boolean zzsA;
  private final long zzCv;
  private final long zzCw;
  private final zzcb zzpe;
  private final boolean zzuS;
  private boolean zzCy = false;
  private zzer zzCD;

  public zzev(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzex paramzzex, zzeo paramzzeo, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, zzcb paramzzcb)
  {
    this.mContext = paramContext;
    this.zzCu = paramAdRequestInfoParcel;
    this.zzpn = paramzzex;
    this.zzCf = paramzzeo;
    this.zzsA = paramBoolean1;
    this.zzuS = paramBoolean2;
    this.zzCv = paramLong1;
    this.zzCw = paramLong2;
    this.zzpe = paramzzcb;
  }

  public zzes zzc(List<zzen> paramList)
  {
    zzin.zzaI("Starting mediation.");
    ArrayList localArrayList = new ArrayList();
    zzbz localzzbz1 = this.zzpe.zzdB();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      zzen localzzen = (zzen)localIterator1.next();
      zzin.zzaJ("Trying mediation network: " + localzzen.zzBA);
      Iterator localIterator2 = localzzen.zzBB.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        zzbz localzzbz2 = this.zzpe.zzdB();
        synchronized (this.zzpV)
        {
          if (this.zzCy)
            return new zzes(-1);
          this.zzCD = new zzer(this.mContext, str, this.zzpn, this.zzCf, localzzen, this.zzCu.zzHt, this.zzCu.zzrp, this.zzCu.zzrl, this.zzsA, this.zzuS, this.zzCu.zzrD, this.zzCu.zzrH);
        }
        ??? = this.zzCD.zza(this.zzCv, this.zzCw);
        if (((zzes)???).zzCo == 0)
        {
          zzin.zzaI("Adapter succeeded.");
          this.zzpe.zzc("mediation_network_succeed", str);
          if (!localArrayList.isEmpty())
            this.zzpe.zzc("mediation_networks_fail", TextUtils.join(",", localArrayList));
          this.zzpe.zza(localzzbz2, new String[] { "mls" });
          this.zzpe.zza(localzzbz1, new String[] { "ttm" });
          return ???;
        }
        localArrayList.add(str);
        this.zzpe.zza(localzzbz2, new String[] { "mlf" });
        if (((zzes)???).zzCq != null)
          zzir.zzMc.post(new Runnable((zzes)???)
          {
            public void run()
            {
              try
              {
                this.zzCE.zzCq.destroy();
              }
              catch (RemoteException localRemoteException)
              {
                zzin.zzd("Could not destroy mediation adapter.", localRemoteException);
              }
            }
          });
      }
    }
    if (!localArrayList.isEmpty())
      this.zzpe.zzc("mediation_networks_fail", TextUtils.join(",", localArrayList));
    return (zzes)new zzes(1);
  }

  public void cancel()
  {
    synchronized (this.zzpV)
    {
      this.zzCy = true;
      if (this.zzCD != null)
        this.zzCD.cancel();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzev
 * JD-Core Version:    0.6.0
 */