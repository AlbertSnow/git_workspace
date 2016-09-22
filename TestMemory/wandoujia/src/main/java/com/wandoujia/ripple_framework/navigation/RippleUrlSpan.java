package com.wandoujia.ripple_framework.navigation;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.ripple_framework.i;

public class RippleUrlSpan extends URLSpan
{
  public RippleUrlSpan(String paramString)
  {
    super(paramString);
  }

  public void onClick(View paramView)
  {
    String str = getURL();
    if (str == null)
      return;
    Context localContext = paramView.getContext();
    Action localAction = new Action.Builder().intent(str).url(str).build();
    i.k().a("navigation");
    a.a(localContext, localAction, localContext.getPackageName());
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setColor(Color.parseColor("#24aa42"));
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.navigation.RippleUrlSpan
 * JD-Core Version:    0.6.0
 */