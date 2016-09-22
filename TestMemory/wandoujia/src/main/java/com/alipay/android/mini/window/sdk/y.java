package com.alipay.android.mini.window.sdk;

import android.view.View;
import android.view.View.OnClickListener;
import com.alipay.android.mini.widget.CustomEditText;
import com.alipay.android.mini.widget.MiniLabelInput;
import com.alipay.wandoujia.cv;

final class y
  implements View.OnClickListener
{
  y(q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    q.h(this.a).e().requestFocus();
    this.a.g();
    cv.a(q.h(this.a).getWindowToken(), q.i(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.y
 * JD-Core Version:    0.6.0
 */