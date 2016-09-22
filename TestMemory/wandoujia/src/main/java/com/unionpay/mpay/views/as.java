package com.unionpay.mpay.views;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class as
  implements View.OnClickListener
{
  as(x paramx)
  {
  }

  public final void onClick(View paramView)
  {
    x.a(this.a).d();
    ((InputMethodManager)this.a.d.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    this.a.a(x.b(this.a).d(), x.b(this.a).c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.as
 * JD-Core Version:    0.6.0
 */