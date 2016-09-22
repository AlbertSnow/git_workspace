package com.unionpay.mpay.widgets;

import android.text.Editable;
import android.text.TextWatcher;

final class x
  implements TextWatcher
{
  x(n paramn)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (n.a(this.a) != null)
      n.a(this.a).a(this.a.f, paramCharSequence.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.x
 * JD-Core Version:    0.6.0
 */