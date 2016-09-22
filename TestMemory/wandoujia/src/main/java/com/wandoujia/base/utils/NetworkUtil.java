package com.wandoujia.base.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.conn.util.InetAddressUtils;

public final class NetworkUtil
{
  private static final String ANDROID_HOTSPOT_IP_ADDRESS = "192.168.43.1";
  private static final String IOS_HOTSPOT_IP_ADDRESS = "172.20.10.1";
  public static final String NETWORK_NAME_MOBILE = "mobile";
  public static final String NETWORK_NAME_NONE = "none";
  public static final String NETWORK_NAME_PC = "pc";
  public static final String NETWORK_NAME_WIFI = "wifi";
  public static final int NETWORK_TYPE_MOBILE = 0;
  public static final int NETWORK_TYPE_NONE = -1;
  public static final int NETWORK_TYPE_PC = -2;
  public static final int NETWORK_TYPE_WIFI = 1;
  private static boolean reverseProxyOn = false;

  public static boolean checkWifiIsHotSpot(Context paramContext)
  {
    WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
    if (localWifiManager == null)
      return false;
    DhcpInfo localDhcpInfo = localWifiManager.getDhcpInfo();
    if (localDhcpInfo == null)
      return false;
    InetAddress localInetAddress = intToInetAddress(localDhcpInfo.gateway);
    if (localInetAddress == null)
      return false;
    String str = localInetAddress.getHostAddress();
    return (TextUtils.equals(str, "192.168.43.1")) || (TextUtils.equals(str, "172.20.10.1"));
  }

  public static String getIPAddress(boolean paramBoolean)
  {
    label43: String str1;
    try
    {
      while (true)
      {
        Iterator localIterator1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        break label43;
        while (true)
          if (localIterator1.hasNext())
          {
            Iterator localIterator2 = Collections.list(((NetworkInterface)localIterator1.next()).getInetAddresses()).iterator();
            if (!localIterator2.hasNext())
              continue;
            InetAddress localInetAddress = (InetAddress)localIterator2.next();
            if (localInetAddress.isLoopbackAddress())
              break;
            str1 = localInetAddress.getHostAddress().toUpperCase();
            boolean bool = InetAddressUtils.isIPv4Address(str1);
            if (paramBoolean)
            {
              if (!bool)
                break;
              return str1;
            }
            if (bool)
              break;
            int i = str1.indexOf('%');
            if (i < 0)
              break label133;
            String str2 = str1.substring(0, i);
            return str2;
          }
      }
    }
    catch (Exception localException)
    {
      str1 = "";
    }
    label133: return str1;
  }

  public static String getISP(Context paramContext)
  {
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager == null)
        return "unknown";
      String str = localTelephonyManager.getNetworkOperatorName();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "unknown";
  }

  public static NetworkInfo getNetworkInfo(Context paramContext)
  {
    return ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
  }

  public static int getNetworkType()
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)GlobalConfig.getAppContext().getSystemService("connectivity");
    try
    {
      NetworkInfo localNetworkInfo1 = localConnectivityManager.getNetworkInfo(1);
      if ((localNetworkInfo1 != null) && (localNetworkInfo1.isConnected()))
        return 1;
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(0);
      if ((localNetworkInfo2 != null) && (localNetworkInfo2.isConnected()))
        return 0;
      NetworkInfo localNetworkInfo3 = localConnectivityManager.getActiveNetworkInfo();
      return parseNetworkType(localNetworkInfo3);
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return -1;
  }

  public static int[] getNetworkTypeInfo(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int[] arrayOfInt = { -1, 0 };
    if (localConnectivityManager == null)
      return arrayOfInt;
    try
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
      {
        if (!reverseProxyOn)
          break label111;
        arrayOfInt[0] = -2;
        break label111;
      }
      if ((localNetworkInfo.getType() == 1) && (localNetworkInfo.isConnected()))
      {
        arrayOfInt[0] = 1;
        return arrayOfInt;
      }
      if ((localNetworkInfo.getType() == 0) && (localNetworkInfo.isConnected()))
      {
        arrayOfInt[0] = 0;
        arrayOfInt[1] = localNetworkInfo.getSubtype();
        return arrayOfInt;
      }
    }
    catch (Exception localException)
    {
      return arrayOfInt;
    }
    return arrayOfInt;
    label111: return arrayOfInt;
  }

  private static String getNetworkTypeName(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "UNKNOWN";
    case 1:
      return "GPRS";
    case 2:
      return "EDGE";
    case 3:
      return "UMTS";
    case 8:
      return "HSDPA";
    case 9:
      return "HSUPA";
    case 10:
      return "HSPA";
    case 4:
      return "CDMA";
    case 5:
      return "CDMA - EvDo rev. 0";
    case 6:
      return "CDMA - EvDo rev. A";
    case 12:
      return "CDMA - EvDo rev. B";
    case 7:
      return "CDMA - 1xRTT";
    case 13:
      return "LTE";
    case 14:
      return "CDMA - eHRPD";
    case 11:
      return "iDEN";
    case 15:
    }
    return "HSPA+";
  }

  public static String getNetworkTypeName(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return null;
    try
    {
      String str = getNetworkTypeName(paramContext, localConnectivityManager.getActiveNetworkInfo());
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String getNetworkTypeName(Context paramContext, NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null)
    {
      if (reverseProxyOn)
        return "PC";
    }
    else
    {
      if (paramNetworkInfo.getType() == 0)
        return getNetworkTypeName(((TelephonyManager)paramContext.getSystemService("phone")).getNetworkType());
      return "WIFI";
    }
    return "NONE";
  }

  private static InetAddress intToInetAddress(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(paramInt & 0xFF);
    arrayOfByte[1] = (byte)(0xFF & paramInt >> 8);
    arrayOfByte[2] = (byte)(0xFF & paramInt >> 16);
    arrayOfByte[3] = (byte)(0xFF & paramInt >> 24);
    try
    {
      InetAddress localInetAddress = InetAddress.getByAddress(arrayOfByte);
      return localInetAddress;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean isMobileNetworkConnected(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getNetworkInfo(0);
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }

  public static boolean isNetworkConnected()
  {
    if (reverseProxyOn);
    do
      return true;
    while (getNetworkType() != -1);
    return false;
  }

  public static boolean isNetworkConnected(Context paramContext)
  {
    return isNetworkConnected();
  }

  public static boolean isReverseProxyOn()
  {
    return reverseProxyOn;
  }

  public static boolean isWifiConnected(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return false;
    try
    {
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(1);
      localNetworkInfo1 = localNetworkInfo2;
      if ((localNetworkInfo1 != null) && (localNetworkInfo1.isConnected()))
        return true;
    }
    catch (Exception localException)
    {
      while (true)
        NetworkInfo localNetworkInfo1 = null;
    }
    return false;
  }

  public static int parseNetworkType(NetworkInfo paramNetworkInfo)
  {
    int i = 1;
    if ((paramNetworkInfo == null) || (!paramNetworkInfo.isConnected()))
      i = -1;
    do
      return i;
    while (paramNetworkInfo.getType() == i);
    return 0;
  }

  public static void setUsbReverseProxyState(boolean paramBoolean)
  {
    reverseProxyOn = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.NetworkUtil
 * JD-Core Version:    0.6.0
 */