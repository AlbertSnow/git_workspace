package com.wandoujia.p4.tips;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.base.utils.SystemUtil;

final class c
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    if (SystemUtil.aboveApiLevel(14))
    {
      paramView.getContext().startActivity(new Intent("android.settings.SETTINGS"));
      return;
    }
    paramView.getContext().startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.c
 * JD-Core Version:    0.6.0
 */