package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

final class s extends c
{
  protected final void a(Model paramModel)
  {
    if (TextUtils.isEmpty(paramModel.n()))
      h().b(R.id.title).c();
    while (TextUtils.isEmpty(paramModel.o()))
    {
      h().b(R.id.sub_title).c();
      return;
      h().b(R.id.title).e();
    }
    h().b(R.id.sub_title).e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.s
 * JD-Core Version:    0.6.0
 */