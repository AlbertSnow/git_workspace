package com.wandoujia.p4.utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.i;
import android.util.DisplayMetrics;
import com.wandoujia.p4.a;

public final class k
{
  private static int a = 0;

  public static int a()
  {
    if (a == 0)
    {
      Context localContext = a.a();
      a = a(localContext, i.b(localContext));
    }
    return a;
  }

  private static int a(Context paramContext, float paramFloat)
  {
    float f = paramContext.getResources().getDimension(2131427530);
    return (int)((paramFloat - 2.0F * paramContext.getResources().getDimension(2131427529)) / f);
  }

  public static int b()
  {
    Context localContext = a.a();
    return a(localContext, Math.min(i.b(localContext), localContext.getResources().getDisplayMetrics().heightPixels));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.k
 * JD-Core Version:    0.6.0
 */