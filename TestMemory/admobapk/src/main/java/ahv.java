import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import com.google.android.gms.R.drawable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ahv extends ahw
{
  @Deprecated
  public static int a(Context paramContext)
  {
    return ahw.b(paramContext);
  }

  @TargetApi(14)
  public static Dialog a(int paramInt, Activity paramActivity, amm paramamm, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (paramInt == 0)
      return null;
    if ((aoo.a(paramActivity)) && (paramInt == 2))
      paramInt = 42;
    if (ahw.b(paramActivity, paramInt))
      paramInt = 18;
    boolean bool1 = aoq.a(14);
    AlertDialog.Builder localBuilder = null;
    if (bool1)
    {
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      boolean bool2 = "Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId));
      localBuilder = null;
      if (bool2)
        localBuilder = new AlertDialog.Builder(paramActivity, 5);
    }
    if (localBuilder == null)
      localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setMessage(aml.a(paramActivity, paramInt, e(paramActivity)));
    if (paramOnCancelListener != null)
      localBuilder.setOnCancelListener(paramOnCancelListener);
    String str1 = aml.b(paramActivity, paramInt);
    if (str1 != null)
      localBuilder.setPositiveButton(str1, paramamm);
    String str2 = aml.a(paramActivity, paramInt);
    if (str2 != null)
      localBuilder.setTitle(str2);
    return localBuilder.create();
  }

  @Deprecated
  public static Intent a(int paramInt)
  {
    return oy.c.a(null, paramInt, null);
  }

  static void a(int paramInt, Context paramContext, PendingIntent paramPendingIntent)
  {
    Resources localResources1 = paramContext.getResources();
    String str1 = e(paramContext);
    Resources localResources2 = paramContext.getResources();
    String str2;
    String str3;
    label69: Object localObject;
    label182: int i;
    if (paramInt == 6)
    {
      str2 = localResources2.getString(mb.common_google_play_services_resolution_required_title);
      if (str2 == null)
        str2 = localResources1.getString(mb.common_google_play_services_notification_ticker);
      Resources localResources3 = paramContext.getResources();
      if (paramInt != 6)
        break label279;
      str3 = localResources3.getString(mb.common_google_play_services_resolution_required_text);
      if (!aoo.a(paramContext))
        break label291;
      anw.a(aoq.a(16));
      localObject = new Notification.Builder(paramContext).setSmallIcon(R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(1 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + " " + str3)).addAction(R.drawable.common_full_open_on_phone, localResources1.getString(mb.common_open_on_phone), paramPendingIntent).build();
      switch (paramInt)
      {
      default:
        i = 0;
        label235: if (i == 0)
          break;
        b.set(false);
      case 1:
      case 2:
      case 3:
      case 18:
      case 42:
      }
    }
    for (int j = 10436; ; j = 39789)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(j, (Notification)localObject);
      return;
      str2 = aml.a(paramContext, paramInt);
      break;
      label279: str3 = aml.a(paramContext, paramInt, str1);
      break label69;
      label291: String str4 = localResources1.getString(mb.common_google_play_services_notification_ticker);
      if (aoq.a(11))
      {
        Notification.Builder localBuilder = new Notification.Builder(paramContext).setSmallIcon(17301642).setContentTitle(str2).setContentText(str3).setContentIntent(paramPendingIntent).setTicker(str4).setAutoCancel(true);
        if (aoq.a(20))
          localBuilder.setLocalOnly(true);
        if (aoq.a(16))
          localBuilder.setStyle(new Notification.BigTextStyle().bigText(str3));
        for (Notification localNotification2 = localBuilder.build(); ; localNotification2 = localBuilder.getNotification())
        {
          if (Build.VERSION.SDK_INT == 19)
            localNotification2.extras.putBoolean("android.support.localOnly", true);
          localObject = localNotification2;
          break;
        }
      }
      bo localbo = new bo(paramContext);
      localbo.k.icon = 17301642;
      localbo.k.tickerText = bo.a(str4);
      long l = System.currentTimeMillis();
      localbo.k.when = l;
      Notification localNotification1 = localbo.k;
      localNotification1.flags = (0x10 | localNotification1.flags);
      localbo.d = paramPendingIntent;
      localbo.b = bo.a(str2);
      localbo.c = bo.a(str3);
      localObject = bj.a.a(localbo, new bp());
      break label182;
      i = 1;
      break label235;
    }
  }

  @TargetApi(11)
  public static void a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener, String paramString, Dialog paramDialog)
  {
    if ((paramActivity instanceof ac))
    {
      aj localaj = ((ac)paramActivity).b();
      ahy localahy = new ahy();
      Dialog localDialog2 = (Dialog)anw.a(paramDialog, "Cannot display null dialog");
      localDialog2.setOnCancelListener(null);
      localDialog2.setOnDismissListener(null);
      localahy.W = localDialog2;
      if (paramOnCancelListener != null)
        localahy.X = paramOnCancelListener;
      localahy.a(localaj, paramString);
      return;
    }
    if (aoq.a(11))
    {
      FragmentManager localFragmentManager = paramActivity.getFragmentManager();
      ow localow = new ow();
      Dialog localDialog1 = (Dialog)anw.a(paramDialog, "Cannot display null dialog");
      localDialog1.setOnCancelListener(null);
      localDialog1.setOnDismissListener(null);
      localow.a = localDialog1;
      if (paramOnCancelListener != null)
        localow.b = paramOnCancelListener;
      localow.show(localFragmentManager, paramString);
      return;
    }
    throw new RuntimeException("This Activity does not support Fragments.");
  }

  @Deprecated
  public static boolean a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = a(paramInt1, paramActivity, new amn(paramActivity, ox.a.a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
    if (localDialog == null)
      return false;
    a(paramActivity, paramOnCancelListener, "GooglePlayServicesErrorDialog", localDialog);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ahv
 * JD-Core Version:    0.6.0
 */