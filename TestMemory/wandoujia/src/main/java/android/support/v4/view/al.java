package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class al
{
  private static ap a;

  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      a = new ao();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new an();
      return;
    }
    if (Build.VERSION.SDK_INT >= 5)
    {
      a = new am();
      return;
    }
    a = new ap();
  }

  public static int a(MotionEvent paramMotionEvent)
  {
    return 0xFF & paramMotionEvent.getAction();
  }

  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.a(paramMotionEvent, paramInt);
  }

  public static int b(MotionEvent paramMotionEvent)
  {
    return (0xFF00 & paramMotionEvent.getAction()) >> 8;
  }

  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.b(paramMotionEvent, paramInt);
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.c(paramMotionEvent, paramInt);
  }

  public static int c(MotionEvent paramMotionEvent)
  {
    return a.a(paramMotionEvent);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.d(paramMotionEvent, paramInt);
  }

  public static int d(MotionEvent paramMotionEvent)
  {
    return a.b(paramMotionEvent);
  }

  public static float e(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.e(paramMotionEvent, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.al
 * JD-Core Version:    0.6.0
 */