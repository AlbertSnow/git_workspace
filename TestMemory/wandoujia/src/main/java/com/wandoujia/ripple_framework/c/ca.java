package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.List;

public final class ca extends c
{
  protected final void a(Model paramModel)
  {
    ImageView localImageView = (ImageView)e();
    if (BadgeUtil.c(paramModel))
    {
      localImageView.setVisibility(0);
      if ((!CollectionUtils.isEmpty(paramModel.w())) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
      {
        localImageView.setImageResource(R.drawable.verified_grand_white);
        return;
      }
      localImageView.setImageResource(R.drawable.verified_grand);
      return;
    }
    localImageView.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ca
 * JD-Core Version:    0.6.0
 */