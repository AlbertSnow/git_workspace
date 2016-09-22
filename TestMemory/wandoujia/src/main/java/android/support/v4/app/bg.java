package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

public final class bg
  implements as, at
{
  private Notification.Builder a;
  private Bundle b;

  public bg(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, boolean paramBoolean, int paramInt, ArrayList<String> paramArrayList)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext).setWhen(paramNotification.when).setShowWhen(paramBoolean).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, null).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
    boolean bool1;
    boolean bool2;
    label119: boolean bool3;
    label141: Notification.Builder localBuilder4;
    if ((0x2 & paramNotification.flags) != 0)
    {
      bool1 = true;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool1);
      if ((0x8 & paramNotification.flags) == 0)
        break label309;
      bool2 = true;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool2);
      if ((0x10 & paramNotification.flags) == 0)
        break label315;
      bool3 = true;
      localBuilder4 = localBuilder3.setAutoCancel(bool3).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(null).setContentInfo(null).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
      if ((0x80 & paramNotification.flags) == 0)
        break label321;
    }
    label309: label315: label321: for (boolean bool4 = true; ; bool4 = false)
    {
      this.a = localBuilder4.setFullScreenIntent(paramPendingIntent2, bool4).setLargeIcon(paramBitmap).setNumber(0).setUsesChronometer(false).setPriority(paramInt).setProgress(0, 0, false).setLocalOnly(false).setGroup(null).setGroupSummary(false).setSortKey(null);
      this.b = new Bundle();
      if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
        this.b.putStringArray("android.people", (String[])paramArrayList.toArray(new String[paramArrayList.size()]));
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label119;
      bool3 = false;
      break label141;
    }
  }

  public final Notification a()
  {
    this.a.setExtras(this.b);
    return this.a.build();
  }

  public final void a(bi parambi)
  {
    b.a(this.a, parambi);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bg
 * JD-Core Version:    0.6.0
 */