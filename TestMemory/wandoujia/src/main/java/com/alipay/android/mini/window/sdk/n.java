package com.alipay.android.mini.window.sdk;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

final class n
  implements TextWatcher
{
  n(m paramm)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (this.a.e())
    {
      m.a(this.a).setEnabled(true);
      return;
    }
    m.a(this.a).setEnabled(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.n
 * JD-Core Version:    0.6.0
 */