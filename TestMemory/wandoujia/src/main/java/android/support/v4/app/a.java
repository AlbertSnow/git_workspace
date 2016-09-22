package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;

public final class a extends android.support.v4.content.a
{
  private static b a(bn parambn)
  {
    b localb = null;
    if (parambn != null)
      localb = new b(parambn);
    return localb;
  }

  public static void a(Activity paramActivity, bn parambn)
  {
    if (Build.VERSION.SDK_INT >= 21)
      b.a(paramActivity, a(parambn));
  }

  public static void b(Activity paramActivity, bn parambn)
  {
    if (Build.VERSION.SDK_INT >= 21)
      b.b(paramActivity, a(parambn));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.6.0
 */