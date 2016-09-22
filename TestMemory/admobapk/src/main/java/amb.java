import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class amb extends Handler
{
  public amb(alx paramalx, Looper paramLooper)
  {
    super(paramLooper);
  }

  private static void a(Message paramMessage)
  {
    ((amc)paramMessage.obj).b();
  }

  private static boolean b(Message paramMessage)
  {
    return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5);
  }

  // ERROR //
  public final void handleMessage(Message paramMessage)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	amb:a	Lalx;
    //   4: getfield 40	alx:k	Ljava/util/concurrent/atomic/AtomicInteger;
    //   7: invokevirtual 46	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   10: aload_1
    //   11: getfield 49	android/os/Message:arg1	I
    //   14: if_icmpeq +15 -> 29
    //   17: aload_1
    //   18: invokestatic 51	amb:b	(Landroid/os/Message;)Z
    //   21: ifeq +7 -> 28
    //   24: aload_1
    //   25: invokestatic 53	amb:a	(Landroid/os/Message;)V
    //   28: return
    //   29: aload_1
    //   30: getfield 31	android/os/Message:what	I
    //   33: iconst_1
    //   34: if_icmpeq +11 -> 45
    //   37: aload_1
    //   38: getfield 31	android/os/Message:what	I
    //   41: iconst_5
    //   42: if_icmpne +18 -> 60
    //   45: aload_0
    //   46: getfield 10	amb:a	Lalx;
    //   49: invokevirtual 57	alx:f	()Z
    //   52: ifne +8 -> 60
    //   55: aload_1
    //   56: invokestatic 53	amb:a	(Landroid/os/Message;)V
    //   59: return
    //   60: aload_1
    //   61: getfield 31	android/os/Message:what	I
    //   64: iconst_3
    //   65: if_icmpne +68 -> 133
    //   68: aload_1
    //   69: getfield 20	android/os/Message:obj	Ljava/lang/Object;
    //   72: instanceof 59
    //   75: istore 13
    //   77: aconst_null
    //   78: astore 14
    //   80: iload 13
    //   82: ifeq +12 -> 94
    //   85: aload_1
    //   86: getfield 20	android/os/Message:obj	Ljava/lang/Object;
    //   89: checkcast 59	android/app/PendingIntent
    //   92: astore 14
    //   94: new 61	com/google/android/gms/common/ConnectionResult
    //   97: dup
    //   98: aload_1
    //   99: getfield 64	android/os/Message:arg2	I
    //   102: aload 14
    //   104: invokespecial 67	com/google/android/gms/common/ConnectionResult:<init>	(ILandroid/app/PendingIntent;)V
    //   107: astore 15
    //   109: aload_0
    //   110: getfield 10	amb:a	Lalx;
    //   113: getfield 71	alx:g	Lamd;
    //   116: aload 15
    //   118: invokeinterface 76 2 0
    //   123: aload_0
    //   124: getfield 10	amb:a	Lalx;
    //   127: aload 15
    //   129: invokevirtual 77	alx:a	(Lcom/google/android/gms/common/ConnectionResult;)V
    //   132: return
    //   133: aload_1
    //   134: getfield 31	android/os/Message:what	I
    //   137: iconst_4
    //   138: if_icmpne +73 -> 211
    //   141: aload_0
    //   142: getfield 10	amb:a	Lalx;
    //   145: iconst_4
    //   146: aconst_null
    //   147: invokevirtual 80	alx:a	(ILandroid/os/IInterface;)V
    //   150: aload_0
    //   151: getfield 10	amb:a	Lalx;
    //   154: getfield 84	alx:i	Lalz;
    //   157: ifnull +19 -> 176
    //   160: aload_0
    //   161: getfield 10	amb:a	Lalx;
    //   164: getfield 84	alx:i	Lalz;
    //   167: aload_1
    //   168: getfield 64	android/os/Message:arg2	I
    //   171: invokeinterface 89 2 0
    //   176: aload_0
    //   177: getfield 10	amb:a	Lalx;
    //   180: astore 11
    //   182: aload 11
    //   184: aload_1
    //   185: getfield 64	android/os/Message:arg2	I
    //   188: putfield 91	alx:a	I
    //   191: aload 11
    //   193: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   196: putfield 100	alx:b	J
    //   199: aload_0
    //   200: getfield 10	amb:a	Lalx;
    //   203: iconst_4
    //   204: iconst_1
    //   205: aconst_null
    //   206: invokevirtual 103	alx:a	(IILandroid/os/IInterface;)Z
    //   209: pop
    //   210: return
    //   211: aload_1
    //   212: getfield 31	android/os/Message:what	I
    //   215: iconst_2
    //   216: if_icmpne +18 -> 234
    //   219: aload_0
    //   220: getfield 10	amb:a	Lalx;
    //   223: invokevirtual 106	alx:e	()Z
    //   226: ifne +8 -> 234
    //   229: aload_1
    //   230: invokestatic 53	amb:a	(Landroid/os/Message;)V
    //   233: return
    //   234: aload_1
    //   235: invokestatic 51	amb:b	(Landroid/os/Message;)Z
    //   238: ifeq +133 -> 371
    //   241: aload_1
    //   242: getfield 20	android/os/Message:obj	Ljava/lang/Object;
    //   245: checkcast 22	amc
    //   248: astore 4
    //   250: aload 4
    //   252: monitorenter
    //   253: aload 4
    //   255: getfield 108	amc:a	Ljava/lang/Object;
    //   258: astore 6
    //   260: aload 4
    //   262: getfield 111	amc:b	Z
    //   265: ifeq +52 -> 317
    //   268: aload 4
    //   270: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: astore 9
    //   275: ldc 119
    //   277: new 121	java/lang/StringBuilder
    //   280: dup
    //   281: bipush 47
    //   283: aload 9
    //   285: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   288: invokevirtual 124	java/lang/String:length	()I
    //   291: iadd
    //   292: invokespecial 126	java/lang/StringBuilder:<init>	(I)V
    //   295: ldc 128
    //   297: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: aload 9
    //   302: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: ldc 134
    //   307: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokestatic 144	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   316: pop
    //   317: aload 4
    //   319: monitorexit
    //   320: aload 6
    //   322: ifnull +10 -> 332
    //   325: aload 4
    //   327: aload 6
    //   329: invokevirtual 147	amc:a	(Ljava/lang/Object;)V
    //   332: aload 4
    //   334: monitorenter
    //   335: aload 4
    //   337: iconst_1
    //   338: putfield 111	amc:b	Z
    //   341: aload 4
    //   343: monitorexit
    //   344: aload 4
    //   346: invokevirtual 26	amc:b	()V
    //   349: return
    //   350: astore 5
    //   352: aload 4
    //   354: monitorexit
    //   355: aload 5
    //   357: athrow
    //   358: astore 8
    //   360: aload 8
    //   362: athrow
    //   363: astore 7
    //   365: aload 4
    //   367: monitorexit
    //   368: aload 7
    //   370: athrow
    //   371: aload_1
    //   372: getfield 31	android/os/Message:what	I
    //   375: istore_2
    //   376: ldc 119
    //   378: new 121	java/lang/StringBuilder
    //   381: dup
    //   382: bipush 45
    //   384: invokespecial 126	java/lang/StringBuilder:<init>	(I)V
    //   387: ldc 149
    //   389: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: iload_2
    //   393: invokevirtual 152	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   396: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: new 154	java/lang/Exception
    //   402: dup
    //   403: invokespecial 156	java/lang/Exception:<init>	()V
    //   406: invokestatic 160	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   409: pop
    //   410: return
    //
    // Exception table:
    //   from	to	target	type
    //   253	317	350	finally
    //   317	320	350	finally
    //   352	355	350	finally
    //   325	332	358	java/lang/RuntimeException
    //   335	344	363	finally
    //   365	368	363	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amb
 * JD-Core Version:    0.6.0
 */