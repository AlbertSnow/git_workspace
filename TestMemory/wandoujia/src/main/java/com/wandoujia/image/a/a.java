package com.wandoujia.image.a;

import android.os.FileObserver;
import com.android.volley.n;
import com.android.volley.toolbox.d;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class a extends d
{
  private Set<String> c = new HashSet();
  private FileObserver d = new b(this, this.b.getAbsolutePath());

  static
  {
    a.class.getSimpleName();
  }

  public a(File paramFile, int paramInt)
  {
    super(paramFile, paramInt);
    this.d.startWatching();
  }

  // ERROR //
  private void a(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 62	java/io/FileInputStream
    //   5: dup
    //   6: aload_1
    //   7: invokespecial 64	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 68	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   15: lconst_0
    //   16: ldc2_w 69
    //   19: iconst_1
    //   20: invokevirtual 76	java/nio/channels/FileChannel:lock	(JJZ)Ljava/nio/channels/FileLock;
    //   23: astore 19
    //   25: aload 19
    //   27: astore_2
    //   28: aload_3
    //   29: invokestatic 81	com/wandoujia/p4/app/c/a:a	(Ljava/io/InputStream;)Lcom/wandoujia/p4/app/c/a;
    //   32: astore 21
    //   34: aload 21
    //   36: aload_1
    //   37: invokevirtual 85	java/io/File:length	()J
    //   40: putfield 88	com/wandoujia/p4/app/c/a:a	J
    //   43: aload_0
    //   44: aload 21
    //   46: getfield 91	com/wandoujia/p4/app/c/a:b	Ljava/lang/String;
    //   49: aload 21
    //   51: invokevirtual 94	com/wandoujia/image/a/a:a	(Ljava/lang/String;Lcom/wandoujia/p4/app/c/a;)V
    //   54: aload_2
    //   55: ifnull +7 -> 62
    //   58: aload_2
    //   59: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   62: aload_3
    //   63: invokevirtual 102	java/io/FileInputStream:close	()V
    //   66: return
    //   67: astore 27
    //   69: aconst_null
    //   70: astore 5
    //   72: aload_1
    //   73: ifnull +8 -> 81
    //   76: aload_1
    //   77: invokevirtual 106	java/io/File:delete	()Z
    //   80: pop
    //   81: aload_2
    //   82: ifnull +7 -> 89
    //   85: aload_2
    //   86: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   89: aload 5
    //   91: ifnull -25 -> 66
    //   94: aload 5
    //   96: invokevirtual 102	java/io/FileInputStream:close	()V
    //   99: return
    //   100: astore 6
    //   102: return
    //   103: astore 26
    //   105: aconst_null
    //   106: astore_3
    //   107: aload 26
    //   109: astore 12
    //   111: aconst_null
    //   112: astore 11
    //   114: aload 11
    //   116: ifnull +8 -> 124
    //   119: aload 11
    //   121: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   124: aload_3
    //   125: ifnull +7 -> 132
    //   128: aload_3
    //   129: invokevirtual 102	java/io/FileInputStream:close	()V
    //   132: aload 12
    //   134: athrow
    //   135: astore 25
    //   137: goto -75 -> 62
    //   140: astore 24
    //   142: goto -80 -> 62
    //   145: astore 23
    //   147: goto -85 -> 62
    //   150: astore 22
    //   152: return
    //   153: astore 9
    //   155: goto -66 -> 89
    //   158: astore 8
    //   160: goto -71 -> 89
    //   163: astore 7
    //   165: goto -76 -> 89
    //   168: astore 16
    //   170: goto -46 -> 124
    //   173: astore 15
    //   175: goto -51 -> 124
    //   178: astore 14
    //   180: goto -56 -> 124
    //   183: astore 13
    //   185: goto -53 -> 132
    //   188: astore 18
    //   190: aload 18
    //   192: astore 12
    //   194: aconst_null
    //   195: astore 11
    //   197: goto -83 -> 114
    //   200: astore 20
    //   202: aload_2
    //   203: astore 11
    //   205: aload 20
    //   207: astore 12
    //   209: goto -95 -> 114
    //   212: astore 10
    //   214: aload 5
    //   216: astore_3
    //   217: aload_2
    //   218: astore 11
    //   220: aload 10
    //   222: astore 12
    //   224: goto -110 -> 114
    //   227: astore 4
    //   229: aload_3
    //   230: astore 5
    //   232: goto -160 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	67	java/io/IOException
    //   94	99	100	java/io/IOException
    //   2	11	103	finally
    //   58	62	135	java/nio/channels/ClosedChannelException
    //   58	62	140	java/io/IOException
    //   58	62	145	java/lang/IllegalMonitorStateException
    //   62	66	150	java/io/IOException
    //   85	89	153	java/nio/channels/ClosedChannelException
    //   85	89	158	java/io/IOException
    //   85	89	163	java/lang/IllegalMonitorStateException
    //   119	124	168	java/nio/channels/ClosedChannelException
    //   119	124	173	java/io/IOException
    //   119	124	178	java/lang/IllegalMonitorStateException
    //   128	132	183	java/io/IOException
    //   11	25	188	finally
    //   28	54	200	finally
    //   76	81	212	finally
    //   11	25	227	java/io/IOException
    //   28	54	227	java/io/IOException
  }

  // ERROR //
  public final com.wandoujia.log.toolkit.LaunchLogger a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 115	com/wandoujia/image/a/a:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 121 2 0
    //   12: checkcast 78	com/wandoujia/p4/app/c/a
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +11 -> 28
    //   20: aconst_null
    //   21: astore 15
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 15
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 124	com/wandoujia/image/a/a:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 62	java/io/FileInputStream
    //   38: dup
    //   39: aload 4
    //   41: invokespecial 64	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: astore 5
    //   46: aload 5
    //   48: invokevirtual 68	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   51: lconst_0
    //   52: ldc2_w 69
    //   55: iconst_1
    //   56: invokevirtual 76	java/nio/channels/FileChannel:lock	(JJZ)Ljava/nio/channels/FileLock;
    //   59: astore 26
    //   61: aload 26
    //   63: astore 7
    //   65: new 126	com/android/volley/toolbox/e
    //   68: dup
    //   69: aload 5
    //   71: invokespecial 129	com/android/volley/toolbox/e:<init>	(Ljava/io/InputStream;)V
    //   74: astore 8
    //   76: aload 8
    //   78: invokestatic 81	com/wandoujia/p4/app/c/a:a	(Ljava/io/InputStream;)Lcom/wandoujia/p4/app/c/a;
    //   81: pop
    //   82: aload_3
    //   83: aload 8
    //   85: aload 4
    //   87: invokevirtual 85	java/io/File:length	()J
    //   90: aload 8
    //   92: getfield 132	com/android/volley/toolbox/e:a	I
    //   95: i2l
    //   96: lsub
    //   97: l2i
    //   98: invokestatic 135	com/wandoujia/image/a/a:a	(Ljava/io/InputStream;I)[B
    //   101: invokevirtual 138	com/wandoujia/p4/app/c/a:a	([B)Lcom/wandoujia/log/toolkit/LaunchLogger;
    //   104: astore 28
    //   106: aload 28
    //   108: astore 15
    //   110: aload 7
    //   112: ifnull +8 -> 120
    //   115: aload 7
    //   117: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   120: aload 8
    //   122: invokevirtual 139	com/android/volley/toolbox/e:close	()V
    //   125: goto -102 -> 23
    //   128: astore 29
    //   130: goto -107 -> 23
    //   133: astore 20
    //   135: aconst_null
    //   136: astore 7
    //   138: aconst_null
    //   139: astore 8
    //   141: iconst_2
    //   142: anewarray 141	java/lang/Object
    //   145: astore 21
    //   147: aload 21
    //   149: iconst_0
    //   150: aload 4
    //   152: invokevirtual 38	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   155: aastore
    //   156: aload 21
    //   158: iconst_1
    //   159: aload 20
    //   161: invokevirtual 144	java/lang/Exception:toString	()Ljava/lang/String;
    //   164: aastore
    //   165: ldc 146
    //   167: aload 21
    //   169: invokestatic 151	com/android/volley/n:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_0
    //   173: aload_1
    //   174: invokevirtual 154	com/wandoujia/image/a/a:b	(Ljava/lang/String;)V
    //   177: aload 7
    //   179: ifnull +8 -> 187
    //   182: aload 7
    //   184: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   187: aload 8
    //   189: ifnull +8 -> 197
    //   192: aload 8
    //   194: invokevirtual 139	com/android/volley/toolbox/e:close	()V
    //   197: aconst_null
    //   198: astore 15
    //   200: goto -177 -> 23
    //   203: astore 13
    //   205: aconst_null
    //   206: astore 7
    //   208: aconst_null
    //   209: astore 8
    //   211: iconst_2
    //   212: anewarray 141	java/lang/Object
    //   215: astore 14
    //   217: aload 14
    //   219: iconst_0
    //   220: aload 4
    //   222: invokevirtual 38	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   225: aastore
    //   226: aload 14
    //   228: iconst_1
    //   229: aload 13
    //   231: invokevirtual 155	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   234: aastore
    //   235: ldc 146
    //   237: aload 14
    //   239: invokestatic 151	com/android/volley/n:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: aload_0
    //   243: aload_1
    //   244: invokevirtual 154	com/wandoujia/image/a/a:b	(Ljava/lang/String;)V
    //   247: aload 7
    //   249: ifnull +8 -> 257
    //   252: aload 7
    //   254: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   257: aload 8
    //   259: ifnull +8 -> 267
    //   262: aload 8
    //   264: invokevirtual 139	com/android/volley/toolbox/e:close	()V
    //   267: aconst_null
    //   268: astore 15
    //   270: goto -247 -> 23
    //   273: astore 6
    //   275: aconst_null
    //   276: astore 7
    //   278: aconst_null
    //   279: astore 8
    //   281: aload 7
    //   283: ifnull +8 -> 291
    //   286: aload 7
    //   288: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   291: aload 8
    //   293: ifnull +8 -> 301
    //   296: aload 8
    //   298: invokevirtual 139	com/android/volley/toolbox/e:close	()V
    //   301: aload 6
    //   303: athrow
    //   304: astore_2
    //   305: aload_0
    //   306: monitorexit
    //   307: aload_2
    //   308: athrow
    //   309: astore 32
    //   311: goto -191 -> 120
    //   314: astore 31
    //   316: goto -196 -> 120
    //   319: astore 30
    //   321: goto -201 -> 120
    //   324: astore 25
    //   326: goto -139 -> 187
    //   329: astore 24
    //   331: goto -144 -> 187
    //   334: astore 23
    //   336: goto -149 -> 187
    //   339: astore 22
    //   341: goto -144 -> 197
    //   344: astore 19
    //   346: goto -89 -> 257
    //   349: astore 18
    //   351: goto -94 -> 257
    //   354: astore 17
    //   356: goto -99 -> 257
    //   359: astore 16
    //   361: goto -94 -> 267
    //   364: astore 12
    //   366: goto -75 -> 291
    //   369: astore 11
    //   371: goto -80 -> 291
    //   374: astore 10
    //   376: goto -85 -> 291
    //   379: astore 9
    //   381: goto -80 -> 301
    //   384: astore 6
    //   386: aconst_null
    //   387: astore 8
    //   389: goto -108 -> 281
    //   392: astore 6
    //   394: goto -113 -> 281
    //   397: astore 13
    //   399: aconst_null
    //   400: astore 8
    //   402: goto -191 -> 211
    //   405: astore 13
    //   407: goto -196 -> 211
    //   410: astore 20
    //   412: aconst_null
    //   413: astore 8
    //   415: goto -274 -> 141
    //   418: astore 20
    //   420: goto -279 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   120	125	128	java/io/IOException
    //   35	61	133	java/lang/Exception
    //   35	61	203	java/lang/OutOfMemoryError
    //   35	61	273	finally
    //   2	16	304	finally
    //   28	35	304	finally
    //   115	120	304	finally
    //   120	125	304	finally
    //   182	187	304	finally
    //   192	197	304	finally
    //   252	257	304	finally
    //   262	267	304	finally
    //   286	291	304	finally
    //   296	301	304	finally
    //   301	304	304	finally
    //   115	120	309	java/nio/channels/ClosedChannelException
    //   115	120	314	java/io/IOException
    //   115	120	319	java/lang/IllegalMonitorStateException
    //   182	187	324	java/nio/channels/ClosedChannelException
    //   182	187	329	java/io/IOException
    //   182	187	334	java/lang/IllegalMonitorStateException
    //   192	197	339	java/io/IOException
    //   252	257	344	java/nio/channels/ClosedChannelException
    //   252	257	349	java/io/IOException
    //   252	257	354	java/lang/IllegalMonitorStateException
    //   262	267	359	java/io/IOException
    //   286	291	364	java/nio/channels/ClosedChannelException
    //   286	291	369	java/io/IOException
    //   286	291	374	java/lang/IllegalMonitorStateException
    //   296	301	379	java/io/IOException
    //   65	76	384	finally
    //   76	106	392	finally
    //   141	177	392	finally
    //   211	247	392	finally
    //   65	76	397	java/lang/OutOfMemoryError
    //   76	106	405	java/lang/OutOfMemoryError
    //   65	76	410	java/lang/Exception
    //   76	106	418	java/lang/Exception
  }

  public final void a()
  {
    int i = 0;
    monitorenter;
    try
    {
      if (!this.b.exists())
        if (!this.b.mkdirs())
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.b.getAbsolutePath();
          n.c("Unable to create cache dir %s", arrayOfObject);
        }
      while (true)
      {
        return;
        File[] arrayOfFile = this.b.listFiles();
        if (arrayOfFile == null)
          continue;
        int j = arrayOfFile.length;
        while (i < j)
        {
          a(arrayOfFile[i]);
          i++;
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public final void a(String paramString, com.wandoujia.log.toolkit.LaunchLogger paramLaunchLogger)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: aload_2
    //   6: getfield 175	com/wandoujia/log/toolkit/LaunchLogger:a	[B
    //   9: arraylength
    //   10: invokevirtual 178	com/wandoujia/image/a/a:a	(I)V
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual 124	com/wandoujia/image/a/a:d	(Ljava/lang/String;)Ljava/io/File;
    //   18: astore 5
    //   20: new 180	java/io/FileOutputStream
    //   23: dup
    //   24: aload 5
    //   26: invokespecial 181	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: astore 6
    //   31: aload 6
    //   33: invokevirtual 182	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   36: invokevirtual 185	java/nio/channels/FileChannel:lock	()Ljava/nio/channels/FileLock;
    //   39: astore 20
    //   41: aload 20
    //   43: astore_3
    //   44: new 78	com/wandoujia/p4/app/c/a
    //   47: dup
    //   48: aload_1
    //   49: aload_2
    //   50: invokespecial 187	com/wandoujia/p4/app/c/a:<init>	(Ljava/lang/String;Lcom/wandoujia/log/toolkit/LaunchLogger;)V
    //   53: astore 21
    //   55: aload 21
    //   57: aload 6
    //   59: invokevirtual 190	com/wandoujia/p4/app/c/a:a	(Ljava/io/OutputStream;)Z
    //   62: pop
    //   63: aload 6
    //   65: aload_2
    //   66: getfield 175	com/wandoujia/log/toolkit/LaunchLogger:a	[B
    //   69: invokevirtual 194	java/io/FileOutputStream:write	([B)V
    //   72: aload_0
    //   73: getfield 27	com/wandoujia/image/a/a:c	Ljava/util/Set;
    //   76: aload 5
    //   78: invokevirtual 197	java/io/File:getName	()Ljava/lang/String;
    //   81: invokeinterface 203 2 0
    //   86: pop
    //   87: aload_0
    //   88: aload_1
    //   89: aload 21
    //   91: invokevirtual 94	com/wandoujia/image/a/a:a	(Ljava/lang/String;Lcom/wandoujia/p4/app/c/a;)V
    //   94: aload_3
    //   95: ifnull +7 -> 102
    //   98: aload_3
    //   99: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   102: aload 6
    //   104: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   107: aload_0
    //   108: monitorexit
    //   109: return
    //   110: astore 29
    //   112: aconst_null
    //   113: astore 6
    //   115: aload_3
    //   116: ifnull +7 -> 123
    //   119: aload_3
    //   120: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   123: aload 6
    //   125: ifnull +8 -> 133
    //   128: aload 6
    //   130: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   133: aload 5
    //   135: invokevirtual 106	java/io/File:delete	()Z
    //   138: ifne -31 -> 107
    //   141: iconst_1
    //   142: anewarray 141	java/lang/Object
    //   145: astore 8
    //   147: aload 8
    //   149: iconst_0
    //   150: aload 5
    //   152: invokevirtual 38	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   155: aastore
    //   156: ldc 206
    //   158: aload 8
    //   160: invokestatic 151	com/android/volley/n:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: goto -56 -> 107
    //   166: astore 4
    //   168: aload_0
    //   169: monitorexit
    //   170: aload 4
    //   172: athrow
    //   173: astore 14
    //   175: aconst_null
    //   176: astore 15
    //   178: aload 15
    //   180: ifnull +8 -> 188
    //   183: aload 15
    //   185: invokevirtual 99	java/nio/channels/FileLock:release	()V
    //   188: aload_3
    //   189: ifnull +7 -> 196
    //   192: aload_3
    //   193: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   196: aload 14
    //   198: athrow
    //   199: astore 28
    //   201: goto -99 -> 102
    //   204: astore 27
    //   206: goto -104 -> 102
    //   209: astore 26
    //   211: goto -109 -> 102
    //   214: astore 25
    //   216: goto -109 -> 107
    //   219: astore 12
    //   221: goto -98 -> 123
    //   224: astore 11
    //   226: goto -103 -> 123
    //   229: astore 10
    //   231: goto -108 -> 123
    //   234: astore 9
    //   236: goto -103 -> 133
    //   239: astore 19
    //   241: goto -53 -> 188
    //   244: astore 18
    //   246: goto -58 -> 188
    //   249: astore 17
    //   251: goto -63 -> 188
    //   254: astore 16
    //   256: goto -60 -> 196
    //   259: astore 13
    //   261: aload 6
    //   263: astore_3
    //   264: aload 13
    //   266: astore 14
    //   268: aconst_null
    //   269: astore 15
    //   271: goto -93 -> 178
    //   274: astore 22
    //   276: aload_3
    //   277: astore 15
    //   279: aload 6
    //   281: astore_3
    //   282: aload 22
    //   284: astore 14
    //   286: goto -108 -> 178
    //   289: astore 7
    //   291: goto -176 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   20	31	110	java/io/IOException
    //   4	20	166	finally
    //   98	102	166	finally
    //   102	107	166	finally
    //   119	123	166	finally
    //   128	133	166	finally
    //   133	163	166	finally
    //   183	188	166	finally
    //   192	196	166	finally
    //   196	199	166	finally
    //   20	31	173	finally
    //   98	102	199	java/nio/channels/ClosedChannelException
    //   98	102	204	java/io/IOException
    //   98	102	209	java/lang/IllegalMonitorStateException
    //   102	107	214	java/io/IOException
    //   119	123	219	java/nio/channels/ClosedChannelException
    //   119	123	224	java/io/IOException
    //   119	123	229	java/lang/IllegalMonitorStateException
    //   128	133	234	java/io/IOException
    //   183	188	239	java/nio/channels/ClosedChannelException
    //   183	188	244	java/io/IOException
    //   183	188	249	java/lang/IllegalMonitorStateException
    //   192	196	254	java/io/IOException
    //   31	41	259	finally
    //   44	94	274	finally
    //   31	41	289	java/io/IOException
    //   44	94	289	java/io/IOException
  }

  public final void b(String paramString)
  {
    monitorenter;
    try
    {
      super.b(paramString);
      this.c.remove(c(paramString));
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.a.a
 * JD-Core Version:    0.6.0
 */