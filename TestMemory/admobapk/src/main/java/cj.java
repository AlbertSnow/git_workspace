import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cj
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;

  static
  {
    new Object();
  }

  public static Bundle a(Notification.Builder paramBuilder, cg paramcg)
  {
    paramBuilder.addAction(paramcg.a(), paramcg.b(), paramcg.c());
    Bundle localBundle = new Bundle(paramcg.d());
    if (paramcg.e() != null)
      localBundle.putParcelableArray("android.support.remoteInputs", cq.a(paramcg.e()));
    return localBundle;
  }

  public static Bundle a(Notification paramNotification)
  {
    synchronized (a)
    {
      if (c)
        return null;
    }
    try
    {
      if (b == null)
      {
        Field localField = Notification.class.getDeclaredField("extras");
        if (!Bundle.class.isAssignableFrom(localField.getType()))
        {
          Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
          c = true;
          monitorexit;
          return null;
        }
        localField.setAccessible(true);
        b = localField;
      }
      Bundle localBundle = (Bundle)b.get(paramNotification);
      if (localBundle == null)
      {
        localBundle = new Bundle();
        b.set(paramNotification, localBundle);
      }
      monitorexit;
      return localBundle;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.e("NotificationCompat", "Unable to access notification extras", localIllegalAccessException);
      c = true;
      monitorexit;
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        Log.e("NotificationCompat", "Unable to access notification extras", localNoSuchFieldException);
    }
  }

  public static SparseArray a(List paramList)
  {
    SparseArray localSparseArray = null;
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      if (localBundle == null)
        continue;
      if (localSparseArray == null)
        localSparseArray = new SparseArray();
      localSparseArray.put(j, localBundle);
    }
    return localSparseArray;
  }

  public static void a(bi parambi, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(parambi.a()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2)
      localBigPictureStyle.bigLargeIcon(paramBitmap2);
    if (paramBoolean1)
      localBigPictureStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(bi parambi, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    Notification.BigTextStyle localBigTextStyle = new Notification.BigTextStyle(parambi.a()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean)
      localBigTextStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(bi parambi, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList paramArrayList)
  {
    Notification.InboxStyle localInboxStyle = new Notification.InboxStyle(parambi.a()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean)
      localInboxStyle.setSummaryText(paramCharSequence2);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localInboxStyle.addLine((CharSequence)localIterator.next());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cj
 * JD-Core Version:    0.6.0
 */