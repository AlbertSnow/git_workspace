package com.wandoujia.jupiter.search.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

public final class a extends c
{
  private View.OnClickListener a;

  public final void a()
  {
    super.a();
    if (this.a != null)
    {
      ((StatefulButton)h().a(2131492866).a()).c(this.a);
      this.a = null;
    }
  }

  protected final void a(Model paramModel)
  {
    if ((paramModel.b().action_positive == null) || (com.wandoujia.gamepacket.b.a(paramModel.F())));
    View localView;
    do
    {
      return;
      localView = h().a(2131492866).a();
    }
    while (this.a != null);
    this.a = new b(this, paramModel);
    ((StatefulButton)localView).b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.a
 * JD-Core Version:    0.6.0
 */