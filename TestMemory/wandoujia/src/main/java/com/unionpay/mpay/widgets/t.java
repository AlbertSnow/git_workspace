package com.unionpay.mpay.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

final class t
  implements TextWatcher
{
  t(h paramh)
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
    if (h.a(this.a) == null)
      return;
    if ((h.b(this.a)) && (h.c(this.a).isFocused()))
    {
      h.a(this.a).setVisibility(0);
      return;
    }
    h.a(this.a).setVisibility(4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.t
 * JD-Core Version:    0.6.0
 */