package com.wandoujia.ripple_framework.c.a;

import android.text.TextUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class e extends c
{
  protected final void a(Model paramModel)
  {
    if (!TextUtils.isEmpty(paramModel.n()))
      h().b(R.id.title).a(paramModel.n()).e();
    while (!TextUtils.isEmpty(paramModel.r()))
    {
      h().b(R.id.snippet).a(paramModel.r()).e();
      return;
      h().b(R.id.title).c();
    }
    h().b(R.id.snippet).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.a.e
 * JD-Core Version:    0.6.0
 */