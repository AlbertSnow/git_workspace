package com.wandoujia.p4.community.views;

import android.content.Context;
import android.util.AttributeSet;
import com.wandoujia.p4.views.CircleAsyncImageView;

public class CommunityAttachedReloadCircleImageView extends CircleAsyncImageView
{
  public CommunityAttachedReloadCircleImageView(Context paramContext)
  {
    super(paramContext);
  }

  public CommunityAttachedReloadCircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommunityAttachedReloadCircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onAttachedToWindow()
  {
    a(true);
    super.onAttachedToWindow();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityAttachedReloadCircleImageView
 * JD-Core Version:    0.6.0
 */