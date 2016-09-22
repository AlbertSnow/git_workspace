package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.button.views.SubActionButton;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class CommunityMemberCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private AsyncImageView m;
  private SubActionButton n;

  public CommunityMemberCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityMemberCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityMemberCardView)c.a(paramViewGroup, 2130903203);
  }

  public AsyncImageView getAvatarView()
  {
    return this.m;
  }

  public TextView getContentView()
  {
    return this.j;
  }

  public TextView getNameView()
  {
    return this.i;
  }

  public TextView getRoleLabelView()
  {
    return this.l;
  }

  public TextView getSelfLabelView()
  {
    return this.k;
  }

  public SubActionButton getSubActionButton()
  {
    return this.n;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.m = ((AsyncImageView)findViewById(2131493101));
    this.i = ((TextView)findViewById(2131493491));
    this.j = ((TextView)findViewById(2131492888));
    this.k = ((TextView)findViewById(2131493492));
    this.l = ((TextView)findViewById(2131493493));
    this.n = ((SubActionButton)findViewById(2131493449));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityMemberCardView
 * JD-Core Version:    0.6.0
 */