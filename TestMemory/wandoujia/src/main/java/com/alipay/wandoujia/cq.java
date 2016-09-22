package com.alipay.wandoujia;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.view.View;
import com.alipay.android.mini.widget.CustomEditText;
import com.alipay.android.mini.widget.CustomEditText.a;

final class cq
  implements CustomEditText.a
{
  cq(co paramco)
  {
  }

  public final void a(View paramView, boolean paramBoolean)
  {
    if ((paramBoolean) && (co.a(this.a) != null) && (co.b(this.a) != null))
      co.a(this.a).setTextColor(co.b(this.a).getResources().getColor(d.c("mini_text_color_gray")));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cq
 * JD-Core Version:    0.6.0
 */