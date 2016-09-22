package com.wandoujia.ripple_framework.view.slidingtab;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.TypefaceManager.FONT;
import com.wandoujia.ripple_framework.view.CustomFontTextView;

public class e
{
  private CharSequence a;
  private View b;
  private String c;

  public e(String paramString)
  {
    this.c = paramString;
  }

  public e(String paramString, CharSequence paramCharSequence)
  {
    this(paramString);
    this.a = paramCharSequence;
  }

  public View a(Context paramContext, int paramInt, ViewPager paramViewPager, android.support.v7.app.f paramf)
  {
    this.b = new CustomFontTextView(paramContext);
    this.b.setTag(R.id.tab_default_theme, Boolean.valueOf(true));
    ((CustomFontTextView)this.b).setFont(TypefaceManager.FONT.BOLD);
    TextView localTextView = (TextView)this.b;
    localTextView.setText(this.a);
    localTextView.setFocusable(true);
    localTextView.setGravity(17);
    localTextView.setSingleLine();
    this.b.setOnClickListener(new f(paramInt, paramViewPager));
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.slidingtab.e
 * JD-Core Version:    0.6.0
 */