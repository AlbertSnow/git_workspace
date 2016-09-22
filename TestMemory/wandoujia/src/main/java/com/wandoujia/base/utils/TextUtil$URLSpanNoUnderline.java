package com.wandoujia.base.utils;

import android.text.TextPaint;
import android.text.style.URLSpan;

class TextUtil$URLSpanNoUnderline extends URLSpan
{
  public TextUtil$URLSpanNoUnderline(String paramString)
  {
    super(paramString);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.TextUtil.URLSpanNoUnderline
 * JD-Core Version:    0.6.0
 */