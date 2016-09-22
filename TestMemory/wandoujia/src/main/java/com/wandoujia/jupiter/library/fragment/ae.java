package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;

final class ae extends com.wandoujia.ripple_framework.c.c
{
  protected final void a(Model paramModel)
  {
    com.wandoujia.online_config.c.a();
    String str1 = ConfigStorage.a("gl_guide_title", "");
    if (TextUtils.isEmpty(str1))
      str1 = GlobalConfig.getAppContext().getString(2131624993);
    h().a(2131492998).j().setText(str1);
    com.wandoujia.online_config.c.a();
    String str2 = ConfigStorage.a("gl_guide_subtitle", "");
    if (TextUtils.isEmpty(str2))
      str2 = GlobalConfig.getAppContext().getString(2131624992);
    h().a(2131493413).j().setText(str2);
    com.wandoujia.online_config.c.a();
    String str3 = ConfigStorage.a("gl_guide_button", "");
    if (TextUtils.isEmpty(str3))
    {
      com.wandoujia.online_config.c.a();
      if (!TextUtils.equals(ConfigStorage.a("gl_guide_action", "apk"), "native"))
        break label224;
    }
    label224: for (str3 = GlobalConfig.getAppContext().getString(2131624991); ; str3 = GlobalConfig.getAppContext().getString(2131624960))
    {
      com.wandoujia.online_config.c.a();
      if ((!TextUtils.equals(ConfigStorage.a("gl_guide_action", "apk"), "apk")) || (!AppManager.a().h("com.wandoujia.game_launcher")))
        h().a(2131492866).j().setText(str3);
      com.wandoujia.online_config.c.a();
      com.wandoujia.online_config.c.a();
      if (!"local".equals(ConfigStorage.a("gl_guide_icon_source", "local")))
        break;
      com.wandoujia.launcher.e.a.a(new af(this));
      return;
    }
    new e();
    ImageView localImageView = h().a(2131492903).h();
    com.wandoujia.online_config.c.a();
    e.a(localImageView, com.wandoujia.online_config.c.f(), 2131362003);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ae
 * JD-Core Version:    0.6.0
 */