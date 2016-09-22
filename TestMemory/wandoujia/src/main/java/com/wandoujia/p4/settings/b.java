package com.wandoujia.p4.settings;

import android.view.View;
import com.wandoujia.ripple_framework.log.h;

final class b extends h
{
  b(a parama)
  {
  }

  public final boolean a(View paramView)
  {
    try
    {
      this.a.onBackPressed();
      label7: return false;
    }
    catch (Exception localException)
    {
      break label7;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.b
 * JD-Core Version:    0.6.0
 */