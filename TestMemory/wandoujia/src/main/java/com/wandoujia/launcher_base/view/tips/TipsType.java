package com.wandoujia.launcher_base.view.tips;

import android.content.Context;

public enum TipsType
{
  private int layoutRes;

  static
  {
    TipsType[] arrayOfTipsType = new TipsType[1];
    arrayOfTipsType[0] = LOADING;
    $VALUES = arrayOfTipsType;
  }

  private TipsType()
  {
  }

  private TipsType(int paramInt)
  {
    this.layoutRes = paramInt;
  }

  protected a createTips(Context paramContext)
  {
    return new a(paramContext, this.layoutRes);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.tips.TipsType
 * JD-Core Version:    0.6.0
 */