package android.support.v4.d;

import android.os.Build.VERSION;

public final class a
{
  private static final b a;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new d();
      return;
    }
    a = new c();
  }

  public static String a(String paramString)
  {
    return a.a(paramString);
  }

  public static String b(String paramString)
  {
    return a.b(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.d.a
 * JD-Core Version:    0.6.0
 */