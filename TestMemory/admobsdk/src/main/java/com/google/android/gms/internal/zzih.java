package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

@zzhb
public class zzih
  implements zzip.zzb
{
  private final Object zzpV = new Object();
  private final String zzLq;
  private final zzii zzLr;
  private zzax zzpl;
  private BigInteger zzLs = BigInteger.ONE;
  private final HashSet<zzig> zzLt = new HashSet();
  private final HashMap<String, zzik> zzLu = new HashMap();
  private boolean zzLv = false;
  private boolean zzJz = true;
  private int zzLw = 0;
  private boolean zzqA = false;
  private Context mContext;
  private VersionInfoParcel zzpT;
  private zzbv zzLx = null;
  private boolean zzJA = true;
  private zzbe zzsZ = null;
  private zzbf zzLy = null;
  private zzbd zzta = null;
  private String zzLz;
  private final LinkedList<Thread> zzLA = new LinkedList();
  private final zzha zztb = null;
  private Boolean zzLB = null;
  private String zzzN;
  private boolean zzLC = false;
  private boolean zzLD = false;

  public String getSessionId()
  {
    return this.zzLq;
  }

  public zzbf zzG(Context paramContext)
  {
    if ((!((Boolean)zzbt.zzwj.get()).booleanValue()) || (!zzne.zzsg()) || (zzgY()))
      return null;
    synchronized (this.zzpV)
    {
      if (this.zzsZ == null)
      {
        if (!(paramContext instanceof Activity))
          return null;
        this.zzsZ = new zzbe((Application)paramContext.getApplicationContext(), (Activity)paramContext);
      }
      if (this.zzta == null)
        this.zzta = new zzbd();
      if (this.zzLy == null)
        this.zzLy = new zzbf(this.zzsZ, this.zzta, new zzha(this.mContext, this.zzpT, null, null));
      this.zzLy.zzcG();
      return this.zzLy;
    }
  }

  public void zzB(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (this.zzJA != paramBoolean)
        zzip.zzb(this.mContext, paramBoolean);
      this.zzJA = paramBoolean;
      zzbf localzzbf = zzG(this.mContext);
      if ((localzzbf != null) && (!localzzbf.isAlive()))
      {
        zzin.zzaJ("start fetching content...");
        localzzbf.zzcG();
      }
    }
  }

  public boolean zzgY()
  {
    synchronized (this.zzpV)
    {
      return this.zzJA;
    }
  }

  public String zzgZ()
  {
    synchronized (this.zzpV)
    {
      String str = this.zzLs.toString();
      this.zzLs = this.zzLs.add(BigInteger.ONE);
      return str;
    }
  }

  public void zza(zzig paramzzig)
  {
    synchronized (this.zzpV)
    {
      this.zzLt.add(paramzzig);
    }
  }

  public zzii zzha()
  {
    synchronized (this.zzpV)
    {
      return this.zzLr;
    }
  }

  public zzbv zzhb()
  {
    synchronized (this.zzpV)
    {
      return this.zzLx;
    }
  }

  public void zzb(HashSet<zzig> paramHashSet)
  {
    synchronized (this.zzpV)
    {
      this.zzLt.addAll(paramHashSet);
    }
  }

  public void zza(String paramString, zzik paramzzik)
  {
    synchronized (this.zzpV)
    {
      this.zzLu.put(paramString, paramzzik);
    }
  }

  public boolean zzhc()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzLv;
      this.zzLv = true;
      return bool;
    }
  }

  public Future zza(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (paramBoolean != this.zzJz)
      {
        this.zzJz = paramBoolean;
        return zzip.zza(paramContext, paramBoolean);
      }
      return null;
    }
  }

  public boolean zzhd()
  {
    synchronized (this.zzpV)
    {
      return (this.zzJz) || (this.zzLD);
    }
  }

  public String zzhe()
  {
    synchronized (this.zzpV)
    {
      return this.zzzN;
    }
  }

  public Future zzaA(String paramString)
  {
    synchronized (this.zzpV)
    {
      if ((paramString != null) && (!paramString.equals(this.zzLz)))
      {
        this.zzLz = paramString;
        return zzip.zzd(this.mContext, paramString);
      }
      return null;
    }
  }

  public String zzhf()
  {
    synchronized (this.zzpV)
    {
      return this.zzLz;
    }
  }

  public void zzb(Boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzLB = paramBoolean;
    }
  }

  public Boolean zzhg()
  {
    synchronized (this.zzpV)
    {
      return this.zzLB;
    }
  }

  @TargetApi(23)
  public void zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (this.zzpV)
    {
      if (!this.zzqA)
      {
        this.mContext = paramContext.getApplicationContext();
        this.zzpT = paramVersionInfoParcel;
        zzip.zza(paramContext, this);
        zzip.zzb(paramContext, this);
        zzip.zzc(paramContext, this);
        zzip.zzd(paramContext, this);
        zza(Thread.currentThread());
        this.zzzN = zzr.zzbC().zze(paramContext, paramVersionInfoParcel.afmaVersion);
        if ((zzne.zzsn()) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()))
          this.zzLD = true;
        this.zzpl = new zzax(paramContext.getApplicationContext(), this.zzpT, new zzeg(paramContext.getApplicationContext(), this.zzpT, (String)zzbt.zzvB.get()));
        zzhk();
        zzr.zzbM().zzz(this.mContext);
        this.zzqA = true;
      }
    }
  }

  public zzax zzhh()
  {
    return this.zzpl;
  }

  public Bundle zza(Context paramContext, zzij paramzzij, String paramString)
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putBundle("app", this.zzLr.zzc(paramContext, paramString));
      Bundle localBundle2 = new Bundle();
      Object localObject1 = this.zzLu.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localBundle2.putBundle((String)localObject2, ((zzik)this.zzLu.get(localObject2)).toBundle());
      }
      localBundle1.putBundle("slots", localBundle2);
      localObject1 = new ArrayList();
      Object localObject2 = this.zzLt.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        zzig localzzig = (zzig)((Iterator)localObject2).next();
        ((ArrayList)localObject1).add(localzzig.toBundle());
      }
      localBundle1.putParcelableArrayList("ads", (ArrayList)localObject1);
      paramzzij.zza(this.zzLt);
      this.zzLt.clear();
      return localBundle1;
    }
  }

  public String zzd(int paramInt, String paramString)
  {
    Resources localResources = this.zzpT.zzNb ? this.mContext.getResources() : zze.getRemoteResource(this.mContext);
    if (localResources == null)
      return paramString;
    return localResources.getString(paramInt);
  }

  public void zza(Thread paramThread)
  {
    zzha.zza(this.mContext, paramThread, this.zzpT);
  }

  public void zzb(Throwable paramThrowable, boolean paramBoolean)
  {
    zzha localzzha = new zzha(this.mContext, this.zzpT, null, null);
    localzzha.zza(paramThrowable, paramBoolean);
  }

  public boolean zzhi()
  {
    synchronized (this.zzpV)
    {
      if (this.zzLw < ((Integer)zzbt.zzwA.get()).intValue())
      {
        this.zzLw = ((Integer)zzbt.zzwA.get()).intValue();
        zzip.zza(this.mContext, this.zzLw);
        return true;
      }
      return false;
    }
  }

  public boolean zzhj()
  {
    synchronized (this.zzpV)
    {
      return this.zzLC;
    }
  }

  public void zzC(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzLC = paramBoolean;
    }
  }

  void zzhk()
  {
    zzbu localzzbu = new zzbu(this.mContext, this.zzpT.afmaVersion);
    try
    {
      this.zzLx = zzr.zzbH().zza(localzzbu);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      zzin.zzd("Cannot initialize CSI reporter.", localIllegalArgumentException);
    }
  }

  public zzih(zzir paramzzir)
  {
    this.zzLq = paramzzir.zzhs();
    this.zzLr = new zzii(this.zzLq);
  }

  public void zze(Bundle paramBundle)
  {
    synchronized (this.zzpV)
    {
      this.zzJz = (paramBundle.containsKey("use_https") ? paramBundle.getBoolean("use_https") : this.zzJz);
      this.zzLw = (paramBundle.containsKey("webview_cache_version") ? paramBundle.getInt("webview_cache_version") : this.zzLw);
      if (paramBundle.containsKey("content_url_opted_out"))
        zzB(paramBundle.getBoolean("content_url_opted_out"));
      if (paramBundle.containsKey("content_url_hashes"))
        this.zzLz = paramBundle.getString("content_url_hashes");
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzih
 * JD-Core Version:    0.6.0
 */