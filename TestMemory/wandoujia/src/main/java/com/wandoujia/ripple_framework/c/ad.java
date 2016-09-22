package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

final class ad extends af
{
  protected final void a(Model paramModel)
  {
    if (!TextUtils.isEmpty(paramModel.p()))
    {
      h().b(R.id.summary).a(paramModel.p()).e();
      return;
    }
    h().b(R.id.summary).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ad
 * JD-Core Version:    0.6.0
 */