package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;
import com.google.android.gms.internal.zzhb;
import java.util.concurrent.atomic.AtomicBoolean;

@zzhb
public class zzab
{
  private final zzew zzuJ = new zzew();
  private final zzh zzoB;
  private final AtomicBoolean zzuK;
  private AdListener zztA;
  private zza zztz;
  private zzu zzuL;
  private AdSize[] zzuo;
  private String zzpS;
  private String zzuM;
  private ViewGroup zzuN;
  private AppEventListener zzun;
  private InAppPurchaseListener zzuO;
  private PlayStorePurchaseListener zzuP;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private boolean zzpE;
  private Correlator zzuR;
  private boolean zzuS;

  public zzab(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, zzh.zzcO(), false);
  }

  public zzab(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this(paramViewGroup, null, false, zzh.zzcO(), paramBoolean);
  }

  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, zzh.zzcO(), false);
  }

  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, zzh.zzcO(), paramBoolean2);
  }

  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, zzu paramzzu, boolean paramBoolean2)
  {
    this.zzuN = paramViewGroup;
    this.zzoB = paramzzh;
    this.zzuL = paramzzu;
    this.zzuK = new AtomicBoolean(false);
    this.zzuS = paramBoolean2;
    if (paramAttributeSet != null)
    {
      Context localContext = paramViewGroup.getContext();
      try
      {
        zzk localzzk = new zzk(localContext, paramAttributeSet);
        this.zzuo = localzzk.zzj(paramBoolean1);
        this.zzpS = localzzk.getAdUnitId();
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        zzn.zzcS().zza(paramViewGroup, new AdSizeParcel(localContext, AdSize.BANNER), localIllegalArgumentException.getMessage(), localIllegalArgumentException.getMessage());
        return;
      }
      if (paramViewGroup.isInEditMode())
        zzn.zzcS().zza(paramViewGroup, zza(localContext, this.zzuo[0], this.zzuS), "Ads by Google");
    }
  }

  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, paramzzh, null, paramBoolean2);
  }

  public void destroy()
  {
    try
    {
      if (this.zzuL != null)
        this.zzuL.destroy();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to destroy AdView.", localRemoteException);
    }
  }

  public AdListener getAdListener()
  {
    return this.zztA;
  }

  public AdSize getAdSize()
  {
    try
    {
      if (this.zzuL != null)
      {
        AdSizeParcel localAdSizeParcel = this.zzuL.zzaN();
        if (localAdSizeParcel != null)
          return localAdSizeParcel.zzcQ();
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get the current AdSize.", localRemoteException);
    }
    return this.zzuo != null ? this.zzuo[0] : null;
  }

  public AdSize[] getAdSizes()
  {
    return this.zzuo;
  }

  public String getAdUnitId()
  {
    return this.zzpS;
  }

  public AppEventListener getAppEventListener()
  {
    return this.zzun;
  }

  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzuO;
  }

  public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.zzuQ;
  }

  public void zza(zzaa paramzzaa)
  {
    try
    {
      if (this.zzuL == null)
        zzdg();
      if (this.zzuL.zzb(this.zzoB.zza(this.zzuN.getContext(), paramzzaa)))
        this.zzuJ.zzg(paramzzaa.zzdb());
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to load ad.", localRemoteException);
    }
  }

  public void pause()
  {
    try
    {
      if (this.zzuL != null)
        this.zzuL.pause();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call pause.", localRemoteException);
    }
  }

  public void recordManualImpression()
  {
    if (this.zzuK.getAndSet(true))
      return;
    try
    {
      if (this.zzuL != null)
        this.zzuL.zzaP();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to record impression.", localRemoteException);
    }
  }

  public void resume()
  {
    try
    {
      if (this.zzuL != null)
        this.zzuL.resume();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call resume.", localRemoteException);
    }
  }

  public void setAdListener(AdListener adListener)
  {
    try
    {
      this.zztA = adListener;
      if (this.zzuL != null)
        this.zzuL.zza(adListener != null ? new zzc(adListener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", localRemoteException);
    }
  }

  public void zza(zza paramzza)
  {
    try
    {
      this.zztz = paramzza;
      if (this.zzuL != null)
        this.zzuL.zza(paramzza != null ? new zzb(paramzza) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdClickListener.", localRemoteException);
    }
  }

  public void setAdSizes(AdSize[] adSizes)
  {
    if (this.zzuo != null)
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    zza(adSizes);
  }

  public void zza(AdSize[] paramArrayOfAdSize)
  {
    this.zzuo = paramArrayOfAdSize;
    try
    {
      if (this.zzuL != null)
        this.zzuL.zza(zza(this.zzuN.getContext(), this.zzuo, this.zzuS));
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the ad size.", localRemoteException);
    }
    this.zzuN.requestLayout();
  }

  public void setAdUnitId(String adUnitId)
  {
    if (this.zzpS != null)
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    this.zzpS = adUnitId;
  }

  public void setAppEventListener(AppEventListener appEventListener)
  {
    try
    {
      this.zzun = appEventListener;
      if (this.zzuL != null)
        this.zzuL.zza(appEventListener != null ? new zzj(appEventListener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AppEventListener.", localRemoteException);
    }
  }

  public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener)
  {
    if (this.zzuP != null)
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    try
    {
      this.zzuO = inAppPurchaseListener;
      if (this.zzuL != null)
        this.zzuL.zza(inAppPurchaseListener != null ? new zzgi(inAppPurchaseListener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the InAppPurchaseListener.", localRemoteException);
    }
  }

  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener)
  {
    this.zzuQ = onCustomRenderedAdLoadedListener;
    try
    {
      if (this.zzuL != null)
        this.zzuL.zza(onCustomRenderedAdLoadedListener != null ? new zzcg(onCustomRenderedAdLoadedListener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", localRemoteException);
    }
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey)
  {
    if (this.zzuO != null)
      throw new IllegalStateException("InAppPurchaseListener has already been set.");
    try
    {
      this.zzuP = playStorePurchaseListener;
      this.zzuM = publicKey;
      if (this.zzuL != null)
        this.zzuL.zza(playStorePurchaseListener != null ? new zzgm(playStorePurchaseListener) : null, publicKey);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the play store purchase parameter.", localRemoteException);
    }
  }

  public void setManualImpressionsEnabled(boolean manualImpressionsEnabled)
  {
    this.zzpE = manualImpressionsEnabled;
    try
    {
      if (this.zzuL != null)
        this.zzuL.setManualImpressionsEnabled(this.zzpE);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set manual impressions.", localRemoteException);
    }
  }

  public void setCorrelator(Correlator correlator)
  {
    this.zzuR = correlator;
    try
    {
      if (this.zzuL != null)
        this.zzuL.zza(this.zzuR == null ? null : this.zzuR.zzaF());
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set correlator.", localRemoteException);
    }
  }

  public String getMediationAdapterClassName()
  {
    try
    {
      if (this.zzuL != null)
        return this.zzuL.getMediationAdapterClassName();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }

  public boolean isLoading()
  {
    try
    {
      if (this.zzuL != null)
        return this.zzuL.isLoading();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }

  private void zzdf()
  {
    try
    {
      zzd localzzd = this.zzuL.zzaM();
      if (localzzd == null)
        return;
      this.zzuN.addView((View)com.google.android.gms.dynamic.zze.zzp(localzzd));
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get an ad frame.", localRemoteException);
    }
  }

  void zzdg()
    throws RemoteException
  {
    if (((this.zzuo == null) || (this.zzpS == null)) && (this.zzuL == null))
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    this.zzuL = zzdh();
    if (this.zztA != null)
      this.zzuL.zza(new zzc(this.zztA));
    if (this.zztz != null)
      this.zzuL.zza(new zzb(this.zztz));
    if (this.zzun != null)
      this.zzuL.zza(new zzj(this.zzun));
    if (this.zzuO != null)
      this.zzuL.zza(new zzgi(this.zzuO));
    if (this.zzuP != null)
      this.zzuL.zza(new zzgm(this.zzuP), this.zzuM);
    if (this.zzuQ != null)
      this.zzuL.zza(new zzcg(this.zzuQ));
    if (this.zzuR != null)
      this.zzuL.zza(this.zzuR.zzaF());
    this.zzuL.setManualImpressionsEnabled(this.zzpE);
    zzdf();
  }

  protected zzu zzdh()
    throws RemoteException
  {
    Context localContext = this.zzuN.getContext();
    return zzn.zzcT().zza(localContext, zza(localContext, this.zzuo, this.zzuS), this.zzpS, this.zzuJ);
  }

  private static AdSizeParcel zza(Context paramContext, AdSize[] paramArrayOfAdSize, boolean paramBoolean)
  {
    AdSizeParcel localAdSizeParcel = new AdSizeParcel(paramContext, paramArrayOfAdSize);
    localAdSizeParcel.zzi(paramBoolean);
    return localAdSizeParcel;
  }

  private static AdSizeParcel zza(Context paramContext, AdSize paramAdSize, boolean paramBoolean)
  {
    AdSizeParcel localAdSizeParcel = new AdSizeParcel(paramContext, paramAdSize);
    localAdSizeParcel.zzi(paramBoolean);
    return localAdSizeParcel;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzab
 * JD-Core Version:    0.6.0
 */