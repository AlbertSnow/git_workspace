package com.wandoujia.ripple_framework.c;

import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.AppPlatform;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.model.Model;

public final class b extends bs
{
  public b()
  {
    this.a = false;
  }

  public final void a(Model paramModel)
  {
    if ((paramModel.F().app_platform == AppDetail.AppPlatform.IOS) || (paramModel.F().app_platform == AppDetail.AppPlatform.MEDIA_PRESS))
    {
      h().c();
      return;
    }
    h().e();
    a(this.a);
    super.a(paramModel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.b
 * JD-Core Version:    0.6.0
 */