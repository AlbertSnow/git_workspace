package com.wandoujia.p4.settings;

import android.content.ClipboardManager;
import android.os.Handler;
import android.view.View;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.log.h;

final class d extends h
{
  d(FollowUsTipsTransparentActivity paramFollowUsTipsTransparentActivity)
  {
  }

  public final boolean a(View paramView)
  {
    if (SystemUtil.aboveApiLevel(11))
      ((ClipboardManager)this.a.getSystemService("clipboard")).setText("wandoulabs");
    new Handler().post(new e(this));
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.d
 * JD-Core Version:    0.6.0
 */