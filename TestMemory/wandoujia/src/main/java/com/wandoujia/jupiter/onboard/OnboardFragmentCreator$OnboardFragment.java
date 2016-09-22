package com.wandoujia.jupiter.onboard;

import android.support.v4.app.Fragment;

 enum OnboardFragmentCreator$OnboardFragment
{
  private Class<? extends Fragment> fragment;
  private String name;
  private String url;

  static
  {
    ESSENTIAL_APPS = new OnboardFragment("ESSENTIAL_APPS", 1, "wdj://welcome/apps", EssentialAppFragment.class, "http://apis.wandoujia.com/five/v1/nux/essentials/apps?max=50");
    ESSENTIAL_GAMES = new OnboardFragment("ESSENTIAL_GAMES", 2, "wdj://welcome/games", EssentialGameFragment.class, "http://apis.wandoujia.com/five/v1/nux/essentials/games?max=50");
    OnboardFragment[] arrayOfOnboardFragment = new OnboardFragment[3];
    arrayOfOnboardFragment[0] = SPLASH;
    arrayOfOnboardFragment[1] = ESSENTIAL_APPS;
    arrayOfOnboardFragment[2] = ESSENTIAL_GAMES;
    $VALUES = arrayOfOnboardFragment;
  }

  private OnboardFragmentCreator$OnboardFragment(String paramString1, Class<? extends Fragment> paramClass, String paramString2)
  {
    this.name = paramString1;
    this.fragment = paramClass;
    this.url = paramString2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.OnboardFragmentCreator.OnboardFragment
 * JD-Core Version:    0.6.0
 */