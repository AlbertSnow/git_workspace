package com.wandoujia.ripple_framework.ripple.b;

import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class l extends c
{
  protected final void a(Model paramModel)
  {
    Action localAction = paramModel.t();
    if ((localAction == null) || ((TextUtils.isEmpty(localAction.url)) && (TextUtils.isEmpty(localAction.intent))))
    {
      e().setVisibility(8);
      return;
    }
    e().setVisibility(0);
    e().setOnClickListener(new m(this, paramModel, paramModel, localAction));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.l
 * JD-Core Version:    0.6.0
 */