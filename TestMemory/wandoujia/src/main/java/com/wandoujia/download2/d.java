package com.wandoujia.download2;

import android.os.AsyncTask;

final class d extends AsyncTask<Void, Void, Boolean>
{
  d(AppV2DownloadTask2 paramAppV2DownloadTask2)
  {
  }

  // ERROR //
  private Boolean a()
  {
    // Byte code:
    //   0: new 19	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   8: getfield 25	com/wandoujia/download2/AppV2DownloadTask2:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   11: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   14: getfield 36	com/wandoujia/download2/DownloadRequestParam:e	Ljava/lang/String;
    //   17: invokespecial 39	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   20: astore_1
    //   21: aload_1
    //   22: invokestatic 45	com/wandoujia/base/utils/MD5Utils:md5Digest	(Ljava/io/InputStream;)Ljava/lang/String;
    //   25: astore 6
    //   27: invokestatic 49	com/wandoujia/download2/AppV2DownloadTask2:i	()Ljava/lang/String;
    //   30: astore 7
    //   32: iconst_2
    //   33: anewarray 51	java/lang/Object
    //   36: astore 8
    //   38: aload 8
    //   40: iconst_0
    //   41: aload_0
    //   42: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   45: invokestatic 54	com/wandoujia/download2/AppV2DownloadTask2:a	(Lcom/wandoujia/download2/AppV2DownloadTask2;)Ljava/lang/String;
    //   48: aastore
    //   49: aload 8
    //   51: iconst_1
    //   52: aload 6
    //   54: aastore
    //   55: aload 7
    //   57: ldc 56
    //   59: aload 8
    //   61: invokestatic 62	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_0
    //   65: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   68: invokestatic 54	com/wandoujia/download2/AppV2DownloadTask2:a	(Lcom/wandoujia/download2/AppV2DownloadTask2;)Ljava/lang/String;
    //   71: aload 6
    //   73: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +15 -> 91
    //   79: getstatic 74	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   82: astore 12
    //   84: aload_1
    //   85: invokevirtual 77	java/io/FileInputStream:close	()V
    //   88: aload 12
    //   90: areturn
    //   91: aload_0
    //   92: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   95: getfield 25	com/wandoujia/download2/AppV2DownloadTask2:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   98: astore 9
    //   100: iconst_2
    //   101: anewarray 51	java/lang/Object
    //   104: astore 10
    //   106: aload 10
    //   108: iconst_0
    //   109: aload_0
    //   110: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   113: invokestatic 54	com/wandoujia/download2/AppV2DownloadTask2:a	(Lcom/wandoujia/download2/AppV2DownloadTask2;)Ljava/lang/String;
    //   116: aastore
    //   117: aload 10
    //   119: iconst_1
    //   120: aload 6
    //   122: aastore
    //   123: aload 9
    //   125: new 79	java/lang/Exception
    //   128: dup
    //   129: ldc 56
    //   131: aload 10
    //   133: invokestatic 83	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   136: invokespecial 84	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   139: putfield 88	com/wandoujia/download2/DownloadInfo2:g	Ljava/lang/Exception;
    //   142: aload_1
    //   143: invokevirtual 77	java/io/FileInputStream:close	()V
    //   146: aload_0
    //   147: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   150: getfield 25	com/wandoujia/download2/AppV2DownloadTask2:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   153: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   156: getfield 36	com/wandoujia/download2/DownloadRequestParam:e	Ljava/lang/String;
    //   159: invokestatic 93	com/wandoujia/base/utils/FileUtil:deleteFile	(Ljava/lang/String;)V
    //   162: getstatic 96	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   165: areturn
    //   166: astore_2
    //   167: aconst_null
    //   168: astore_1
    //   169: aload_0
    //   170: getfield 11	com/wandoujia/download2/d:a	Lcom/wandoujia/download2/AppV2DownloadTask2;
    //   173: getfield 25	com/wandoujia/download2/AppV2DownloadTask2:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   176: aload_2
    //   177: putfield 88	com/wandoujia/download2/DownloadInfo2:g	Ljava/lang/Exception;
    //   180: aload_1
    //   181: ifnull -35 -> 146
    //   184: aload_1
    //   185: invokevirtual 77	java/io/FileInputStream:close	()V
    //   188: goto -42 -> 146
    //   191: astore 5
    //   193: goto -47 -> 146
    //   196: astore_3
    //   197: aconst_null
    //   198: astore_1
    //   199: aload_1
    //   200: ifnull +7 -> 207
    //   203: aload_1
    //   204: invokevirtual 77	java/io/FileInputStream:close	()V
    //   207: aload_3
    //   208: athrow
    //   209: astore 13
    //   211: aload 12
    //   213: areturn
    //   214: astore 11
    //   216: goto -70 -> 146
    //   219: astore 4
    //   221: goto -14 -> 207
    //   224: astore_3
    //   225: goto -26 -> 199
    //   228: astore_2
    //   229: goto -60 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   0	21	166	java/io/IOException
    //   184	188	191	java/io/IOException
    //   0	21	196	finally
    //   84	88	209	java/io/IOException
    //   142	146	214	java/io/IOException
    //   203	207	219	java/io/IOException
    //   21	84	224	finally
    //   91	142	224	finally
    //   169	180	224	finally
    //   21	84	228	java/io/IOException
    //   91	142	228	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.d
 * JD-Core Version:    0.6.0
 */