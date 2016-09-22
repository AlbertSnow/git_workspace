package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class aw
{
  public Context a;
  public CharSequence b;
  public CharSequence c;
  PendingIntent d;
  PendingIntent e;
  public Bitmap f;
  int g;
  boolean h = true;
  public ArrayList<av> i = new ArrayList();
  public Notification j = new Notification();
  public ArrayList<String> k;

  public aw(Context paramContext)
  {
    this.a = paramContext;
    this.j.when = System.currentTimeMillis();
    this.j.audioStreamType = -1;
    this.g = 0;
    this.k = new ArrayList();
  }

  public static String a(String paramString)
  {
    String str = "";
    if ((paramString != null) || (paramString.length() > 2))
      str = paramString.substring(1, -1 + paramString.length());
    return str;
  }

  private void c(int paramInt)
  {
    Notification localNotification = this.j;
    localNotification.flags = (paramInt | localNotification.flags);
  }

  protected static CharSequence d(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    do
      return paramCharSequence;
    while (paramCharSequence.length() <= 5120);
    return paramCharSequence.subSequence(0, 5120);
  }

  public final aw a()
  {
    c(16);
    return this;
  }

  public final aw a(int paramInt)
  {
    this.j.icon = paramInt;
    return this;
  }

  public final aw a(long paramLong)
  {
    this.j.when = paramLong;
    return this;
  }

  public final aw a(PendingIntent paramPendingIntent)
  {
    this.d = paramPendingIntent;
    return this;
  }

  public final aw a(RemoteViews paramRemoteViews)
  {
    this.j.contentView = paramRemoteViews;
    return this;
  }

  public final aw a(CharSequence paramCharSequence)
  {
    this.b = d(paramCharSequence);
    return this;
  }

  public final aw a(CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this.i.add(new av(paramCharSequence, paramPendingIntent));
    return this;
  }

  public final Notification b()
  {
    ay localay = au.b();
    new ax();
    return localay.a(this);
  }

  public final aw b(int paramInt)
  {
    this.g = paramInt;
    return this;
  }

  public final aw b(PendingIntent paramPendingIntent)
  {
    this.j.deleteIntent = paramPendingIntent;
    return this;
  }

  public final aw b(CharSequence paramCharSequence)
  {
    this.c = d(paramCharSequence);
    return this;
  }

  public final aw c(PendingIntent paramPendingIntent)
  {
    this.e = paramPendingIntent;
    c(128);
    return this;
  }

  public final aw c(CharSequence paramCharSequence)
  {
    this.j.tickerText = d(paramCharSequence);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.aw
 * JD-Core Version:    0.6.0
 */