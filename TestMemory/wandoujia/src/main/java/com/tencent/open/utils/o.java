package com.tencent.open.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.b;
import com.tencent.open.a.f;
import com.tencent.open.b.a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class o
{
  private static String a = "";
  private static String b = "";

  private static char a(int paramInt)
  {
    int i = paramInt & 0xF;
    if (i < 10)
      return (char)(i + 48);
    return (char)(97 + (i - 10));
  }

  public static Bundle a(String paramString)
  {
    int i = 0;
    Bundle localBundle = new Bundle();
    if (paramString != null)
      try
      {
        String[] arrayOfString1 = paramString.split("&");
        int j = arrayOfString1.length;
        while (i < j)
        {
          String[] arrayOfString2 = arrayOfString1[i].split("=");
          if (arrayOfString2.length == 2)
            localBundle.putString(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
          i++;
        }
      }
      catch (Exception localException)
      {
        localBundle = null;
      }
    return localBundle;
  }

  public static Bundle a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return a(paramString1, paramString3, paramString4, paramString2, paramString5, paramString6, "", "", "", "", "", "");
  }

  public static Bundle a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("platform", "1");
    localBundle.putString("result", paramString1);
    localBundle.putString("code", paramString2);
    localBundle.putString("tmcost", paramString3);
    localBundle.putString("rate", paramString4);
    localBundle.putString("cmd", paramString5);
    localBundle.putString("uin", paramString6);
    localBundle.putString("appid", paramString7);
    localBundle.putString("share_type", paramString8);
    localBundle.putString("detail", paramString9);
    localBundle.putString("os_ver", Build.VERSION.RELEASE);
    localBundle.putString("network", a.a(b.t()));
    localBundle.putString("apn", a.b(b.t()));
    localBundle.putString("model_name", Build.MODEL);
    localBundle.putString("sdk_ver", "2.9.4");
    localBundle.putString("packagename", b.u());
    localBundle.putString("app_ver", c(b.t(), b.u()));
    return localBundle;
  }

  public static Bundle a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("openid", paramString1);
    localBundle.putString("report_type", paramString2);
    localBundle.putString("act_type", paramString3);
    localBundle.putString("via", paramString4);
    localBundle.putString("app_id", paramString5);
    localBundle.putString("result", paramString6);
    localBundle.putString("type", paramString7);
    localBundle.putString("login_status", paramString8);
    localBundle.putString("need_user_auth", paramString9);
    localBundle.putString("to_uin", paramString10);
    localBundle.putString("call_source", paramString11);
    localBundle.putString("to_type", paramString12);
    return localBundle;
  }

  public static String a(Bundle paramBundle)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    String str;
    label85: String[] arrayOfString;
    int j;
    while (true)
    {
      if (!localIterator.hasNext())
        break label261;
      str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((!(localObject instanceof String)) && (!(localObject instanceof String[])))
        continue;
      if (!(localObject instanceof String[]))
        break label202;
      if (i != 0)
      {
        i = 0;
        localStringBuilder.append(URLEncoder.encode(str) + "=");
        arrayOfString = paramBundle.getStringArray(str);
        if (arrayOfString == null)
          continue;
        j = 0;
        label129: if (j >= arrayOfString.length)
          break;
        if (j != 0)
          break label171;
        localStringBuilder.append(URLEncoder.encode(arrayOfString[j]));
      }
    }
    while (true)
    {
      j++;
      break label129;
      break;
      localStringBuilder.append("&");
      break label85;
      label171: localStringBuilder.append(URLEncoder.encode("," + arrayOfString[j]));
    }
    label202: if (i != 0)
      i = 0;
    while (true)
    {
      localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
      break;
      localStringBuilder.append("&");
    }
    label261: return localStringBuilder.toString();
  }

  // ERROR //
  public static final String a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokestatic 200	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +8 -> 14
    //   9: ldc 11
    //   11: astore_0
    //   12: aload_0
    //   13: areturn
    //   14: ldc 202
    //   16: astore_3
    //   17: aconst_null
    //   18: invokestatic 200	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   21: ifne +5 -> 26
    //   24: aconst_null
    //   25: astore_3
    //   26: aload_0
    //   27: aload_3
    //   28: invokevirtual 206	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   31: arraylength
    //   32: iload_1
    //   33: if_icmple -21 -> 12
    //   36: iconst_0
    //   37: istore 5
    //   39: iload_2
    //   40: aload_0
    //   41: invokevirtual 210	java/lang/String:length	()I
    //   44: if_icmpge -32 -> 12
    //   47: aload_0
    //   48: iload_2
    //   49: iload_2
    //   50: iconst_1
    //   51: iadd
    //   52: invokevirtual 214	java/lang/String:substring	(II)Ljava/lang/String;
    //   55: aload_3
    //   56: invokevirtual 206	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   59: arraylength
    //   60: istore 6
    //   62: iload 5
    //   64: iload 6
    //   66: iadd
    //   67: iload_1
    //   68: if_icmple +50 -> 118
    //   71: aload_0
    //   72: iconst_0
    //   73: iload_2
    //   74: invokevirtual 214	java/lang/String:substring	(II)Ljava/lang/String;
    //   77: astore 7
    //   79: aload 7
    //   81: astore 8
    //   83: aconst_null
    //   84: invokestatic 200	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   87: ifne +28 -> 115
    //   90: new 143	java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   97: aload 8
    //   99: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aconst_null
    //   103: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: astore 10
    //   111: aload 10
    //   113: astore 8
    //   115: aload 8
    //   117: areturn
    //   118: iload 5
    //   120: iload 6
    //   122: iadd
    //   123: istore 5
    //   125: iinc 2 1
    //   128: goto -89 -> 39
    //   131: astore 4
    //   133: getstatic 220	java/lang/System:out	Ljava/io/PrintStream;
    //   136: new 143	java/lang/StringBuilder
    //   139: dup
    //   140: ldc 222
    //   142: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload 4
    //   147: invokevirtual 225	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   150: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokevirtual 230	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   159: aload_0
    //   160: areturn
    //   161: astore 9
    //   163: aload 8
    //   165: astore_0
    //   166: aload 9
    //   168: astore 4
    //   170: goto -37 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   26	36	131	java/lang/Exception
    //   39	62	131	java/lang/Exception
    //   71	79	131	java/lang/Exception
    //   83	111	161	java/lang/Exception
  }

  private static JSONObject a(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    if (paramString != null)
    {
      String[] arrayOfString1 = paramString.split("&");
      int i = arrayOfString1.length;
      int j = 0;
      while (true)
        if (j < i)
        {
          String[] arrayOfString2 = arrayOfString1[j].split("=");
          if (arrayOfString2.length == 2);
          try
          {
            paramJSONObject.put(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
            j++;
          }
          catch (JSONException localJSONException)
          {
            while (true)
              f.e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + localJSONException.getMessage());
          }
        }
    }
    return paramJSONObject;
  }

  public static void a(Context paramContext, String paramString1, long paramLong, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("appid_for_getting_config", paramString2);
    localBundle.putString("strValue", paramString2);
    localBundle.putString("nValue", paramString1);
    localBundle.putString("qver", "2.9.4");
    if (paramLong != 0L)
      localBundle.putLong("elt", paramLong);
    new p(paramContext, localBundle).start();
  }

  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramString1, paramString2));
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.addFlags(1073741824);
    localIntent.addFlags(268435456);
    localIntent.setData(Uri.parse(paramString3));
    paramContext.startActivity(localIntent);
  }

  public static boolean a()
  {
    boolean bool = Environment.getExternalStorageState().equals("mounted");
    File localFile = null;
    if (bool)
      localFile = Environment.getExternalStorageDirectory();
    return localFile != null;
  }

  public static boolean a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i = b.g(localPackageManager.getPackageInfo("com.tencent.mobileqq", 0).versionName, "4.1");
      int j = 0;
      if (i >= 0)
        j = 1;
      return j;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      f.b("openSDK_LOG.Util", "NameNotFoundException", localNameNotFoundException);
    }
    return false;
  }

  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      boolean bool2 = d(paramContext);
      bool1 = bool2;
      if (bool1);
      try
      {
        a(paramContext, "com.tencent.mtt", "com.tencent.mtt.MainActivity", paramString);
        break label137;
        a(paramContext, "com.android.browser", "com.android.browser.BrowserActivity", paramString);
      }
      catch (Exception localException7)
      {
      }
      if (bool1)
        try
        {
          a(paramContext, "com.android.browser", "com.android.browser.BrowserActivity", paramString);
        }
        catch (Exception localException4)
        {
          try
          {
            a(paramContext, "com.google.android.browser", "com.android.browser.BrowserActivity", paramString);
          }
          catch (Exception localException5)
          {
            try
            {
              a(paramContext, "com.android.chrome", "com.google.android.apps.chrome.Main", paramString);
            }
            catch (Exception localException6)
            {
              return false;
            }
          }
        }
      else
        try
        {
          a(paramContext, "com.google.android.browser", "com.android.browser.BrowserActivity", paramString);
        }
        catch (Exception localException2)
        {
          try
          {
            a(paramContext, "com.android.chrome", "com.google.android.apps.chrome.Main", paramString);
          }
          catch (Exception localException3)
          {
            return false;
          }
        }
    }
    catch (Exception localException1)
    {
      while (true)
        boolean bool1 = false;
    }
    label137: return true;
  }

  public static final String b(Context paramContext)
  {
    if (paramContext != null)
    {
      CharSequence localCharSequence = paramContext.getPackageManager().getApplicationLabel(paramContext.getApplicationInfo());
      if (localCharSequence != null)
        return localCharSequence.toString();
    }
    return null;
  }

  public static String b(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return "";
    e(paramContext, paramString);
    return b;
  }

  public static JSONObject b(String paramString)
  {
    String str = paramString.replace("auth://", "http://");
    try
    {
      URL localURL = new URL(str);
      JSONObject localJSONObject = a(null, localURL.getQuery());
      a(localJSONObject, localURL.getRef());
      return localJSONObject;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new JSONObject();
  }

  public static String c(Context paramContext)
  {
    if (paramContext == null)
      return "";
    try
    {
      LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
      Criteria localCriteria = new Criteria();
      localCriteria.setCostAllowed(false);
      localCriteria.setAccuracy(2);
      String str1 = localLocationManager.getBestProvider(localCriteria, true);
      if (str1 != null)
      {
        Location localLocation = localLocationManager.getLastKnownLocation(str1);
        if (localLocation == null)
          return "";
        double d1 = localLocation.getLatitude();
        double d2 = localLocation.getLongitude();
        String str2 = d1 + "*" + d2;
        return str2;
      }
    }
    catch (Exception localException)
    {
      f.b("openSDK_LOG.Util", "getLocation>>>", localException);
    }
    return "";
  }

  public static String c(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return "";
    e(paramContext, paramString);
    return a;
  }

  public static JSONObject c(String paramString)
  {
    if (paramString.equals("false"))
      paramString = "{value : false}";
    if (paramString.equals("true"))
      paramString = "{value : true}";
    if (paramString.contains("allback("))
      paramString = paramString.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
    if (paramString.contains("online[0]="))
      paramString = "{online:" + paramString.charAt(-2 + paramString.length()) + "}";
    return new JSONObject(paramString);
  }

  public static String d(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return "";
    return c(paramContext, paramString);
  }

  private static boolean d(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
      String str1 = localPackageInfo.versionName;
      if ((b.g(str1, "4.3") >= 0) && (!str1.startsWith("4.4")))
      {
        Signature[] arrayOfSignature = localPackageInfo.signatures;
        if (arrayOfSignature != null)
          try
          {
            MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
            localMessageDigest.update(arrayOfSignature[0].toByteArray());
            byte[] arrayOfByte = localMessageDigest.digest();
            if (arrayOfByte == null);
            String str2;
            for (Object localObject = null; ; localObject = str2)
            {
              localMessageDigest.reset();
              if (!localObject.equals("d8391a394d4a179e6fe7bdb8a301258b"))
                break;
              return true;
              StringBuilder localStringBuilder = new StringBuilder(2 * arrayOfByte.length);
              for (int i = 0; i < arrayOfByte.length; i++)
              {
                String str3 = Integer.toString(0xFF & arrayOfByte[i], 16);
                if (str3.length() == 1)
                  str3 = "0" + str3;
                localStringBuilder.append(str3);
              }
              str2 = localStringBuilder.toString();
            }
          }
          catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
          {
            f.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + localNoSuchAlgorithmException.getMessage());
          }
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static boolean d(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }

  public static String e(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(j(paramString));
      byte[] arrayOfByte = localMessageDigest.digest();
      if (arrayOfByte != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        int i = arrayOfByte.length;
        for (int j = 0; j < i; j++)
        {
          int k = arrayOfByte[j];
          localStringBuilder.append(a(k >>> 4));
          localStringBuilder.append(a(k));
        }
        String str = localStringBuilder.toString();
        paramString = str;
      }
      return paramString;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      f.e("openSDK_LOG.Util", "encrypt has exception: " + localNoSuchAlgorithmException.getMessage());
    }
    return paramString;
  }

  private static void e(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return;
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      String str = localPackageInfo.versionName;
      b = str;
      a = str.substring(0, b.lastIndexOf('.'));
      b.substring(1 + b.lastIndexOf('.'), b.length());
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      f.e("openSDK_LOG.Util", "getPackageInfo has exception: " + localNameNotFoundException.getMessage());
      return;
    }
    catch (Exception localException)
    {
      f.e("openSDK_LOG.Util", "getPackageInfo has exception: " + localException.getMessage());
    }
  }

  public static final boolean f(String paramString)
  {
    if (paramString == null);
    do
      return false;
    while ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")));
    return true;
  }

  public static final boolean g(String paramString)
  {
    if (paramString == null);
    do
      return false;
    while (!new File(paramString).exists());
    return true;
  }

  public static boolean h(String paramString)
  {
    if (paramString == null);
    do
      return false;
    while (!new File(paramString).exists());
    return true;
  }

  public static int i(String paramString)
  {
    return k(paramString);
  }

  public static byte[] j(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  private static int k(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.o
 * JD-Core Version:    0.6.0
 */