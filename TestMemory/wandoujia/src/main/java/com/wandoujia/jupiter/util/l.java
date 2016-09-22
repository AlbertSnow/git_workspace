package com.wandoujia.jupiter.util;

import android.content.Context;
import android.support.v4.app.d;
import com.wandoujia.jupiter.view.h;

final class l
  implements h
{
  l(Context paramContext)
  {
  }

  public final void a()
  {
    d.a(this.a, AutoInstallGuideUtil.c());
    AutoInstallGuideUtil.c(this.a);
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CLICK_POSITIVE);
  }

  public final void b()
  {
    d.a(this.a, AutoInstallGuideUtil.c());
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CLICK_NEGATIVE);
  }

  public final void c()
  {
    d.a(this.a, AutoInstallGuideUtil.c());
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CANCEL);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.l
 * JD-Core Version:    0.6.0
 */