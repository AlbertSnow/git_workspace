package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class bc
{
  private static bf a;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new be();
      return;
    }
    a = new bd();
  }

  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }

  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bc
 * JD-Core Version:    0.6.0
 */