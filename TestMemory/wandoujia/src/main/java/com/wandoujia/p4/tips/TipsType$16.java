package com.wandoujia.p4.tips;

import android.content.Context;
import android.view.View;
import com.wandoujia.p4.utils.c;

 enum TipsType$16
{
  protected final a createTips(Context paramContext)
  {
    View localView = c.a(paramContext, 2130903489);
    localView.findViewById(2131493911).setOnClickListener(new b());
    return new a(localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.TipsType.16
 * JD-Core Version:    0.6.0
 */