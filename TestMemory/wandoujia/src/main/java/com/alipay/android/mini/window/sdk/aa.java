package com.alipay.android.mini.window.sdk;

import android.text.Editable;
import android.text.TextWatcher;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.ra;

final class aa
  implements TextWatcher
{
  aa(q paramq)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
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
 * Qualified Name:     com.alipay.android.mini.window.sdk.aa
 * JD-Core Version:    0.6.0
 */