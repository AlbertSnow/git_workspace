package com.wandoujia.launcher.launcher.activity;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.base.utils.SharePrefSubmitor;

final class c
  implements View.OnClickListener
{
  c(AlertDialog paramAlertDialog)
  {
  }

  public final void onClick(View paramView)
  {
    SharedPreferences.Editor localEditor = b.D().edit();
    localEditor.putBoolean("KEY_ONBOARD_KNOWN", true);
    SharePrefSubmitor.submit(localEditor);
    this.a.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.c
 * JD-Core Version:    0.6.0
 */