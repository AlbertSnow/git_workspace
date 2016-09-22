package com.wandoujia.ripple_framework.b;

import android.content.Context;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.model.Model;

public abstract interface c
{
  public abstract void a();

  public abstract void a(Context paramContext, View paramView, Model paramModel, int paramInt);

  public abstract void a(Context paramContext, Action paramAction);

  public abstract void a(Context paramContext, Model paramModel, View paramView);

  public abstract void b();

  public abstract void b(Context paramContext, String paramString);

  public abstract void c();

  public abstract void c(Context paramContext, String paramString);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.b.c
 * JD-Core Version:    0.6.0
 */