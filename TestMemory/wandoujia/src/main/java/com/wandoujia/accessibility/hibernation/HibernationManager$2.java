package com.wandoujia.accessibility.hibernation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.accessibility.hibernation.view.AppHibernatingView;

class HibernationManager$2 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && (HibernationManager.e(this.a) != null))
    {
      if (!"android.intent.action.ACTION_SHUTDOWN".equals(paramIntent.getAction()))
        break label39;
      HibernationManager.e(this.a).setVisibility(8);
    }
    label39: 
    do
      return;
    while (!"android.intent.action.USER_PRESENT".equals(paramIntent.getAction()));
    HibernationManager.e(this.a).setVisibility(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.HibernationManager.2
 * JD-Core Version:    0.6.0
 */