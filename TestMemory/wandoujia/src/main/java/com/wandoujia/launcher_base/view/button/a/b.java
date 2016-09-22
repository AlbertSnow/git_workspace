package com.wandoujia.launcher_base.view.button.a;

import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.entities.app.IAppLiteInfo;
import java.util.List;

public final class b
  implements a
{
  private final IAppLiteInfo a;

  public b(IAppLiteInfo paramIAppLiteInfo)
  {
    this.a = paramIAppLiteInfo;
  }

  public final String a()
  {
    return this.a.getAppLiteTitle();
  }

  public final String b()
  {
    return this.a.getAppLiteIcon();
  }

  public final long c()
  {
    return this.a.getAppLiteSize();
  }

  public final String d()
  {
    return this.a.getAppLitePackageName();
  }

  public final String e()
  {
    return this.a.getAppLiteDownloadUrl();
  }

  public final int f()
  {
    return this.a.getAppLiteVersionCode();
  }

  public final String g()
  {
    return this.a.getAppLiteMd5();
  }

  public final boolean h()
  {
    return this.a.getAppLiteCompatible();
  }

  public final List<String> i()
  {
    return this.a.getAppLiteIncompatibleDetail();
  }

  public final List<ApkObbInfo> j()
  {
    return this.a.getApkObbs();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.button.a.b
 * JD-Core Version:    0.6.0
 */