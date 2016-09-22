package com.unipay.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static Pattern a = Pattern.compile("((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|([1-9]\\d)|\\d)(\\.((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|([1-9]\\d)|\\d)){3}");

  public static String a()
  {
    try
    {
      while (true)
      {
        Enumeration localEnumeration1 = NetworkInterface.getNetworkInterfaces();
        while (true)
          if (localEnumeration1.hasMoreElements())
          {
            Enumeration localEnumeration2 = ((NetworkInterface)localEnumeration1.nextElement()).getInetAddresses();
            if (!localEnumeration2.hasMoreElements())
              continue;
            InetAddress localInetAddress = (InetAddress)localEnumeration2.nextElement();
            if (localInetAddress.isLoopbackAddress())
              break;
            String str = localInetAddress.getHostAddress().toString();
            boolean bool = a.matcher(str).matches();
            if (!bool)
              break;
            return str;
          }
      }
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static String a(Context paramContext)
  {
    return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
  }

  public static boolean a(int paramInt)
  {
    String str = d(paramInt);
    return (!TextUtils.isEmpty(str)) && ((str.contains("46001")) || (str.contains("46006")));
  }

  public static boolean a(String paramString)
  {
    if (paramString.length() != 36)
      return false;
    byte[] arrayOfByte = paramString.getBytes();
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfByte.length)
        break label78;
      if (((arrayOfByte[i] < 48) || (arrayOfByte[i] > 57)) && ((arrayOfByte[i] < 97) || (arrayOfByte[i] > 122)) && ((arrayOfByte[i] < 65) || (arrayOfByte[i] > 90)))
        break;
    }
    label78: return true;
  }

  public static String b(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo != null)
    {
      if (localNetworkInfo.getType() == 1)
        return "wifi";
      if (localNetworkInfo.getType() == 0)
      {
        switch (localNetworkInfo.getSubtype())
        {
        default:
          return "unknow";
        case 3:
          return "UMTS";
        case 5:
        case 6:
        case 8:
          return "EVDO";
        case 4:
          return "CDMA";
        case 1:
          return "GPRS";
        case 2:
          return "EDGE";
        case 7:
          return "1xRTT";
        case 10:
          return "HSPA";
        case 9:
          return "HSUPA";
        case 11:
        }
        return "IDEN";
      }
      return "unknow";
    }
    return "无网络";
  }

  public static String b(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    String str = "";
    int i = 0;
    if (i < arrayOfByte.length)
    {
      if ((arrayOfByte[i] >= 48) && (arrayOfByte[i] <= 57))
        str = str + arrayOfByte[i];
      while (true)
      {
        i++;
        break;
        if ((arrayOfByte[i] >= 97) && (arrayOfByte[i] <= 122))
        {
          str = str + arrayOfByte[i];
          continue;
        }
        if ((arrayOfByte[i] < 65) || (arrayOfByte[i] > 90))
          continue;
        str = str + arrayOfByte[i];
      }
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    return str + localSimpleDateFormat.format(new Date());
  }

  public static boolean b(int paramInt)
  {
    String str = d(paramInt);
    return (!TextUtils.isEmpty(str)) && ((str.contains("46003")) || (str.contains("46005")));
  }

  public static String c(int paramInt)
  {
    String str1;
    if (paramInt == 1)
      str1 = "iphonesubinfo2";
    try
    {
      Object localObject1;
      while (true)
      {
        Method localMethod1 = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", new Class[] { String.class });
        localMethod1.setAccessible(true);
        localObject1 = localMethod1.invoke(null, new Object[] { str1 });
        if ((localObject1 == null) && (paramInt == 1))
        {
          Object localObject3 = localMethod1.invoke(null, new Object[] { "iphonesubinfo1" });
          localObject1 = localObject3;
        }
        if (localObject1 != null)
          break;
        return null;
        str1 = "iphonesubinfo";
      }
      Method localMethod2 = Class.forName("com.android.internal.telephony.IPhoneSubInfo$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class });
      localMethod2.setAccessible(true);
      Object localObject2 = localMethod2.invoke(null, new Object[] { localObject1 });
      String str2 = (String)localObject2.getClass().getMethod("getSubscriberId", new Class[0]).invoke(localObject2, new Object[0]);
      return str2;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String c(Context paramContext)
  {
    String str = d(0);
    if (str == null)
      str = "";
    if (str.equals(""))
      str = d(1);
    if (str == null)
      str = "";
    if (str.equals(""))
      str = d(paramContext);
    return str;
  }

  public static boolean c(String paramString)
  {
    return ((paramString.contains("46001")) || (paramString.contains("46006"))) && (!TextUtils.isEmpty(paramString));
  }

  private static String d(int paramInt)
  {
    String str1;
    if (paramInt == 1)
      str1 = "iphonesubinfo2";
    try
    {
      Method localMethod1 = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", new Class[] { String.class });
      localMethod1.setAccessible(true);
      Object localObject1 = localMethod1.invoke(null, new Object[] { str1 });
      if ((localObject1 == null) && (paramInt == 1))
      {
        Object localObject3 = localMethod1.invoke(null, new Object[] { "iphonesubinfo1" });
        localObject1 = localObject3;
      }
      String str2;
      if (localObject1 == null)
        str2 = null;
      do
      {
        return str2;
        str1 = "iphonesubinfo";
        break;
        Method localMethod2 = Class.forName("com.android.internal.telephony.IPhoneSubInfo$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class });
        localMethod2.setAccessible(true);
        Object localObject2 = localMethod2.invoke(null, new Object[] { localObject1 });
        str2 = (String)localObject2.getClass().getMethod("getSubscriberId", new Class[0]).invoke(localObject2, new Object[0]);
        if (str2 == null)
          str2 = "";
        if (str2.length() > 15)
          return str2.substring(0, 15);
      }
      while (str2.length() >= 15);
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < 15 - str2.length(); i++)
        localStringBuffer.append("0");
      String str3 = str2 + localStringBuffer.toString();
      return str3;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static final String d(Context paramContext)
  {
    int i = 0;
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
    if (str == null)
      str = "";
    if (str.length() > 15)
      str = str.substring(0, 15);
    while (true)
    {
      if (str == null)
        str = "";
      return str;
      if (str.length() >= 15)
        continue;
      StringBuffer localStringBuffer = new StringBuffer();
      while (i < 15 - str.length())
      {
        localStringBuffer.append("0");
        i++;
      }
      str = str + localStringBuffer.toString();
    }
  }

  public static boolean d(String paramString)
  {
    return ((paramString.contains("46003")) || (paramString.contains("46005"))) && (!TextUtils.isEmpty(paramString));
  }

  public static final String e(Context paramContext)
  {
    String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    if (str == null)
      str = "";
    return str;
  }

  public static final String f(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }

  public static boolean g(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isAvailable());
  }

  public static String h(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    String str;
    if (localNetworkInfo != null)
    {
      str = localNetworkInfo.getExtraInfo();
      if (str != null);
    }
    else
    {
      str = "手机未取到网络信息";
    }
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.tools.b
 * JD-Core Version:    0.6.0
 */