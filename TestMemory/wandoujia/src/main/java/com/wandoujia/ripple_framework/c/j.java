package com.wandoujia.ripple_framework.c;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class j
  implements View.OnClickListener
{
  j(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    ((Activity)this.a.e().getContext()).onBackPressed();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.j
 * JD-Core Version:    0.6.0
 */