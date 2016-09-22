package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class ExtraDescCardView extends ContentCardView
{
  private TextView i;

  public ExtraDescCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static ExtraDescCardView a(ViewGroup paramViewGroup)
  {
    return (ExtraDescCardView)c.a(paramViewGroup, 2130903221);
  }

  public TextView getDescriptionView()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131493520));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ExtraDescCardView
 * JD-Core Version:    0.6.0
 */