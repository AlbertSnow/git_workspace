package com.alipay.wandoujia;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class cy
  implements Runnable
{
  cy(EditText paramEditText)
  {
  }

  public final void run()
  {
    this.a.requestFocus();
    ((InputMethodManager)this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cy
 * JD-Core Version:    0.6.0
 */