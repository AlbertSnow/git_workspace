package com.wandoujia.jupiter.fragment;

import android.util.Pair;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.ripple_framework.i;
import java.util.Map;

final class r extends LocalAppChangedListener
{
  r(DetailFragment paramDetailFragment)
  {
  }

  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    super.a(paramLocalAppInfo1, paramLocalAppInfo2, paramBoolean);
    if ((DetailFragment.f(this.a) != null) && (!((AppManager)i.k().a("app")).g(DetailFragment.d(this.a))))
      z.a((z)DetailFragment.g(this.a));
  }

  public final void a(Map<String, Pair<LocalAppInfo, LocalAppInfo>> paramMap)
  {
    super.a(paramMap);
    if ((DetailFragment.c(this.a) != null) && (paramMap.containsKey(DetailFragment.d(this.a))) && (((LocalAppInfo)((Pair)paramMap.get(DetailFragment.d(this.a))).first).isUpgradable()) && (!((LocalAppInfo)((Pair)paramMap.get(DetailFragment.d(this.a))).first).isUpgradeIgnored()) && (((LocalAppInfo)((Pair)paramMap.get(DetailFragment.d(this.a))).second).isUpgradable()) && (((LocalAppInfo)((Pair)paramMap.get(DetailFragment.d(this.a))).second).isUpgradeIgnored()))
      z.a((z)DetailFragment.e(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.r
 * JD-Core Version:    0.6.0
 */