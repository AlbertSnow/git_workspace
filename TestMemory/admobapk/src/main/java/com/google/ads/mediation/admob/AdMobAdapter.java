package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.a;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class AdMobAdapter extends a
{
  protected final Bundle a(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1 != null);
    while (true)
    {
      paramBundle1.putInt("gw", 1);
      paramBundle1.putString("mad_hac", paramBundle2.getString("mad_hac"));
      if (!TextUtils.isEmpty(paramBundle2.getString("adJson")))
        paramBundle1.putString("_ad", paramBundle2.getString("adJson"));
      paramBundle1.putBoolean("_noRefresh", true);
      return paramBundle1;
      paramBundle1 = new Bundle();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapter
 * JD-Core Version:    0.6.0
 */