package com.wandoujia.ripple_framework.c;

import android.text.Html;
import android.text.TextUtils;
import android.widget.TextView;

public final class ax extends af
{
  protected final void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    if (TextUtils.isEmpty(paramCharSequence));
    for (String str = ""; ; str = paramCharSequence.toString())
    {
      paramTextView.setText(Html.fromHtml(str));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ax
 * JD-Core Version:    0.6.0
 */