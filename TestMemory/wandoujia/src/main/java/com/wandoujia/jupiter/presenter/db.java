package com.wandoujia.jupiter.presenter;

import android.widget.ImageView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;

final class db extends c
{
  protected final void a(Model paramModel)
  {
    new e(0);
    ImageView localImageView = (ImageView)e();
    String str = paramModel.F().package_name;
    e.a(localImageView, "app:///" + str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.db
 * JD-Core Version:    0.6.0
 */