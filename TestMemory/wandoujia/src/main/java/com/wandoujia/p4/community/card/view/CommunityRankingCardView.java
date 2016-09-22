package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class CommunityRankingCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private AsyncImageView k;

  public CommunityRankingCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityRankingCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityRankingCardView)c.a(paramViewGroup, 2130903207);
  }

  public AsyncImageView getAvatarView()
  {
    return this.k;
  }

  public TextView getContentView()
  {
    return this.j;
  }

  public TextView getNameView()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.k = ((AsyncImageView)findViewById(2131493101));
    this.i = ((TextView)findViewById(2131493491));
    this.j = ((TextView)findViewById(2131492888));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityRankingCardView
 * JD-Core Version:    0.6.0
 */