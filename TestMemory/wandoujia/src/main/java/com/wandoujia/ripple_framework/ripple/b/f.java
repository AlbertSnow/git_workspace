package com.wandoujia.ripple_framework.ripple.b;

import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Author;
import com.wandoujia.api.proto.Image;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;

public final class f extends c
{
  protected final void a(Model paramModel)
  {
    e().post(new g(this, paramModel));
    if ((paramModel.s() == null) || ((TextUtils.isEmpty(paramModel.s().name)) && (paramModel.s().avatar == null)))
    {
      h().b(R.id.title).c().b(R.id.divider).c().b(R.id.author).c().b(R.id.avatar).c().b(R.id.fake_title).e().a(paramModel.n());
      return;
    }
    h().b(R.id.fake_title).c().b(R.id.author).e().a(paramModel.s().name);
    if ((paramModel.s() != null) && (paramModel.s().avatar != null) && (!TextUtils.isEmpty(paramModel.s().avatar.url)))
    {
      h().b(R.id.avatar).e();
      new e();
      e.b(h().b(R.id.avatar).h(), paramModel.s().avatar.url, R.color.bg_attach);
    }
    while (TextUtils.isEmpty(paramModel.n()))
    {
      h().b(R.id.title).c().b(R.id.divider).c();
      return;
      h().b(R.id.avatar).c();
    }
    h().b(R.id.title).e().a(paramModel.n()).b(R.id.divider).e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.f
 * JD-Core Version:    0.6.0
 */