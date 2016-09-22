package com.wandoujia.jupiter.a;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType;

final class e extends c
{
  protected final void a(Model paramModel)
  {
    if (ContentTypeEnum.ContentType.VIDEO.equals(paramModel.f()))
    {
      ((TextView)e()).setText(2131625603);
      return;
    }
    TextView localTextView = (TextView)e();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (BadgeUtil.c(paramModel))
      localSpannableStringBuilder.append(BadgeUtil.a((int)localTextView.getTextSize(), BadgeUtil.SubBadgeType.VERIFIED));
    localSpannableStringBuilder.append(paramModel.o());
    localTextView.setText(localSpannableStringBuilder);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.e
 * JD-Core Version:    0.6.0
 */