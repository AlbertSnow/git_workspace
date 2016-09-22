package com.wandoujia.ripple_framework.c;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public final class bz extends c
{
  protected final void a(Model paramModel)
  {
    SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder();
    if (BadgeUtil.c(paramModel))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  ");
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(localStringBuilder.toString());
      localSpannableStringBuilder2.setSpan(BadgeUtil.a((int)((TextView)e()).getTextSize(), R.drawable.verified_white), 0, 1, 17);
      localSpannableStringBuilder1.append(localSpannableStringBuilder2);
    }
    localSpannableStringBuilder1.append(paramModel.o());
    ((TextView)e()).setText(localSpannableStringBuilder1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bz
 * JD-Core Version:    0.6.0
 */