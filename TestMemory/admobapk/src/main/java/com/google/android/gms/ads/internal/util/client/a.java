package com.google.android.gms.ads.internal.util.client;

import amj;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import aoq;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import me;
import mk;
import mm;
import oy;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  public static final Handler a = new Handler(Looper.getMainLooper());
  private static final String b = mk.class.getName();
  private static final String c = mm.class.getName();
  private static final String d = com.google.android.gms.ads.doubleclick.a.class.getName();
  private static final String e = com.google.android.gms.ads.doubleclick.b.class.getName();
  private static final String f = com.google.android.gms.ads.search.b.class.getName();
  private static final String g = me.class.getName();

  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }

  public static String a(String paramString)
  {
    int i = 0;
    while (i < 2)
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes());
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
        String str = String.format(localLocale, "%032X", arrayOfObject);
        return str;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    return null;
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, d paramd)
  {
    if (paramBoolean)
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext == null)
        localContext = paramContext;
      paramBundle.putString("os", Build.VERSION.RELEASE);
      paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
      paramBundle.putString("appid", localContext.getPackageName());
      if (paramString1 == null)
      {
        int i = oy.c.b(paramContext);
        int j = amj.b;
        paramString1 = 23 + i + "." + j;
      }
      paramBundle.putString("js", paramString1);
    }
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBuilder.appendQueryParameter(str, paramBundle.getString(str));
    }
    paramd.a(localBuilder.toString());
  }

  public static void a(boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(true);
    paramHttpURLConnection.setReadTimeout(60000);
    if (paramString != null)
      paramHttpURLConnection.setRequestProperty("User-Agent", paramString);
    paramHttpURLConnection.setUseCaches(false);
  }

  public static boolean a()
  {
    return Build.DEVICE.startsWith("generic");
  }

  public static int b(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return Math.round(paramInt / paramDisplayMetrics.density);
  }

  public static boolean b()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }

  public static boolean b(Context paramContext)
  {
    return oy.c.a(paramContext) == 0;
  }

  public static boolean c(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation != 2);
    DisplayMetrics localDisplayMetrics;
    do
    {
      return false;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    }
    while ((int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density) >= 600);
    return true;
  }

  public static boolean d(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i;
    int k;
    if (aoq.a(17))
    {
      localDisplay.getRealMetrics(localDisplayMetrics);
      i = localDisplayMetrics.heightPixels;
      k = localDisplayMetrics.widthPixels;
    }
    while (true)
    {
      localDisplay.getMetrics(localDisplayMetrics);
      int m = localDisplayMetrics.heightPixels;
      int n = localDisplayMetrics.widthPixels;
      if ((m != i) || (n != k))
        break;
      return true;
      try
      {
        i = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        int j = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        k = j;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    return false;
  }

  public static int e(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
    if (i > 0)
      return paramContext.getResources().getDimensionPixelSize(i);
    return 0;
  }

  public final int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }

  public final String a(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (localContentResolver == null);
    for (String str = null; ; str = Settings.Secure.getString(localContentResolver, "android_id"))
    {
      if ((str == null) || (a()))
        str = "emulator";
      return a(str);
    }
  }

  public final String a(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int i = 0;
    if (i + 1 < paramArrayOfStackTraceElement.length)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      String str2 = localStackTraceElement.getClassName();
      if ((!"loadAd".equalsIgnoreCase(localStackTraceElement.getMethodName())) || ((!b.equalsIgnoreCase(str2)) && (!c.equalsIgnoreCase(str2)) && (!d.equalsIgnoreCase(str2)) && (!e.equalsIgnoreCase(str2)) && (!f.equalsIgnoreCase(str2)) && (!g.equalsIgnoreCase(str2))));
    }
    for (String str1 = paramArrayOfStackTraceElement[(i + 1)].getClassName(); ; str1 = null)
    {
      if (paramString != null)
      {
        StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ".");
        StringBuilder localStringBuilder = new StringBuilder();
        int j = 2;
        if (localStringTokenizer.hasMoreElements())
        {
          localStringBuilder.append(localStringTokenizer.nextToken());
          while (true)
          {
            int k = j - 1;
            if ((j > 0) && (localStringTokenizer.hasMoreElements()))
            {
              localStringBuilder.append(".").append(localStringTokenizer.nextToken());
              j = k;
              continue;
              i++;
              break;
            }
          }
          paramString = localStringBuilder.toString();
        }
        if ((str1 != null) && (!str1.contains(paramString)))
          return str1;
      }
      return null;
    }
  }

  public final void a(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0)
      return;
    Context localContext = paramViewGroup.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setGravity(17);
    localTextView.setText(paramString);
    localTextView.setTextColor(paramInt1);
    localTextView.setBackgroundColor(paramInt2);
    FrameLayout localFrameLayout = new FrameLayout(localContext);
    localFrameLayout.setBackgroundColor(paramInt1);
    int i = a(localContext, 3);
    localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(paramAdSizeParcel.g - i, paramAdSizeParcel.d - i, 17));
    paramViewGroup.addView(localFrameLayout, paramAdSizeParcel.g, paramAdSizeParcel.d);
  }

  public final void a(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString1, String paramString2)
  {
    e.e(paramString2);
    a(paramViewGroup, paramAdSizeParcel, paramString1, -65536, -16777216);
  }

  public final int b(Context paramContext, int paramInt)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return b(localDisplayMetrics, paramInt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.a
 * JD-Core Version:    0.6.0
 */