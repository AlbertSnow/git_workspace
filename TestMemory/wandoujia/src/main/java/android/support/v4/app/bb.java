package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

final class bb extends ay
{
  public final Notification a(aw paramaw)
  {
    Notification localNotification = paramaw.j;
    localNotification.setLatestEventInfo(paramaw.a, paramaw.b, paramaw.c, paramaw.d);
    Context localContext = paramaw.a;
    CharSequence localCharSequence1 = paramaw.b;
    CharSequence localCharSequence2 = paramaw.c;
    PendingIntent localPendingIntent1 = paramaw.d;
    PendingIntent localPendingIntent2 = paramaw.e;
    localNotification.setLatestEventInfo(localContext, localCharSequence1, localCharSequence2, localPendingIntent1);
    localNotification.fullScreenIntent = localPendingIntent2;
    if (paramaw.g > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bb
 * JD-Core Version:    0.6.0
 */