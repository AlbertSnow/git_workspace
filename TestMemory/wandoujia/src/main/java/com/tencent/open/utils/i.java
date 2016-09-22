package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.open.a.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  private static Map<String, i> a = Collections.synchronizedMap(new HashMap());
  private static String b = null;
  private Context c = null;
  private String d = null;
  private JSONObject e = null;
  private long f = 0L;
  private int g = 0;
  private boolean h = true;

  private i(Context paramContext, String paramString)
  {
    this.c = paramContext.getApplicationContext();
    this.d = paramString;
    String str = c("com.tencent.open.config.json");
    try
    {
      this.e = new JSONObject(str);
      a();
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        this.e = new JSONObject();
    }
  }

  public static i a(Context paramContext, String paramString)
  {
    while (true)
    {
      synchronized (a)
      {
        f.a("openSDK_LOG.OpenConfig", "getInstance begin");
        if (paramString == null)
          continue;
        b = paramString;
        if (paramString != null)
          continue;
        if (b != null)
        {
          paramString = b;
          i locali = (i)a.get(paramString);
          if (locali != null)
            continue;
          locali = new i(paramContext, paramString);
          a.put(paramString, locali);
          f.a("openSDK_LOG.OpenConfig", "getInstance end");
          return locali;
        }
      }
      paramString = "0";
    }
  }

  private void a()
  {
    if (this.g != 0)
    {
      d("update thread is running, return");
      return;
    }
    this.g = 1;
    Bundle localBundle = new Bundle();
    localBundle.putString("appid", this.d);
    localBundle.putString("appid_for_getting_config", this.d);
    localBundle.putString("status_os", Build.VERSION.RELEASE);
    localBundle.putString("status_machine", Build.MODEL);
    localBundle.putString("status_version", Build.VERSION.SDK);
    localBundle.putString("sdkv", "2.9.4");
    localBundle.putString("sdkp", "a");
    new j(this, localBundle).start();
  }

  private void b()
  {
    int i = this.e.optInt("Common_frequency");
    if (i == 0)
      i = 1;
    long l = i * 3600000;
    if (SystemClock.elapsedRealtime() - this.f >= l)
      a();
  }

  // ERROR //
  private String c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/tencent/open/utils/i:d	Ljava/lang/String;
    //   4: ifnull +116 -> 120
    //   7: new 158	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 159	java/lang/StringBuilder:<init>	()V
    //   14: aload_1
    //   15: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: ldc 165
    //   20: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: aload_0
    //   24: getfield 45	com/tencent/open/utils/i:d	Ljava/lang/String;
    //   27: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore 16
    //   35: aload_0
    //   36: getfield 43	com/tencent/open/utils/i:c	Landroid/content/Context;
    //   39: aload 16
    //   41: invokevirtual 212	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   44: astore 17
    //   46: aload 17
    //   48: astore 5
    //   50: new 214	java/io/BufferedReader
    //   53: dup
    //   54: new 216	java/io/InputStreamReader
    //   57: dup
    //   58: aload 5
    //   60: ldc 174
    //   62: invokestatic 180	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   65: invokespecial 219	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   68: invokespecial 222	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   71: astore 6
    //   73: new 224	java/lang/StringBuffer
    //   76: dup
    //   77: invokespecial 225	java/lang/StringBuffer:<init>	()V
    //   80: astore 7
    //   82: aload 6
    //   84: invokevirtual 228	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   87: astore 12
    //   89: aload 12
    //   91: ifnull +60 -> 151
    //   94: aload 7
    //   96: aload 12
    //   98: invokevirtual 231	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   101: pop
    //   102: goto -20 -> 82
    //   105: astore 10
    //   107: aload 5
    //   109: invokevirtual 234	java/io/InputStream:close	()V
    //   112: aload 6
    //   114: invokevirtual 235	java/io/BufferedReader:close	()V
    //   117: ldc 237
    //   119: areturn
    //   120: aload_1
    //   121: astore 16
    //   123: goto -88 -> 35
    //   126: astore_2
    //   127: aload_0
    //   128: getfield 43	com/tencent/open/utils/i:c	Landroid/content/Context;
    //   131: invokevirtual 241	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   134: aload_1
    //   135: invokevirtual 247	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   138: astore 4
    //   140: aload 4
    //   142: astore 5
    //   144: goto -94 -> 50
    //   147: astore_3
    //   148: ldc 237
    //   150: areturn
    //   151: aload 7
    //   153: invokevirtual 248	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   156: astore 14
    //   158: aload 5
    //   160: invokevirtual 234	java/io/InputStream:close	()V
    //   163: aload 6
    //   165: invokevirtual 235	java/io/BufferedReader:close	()V
    //   168: aload 14
    //   170: areturn
    //   171: astore 15
    //   173: aload 14
    //   175: areturn
    //   176: astore 11
    //   178: ldc 237
    //   180: areturn
    //   181: astore 8
    //   183: aload 5
    //   185: invokevirtual 234	java/io/InputStream:close	()V
    //   188: aload 6
    //   190: invokevirtual 235	java/io/BufferedReader:close	()V
    //   193: aload 8
    //   195: athrow
    //   196: astore 9
    //   198: goto -5 -> 193
    //
    // Exception table:
    //   from	to	target	type
    //   82	89	105	java/io/IOException
    //   94	102	105	java/io/IOException
    //   151	158	105	java/io/IOException
    //   0	35	126	java/io/FileNotFoundException
    //   35	46	126	java/io/FileNotFoundException
    //   127	140	147	java/io/IOException
    //   158	168	171	java/io/IOException
    //   107	117	176	java/io/IOException
    //   82	89	181	finally
    //   94	102	181	finally
    //   151	158	181	finally
    //   183	193	196	java/io/IOException
  }

  private void d(String paramString)
  {
    if (this.h)
      f.a("openSDK_LOG.OpenConfig", paramString + "; appid: " + this.d);
  }

  public final int a(String paramString)
  {
    d("get " + paramString);
    b();
    return this.e.optInt(paramString);
  }

  public final boolean b(String paramString)
  {
    d("get " + paramString);
    b();
    Object localObject = this.e.opt(paramString);
    if (localObject == null)
      return false;
    if ((localObject instanceof Integer))
      return !localObject.equals(Integer.valueOf(0));
    if ((localObject instanceof Boolean))
      return ((Boolean)localObject).booleanValue();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.i
 * JD-Core Version:    0.6.0
 */