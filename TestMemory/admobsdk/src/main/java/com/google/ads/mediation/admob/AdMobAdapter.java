package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class AdMobAdapter extends AbstractAdViewAdapter
{
  protected Bundle zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    Bundle localBundle = paramBundle1 != null ? paramBundle1 : new Bundle();
    localBundle.putInt("gw", 1);
    localBundle.putString("mad_hac", paramBundle2.getString("mad_hac"));
    if (!TextUtils.isEmpty(paramBundle2.getString("adJson")))
      localBundle.putString("_ad", paramBundle2.getString("adJson"));
    localBundle.putBoolean("_noRefresh", true);
    return localBundle;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapter
 * JD-Core Version:    0.6.0
 */