package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType;

public final class ez extends c
{
  protected final void a(Model paramModel)
  {
    TextView localTextView = (TextView)e();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (BadgeUtil.c(paramModel))
    {
      localSpannableStringBuilder.append(BadgeUtil.a((int)localTextView.getTextSize(), BadgeUtil.SubBadgeType.VERIFIED));
      localSpannableStringBuilder.append(e().getResources().getText(2131625589));
    }
    localTextView.setText(localSpannableStringBuilder);
    e().setOnClickListener(new fa(this, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ez
 * JD-Core Version:    0.6.0
 */