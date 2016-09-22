package com.tencent.map.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.at;

public class a
  implements at
{
  private Notification.Builder a;

  public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext).setWhen(paramNotification.when).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, null).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
    boolean bool2;
    boolean bool3;
    label119: boolean bool4;
    label142: Notification.Builder localBuilder4;
    if ((0x2 & paramNotification.flags) != 0)
    {
      bool2 = bool1;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool2);
      if ((0x8 & paramNotification.flags) == 0)
        break label229;
      bool3 = bool1;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool3);
      if ((0x10 & paramNotification.flags) == 0)
        break label235;
      bool4 = bool1;
      localBuilder4 = localBuilder3.setAutoCancel(bool4).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setContentInfo(null).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
      if ((0x80 & paramNotification.flags) == 0)
        break label241;
    }
    while (true)
    {
      this.a = localBuilder4.setFullScreenIntent(paramPendingIntent2, bool1).setLargeIcon(paramBitmap).setNumber(0).setProgress(0, 0, false);
      return;
      bool2 = false;
      break;
      label229: bool3 = false;
      break label119;
      label235: bool4 = false;
      break label142;
      label241: bool1 = false;
    }
  }

  public Notification a()
  {
    return this.a.getNotification();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.map.b.a
 * JD-Core Version:    0.6.0
 */