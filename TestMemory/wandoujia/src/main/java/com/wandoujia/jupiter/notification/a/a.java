package com.wandoujia.jupiter.notification.a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.notification.notifycard.LockScreenActivity;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.push2.LogHelper;
import com.wandoujia.push2.LogHelper.Action;
import com.wandoujia.push2.c;
import com.wandoujia.push2.d;
import com.wandoujia.push2.protocol.NormalBody;
import com.wandoujia.push2.protocol.NormalBody.PopupStyle;
import com.wandoujia.ripple_framework.i;

public final class a extends d
{
  protected final boolean a()
  {
    return PreferenceManager.getDefaultSharedPreferences(i.k().g()).getBoolean("setting_enable_push", OemUtil.enablePushNotification());
  }

  protected final boolean a(NormalBody paramNormalBody)
  {
    if (paramNormalBody.getStyle() == 2)
    {
      if (paramNormalBody.getType() != 2)
      {
        int i = paramNormalBody.getPopupStyle().getIntervalHour();
        long l = Config.d();
        int j;
        if (l == 0L)
          j = 1;
        while (j == 0)
        {
          return true;
          if ((System.currentTimeMillis() - l) / 3600000L > i)
          {
            j = 1;
            continue;
          }
          j = 0;
        }
      }
      if (((KeyguardManager)JupiterApplication.e().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
      {
        Intent localIntent = new Intent(JupiterApplication.e(), LockScreenActivity.class);
        localIntent.setFlags(268435456);
        localIntent.putExtra("lock_screen_notify_content", paramNormalBody);
        JupiterApplication.e().startActivity(localIntent);
        c localc = new c(paramNormalBody);
        localc.a("push2_type", "popup");
        LogHelper.a(LogHelper.Action.NOTIFICATION_SHOW, localc);
        return true;
      }
    }
    return super.a(paramNormalBody);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.a.a
 * JD-Core Version:    0.6.0
 */