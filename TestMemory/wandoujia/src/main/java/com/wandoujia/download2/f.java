package com.wandoujia.download2;

import android.os.AsyncTask;

final class f extends AsyncTask<Void, Void, Boolean>
{
  f(e parame)
  {
  }

  // ERROR //
  private Boolean a()
  {
    // Byte code:
    //   0: new 19	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   8: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   11: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   14: getfield 36	com/wandoujia/download2/DownloadRequestParam:e	Ljava/lang/String;
    //   17: invokespecial 39	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   20: astore_1
    //   21: aload_1
    //   22: invokestatic 45	com/wandoujia/base/utils/MD5Utils:md5Digest	(Ljava/io/InputStream;)Ljava/lang/String;
    //   25: astore 6
    //   27: invokestatic 49	com/wandoujia/download2/e:i	()Ljava/lang/String;
    //   30: astore 7
    //   32: iconst_2
    //   33: anewarray 51	java/lang/Object
    //   36: astore 8
    //   38: aload 8
    //   40: iconst_0
    //   41: aload_0
    //   42: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   45: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   48: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   51: getfield 54	com/wandoujia/download2/DownloadRequestParam:g	Ljava/lang/String;
    //   54: aastore
    //   55: aload 8
    //   57: iconst_1
    //   58: aload 6
    //   60: aastore
    //   61: aload 7
    //   63: ldc 56
    //   65: aload 8
    //   67: invokestatic 62	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aload_0
    //   71: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   74: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   77: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   80: getfield 54	com/wandoujia/download2/DownloadRequestParam:g	Ljava/lang/String;
    //   83: aload 6
    //   85: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   88: ifeq +15 -> 103
    //   91: getstatic 74	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   94: astore 12
    //   96: aload_1
    //   97: invokevirtual 77	java/io/FileInputStream:close	()V
    //   100: aload 12
    //   102: areturn
    //   103: aload_0
    //   104: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   107: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   110: astore 9
    //   112: iconst_2
    //   113: anewarray 51	java/lang/Object
    //   116: astore 10
    //   118: aload 10
    //   120: iconst_0
    //   121: aload_0
    //   122: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   125: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   128: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   131: getfield 54	com/wandoujia/download2/DownloadRequestParam:g	Ljava/lang/String;
    //   134: aastore
    //   135: aload 10
    //   137: iconst_1
    //   138: aload 6
    //   140: aastore
    //   141: aload 9
    //   143: new 79	java/lang/Exception
    //   146: dup
    //   147: ldc 56
    //   149: aload 10
    //   151: invokestatic 83	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   154: invokespecial 84	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   157: putfield 87	com/wandoujia/download2/DownloadInfo2:g	Ljava/lang/Exception;
    //   160: aload_1
    //   161: invokevirtual 77	java/io/FileInputStream:close	()V
    //   164: aload_0
    //   165: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   168: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   171: getfield 30	com/wandoujia/download2/DownloadInfo2:a	Lcom/wandoujia/download2/DownloadRequestParam;
    //   174: getfield 36	com/wandoujia/download2/DownloadRequestParam:e	Ljava/lang/String;
    //   177: invokestatic 92	com/wandoujia/base/utils/FileUtil:deleteFile	(Ljava/lang/String;)V
    //   180: getstatic 95	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   183: areturn
    //   184: astore_2
    //   185: aconst_null
    //   186: astore_1
    //   187: aload_0
    //   188: getfield 11	com/wandoujia/download2/f:a	Lcom/wandoujia/download2/e;
    //   191: getfield 25	com/wandoujia/download2/e:c	Lcom/wandoujia/download2/DownloadInfo2;
    //   194: aload_2
    //   195: putfield 87	com/wandoujia/download2/DownloadInfo2:g	Ljava/lang/Exception;
    //   198: aload_1
    //   199: ifnull -35 -> 164
    //   202: aload_1
    //   203: invokevirtual 77	java/io/FileInputStream:close	()V
    //   206: goto -42 -> 164
    //   209: astore 5
    //   211: goto -47 -> 164
    //   214: astore_3
    //   215: aconst_null
    //   216: astore_1
    //   217: aload_1
    //   218: ifnull +7 -> 225
    //   221: aload_1
    //   222: invokevirtual 77	java/io/FileInputStream:close	()V
    //   225: aload_3
    //   226: athrow
    //   227: astore 13
    //   229: aload 12
    //   231: areturn
    //   232: astore 11
    //   234: goto -70 -> 164
    //   237: astore 4
    //   239: goto -14 -> 225
    //   242: astore_3
    //   243: goto -26 -> 217
    //   246: astore_2
    //   247: goto -60 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   0	21	184	java/io/IOException
    //   202	206	209	java/io/IOException
    //   0	21	214	finally
    //   96	100	227	java/io/IOException
    //   160	164	232	java/io/IOException
    //   221	225	237	java/io/IOException
    //   21	96	242	finally
    //   103	160	242	finally
    //   187	198	242	finally
    //   21	96	246	java/io/IOException
    //   103	160	246	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.f
 * JD-Core Version:    0.6.0
 */