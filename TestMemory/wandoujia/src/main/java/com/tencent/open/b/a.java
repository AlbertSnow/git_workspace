package com.tencent.open.b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.tencent.open.a.f;

public final class a
{
  private static Uri a = Uri.parse("content://telephony/carriers/preferapn");

  public static String a(Context paramContext)
  {
    int i = e(paramContext);
    String str;
    if (i == 2)
      str = "wifi";
    do
    {
      return str;
      if (i == 1)
        return "cmwap";
      if (i == 4)
        return "cmnet";
      if (i == 16)
        return "uniwap";
      if (i == 8)
        return "uninet";
      if (i == 64)
        return "wap";
      if (i == 32)
        return "net";
      if (i == 512)
        return "ctwap";
      if (i == 256)
        return "ctnet";
      if (i == 2048)
        return "3gnet";
      if (i == 1024)
        return "3gwap";
      str = b(paramContext);
    }
    while ((str != null) && (str.length() != 0));
    return "none";
  }

  public static String b(Context paramContext)
  {
    String str;
    try
    {
      Cursor localCursor = paramContext.getContentResolver().query(a, null, null, null, null);
      if (localCursor == null)
        return null;
      localCursor.moveToFirst();
      if (localCursor.isAfterLast())
      {
        if (localCursor == null)
          break label138;
        localCursor.close();
        break label138;
      }
      str = localCursor.getString(localCursor.getColumnIndex("apn"));
      if (localCursor != null)
      {
        localCursor.close();
        return str;
      }
    }
    catch (SecurityException localSecurityException)
    {
      f.e("openSDK_LOG.APNUtil", "getApn has exception: " + localSecurityException.getMessage());
      return "";
    }
    catch (Exception localException)
    {
      while (true)
        f.e("openSDK_LOG.APNUtil", "getApn has exception: " + localException.getMessage());
    }
    return str;
    label138: return null;
  }

  public static String c(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return "MOBILE";
    NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo != null)
      return localNetworkInfo.getTypeName();
    return "MOBILE";
  }

  private static String d(Context paramContext)
  {
    String str;
    try
    {
      Cursor localCursor = paramContext.getContentResolver().query(a, null, null, null, null);
      if (localCursor == null)
        return null;
      localCursor.moveToFirst();
      if (localCursor.isAfterLast())
      {
        if (localCursor == null)
          break label107;
        localCursor.close();
        break label107;
      }
      str = localCursor.getString(localCursor.getColumnIndex("proxy"));
      if (localCursor != null)
      {
        localCursor.close();
        return str;
      }
    }
    catch (SecurityException localSecurityException)
    {
      f.e("openSDK_LOG.APNUtil", "getApnProxy has exception: " + localSecurityException.getMessage());
      str = "";
    }
    return str;
    label107: return null;
  }

  private static int e(Context paramContext)
  {
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager == null)
        return 128;
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return 128;
      if (localNetworkInfo.getTypeName().toUpperCase().equals("WIFI"))
        return 2;
      String str1 = localNetworkInfo.getExtraInfo().toLowerCase();
      if (str1.startsWith("cmwap"))
        return 1;
      if ((str1.startsWith("cmnet")) || (str1.startsWith("epc.tmobile.com")))
        break label270;
      if (str1.startsWith("uniwap"))
        return 16;
      if (str1.startsWith("uninet"))
        return 8;
      if (str1.startsWith("wap"))
        return 64;
      if (str1.startsWith("net"))
        return 32;
      if (str1.startsWith("ctwap"))
        return 512;
      if (str1.startsWith("ctnet"))
        return 256;
      if (str1.startsWith("3gwap"))
        return 1024;
      if (str1.startsWith("3gnet"))
        return 2048;
      if (str1.startsWith("#777"))
      {
        String str2 = d(paramContext);
        if (str2 != null)
        {
          int i = str2.length();
          if (i > 0)
            return 512;
        }
        return 256;
      }
    }
    catch (Exception localException)
    {
      f.e("openSDK_LOG.APNUtil", "getMProxyType has exception: " + localException.getMessage());
    }
    return 128;
    label270: return 4;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.a
 * JD-Core Version:    0.6.0
 */