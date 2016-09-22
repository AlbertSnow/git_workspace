package com.unionpay.mpay.views;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class o
  implements View.OnClickListener
{
  o(aj paramaj)
  {
  }

  public final void onClick(View paramView)
  {
    aj.a(this.a).d();
    ((InputMethodManager)this.a.d.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    this.a.a(aj.b(this.a).d(), aj.b(this.a).c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.o
 * JD-Core Version:    0.6.0
 */