package com.sina.weibo.sdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.g;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static a a;
  private Context b;
  private String c;
  private volatile ReentrantLock d = new ReentrantLock(true);

  private a(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    new Thread(new b(this)).start();
  }

  public static a a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new a(paramContext);
      a locala = a;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private File a(int paramInt)
  {
    return new File(this.b.getFilesDir(), "weibo_sdk_aid" + paramInt);
  }

  // ERROR //
  private static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 83
    //   2: invokestatic 89	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   5: astore_2
    //   6: new 91	java/security/spec/X509EncodedKeySpec
    //   9: dup
    //   10: aload_1
    //   11: invokevirtual 97	java/lang/String:getBytes	()[B
    //   14: invokestatic 102	com/sina/weibo/sdk/a/e:a	([B)[B
    //   17: invokespecial 105	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   20: astore_3
    //   21: aload_2
    //   22: iconst_1
    //   23: ldc 107
    //   25: invokestatic 112	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   28: aload_3
    //   29: invokevirtual 116	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   32: invokevirtual 120	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   35: aload_0
    //   36: ldc 122
    //   38: invokevirtual 125	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   41: astore 4
    //   43: new 127	java/io/ByteArrayOutputStream
    //   46: dup
    //   47: invokespecial 128	java/io/ByteArrayOutputStream:<init>	()V
    //   50: astore 5
    //   52: iconst_0
    //   53: istore 6
    //   55: iload 6
    //   57: aload 4
    //   59: arraylength
    //   60: if_icmplt +168 -> 228
    //   63: iconst_m1
    //   64: istore 9
    //   66: iload 9
    //   68: iconst_m1
    //   69: if_icmpne +94 -> 163
    //   72: aload 5
    //   74: invokevirtual 131	java/io/ByteArrayOutputStream:flush	()V
    //   77: aload 5
    //   79: invokevirtual 134	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   82: astore 10
    //   84: new 59	java/lang/StringBuilder
    //   87: dup
    //   88: ldc 136
    //   90: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload 10
    //   95: arraylength
    //   96: invokevirtual 68	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload 10
    //   102: invokestatic 138	com/sina/weibo/sdk/a/e:b	([B)[B
    //   105: astore 12
    //   107: new 59	java/lang/StringBuilder
    //   110: dup
    //   111: ldc 140
    //   113: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   116: aload 12
    //   118: arraylength
    //   119: invokevirtual 68	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: new 93	java/lang/String
    //   126: dup
    //   127: aload 12
    //   129: ldc 122
    //   131: invokespecial 143	java/lang/String:<init>	([BLjava/lang/String;)V
    //   134: astore 14
    //   136: new 59	java/lang/StringBuilder
    //   139: dup
    //   140: ldc 145
    //   142: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload 14
    //   147: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: astore 15
    //   155: aload 5
    //   157: invokevirtual 151	java/io/ByteArrayOutputStream:close	()V
    //   160: aload 15
    //   162: areturn
    //   163: aload_2
    //   164: aload 4
    //   166: iload 6
    //   168: iload 9
    //   170: invokevirtual 155	javax/crypto/Cipher:doFinal	([BII)[B
    //   173: astore 17
    //   175: aload 5
    //   177: aload 17
    //   179: invokevirtual 158	java/io/ByteArrayOutputStream:write	([B)V
    //   182: new 59	java/lang/StringBuilder
    //   185: dup
    //   186: ldc 160
    //   188: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: iload 6
    //   193: invokevirtual 68	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   196: ldc 162
    //   198: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: iload 9
    //   203: invokevirtual 68	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   206: ldc 164
    //   208: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload 17
    //   213: arraylength
    //   214: invokevirtual 68	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: iload 6
    //   220: iload 9
    //   222: iadd
    //   223: istore 6
    //   225: goto -170 -> 55
    //   228: aload 4
    //   230: arraylength
    //   231: iload 6
    //   233: isub
    //   234: bipush 117
    //   236: invokestatic 170	java/lang/Math:min	(II)I
    //   239: istore 19
    //   241: iload 19
    //   243: istore 9
    //   245: goto -179 -> 66
    //   248: astore 7
    //   250: aconst_null
    //   251: astore 5
    //   253: aload 5
    //   255: ifnull +8 -> 263
    //   258: aload 5
    //   260: invokevirtual 151	java/io/ByteArrayOutputStream:close	()V
    //   263: aload 7
    //   265: athrow
    //   266: astore 16
    //   268: aload 15
    //   270: areturn
    //   271: astore 8
    //   273: goto -10 -> 263
    //   276: astore 7
    //   278: goto -25 -> 253
    //
    // Exception table:
    //   from	to	target	type
    //   43	52	248	finally
    //   155	160	266	java/io/IOException
    //   258	263	271	java/io/IOException
    //   55	63	276	finally
    //   72	155	276	finally
    //   163	218	276	finally
    //   228	241	276	finally
  }

  // ERROR //
  private d b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 178	java/io/FileInputStream
    //   5: dup
    //   6: aload_0
    //   7: iconst_1
    //   8: invokespecial 78	com/sina/weibo/sdk/a/a:a	(I)Ljava/io/File;
    //   11: invokespecial 181	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   14: astore_1
    //   15: aload_1
    //   16: invokevirtual 185	java/io/FileInputStream:available	()I
    //   19: newarray byte
    //   21: astore 8
    //   23: aload_1
    //   24: aload 8
    //   26: invokevirtual 189	java/io/FileInputStream:read	([B)I
    //   29: pop
    //   30: new 93	java/lang/String
    //   33: dup
    //   34: aload 8
    //   36: invokespecial 190	java/lang/String:<init>	([B)V
    //   39: invokestatic 195	com/sina/weibo/sdk/a/d:a	(Ljava/lang/String;)Lcom/sina/weibo/sdk/a/d;
    //   42: astore 10
    //   44: aload 10
    //   46: astore_3
    //   47: aload_1
    //   48: invokevirtual 196	java/io/FileInputStream:close	()V
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_3
    //   54: areturn
    //   55: astore 13
    //   57: aconst_null
    //   58: astore_1
    //   59: aconst_null
    //   60: astore_3
    //   61: aload_1
    //   62: ifnull -11 -> 51
    //   65: aload_1
    //   66: invokevirtual 196	java/io/FileInputStream:close	()V
    //   69: aconst_null
    //   70: astore_3
    //   71: goto -20 -> 51
    //   74: astore 5
    //   76: aconst_null
    //   77: astore_3
    //   78: goto -27 -> 51
    //   81: astore 12
    //   83: aconst_null
    //   84: astore_1
    //   85: aload 12
    //   87: astore 6
    //   89: aload_1
    //   90: ifnull +7 -> 97
    //   93: aload_1
    //   94: invokevirtual 196	java/io/FileInputStream:close	()V
    //   97: aload 6
    //   99: athrow
    //   100: astore 4
    //   102: aload_0
    //   103: monitorexit
    //   104: aload 4
    //   106: athrow
    //   107: astore 11
    //   109: goto -58 -> 51
    //   112: astore 7
    //   114: goto -17 -> 97
    //   117: astore 6
    //   119: goto -30 -> 89
    //   122: astore_2
    //   123: goto -64 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   2	15	55	java/lang/Exception
    //   65	69	74	java/io/IOException
    //   2	15	81	finally
    //   47	51	100	finally
    //   65	69	100	finally
    //   93	97	100	finally
    //   97	100	100	finally
    //   47	51	107	java/io/IOException
    //   93	97	112	java/io/IOException
    //   15	44	117	finally
    //   15	44	122	java/lang/Exception
  }

  // ERROR //
  private void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 203	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aconst_null
    //   15: astore 4
    //   17: new 205	java/io/FileOutputStream
    //   20: dup
    //   21: aload_0
    //   22: iconst_1
    //   23: invokespecial 78	com/sina/weibo/sdk/a/a:a	(I)Ljava/io/File;
    //   26: invokespecial 206	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: astore 5
    //   31: aload 5
    //   33: aload_1
    //   34: invokevirtual 97	java/lang/String:getBytes	()[B
    //   37: invokevirtual 207	java/io/FileOutputStream:write	([B)V
    //   40: aload 5
    //   42: invokevirtual 208	java/io/FileOutputStream:close	()V
    //   45: goto -34 -> 11
    //   48: astore 11
    //   50: goto -39 -> 11
    //   53: astore 12
    //   55: aconst_null
    //   56: astore 5
    //   58: aload 5
    //   60: ifnull -49 -> 11
    //   63: aload 5
    //   65: invokevirtual 208	java/io/FileOutputStream:close	()V
    //   68: goto -57 -> 11
    //   71: astore 7
    //   73: goto -62 -> 11
    //   76: astore 9
    //   78: aload 4
    //   80: ifnull +8 -> 88
    //   83: aload 4
    //   85: invokevirtual 208	java/io/FileOutputStream:close	()V
    //   88: aload 9
    //   90: athrow
    //   91: astore_2
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_2
    //   95: athrow
    //   96: astore 10
    //   98: goto -10 -> 88
    //   101: astore 8
    //   103: aload 5
    //   105: astore 4
    //   107: aload 8
    //   109: astore 9
    //   111: goto -33 -> 78
    //   114: astore 6
    //   116: goto -58 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   40	45	48	java/io/IOException
    //   17	31	53	java/lang/Exception
    //   63	68	71	java/io/IOException
    //   17	31	76	finally
    //   2	7	91	finally
    //   40	45	91	finally
    //   63	68	91	finally
    //   83	88	91	finally
    //   88	91	91	finally
    //   83	88	96	java/io/IOException
    //   31	40	101	finally
    //   31	40	114	java/lang/Exception
  }

  private String c()
  {
    String str1 = this.b.getPackageName();
    String str2 = android.support.v4.app.b.c(this.b, str1);
    String str3 = d();
    g localg = new g(this.c);
    localg.a("appkey", this.c);
    localg.a("mfp", str3);
    localg.a("packagename", str1);
    localg.a("key_hash", str2);
    try
    {
      String str4 = new com.sina.weibo.sdk.net.a(this.b).a("http://api.weibo.com/oauth2/getaid.json", localg, "GET");
      return str4;
    }
    catch (WeiboException localWeiboException)
    {
      new StringBuilder("loadAidFromNet WeiboException Msg : ").append(localWeiboException.getMessage());
    }
    throw localWeiboException;
  }

  private String d()
  {
    String str1 = e();
    try
    {
      str2 = new String(str1.getBytes(), "UTF-8");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      try
      {
        while (true)
        {
          String str3 = a(str2, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB");
          return str3;
          localUnsupportedEncodingException = localUnsupportedEncodingException;
          String str2 = "";
        }
      }
      catch (Exception localException)
      {
        localException.getMessage();
      }
    }
    return "";
  }

  private String e()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str1 = f();
      if (!TextUtils.isEmpty(str1))
        localJSONObject.put("1", str1);
      String str2 = g();
      if (!TextUtils.isEmpty(str2))
        localJSONObject.put("2", str2);
      String str3 = h();
      if (!TextUtils.isEmpty(str3))
        localJSONObject.put("3", str3);
      String str4 = i();
      if (!TextUtils.isEmpty(str4))
        localJSONObject.put("4", str4);
      String str5 = j();
      if (!TextUtils.isEmpty(str5))
        localJSONObject.put("5", str5);
      String str6 = k();
      if (!TextUtils.isEmpty(str6))
        localJSONObject.put("6", str6);
      String str7 = l();
      if (!TextUtils.isEmpty(str7))
        localJSONObject.put("7", str7);
      String str8 = m();
      if (!TextUtils.isEmpty(str8))
        localJSONObject.put("10", str8);
      String str9 = n();
      if (!TextUtils.isEmpty(str9))
        localJSONObject.put("13", str9);
      String str10 = o();
      if (!TextUtils.isEmpty(str10))
        localJSONObject.put("14", str10);
      String str11 = p();
      if (!TextUtils.isEmpty(str11))
        localJSONObject.put("15", str11);
      String str12 = q();
      if (!TextUtils.isEmpty(str12))
        localJSONObject.put("16", str12);
      String str13 = r();
      if (!TextUtils.isEmpty(str13))
        localJSONObject.put("17", str13);
      String str14 = s();
      if (!TextUtils.isEmpty(str14))
        localJSONObject.put("18", str14);
      String str15 = t();
      if (!TextUtils.isEmpty(str15))
        localJSONObject.put("19", str15);
      String str16 = localJSONObject.toString();
      return str16;
    }
    catch (JSONException localJSONException)
    {
    }
    return "";
  }

  private static String f()
  {
    try
    {
      String str = "Android " + Build.VERSION.RELEASE;
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String g()
  {
    try
    {
      String str = ((TelephonyManager)this.b.getSystemService("phone")).getDeviceId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String h()
  {
    try
    {
      String str = ((TelephonyManager)this.b.getSystemService("phone")).getDeviceId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String i()
  {
    try
    {
      String str = ((TelephonyManager)this.b.getSystemService("phone")).getSubscriberId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String j()
  {
    try
    {
      WifiManager localWifiManager = (WifiManager)this.b.getSystemService("wifi");
      if (localWifiManager == null)
        return "";
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo != null)
        return localWifiInfo.getMacAddress();
      return "";
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String k()
  {
    try
    {
      String str = ((TelephonyManager)this.b.getSystemService("phone")).getSimSerialNumber();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static String l()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      String str = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { "ro.serialno", "unknown" });
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String m()
  {
    try
    {
      String str = Settings.Secure.getString(this.b.getContentResolver(), "android_id");
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static String n()
  {
    try
    {
      String str = Build.CPU_ABI;
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static String o()
  {
    try
    {
      String str = Build.MODEL;
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static String p()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      String str = Long.toString(localStatFs.getBlockSize() * localStatFs.getBlockCount());
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String q()
  {
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)this.b.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      String str = String.valueOf(localDisplayMetrics.widthPixels) + "*" + String.valueOf(localDisplayMetrics.heightPixels);
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String r()
  {
    try
    {
      WifiInfo localWifiInfo = ((WifiManager)this.b.getSystemService("wifi")).getConnectionInfo();
      if (localWifiInfo != null)
      {
        String str = localWifiInfo.getSSID();
        return str;
      }
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static String s()
  {
    try
    {
      String str = Build.BRAND;
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private String t()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)this.b.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        if (localNetworkInfo.getType() == 0);
        switch (localNetworkInfo.getSubtype())
        {
        default:
          if (localNetworkInfo.getType() == 1)
            return "wifi";
        case 1:
        case 2:
        case 4:
        case 7:
        case 11:
        case 3:
        case 5:
        case 6:
        case 8:
        case 9:
        case 10:
        case 12:
        case 14:
        case 15:
        case 13:
        }
      }
    }
    catch (Exception localException)
    {
    }
    return "none";
    return "none";
    return "2G";
    return "3G";
    return "4G";
  }

  public final String a()
  {
    monitorenter;
    try
    {
      d locald = b();
      String str1;
      if (locald != null)
        str1 = locald.a();
      for (String str2 = str1; ; str2 = "")
        return str2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.c = paramString;
    new Thread(new c(this)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.a
 * JD-Core Version:    0.6.0
 */