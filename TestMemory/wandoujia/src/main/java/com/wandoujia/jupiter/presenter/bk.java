package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.jupiter.c.h;
import com.wandoujia.jupiter.subscribe.a.a;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class bk extends c
{
  private final Context a;
  private b g;
  private Model h;
  private int i = 2130838270;
  private int j = 2130838271;
  private bm k;

  public bk(Context paramContext)
  {
    this(paramContext, 0);
  }

  private bk(Context paramContext, byte paramByte)
  {
    this.a = paramContext;
    this.i = 2130838270;
    this.j = 2130838271;
    this.k = new bm();
    SubscribeManager.a().a(this.k);
  }

  private void b()
  {
    ImageView localImageView = (ImageView)e();
    if (a.b(this.h));
    for (int m = this.j; ; m = this.i)
    {
      localImageView.setImageResource(m);
      return;
    }
  }

  public final void a()
  {
    this.k.a(null);
    this.g = null;
    super.a();
  }

  protected final void a(Model paramModel)
  {
    if (paramModel == null)
      return;
    this.h = paramModel;
    if (this.g == null)
    {
      this.g = new h(this.a, paramModel);
      this.k.a(this);
    }
    e().setOnClickListener(new bl(this, paramModel));
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bk
 * JD-Core Version:    0.6.0
 */