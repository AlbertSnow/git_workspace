package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.view.View;
import android.widget.TextView;
import com.alipay.android.mini.widget.CustomEditText.a;
import com.alipay.android.mini.widget.MiniLabelInput;

final class p
  implements CustomEditText.a
{
  p(m paramm)
  {
  }

  public final void a(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
      m.c(this.a).f().setTextColor(m.d(this.a).getResources().getColor(d.c("mini_text_color_gray")));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.p
 * JD-Core Version:    0.6.0
 */