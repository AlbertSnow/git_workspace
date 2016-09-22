package com.wandoujia.jupiter.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import com.wandoujia.p4.a;

public final class e
{
  private static e a;
  private static int d = 2130838699;
  private Context b;
  private NotificationManager c;

  private e()
  {
    new f();
    this.b = a.a();
    this.c = ((NotificationManager)this.b.getSystemService("notification"));
  }

  public static e a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new e();
      e locale = a;
      return locale;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt)
  {
    this.c.cancel(paramInt);
  }

  public final void a(int paramInt, Notification paramNotification)
  {
    try
    {
      this.c.notify(paramInt, paramNotification);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public final void a(int paramInt, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, PendingIntent paramPendingIntent)
  {
    Notification localNotification = new Notification(d, paramCharSequence1, System.currentTimeMillis());
    localNotification.flags = (0x10 | localNotification.flags);
    localNotification.defaults = 0;
    localNotification.setLatestEventInfo(this.b, paramCharSequence2, paramCharSequence3, paramPendingIntent);
    this.c.notify(paramInt, localNotification);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.e
 * JD-Core Version:    0.6.0
 */