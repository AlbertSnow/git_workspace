package com.wandoujia.p4.tips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

 enum TipsType$2
{
  protected final a createTips(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903092, null, false);
    ((Button)localView.findViewById(2131493238)).setOnClickListener(new c());
    return new a(localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.TipsType.2
 * JD-Core Version:    0.6.0
 */