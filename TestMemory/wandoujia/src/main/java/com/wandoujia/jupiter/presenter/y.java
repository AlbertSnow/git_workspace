package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.model.Model;

public class y extends com.wandoujia.ripple_framework.c.c
{
  protected void a(Model paramModel)
  {
    if ((paramModel.F() != null) && (!TextUtils.isEmpty(paramModel.F().package_name)))
      com.wandoujia.p4.utils.c.a(e(), paramModel.F().package_name);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.y
 * JD-Core Version:    0.6.0
 */