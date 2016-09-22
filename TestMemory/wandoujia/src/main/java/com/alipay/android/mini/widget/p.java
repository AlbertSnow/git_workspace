package com.alipay.android.mini.widget;

import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;

final class p
  implements View.OnFocusChangeListener
{
  p(MiniLabelInput paramMiniLabelInput)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    MiniLabelInput.a(this.a).a(paramView, paramBoolean);
    if (MiniLabelInput.a(this.a).getText().toString().length() > 0)
    {
      if ((MiniLabelInput.a(this.a).isEnabled()) && (paramBoolean))
      {
        MiniLabelInput.b(this.a);
        return;
      }
      MiniLabelInput.a(this.a).a();
      return;
    }
    MiniLabelInput.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.p
 * JD-Core Version:    0.6.0
 */