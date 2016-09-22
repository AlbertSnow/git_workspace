package com.alipay.android.mini.widget;

import android.text.TextWatcher;
import android.widget.EditText;

public final class c
{
  private int a = 4;
  private EditText b;
  private TextWatcher c = new d(this);

  public final void a(EditText paramEditText)
  {
    this.b = paramEditText;
    this.a = 4;
    this.b.addTextChangedListener(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.c
 * JD-Core Version:    0.6.0
 */