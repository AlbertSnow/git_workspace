package com.wandoujia.jupiter.toolbar;

import android.app.Activity;
import android.view.View;
import com.wandoujia.ripple_framework.log.h;

final class b extends h
{
  b(JupiterToolbarForDetail paramJupiterToolbarForDetail)
  {
  }

  public final boolean a(View paramView)
  {
    ((Activity)this.a.getContext()).onBackPressed();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.b
 * JD-Core Version:    0.6.0
 */