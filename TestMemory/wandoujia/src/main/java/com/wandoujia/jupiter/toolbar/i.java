package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.l;
import android.view.MenuItem;
import android.view.View;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.library.fragment.ao;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.search.activity.SearchQueryHistoryActivity;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.feedback.FeedbackActivity;
import com.wandoujia.p4.feedback.FeedbackListActivity;
import com.wandoujia.p4.netcheck.NetCheckActivity;
import com.wandoujia.p4.settings.MainSettingActivity;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

public final class i
  implements l
{
  private final View a;
  private final Context b;
  private Model c;
  private ShareUtil.ShareContentType d;
  private ao e;

  public i(View paramView)
  {
    this.a = paramView;
    this.b = paramView.getContext();
  }

  private static void a(View paramView, String paramString)
  {
    com.wandoujia.ripple_framework.i.k().h().a(paramView, Logger.Module.UI, ViewLogPackage.Element.MENU_ITEM, ViewLogPackage.Action.REDIRECT, paramString, null).c(paramView);
  }

  public final void a(ShareUtil.ShareContentType paramShareContentType)
  {
    this.d = paramShareContentType;
  }

  public final void a(Model paramModel)
  {
    this.c = paramModel;
    if (paramModel != null)
    {
      if (this.e != null)
        this.e.a();
      if (this.a.findViewById(2131494116) != null)
        this.e = new ao(this.b, (ActionMenuItemView)this.a.findViewById(2131494116), paramModel);
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131494117:
      SearchQueryHistoryActivity.a(JupiterApplication.e(), SearchTypeForHint.ALL);
      a(this.a, "wdj://search/history");
    case 2131494115:
    case 2131494108:
    case 2131494120:
    case 2131494119:
    case 2131492932:
    case 2131494116:
    }
    while (true)
    {
      return true;
      if (this.c == null)
        continue;
      if (this.d == null);
      for (ShareUtil.ShareContentType localShareContentType = ShareUtil.ShareContentType.APP; ; localShareContentType = this.d)
      {
        this.d = localShareContentType;
        h.k().a("navigation");
        NavigationManager.a(this.b, this.c, this.d);
        ((Logger)h.k().a("log")).a(this.a, Logger.Module.APPS, ViewLogPackage.Element.MENU_ITEM, ViewLogPackage.Action.SHARE, "", null).c(this.a);
        break;
      }
      Intent localIntent3 = new Intent(this.b, MainSettingActivity.class);
      this.b.startActivity(localIntent3);
      a(this.a, "wdj://settings");
      continue;
      FeedbackActivity.a(this.b);
      a(this.a, "wdj://feedback");
      continue;
      Intent localIntent2 = new Intent(this.b, NetCheckActivity.class);
      this.b.startActivity(localIntent2);
      continue;
      Intent localIntent1 = new Intent(this.b, FeedbackListActivity.class);
      this.b.startActivity(localIntent1);
      continue;
      this.e.b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.i
 * JD-Core Version:    0.6.0
 */