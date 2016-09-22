package com.alipay.wandoujia;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class bp
  implements TextWatcher
{
  bp(bm parambm)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = bm.a(this.a).getText().toString();
    bm.a(this.a, str);
    bm.a(this.a, str.length());
    if ((bm.b(this.a).length() == 6) && (bm.c(this.a)))
      this.a.a(this.a, new am(ra.a$65b37f89(this.a.r())));
    this.a.a(this, new am(ra.s));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bp
 * JD-Core Version:    0.6.0
 */