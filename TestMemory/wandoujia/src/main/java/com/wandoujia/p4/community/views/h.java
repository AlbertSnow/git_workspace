package com.wandoujia.p4.community.views;

import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import com.wandoujia.p4.community.utils.CommunityImageUtils.ImageType;
import com.wandoujia.p4.utils.c;

final class h extends com.wandoujia.p4.adapter.h<CommunityImageInfo>
{
  private h(CommunityTopicDetailBannerView paramCommunityTopicDetailBannerView)
  {
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null);
    CommunityAttachedReloadImageView localCommunityAttachedReloadImageView;
    for (Object localObject = (CommunityAttachedReloadImageView)paramView.findViewById(2131493463); ; localObject = localCommunityAttachedReloadImageView)
    {
      ((CommunityAttachedReloadImageView)localObject).a(CommunityImageUtils.a((CommunityImageInfo)getItem(paramInt), CommunityImageUtils.ImageType.MIDDLE), 2131361864);
      paramView.setOnClickListener(new i(this, paramInt));
      return paramView;
      paramView = c.a(paramViewGroup, 2130903208);
      localCommunityAttachedReloadImageView = (CommunityAttachedReloadImageView)paramView.findViewById(2131493463);
      localCommunityAttachedReloadImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      int i = b.a(CommunityTopicDetailBannerView.b(this.b));
      localCommunityAttachedReloadImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.h
 * JD-Core Version:    0.6.0
 */