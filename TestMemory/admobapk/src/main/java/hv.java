import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;

@TargetApi(16)
public final class hv extends hz
{
  final hy a;
  private final iy h;
  private int i;
  private long j;

  public hv(iv paramiv, Handler paramHandler, hy paramhy)
  {
    this(paramiv, null, true, paramHandler, paramhy);
  }

  private hv(iv paramiv, ji paramji, boolean paramBoolean, Handler paramHandler, hy paramhy)
  {
    super(paramiv, null, true, paramHandler, paramhy);
    this.a = paramhy;
    this.i = 0;
    this.h = new iy();
  }

  protected final hl a(String paramString, boolean paramBoolean)
  {
    if (lt.c(paramString))
      return new hl("OMX.google.raw.decoder", true);
    return super.a(paramString, paramBoolean);
  }

  public final void a(int paramInt, Object paramObject)
  {
    if (paramInt == 1)
    {
      this.h.a(((Float)paramObject).floatValue());
      return;
    }
    super.a(paramInt, paramObject);
  }

  protected final void a(long paramLong)
  {
    super.a(paramLong);
    this.h.d();
    this.j = -9223372036854775808L;
  }

  protected final void a(long paramLong, boolean paramBoolean)
  {
    super.a(paramLong, paramBoolean);
    this.j = -9223372036854775808L;
  }

  protected final void a(MediaCodec paramMediaCodec, String paramString, MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto)
  {
    if ("OMX.google.raw.decoder".equals(paramString))
    {
      String str = paramMediaFormat.getString("mime");
      paramMediaFormat.setString("mime", "audio/raw");
      paramMediaCodec.configure(paramMediaFormat, null, paramMediaCrypto, 0);
      paramMediaFormat.setString("mime", str);
      return;
    }
    paramMediaCodec.configure(paramMediaFormat, null, paramMediaCrypto, 0);
  }

