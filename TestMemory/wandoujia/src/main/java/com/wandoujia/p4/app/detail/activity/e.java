package com.wandoujia.p4.app.detail.activity;

import android.graphics.Bitmap;
import android.widget.ImageView;

final class e
  implements Runnable
{
  e(AppCommentCaptchaActivity paramAppCommentCaptchaActivity, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    if (AppCommentCaptchaActivity.b(this.b) != null)
      AppCommentCaptchaActivity.b(this.b).setImageBitmap(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.e
 * JD-Core Version:    0.6.0
 */