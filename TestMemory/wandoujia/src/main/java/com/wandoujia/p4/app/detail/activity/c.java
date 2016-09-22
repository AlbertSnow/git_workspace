package com.wandoujia.p4.app.detail.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class c
  implements DialogInterface.OnClickListener
{
  c(AppCommentCaptchaActivity paramAppCommentCaptchaActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.c
 * JD-Core Version:    0.6.0
 */