  protected final void a(ir paramir, MediaFormat paramMediaFormat)
  {
    boolean bool1 = true;
    int i6;
    String str2;
    int i8;
    label144: boolean bool3;
    label160: int i9;
    label273: int i10;
    int i11;
    if (lt.c(paramir.a))
    {
      iy localiy2 = this.h;
      MediaFormat localMediaFormat = paramir.a();
      int i5 = localMediaFormat.getInteger("channel-count");
      switch (i5)
      {
      case 3:
      case 4:
      case 5:
      case 7:
      default:
        throw new IllegalArgumentException(38 + "Unsupported channel count: " + i5);
      case 1:
        i6 = 4;
        int i7 = localMediaFormat.getInteger("sample-rate");
        str2 = localMediaFormat.getString("mime");
        if ("audio/ac3".equals(str2))
        {
          i8 = 5;
          if ((i8 != 5) && (i8 != 6))
            break label405;
          bool3 = bool1;
          if ((localiy2.a()) && (localiy2.e == i7) && (localiy2.f == i6) && (!localiy2.u) && (!bool3))
            break;
          localiy2.d();
          localiy2.g = i8;
          localiy2.e = i7;
          localiy2.f = i6;
          localiy2.u = bool3;
          localiy2.v = 0;
          localiy2.h = (i5 * 2);
          localiy2.i = AudioTrack.getMinBufferSize(i7, i6, i8);
          if (localiy2.i == -2)
            break label411;
          lp.b(bool1);
          i9 = localiy2.i << 2;
          i10 = (int)localiy2.c(250000L) * localiy2.h;
          i11 = (int)Math.max(localiy2.i, localiy2.c(750000L) * localiy2.h);
          if (i9 >= i10)
            break label416;
          label337: localiy2.j = i10;
        }
      case 2:
      case 6:
      case 8:
      }
    }
    label405: label411: label416: iy localiy1;
    int k;
    int m;
    int n;
    String str1;
    int i1;
    label562: boolean bool2;
    label578: 
    do
    {
      return;
      i6 = 12;
      break;
      i6 = 252;
      break;
      i6 = 1020;
      break;
      if ("audio/eac3".equals(str2))
      {
        i8 = 6;
        break label144;
      }
      if (lt.b(str2))
      {
        i8 = 2;
        break label144;
      }
      i8 = 0;
      break label144;
      bool3 = false;
      break label160;
      bool1 = false;
      break label273;
      if (i9 > i11)
      {
        i10 = i11;
        break label337;
      }
      i10 = i9;
      break label337;
      localiy1 = this.h;
      k = paramMediaFormat.getInteger("channel-count");
      switch (k)
      {
      case 3:
      case 4:
      case 5:
      case 7:
      default:
        throw new IllegalArgumentException(38 + "Unsupported channel count: " + k);
      case 1:
        m = 4;
        n = paramMediaFormat.getInteger("sample-rate");
        str1 = paramMediaFormat.getString("mime");
        if (!"audio/ac3".equals(str1))
          break label786;
        i1 = 5;
        if ((i1 != 5) && (i1 != 6))
          break label823;
        bool2 = bool1;
      case 2:
      case 6:
      case 8:
      }
    }
    while ((localiy1.a()) && (localiy1.e == n) && (localiy1.f == m) && (!localiy1.u) && (!bool2));
    localiy1.d();
    localiy1.g = i1;
    localiy1.e = n;
    localiy1.f = m;
    localiy1.u = bool2;
    localiy1.v = 0;
    localiy1.h = (k * 2);
    localiy1.i = AudioTrack.getMinBufferSize(n, m, i1);
    label691: int i2;
    int i3;
    int i4;
    if (localiy1.i != -2)
    {
      lp.b(bool1);
      i2 = localiy1.i << 2;
      i3 = (int)localiy1.c(250000L) * localiy1.h;
      i4 = (int)Math.max(localiy1.i, localiy1.c(750000L) * localiy1.h);
      if (i2 >= i3)
        break label834;
    }
    while (true)
    {
      localiy1.j = i3;
      return;
      m = 12;
      break;
      m = 252;
      break;
      m = 1020;
      break;
      label786: if ("audio/eac3".equals(str1))
      {
        i1 = 6;
        break label562;
      }
      if (lt.b(str1))
      {
        i1 = 2;
        break label562;
      }
      i1 = 0;
      break label562;
      label823: bool2 = false;
      break label578;
      bool1 = false;
      break label691;
      label834: if (i2 > i4)
      {
        i3 = i4;
        continue;
      }
      i3 = i2;
    }
  }

  protected final boolean a()
  {
    return true;
  }

