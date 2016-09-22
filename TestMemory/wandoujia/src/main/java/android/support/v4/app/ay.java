package android.support.v4.app;

import android.app.Notification;

class ay
{
  public Notification a(aw paramaw)
  {
    Notification localNotification = paramaw.j;
    localNotification.setLatestEventInfo(paramaw.a, paramaw.b, paramaw.c, paramaw.d);
    if (paramaw.g > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.ay
 * JD-Core Version:    0.6.0
 */