package com.wandoujia.ripple_framework.ripple.b;

import android.text.TextUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class d extends c
{
  protected final void a(Model paramModel)
  {
    if (!TextUtils.isEmpty(paramModel.n()))
    {
      h().b(R.id.title).a(paramModel.n()).e();
      if (TextUtils.isEmpty(paramModel.r()))
        break label114;
      h().b(R.id.snippet).a(paramModel.r()).e();
    }
    while (true)
    {
      if ((TextUtils.isEmpty(paramModel.n())) || (TextUtils.isEmpty(paramModel.r())))
        break label131;
      h().b(R.id.margin_view).e();
      return;
      h().b(R.id.title).c();
      break;
      label114: h().b(R.id.snippet).c();
    }
    label131: h().b(R.id.margin_view).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.d
 * JD-Core Version:    0.6.0
 */