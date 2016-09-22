package com.google.android.gms.analytics.internal;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.google.android.gms.internal.ah;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class m
{
  static
  {
    new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
  }

  public static ah a(g paramg, String paramString)
  {
    d.a(paramg);
    if (TextUtils.isEmpty(paramString))
      return null;
    HashMap localHashMap;
    try
    {
      List localList = URLEncodedUtils.parse(new URI("?" + paramString), "UTF-8");
      localHashMap = new HashMap(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
        localHashMap.put(localNameValuePair.getName(), localNameValuePair.getValue());
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      paramg.d("No valid campaign data found", localURISyntaxException);
      return null;
    }
    ah localah = new ah();
    localah.e((String)localHashMap.get("utm_content"));
    localah.c((String)localHashMap.get("utm_medium"));
    localah.a((String)localHashMap.get("utm_campaign"));
    localah.b((String)localHashMap.get("utm_source"));
    localah.d((String)localHashMap.get("utm_term"));
    localah.f((String)localHashMap.get("utm_id"));
    localah.g((String)localHashMap.get("anid"));
    localah.h((String)localHashMap.get("gclid"));
    localah.i((String)localHashMap.get("dclid"));
    localah.j((String)localHashMap.get("aclid"));
    return localah;
  }

  public static String a(Locale paramLocale)
  {
    if (paramLocale == null);
    String str;
    do
    {
      return null;
      str = paramLocale.getLanguage();
    }
    while (TextUtils.isEmpty(str));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str.toLowerCase());
    if (!TextUtils.isEmpty(paramLocale.getCountry()))
      localStringBuilder.append("-").append(paramLocale.getCountry().toLowerCase());
    return localStringBuilder.toString();
  }

  public static Map<String, String> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = paramString.split("&");
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String[] arrayOfString2 = arrayOfString1[j].split("=", 3);
      Object localObject1;
      label65: Object localObject2;
      if (arrayOfString2.length > 1)
      {
        String str1 = arrayOfString2[0];
        if (TextUtils.isEmpty(arrayOfString2[1]))
        {
          localObject1 = null;
          localHashMap.put(str1, localObject1);
          if ((arrayOfString2.length == 3) && (!TextUtils.isEmpty(arrayOfString2[1])) && (!localHashMap.containsKey(arrayOfString2[1])))
          {
            String str2 = arrayOfString2[1];
            if (!TextUtils.isEmpty(arrayOfString2[2]))
              break label151;
            localObject2 = null;
            label125: localHashMap.put(str2, localObject2);
          }
        }
      }
      while (true)
      {
        j++;
        break;
        localObject1 = arrayOfString2[1];
        break label65;
        label151: localObject2 = arrayOfString2[2];
        break label125;
        if ((arrayOfString2.length != 1) || (arrayOfString2[0].length() == 0))
          continue;
        localHashMap.put(arrayOfString2[0], null);
      }
    }
    return (Map<String, String>)(Map<String, String>)localHashMap;
  }

  public static void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (!paramMap.containsKey(paramString1)))
      paramMap.put(paramString1, paramString2);
  }

  public static void a(Map<String, String> paramMap1, String paramString, Map<String, String> paramMap2)
  {
    a(paramMap1, paramString, (String)paramMap2.get(paramString));
  }

  public static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (!paramMap.containsKey(paramString))
      if (!paramBoolean)
        break label27;
    label27: for (String str = "1"; ; str = "0")
    {
      paramMap.put(paramString, str);
      return;
    }
  }

  public static boolean a(double paramDouble, String paramString)
  {
    int i = 1;
    if ((paramDouble <= 0.0D) || (paramDouble >= 100.0D))
      i = 0;
    int j;
    do
    {
      return i;
      if (!TextUtils.isEmpty(paramString))
      {
        int k = -1 + paramString.length();
        j = 0;
        while (k >= 0)
        {
          int m = paramString.charAt(k);
          j = m + (0xFFFFFFF & j << 6) + (m << 14);
          int n = 0xFE00000 & j;
          if (n != 0)
            j ^= n >> 21;
          k--;
        }
      }
      j = i;
    }
    while (j % 10000 >= 100.0D * paramDouble);
    return false;
  }

  public static boolean a(Context paramContext, Class<? extends Service> paramClass)
  {
    try
    {
      ServiceInfo localServiceInfo = paramContext.getPackageManager().getServiceInfo(new ComponentName(paramContext, paramClass), 4);
      if (localServiceInfo != null)
      {
        boolean bool = localServiceInfo.enabled;
        if (bool)
          return true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static boolean a(Context paramContext, Class<? extends BroadcastReceiver> paramClass, boolean paramBoolean)
  {
    try
    {
      ActivityInfo localActivityInfo = paramContext.getPackageManager().getReceiverInfo(new ComponentName(paramContext, paramClass), 2);
      if ((localActivityInfo != null) && (localActivityInfo.enabled))
        if (paramBoolean)
        {
          boolean bool = localActivityInfo.exported;
          if (!bool);
        }
        else
        {
          return true;
        }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static double b(String paramString)
  {
    if (paramString == null)
      return 100.0D;
    try
    {
      double d = Double.parseDouble(paramString);
      return d;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 100.0D;
  }

  public static void b(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (TextUtils.isEmpty((CharSequence)paramMap.get(paramString1))))
      paramMap.put(paramString1, paramString2);
  }

  public static long c(String paramString)
  {
    if (paramString == null)
      return 0L;
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0L;
  }

  public static boolean d(String paramString)
  {
    if ((paramString == null) || (paramString.equalsIgnoreCase("true")) || (paramString.equalsIgnoreCase("yes")) || (paramString.equalsIgnoreCase("1")));
    do
      return true;
    while ((!paramString.equalsIgnoreCase("false")) && (!paramString.equalsIgnoreCase("no")) && (!paramString.equalsIgnoreCase("0")));
    return false;
  }

  public static String e(String paramString)
  {
    int i = 0;
    if (TextUtils.isEmpty(paramString))
      return null;
    if (paramString.contains("?"))
    {
      String[] arrayOfString2 = paramString.split("[\\?]");
      if (arrayOfString2.length > 1)
        paramString = arrayOfString2[1];
    }
    if (paramString.contains("%3D"));
    try
    {
      String str = URLDecoder.decode(paramString, "UTF-8");
      paramString = str;
      StringBuilder localStringBuilder;
      while (true)
      {
        Map localMap = a(paramString);
        String[] arrayOfString1 = { "dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t" };
        localStringBuilder = new StringBuilder();
        while (true)
          if (i < 11)
          {
            if (!TextUtils.isEmpty((CharSequence)localMap.get(arrayOfString1[i])))
            {
              if (localStringBuilder.length() > 0)
                localStringBuilder.append("&");
              localStringBuilder.append(arrayOfString1[i]).append("=").append((String)localMap.get(arrayOfString1[i]));
            }
            i++;
            continue;
            if (paramString.contains("="))
              break;
            return null;
          }
      }
      return localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  public static MessageDigest f(String paramString)
  {
    int i = 0;
    while (i < 2)
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null)
          return localMessageDigest;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    return null;
  }

  public static boolean g(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return true;
    while (!paramString.startsWith("http:"));
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.m
 * JD-Core Version:    0.6.0
 */