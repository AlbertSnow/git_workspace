package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.support.v4.app.d;
import com.google.android.gms.internal.z;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Future;

public final class am extends u
{
  private volatile String a;
  private Future<String> b;

  protected am(w paramw)
  {
    super(paramw);
  }

  // ERROR //
  private String a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 20
    //   2: invokestatic 26	android/support/v4/app/d:k	(Ljava/lang/String;)V
    //   5: aload_1
    //   6: ldc 28
    //   8: invokevirtual 34	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore 12
    //   13: aload 12
    //   15: astore_3
    //   16: bipush 36
    //   18: newarray byte
    //   20: astore 14
    //   22: aload_3
    //   23: aload 14
    //   25: iconst_0
    //   26: bipush 36
    //   28: invokevirtual 40	java/io/FileInputStream:read	([BII)I
    //   31: istore 15
    //   33: aload_3
    //   34: invokevirtual 44	java/io/FileInputStream:available	()I
    //   37: ifle +42 -> 79
    //   40: aload_0
    //   41: ldc 46
    //   43: invokevirtual 49	com/google/android/gms/analytics/internal/am:f	(Ljava/lang/String;)V
    //   46: aload_3
    //   47: invokevirtual 53	java/io/FileInputStream:close	()V
    //   50: aload_1
    //   51: ldc 28
    //   53: invokevirtual 57	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   56: pop
    //   57: aload_3
    //   58: ifnull +7 -> 65
    //   61: aload_3
    //   62: invokevirtual 53	java/io/FileInputStream:close	()V
    //   65: aconst_null
    //   66: areturn
    //   67: astore 21
    //   69: aload_0
    //   70: ldc 59
    //   72: aload 21
    //   74: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   77: aconst_null
    //   78: areturn
    //   79: iload 15
    //   81: bipush 14
    //   83: if_icmpge +42 -> 125
    //   86: aload_0
    //   87: ldc 65
    //   89: invokevirtual 49	com/google/android/gms/analytics/internal/am:f	(Ljava/lang/String;)V
    //   92: aload_3
    //   93: invokevirtual 53	java/io/FileInputStream:close	()V
    //   96: aload_1
    //   97: ldc 28
    //   99: invokevirtual 57	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   102: pop
    //   103: aload_3
    //   104: ifnull -39 -> 65
    //   107: aload_3
    //   108: invokevirtual 53	java/io/FileInputStream:close	()V
    //   111: aconst_null
    //   112: areturn
    //   113: astore 19
    //   115: aload_0
    //   116: ldc 59
    //   118: aload 19
    //   120: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   123: aconst_null
    //   124: areturn
    //   125: aload_3
    //   126: invokevirtual 53	java/io/FileInputStream:close	()V
    //   129: new 67	java/lang/String
    //   132: dup
    //   133: aload 14
    //   135: iconst_0
    //   136: iload 15
    //   138: invokespecial 70	java/lang/String:<init>	([BII)V
    //   141: astore 16
    //   143: aload_0
    //   144: ldc 72
    //   146: aload 16
    //   148: invokevirtual 74	com/google/android/gms/analytics/internal/am:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   151: aload_3
    //   152: ifnull +7 -> 159
    //   155: aload_3
    //   156: invokevirtual 53	java/io/FileInputStream:close	()V
    //   159: aload 16
    //   161: areturn
    //   162: astore 17
    //   164: aload_0
    //   165: ldc 59
    //   167: aload 17
    //   169: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   172: goto -13 -> 159
    //   175: astore 9
    //   177: aconst_null
    //   178: astore 10
    //   180: aload 10
    //   182: ifnull -117 -> 65
    //   185: aload 10
    //   187: invokevirtual 53	java/io/FileInputStream:close	()V
    //   190: aconst_null
    //   191: areturn
    //   192: astore 11
    //   194: aload_0
    //   195: ldc 59
    //   197: aload 11
    //   199: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   202: aconst_null
    //   203: areturn
    //   204: astore 6
    //   206: aconst_null
    //   207: astore_3
    //   208: aload_0
    //   209: ldc 76
    //   211: aload 6
    //   213: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   216: aload_1
    //   217: ldc 28
    //   219: invokevirtual 57	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   222: pop
    //   223: aload_3
    //   224: ifnull -159 -> 65
    //   227: aload_3
    //   228: invokevirtual 53	java/io/FileInputStream:close	()V
    //   231: aconst_null
    //   232: areturn
    //   233: astore 8
    //   235: aload_0
    //   236: ldc 59
    //   238: aload 8
    //   240: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   243: aconst_null
    //   244: areturn
    //   245: astore_2
    //   246: aconst_null
    //   247: astore_3
    //   248: aload_2
    //   249: astore 4
    //   251: aload_3
    //   252: ifnull +7 -> 259
    //   255: aload_3
    //   256: invokevirtual 53	java/io/FileInputStream:close	()V
    //   259: aload 4
    //   261: athrow
    //   262: astore 5
    //   264: aload_0
    //   265: ldc 59
    //   267: aload 5
    //   269: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   272: goto -13 -> 259
    //   275: astore 4
    //   277: goto -26 -> 251
    //   280: astore 6
    //   282: goto -74 -> 208
    //   285: astore 13
    //   287: aload_3
    //   288: astore 10
    //   290: goto -110 -> 180
    //
    // Exception table:
    //   from	to	target	type
    //   61	65	67	java/io/IOException
    //   107	111	113	java/io/IOException
    //   155	159	162	java/io/IOException
    //   5	13	175	java/io/FileNotFoundException
    //   185	190	192	java/io/IOException
    //   5	13	204	java/io/IOException
    //   227	231	233	java/io/IOException
    //   5	13	245	finally
    //   255	259	262	java/io/IOException
    //   16	57	275	finally
    //   86	103	275	finally
    //   125	151	275	finally
    //   208	223	275	finally
    //   16	57	280	java/io/IOException
    //   86	103	280	java/io/IOException
    //   125	151	280	java/io/IOException
    //   16	57	285	java/io/FileNotFoundException
    //   86	103	285	java/io/FileNotFoundException
    //   125	151	285	java/io/FileNotFoundException
  }

  private boolean a(Context paramContext, String paramString)
  {
    d.i(paramString);
    d.k("ClientId should be saved from worker thread");
    FileOutputStream localFileOutputStream = null;
    try
    {
      a("Storing clientId", paramString);
      localFileOutputStream = paramContext.openFileOutput("gaClientId", 0);
      localFileOutputStream.write(paramString.getBytes());
      if (localFileOutputStream != null);
      try
      {
        localFileOutputStream.close();
        i = 1;
        return i;
      }
      catch (IOException localIOException5)
      {
        while (true)
          e("Failed to close clientId writing stream", localIOException5);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      do
      {
        e("Error creating clientId file", localFileNotFoundException);
        i = 0;
      }
      while (localFileOutputStream == null);
      try
      {
        localFileOutputStream.close();
        return false;
      }
      catch (IOException localIOException4)
      {
        e("Failed to close clientId writing stream", localIOException4);
        return false;
      }
    }
    catch (IOException localIOException2)
    {
      do
      {
        e("Error writing to clientId file", localIOException2);
        int i = 0;
      }
      while (localFileOutputStream == null);
      try
      {
        localFileOutputStream.close();
        return false;
      }
      catch (IOException localIOException3)
      {
        e("Failed to close clientId writing stream", localIOException3);
        return false;
      }
    }
    finally
    {
      if (localFileOutputStream == null);
    }
    try
    {
      localFileOutputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        e("Failed to close clientId writing stream", localIOException1);
    }
  }

  private String e()
  {
    String str = UUID.randomUUID().toString().toLowerCase();
    try
    {
      if (!a(n().c(), str))
        str = "0";
      return str;
    }
    catch (Exception localException)
    {
      e("Error saving clientId file", localException);
    }
    return "0";
  }

  protected final void a()
  {
  }

  // ERROR //
  public final String b()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 147	com/google/android/gms/analytics/internal/am:z	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   10: ifnonnull +22 -> 32
    //   13: aload_0
    //   14: aload_0
    //   15: invokevirtual 128	com/google/android/gms/analytics/internal/am:n	()Lcom/google/android/gms/internal/z;
    //   18: new 151	com/google/android/gms/analytics/internal/an
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 154	com/google/android/gms/analytics/internal/an:<init>	(Lcom/google/android/gms/analytics/internal/am;)V
    //   26: invokevirtual 157	com/google/android/gms/internal/z:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   29: putfield 159	com/google/android/gms/analytics/internal/am:b	Ljava/util/concurrent/Future;
    //   32: aload_0
    //   33: getfield 159	com/google/android/gms/analytics/internal/am:b	Ljava/util/concurrent/Future;
    //   36: astore_2
    //   37: aload_2
    //   38: ifnull +47 -> 85
    //   41: aload_0
    //   42: aload_0
    //   43: getfield 159	com/google/android/gms/analytics/internal/am:b	Ljava/util/concurrent/Future;
    //   46: invokeinterface 165 1 0
    //   51: checkcast 67	java/lang/String
    //   54: putfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   57: aload_0
    //   58: getfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   61: ifnonnull +9 -> 70
    //   64: aload_0
    //   65: ldc 138
    //   67: putfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   70: aload_0
    //   71: ldc 167
    //   73: aload_0
    //   74: getfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   77: invokevirtual 74	com/google/android/gms/analytics/internal/am:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield 159	com/google/android/gms/analytics/internal/am:b	Ljava/util/concurrent/Future;
    //   85: aload_0
    //   86: getfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   89: astore_3
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_3
    //   93: areturn
    //   94: astore 5
    //   96: aload_0
    //   97: ldc 169
    //   99: aload 5
    //   101: invokevirtual 172	com/google/android/gms/analytics/internal/am:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   104: aload_0
    //   105: ldc 138
    //   107: putfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   110: goto -53 -> 57
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    //   118: astore 4
    //   120: aload_0
    //   121: ldc 174
    //   123: aload 4
    //   125: invokevirtual 63	com/google/android/gms/analytics/internal/am:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   128: aload_0
    //   129: ldc 138
    //   131: putfield 149	com/google/android/gms/analytics/internal/am:a	Ljava/lang/String;
    //   134: goto -77 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   41	57	94	java/lang/InterruptedException
    //   6	32	113	finally
    //   32	37	113	finally
    //   41	57	113	finally
    //   57	70	113	finally
    //   70	85	113	finally
    //   85	92	113	finally
    //   96	110	113	finally
    //   114	116	113	finally
    //   120	134	113	finally
    //   41	57	118	java/util/concurrent/ExecutionException
  }

  final String c()
  {
    monitorenter;
    try
    {
      this.a = null;
      this.b = n().a(new ao(this));
      return b();
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final String d()
  {
    String str = a(n().c());
    if (str == null)
      str = e();
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.am
 * JD-Core Version:    0.6.0
 */