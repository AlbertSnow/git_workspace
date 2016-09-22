package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public final class z extends c
{
  protected final void a(Model paramModel)
  {
    h().j().setMovementMethod(LinkMovementMethod.getInstance());
    SpannableString localSpannableString = new SpannableString(i.k().g().getString(R.string.feed_copyright));
    int i = -4 + localSpannableString.length();
    int j = localSpannableString.length();
    localSpannableString.setSpan(new aa(), i, j, 33);
    localSpannableString.setSpan(new ForegroundColorSpan(i.k().g().getResources().getColor(R.color.ripple_primary)), i, j, 33);
    h().a(localSpannableString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.z
 * JD-Core Version:    0.6.0
 */