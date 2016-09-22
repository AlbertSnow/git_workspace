package android.support.v7.internal.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.e.e;

final class av extends e<Integer, PorterDuffColorFilter>
{
  public av()
  {
    super(6);
  }

  private static int b(int paramInt, PorterDuff.Mode paramMode)
  {
    return 31 * (paramInt + 31) + paramMode.hashCode();
  }

  final PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)));
  }

  final PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.av
 * JD-Core Version:    0.6.0
 */