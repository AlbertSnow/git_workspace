package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzka;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

@zzhb
public abstract class AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzka
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  protected AdView zzaQ;
  protected InterstitialAd zzaR;
  private AdLoader zzaS;
  private Context zzaT;
  private InterstitialAd zzaU;
  private MediationRewardedVideoAdListener zzaV;
  private String zzaW;
  final RewardedVideoAdListener zzaX = new RewardedVideoAdListener()
  {
    public void onRewardedVideoAdLoaded()
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onAdLoaded(AbstractAdViewAdapter.this);
    }

    public void onRewardedVideoAdOpened()
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onAdOpened(AbstractAdViewAdapter.this);
    }

    public void onRewardedVideoStarted()
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onVideoStarted(AbstractAdViewAdapter.this);
    }

    public void onRewardedVideoAdClosed()
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onAdClosed(AbstractAdViewAdapter.this);
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this, null);
    }

    public void onRewarded(RewardItem reward)
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onRewarded(AbstractAdViewAdapter.this, reward);
    }

    public void onRewardedVideoAdLeftApplication()
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onAdLeftApplication(AbstractAdViewAdapter.this);
    }

    public void onRewardedVideoAdFailedToLoad(int errorCode)
    {
      AbstractAdViewAdapter.zza(AbstractAdViewAdapter.this).onAdFailedToLoad(AbstractAdViewAdapter.this, errorCode);
    }
  };

  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);

  AdRequest zza(Context paramContext, MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    Date localDate = paramMediationAdRequest.getBirthday();
    if (localDate != null)
      localBuilder.setBirthday(localDate);
    int i = paramMediationAdRequest.getGender();
    if (i != 0)
      localBuilder.setGender(i);
    Set localSet = paramMediationAdRequest.getKeywords();
    if (localSet != null)
    {
      localObject1 = localSet.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localBuilder.addKeyword((String)localObject2);
      }
    }
    Object localObject1 = paramMediationAdRequest.getLocation();
    if (localObject1 != null)
      localBuilder.setLocation((Location)localObject1);
    if (paramMediationAdRequest.isTesting())
      localBuilder.addTestDevice(zzn.zzcS().zzT(paramContext));
    if (paramMediationAdRequest.taggedForChildDirectedTreatment() != -1)
      localBuilder.tagForChildDirectedTreatment(paramMediationAdRequest.taggedForChildDirectedTreatment() == 1);
    localBuilder.setIsDesignedForFamilies(paramMediationAdRequest.isDesignedForFamilies());
    Object localObject2 = zza(paramBundle1, paramBundle2);
    localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, (Bundle)localObject2);
    return (AdRequest)(AdRequest)localBuilder.build();
  }

  public void onDestroy()
  {
    if (this.zzaQ != null)
    {
      this.zzaQ.destroy();
      this.zzaQ = null;
    }
    if (this.zzaR != null)
      this.zzaR = null;
    if (this.zzaS != null)
      this.zzaS = null;
    if (this.zzaU != null)
      this.zzaU = null;
  }

  public void onPause()
  {
    if (this.zzaQ != null)
      this.zzaQ.pause();
  }

  public void onResume()
  {
    if (this.zzaQ != null)
      this.zzaQ.resume();
  }

  public String getAdUnitId(Bundle serverParameters)
  {
    return serverParameters.getString("pubid");
  }

  public void requestBannerAd(Context context, MediationBannerListener bannerListener, Bundle serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle extras)
  {
    this.zzaQ = new AdView(context);
    this.zzaQ.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
    this.zzaQ.setAdUnitId(getAdUnitId(serverParameters));
    this.zzaQ.setAdListener(new zzc(this, bannerListener));
    this.zzaQ.loadAd(zza(context, mediationAdRequest, extras, serverParameters));
  }

  public View getBannerView()
  {
    return this.zzaQ;
  }

  public void requestInterstitialAd(Context context, MediationInterstitialListener interstitialListener, Bundle serverParameters, MediationAdRequest mediationAdRequest, Bundle extras)
  {
    this.zzaR = new InterstitialAd(context);
    this.zzaR.setAdUnitId(getAdUnitId(serverParameters));
    this.zzaR.setAdListener(new zzd(this, interstitialListener));
    this.zzaR.loadAd(zza(context, mediationAdRequest, extras, serverParameters));
  }

  public void showInterstitial()
  {
    this.zzaR.show();
  }

  public Bundle getInterstitialAdapterInfo()
  {
    return new MediationAdapter.zza().zzS(1).zziw();
  }

  public void requestNativeAd(Context context, MediationNativeListener listener, Bundle serverParameters, NativeMediationAdRequest mediationAdRequest, Bundle extras)
  {
    zze localzze = new zze(this, listener);
    AdLoader.Builder localBuilder = zza(context, serverParameters.getString("pubid")).withAdListener(localzze);
    NativeAdOptions localNativeAdOptions = mediationAdRequest.getNativeAdOptions();
    if (localNativeAdOptions != null)
      localBuilder.withNativeAdOptions(localNativeAdOptions);
    if (mediationAdRequest.isAppInstallAdRequested())
      localBuilder.forAppInstallAd(localzze);
    if (mediationAdRequest.isContentAdRequested())
      localBuilder.forContentAd(localzze);
    this.zzaS = localBuilder.build();
    this.zzaS.loadAd(zza(context, mediationAdRequest, extras, serverParameters));
  }

  AdLoader.Builder zza(Context paramContext, String paramString)
  {
    return new AdLoader.Builder(paramContext, paramString);
  }

  public void initialize(Context context, MediationAdRequest mediationAdRequest, String userId, MediationRewardedVideoAdListener listener, Bundle serverParameters, Bundle networkExtras)
  {
    this.zzaT = context.getApplicationContext();
    this.zzaW = userId;
    this.zzaV = listener;
    this.zzaV.onInitializationSucceeded(this);
  }

  public void loadAd(MediationAdRequest mediationAdRequest, Bundle serverParameters, Bundle networkExtras)
  {
    if ((this.zzaT == null) || (this.zzaV == null))
    {
      zzin.e("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    this.zzaU = new InterstitialAd(this.zzaT);
    this.zzaU.zza(true);
    this.zzaU.setAdUnitId(getAdUnitId(serverParameters));
    this.zzaU.setRewardedVideoAdListener(this.zzaX);
    this.zzaU.zzm(this.zzaW);
    this.zzaU.loadAd(zza(this.zzaT, mediationAdRequest, networkExtras, serverParameters));
  }

  public void showVideo()
  {
    this.zzaU.show();
  }

  public boolean isInitialized()
  {
    return this.zzaV != null;
  }

  static class zzb extends NativeContentAdMapper
  {
    private final NativeContentAd zzba;

    public zzb(NativeContentAd paramNativeContentAd)
    {
      this.zzba = paramNativeContentAd;
      setHeadline(paramNativeContentAd.getHeadline().toString());
      setImages(paramNativeContentAd.getImages());
      setBody(paramNativeContentAd.getBody().toString());
      setLogo(paramNativeContentAd.getLogo());
      setCallToAction(paramNativeContentAd.getCallToAction().toString());
      setAdvertiser(paramNativeContentAd.getAdvertiser().toString());
      setOverrideImpressionRecording(true);
      setOverrideClickHandling(true);
    }

    public void trackView(View view)
    {
      if ((view instanceof NativeAdView))
        ((NativeAdView)view).setNativeAd(this.zzba);
    }
  }

  static class zza extends NativeAppInstallAdMapper
  {
    private final NativeAppInstallAd zzaZ;

    public zza(NativeAppInstallAd paramNativeAppInstallAd)
    {
      this.zzaZ = paramNativeAppInstallAd;
      setHeadline(paramNativeAppInstallAd.getHeadline().toString());
      setImages(paramNativeAppInstallAd.getImages());
      setBody(paramNativeAppInstallAd.getBody().toString());
      setIcon(paramNativeAppInstallAd.getIcon());
      setCallToAction(paramNativeAppInstallAd.getCallToAction().toString());
      setStarRating(paramNativeAppInstallAd.getStarRating().doubleValue());
      setStore(paramNativeAppInstallAd.getStore().toString());
      setPrice(paramNativeAppInstallAd.getPrice().toString());
      setOverrideImpressionRecording(true);
      setOverrideClickHandling(true);
    }

    public void trackView(View view)
    {
      if ((view instanceof NativeAdView))
        ((NativeAdView)view).setNativeAd(this.zzaZ);
    }
  }

  static final class zze extends AdListener
    implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, com.google.android.gms.ads.internal.client.zza
  {
    final AbstractAdViewAdapter zzbb;
    final MediationNativeListener zzbe;

    public zze(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationNativeListener paramMediationNativeListener)
    {
      this.zzbb = paramAbstractAdViewAdapter;
      this.zzbe = paramMediationNativeListener;
    }

    public void onAdLoaded()
    {
    }

    public void onAdFailedToLoad(int errorCode)
    {
      this.zzbe.onAdFailedToLoad(this.zzbb, errorCode);
    }

    public void onAdOpened()
    {
      this.zzbe.onAdOpened(this.zzbb);
    }

    public void onAdClosed()
    {
      this.zzbe.onAdClosed(this.zzbb);
    }

    public void onAdLeftApplication()
    {
      this.zzbe.onAdLeftApplication(this.zzbb);
    }

    public void onAdClicked()
    {
      this.zzbe.onAdClicked(this.zzbb);
    }

    public void onAppInstallAdLoaded(NativeAppInstallAd ad)
    {
      this.zzbe.onAdLoaded(this.zzbb, new AbstractAdViewAdapter.zza(ad));
    }

    public void onContentAdLoaded(NativeContentAd ad)
    {
      this.zzbe.onAdLoaded(this.zzbb, new AbstractAdViewAdapter.zzb(ad));
    }
  }

  static final class zzd extends AdListener
    implements com.google.android.gms.ads.internal.client.zza
  {
    final AbstractAdViewAdapter zzbb;
    final MediationInterstitialListener zzbd;

    public zzd(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationInterstitialListener paramMediationInterstitialListener)
    {
      this.zzbb = paramAbstractAdViewAdapter;
      this.zzbd = paramMediationInterstitialListener;
    }

    public void onAdLoaded()
    {
      this.zzbd.onAdLoaded(this.zzbb);
    }

    public void onAdFailedToLoad(int errorCode)
    {
      this.zzbd.onAdFailedToLoad(this.zzbb, errorCode);
    }

    public void onAdOpened()
    {
      this.zzbd.onAdOpened(this.zzbb);
    }

    public void onAdClosed()
    {
      this.zzbd.onAdClosed(this.zzbb);
    }

    public void onAdLeftApplication()
    {
      this.zzbd.onAdLeftApplication(this.zzbb);
    }

    public void onAdClicked()
    {
      this.zzbd.onAdClicked(this.zzbb);
    }
  }

  static final class zzc extends AdListener
    implements com.google.android.gms.ads.internal.client.zza
  {
    final AbstractAdViewAdapter zzbb;
    final MediationBannerListener zzbc;

    public zzc(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.zzbb = paramAbstractAdViewAdapter;
      this.zzbc = paramMediationBannerListener;
    }

    public void onAdLoaded()
    {
      this.zzbc.onAdLoaded(this.zzbb);
    }

    public void onAdFailedToLoad(int errorCode)
    {
      this.zzbc.onAdFailedToLoad(this.zzbb, errorCode);
    }

    public void onAdOpened()
    {
      this.zzbc.onAdOpened(this.zzbb);
    }

    public void onAdClosed()
    {
      this.zzbc.onAdClosed(this.zzbb);
    }

    public void onAdLeftApplication()
    {
      this.zzbc.onAdLeftApplication(this.zzbb);
    }

    public void onAdClicked()
    {
      this.zzbc.onAdClicked(this.zzbb);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.AbstractAdViewAdapter
 * JD-Core Version:    0.6.0
 */