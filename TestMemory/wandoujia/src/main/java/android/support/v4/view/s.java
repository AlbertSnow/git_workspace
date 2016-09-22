package android.support.v4.view;

import android.view.KeyEvent;

final class s extends r
{
  public final int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }

  public final boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasModifiers(paramInt, 1);
  }

  public final boolean c(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.s
 * JD-Core Version:    0.6.0
 */