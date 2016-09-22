package com.wandoujia.morph;

import android.content.Context;
import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.e;
import com.wandoujia.morph.engine.h;

public final class a
{
  private static a a;
  private Context b;
  private final h c = new h();
  private final d d = new d();

  public static View a(Context paramContext, String paramString1, String paramString2)
  {
    return b.a(paramContext, e.a(paramString1, paramString2), null, h.b());
  }

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public final void a(Context paramContext)
  {
    this.b = paramContext;
    h.a();
    this.d.a();
  }

  public final Context b()
  {
    return this.b;
  }

  public final d c()
  {
    return this.d;
  }

  public final h d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a
 * JD-Core Version:    0.6.0
 */