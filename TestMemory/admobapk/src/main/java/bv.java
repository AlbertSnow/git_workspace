import android.app.Notification;

final class bv extends bu
{
  public final Notification a(bo parambo, bp parambp)
  {
    Notification localNotification = parambo.k;
    localNotification.setLatestEventInfo(parambo.a, parambo.b, parambo.c, parambo.d);
    localNotification.setLatestEventInfo(parambo.a, parambo.b, parambo.c, parambo.d);
    localNotification.fullScreenIntent = null;
    return localNotification;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bv
 * JD-Core Version:    0.6.0
 */