import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class atp
  implements Callable
{
  private final ath a;

  atp(atj paramatj)
  {
    atx localatx = paramatj.h;
    aul localaul = new aul();
    localaul.a = Build.BRAND;
    localaul.b = Build.MODEL;
    String str1 = String.valueOf("GMS-");
    int i = oy.c.b(paramatj.j.getApplicationContext());
    localaul.e = (11 + String.valueOf(str1).length() + str1 + i);
    localaul.f = paramatj.h.f;
    localaul.c = "Android";
    localaul.d = Build.VERSION.RELEASE;
    localaul.g = paramatj.o.getWidth();
    localaul.h = paramatj.o.getHeight();
    localaul.q = new BigInteger(Settings.Secure.getString(paramatj.j.getApplicationContext().getContentResolver(), "android_id"), 16).longValue();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramatj.j.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    localaul.i = localDisplayMetrics.densityDpi;
    localaul.j = Build.BOARD;
    localaul.k = atj.a("ro.board.platform");
    ati localati = new ati(paramatj.j);
    localati.d = ((WindowManager)localati.c.getSystemService("window")).getDefaultDisplay();
    localati.j = localati.c.getResources().getConfiguration().smallestScreenWidthDp;
    localati.k = localati.c.getResources().getConfiguration().orientation;
    Point localPoint1 = new Point();
    localati.d.getSize(localPoint1);
    if (localati.k == 2)
      localPoint1.set(localPoint1.y, localPoint1.x);
    localati.l = localPoint1;
    Point localPoint2 = new Point();
    localati.d.getRealSize(localPoint2);
    if (localati.k == 2)
      localPoint2.set(localPoint2.y, localPoint2.x);
    localati.m = localPoint2;
    localati.e = localati.l.equals(localati.m);
    Rect localRect = new Rect();
    localati.b.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    localati.f = localRect.top;
    localati.g = localati.a("navigation_bar_height");
    localati.i = localati.a("navigation_bar_height_landscape");
    localati.h = localati.a("navigation_bar_width");
    if (localati.g <= 0)
      localati.g = 96;
    if (localati.i <= 0)
      localati.i = 96;
    if (localati.h <= 0)
      localati.h = 84;
    if (localati.j <= 0)
      localati.j = 400;
    localati.o = localati.m.x;
    localati.n = (localati.m.y - localati.f);
    localati.q = localati.m.y;
    localati.p = (localati.m.x - localati.f);
    ConnectivityManager localConnectivityManager;
    int j;
    if (!localati.e)
    {
      localati.n -= localati.g;
      if (localati.j < 600)
        localati.q -= localati.h;
    }
    else
    {
      localaul.l = localati.o;
      localaul.m = localati.n;
      localaul.n = localati.q;
      localaul.o = localati.p;
      Logger localLogger1 = ati.a;
      Level localLevel1 = asn.c;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(localati.o);
      arrayOfObject[1] = Integer.valueOf(localati.n);
      arrayOfObject[2] = Integer.valueOf(localati.q);
      arrayOfObject[3] = Integer.valueOf(localati.p);
      localLogger1.log(localLevel1, String.format("App viewable area in portrait: %d, %d; in landscape: %d, %d", arrayOfObject));
      localConnectivityManager = (ConnectivityManager)paramatj.j.getSystemService("connectivity");
      if (localConnectivityManager != null)
        break label896;
      j = 100;
    }
    while (true)
    {
      localaul.p = j;
      Logger localLogger2 = atj.a;
      Level localLevel2 = asn.d;
      String str2 = String.valueOf(localaul);
      localLogger2.log(localLevel2, 8 + String.valueOf(str2).length() + "Device: " + str2);
      this.a = new ath(localatx, localaul);
      return;
      localati.p -= localati.i;
      break;
      label896: NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
      {
        j = 100;
        continue;
      }
      if (!localNetworkInfo.isConnectedOrConnecting())
      {
        j = 101;
        continue;
      }
      switch (localNetworkInfo.getType())
      {
      case 8:
      default:
        j = 102;
        break;
      case 7:
        j = 1;
        break;
      case 9:
        j = 2;
        break;
      case 1:
        j = 3;
        break;
      case 6:
        j = 11;
        break;
      case 0:
      case 2:
      case 3:
      case 4:
      case 5:
        switch (localNetworkInfo.getSubtype())
        {
        default:
          j = 103;
          break;
        case 13:
          j = 10;
          break;
        case 4:
          j = 20;
          break;
        case 2:
          j = 21;
          break;
        case 1:
          j = 22;
          break;
        case 11:
          j = 23;
          break;
        case 7:
          j = 24;
          break;
        case 5:
          j = 30;
          break;
        case 6:
          j = 31;
          break;
        case 12:
          j = 32;
          break;
        case 14:
          j = 33;
          break;
        case 8:
          j = 34;
          break;
        case 10:
          j = 35;
          break;
        case 15:
          j = 36;
          break;
        case 9:
          j = 37;
          break;
        case 3:
          j = 38;
        }
      }
    }
  }

  private atq a()
  {
    atq localatq = new atq();
    try
    {
      localatq.b = this.a.a();
      Logger localLogger = atj.a;
      Level localLevel = asn.d;
      String str1 = String.valueOf(localatq.b.a);
      if (str1.length() != 0);
      for (String str2 = "Ass server ip address: ".concat(str1); ; str2 = new String("Ass server ip address: "))
      {
        localLogger.log(localLevel, str2);
        return localatq;
      }
    }
    catch (IOException localIOException)
    {
      atj.a.log(asn.a, "Failed to receive a provisioning response", localIOException);
      localatq.a = this.a.a;
    }
    return localatq;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atp
 * JD-Core Version:    0.6.0
 */