package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

@a
public final class r
{
  private static boolean a(Context paramContext, Intent paramIntent, bc parambc)
  {
    try
    {
      String str1 = String.valueOf(paramIntent.toURI());
      if (str1.length() != 0);
      for (String str2 = "Launching an intent: ".concat(str1); ; str2 = new String("Launching an intent: "))
      {
        c.a(str2);
        y.a(paramContext, paramIntent);
        if (parambc == null)
          break;
        parambc.f();
        break;
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      c.e(localActivityNotFoundException.getMessage());
      return false;
    }
    return true;
  }

  public final boolean a(Context paramContext, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, bc parambc)
  {
    if (paramAdLauncherIntentInfoParcel == null)
    {
      c.e("No intent data for launcher overlay.");
      return false;
    }
    if (paramAdLauncherIntentInfoParcel.i != null)
      return a(paramContext, paramAdLauncherIntentInfoParcel.i, parambc);
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.c))
    {
      c.e("Open GMSG did not contain a URL.");
      return false;
    }
    String[] arrayOfString;
    String str2;
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.d))
    {
      localIntent.setDataAndType(Uri.parse(paramAdLauncherIntentInfoParcel.c), paramAdLauncherIntentInfoParcel.d);
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.e))
        localIntent.setPackage(paramAdLauncherIntentInfoParcel.e);
      if (TextUtils.isEmpty(paramAdLauncherIntentInfoParcel.f))
        break label215;
      arrayOfString = paramAdLauncherIntentInfoParcel.f.split("/", 2);
      if (arrayOfString.length >= 2)
        break label201;
      str2 = String.valueOf(paramAdLauncherIntentInfoParcel.f);
      if (str2.length() == 0)
        break label187;
    }
    label187: for (String str3 = "Could not parse component name from open GMSG: ".concat(str2); ; str3 = new String("Could not parse component name from open GMSG: "))
    {
      c.e(str3);
      return false;
      localIntent.setData(Uri.parse(paramAdLauncherIntentInfoParcel.c));
      break;
    }
    label201: localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    label215: String str1 = paramAdLauncherIntentInfoParcel.g;
    if (!TextUtils.isEmpty(str1));
    try
    {
      int j = Integer.parseInt(str1);
      i = j;
      localIntent.addFlags(i);
      return a(paramContext, localIntent, parambc);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        c.e("Could not parse intent flags.");
        int i = 0;
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.r
 * JD-Core Version:    0.6.0
 */