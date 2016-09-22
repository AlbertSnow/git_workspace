package com.wandoujia.jupiter.notification.notifycard;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.push2.LogHelper;
import com.wandoujia.push2.protocol.NormalBody;

final class a
  implements View.OnClickListener
{
  a(LockScreenActivity paramLockScreenActivity)
  {
  }

  public final void onClick(View paramView)
  {
    if ((LockScreenActivity.a(this.a) != null) && (LockScreenActivity.a(this.a).getType() != 2))
      Config.c(System.currentTimeMillis());
    Intent localIntent = LogHelper.b(LockScreenActivity.a(this.a), "popup");
    LogHelper.a(paramView.getContext(), localIntent);
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.a
 * JD-Core Version:    0.6.0
 */