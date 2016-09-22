package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhd;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzji.zza;
import com.google.android.gms.internal.zzji.zzc;

@zzhb
public abstract class zzd
  implements zzc.zza, zzit<Void>
{
  private final zzji<AdRequestInfoParcel> zzHl;
  private final zzc.zza zzHm;
  private final Object zzpV = new Object();

  public zzd(zzji<AdRequestInfoParcel> paramzzji, zzc.zza paramzza)
  {
    this.zzHl = paramzzji;
    this.zzHm = paramzza;
  }

  public abstract void zzgr();

  public abstract zzj zzgs();

  public void zzb(AdResponseParcel paramAdResponseParcel)
  {
    synchronized (this.zzpV)
    {
      this.zzHm.zzb(paramAdResponseParcel);
      zzgr();
    }
  }

  public Void zzga()
  {
    zzj localzzj = zzgs();
    if (localzzj == null)
    {
      this.zzHm.zzb(new AdResponseParcel(0));
      zzgr();
      return null;
    }
    this.zzHl.zza(new zzji.zzc(localzzj)
    {
      public void zzc(AdRequestInfoParcel paramAdRequestInfoParcel)
      {
        if (!zzd.this.zza(this.zzHn, paramAdRequestInfoParcel))
          zzd.this.zzgr();
      }
    }
    , new zzji.zza()
    {
      public void run()
      {
        zzd.this.zzgr();
      }
    });
    return null;
  }

  public void cancel()
  {
    zzgr();
  }

  boolean zza(zzj paramzzj, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    try
    {
      paramzzj.zza(paramAdRequestInfoParcel, new zzg(this));
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not fetch ad response from ad request service.", localRemoteException);
      zzr.zzbF().zzb(localRemoteException, true);
    }
    catch (NullPointerException localNullPointerException)
    {
      zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", localNullPointerException);
      zzr.zzbF().zzb(localNullPointerException, true);
    }
    catch (SecurityException localSecurityException)
    {
      zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", localSecurityException);
      zzr.zzbF().zzb(localSecurityException, true);
    }
    catch (Throwable localThrowable)
    {
      zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", localThrowable);
      zzr.zzbF().zzb(localThrowable, true);
    }
    this.zzHm.zzb(new AdResponseParcel(0));
    return false;
  }

  @zzhb
  public static class zzb extends zzd
    implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
  {
    private Context mContext;
    private VersionInfoParcel zzpT;
    private zzji<AdRequestInfoParcel> zzHl;
    private final zzc.zza zzHm;
    private final Object zzpV = new Object();
    protected zze zzHp;
    private boolean zzHq;

    public zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji<AdRequestInfoParcel> paramzzji, zzc.zza paramzza)
    {
      super(paramzza);
      this.mContext = paramContext;
      this.zzpT = paramVersionInfoParcel;
      this.zzHl = paramzzji;
      this.zzHm = paramzza;
      Looper localLooper;
      if (((Boolean)zzbt.zzwa.get()).booleanValue())
      {
        this.zzHq = true;
        localLooper = zzr.zzbO().zzhC();
      }
      else
      {
        localLooper = paramContext.getMainLooper();
      }
      this.zzHp = new zze(paramContext, localLooper, this, this, this.zzpT.zzNa);
      connect();
    }

    protected void connect()
    {
      this.zzHp.zzqG();
    }

    public zzj zzgs()
    {
      synchronized (this.zzpV)
      {
        try
        {
          return this.zzHp.zzgw();
        }
        catch (DeadObjectException localDeadObjectException)
        {
          return null;
        }
      }
    }

    public void zzgr()
    {
      synchronized (this.zzpV)
      {
        if ((this.zzHp.isConnected()) || (this.zzHp.isConnecting()))
          this.zzHp.disconnect();
        Binder.flushPendingCommands();
        if (this.zzHq)
        {
          zzr.zzbO().zzhD();
          this.zzHq = false;
        }
      }
    }

    zzit zzgt()
    {
      return new zzd.zza(this.mContext, this.zzHl, this.zzHm);
    }

    public void onConnectionFailed(@NonNull ConnectionResult result)
    {
      zzin.zzaI("Cannot connect to remote service, fallback to local instance.");
      zzit localzzit = zzgt();
      localzzit.zzgd();
      Bundle localBundle = new Bundle();
      localBundle.putString("action", "gms_connection_failed_fallback_to_local");
      zzr.zzbC().zzb(this.mContext, this.zzpT.afmaVersion, "gmob-apps", localBundle, true);
    }

    public void onConnected(Bundle connectionHint)
    {
      zzga();
    }

    public void onConnectionSuspended(int cause)
    {
      zzin.zzaI("Disconnected from remote ad request service.");
    }
  }

  @zzhb
  public static final class zza extends zzd
  {
    private final Context mContext;

    public zza(Context paramContext, zzji<AdRequestInfoParcel> paramzzji, zzc.zza paramzza)
    {
      super(paramzza);
      this.mContext = paramContext;
    }

    public zzj zzgs()
    {
      zzbm localzzbm = new zzbm((String)zzbt.zzvB.get());
      return zzhd.zza(this.mContext, localzzbm, zzhc.zzgA());
    }

    public void zzgr()
    {
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzd
 * JD-Core Version:    0.6.0
 */