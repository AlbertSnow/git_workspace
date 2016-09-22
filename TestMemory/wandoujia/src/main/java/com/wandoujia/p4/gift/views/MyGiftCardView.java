package com.wandoujia.p4.gift.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class MyGiftCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private TextView k;

  public MyGiftCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static MyGiftCardView a(ViewGroup paramViewGroup)
  {
    return (MyGiftCardView)c.a(paramViewGroup, 2130903185);
  }

  public TextView getExchangeDateTextView()
  {
    return this.i;
  }

  public TextView getGiftKeyTextView()
  {
    return this.k;
  }

  public TextView getGiftUsageTextView()
  {
    return this.j;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131493454));
    this.j = ((TextView)findViewById(2131493456));
    this.k = ((TextView)findViewById(2131493451));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.views.MyGiftCardView
 * JD-Core Version:    0.6.0
 */