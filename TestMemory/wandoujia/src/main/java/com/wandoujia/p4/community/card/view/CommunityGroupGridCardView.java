package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class CommunityGroupGridCardView extends ContentCardView
{
  public CommunityGroupGridCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityGroupGridCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityGroupGridCardView)c.a(paramViewGroup, 2130903174);
  }

  public static CommunityGroupGridCardView b(ViewGroup paramViewGroup)
  {
    return (CommunityGroupGridCardView)c.a(paramViewGroup, 2130903175);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityGroupGridCardView
 * JD-Core Version:    0.6.0
 */