package com.wandoujia.p4.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class AlwaysMarqueeTextView extends TextView
{
  public AlwaysMarqueeTextView(Context paramContext)
  {
    super(paramContext);
  }

  public AlwaysMarqueeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AlwaysMarqueeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean isFocused()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.view.AlwaysMarqueeTextView
 * JD-Core Version:    0.6.0
 */