package com.wandoujia.ripple_framework.c;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.wandoujia.ripple_framework.model.Model;

final class ac extends c
{
  protected final void a(Model paramModel)
  {
    TextView localTextView = (TextView)e();
    localTextView.setText(paramModel.S());
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ac
 * JD-Core Version:    0.6.0
 */