package com.wandoujia.p4.app_launcher.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.activity.HomeActivity;

final class a
  implements View.OnClickListener
{
  a(AppLauncherActivity paramAppLauncherActivity)
  {
  }

  public final void onClick(View paramView)
  {
    paramView.getContext().startActivity(new Intent(paramView.getContext(), HomeActivity.class));
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.activity.a
 * JD-Core Version:    0.6.0
 */