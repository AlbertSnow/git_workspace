package com.alipay.mobilesecuritysdk.deviceID;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.v4.app.b;
import com.wandoujia.clean.reporter.PeriodReporter;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public final class i
{
  private static File a = null;
  private static File b = null;
  private static String c = null;
  private static String d = null;
  private static boolean e = true;
  private static Context f = null;

  // ERROR //
  private static String a(String paramString)
  {
    // Byte code:
    //   0: new 37	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 40	org/json/JSONObject:<init>	()V
    //   7: astore_1
    //   8: new 42	java/io/File
    //   11: dup
    //   12: getstatic 18	com/alipay/mobilesecuritysdk/deviceID/i:a	Ljava/io/File;
    //   15: aload_0
    //   16: invokespecial 45	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 49	java/io/File:exists	()Z
    //   24: ifeq +12 -> 36
    //   27: aload_2
    //   28: invokevirtual 53	java/io/File:length	()J
    //   31: lconst_0
    //   32: lcmp
    //   33: ifne +5 -> 38
    //   36: aconst_null
    //   37: areturn
    //   38: aload_2
    //   39: invokevirtual 53	java/io/File:length	()J
    //   42: l2i
    //   43: newarray char
    //   45: astore_3
    //   46: new 55	java/io/FileReader
    //   49: dup
    //   50: aload_2
    //   51: invokespecial 58	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   54: astore 4
    //   56: aload 4
    //   58: aload_3
    //   59: invokevirtual 62	java/io/FileReader:read	([C)I
    //   62: pop
    //   63: aload 4
    //   65: invokevirtual 65	java/io/FileReader:close	()V
    //   68: aload_1
    //   69: ldc 67
    //   71: ldc 69
    //   73: invokevirtual 73	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   76: pop
    //   77: aload_1
    //   78: ldc 75
    //   80: aload_3
    //   81: invokestatic 81	java/lang/String:valueOf	([C)Ljava/lang/String;
    //   84: invokevirtual 73	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   87: pop
    //   88: aload_1
    //   89: invokevirtual 85	org/json/JSONObject:toString	()Ljava/lang/String;
    //   92: areturn
    //   93: astore 19
    //   95: aconst_null
    //   96: astore 4
    //   98: aload 4
    //   100: ifnull -64 -> 36
    //   103: aload 4
    //   105: invokevirtual 65	java/io/FileReader:close	()V
    //   108: aconst_null
    //   109: areturn
    //   110: astore 6
    //   112: aconst_null
    //   113: areturn
    //   114: astore 18
    //   116: aconst_null
    //   117: astore 4
    //   119: aload 4
    //   121: ifnull -85 -> 36
    //   124: aload 4
    //   126: invokevirtual 65	java/io/FileReader:close	()V
    //   129: aconst_null
    //   130: areturn
    //   131: astore 8
    //   133: aconst_null
    //   134: areturn
    //   135: astore 17
    //   137: aconst_null
    //   138: astore 4
    //   140: aload 17
    //   142: astore 9
    //   144: aload 4
    //   146: ifnull +8 -> 154
    //   149: aload 4
    //   151: invokevirtual 65	java/io/FileReader:close	()V
    //   154: aload 9
    //   156: athrow
    //   157: astore 13
    //   159: aload 13
    //   161: invokevirtual 88	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   164: pop
    //   165: aconst_null
    //   166: areturn
    //   167: astore 10
    //   169: goto -15 -> 154
    //   172: astore 12
    //   174: goto -106 -> 68
    //   177: astore 9
    //   179: goto -35 -> 144
    //   182: astore 7
    //   184: goto -65 -> 119
    //   187: astore 5
    //   189: goto -91 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   46	56	93	java/io/FileNotFoundException
    //   103	108	110	java/io/IOException
    //   46	56	114	java/io/IOException
    //   124	129	131	java/io/IOException
    //   46	56	135	finally
    //   68	88	157	org/json/JSONException
    //   149	154	167	java/io/IOException
    //   63	68	172	java/io/IOException
    //   56	63	177	finally
    //   56	63	182	java/io/IOException
    //   56	63	187	java/io/FileNotFoundException
  }

  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  public static void a()
  {
    int i = 1;
    monitorenter;
    try
    {
      if (a == null)
        throw new IllegalStateException("logFileDir can not be null! call 'LOG.init' first!");
    }
    finally
    {
      monitorexit;
    }
    if ((a.exists()) && (a.isDirectory()))
    {
      int j = a.list().length;
      if (j != 0)
        break label61;
    }
    label61: label324: label335: label349: 
    while (true)
    {
      monitorexit;
      return;
      ArrayList localArrayList = new ArrayList();
      String[] arrayOfString = a.list();
      int k = arrayOfString.length;
      int m = 0;
      String str1;
      int n;
      int i1;
      String str2;
      if (m >= k)
      {
        Collections.sort(localArrayList);
        str1 = (String)localArrayList.get(-1 + localArrayList.size());
        n = localArrayList.size();
        if (!str1.equals(c()))
          break label324;
        if (localArrayList.size() < 2)
          continue;
        String str5 = (String)localArrayList.get(-2 + localArrayList.size());
        i1 = n - 1;
        str2 = str5;
        String str3 = a(str2);
        if ((str3 == null) || (f == null) || (!b.a(f)))
          break label309;
        new PeriodReporter();
        HttpResponse localHttpResponse = PeriodReporter.a("http://seccliprod.d5198.alipay.net/api/do.htm", "bugTrack", str3, "1", true);
        if ((localHttpResponse == null) || (localHttpResponse.getStatusLine().getStatusCode() != 200))
          break label309;
        break label335;
      }
      while (true)
      {
        label249: if (i3 >= i2)
          break label349;
        String str4 = (String)localArrayList.get(i3);
        new File(a, str4).delete();
        i3++;
        continue;
        localArrayList.add(arrayOfString[m]);
        m++;
        break;
        i = 0;
        while (i != 0)
        {
          i2 = i1;
          i3 = 0;
          break label249;
          i1 = n;
          str2 = str1;
          break;
        }
        int i2 = i1 - 1;
        int i3 = 0;
      }
    }
  }

  public static void a(Context paramContext)
  {
    monitorenter;
    try
    {
      f = paramContext;
      if (a == null)
      {
        a = new File(paramContext.getFilesDir().getAbsolutePath() + "/log/ap");
        c = Build.MODEL;
        d = paramContext.getApplicationContext().getApplicationInfo().packageName;
        if (e)
          new StringBuilder(String.valueOf(d)).append(",").append(c);
      }
      if (a.exists())
      {
        if (a.isDirectory())
          break label157;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = a.getAbsoluteFile();
        throw new IllegalStateException(String.format("<%s> exists but not a Directory!", arrayOfObject));
      }
    }
    finally
    {
      monitorexit;
    }
    a.mkdirs();
    label157: monitorexit;
  }

  // ERROR //
  public static void a(List<String> paramList)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 18	com/alipay/mobilesecuritysdk/deviceID/i:a	Ljava/io/File;
    //   6: ifnonnull +19 -> 25
    //   9: new 106	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 108
    //   15: invokespecial 111	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: astore_1
    //   20: ldc 2
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    //   25: new 239	java/lang/StringBuffer
    //   28: dup
    //   29: new 241	java/text/SimpleDateFormat
    //   32: dup
    //   33: ldc 243
    //   35: invokespecial 244	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   38: invokestatic 250	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   41: invokevirtual 254	java/util/Calendar:getTime	()Ljava/util/Date;
    //   44: invokevirtual 257	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   47: invokespecial 258	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   50: astore_2
    //   51: aload_2
    //   52: new 182	java/lang/StringBuilder
    //   55: dup
    //   56: ldc 223
    //   58: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: getstatic 22	com/alipay/mobilesecuritysdk/deviceID/i:c	Ljava/lang/String;
    //   64: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   73: pop
    //   74: aload_2
    //   75: new 182	java/lang/StringBuilder
    //   78: dup
    //   79: ldc 223
    //   81: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: getstatic 24	com/alipay/mobilesecuritysdk/deviceID/i:d	Ljava/lang/String;
    //   87: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   96: pop
    //   97: aload_0
    //   98: invokeinterface 265 1 0
    //   103: astore 5
    //   105: aload 5
    //   107: invokeinterface 270 1 0
    //   112: istore 6
    //   114: iload 6
    //   116: ifne +104 -> 220
    //   119: aconst_null
    //   120: astore 9
    //   122: invokestatic 272	com/alipay/mobilesecuritysdk/deviceID/i:b	()J
    //   125: lstore 15
    //   127: new 274	java/io/RandomAccessFile
    //   130: dup
    //   131: getstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   134: ldc_w 276
    //   137: invokespecial 277	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   140: astore 13
    //   142: lload 15
    //   144: aload_2
    //   145: invokevirtual 279	java/lang/StringBuffer:length	()I
    //   148: i2l
    //   149: ladd
    //   150: ldc2_w 280
    //   153: lcmp
    //   154: ifgt +13 -> 167
    //   157: aload 13
    //   159: aload 13
    //   161: invokevirtual 282	java/io/RandomAccessFile:length	()J
    //   164: invokevirtual 286	java/io/RandomAccessFile:seek	(J)V
    //   167: aload_2
    //   168: ldc_w 288
    //   171: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   174: pop
    //   175: getstatic 26	com/alipay/mobilesecuritysdk/deviceID/i:e	Z
    //   178: ifeq +21 -> 199
    //   181: new 182	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 290
    //   188: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: aload_2
    //   192: invokevirtual 291	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   195: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload 13
    //   201: aload_2
    //   202: invokevirtual 291	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   205: invokevirtual 295	java/lang/String:getBytes	()[B
    //   208: invokevirtual 299	java/io/RandomAccessFile:write	([B)V
    //   211: aload 13
    //   213: invokevirtual 300	java/io/RandomAccessFile:close	()V
    //   216: ldc 2
    //   218: monitorexit
    //   219: return
    //   220: aload 5
    //   222: invokeinterface 304 1 0
    //   227: checkcast 77	java/lang/String
    //   230: astore 7
    //   232: aload_2
    //   233: new 182	java/lang/StringBuilder
    //   236: dup
    //   237: ldc 223
    //   239: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: aload 7
    //   244: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokevirtual 261	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   253: pop
    //   254: goto -149 -> 105
    //   257: astore 12
    //   259: aconst_null
    //   260: astore 13
    //   262: aload 13
    //   264: ifnull -48 -> 216
    //   267: aload 13
    //   269: invokevirtual 300	java/io/RandomAccessFile:close	()V
    //   272: goto -56 -> 216
    //   275: astore 14
    //   277: goto -61 -> 216
    //   280: astore 10
    //   282: aload 9
    //   284: ifnull +8 -> 292
    //   287: aload 9
    //   289: invokevirtual 300	java/io/RandomAccessFile:close	()V
    //   292: aload 10
    //   294: athrow
    //   295: astore 11
    //   297: goto -5 -> 292
    //   300: astore 20
    //   302: goto -86 -> 216
    //   305: astore 18
    //   307: aload 13
    //   309: astore 9
    //   311: aload 18
    //   313: astore 10
    //   315: goto -33 -> 282
    //   318: astore 17
    //   320: goto -58 -> 262
    //
    // Exception table:
    //   from	to	target	type
    //   3	19	19	finally
    //   25	105	19	finally
    //   105	114	19	finally
    //   211	216	19	finally
    //   220	254	19	finally
    //   267	272	19	finally
    //   287	292	19	finally
    //   292	295	19	finally
    //   122	142	257	java/lang/Exception
    //   267	272	275	java/io/IOException
    //   122	142	280	finally
    //   287	292	295	java/io/IOException
    //   211	216	300	java/io/IOException
    //   142	167	305	finally
    //   167	199	305	finally
    //   199	211	305	finally
    //   142	167	318	java/lang/Exception
    //   167	199	318	java/lang/Exception
    //   199	211	318	java/lang/Exception
  }

  // ERROR //
  private static long b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 42	java/io/File
    //   6: dup
    //   7: getstatic 18	com/alipay/mobilesecuritysdk/deviceID/i:a	Ljava/io/File;
    //   10: invokestatic 139	com/alipay/mobilesecuritysdk/deviceID/i:c	()Ljava/lang/String;
    //   13: invokespecial 45	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   16: putstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   19: getstatic 26	com/alipay/mobilesecuritysdk/deviceID/i:e	Z
    //   22: ifeq +23 -> 45
    //   25: new 182	java/lang/StringBuilder
    //   28: dup
    //   29: ldc_w 306
    //   32: invokespecial 195	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: getstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   38: invokevirtual 191	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: getstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   48: invokevirtual 49	java/io/File:exists	()Z
    //   51: istore_1
    //   52: iload_1
    //   53: ifne +19 -> 72
    //   56: getstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   59: invokevirtual 309	java/io/File:createNewFile	()Z
    //   62: pop
    //   63: lconst_0
    //   64: lstore 4
    //   66: ldc 2
    //   68: monitorexit
    //   69: lload 4
    //   71: lreturn
    //   72: getstatic 20	com/alipay/mobilesecuritysdk/deviceID/i:b	Ljava/io/File;
    //   75: invokevirtual 53	java/io/File:length	()J
    //   78: lstore_2
    //   79: lload_2
    //   80: lstore 4
    //   82: goto -16 -> 66
    //   85: astore_0
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_0
    //   90: athrow
    //   91: astore 6
    //   93: goto -30 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   3	45	85	finally
    //   45	52	85	finally
    //   56	63	85	finally
    //   72	79	85	finally
    //   56	63	91	java/io/IOException
  }

  private static String c()
  {
    Date localDate = Calendar.getInstance().getTime();
    return new SimpleDateFormat("yyyyMMdd").format(localDate) + ".log";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.i
 * JD-Core Version:    0.6.0
 */