package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  private static int a = -1;
  private static final Object b = new Object();
  private static String c = null;
  private static Integer d = null;

  static
  {
    new AtomicBoolean();
  }

  @Deprecated
  public static int a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
      label16: if (!"com.google.android.gms".equals(paramContext.getPackageName()))
      {
        Integer localInteger;
        while (true)
        {
          synchronized (b)
          {
            if (c == null)
            {
              c = paramContext.getPackageName();
              try
              {
                Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
                if (localBundle == null)
                  continue;
                d = Integer.valueOf(localBundle.getInt("com.google.android.gms.version"));
                localInteger = d;
                if (localInteger != null)
                  break;
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                d = null;
                continue;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException4)
              {
                Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException4);
                continue;
              }
            }
          }
          if (c.equals(paramContext.getPackageName()))
            continue;
          throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + c + "' and this call used package '" + paramContext.getPackageName() + "'.");
        }
        if (localInteger.intValue() != 7571000)
          throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7571000 but found " + localInteger + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
      PackageInfo localPackageInfo;
      while (true)
      {
        try
        {
          localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          ib.a();
          if (localPackageInfo.versionCode % 1000 / 100 == 3)
          {
            i = 1;
            if ((i == 0) && (!b.C(paramContext)))
              break;
            if (ib.a(localPackageInfo, dj.a) != null)
              break label345;
            return 9;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          return 1;
        }
        int i = 0;
      }
      label345: 
      do
      {
        try
        {
          e locale1 = ib.a(localPackageManager.getPackageInfo("com.android.vending", 64), dj.a);
          if (locale1 == null)
            break;
          e locale2 = ib.a(localPackageInfo, new e[] { locale1 });
          if (locale2 == null)
            break;
          if (localPackageInfo.versionCode / 1000 >= 7571)
            break label405;
          new StringBuilder("Google Play services out of date.  Requires 7571000 but found ").append(localPackageInfo.versionCode);
          return 2;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException3)
        {
        }
        if (!a(paramContext, "com.android.vending"))
          break;
      }
      while (ib.a(localPackageInfo, dj.a) != null);
      return 9;
      label405: Object localObject1 = localPackageInfo.applicationInfo;
      if (localObject1 == null);
      try
      {
        ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
        localObject1 = localApplicationInfo;
        if (!((ApplicationInfo)localObject1).enabled)
          return 3;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
        return 1;
      }
      return 0;
    }
    catch (Throwable localThrowable)
    {
      break label16;
    }
  }

  public static boolean a(int paramInt)
  {
    if (a(paramInt, "com.google.android.gms"))
    {
      PackageManager localPackageManager = null.getPackageManager();
      ib.a();
      if (ib.a(localPackageManager, "com.google.android.gms"))
        return true;
    }
    return false;
  }

  public static boolean a(int paramInt, Activity paramActivity, Fragment paramFragment, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog localAlertDialog;
    if (paramInt == 0)
    {
      localAlertDialog = null;
      if (localAlertDialog == null)
        return false;
    }
    else
    {
      if ((b.C(paramActivity)) && (paramInt == 2))
        paramInt = 42;
      if (!b.o())
        break label630;
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId)))
        break label630;
    }
    label151: label210: label630: for (AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity, 5); ; localBuilder = null)
    {
      if (localBuilder == null)
        localBuilder = new AlertDialog.Builder(paramActivity);
      localBuilder.setMessage(b.a(paramActivity, paramInt, d(paramActivity)));
      if (paramOnCancelListener != null)
        localBuilder.setOnCancelListener(paramOnCancelListener);
      Intent localIntent = c(paramInt);
      com.google.android.gms.common.internal.e locale;
      Resources localResources1;
      String str;
      Resources localResources2;
      Object localObject;
      if (paramFragment == null)
      {
        locale = new com.google.android.gms.common.internal.e(paramActivity, localIntent);
        localResources1 = paramActivity.getResources();
        switch (paramInt)
        {
        default:
          str = localResources1.getString(17039370);
          if (str != null)
            localBuilder.setPositiveButton(str, locale);
          localResources2 = paramActivity.getResources();
          localObject = null;
          switch (paramInt)
          {
          case 4:
          case 6:
          case 8:
          case 10:
          case 11:
          case 16:
          default:
          case 1:
          case 3:
          case 18:
          case 2:
          case 42:
          case 9:
          case 7:
          case 5:
          case 17:
          }
        case 1:
        case 3:
        case 2:
        case 42:
        }
      }
      while (true)
      {
        if (localObject != null)
          localBuilder.setTitle((CharSequence)localObject);
        localAlertDialog = localBuilder.create();
        break;
        locale = new com.google.android.gms.common.internal.e(paramFragment, localIntent);
        break label151;
        str = localResources1.getString(R.string.common_google_play_services_install_button);
        break label210;
        str = localResources1.getString(R.string.common_google_play_services_enable_button);
        break label210;
        str = localResources1.getString(R.string.common_google_play_services_update_button);
        break label210;
        localObject = localResources2.getString(R.string.common_google_play_services_install_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_enable_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_updating_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_update_title);
        continue;
        localObject = localResources2.getString(R.string.common_android_wear_update_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_unsupported_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_network_error_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_invalid_account_title);
        continue;
        localObject = localResources2.getString(R.string.common_google_play_services_sign_in_failed_title);
      }
      if ((paramActivity instanceof FragmentActivity))
      {
        q localq = ((FragmentActivity)paramActivity).getSupportFragmentManager();
        SupportErrorDialogFragment.a(localAlertDialog, paramOnCancelListener).show(localq, "GooglePlayServicesErrorDialog");
      }
      while (true)
      {
        return true;
        if (!b.n())
          break;
        FragmentManager localFragmentManager = paramActivity.getFragmentManager();
        ErrorDialogFragment.a(localAlertDialog, paramOnCancelListener).show(localFragmentManager, "GooglePlayServicesErrorDialog");
      }
      throw new RuntimeException("This Activity does not support Fragments.");
    }
  }

  private static boolean a(int paramInt, String paramString)
  {
    AppOpsManager localAppOpsManager;
    if (b.p())
      localAppOpsManager = (AppOpsManager)null.getSystemService("appops");
    try
    {
      localAppOpsManager.checkPackage(paramInt, paramString);
      int i = 1;
      String[] arrayOfString;
      do
      {
        return i;
        arrayOfString = null.getPackageManager().getPackagesForUid(paramInt);
        i = 0;
      }
      while (arrayOfString == null);
      for (int j = 0; ; j++)
      {
        int k = arrayOfString.length;
        i = 0;
        if (j >= k)
          break;
        if (paramString.equals(arrayOfString[j]))
          return true;
      }
    }
    catch (SecurityException localSecurityException)
    {
    }
    return false;
  }

  private static boolean a(Context paramContext, String paramString)
  {
    if (b.q())
    {
      Iterator localIterator = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!paramString.equals(((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName()));
      return true;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      boolean bool = localPackageManager.getApplicationInfo(paramString, 8192).enabled;
      if (bool)
        return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static boolean a(PackageManager paramPackageManager)
  {
    return (b(paramPackageManager)) || (!"user".equals(Build.TYPE));
  }

  @Deprecated
  public static void b(Context paramContext)
  {
    int i = a(paramContext);
    if (i != 0)
    {
      Intent localIntent = c(i);
      if (localIntent == null)
        throw new GooglePlayServicesNotAvailableException(i);
      throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", localIntent);
    }
  }

  @Deprecated
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 9:
    }
    return true;
  }

  private static boolean b(PackageManager paramPackageManager)
  {
    synchronized (b)
    {
      int i = a;
      if (i == -1);
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
        ib.a();
        e[] arrayOfe = new e[1];
        arrayOfe[0] = d.a[1];
        if (ib.a(localPackageInfo, arrayOfe) != null)
          a = 1;
        while (a != 0)
        {
          return true;
          a = 0;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          a = 0;
      }
    }
    return false;
  }

  public static Context c(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  @Deprecated
  private static Intent c(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    case 2:
      return l.b("com.google.android.gms");
    case 42:
      return l.a();
    case 3:
    }
    return l.a("com.google.android.gms");
  }

  private static String d(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    PackageManager localPackageManager;
    if (TextUtils.isEmpty(str))
    {
      str = paramContext.getPackageName();
      localPackageManager = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 != null)
        str = localPackageManager.getApplicationLabel(localApplicationInfo1).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.6.0
 */