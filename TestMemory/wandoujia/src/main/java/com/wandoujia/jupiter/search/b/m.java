package com.wandoujia.jupiter.search.b;

import android.widget.ImageView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class m extends c
{
  protected final void a(Model paramModel)
  {
    ImageView localImageView = (ImageView)h().a(2131492903).a();
    if (paramModel.f() == ContentTypeEnum.ContentType.SUGGESTION)
    {
      localImageView.setImageResource(2130838324);
      return;
    }
    localImageView.setImageResource(2130838189);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.m
 * JD-Core Version:    0.6.0
 */