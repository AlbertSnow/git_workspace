package com.wandoujia.ripple_framework.c.a;

import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class b extends c
{
  protected final void a(Model paramModel)
  {
    if (!CollectionUtils.isEmpty(paramModel.x()))
    {
      h().e();
      new e();
      e.b(h().h(), ((Image)paramModel.x().get(0)).url, R.color.bg_image_loading);
      return;
    }
    h().c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.a.b
 * JD-Core Version:    0.6.0
 */