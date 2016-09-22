package com.wandoujia.p4.app.detail.fragment;

import android.app.Activity;
import android.support.v4.app.b;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.a.a;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class h
  implements a
{
  h(g paramg, Activity paramActivity)
  {
  }

  public final void a(Snackbar paramSnackbar)
  {
    i.k().h().a(paramSnackbar, Logger.Module.COMMENTS, ViewLogPackage.Element.FOOTER, ViewLogPackage.Action.REDIRECT, "detail_comment_feedback", Long.valueOf(0L)).c(paramSnackbar);
    ((NavigationManager)i.k().a("navigation")).b(this.a, b.d(AppCommentsFragment.f(this.b.a), AppCommentsFragment.i(this.b.a), AppCommentsFragment.j(this.b.a), AppCommentsFragment.k(this.b.a)));
    paramSnackbar.g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.h
 * JD-Core Version:    0.6.0
 */