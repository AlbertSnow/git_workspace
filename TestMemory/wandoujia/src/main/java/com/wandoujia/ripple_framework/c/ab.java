package com.wandoujia.ripple_framework.c;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

public abstract class ab extends ClickableSpan
{
  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ab
 * JD-Core Version:    0.6.0
 */