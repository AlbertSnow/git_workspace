import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;

final class bw extends bu
{
  public final Notification a(bo parambo, bp parambp)
  {
    boolean bool1 = true;
    Context localContext = parambo.a;
    Notification localNotification = parambo.k;
    CharSequence localCharSequence1 = parambo.b;
    CharSequence localCharSequence2 = parambo.c;
    PendingIntent localPendingIntent = parambo.d;
    Notification.Builder localBuilder1 = new Notification.Builder(localContext).setWhen(localNotification.when).setSmallIcon(localNotification.icon, localNotification.iconLevel).setContent(localNotification.contentView).setTicker(localNotification.tickerText, null).setSound(localNotification.sound, localNotification.audioStreamType).setVibrate(localNotification.vibrate).setLights(localNotification.ledARGB, localNotification.ledOnMS, localNotification.ledOffMS);
    boolean bool2;
    boolean bool3;
    label156: boolean bool4;
    label179: Notification.Builder localBuilder4;
    if ((0x2 & localNotification.flags) != 0)
    {
      bool2 = bool1;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool2);
      if ((0x8 & localNotification.flags) == 0)
        break label260;
      bool3 = bool1;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool3);
      if ((0x10 & localNotification.flags) == 0)
        break label266;
      bool4 = bool1;
      localBuilder4 = localBuilder3.setAutoCancel(bool4).setDefaults(localNotification.defaults).setContentTitle(localCharSequence1).setContentText(localCharSequence2).setContentInfo(null).setContentIntent(localPendingIntent).setDeleteIntent(localNotification.deleteIntent);
      if ((0x80 & localNotification.flags) == 0)
        break label272;
    }
    while (true)
    {
      return localBuilder4.setFullScreenIntent(null, bool1).setLargeIcon(null).setNumber(0).getNotification();
      bool2 = false;
      break;
      label260: bool3 = false;
      break label156;
      label266: bool4 = false;
      break label179;
      label272: bool1 = false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bw
 * JD-Core Version:    0.6.0
 */