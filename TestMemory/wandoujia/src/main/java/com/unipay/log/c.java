package com.unipay.log;

import android.content.Context;
import android.os.Environment;
import com.unipay.beans.GameBaseBean;
import com.unipay.beans.PayValueBean;
import com.unipay.tools.MyApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  public static final String a = Environment.getExternalStorageDirectory().getPath() + "/.unicomCache";
  private static String[] b = { "device", "login", "selectsrv", "pay", "exit" };

  public static void a()
  {
    int i = 0;
    while (true)
    {
      String str1;
      if (i < b.length)
      {
        str1 = b[i];
        if (!new File(b(str1)).exists());
      }
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("filetype", i);
        localJSONObject.put("content", c(b(str1)));
        b.a();
        str2 = localJSONObject.toString();
      }
      catch (Exception localException1)
      {
        try
        {
          String str2;
          new a("http://unilog.wostore.cn:8061/logserver/getlog/paymentLog", str2, str1).start();
          while (true)
          {
            label88: i++;
            break;
            return;
            localException1 = localException1;
          }
        }
        catch (Exception localException2)
        {
          break label88;
        }
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    d locald = new d();
    locald.a("logtype", "pay");
    locald.a("imsi", com.unipay.tools.b.c(paramContext));
    if (com.unipay.tools.a.b() != null)
    {
      locald.a("appid", com.unipay.tools.a.b().getAppid());
      locald.a("game", com.unipay.tools.a.b().getGame());
      locald.a("cpid", com.unipay.tools.a.b().getPrmCode());
      locald.a("cpcode", com.unipay.tools.a.b().getCpid());
      locald.a("userid", com.unipay.tools.a.b().getUid());
      if (com.unipay.tools.a.c() == null)
        break label368;
      locald.a("vaccode", com.unipay.tools.a.c().getVacCode());
      locald.a("customcode", com.unipay.tools.a.c().getCustomCode());
      locald.a("orderid", com.unipay.tools.a.c().getOrderid());
      locald.a("value", String.valueOf(com.unipay.tools.a.c().getMoney()));
    }
    JSONArray localJSONArray;
    while (true)
    {
      locald.a("datetime", localSimpleDateFormat.format(new Date()));
      locald.a("payway", com.unipay.tools.a.a());
      locald.a("result", paramString1);
      locald.a("errcode", paramString2);
      locald.a("sdkversion", MyApplication.a);
      locald.a("isshowpage", paramString3);
      locald.a("ua", com.unipay.tools.a.j());
      List localList = com.unipay.d.c.a(paramContext).a();
      if ((localList == null) || (localList.size() <= 0))
        break label419;
      localJSONArray = new JSONArray();
      for (int i = 0; i < localList.size(); i++)
        localJSONArray.put(((com.unipay.d.d)localList.get(i)).a());
      locald.a("appid", "");
      locald.a("game", "");
      locald.a("cpid", "");
      locald.a("cpcode", "");
      locald.a("userid", "");
      break;
      label368: locald.a("vaccode", "");
      locald.a("customcode", "");
      locald.a("orderid", "");
      locald.a("value", "");
    }
    locald.a("software", localJSONArray.toString());
    label419: b.a();
    String str = locald.a();
    try
    {
      new e("pay", "http://unilog.wostore.cn:8061/logserver/getlog/paymentLog", str).start();
      return;
    }
    catch (Exception localException)
    {
      a(str, "pay");
    }
  }

  public static void a(String paramString)
  {
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        File localFile1 = new File(a);
        File localFile2 = new File(localFile1.getAbsolutePath() + "/" + paramString);
        if (!localFile1.exists())
          localFile1.mkdirs();
        if (!localFile2.exists())
          localFile2.createNewFile();
        localFile2.delete();
      }
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void a(String paramString1, String paramString2)
  {
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        File localFile1 = new File(a);
        File localFile2 = new File(a + "/" + paramString2);
        if (!localFile1.exists())
          localFile1.mkdirs();
        if (!localFile2.exists())
          localFile2.createNewFile();
        String str = paramString1 + "##\r\n";
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile2, true);
        localFileOutputStream.write(str.getBytes("utf-8"));
        localFileOutputStream.close();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static String b(String paramString)
  {
    return a + "/" + paramString;
  }

  // ERROR //
  private static String c(String paramString)
  {
    // Byte code:
    //   0: new 295	java/io/BufferedReader
    //   3: dup
    //   4: new 297	java/io/InputStreamReader
    //   7: dup
    //   8: new 299	java/io/FileInputStream
    //   11: dup
    //   12: new 23	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 60	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: invokespecial 302	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   23: invokespecial 305	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   26: invokespecial 308	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   29: astore_1
    //   30: new 310	java/lang/StringBuffer
    //   33: dup
    //   34: invokespecial 311	java/lang/StringBuffer:<init>	()V
    //   37: astore_2
    //   38: aload_1
    //   39: invokevirtual 314	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore 7
    //   44: aload 7
    //   46: ifnull +26 -> 72
    //   49: aload_2
    //   50: aload 7
    //   52: invokevirtual 317	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   55: pop
    //   56: goto -18 -> 38
    //   59: astore 5
    //   61: aload_1
    //   62: ifnull +7 -> 69
    //   65: aload_1
    //   66: invokevirtual 318	java/io/BufferedReader:close	()V
    //   69: ldc 239
    //   71: areturn
    //   72: aload_2
    //   73: invokevirtual 319	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   76: astore 9
    //   78: aload_1
    //   79: invokevirtual 318	java/io/BufferedReader:close	()V
    //   82: aload 9
    //   84: areturn
    //   85: astore 10
    //   87: aload 9
    //   89: areturn
    //   90: astore 12
    //   92: aconst_null
    //   93: astore_1
    //   94: aload 12
    //   96: astore_3
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 318	java/io/BufferedReader:close	()V
    //   105: aload_3
    //   106: athrow
    //   107: astore 6
    //   109: ldc 239
    //   111: areturn
    //   112: astore 4
    //   114: goto -9 -> 105
    //   117: astore_3
    //   118: goto -21 -> 97
    //   121: astore 11
    //   123: aconst_null
    //   124: astore_1
    //   125: goto -64 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   30	38	59	java/lang/Exception
    //   38	44	59	java/lang/Exception
    //   49	56	59	java/lang/Exception
    //   72	78	59	java/lang/Exception
    //   78	82	85	java/lang/Exception
    //   0	30	90	finally
    //   65	69	107	java/lang/Exception
    //   101	105	112	java/lang/Exception
    //   30	38	117	finally
    //   38	44	117	finally
    //   49	56	117	finally
    //   72	78	117	finally
    //   0	30	121	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.log.c
 * JD-Core Version:    0.6.0
 */