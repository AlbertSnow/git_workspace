package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.s;
import com.google.android.gms.ads.internal.util.y;
import gv;
import ha;

@com.google.android.gms.ads.internal.report.client.a
public final class c extends com.google.android.gms.ads.internal.util.a
  implements i
{
  final q a;
  final Object b = new Object();
  final Context c;
  Runnable d;
  an e;
  private final b f;
  private final ha g;
  private AdRequestInfoParcel h;
  private AdResponseParcel i;
  private com.google.android.gms.ads.internal.mediation.c k;

  public c(Context paramContext, q paramq, ha paramha, b paramb)
  {
    this.f = paramb;
    this.c = paramContext;
    this.a = paramq;
    this.g = paramha;
  }

  private AdSizeParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    if (this.i.m == null)
      throw new f("The ad response must specify one of the supported ad sizes.", 0);
    String[] arrayOfString = this.i.m.split("x");
    if (arrayOfString.length != 2)
    {
      String str5 = String.valueOf(this.i.m);
      if (str5.length() != 0);
      for (String str6 = "Invalid ad size format from the ad response: ".concat(str5); ; str6 = new String("Invalid ad size format from the ad response: "))
        throw new f(str6, 0);
    }
    label295: label305: String str3;
    try
    {
      int j = Integer.parseInt(arrayOfString[0]);
      int m = Integer.parseInt(arrayOfString[1]);
      AdSizeParcel[] arrayOfAdSizeParcel = paramAdRequestInfoParcel.d.h;
      int n = arrayOfAdSizeParcel.length;
      i1 = 0;
      if (i1 < n)
      {
        localAdSizeParcel = arrayOfAdSizeParcel[i1];
        float f1 = this.c.getResources().getDisplayMetrics().density;
        if (localAdSizeParcel.f == -1)
        {
          i2 = (int)(localAdSizeParcel.g / f1);
          if (localAdSizeParcel.c != -2)
            break label295;
          i3 = (int)(localAdSizeParcel.d / f1);
          if ((j != i2) || (m != i3))
            break label305;
          return new AdSizeParcel(localAdSizeParcel, paramAdRequestInfoParcel.d.h);
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        int i1;
        AdSizeParcel localAdSizeParcel;
        String str1 = String.valueOf(this.i.m);
        if (str1.length() != 0);
        for (String str2 = "Invalid ad size number from the ad response: ".concat(str1); ; str2 = new String("Invalid ad size number from the ad response: "))
          throw new f(str2, 0);
        int i2 = localAdSizeParcel.f;
        continue;
        int i3 = localAdSizeParcel.c;
        continue;
        i1++;
      }
      str3 = String.valueOf(this.i.m);
      if (str3.length() == 0);
    }
    for (String str4 = "The ad size from the ad response was not one of the requested sizes: ".concat(str3); ; str4 = new String("The ad size from the ad response was not one of the requested sizes: "))
      throw new f(str4, 0);
  }

  public final void a()
  {
    com.google.android.gms.ads.internal.util.c.b("AdLoaderBackgroundTask started.");
    this.d = new d(this);
    y.a.postDelayed(this.d, ((Long)m.ai.a()).longValue());
    com.google.android.gms.ads.internal.util.promise.e locale = new com.google.android.gms.ads.internal.util.promise.e();
    long l = bc.a().i.b();
    s.a(new e(this, locale));
    String str = this.g.e.a(this.c);
    this.h = new AdRequestInfoParcel(this.a, str, l);
    locale.a(this.h);
  }

  final void a(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
    {
      com.google.android.gms.ads.internal.util.c.d(paramString);
      if (this.i != null)
        break label95;
      this.i = new AdResponseParcel(paramInt);
      label33: if (this.h == null)
        break label117;
    }
    label95: label117: for (AdRequestInfoParcel localAdRequestInfoParcel = this.h; ; localAdRequestInfoParcel = new AdRequestInfoParcel(this.a, null, -1L))
    {
      com.google.android.gms.ads.internal.state.b localb = new com.google.android.gms.ads.internal.state.b(localAdRequestInfoParcel, this.i, this.k, null, paramInt, -1L, this.i.n, null);
      this.f.a(localb);
      return;
      com.google.android.gms.ads.internal.util.c.e(paramString);
      break;
      this.i = new AdResponseParcel(paramInt, this.i.k);
      break label33;
    }
  }

  // ERROR //
  public final void a(AdResponseParcel paramAdResponseParcel)
  {
    // Byte code:
    //   0: ldc_w 262
    //   3: invokestatic 144	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   6: aload_0
    //   7: aload_1
    //   8: putfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   11: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   14: getfield 190	com/google/android/gms/ads/internal/bc:i	Laom;
    //   17: invokeinterface 194 1 0
    //   22: lstore_2
    //   23: aload_0
    //   24: getfield 37	com/google/android/gms/ads/internal/request/c:b	Ljava/lang/Object;
    //   27: astore 4
    //   29: aload 4
    //   31: monitorenter
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield 264	com/google/android/gms/ads/internal/request/c:e	Lcom/google/android/gms/ads/internal/util/an;
    //   37: aload 4
    //   39: monitorexit
    //   40: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   43: getfield 267	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   46: aload_0
    //   47: getfield 41	com/google/android/gms/ads/internal/request/c:c	Landroid/content/Context;
    //   50: aload_0
    //   51: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   54: getfield 271	com/google/android/gms/ads/internal/request/AdResponseParcel:H	Z
    //   57: invokevirtual 276	com/google/android/gms/ads/internal/state/h:b	(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    //   60: pop
    //   61: aload_0
    //   62: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   65: getfield 278	com/google/android/gms/ads/internal/request/AdResponseParcel:e	I
    //   68: bipush 254
    //   70: if_icmpeq +97 -> 167
    //   73: aload_0
    //   74: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   77: getfield 278	com/google/android/gms/ads/internal/request/AdResponseParcel:e	I
    //   80: bipush 253
    //   82: if_icmpeq +85 -> 167
    //   85: aload_0
    //   86: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   89: getfield 278	com/google/android/gms/ads/internal/request/AdResponseParcel:e	I
    //   92: istore 19
    //   94: new 58	com/google/android/gms/ads/internal/request/f
    //   97: dup
    //   98: new 280	java/lang/StringBuilder
    //   101: dup
    //   102: bipush 66
    //   104: invokespecial 281	java/lang/StringBuilder:<init>	(I)V
    //   107: ldc_w 283
    //   110: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: iload 19
    //   115: invokevirtual 290	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   118: invokevirtual 294	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: aload_0
    //   122: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   125: getfield 278	com/google/android/gms/ads/internal/request/AdResponseParcel:e	I
    //   128: invokespecial 63	com/google/android/gms/ads/internal/request/f:<init>	(Ljava/lang/String;I)V
    //   131: athrow
    //   132: astore 7
    //   134: aload_0
    //   135: aload 7
    //   137: getfield 296	com/google/android/gms/ads/internal/request/f:a	I
    //   140: aload 7
    //   142: invokevirtual 299	com/google/android/gms/ads/internal/request/f:getMessage	()Ljava/lang/String;
    //   145: invokevirtual 301	com/google/android/gms/ads/internal/request/c:a	(ILjava/lang/String;)V
    //   148: getstatic 156	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   151: aload_0
    //   152: getfield 151	com/google/android/gms/ads/internal/request/c:d	Ljava/lang/Runnable;
    //   155: invokevirtual 305	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   158: return
    //   159: astore 5
    //   161: aload 4
    //   163: monitorexit
    //   164: aload 5
    //   166: athrow
    //   167: aload_0
    //   168: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   171: getfield 278	com/google/android/gms/ads/internal/request/AdResponseParcel:e	I
    //   174: bipush 253
    //   176: if_icmpeq +166 -> 342
    //   179: aload_0
    //   180: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   183: getfield 307	com/google/android/gms/ads/internal/request/AdResponseParcel:c	Ljava/lang/String;
    //   186: invokestatic 313	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   189: ifeq +15 -> 204
    //   192: new 58	com/google/android/gms/ads/internal/request/f
    //   195: dup
    //   196: ldc_w 315
    //   199: iconst_3
    //   200: invokespecial 63	com/google/android/gms/ads/internal/request/f:<init>	(Ljava/lang/String;I)V
    //   203: athrow
    //   204: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   207: getfield 267	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   210: aload_0
    //   211: getfield 41	com/google/android/gms/ads/internal/request/c:c	Landroid/content/Context;
    //   214: aload_0
    //   215: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   218: getfield 318	com/google/android/gms/ads/internal/request/AdResponseParcel:u	Z
    //   221: invokevirtual 320	com/google/android/gms/ads/internal/state/h:a	(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    //   224: pop
    //   225: aload_0
    //   226: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   229: getfield 322	com/google/android/gms/ads/internal/request/AdResponseParcel:h	Z
    //   232: istore 14
    //   234: iload 14
    //   236: ifeq +301 -> 537
    //   239: aload_0
    //   240: new 324	com/google/android/gms/ads/internal/mediation/c
    //   243: dup
    //   244: aload_0
    //   245: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   248: getfield 307	com/google/android/gms/ads/internal/request/AdResponseParcel:c	Ljava/lang/String;
    //   251: invokespecial 325	com/google/android/gms/ads/internal/mediation/c:<init>	(Ljava/lang/String;)V
    //   254: putfield 234	com/google/android/gms/ads/internal/request/c:k	Lcom/google/android/gms/ads/internal/mediation/c;
    //   257: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   260: getfield 267	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   263: aload_0
    //   264: getfield 234	com/google/android/gms/ads/internal/request/c:k	Lcom/google/android/gms/ads/internal/mediation/c;
    //   267: getfield 327	com/google/android/gms/ads/internal/mediation/c:g	Z
    //   270: putfield 328	com/google/android/gms/ads/internal/state/h:h	Z
    //   273: aload_0
    //   274: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   277: getfield 330	com/google/android/gms/ads/internal/request/AdResponseParcel:I	Ljava/lang/String;
    //   280: invokestatic 313	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   283: ifne +59 -> 342
    //   286: getstatic 333	com/google/android/gms/ads/internal/config/m:aU	Lcom/google/android/gms/ads/internal/config/d;
    //   289: invokevirtual 167	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   292: checkcast 335	java/lang/Boolean
    //   295: invokevirtual 339	java/lang/Boolean:booleanValue	()Z
    //   298: ifeq +44 -> 342
    //   301: ldc_w 341
    //   304: invokestatic 144	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   307: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   310: getfield 344	com/google/android/gms/ads/internal/bc:g	Lcom/google/android/gms/ads/internal/util/ad;
    //   313: aload_0
    //   314: getfield 41	com/google/android/gms/ads/internal/request/c:c	Landroid/content/Context;
    //   317: invokevirtual 349	com/google/android/gms/ads/internal/util/ad:b	(Landroid/content/Context;)Landroid/webkit/CookieManager;
    //   320: astore 15
    //   322: aload 15
    //   324: ifnull +18 -> 342
    //   327: aload 15
    //   329: ldc_w 351
    //   332: aload_0
    //   333: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   336: getfield 330	com/google/android/gms/ads/internal/request/AdResponseParcel:I	Ljava/lang/String;
    //   339: invokevirtual 357	android/webkit/CookieManager:setCookie	(Ljava/lang/String;Ljava/lang/String;)V
    //   342: aload_0
    //   343: getfield 219	com/google/android/gms/ads/internal/request/c:h	Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    //   346: getfield 99	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:d	Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   349: getfield 104	com/google/android/gms/ads/internal/client/AdSizeParcel:h	[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   352: ifnull +220 -> 572
    //   355: aload_0
    //   356: aload_0
    //   357: getfield 219	com/google/android/gms/ads/internal/request/c:h	Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    //   360: invokespecial 359	com/google/android/gms/ads/internal/request/c:a	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   363: astore 12
    //   365: aload 12
    //   367: astore 8
    //   369: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   372: getfield 267	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   375: aload_0
    //   376: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   379: getfield 362	com/google/android/gms/ads/internal/request/AdResponseParcel:v	Z
    //   382: invokevirtual 365	com/google/android/gms/ads/internal/state/h:a	(Z)V
    //   385: aload_0
    //   386: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   389: getfield 368	com/google/android/gms/ads/internal/request/AdResponseParcel:r	Ljava/lang/String;
    //   392: invokestatic 313	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   395: ifne +171 -> 566
    //   398: new 370	org/json/JSONObject
    //   401: dup
    //   402: aload_0
    //   403: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   406: getfield 368	com/google/android/gms/ads/internal/request/AdResponseParcel:r	Ljava/lang/String;
    //   409: invokespecial 371	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   412: astore 9
    //   414: new 232	com/google/android/gms/ads/internal/state/b
    //   417: dup
    //   418: aload_0
    //   419: getfield 219	com/google/android/gms/ads/internal/request/c:h	Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    //   422: aload_0
    //   423: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   426: aload_0
    //   427: getfield 234	com/google/android/gms/ads/internal/request/c:k	Lcom/google/android/gms/ads/internal/mediation/c;
    //   430: aload 8
    //   432: bipush 254
    //   434: lload_2
    //   435: aload_0
    //   436: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   439: getfield 240	com/google/android/gms/ads/internal/request/AdResponseParcel:n	J
    //   442: aload 9
    //   444: invokespecial 243	com/google/android/gms/ads/internal/state/b:<init>	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/ads/internal/mediation/c;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V
    //   447: astore 10
    //   449: aload_0
    //   450: getfield 39	com/google/android/gms/ads/internal/request/c:f	Lcom/google/android/gms/ads/internal/request/b;
    //   453: aload 10
    //   455: invokeinterface 248 2 0
    //   460: getstatic 156	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   463: aload_0
    //   464: getfield 151	com/google/android/gms/ads/internal/request/c:d	Ljava/lang/Runnable;
    //   467: invokevirtual 305	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   470: return
    //   471: astore 16
    //   473: ldc_w 373
    //   476: aload 16
    //   478: invokestatic 376	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   481: aload_0
    //   482: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   485: getfield 307	com/google/android/gms/ads/internal/request/AdResponseParcel:c	Ljava/lang/String;
    //   488: invokestatic 75	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   491: astore 17
    //   493: aload 17
    //   495: invokevirtual 79	java/lang/String:length	()I
    //   498: ifeq +24 -> 522
    //   501: ldc_w 378
    //   504: aload 17
    //   506: invokevirtual 85	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   509: astore 18
    //   511: new 58	com/google/android/gms/ads/internal/request/f
    //   514: dup
    //   515: aload 18
    //   517: iconst_0
    //   518: invokespecial 63	com/google/android/gms/ads/internal/request/f:<init>	(Ljava/lang/String;I)V
    //   521: athrow
    //   522: new 67	java/lang/String
    //   525: dup
    //   526: ldc_w 378
    //   529: invokespecial 88	java/lang/String:<init>	(Ljava/lang/String;)V
    //   532: astore 18
    //   534: goto -23 -> 511
    //   537: invokestatic 187	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   540: getfield 267	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   543: aload_0
    //   544: getfield 50	com/google/android/gms/ads/internal/request/c:i	Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   547: getfield 381	com/google/android/gms/ads/internal/request/AdResponseParcel:L	Z
    //   550: putfield 328	com/google/android/gms/ads/internal/state/h:h	Z
    //   553: goto -280 -> 273
    //   556: astore 11
    //   558: ldc_w 383
    //   561: aload 11
    //   563: invokestatic 376	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   566: aconst_null
    //   567: astore 9
    //   569: goto -155 -> 414
    //   572: aconst_null
    //   573: astore 8
    //   575: goto -206 -> 369
    //
    // Exception table:
    //   from	to	target	type
    //   61	132	132	com/google/android/gms/ads/internal/request/f
    //   167	204	132	com/google/android/gms/ads/internal/request/f
    //   204	234	132	com/google/android/gms/ads/internal/request/f
    //   239	273	132	com/google/android/gms/ads/internal/request/f
    //   273	322	132	com/google/android/gms/ads/internal/request/f
    //   327	342	132	com/google/android/gms/ads/internal/request/f
    //   342	365	132	com/google/android/gms/ads/internal/request/f
    //   473	511	132	com/google/android/gms/ads/internal/request/f
    //   511	522	132	com/google/android/gms/ads/internal/request/f
    //   522	534	132	com/google/android/gms/ads/internal/request/f
    //   537	553	132	com/google/android/gms/ads/internal/request/f
    //   32	40	159	finally
    //   161	164	159	finally
    //   239	273	471	org/json/JSONException
    //   398	414	556	java/lang/Exception
  }

  public final void b()
  {
    synchronized (this.b)
    {
      if (this.e != null)
        this.e.c();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.c
 * JD-Core Version:    0.6.0
 */