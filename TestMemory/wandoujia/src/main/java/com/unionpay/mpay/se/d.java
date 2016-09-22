package com.unionpay.mpay.se;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class d
  implements View.OnClickListener
{
  d(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    a.b(this.a).d();
    ((InputMethodManager)a.k(this.a).getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    a.a(this.a, a.c(this.a).d(), a.c(this.a).c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.se.d
 * JD-Core Version:    0.6.0
 */