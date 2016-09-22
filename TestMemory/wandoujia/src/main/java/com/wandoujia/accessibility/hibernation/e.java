package com.wandoujia.accessibility.hibernation;

import android.telephony.PhoneStateListener;
import com.wandoujia.accessibility.hibernation.view.AppHibernatingView;

final class e extends PhoneStateListener
{
  e(HibernationManager paramHibernationManager)
  {
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    super.onCallStateChanged(paramInt, paramString);
    switch (paramInt)
    {
    default:
    case 1:
    case 0:
    }
    do
    {
      do
        return;
      while (HibernationManager.e(this.a) == null);
      HibernationManager.e(this.a).setVisibility(8);
      return;
    }
    while (HibernationManager.e(this.a) == null);
    HibernationManager.e(this.a).setVisibility(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.e
 * JD-Core Version:    0.6.0
 */