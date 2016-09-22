package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzhb
public final class zzew extends zzex.zza
{
  private Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> zzCG;

  public zzey zzaf(String paramString)
    throws RemoteException
  {
    return zzah(paramString);
  }

  public boolean zzag(String paramString)
    throws RemoteException
  {
    try
    {
      Class localClass = Class.forName(paramString, false, zzew.class.getClassLoader());
      return CustomEvent.class.isAssignableFrom(localClass);
    }
    catch (Throwable localThrowable)
    {
      zzb.zzaK("Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }

  public void zzg(Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> paramMap)
  {
    this.zzCG = paramMap;
  }

  private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> zzey zzah(String paramString)
    throws RemoteException
  {
    try
    {
      Class localClass = Class.forName(paramString, false, zzew.class.getClassLoader());
      Object localObject;
      if (com.google.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass))
      {
        localObject = (com.google.ads.mediation.MediationAdapter)localClass.newInstance();
        com.google.ads.mediation.NetworkExtras localNetworkExtras = (com.google.ads.mediation.NetworkExtras)this.zzCG.get(((com.google.ads.mediation.MediationAdapter)localObject).getAdditionalParametersType());
        return new zzfj((com.google.ads.mediation.MediationAdapter)localObject, localNetworkExtras);
      }
      if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass))
      {
        localObject = (com.google.android.gms.ads.mediation.MediationAdapter)localClass.newInstance();
        return new zzfe((com.google.android.gms.ads.mediation.MediationAdapter)localObject);
      }
      zzb.zzaK("Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable)
    {
    }
    return (zzey)zzai(paramString);
  }

  private zzey zzai(String paramString)
    throws RemoteException
  {
    try
    {
      zzb.zzaI("Reflection failed, retrying using direct instantiation");
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
        return new zzfe(new AdMobAdapter());
      if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        return new zzfe(new AdUrlAdapter());
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
        return new zzfe(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
      if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
      {
        com.google.ads.mediation.customevent.CustomEventAdapter localCustomEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
        CustomEventExtras localCustomEventExtras = (CustomEventExtras)this.zzCG.get(localCustomEventAdapter.getAdditionalParametersType());
        return new zzfj(localCustomEventAdapter, localCustomEventExtras);
      }
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzew
 * JD-Core Version:    0.6.0
 */