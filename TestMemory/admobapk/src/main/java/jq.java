import android.net.Uri;

final class jq
  implements lk
{
  private final Uri a;
  private final ku b;
  private final jm c;
  private final kw d;
  private final int e;
  private final js f;
  private volatile boolean g;
  private boolean h;

  public jq(Uri paramUri, ku paramku, jm paramjm, kw paramkw, int paramInt, long paramLong)
  {
    this.a = ((Uri)lp.a(paramUri));
    this.b = ((ku)lp.a(paramku));
    this.c = ((jm)lp.a(paramjm));
    this.d = ((kw)lp.a(paramkw));
    this.e = paramInt;
    this.f = new js();
    this.f.a = paramLong;
    this.h = true;
  }

  public final void a()
  {
    this.g = true;
  }

  public final boolean b()
  {
    return this.g;
  }

  // ERROR //
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	jq:h	Z
    //   4: ifeq +17 -> 21
    //   7: aload_0
    //   8: getfield 43	jq:c	Ljm;
    //   11: invokeinterface 64 1 0
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 59	jq:h	Z
    //   21: iconst_0
    //   22: istore_1
    //   23: iload_1
    //   24: ifne +215 -> 239
    //   27: aload_0
    //   28: getfield 61	jq:g	Z
    //   31: ifne +208 -> 239
    //   34: aload_0
    //   35: getfield 54	jq:f	Ljs;
    //   38: getfield 57	js:a	J
    //   41: lstore 5
    //   43: aload_0
    //   44: getfield 39	jq:b	Lku;
    //   47: new 66	kv
    //   50: dup
    //   51: aload_0
    //   52: getfield 35	jq:a	Landroid/net/Uri;
    //   55: lload 5
    //   57: ldc2_w 67
    //   60: aconst_null
    //   61: invokespecial 71	kv:<init>	(Landroid/net/Uri;JJLjava/lang/String;)V
    //   64: invokeinterface 74 2 0
    //   69: lstore 7
    //   71: lload 7
    //   73: ldc2_w 67
    //   76: lcmp
    //   77: ifeq +10 -> 87
    //   80: lload 7
    //   82: lload 5
    //   84: ladd
    //   85: lstore 7
    //   87: new 76	jk
    //   90: dup
    //   91: aload_0
    //   92: getfield 39	jq:b	Lku;
    //   95: lload 5
    //   97: lload 7
    //   99: invokespecial 79	jk:<init>	(Lku;JJ)V
    //   102: astore 9
    //   104: iload_1
    //   105: istore 10
    //   107: iload 10
    //   109: ifne +45 -> 154
    //   112: aload_0
    //   113: getfield 61	jq:g	Z
    //   116: ifne +38 -> 154
    //   119: aload_0
    //   120: getfield 47	jq:d	Lkw;
    //   123: aload_0
    //   124: getfield 49	jq:e	I
    //   127: invokevirtual 82	kw:b	(I)V
    //   130: aload_0
    //   131: getfield 43	jq:c	Ljm;
    //   134: aload 9
    //   136: aload_0
    //   137: getfield 54	jq:f	Ljs;
    //   140: invokeinterface 85 3 0
    //   145: istore 13
    //   147: iload 13
    //   149: istore 10
    //   151: goto -44 -> 107
    //   154: iload 10
    //   156: iconst_1
    //   157: if_icmpne +21 -> 178
    //   160: iconst_0
    //   161: istore 11
    //   163: aload_0
    //   164: getfield 39	jq:b	Lku;
    //   167: invokeinterface 86 1 0
    //   172: iload 11
    //   174: istore_1
    //   175: goto -152 -> 23
    //   178: aload_0
    //   179: getfield 54	jq:f	Ljs;
    //   182: aload 9
    //   184: invokeinterface 91 1 0
    //   189: putfield 57	js:a	J
    //   192: iload 10
    //   194: istore 11
    //   196: goto -33 -> 163
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_3
    //   202: iload_1
    //   203: istore 4
    //   205: iload 4
    //   207: iconst_1
    //   208: if_icmpeq +20 -> 228
    //   211: aload_3
    //   212: ifnull +16 -> 228
    //   215: aload_0
    //   216: getfield 54	jq:f	Ljs;
    //   219: aload_3
    //   220: invokeinterface 91 1 0
    //   225: putfield 57	js:a	J
    //   228: aload_0
    //   229: getfield 39	jq:b	Lku;
    //   232: invokeinterface 86 1 0
    //   237: aload_2
    //   238: athrow
    //   239: return
    //   240: astore 12
    //   242: iload 10
    //   244: istore 4
    //   246: aload 9
    //   248: astore_3
    //   249: aload 12
    //   251: astore_2
    //   252: goto -47 -> 205
    //
    // Exception table:
    //   from	to	target	type
    //   34	71	199	finally
    //   87	104	199	finally
    //   112	147	240	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jq
 * JD-Core Version:    0.6.0
 */