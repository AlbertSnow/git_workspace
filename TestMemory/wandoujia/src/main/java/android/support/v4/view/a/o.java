package android.support.v4.view.a;

import android.os.Build.VERSION;
import java.util.List;

public final class o
{
  private static final p a;
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new r();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new q();
      return;
    }
    a = new p();
  }

  public o()
  {
    this.b = a.a();
  }

  public o(Object paramObject)
  {
    this.b = paramObject;
  }

  public static f b()
  {
    return null;
  }

  public static boolean c()
  {
    return false;
  }

  public static List<f> d()
  {
    return null;
  }

  public static f e()
  {
    return null;
  }

  public final Object a()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.o
 * JD-Core Version:    0.6.0
 */