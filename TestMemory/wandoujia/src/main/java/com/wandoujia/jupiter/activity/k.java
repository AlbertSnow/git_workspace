package com.wandoujia.jupiter.activity;

import android.view.View;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.jupiter.share.ShareUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.view.LoadingView;

final class k extends com.wandoujia.ripple_framework.log.h
{
  k(ShareActivity paramShareActivity)
  {
  }

  public final boolean a(View paramView)
  {
    int i = paramView.getId();
    if (i == 2131493573)
    {
      ShareUtil.a(this.a, ShareActivity.a(this.a), ShareActivity.b(this.a));
      ((Logger)com.wandoujia.jupiter.h.k().a("log")).a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SHARE, SharePlatformEnum.OTHERS.name(), null).c(paramView);
      return false;
    }
    SharePlatformEnum localSharePlatformEnum;
    switch (i)
    {
    default:
      return false;
    case 2131493597:
      localSharePlatformEnum = SharePlatformEnum.WEIBO;
    case 2131493598:
    case 2131493599:
    case 2131493600:
    case 2131493601:
    }
    while (true)
    {
      ((Logger)com.wandoujia.jupiter.h.k().a("log")).a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SHARE, localSharePlatformEnum.name(), null).c(paramView);
      ShareActivity.c(this.a).a();
      ShareUtil.a(ShareActivity.a(this.a), localSharePlatformEnum, ShareActivity.b(this.a), new l(this, localSharePlatformEnum), new m(this, localSharePlatformEnum));
      return false;
      localSharePlatformEnum = SharePlatformEnum.WECHAT_MOMENT;
      continue;
      localSharePlatformEnum = SharePlatformEnum.WECHAT_SESSION;
      continue;
      localSharePlatformEnum = SharePlatformEnum.QQ;
      continue;
      localSharePlatformEnum = SharePlatformEnum.LINK;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.k
 * JD-Core Version:    0.6.0
 */