package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bl
  implements as, at
{
  private Notification.Builder a;
  private final Bundle b;
  private List<Bundle> c = new ArrayList();

  public bl(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext).setWhen(paramNotification.when).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, null).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
    boolean bool2;
    boolean bool3;
    label130: boolean bool4;
    label153: Notification.Builder localBuilder4;
    if ((0x2 & paramNotification.flags) != 0)
    {
      bool2 = bool1;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool2);
      if ((0x8 & paramNotification.flags) == 0)
        break label264;
      bool3 = bool1;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool3);
      if ((0x10 & paramNotification.flags) == 0)
        break label270;
      bool4 = bool1;
      localBuilder4 = localBuilder3.setAutoCancel(bool4).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(null).setContentInfo(null).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
      if ((0x80 & paramNotification.flags) == 0)
        break label276;
    }
    while (true)
    {
      this.a = localBuilder4.setFullScreenIntent(paramPendingIntent2, bool1).setLargeIcon(paramBitmap).setNumber(0).setUsesChronometer(false).setPriority(paramInt).setProgress(0, 0, false);
      this.b = new Bundle();
      return;
      bool2 = false;
      break;
      label264: bool3 = false;
      break label130;
      label270: bool4 = false;
      break label153;
      label276: bool1 = false;
    }
  }

  public final Notification a()
  {
    Notification localNotification = this.a.build();
    Bundle localBundle1 = bk.a(localNotification);
    Bundle localBundle2 = new Bundle(this.b);
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!localBundle1.containsKey(str))
        continue;
      localBundle2.remove(str);
    }
    localBundle1.putAll(localBundle2);
    SparseArray localSparseArray = bk.a(this.c);
    if (localSparseArray != null)
      bk.a(localNotification).putSparseParcelableArray("android.support.actionExtras", localSparseArray);
    return localNotification;
  }

  public final void a(bi parambi)
  {
    this.c.add(bk.a(this.a, parambi));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bl
 * JD-Core Version:    0.6.0
 */