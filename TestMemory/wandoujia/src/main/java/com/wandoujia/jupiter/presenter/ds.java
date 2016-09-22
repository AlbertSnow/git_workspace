package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;

public final class ds extends c
{
  protected final void a(Model paramModel)
  {
    if (TextUtils.isEmpty(paramModel.i()))
    {
      e.a(e(), paramModel.F().package_name, 0);
      return;
    }
    new e();
    e.a((ImageView)e(), paramModel.i(), 2131362003);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ds
 * JD-Core Version:    0.6.0
 */