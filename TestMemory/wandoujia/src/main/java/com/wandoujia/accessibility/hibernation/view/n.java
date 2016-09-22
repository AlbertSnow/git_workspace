package com.wandoujia.accessibility.hibernation.view;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.wandoujia.ripple_framework.accessibility.R.string;

public final class n
{
  n(AppHibernatingView paramAppHibernatingView, String paramString)
  {
  }

  public final void a()
  {
    AppHibernatingView.a(this.b, this.a);
    String str = AppHibernatingView.b(this.b, this.a);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.b.getResources().getString(R.string.hibernating_app_name));
    SpannableString localSpannableString = new SpannableString(str);
    localSpannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
    localSpannableStringBuilder.append(localSpannableString);
    AppHibernatingView.d(this.b).setText(localSpannableStringBuilder);
    AppHibernatingView.e(this.b).setText(this.b.getResources().getString(R.string.hibernating_app_start, new Object[] { str }));
    AppHibernatingView.g(this.b).setText(AppHibernatingView.f(this.b)[(int)(java.lang.Math.random() * (-1 + AppHibernatingView.f(this.b).length))]);
  }

  public final void b()
  {
    AppHibernatingView.h(this.b);
  }

  public final void c()
  {
    AppHibernatingView.e(this.b).setText(this.b.getResources().getString(R.string.hibernating_app_cutting));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.n
 * JD-Core Version:    0.6.0
 */