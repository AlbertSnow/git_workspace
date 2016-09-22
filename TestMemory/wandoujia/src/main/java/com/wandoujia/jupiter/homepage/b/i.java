package com.wandoujia.jupiter.homepage.b;

import android.graphics.Bitmap;
import android.os.AsyncTask;

final class i extends AsyncTask<Void, Void, Void>
{
  private Bitmap a;
  private String b;

  public i(Bitmap paramBitmap, String paramString)
  {
    this.a = paramBitmap;
    this.b = paramString;
  }

  // ERROR //
  private Void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 18	com/wandoujia/jupiter/homepage/b/i:b	Ljava/lang/String;
    //   6: invokestatic 26	com/wandoujia/jupiter/homepage/b/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_2
    //   10: new 28	java/io/File
    //   13: dup
    //   14: aload_2
    //   15: invokespecial 31	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: astore_3
    //   19: aload_3
    //   20: invokevirtual 35	java/io/File:exists	()Z
    //   23: ifeq +14 -> 37
    //   26: aload_3
    //   27: invokevirtual 39	java/io/File:length	()J
    //   30: lconst_0
    //   31: lcmp
    //   32: ifle +5 -> 37
    //   35: aconst_null
    //   36: areturn
    //   37: aload_3
    //   38: invokevirtual 43	java/io/File:getParentFile	()Ljava/io/File;
    //   41: invokevirtual 46	java/io/File:mkdirs	()Z
    //   44: pop
    //   45: new 28	java/io/File
    //   48: dup
    //   49: new 48	java/lang/StringBuilder
    //   52: dup
    //   53: invokespecial 49	java/lang/StringBuilder:<init>	()V
    //   56: aload_2
    //   57: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: ldc 55
    //   62: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokespecial 31	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 5
    //   73: new 61	java/io/FileOutputStream
    //   76: dup
    //   77: aload 5
    //   79: invokespecial 64	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   82: astore 6
    //   84: aload_0
    //   85: getfield 16	com/wandoujia/jupiter/homepage/b/i:a	Landroid/graphics/Bitmap;
    //   88: getstatic 70	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   91: bipush 90
    //   93: aload 6
    //   95: invokevirtual 76	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   98: pop
    //   99: aload 6
    //   101: invokevirtual 79	java/io/FileOutputStream:flush	()V
    //   104: aload 5
    //   106: aload_3
    //   107: invokevirtual 83	java/io/File:renameTo	(Ljava/io/File;)Z
    //   110: pop
    //   111: aload 6
    //   113: invokevirtual 86	java/io/FileOutputStream:close	()V
    //   116: aconst_null
    //   117: areturn
    //   118: astore 14
    //   120: aconst_null
    //   121: areturn
    //   122: astore 15
    //   124: aconst_null
    //   125: astore 6
    //   127: aload 6
    //   129: ifnull -94 -> 35
    //   132: aload 6
    //   134: invokevirtual 86	java/io/FileOutputStream:close	()V
    //   137: aconst_null
    //   138: areturn
    //   139: astore 8
    //   141: aconst_null
    //   142: areturn
    //   143: astore 10
    //   145: aload_1
    //   146: ifnull +7 -> 153
    //   149: aload_1
    //   150: invokevirtual 86	java/io/FileOutputStream:close	()V
    //   153: aload 10
    //   155: athrow
    //   156: astore 11
    //   158: goto -5 -> 153
    //   161: astore 9
    //   163: aload 6
    //   165: astore_1
    //   166: aload 9
    //   168: astore 10
    //   170: goto -25 -> 145
    //   173: astore 7
    //   175: goto -48 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   111	116	118	java/io/IOException
    //   73	84	122	java/io/IOException
    //   132	137	139	java/io/IOException
    //   73	84	143	finally
    //   149	153	156	java/io/IOException
    //   84	111	161	finally
    //   84	111	173	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.i
 * JD-Core Version:    0.6.0
 */