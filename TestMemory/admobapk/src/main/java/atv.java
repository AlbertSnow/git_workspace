import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class atv
  implements asm, Callable
{
  private boolean a = true;
  private BlockingQueue b = new ArrayBlockingQueue(1);

  atv(atj paramatj)
  {
  }

  // ERROR //
  private atq a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	atv:c	Latj;
    //   4: getfield 41	atj:f	Lasj;
    //   7: ifnonnull +56 -> 63
    //   10: aload_0
    //   11: getfield 18	atv:c	Latj;
    //   14: new 43	asi
    //   17: dup
    //   18: aload_0
    //   19: getfield 18	atv:c	Latj;
    //   22: getfield 47	atj:k	Ljava/util/concurrent/Executor;
    //   25: aload_0
    //   26: getfield 18	atv:c	Latj;
    //   29: getfield 51	atj:d	Lauz;
    //   32: getfield 56	auz:a	Ljava/lang/String;
    //   35: aload_0
    //   36: getfield 18	atv:c	Latj;
    //   39: getfield 51	atj:d	Lauz;
    //   42: getfield 59	auz:b	I
    //   45: aload_0
    //   46: getfield 18	atv:c	Latj;
    //   49: getfield 51	atj:d	Lauz;
    //   52: getfield 62	auz:g	Ljava/lang/String;
    //   55: iconst_0
    //   56: aload_0
    //   57: invokespecial 65	asi:<init>	(Ljava/util/concurrent/Executor;Ljava/lang/String;ILjava/lang/String;ILasm;)V
    //   60: putfield 41	atj:f	Lasj;
    //   63: aload_0
    //   64: getfield 18	atv:c	Latj;
    //   67: getfield 41	atj:f	Lasj;
    //   70: astore_2
    //   71: aload_2
    //   72: aload_2
    //   73: invokevirtual 70	asj:a	()Ljava/net/Socket;
    //   76: putfield 74	asj:i	Ljava/net/Socket;
    //   79: aload_2
    //   80: getfield 74	asj:i	Ljava/net/Socket;
    //   83: iconst_1
    //   84: invokevirtual 80	java/net/Socket:setTcpNoDelay	(Z)V
    //   87: aload_2
    //   88: getfield 74	asj:i	Ljava/net/Socket;
    //   91: bipush 16
    //   93: invokevirtual 83	java/net/Socket:setTrafficClass	(I)V
    //   96: aload_2
    //   97: getfield 74	asj:i	Ljava/net/Socket;
    //   100: aload_2
    //   101: getfield 85	asj:f	I
    //   104: invokevirtual 88	java/net/Socket:setSoTimeout	(I)V
    //   107: aload_2
    //   108: aload_2
    //   109: getfield 74	asj:i	Ljava/net/Socket;
    //   112: invokevirtual 92	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   115: putfield 96	asj:j	Ljava/io/InputStream;
    //   118: aload_2
    //   119: aload_2
    //   120: getfield 74	asj:i	Ljava/net/Socket;
    //   123: invokevirtual 100	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   126: putfield 103	asj:k	Ljava/io/OutputStream;
    //   129: aload_2
    //   130: aload_2
    //   131: getfield 106	asj:a	Ljava/util/concurrent/ExecutorCompletionService;
    //   134: new 108	ask
    //   137: dup
    //   138: aload_2
    //   139: invokespecial 111	ask:<init>	(Lasj;)V
    //   142: aconst_null
    //   143: invokevirtual 117	java/util/concurrent/ExecutorCompletionService:submit	(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    //   146: putfield 120	asj:b	Ljava/util/concurrent/Future;
    //   149: aload_2
    //   150: aload_2
    //   151: getfield 106	asj:a	Ljava/util/concurrent/ExecutorCompletionService;
    //   154: new 122	asl
    //   157: dup
    //   158: aload_2
    //   159: invokespecial 123	asl:<init>	(Lasj;)V
    //   162: aconst_null
    //   163: invokevirtual 117	java/util/concurrent/ExecutorCompletionService:submit	(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    //   166: putfield 125	asj:c	Ljava/util/concurrent/Future;
    //   169: new 127	avf
    //   172: dup
    //   173: invokespecial 128	avf:<init>	()V
    //   176: astore 4
    //   178: aload 4
    //   180: new 130	ava
    //   183: dup
    //   184: invokespecial 131	ava:<init>	()V
    //   187: putfield 134	avf:d	Lava;
    //   190: aload 4
    //   192: getfield 134	avf:d	Lava;
    //   195: aload_0
    //   196: getfield 18	atv:c	Latj;
    //   199: getfield 51	atj:d	Lauz;
    //   202: getfield 136	auz:c	Ljava/lang/String;
    //   205: putfield 137	ava:a	Ljava/lang/String;
    //   208: aload 4
    //   210: getfield 134	avf:d	Lava;
    //   213: aload_0
    //   214: getfield 18	atv:c	Latj;
    //   217: getfield 51	atj:d	Lauz;
    //   220: getfield 139	auz:d	Ljava/lang/String;
    //   223: putfield 141	ava:b	Ljava/lang/String;
    //   226: aload 4
    //   228: getfield 134	avf:d	Lava;
    //   231: ldc 143
    //   233: putfield 144	ava:c	Ljava/lang/String;
    //   236: aload 4
    //   238: getfield 134	avf:d	Lava;
    //   241: getstatic 147	atj:c	[Lavb;
    //   244: putfield 149	ava:d	[Lavb;
    //   247: aload_0
    //   248: getfield 18	atv:c	Latj;
    //   251: getfield 41	atj:f	Lasj;
    //   254: aload 4
    //   256: invokevirtual 152	asj:a	(Lavf;)Z
    //   259: pop
    //   260: aload_0
    //   261: getfield 30	atv:b	Ljava/util/concurrent/BlockingQueue;
    //   264: invokeinterface 158 1 0
    //   269: checkcast 160	atq
    //   272: astore 7
    //   274: aload 7
    //   276: areturn
    //   277: astore_3
    //   278: aload_2
    //   279: getfield 74	asj:i	Ljava/net/Socket;
    //   282: ifnull +10 -> 292
    //   285: aload_2
    //   286: getfield 74	asj:i	Ljava/net/Socket;
    //   289: invokevirtual 163	java/net/Socket:close	()V
    //   292: aload_3
    //   293: athrow
    //   294: astore_1
    //   295: getstatic 166	atj:a	Ljava/util/logging/Logger;
    //   298: getstatic 171	asn:a	Ljava/util/logging/Level;
    //   301: ldc 173
    //   303: aload_1
    //   304: invokevirtual 179	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   307: new 160	atq
    //   310: dup
    //   311: bipush 104
    //   313: invokespecial 180	atq:<init>	(I)V
    //   316: areturn
    //   317: astore 6
    //   319: getstatic 166	atj:a	Ljava/util/logging/Logger;
    //   322: getstatic 171	asn:a	Ljava/util/logging/Level;
    //   325: ldc 182
    //   327: invokevirtual 185	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   330: new 160	atq
    //   333: dup
    //   334: bipush 100
    //   336: invokespecial 180	atq:<init>	(I)V
    //   339: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   71	169	277	java/io/IOException
    //   63	71	294	java/io/IOException
    //   169	260	294	java/io/IOException
    //   278	292	294	java/io/IOException
    //   292	294	294	java/io/IOException
    //   260	274	317	java/lang/InterruptedException
  }

  public final void a(int paramInt)
  {
    atj.a.log(asn.a, 45 + "Signal channel onError with error " + paramInt);
    if (this.a)
    {
      this.b.offer(new atq(104));
      this.a = false;
      return;
    }
    this.c.a(104);
  }

  public final void a(avf paramavf)
  {
    String str5;
    int i;
    if (paramavf.e != null)
    {
      String str3 = String.valueOf(paramavf.e.a);
      Logger localLogger3 = atj.a;
      Level localLevel3 = asn.d;
      String str4 = String.valueOf(str3);
      if (str4.length() != 0)
      {
        str5 = "Signal channel received shutdown signal with reason ".concat(str4);
        localLogger3.log(localLevel3, str5);
        switch (paramavf.e.a)
        {
        case 2:
        case 4:
        default:
          if (!this.a)
            break;
          i = 104;
        case 5:
        case 3:
        case 6:
        case 1:
        }
      }
    }
    while (true)
    {
      label119: if (this.a)
      {
        this.b.offer(new atq(i));
        this.a = false;
      }
      do
      {
        do
        {
          return;
          str5 = new String("Signal channel received shutdown signal with reason ");
          break;
          i = 5;
          break label119;
          i = 3;
          break label119;
          i = 6;
          break label119;
          i = 0;
          break label119;
          this.c.a(i);
          return;
          if (paramavf.g != null)
          {
            long l = (System.nanoTime() - paramavf.g.a) / 1000000L;
            atj.a.log(asn.d, 28 + "Pong! " + l + "ms");
            return;
          }
          if (paramavf.i == null)
            continue;
          Logger localLogger2 = atj.a;
          Level localLevel2 = asn.d;
          String str2 = String.valueOf(paramavf.i);
          localLogger2.log(localLevel2, 24 + String.valueOf(str2).length() + "Got LaunchIntent signal " + str2);
          try
          {
            Intent localIntent1 = ash.a(paramavf.i.a);
            localIntent1.addCategory("android.intent.category.BROWSABLE");
            localIntent1.setComponent(null);
            Intent localIntent2 = localIntent1.getSelector();
            if (localIntent2 != null)
            {
              localIntent2.addCategory("android.intent.category.BROWSABLE");
              localIntent2.setComponent(null);
            }
            this.c.j.startActivity(localIntent1);
            return;
          }
          catch (Throwable localThrowable)
          {
            atj.a.log(asn.a, "Error launching forwarded intent", localThrowable);
            atj localatj2 = this.c;
            localatj2.e.post(new atm(localatj2));
            return;
          }
        }
        while (paramavf.h == null);
        switch (paramavf.h.a)
        {
        default:
          Logger localLogger1 = atj.a;
          Level localLevel1 = asn.d;
          String str1 = String.valueOf(paramavf.h);
          localLogger1.log(localLevel1, 36 + String.valueOf(str1).length() + "Received unknown server event type: " + str1);
          return;
        case 1:
        case 2:
        }
      }
      while (!this.a);
      this.b.offer(new atq());
      this.a = false;
      return;
      atj localatj1 = this.c;
      localatj1.e.post(new atm(localatj1));
      return;
      i = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atv
 * JD-Core Version:    0.6.0
 */