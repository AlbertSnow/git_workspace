package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class AdUrlAdapter extends AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  protected Bundle zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    Bundle localBundle = paramBundle1 != null ? paramBundle1 : new Bundle();
    localBundle.putBundle("sdk_less_server_data", paramBundle2);
    localBundle.putBoolean("_noRefresh", true);
    return localBundle;
  }

  public String getAdUnitId(Bundle serverParameters)
  {
    return "adurl";
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.AdUrlAdapter
 * JD-Core Version:    0.6.0
 */