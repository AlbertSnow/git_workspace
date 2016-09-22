package com.tencent.open.a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.text.format.Time;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public final class a extends i
  implements Handler.Callback
{
  private b a;
  private FileWriter b;
  private File c;
  private char[] d;
  private volatile g e;
  private volatile g f;
  private volatile g g;
  private volatile g h;
  private volatile boolean i = false;
  private HandlerThread j;
  private Handler k;

  private a(int paramInt, h paramh, b paramb)
  {
    super(paramInt);
    this.a = paramb;
    this.e = new g();
    this.f = new g();
    this.g = this.e;
    this.h = this.f;
    this.d = new char[paramb.c()];
    a();
    this.j = new HandlerThread(paramb.b(), paramb.d());
    if (this.j != null)
      this.j.start();
    if ((this.j.isAlive()) && (this.j.getLooper() != null))
      this.k = new Handler(this.j.getLooper(), this);
  }

  public a(b paramb)
  {
    this(c.b, h.a, paramb);
  }

  private Writer a()
  {
    File localFile = this.a.a();
    if (((localFile != null) && (!localFile.equals(this.c))) || ((this.b == null) && (localFile != null)))
      this.c = localFile;
    try
    {
      if (this.b != null)
      {
        this.b.flush();
        this.b.close();
      }
      try
      {
        label60: this.b = new FileWriter(this.c, true);
        return this.b;
      }
      catch (IOException localIOException2)
      {
        return null;
      }
    }
    catch (IOException localIOException1)
    {
      break label60;
    }
  }

  protected final void a(int paramInt, Thread paramThread, long paramLong, String paramString1, String paramString2, Throwable paramThrowable)
  {
    long l = paramLong % 1000L;
    Time localTime = new Time();
    localTime.set(paramLong);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(h.a(paramInt)).append('/').append(localTime.format("%Y-%m-%d %H:%M:%S")).append('.');
    if (l < 10L)
    {
      localStringBuilder.append("00");
      localStringBuilder.append(l).append(' ').append('[');
      if (paramThread != null)
        break label261;
      localStringBuilder.append("N/A");
    }
    while (true)
    {
      localStringBuilder.append(']').append('[').append(paramString1).append(']').append(' ').append(paramString2).append('\n');
      if (paramThrowable != null)
        localStringBuilder.append("* Exception : \n").append(Log.getStackTraceString(paramThrowable)).append('\n');
      String str = localStringBuilder.toString();
      this.g.a(str);
      if (this.g.a() >= this.a.c())
      {
        if (this.k.hasMessages(1024))
          this.k.removeMessages(1024);
        this.k.sendEmptyMessage(1024);
      }
      return;
      if (l >= 100L)
        break;
      localStringBuilder.append('0');
      break;
      label261: localStringBuilder.append(paramThread.getName());
    }
  }

  // ERROR //
  public final boolean handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 204	android/os/Message:what	I
    //   4: tableswitch	default:+20 -> 24, 1024:+22->26
    //   25: ireturn
    //   26: invokestatic 208	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   29: aload_0
    //   30: getfield 69	com/tencent/open/a/a:j	Landroid/os/HandlerThread;
    //   33: if_acmpne -9 -> 24
    //   36: aload_0
    //   37: getfield 32	com/tencent/open/a/a:i	Z
    //   40: ifne -16 -> 24
    //   43: aload_0
    //   44: iconst_1
    //   45: putfield 32	com/tencent/open/a/a:i	Z
    //   48: aload_0
    //   49: monitorenter
    //   50: aload_0
    //   51: getfield 45	com/tencent/open/a/a:g	Lcom/tencent/open/a/g;
    //   54: aload_0
    //   55: getfield 41	com/tencent/open/a/a:e	Lcom/tencent/open/a/g;
    //   58: if_acmpne +73 -> 131
    //   61: aload_0
    //   62: aload_0
    //   63: getfield 43	com/tencent/open/a/a:f	Lcom/tencent/open/a/g;
    //   66: putfield 45	com/tencent/open/a/a:g	Lcom/tencent/open/a/g;
    //   69: aload_0
    //   70: aload_0
    //   71: getfield 41	com/tencent/open/a/a:e	Lcom/tencent/open/a/g;
    //   74: putfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_0
    //   80: getfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   83: astore 5
    //   85: aload_0
    //   86: invokespecial 57	com/tencent/open/a/a:a	()Ljava/io/Writer;
    //   89: astore 6
    //   91: aload_0
    //   92: getfield 54	com/tencent/open/a/a:d	[C
    //   95: astore 7
    //   97: aload 6
    //   99: ifnull +18 -> 117
    //   102: aload 7
    //   104: ifnull +13 -> 117
    //   107: aload 7
    //   109: arraylength
    //   110: istore 8
    //   112: iload 8
    //   114: ifne +41 -> 155
    //   117: aload_0
    //   118: getfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   121: invokevirtual 210	com/tencent/open/a/g:b	()V
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield 32	com/tencent/open/a/a:i	Z
    //   129: iconst_1
    //   130: ireturn
    //   131: aload_0
    //   132: aload_0
    //   133: getfield 41	com/tencent/open/a/a:e	Lcom/tencent/open/a/g;
    //   136: putfield 45	com/tencent/open/a/a:g	Lcom/tencent/open/a/g;
    //   139: aload_0
    //   140: aload_0
    //   141: getfield 43	com/tencent/open/a/a:f	Lcom/tencent/open/a/g;
    //   144: putfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   147: goto -70 -> 77
    //   150: astore_2
    //   151: aload_0
    //   152: monitorexit
    //   153: aload_2
    //   154: athrow
    //   155: aload 7
    //   157: arraylength
    //   158: istore 9
    //   160: aload 5
    //   162: invokevirtual 214	com/tencent/open/a/g:iterator	()Ljava/util/Iterator;
    //   165: astore 10
    //   167: iconst_0
    //   168: istore 11
    //   170: iload 9
    //   172: istore 12
    //   174: aload 10
    //   176: invokeinterface 219 1 0
    //   181: ifeq +101 -> 282
    //   184: aload 10
    //   186: invokeinterface 223 1 0
    //   191: checkcast 225	java/lang/String
    //   194: astore 13
    //   196: aload 13
    //   198: invokevirtual 228	java/lang/String:length	()I
    //   201: istore 14
    //   203: iconst_0
    //   204: istore 15
    //   206: goto +125 -> 331
    //   209: aload 13
    //   211: iload 15
    //   213: iload 15
    //   215: iload 16
    //   217: iadd
    //   218: aload 7
    //   220: iload 11
    //   222: invokevirtual 232	java/lang/String:getChars	(II[CI)V
    //   225: iload 12
    //   227: iload 16
    //   229: isub
    //   230: istore 12
    //   232: iload 11
    //   234: iload 16
    //   236: iadd
    //   237: istore 11
    //   239: iload 14
    //   241: iload 16
    //   243: isub
    //   244: istore 14
    //   246: iload 16
    //   248: iload 15
    //   250: iadd
    //   251: istore 17
    //   253: iload 12
    //   255: ifne +72 -> 327
    //   258: aload 6
    //   260: aload 7
    //   262: iconst_0
    //   263: iload 9
    //   265: invokevirtual 238	java/io/Writer:write	([CII)V
    //   268: iload 9
    //   270: istore 12
    //   272: iload 17
    //   274: istore 15
    //   276: iconst_0
    //   277: istore 11
    //   279: goto +52 -> 331
    //   282: iload 11
    //   284: ifle +13 -> 297
    //   287: aload 6
    //   289: aload 7
    //   291: iconst_0
    //   292: iload 11
    //   294: invokevirtual 238	java/io/Writer:write	([CII)V
    //   297: aload 6
    //   299: invokevirtual 239	java/io/Writer:flush	()V
    //   302: goto -185 -> 117
    //   305: astore 4
    //   307: aload_0
    //   308: getfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   311: invokevirtual 210	com/tencent/open/a/g:b	()V
    //   314: goto -190 -> 124
    //   317: astore_3
    //   318: aload_0
    //   319: getfield 47	com/tencent/open/a/a:h	Lcom/tencent/open/a/g;
    //   322: invokevirtual 210	com/tencent/open/a/g:b	()V
    //   325: aload_3
    //   326: athrow
    //   327: iload 17
    //   329: istore 15
    //   331: iload 14
    //   333: ifle -159 -> 174
    //   336: iload 12
    //   338: iload 14
    //   340: if_icmple +10 -> 350
    //   343: iload 14
    //   345: istore 16
    //   347: goto -138 -> 209
    //   350: iload 12
    //   352: istore 16
    //   354: goto -145 -> 209
    //
    // Exception table:
    //   from	to	target	type
    //   50	77	150	finally
    //   77	79	150	finally
    //   131	147	150	finally
    //   151	153	150	finally
    //   79	97	305	java/io/IOException
    //   107	112	305	java/io/IOException
    //   155	167	305	java/io/IOException
    //   174	203	305	java/io/IOException
    //   209	225	305	java/io/IOException
    //   258	268	305	java/io/IOException
    //   287	297	305	java/io/IOException
    //   297	302	305	java/io/IOException
    //   79	97	317	finally
    //   107	112	317	finally
    //   155	167	317	finally
    //   174	203	317	finally
    //   209	225	317	finally
    //   258	268	317	finally
    //   287	297	317	finally
    //   297	302	317	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.a
 * JD-Core Version:    0.6.0
 */