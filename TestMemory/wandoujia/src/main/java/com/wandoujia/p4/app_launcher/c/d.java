package com.wandoujia.p4.app_launcher.c;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class d extends com.wandoujia.ripple_framework.log.h
{
  d(AlertDialog paramAlertDialog)
  {
  }

  public final boolean a(View paramView)
  {
    ViewLogPackage localViewLogPackage = com.wandoujia.ripple_framework.h.j().h().f(paramView);
    c.a();
    String str1 = ConfigStorage.a("fast_clean_apk_url");
    if (TextUtils.isEmpty(str1))
      str1 = "http://upload.cdn.wandoujia.com/tools/fastclean/203/fastclean-clean_al.apk";
    String str2 = GlobalConfig.getAppContext().getString(2131624725);
    c.a();
    String str3 = ConfigStorage.a("fast_clean_apk_icon");
    if (TextUtils.isEmpty(str3))
      str3 = "http://upload.cdn.wandoujia.com/tools/fastclean/200/ic_app.png";
    c.a();
    Model localModel = android.support.v4.app.d.a("com.fastclean", str1, str2, str3, c.r());
    ((AppTaskManager)i.k().a("app_task")).a(localModel, localViewLogPackage);
    i.k().h().a(paramView, Logger.Module.APP_LAUNCHER, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.DOWNLOAD, "install_fastclean", null).c(paramView);
    this.a.dismiss();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.c.d
 * JD-Core Version:    0.6.0
 */