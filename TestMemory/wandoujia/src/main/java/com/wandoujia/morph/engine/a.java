package com.wandoujia.morph.engine;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private List<b> a;

  public final int a()
  {
    if (this.a == null)
      return 0;
    return this.a.size();
  }

  @TargetApi(21)
  public final Drawable a(Context paramContext, int paramInt)
  {
    c localc = (c)((b)this.a.get(paramInt)).b;
    if (localc.a.booleanValue())
      return paramContext.getResources().getDrawable(localc.b);
    return new ColorDrawable(localc.b);
  }

  public final MoAttrType a(int paramInt)
  {
    return ((b)this.a.get(paramInt)).a;
  }

  public final void a(MoAttrType paramMoAttrType, Object paramObject)
  {
    b localb = new b(paramMoAttrType, paramObject);
    if (this.a == null)
      this.a = new ArrayList();
    this.a.add(localb);
  }

  public final Object b(int paramInt)
  {
    return ((b)this.a.get(paramInt)).b;
  }

  public final boolean c(int paramInt)
  {
    return ((Boolean)((b)this.a.get(paramInt)).b).booleanValue();
  }

  public final int d(int paramInt)
  {
    return ((Integer)((b)this.a.get(paramInt)).b).intValue();
  }

  public final Float e(int paramInt)
  {
    return (Float)((b)this.a.get(paramInt)).b;
  }

  public final String f(int paramInt)
  {
    return (String)((b)this.a.get(paramInt)).b;
  }

  public final MoWidgetType g(int paramInt)
  {
    return (MoWidgetType)((b)this.a.get(paramInt)).b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.a
 * JD-Core Version:    0.6.0
 */