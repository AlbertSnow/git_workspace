package com.wandoujia.p4.community.views;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.TextView;

public class InternalLinkTextView extends TextView
{
  private String[] a;
  private String[] b;
  private final TextWatcher c = new t(this);

  public InternalLinkTextView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public InternalLinkTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public InternalLinkTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    addTextChangedListener(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.InternalLinkTextView
 * JD-Core Version:    0.6.0
 */