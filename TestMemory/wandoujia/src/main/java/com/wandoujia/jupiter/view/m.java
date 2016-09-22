package com.wandoujia.jupiter.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.jupiter.share.ShareUtil;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class m
  implements View.OnClickListener
{
  m(ShareView paramShareView)
  {
  }

  public final void onClick(View paramView)
  {
    if (ShareView.a(this.a) == null)
      return;
    SharePlatformEnum localSharePlatformEnum;
    switch (paramView.getId())
    {
    default:
      localSharePlatformEnum = SharePlatformEnum.OTHERS;
    case 2131493597:
    case 2131493598:
    case 2131493599:
    }
    while (true)
    {
      ((Logger)h.k().a("log")).a(paramView, Logger.Module.APPS, ViewLogPackage.Element.ICON, ViewLogPackage.Action.SHARE, localSharePlatformEnum.name(), null).a(paramView, new ContentPackage.Builder().identity(ShareUtil.a(ShareView.b(this.a), ShareView.a(this.a))).build()).c(paramView);
      ShareUtil.a(ShareView.a(this.a), localSharePlatformEnum, ShareView.b(this.a), new n(this, paramView, localSharePlatformEnum), new o(this, paramView, localSharePlatformEnum));
      return;
      localSharePlatformEnum = SharePlatformEnum.WEIBO;
      continue;
      localSharePlatformEnum = SharePlatformEnum.WECHAT_MOMENT;
      continue;
      localSharePlatformEnum = SharePlatformEnum.WECHAT_SESSION;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.m
 * JD-Core Version:    0.6.0
 */