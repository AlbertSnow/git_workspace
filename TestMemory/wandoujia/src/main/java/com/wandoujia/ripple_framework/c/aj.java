package com.wandoujia.ripple_framework.c;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType;

public final class aj extends c
{
  protected final void a(Model paramModel)
  {
    String str = paramModel.o();
    TextView localTextView = (TextView)e();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (BadgeUtil.c(paramModel))
      localSpannableStringBuilder.append(BadgeUtil.a((int)localTextView.getTextSize(), BadgeUtil.SubBadgeType.VERIFIED));
    localSpannableStringBuilder.append(str);
    localTextView.setText(localSpannableStringBuilder);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.aj
 * JD-Core Version:    0.6.0
 */