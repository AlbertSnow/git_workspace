package com.alipay.android.mini.widget;

import android.text.TextWatcher;
import android.widget.EditText;

public final class g
{
  private int a = 3;
  private EditText b;
  private TextWatcher c = new h(this);

  public final void a(EditText paramEditText)
  {
    this.b = paramEditText;
    this.b.addTextChangedListener(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.g
 * JD-Core Version:    0.6.0
 */