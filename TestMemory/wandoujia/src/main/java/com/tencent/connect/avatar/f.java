package com.tencent.connect.avatar;

import android.view.View;
import android.view.View.OnClickListener;

final class f
  implements View.OnClickListener
{
  f(ImageActivity paramImageActivity)
  {
  }

  public final void onClick(View paramView)
  {
    long l = System.currentTimeMillis() - ImageActivity.i(this.a);
    this.a.a("10656", l);
    this.a.setResult(0);
    ImageActivity.j(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.f
 * JD-Core Version:    0.6.0
 */