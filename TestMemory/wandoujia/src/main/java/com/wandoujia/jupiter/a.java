package com.wandoujia.jupiter;

import android.app.ActivityManager;
import android.content.Context;
import com.wandoujia.ripple_framework.i;

public final class a
  implements com.wandoujia.image.a
{
  private final Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  public final Context a()
  {
    return this.a;
  }

  public final String b()
  {
    return i.k().a();
  }

  public final int c()
  {
    return 268435456;
  }

  public final int d()
  {
    int i = ((ActivityManager)this.a.getSystemService("activity")).getMemoryClass();
    if (i <= 64)
      return Math.round(0.05F * (float)(1048576L * i));
    return Math.round(0.1F * (float)(1048576L * i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a
 * JD-Core Version:    0.6.0
 */