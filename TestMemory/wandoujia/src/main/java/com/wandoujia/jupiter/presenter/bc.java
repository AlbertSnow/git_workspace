package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.View;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class bc extends h
{
  bc(bb parambb)
  {
  }

  public final boolean a(View paramView)
  {
    if (this.a.i() == null);
    DownloadInfo localDownloadInfo;
    do
    {
      return false;
      localDownloadInfo = (DownloadInfo)this.a.i().a(2131492894);
      switch (bd.a[localDownloadInfo.e.ordinal()])
      {
      default:
        return false;
      case 1:
      case 2:
      case 3:
      }
    }
    while ("com.wandoujia.game_launcher".equals(localDownloadInfo.m));
    ((NavigationManager)i.k().a("navigation")).a(this.a.f(), this.a.i(), this.a.e(), localDownloadInfo.m);
    return false;
    NavigationManager localNavigationManager = (NavigationManager)i.k().a("navigation");
    Context localContext = this.a.f();
    String str = localDownloadInfo.o;
    Action.Builder localBuilder = new Action.Builder();
    localBuilder.intent("wdj://videos/" + str);
    localNavigationManager.a(localContext, localBuilder.build());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bc
 * JD-Core Version:    0.6.0
 */