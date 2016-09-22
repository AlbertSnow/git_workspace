package com.alipay.android.mini.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class o
  implements TextWatcher
{
  o(MiniLabelInput paramMiniLabelInput)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (MiniLabelInput.a(this.a).getText().toString().length() > 0)
    {
      if ((MiniLabelInput.a(this.a).isEnabled()) && (MiniLabelInput.a(this.a).isFocused()))
      {
        MiniLabelInput.b(this.a);
        return;
      }
      MiniLabelInput.a(this.a).a();
      return;
    }
    MiniLabelInput.c(this.a);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.o
 * JD-Core Version:    0.6.0
 */