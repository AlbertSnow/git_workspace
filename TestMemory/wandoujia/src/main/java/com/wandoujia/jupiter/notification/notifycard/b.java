package com.wandoujia.jupiter.notification.notifycard;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.activity.HomeActivity;
import com.wandoujia.push2.LogHelper;

final class b
  implements View.OnClickListener
{
  b(LockScreenActivity paramLockScreenActivity)
  {
  }

  public final void onClick(View paramView)
  {
    try
    {
      LockScreenActivity.a(paramView);
      Intent localIntent = LogHelper.a(LockScreenActivity.a(this.a), "popup");
      if (localIntent != null)
      {
        localIntent.putExtra("launch_from", "NOTIFICATION_PUSH_GAMEPOPUP");
        LogHelper.a(paramView.getContext(), localIntent);
      }
      while (true)
      {
        this.a.finish();
        return;
        this.a.startActivity(new Intent(this.a, HomeActivity.class));
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.b
 * JD-Core Version:    0.6.0
 */