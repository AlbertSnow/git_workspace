package com.wandoujia.p4.community.card.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import com.wandoujia.p4.community.utils.CommunityImageUtils.ImageType;
import com.wandoujia.p4.community.views.CommunityAttachedReloadImageView;
import com.wandoujia.p4.utils.c;

public final class p extends h<CommunityImageInfo>
{
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null);
    CommunityAttachedReloadImageView localCommunityAttachedReloadImageView;
    for (Object localObject = (CommunityAttachedReloadImageView)paramView; ; localObject = localCommunityAttachedReloadImageView)
    {
      ((CommunityAttachedReloadImageView)localObject).a(CommunityImageUtils.a((CommunityImageInfo)getItem(paramInt), CommunityImageUtils.ImageType.SMALL), 2131361864);
      return paramView;
      View localView = c.a(paramViewGroup, 2130903211);
      localCommunityAttachedReloadImageView = (CommunityAttachedReloadImageView)localView;
      localCommunityAttachedReloadImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramView = localView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.a.p
 * JD-Core Version:    0.6.0
 */