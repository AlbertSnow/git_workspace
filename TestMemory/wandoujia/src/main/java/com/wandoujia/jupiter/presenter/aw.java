package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.ripple_framework.view.a.h;

public final class aw extends c
{
  public static void a(Context paramContext, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    h localh = new h(paramContext);
    if (paramBoolean);
    for (int i = 2131624332; ; i = 2131624331)
    {
      localh.a(i).a(2131624353, paramOnClickListener).b(2131624330, new az()).a().show();
      return;
    }
  }

  protected final void a(Model paramModel)
  {
    e().setOnClickListener(new ax(this, paramModel, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.aw
 * JD-Core Version:    0.6.0
 */