package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.EmbeddedGridView;

public class CommunityTopicCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private EmbeddedGridView m;
  private TextView n;

  public CommunityTopicCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityTopicCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityTopicCardView)c.a(paramViewGroup, 2130903181);
  }

  public EmbeddedGridView getGridView()
  {
    return this.m;
  }

  public TextView getLikeCountTextView()
  {
    return this.j;
  }

  public TextView getReplyCountTextView()
  {
    return this.l;
  }

  public TextView getRoleView()
  {
    return this.n;
  }

  public TextView getTagTextView()
  {
    return this.i;
  }

  public TextView getTimeTextView()
  {
    return this.k;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131492977));
    this.j = ((TextView)findViewById(2131493447));
    this.l = ((TextView)findViewById(2131493448));
    this.k = ((TextView)findViewById(2131493428));
    this.m = ((EmbeddedGridView)findViewById(2131493445));
    findViewById(2131493449);
    this.n = ((TextView)findViewById(2131493427));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityTopicCardView
 * JD-Core Version:    0.6.0
 */