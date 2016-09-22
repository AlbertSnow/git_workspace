package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;

public class CommunityCampaignItemView extends ContentCardView
{
  private TextView i;
  private ImageView j;

  public CommunityCampaignItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ImageView getIconView()
  {
    return this.j;
  }

  public TextView getTitleView()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131492998));
    this.j = ((ImageView)findViewById(2131492903));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityCampaignItemView
 * JD-Core Version:    0.6.0
 */