package com.alipay.android.mini.widget;

import android.text.TextWatcher;
import android.widget.EditText;

public final class e
{
  private EditText a;
  private TextWatcher b = new f(this);

  public e(EditText paramEditText)
  {
    this.a = paramEditText;
    this.a.addTextChangedListener(this.b);
  }

  public final void a()
  {
    this.a.removeTextChangedListener(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.e
 * JD-Core Version:    0.6.0
 */