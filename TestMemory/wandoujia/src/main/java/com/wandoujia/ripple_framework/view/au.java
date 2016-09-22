package com.wandoujia.ripple_framework.view;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class au
  implements View.OnClickListener
{
  au(Spinner paramSpinner)
  {
  }

  public final void onClick(View paramView)
  {
    Spinner.a(this.a, Spinner.f(this.a).indexOf(paramView), paramView);
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.au
 * JD-Core Version:    0.6.0
 */