package com.wandoujia.ripple_framework.c;

import android.widget.ImageView;
import com.wandoujia.ripple_framework.util.BadgeUtil.BadgeType;

public final class ar extends af
{
  protected final void a(ImageView paramImageView, BadgeUtil.BadgeType paramBadgeType)
  {
    if ((paramBadgeType != BadgeUtil.BadgeType.DESIGN_AWARD) && (paramBadgeType != BadgeUtil.BadgeType.PUBLISH) && (paramBadgeType != BadgeUtil.BadgeType.NEW_PRODUCT))
    {
      super.a(paramImageView, paramBadgeType);
      return;
    }
    paramImageView.setImageResource(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ar
 * JD-Core Version:    0.6.0
 */