  // ERROR //
  protected final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, java.nio.ByteBuffer paramByteBuffer, android.media.MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload 9
    //   2: ifeq +52 -> 54
    //   5: aload 5
    //   7: iload 8
    //   9: iconst_0
    //   10: invokevirtual 206	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   13: aload_0
    //   14: getfield 209	hv:b	Lhj;
    //   17: astore 37
    //   19: aload 37
    //   21: iconst_1
    //   22: aload 37
    //   24: getfield 212	hj:f	I
    //   27: iadd
    //   28: putfield 212	hj:f	I
    //   31: aload_0
    //   32: getfield 34	hv:h	Liy;
    //   35: astore 38
    //   37: aload 38
    //   39: getfield 215	iy:o	I
    //   42: iconst_1
    //   43: if_icmpne +9 -> 52
    //   46: aload 38
    //   48: iconst_2
    //   49: putfield 215	iy:o	I
    //   52: iconst_1
    //   53: ireturn
    //   54: aload_0
    //   55: getfield 34	hv:h	Liy;
    //   58: invokevirtual 147	iy:a	()Z
    //   61: ifne +37 -> 98
    //   64: aload_0
    //   65: getfield 27	hv:i	I
    //   68: ifeq +114 -> 182
    //   71: aload_0
    //   72: getfield 34	hv:h	Liy;
    //   75: aload_0
    //   76: getfield 27	hv:i	I
    //   79: invokevirtual 218	iy:a	(I)I
    //   82: pop
    //   83: aload_0
    //   84: getfield 221	ix:g	I
    //   87: iconst_3
    //   88: if_icmpne +10 -> 98
    //   91: aload_0
    //   92: getfield 34	hv:h	Liy;
    //   95: invokevirtual 223	iy:b	()V
    //   98: aload_0
    //   99: getfield 34	hv:h	Liy;
    //   102: astore 12
    //   104: aload 7
    //   106: getfield 228	android/media/MediaCodec$BufferInfo:offset	I
    //   109: istore 13
    //   111: aload 7
    //   113: getfield 231	android/media/MediaCodec$BufferInfo:size	I
    //   116: istore 14
    //   118: aload 7
    //   120: getfield 234	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   123: lstore 15
    //   125: iload 14
    //   127: ifne +114 -> 241
    //   130: iconst_2
    //   131: istore 26
    //   133: iload 26
    //   135: iconst_1
    //   136: iand
    //   137: ifeq +10 -> 147
    //   140: aload_0
    //   141: ldc2_w 69
    //   144: putfield 72	hv:j	J
    //   147: iload 26
    //   149: iconst_2
    //   150: iand
    //   151: ifeq +699 -> 850
    //   154: aload 5
    //   156: iload 8
    //   158: iconst_0
    //   159: invokevirtual 206	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   162: aload_0
    //   163: getfield 209	hv:b	Lhj;
    //   166: astore 27
    //   168: aload 27
    //   170: iconst_1
    //   171: aload 27
    //   173: getfield 235	hj:e	I
    //   176: iadd
    //   177: putfield 235	hj:e	I
    //   180: iconst_1
    //   181: ireturn
    //   182: aload_0
    //   183: aload_0
    //   184: getfield 34	hv:h	Liy;
    //   187: iconst_0
    //   188: invokevirtual 218	iy:a	(I)I
    //   191: putfield 27	hv:i	I
    //   194: goto -111 -> 83
    //   197: astore 34
    //   199: aload_0
    //   200: getfield 238	hv:d	Landroid/os/Handler;
    //   203: ifnull +28 -> 231
    //   206: aload_0
    //   207: getfield 25	hv:a	Lhy;
    //   210: ifnull +21 -> 231
    //   213: aload_0
    //   214: getfield 238	hv:d	Landroid/os/Handler;
    //   217: new 240	hw
    //   220: dup
    //   221: aload_0
    //   222: aload 34
    //   224: invokespecial 243	hw:<init>	(Lhv;Ljd;)V
    //   227: invokevirtual 249	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   230: pop
    //   231: new 251	hm
    //   234: dup
    //   235: aload 34
    //   237: invokespecial 254	hm:<init>	(Ljava/lang/Throwable;)V
    //   240: athrow
    //   241: getstatic 258	ly:a	I
    //   244: bipush 22
    //   246: if_icmpgt +60 -> 306
    //   249: aload 12
    //   251: getfield 157	iy:u	Z
    //   254: ifeq +52 -> 306
    //   257: aload 12
    //   259: getfield 261	iy:d	Landroid/media/AudioTrack;
    //   262: invokevirtual 265	android/media/AudioTrack:getPlayState	()I
    //   265: iconst_2
    //   266: if_icmpne +9 -> 275
    //   269: iconst_0
    //   270: istore 26
    //   272: goto -139 -> 133
    //   275: aload 12
    //   277: getfield 261	iy:d	Landroid/media/AudioTrack;
    //   280: invokevirtual 265	android/media/AudioTrack:getPlayState	()I
    //   283: iconst_1
    //   284: if_icmpne +22 -> 306
    //   287: aload 12
    //   289: getfield 268	iy:b	Ljb;
    //   292: invokevirtual 273	jb:a	()J
    //   295: lconst_0
    //   296: lcmp
    //   297: ifeq +9 -> 306
    //   300: iconst_0
    //   301: istore 26
    //   303: goto -170 -> 133
    //   306: aload 12
    //   308: getfield 276	iy:t	I
    //   311: istore 17
    //   313: iconst_0
    //   314: istore 18
    //   316: iload 17
    //   318: ifne +79 -> 397
    //   321: aload 12
    //   323: getfield 157	iy:u	Z
    //   326: ifeq +26 -> 352
    //   329: aload 12
    //   331: getfield 163	iy:v	I
    //   334: ifne +18 -> 352
    //   337: aload 12
    //   339: iload 14
    //   341: aload 12
    //   343: getfield 150	iy:e	I
    //   346: invokestatic 281	lo:a	(II)I
    //   349: putfield 163	iy:v	I
    //   352: lload 15
    //   354: aload 12
    //   356: aload 12
    //   358: iload 14
    //   360: i2l
    //   361: invokevirtual 283	iy:a	(J)J
    //   364: invokevirtual 285	iy:b	(J)J
    //   367: lsub
    //   368: lstore 19
    //   370: aload 12
    //   372: getfield 288	iy:p	J
    //   375: lconst_0
    //   376: lcmp
    //   377: ifne +260 -> 637
    //   380: aload 12
    //   382: lconst_0
    //   383: lload 19
    //   385: invokestatic 191	java/lang/Math:max	(JJ)J
    //   388: putfield 288	iy:p	J
    //   391: aload 12
    //   393: iconst_1
    //   394: putfield 215	iy:o	I
    //   397: aload 12
    //   399: getfield 276	iy:t	I
    //   402: ifne +74 -> 476
    //   405: aload 12
    //   407: iload 14
    //   409: putfield 276	iy:t	I
    //   412: aload 6
    //   414: iload 13
    //   416: invokevirtual 294	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   419: pop
    //   420: getstatic 258	ly:a	I
    //   423: bipush 21
    //   425: if_icmpge +51 -> 476
    //   428: aload 12
    //   430: getfield 298	iy:r	[B
    //   433: ifnull +14 -> 447
    //   436: aload 12
    //   438: getfield 298	iy:r	[B
    //   441: arraylength
    //   442: iload 14
    //   444: if_icmpge +12 -> 456
    //   447: aload 12
    //   449: iload 14
    //   451: newarray byte
    //   453: putfield 298	iy:r	[B
    //   456: aload 6
    //   458: aload 12
    //   460: getfield 298	iy:r	[B
    //   463: iconst_0
    //   464: iload 14
    //   466: invokevirtual 302	java/nio/ByteBuffer:get	([BII)Ljava/nio/ByteBuffer;
    //   469: pop
    //   470: aload 12
    //   472: iconst_0
    //   473: putfield 305	iy:s	I
    //   476: getstatic 258	ly:a	I
    //   479: bipush 21
    //   481: if_icmpge +300 -> 781
    //   484: aload 12
    //   486: getfield 308	iy:n	J
    //   489: aload 12
    //   491: getfield 268	iy:b	Ljb;
    //   494: invokevirtual 273	jb:a	()J
    //   497: aload 12
    //   499: getfield 165	iy:h	I
    //   502: i2l
    //   503: lmul
    //   504: lsub
    //   505: l2i
    //   506: istore 28
    //   508: aload 12
    //   510: getfield 193	iy:j	I
    //   513: iload 28
    //   515: isub
    //   516: istore 29
    //   518: iconst_0
    //   519: istore 24
    //   521: iload 29
    //   523: ifle +55 -> 578
    //   526: aload 12
    //   528: getfield 276	iy:t	I
    //   531: iload 29
    //   533: invokestatic 311	java/lang/Math:min	(II)I
    //   536: istore 30
    //   538: aload 12
    //   540: getfield 261	iy:d	Landroid/media/AudioTrack;
    //   543: aload 12
    //   545: getfield 298	iy:r	[B
    //   548: aload 12
    //   550: getfield 305	iy:s	I
    //   553: iload 30
    //   555: invokevirtual 315	android/media/AudioTrack:write	([BII)I
    //   558: istore 24
    //   560: iload 24
    //   562: iflt +16 -> 578
    //   565: aload 12
    //   567: iload 24
    //   569: aload 12
    //   571: getfield 305	iy:s	I
    //   574: iadd
    //   575: putfield 305	iy:s	I
    //   578: iload 24
    //   580: ifge +222 -> 802
    //   583: new 202	je
    //   586: dup
    //   587: iload 24
    //   589: invokespecial 316	je:<init>	(I)V
    //   592: athrow
    //   593: astore 10
    //   595: aload_0
    //   596: getfield 238	hv:d	Landroid/os/Handler;
    //   599: ifnull +28 -> 627
    //   602: aload_0
    //   603: getfield 25	hv:a	Lhy;
    //   606: ifnull +21 -> 627
    //   609: aload_0
    //   610: getfield 238	hv:d	Landroid/os/Handler;
    //   613: new 318	hx
    //   616: dup
    //   617: aload_0
    //   618: aload 10
    //   620: invokespecial 321	hx:<init>	(Lhv;Lje;)V
    //   623: invokevirtual 249	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   626: pop
    //   627: new 251	hm
    //   630: dup
    //   631: aload 10
    //   633: invokespecial 254	hm:<init>	(Ljava/lang/Throwable;)V
    //   636: athrow
    //   637: aload 12
    //   639: getfield 288	iy:p	J
    //   642: aload 12
    //   644: aload 12
    //   646: aload 12
    //   648: getfield 308	iy:n	J
    //   651: invokevirtual 283	iy:a	(J)J
    //   654: invokevirtual 285	iy:b	(J)J
    //   657: ladd
    //   658: lstore 21
    //   660: aload 12
    //   662: getfield 215	iy:o	I
    //   665: iconst_1
    //   666: if_icmpne +71 -> 737
    //   669: lload 21
    //   671: lload 19
    //   673: lsub
    //   674: invokestatic 324	java/lang/Math:abs	(J)J
    //   677: ldc2_w 325
    //   680: lcmp
    //   681: ifle +56 -> 737
    //   684: ldc_w 328
    //   687: new 121	java/lang/StringBuilder
    //   690: dup
    //   691: bipush 80
    //   693: invokespecial 124	java/lang/StringBuilder:<init>	(I)V
    //   696: ldc_w 330
    //   699: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: lload 21
    //   704: invokevirtual 333	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   707: ldc_w 335
    //   710: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   713: lload 19
    //   715: invokevirtual 333	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   718: ldc_w 337
    //   721: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   724: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   727: invokestatic 342	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   730: pop
    //   731: aload 12
    //   733: iconst_2
    //   734: putfield 215	iy:o	I
    //   737: aload 12
    //   739: getfield 215	iy:o	I
    //   742: istore 23
    //   744: iconst_0
    //   745: istore 18
    //   747: iload 23
    //   749: iconst_2
    //   750: if_icmpne -353 -> 397
    //   753: aload 12
    //   755: aload 12
    //   757: getfield 288	iy:p	J
    //   760: lload 19
    //   762: lload 21
    //   764: lsub
    //   765: ladd
    //   766: putfield 288	iy:p	J
    //   769: aload 12
    //   771: iconst_1
    //   772: putfield 215	iy:o	I
    //   775: iconst_1
    //   776: istore 18
    //   778: goto -381 -> 397
    //   781: aload 12
    //   783: getfield 261	iy:d	Landroid/media/AudioTrack;
    //   786: aload 6
    //   788: aload 12
    //   790: getfield 276	iy:t	I
    //   793: iconst_1
    //   794: invokevirtual 345	android/media/AudioTrack:write	(Ljava/nio/ByteBuffer;II)I
    //   797: istore 24
    //   799: goto -221 -> 578
    //   802: aload 12
    //   804: aload 12
    //   806: getfield 276	iy:t	I
    //   809: iload 24
    //   811: isub
    //   812: putfield 276	iy:t	I
    //   815: aload 12
    //   817: aload 12
    //   819: getfield 308	iy:n	J
    //   822: iload 24
    //   824: i2l
    //   825: ladd
    //   826: putfield 308	iy:n	J
    //   829: aload 12
    //   831: getfield 276	iy:t	I
    //   834: istore 25
    //   836: iload 25
    //   838: ifne +14 -> 852
    //   841: iload 18
    //   843: iconst_2
    //   844: ior
    //   845: istore 26
    //   847: goto -714 -> 133
    //   850: iconst_0
    //   851: ireturn
    //   852: iload 18
    //   854: istore 26
    //   856: goto -723 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   64	83	197	jd
    //   182	194	197	jd
    //   98	125	593	je
    //   241	269	593	je
    //   275	300	593	je
    //   306	313	593	je
    //   321	352	593	je
    //   352	397	593	je
    //   397	447	593	je
    //   447	456	593	je
    //   456	476	593	je
    //   476	518	593	je
    //   526	560	593	je
    //   565	578	593	je
    //   583	593	593	je
    //   637	737	593	je
    //   737	744	593	je
    //   753	775	593	je
    //   781	799	593	je
    //   802	836	593	je
  }

  protected final boolean a(String paramString)
  {
    return (lt.b(paramString)) && (super.a(paramString));
  }

  protected final void b()
  {
    super.b();
    this.h.b();
  }

  protected final void c()
  {
    iy localiy = this.h;
    if (localiy.a())
    {
      localiy.f();
      localiy.d.pause();
    }
    super.c();
  }

  protected final boolean d()
  {
    if (super.d())
    {
      if (this.h.c())
      {
        iy localiy = this.h;
        if (localiy.n <= 3 * localiy.i / 2)
          break label47;
      }
      label47: for (int k = 1; k == 0; k = 0)
        return true;
    }
    return false;
  }

  protected final boolean e()
  {
    return (this.h.c()) || ((super.e()) && (this.f == 2));
  }

  protected final long f()
  {
    iy localiy = this.h;
    boolean bool = d();
    int k;
    long l2;
    if ((localiy.a()) && (localiy.p != 0L))
    {
      k = 1;
      if (k != 0)
        break label71;
      l2 = -9223372036854775808L;
      label37: if (l2 != -9223372036854775808L)
        break label196;
    }
    label194: label196: for (this.j = Math.max(this.j, super.f()); ; this.j = Math.max(this.j, l2))
    {
      return this.j;
      k = 0;
      break;
      label71: if (localiy.d.getPlayState() == 3)
        localiy.e();
      long l1 = System.nanoTime() / 1000L;
      if (localiy.m)
      {
        l2 = localiy.b(localiy.c(l1 - localiy.b.d() / 1000L) + localiy.b.e()) + localiy.p;
        break label37;
      }
      if (localiy.k == 0)
        l2 = localiy.b.b() + localiy.p;
      while (true)
      {
        if (bool)
          break label194;
        l2 -= localiy.q;
        break;
        l2 = l1 + localiy.l + localiy.p;
      }
      break label37;
    }
  }

  protected final void g()
  {
    this.i = 0;
    try
    {
      iy localiy = this.h;
      localiy.d();
      if (localiy.c != null)
      {
        AudioTrack localAudioTrack = localiy.c;
        localiy.c = null;
        new ja(localiy, localAudioTrack).start();
      }
      return;
    }
    finally
    {
      super.g();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hv
 * JD-Core Version:    0.6.0
 */