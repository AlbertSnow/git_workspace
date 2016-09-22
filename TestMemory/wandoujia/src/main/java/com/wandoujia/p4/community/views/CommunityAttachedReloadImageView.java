package com.wandoujia.p4.community.views;

import android.content.Context;
import android.util.AttributeSet;
import com.wandoujia.image.view.AsyncImageView;

public class CommunityAttachedReloadImageView extends AsyncImageView
{
  public CommunityAttachedReloadImageView(Context paramContext)
  {
    super(paramContext);
  }

  public CommunityAttachedReloadImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommunityAttachedReloadImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityAttachedReloadImageView
 * JD-Core Version:    0.6.0
 */