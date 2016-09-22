package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzam extends zzal
{
  private static AdvertisingIdClient zzok = null;
  private static CountDownLatch zzol = new CountDownLatch(1);
  private boolean zzom;

  public static zzam zza(String paramString, Context paramContext, boolean paramBoolean)
  {
    zzah localzzah = new zzah();
    zza(paramString, paramContext, localzzah);
    if (paramBoolean)
      synchronized (zzam.class)
      {
        if (zzok == null)
          new Thread(new zzb(paramContext)).start();
      }
    return new zzam(paramContext, localzzah, paramBoolean);
  }

  protected zzam(Context paramContext, zzap paramzzap, boolean paramBoolean)
  {
    super(paramContext, paramzzap);
    this.zzom = paramBoolean;
  }

  zza zzY()
    throws IOException
  {
    try
    {
      boolean bool = zzol.await(2L, TimeUnit.SECONDS);
      if (!bool)
        return new zza(null, false);
    }
    catch (InterruptedException localInterruptedException)
    {
      return new zza(null, false);
    }
    AdvertisingIdClient.Info localInfo;
    synchronized (zzam.class)
    {
      if (zzok == null)
        return new zza(null, false);
      localInfo = zzok.getInfo();
    }
    ??? = zzk(localInfo.getId());
    return (zza)new zza((String)???, localInfo.isLimitAdTrackingEnabled());
  }

  protected NanoAfmaSignals.AFMASignals zzc(Context paramContext)
  {
    NanoAfmaSignals.AFMASignals localAFMASignals = super.zzc(paramContext);
    zza(paramContext, localAFMASignals);
    return localAFMASignals;
  }

  private void zza(Context paramContext, NanoAfmaSignals.AFMASignals paramAFMASignals)
  {
    if (!this.zzom)
      return;
    try
    {
      if (zzS())
      {
        zza localzza = zzY();
        String str = localzza.getId();
        if (str != null)
        {
          paramAFMASignals.didOptOut = Boolean.valueOf(localzza.isLimitAdTrackingEnabled());
          paramAFMASignals.didSignalType = Integer.valueOf(5);
          paramAFMASignals.didSignal = str;
          zza(28, zzob);
        }
      }
      else
      {
        paramAFMASignals.didSignal = zzf(paramContext);
        zza(24, zzob);
      }
    }
    catch (IOException localIOException)
    {
      return;
    }
    catch (zzal.zza localzza1)
    {
      return;
    }
  }

  private static final class zzb
    implements Runnable
  {
    private Context zzoq;

    public zzb(Context paramContext)
    {
      this.zzoq = paramContext.getApplicationContext();
      if (this.zzoq == null)
        this.zzoq = paramContext;
    }

    public void run()
    {
      synchronized (zzam.class)
      {
        try
        {
          if (zzam.zzZ() == null)
          {
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(this.zzoq);
            localAdvertisingIdClient.start();
            zzam.zza(localAdvertisingIdClient);
          }
        }
        catch (IOException localIOException)
        {
          zzam.zza(null);
        }
        finally
        {
          zzam.zzaa().countDown();
        }
      }
    }
  }

  class zza
  {
    private String zzon;
    private boolean zzoo;

    public zza(String paramBoolean, boolean arg3)
    {
      this.zzon = paramBoolean;
      boolean bool;
      this.zzoo = bool;
    }

    public String getId()
    {
      return this.zzon;
    }

    public boolean isLimitAdTrackingEnabled()
    {
      return this.zzoo;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzam
 * JD-Core Version:    0.6.0
 */