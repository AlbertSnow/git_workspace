package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.view.View;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class cm extends c
{
  protected final void a(Model paramModel)
  {
    View localView = e();
    if (TextUtils.isEmpty(paramModel.i()));
    for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cm
 * JD-Core Version:    0.6.0
 */