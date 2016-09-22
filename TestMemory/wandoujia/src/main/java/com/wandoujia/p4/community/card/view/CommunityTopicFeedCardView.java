package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.EmbeddedGridView;

public class CommunityTopicFeedCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private EmbeddedGridView n;

  public CommunityTopicFeedCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityTopicFeedCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityTopicFeedCardView)c.a(paramViewGroup, 2130903180);
  }

  public EmbeddedGridView getGridView()
  {
    return this.n;
  }

  public TextView getGroupNameTextView()
  {
    return this.j;
  }

  public TextView getLikeCountTextView()
  {
    return this.k;
  }

  public TextView getReplyCountTextView()
  {
    return this.m;
  }

  public TextView getTimeTextView()
  {
    return this.l;
  }

  public TextView getTitleTextView()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131492998));
    this.k = ((TextView)findViewById(2131493447));
    this.m = ((TextView)findViewById(2131493448));
    this.l = ((TextView)findViewById(2131493428));
    this.n = ((EmbeddedGridView)findViewById(2131493445));
    this.j = ((TextView)findViewById(2131493446));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityTopicFeedCardView
 * JD-Core Version:    0.6.0
 */