package com.wandoujia.ripple_framework.installer.install.impl;

import android.util.Pair;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppChangedListener.Error;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.ripple_framework.installer.install.n;
import java.util.Map;

final class g extends LocalAppChangedListener
{
  g(f paramf)
  {
  }

  public final void a()
  {
  }

  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    if ((f.a(this.a) != null) && (paramLocalAppInfo2 != null))
      f.a(this.a).b(paramLocalAppInfo2.getPackageName());
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    if ((f.a(this.a) != null) && (paramLocalAppInfo != null))
      f.a(this.a).b(paramLocalAppInfo.getPackageName());
  }

  public final void a(String paramString, LocalAppChangedListener.Error paramError, boolean paramBoolean)
  {
    if (paramError != null)
      paramError.name();
    if (f.a(this.a) != null)
      f.a(this.a).c(paramString);
  }

  public final void a(String paramString, LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
  }

  public final void a(Map<String, Pair<LocalAppInfo, LocalAppInfo>> paramMap)
  {
  }

  public final void b()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.g
 * JD-Core Version:    0.6.0
 */