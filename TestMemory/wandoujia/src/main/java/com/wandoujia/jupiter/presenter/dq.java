package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.ripple_framework.model.Model;

final class dq extends y
{
  protected final void a(Model paramModel)
  {
    super.a(paramModel);
    if (ContentTypeEnum.ContentType.GIFT.equals(paramModel.f()))
      e().setClickable(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dq
 * JD-Core Version:    0.6.0
 */