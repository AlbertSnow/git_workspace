package com.alipay.android.mini.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class f
  implements TextWatcher
{
  private int a;

  f(e parame)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = e.a(this.b).getText().toString();
    int i = str.length();
    if ((i > 1) && (str.charAt(i - 1) == ' ') && (this.a > i))
      paramEditable.delete(i - 1, i);
    if ((i == 7) && (this.a < i))
      paramEditable.insert(6, " ");
    do
      return;
    while ((i != 16) || (this.a >= i));
    paramEditable.insert(15, " ");
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = e.a(this.b).getText().toString().length();
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.f
 * JD-Core Version:    0.6.0
 */