package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class i extends ContentObserver
{
  public i(h paramh)
  {
    super(new Handler());
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.i
 * JD-Core Version:    0.6.0
 */