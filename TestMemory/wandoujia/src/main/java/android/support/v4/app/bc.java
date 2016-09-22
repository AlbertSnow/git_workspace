package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;

final class bc extends ay
{
  public final Notification a(aw paramaw)
  {
    boolean bool1 = true;
    Context localContext = paramaw.a;
    Notification localNotification = paramaw.j;
    CharSequence localCharSequence1 = paramaw.b;
    CharSequence localCharSequence2 = paramaw.c;
    PendingIntent localPendingIntent1 = paramaw.d;
    PendingIntent localPendingIntent2 = paramaw.e;
    Bitmap localBitmap = paramaw.f;
    Notification.Builder localBuilder1 = new Notification.Builder(localContext).setWhen(localNotification.when).setSmallIcon(localNotification.icon, localNotification.iconLevel).setContent(localNotification.contentView).setTicker(localNotification.tickerText, null).setSound(localNotification.sound, localNotification.audioStreamType).setVibrate(localNotification.vibrate).setLights(localNotification.ledARGB, localNotification.ledOnMS, localNotification.ledOffMS);
    boolean bool2;
    boolean bool3;
    label166: boolean bool4;
    label189: Notification.Builder localBuilder4;
    if ((0x2 & localNotification.flags) != 0)
    {
      bool2 = bool1;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool2);
      if ((0x8 & localNotification.flags) == 0)
        break label272;
      bool3 = bool1;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool3);
      if ((0x10 & localNotification.flags) == 0)
        break label278;
      bool4 = bool1;
      localBuilder4 = localBuilder3.setAutoCancel(bool4).setDefaults(localNotification.defaults).setContentTitle(localCharSequence1).setContentText(localCharSequence2).setContentInfo(null).setContentIntent(localPendingIntent1).setDeleteIntent(localNotification.deleteIntent);
      if ((0x80 & localNotification.flags) == 0)
        break label284;
    }
    while (true)
    {
      return localBuilder4.setFullScreenIntent(localPendingIntent2, bool1).setLargeIcon(localBitmap).setNumber(0).getNotification();
      bool2 = false;
      break;
      label272: bool3 = false;
      break label166;
      label278: bool4 = false;
      break label189;
      label284: bool1 = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bc
 * JD-Core Version:    0.6.0
 */