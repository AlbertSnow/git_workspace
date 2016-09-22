package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.IconSet;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class al extends c
{
  protected final void a(Model paramModel)
  {
    if ((e() instanceof AsyncImageView))
      ((AsyncImageView)e()).a(paramModel.F().icons.px256, 2130837953);
    e().setOnClickListener(new am(this, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.al
 * JD-Core Version:    0.6.0
 */