package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.reward.client.zzg;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzac
{
  private final zzew zzuJ = new zzew();
  private final Context mContext;
  private final zzh zzoB;
  private AdListener zztA;
  private zza zztz;
  private zzu zzuL;
  private String zzpS;
  private String zzuM;
  private AppEventListener zzun;
  private PlayStorePurchaseListener zzuP;
  private InAppPurchaseListener zzuO;
  private PublisherInterstitialAd zzuT;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private Correlator zzuR;
  private RewardedVideoAdListener zzaX;
  private String zzaW;
  private boolean zzuU;

  public zzac(Context paramContext)
  {
    this(paramContext, zzh.zzcO(), null);
  }

  public zzac(Context paramContext, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this(paramContext, zzh.zzcO(), paramPublisherInterstitialAd);
  }

  public zzac(Context paramContext, zzh paramzzh, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this.mContext = paramContext;
    this.zzoB = paramzzh;
    this.zzuT = paramPublisherInterstitialAd;
  }

  public AdListener getAdListener()
  {
    return this.zztA;
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

  public boolean isLoaded()
  {
    try
    {
      if (this.zzuL == null)
        return false;
      return this.zzuL.isReady();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }

  public boolean isLoading()
  {
    try
    {
      if (this.zzuL == null)
        return false;
      return this.zzuL.isLoading();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }

  public void zza(zzaa paramzzaa)
  {
    try
    {
      if (this.zzuL == null)
        zzH("loadAd");
      if (this.zzuL.zzb(this.zzoB.zza(this.mContext, paramzzaa)))
        this.zzuJ.zzg(paramzzaa.zzdb());
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to load ad.", localRemoteException);
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

  public void setAdUnitId(String adUnitId)
  {
    if (this.zzpS != null)
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
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
    try
    {
      this.zzuQ = onCustomRenderedAdLoadedListener;
      if (this.zzuL != null)
        this.zzuL.zza(onCustomRenderedAdLoadedListener != null ? new zzcg(onCustomRenderedAdLoadedListener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", localRemoteException);
    }
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey)
  {
    if (this.zzuO != null)
      throw new IllegalStateException("In app purchase parameter has already been set.");
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

  public void setRewardedVideoAdListener(RewardedVideoAdListener listener)
  {
    try
    {
      this.zzaX = listener;
      if (this.zzuL != null)
        this.zzuL.zza(listener != null ? new zzg(listener) : null);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", localRemoteException);
    }
  }

  public void setUserId(String userId)
  {
    try
    {
      this.zzaW = userId;
      if (this.zzuL != null)
        this.zzuL.setUserId(userId);
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", localRemoteException);
    }
  }

  public void zza(boolean paramBoolean)
  {
    this.zzuU = paramBoolean;
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

  public void show()
  {
    try
    {
      zzI("show");
      this.zzuL.showInterstitial();
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to show interstitial.", localRemoteException);
    }
  }

  private void zzH(String paramString)
    throws RemoteException
  {
    if (this.zzpS == null)
      zzI(paramString);
    AdSizeParcel localAdSizeParcel = this.zzuU ? AdSizeParcel.zzcP() : new AdSizeParcel();
    this.zzuL = zzn.zzcT().zzb(this.mContext, localAdSizeParcel, this.zzpS, this.zzuJ);
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
    if (this.zzaX != null)
      this.zzuL.zza(new zzg(this.zzaX));
    if (this.zzaW != null)
      this.zzuL.setUserId(this.zzaW);
  }

  private void zzI(String paramString)
  {
    if (this.zzuL == null)
      throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzac
 * JD-Core Version:    0.6.0
 */