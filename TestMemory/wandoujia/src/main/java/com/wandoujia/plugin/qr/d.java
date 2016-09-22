package com.wandoujia.plugin.qr;

import android.os.Handler;
import com.google.zxing.DecodeHintType;
import com.wandoujia.p4.utils.c;
import java.util.Map;

final class d extends Handler
{
  private final CaptureActivity a;
  private final c b = new c();
  private boolean c = true;

  static
  {
    d.class.getSimpleName();
  }

  d(CaptureActivity paramCaptureActivity, Map<DecodeHintType, Object> paramMap)
  {
    this.b.a(paramMap);
    this.a = paramCaptureActivity;
  }

  // ERROR //
  public final void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/wandoujia/plugin/qr/d:c	Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: getfield 44	android/os/Message:what	I
    //   12: getstatic 49	com/wandoujia/plugin/qr/R$id:decode	I
    //   15: if_icmpne +328 -> 343
    //   18: aload_1
    //   19: getfield 53	android/os/Message:obj	Ljava/lang/Object;
    //   22: checkcast 55	[B
    //   25: astore_2
    //   26: aload_1
    //   27: getfield 58	android/os/Message:arg1	I
    //   30: istore_3
    //   31: aload_1
    //   32: getfield 61	android/os/Message:arg2	I
    //   35: istore 4
    //   37: invokestatic 67	java/lang/System:currentTimeMillis	()J
    //   40: lstore 5
    //   42: aload_0
    //   43: getfield 34	com/wandoujia/plugin/qr/d:a	Lcom/wandoujia/plugin/qr/CaptureActivity;
    //   46: invokevirtual 73	com/wandoujia/plugin/qr/CaptureActivity:d	()Lcom/wandoujia/plugin/qr/a/e;
    //   49: invokevirtual 79	com/wandoujia/plugin/qr/a/e:e	()Landroid/graphics/Rect;
    //   52: astore 7
    //   54: aload 7
    //   56: ifnonnull +144 -> 200
    //   59: aconst_null
    //   60: astore 10
    //   62: aload 10
    //   64: ifnull +301 -> 365
    //   67: new 81	com/google/zxing/b
    //   70: dup
    //   71: new 83	com/google/zxing/common/g
    //   74: dup
    //   75: aload 10
    //   77: invokespecial 86	com/google/zxing/common/g:<init>	(Lcom/google/zxing/c;)V
    //   80: invokespecial 89	com/google/zxing/b:<init>	(Lcom/google/zxing/a;)V
    //   83: astore 11
    //   85: aload_0
    //   86: getfield 29	com/wandoujia/plugin/qr/d:b	Lcom/wandoujia/p4/utils/c;
    //   89: aload 11
    //   91: invokevirtual 92	com/wandoujia/p4/utils/c:a	(Lcom/google/zxing/b;)Lcom/google/zxing/e;
    //   94: astore 21
    //   96: aload 21
    //   98: astore 14
    //   100: aload_0
    //   101: getfield 29	com/wandoujia/plugin/qr/d:b	Lcom/wandoujia/p4/utils/c;
    //   104: invokevirtual 94	com/wandoujia/p4/utils/c:a	()V
    //   107: aload_0
    //   108: getfield 34	com/wandoujia/plugin/qr/d:a	Lcom/wandoujia/plugin/qr/CaptureActivity;
    //   111: invokevirtual 97	com/wandoujia/plugin/qr/CaptureActivity:b	()Landroid/os/Handler;
    //   114: astore 15
    //   116: aload 14
    //   118: ifnull +208 -> 326
    //   121: invokestatic 67	java/lang/System:currentTimeMillis	()J
    //   124: lstore 16
    //   126: new 99	java/lang/StringBuilder
    //   129: dup
    //   130: ldc 101
    //   132: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: lload 16
    //   137: lload 5
    //   139: lsub
    //   140: invokevirtual 108	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   143: ldc 110
    //   145: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload 15
    //   151: ifnull -144 -> 7
    //   154: aload 15
    //   156: getstatic 116	com/wandoujia/plugin/qr/R$id:decode_succeeded	I
    //   159: aload 14
    //   161: invokestatic 120	android/os/Message:obtain	(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
    //   164: astore 19
    //   166: new 122	android/os/Bundle
    //   169: dup
    //   170: invokespecial 123	android/os/Bundle:<init>	()V
    //   173: astore 20
    //   175: aload 20
    //   177: ldc 125
    //   179: aload 10
    //   181: invokevirtual 130	com/wandoujia/plugin/qr/a/f:d	()Landroid/graphics/Bitmap;
    //   184: invokevirtual 134	android/os/Bundle:putParcelable	(Ljava/lang/String;Landroid/os/Parcelable;)V
    //   187: aload 19
    //   189: aload 20
    //   191: invokevirtual 138	android/os/Message:setData	(Landroid/os/Bundle;)V
    //   194: aload 19
    //   196: invokevirtual 141	android/os/Message:sendToTarget	()V
    //   199: return
    //   200: aload_2
    //   201: arraylength
    //   202: newarray byte
    //   204: astore 8
    //   206: iconst_0
    //   207: istore 9
    //   209: iload 9
    //   211: iload 4
    //   213: if_icmpge +49 -> 262
    //   216: iconst_0
    //   217: istore 22
    //   219: iload 22
    //   221: iload_3
    //   222: if_icmpge +34 -> 256
    //   225: aload 8
    //   227: iconst_m1
    //   228: iload 4
    //   230: iload 22
    //   232: iload 4
    //   234: imul
    //   235: iadd
    //   236: iload 9
    //   238: isub
    //   239: iadd
    //   240: aload_2
    //   241: iload 22
    //   243: iload 9
    //   245: iload_3
    //   246: imul
    //   247: iadd
    //   248: baload
    //   249: bastore
    //   250: iinc 22 1
    //   253: goto -34 -> 219
    //   256: iinc 9 1
    //   259: goto -50 -> 209
    //   262: new 127	com/wandoujia/plugin/qr/a/f
    //   265: dup
    //   266: aload 8
    //   268: iload 4
    //   270: iload_3
    //   271: aload 7
    //   273: getfield 146	android/graphics/Rect:left	I
    //   276: aload 7
    //   278: getfield 149	android/graphics/Rect:top	I
    //   281: aload 7
    //   283: invokevirtual 153	android/graphics/Rect:width	()I
    //   286: aload 7
    //   288: invokevirtual 156	android/graphics/Rect:height	()I
    //   291: invokespecial 159	com/wandoujia/plugin/qr/a/f:<init>	([BIIIIII)V
    //   294: astore 10
    //   296: goto -234 -> 62
    //   299: astore 13
    //   301: aload_0
    //   302: getfield 29	com/wandoujia/plugin/qr/d:b	Lcom/wandoujia/p4/utils/c;
    //   305: invokevirtual 94	com/wandoujia/p4/utils/c:a	()V
    //   308: aconst_null
    //   309: astore 14
    //   311: goto -204 -> 107
    //   314: astore 12
    //   316: aload_0
    //   317: getfield 29	com/wandoujia/plugin/qr/d:b	Lcom/wandoujia/p4/utils/c;
    //   320: invokevirtual 94	com/wandoujia/p4/utils/c:a	()V
    //   323: aload 12
    //   325: athrow
    //   326: aload 15
    //   328: ifnull -321 -> 7
    //   331: aload 15
    //   333: getstatic 162	com/wandoujia/plugin/qr/R$id:decode_failed	I
    //   336: invokestatic 165	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   339: invokevirtual 141	android/os/Message:sendToTarget	()V
    //   342: return
    //   343: aload_1
    //   344: getfield 44	android/os/Message:what	I
    //   347: getstatic 168	com/wandoujia/plugin/qr/R$id:quit	I
    //   350: if_icmpne -343 -> 7
    //   353: aload_0
    //   354: iconst_0
    //   355: putfield 24	com/wandoujia/plugin/qr/d:c	Z
    //   358: invokestatic 174	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   361: invokevirtual 176	android/os/Looper:quit	()V
    //   364: return
    //   365: aconst_null
    //   366: astore 14
    //   368: goto -261 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   85	96	299	com/google/zxing/ReaderException
    //   85	96	314	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.d
 * JD-Core Version:    0.6.0
 */