package com.alipay.wandoujia;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.alipay.android.mini.widget.CustomEditText;

final class ar
  implements TextWatcher
{
  ar(co paramco)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    this.a.a(this, new am(ra.s));
    if (co.a(this.a).getText().toString().length() > 0)
    {
      if (co.c(this.a).getVisibility() == 0)
        co.c(this.a).setVisibility(8);
      co.a(this.a, co.a(this.a));
      return;
    }
    co.a(co.a(this.a));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ar
 * JD-Core Version:    0.6.0
 */