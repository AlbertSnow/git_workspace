package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.community.views.CommunityAttachedReloadImageView;
import com.wandoujia.p4.utils.c;

public class CommunityReplyCardView extends ContentCardView
{
  private TextView i;
  private View j;
  private TextView k;
  private CommunityAttachedReloadImageView l;
  private TextView m;
  private TextView n;

  public CommunityReplyCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityReplyCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityReplyCardView)c.a(paramViewGroup, 2130903178);
  }

  public TextView getReference()
  {
    return this.k;
  }

  public View getReferenceBg()
  {
    return this.j;
  }

  public CommunityAttachedReloadImageView getReplyImageView()
  {
    return this.l;
  }

  public TextView getReplyTimeView()
  {
    return this.m;
  }

  public TextView getRoleView()
  {
    return this.n;
  }

  public TextView getSequenceView()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131493438));
    this.l = ((CommunityAttachedReloadImageView)findViewById(2131492905));
    this.j = findViewById(2131493440);
    this.k = ((TextView)findViewById(2131493439));
    this.m = ((TextView)findViewById(2131493428));
    this.n = ((TextView)findViewById(2131493427));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityReplyCardView
 * JD-Core Version:    0.6.0
 */