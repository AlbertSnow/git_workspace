package com.wandoujia.shared_storage;

import android.content.Context;
import android.os.FileObserver;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.FileUtil;
import java.io.File;

public abstract class b
{
  private FileObserver a = new c(this, a());

  protected b()
  {
    this.a.startWatching();
  }

  private String a()
  {
    return "/data/local/tmp/.wdj_config/" + b();
  }

  // ERROR //
  private static String a(File paramFile)
  {
    // Byte code:
    //   0: new 27	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   7: astore_1
    //   8: new 48	java/io/BufferedReader
    //   11: dup
    //   12: new 50	java/io/FileReader
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 53	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   20: invokespecial 56	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   23: astore_2
    //   24: aload_2
    //   25: invokevirtual 59	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: astore 8
    //   30: aload 8
    //   32: ifnull +31 -> 63
    //   35: aload_1
    //   36: aload 8
    //   38: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: goto -18 -> 24
    //   45: astore 5
    //   47: aload_2
    //   48: astore 6
    //   50: aload 6
    //   52: ifnull +8 -> 60
    //   55: aload 6
    //   57: invokevirtual 62	java/io/BufferedReader:close	()V
    //   60: ldc 64
    //   62: areturn
    //   63: aload_1
    //   64: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 10
    //   69: aload_2
    //   70: invokevirtual 62	java/io/BufferedReader:close	()V
    //   73: aload 10
    //   75: areturn
    //   76: astore 11
    //   78: aload 10
    //   80: areturn
    //   81: astore 13
    //   83: aconst_null
    //   84: astore_2
    //   85: aload 13
    //   87: astore_3
    //   88: aload_2
    //   89: ifnull +7 -> 96
    //   92: aload_2
    //   93: invokevirtual 62	java/io/BufferedReader:close	()V
    //   96: aload_3
    //   97: athrow
    //   98: astore 7
    //   100: goto -40 -> 60
    //   103: astore 4
    //   105: goto -9 -> 96
    //   108: astore_3
    //   109: goto -21 -> 88
    //   112: astore 12
    //   114: aconst_null
    //   115: astore 6
    //   117: goto -67 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   24	30	45	java/io/IOException
    //   35	42	45	java/io/IOException
    //   63	69	45	java/io/IOException
    //   69	73	76	java/io/IOException
    //   0	24	81	finally
    //   55	60	98	java/io/IOException
    //   92	96	103	java/io/IOException
    //   24	30	108	finally
    //   35	42	108	finally
    //   63	69	108	finally
    //   0	24	112	java/io/IOException
  }

  // ERROR //
  private static void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 67	java/io/FileOutputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 68	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   10: astore_3
    //   11: aload_3
    //   12: aload_1
    //   13: invokevirtual 74	java/lang/String:getBytes	()[B
    //   16: invokevirtual 78	java/io/FileOutputStream:write	([B)V
    //   19: aload_3
    //   20: invokevirtual 79	java/io/FileOutputStream:close	()V
    //   23: aload_3
    //   24: invokevirtual 79	java/io/FileOutputStream:close	()V
    //   27: return
    //   28: astore 10
    //   30: aconst_null
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull -6 -> 27
    //   36: aload_3
    //   37: invokevirtual 79	java/io/FileOutputStream:close	()V
    //   40: return
    //   41: astore 5
    //   43: return
    //   44: astore 7
    //   46: aload_2
    //   47: ifnull +7 -> 54
    //   50: aload_2
    //   51: invokevirtual 79	java/io/FileOutputStream:close	()V
    //   54: aload 7
    //   56: athrow
    //   57: astore 9
    //   59: return
    //   60: astore 8
    //   62: goto -8 -> 54
    //   65: astore 6
    //   67: aload_3
    //   68: astore_2
    //   69: aload 6
    //   71: astore 7
    //   73: goto -27 -> 46
    //   76: astore 4
    //   78: goto -46 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	28	java/io/IOException
    //   36	40	41	java/io/IOException
    //   2	11	44	finally
    //   23	27	57	java/io/IOException
    //   50	54	60	java/io/IOException
    //   11	23	65	finally
    //   11	23	76	java/io/IOException
  }

  private String c()
  {
    return GlobalConfig.getAppContext().getFilesDir().getAbsolutePath() + "/.storage/" + b();
  }

  private String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = StorageManager.getInstance().getExternalStorageDirectory();
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1 + "/wandoujia/.config/";
      File localFile = new File(str2);
      if ((!localFile.exists()) && (!localFile.mkdirs()));
    }
    while (true)
    {
      return str2 + b();
      str2 = null;
    }
  }

  protected abstract String b();

  protected final void c(String paramString)
  {
    a(new File(a()), paramString);
    try
    {
      Runtime.getRuntime().exec("chmod 777 /data/local/tmp/.wdj_config/");
      Runtime.getRuntime().exec("chmod 666 " + a());
      label50: File localFile = new File(c());
      localFile.getParentFile().mkdirs();
      a(localFile, paramString);
      if (StorageManager.getInstance().isStorageMounted())
        a(new File(d()), paramString);
      return;
    }
    catch (Exception localException)
    {
      break label50;
    }
  }

  protected abstract void e();

  protected final String f()
  {
    File localFile1 = new File(a());
    String str;
    if ((localFile1.exists()) && (localFile1.length() > 0L))
    {
      str = a(localFile1);
      if (TextUtils.isEmpty(str));
    }
    do
    {
      do
      {
        return str;
        if (!StorageManager.getInstance().isStorageMounted())
          break;
        File localFile2 = new File(d());
        if ((!localFile2.exists()) || (localFile2.length() <= 0L))
          break;
        str = a(localFile2);
      }
      while (!TextUtils.isEmpty(str));
      File localFile3 = new File(c());
      if ((!localFile3.exists()) || (localFile3.length() <= 0L))
        break;
      str = a(localFile3);
    }
    while (!TextUtils.isEmpty(str));
    return "";
  }

  protected final void g()
  {
    FileUtil.deleteFile(a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.b
 * JD-Core Version:    0.6.0
 */