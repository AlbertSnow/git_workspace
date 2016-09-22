package com.wandoujia.ripple_framework.c.a;

import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class a extends c
{
  protected final void a(Model paramModel)
  {
    if (!CollectionUtils.isEmpty(paramModel.x()))
    {
      h().b(R.id.cover_container).e();
      new e();
      e.b(h().b(R.id.cover).h(), ((Image)paramModel.x().get(0)).url, R.color.bg_image_loading);
    }
    while (!CollectionUtils.isEmpty(paramModel.y()))
    {
      h().b(R.id.play).e();
      return;
      h().b(R.id.cover_container).c();
    }
    h().b(R.id.play).d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.a.a
 * JD-Core Version:    0.6.0
 */