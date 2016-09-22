package com.alipay.android.mini.widget;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

final class b
  implements Runnable
{
  b(CustomScrollView paramCustomScrollView)
  {
  }

  public final void run()
  {
    View localView = ((Activity)this.a.getContext()).getCurrentFocus();
    if ((localView != null) && ((localView instanceof EditText)))
      CustomScrollView.a(this.a, (EditText)localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.b
 * JD-Core Version:    0.6.0
 */