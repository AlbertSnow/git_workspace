package com.wandoujia.game_launcher.models;

import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo.Icon;
import java.util.List;

public final class a
  implements com.wandoujia.launcher_base.view.button.a.a
{
  private SimpleAppInfo a;

  public a(SimpleAppInfo paramSimpleAppInfo)
  {
    this.a = paramSimpleAppInfo;
  }

  public final String a()
  {
    return this.a.getTitle();
  }

  public final String b()
  {
    return this.a.getIcons().getPx256();
  }

  public final long c()
  {
    return 0L;
  }

  public final String d()
  {
    return this.a.getPackageName();
  }

  public final String e()
  {
    return "";
  }

  public final int f()
  {
    return 0;
  }

  public final String g()
  {
    return "";
  }

  public final boolean h()
  {
    return true;
  }

  public final List<String> i()
  {
    return null;
  }

  public final List<ApkObbInfo> j()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.models.a
 * JD-Core Version:    0.6.0
 */