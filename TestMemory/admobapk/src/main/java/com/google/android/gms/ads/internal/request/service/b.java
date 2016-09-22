package com.google.android.gms.ads.internal.request.service;

import amj;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.x;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.g;
import com.google.android.gms.ads.internal.util.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@com.google.android.gms.ads.internal.report.client.a
public final class b extends x
{
  private static final Object a = new Object();
  private static b b;
  private final Context c;
  private final a d;
  private final com.google.android.gms.ads.internal.config.a e;
  private final n f;

  private b(Context paramContext, com.google.android.gms.ads.internal.config.a parama, a parama1)
  {
    this.c = paramContext;
    this.d = parama1;
    this.e = parama;
    if (paramContext.getApplicationContext() != null);
    for (Context localContext = paramContext.getApplicationContext(); ; localContext = paramContext)
    {
      this.f = new n(localContext, new VersionInfoParcel(amj.a, amj.a, true), parama.a, new h(this), new com.google.android.gms.ads.internal.js.z());
      return;
    }
  }

  private static Location a(g paramg)
  {
    try
    {
      Location localLocation = (Location)paramg.get(((Long)m.aD.a()).longValue(), TimeUnit.MILLISECONDS);
      return localLocation;
    }
    catch (Exception localException)
    {
      c.c("Exception caught while getting location", localException);
    }
    return null;
  }

  // ERROR //
  private static AdResponseParcel a(Context paramContext, n paramn, com.google.android.gms.ads.internal.config.a parama, a parama1, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    // Byte code:
    //   0: ldc 122
    //   2: invokestatic 125	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: invokestatic 128	com/google/android/gms/ads/internal/config/m:a	(Landroid/content/Context;)V
    //   9: new 130	com/google/android/gms/ads/internal/csi/l
    //   12: dup
    //   13: getstatic 133	com/google/android/gms/ads/internal/config/m:v	Lcom/google/android/gms/ads/internal/config/d;
    //   16: invokevirtual 84	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   19: checkcast 135	java/lang/Boolean
    //   22: invokevirtual 139	java/lang/Boolean:booleanValue	()Z
    //   25: ldc 141
    //   27: aload 4
    //   29: getfield 146	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:d	Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   32: getfield 150	com/google/android/gms/ads/internal/client/AdSizeParcel:b	Ljava/lang/String;
    //   35: invokespecial 153	com/google/android/gms/ads/internal/csi/l:<init>	(ZLjava/lang/String;Ljava/lang/String;)V
    //   38: astore 5
    //   40: aload 4
    //   42: getfield 154	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:a	I
    //   45: bipush 10
    //   47: if_icmple +40 -> 87
    //   50: aload 4
    //   52: getfield 158	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:B	J
    //   55: ldc2_w 159
    //   58: lcmp
    //   59: ifeq +28 -> 87
    //   62: aload 5
    //   64: aload 5
    //   66: aload 4
    //   68: getfield 158	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:B	J
    //   71: invokevirtual 163	com/google/android/gms/ads/internal/csi/l:a	(J)Lcom/google/android/gms/ads/internal/csi/j;
    //   74: iconst_1
    //   75: anewarray 165	java/lang/String
    //   78: dup
    //   79: iconst_0
    //   80: ldc 167
    //   82: aastore
    //   83: invokevirtual 170	com/google/android/gms/ads/internal/csi/l:a	(Lcom/google/android/gms/ads/internal/csi/j;[Ljava/lang/String;)Z
    //   86: pop
    //   87: aload 5
    //   89: invokevirtual 173	com/google/android/gms/ads/internal/csi/l:a	()Lcom/google/android/gms/ads/internal/csi/j;
    //   92: astore 6
    //   94: aload 4
    //   96: getfield 154	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:a	I
    //   99: iconst_4
    //   100: if_icmplt +917 -> 1017
    //   103: aload 4
    //   105: getfield 177	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:o	Landroid/os/Bundle;
    //   108: ifnull +909 -> 1017
    //   111: aload 4
    //   113: getfield 177	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:o	Landroid/os/Bundle;
    //   116: astore 7
    //   118: getstatic 180	com/google/android/gms/ads/internal/config/m:E	Lcom/google/android/gms/ads/internal/config/d;
    //   121: invokevirtual 84	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   124: checkcast 135	java/lang/Boolean
    //   127: invokevirtual 139	java/lang/Boolean:booleanValue	()Z
    //   130: ifeq +877 -> 1007
    //   133: aload_3
    //   134: getfield 186	com/google/android/gms/ads/internal/request/service/a:h	Lcom/google/android/gms/ads/internal/request/service/p;
    //   137: ifnull +870 -> 1007
    //   140: aload 7
    //   142: ifnonnull +32 -> 174
    //   145: getstatic 189	com/google/android/gms/ads/internal/config/m:F	Lcom/google/android/gms/ads/internal/config/d;
    //   148: invokevirtual 84	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   151: checkcast 135	java/lang/Boolean
    //   154: invokevirtual 139	java/lang/Boolean:booleanValue	()Z
    //   157: ifeq +17 -> 174
    //   160: ldc 191
    //   162: invokestatic 193	com/google/android/gms/ads/internal/util/c:a	(Ljava/lang/String;)V
    //   165: new 195	android/os/Bundle
    //   168: dup
    //   169: invokespecial 196	android/os/Bundle:<init>	()V
    //   172: astore 7
    //   174: aload 7
    //   176: ifnull +821 -> 997
    //   179: new 198	com/google/android/gms/ads/internal/request/service/c
    //   182: dup
    //   183: aload_3
    //   184: aload_0
    //   185: aload 4
    //   187: aload 7
    //   189: invokespecial 201	com/google/android/gms/ads/internal/request/service/c:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Landroid/os/Bundle;)V
    //   192: astore 50
    //   194: getstatic 206	com/google/android/gms/ads/internal/util/s:a	Ljava/util/concurrent/ExecutorService;
    //   197: aload 50
    //   199: invokestatic 209	com/google/android/gms/ads/internal/util/s:a	(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/ads/internal/util/future/g;
    //   202: astore 9
    //   204: aload 7
    //   206: astore 8
    //   208: new 211	com/google/android/gms/ads/internal/util/future/b
    //   211: dup
    //   212: aconst_null
    //   213: invokespecial 214	com/google/android/gms/ads/internal/util/future/b:<init>	(Ljava/lang/Object;)V
    //   216: astore 10
    //   218: aload 4
    //   220: getfield 217	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:c	Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    //   223: getfield 221	com/google/android/gms/ads/internal/client/AdRequestParcel:c	Landroid/os/Bundle;
    //   226: astore 11
    //   228: aload 11
    //   230: ifnull +86 -> 316
    //   233: aload 11
    //   235: ldc 223
    //   237: invokevirtual 227	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   240: ifnull +76 -> 316
    //   243: iconst_1
    //   244: istore 12
    //   246: aload 4
    //   248: getfield 230	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:I	Z
    //   251: ifeq +739 -> 990
    //   254: iload 12
    //   256: ifne +734 -> 990
    //   259: aload_3
    //   260: getfield 233	com/google/android/gms/ads/internal/request/service/a:d	Lcom/google/android/gms/ads/internal/location/a;
    //   263: astore 48
    //   265: aload 4
    //   267: getfield 236	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:f	Landroid/content/pm/ApplicationInfo;
    //   270: pop
    //   271: aload 48
    //   273: invokeinterface 241 1 0
    //   278: astore 13
    //   280: invokestatic 246	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   283: getfield 250	com/google/android/gms/ads/internal/bc:k	Lcom/google/android/gms/ads/internal/request/service/t;
    //   286: aload_0
    //   287: invokevirtual 255	com/google/android/gms/ads/internal/request/service/t:a	(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/request/service/r;
    //   290: astore 14
    //   292: aload 14
    //   294: getfield 260	com/google/android/gms/ads/internal/request/service/r:m	I
    //   297: iconst_m1
    //   298: if_icmpne +24 -> 322
    //   301: ldc_w 262
    //   304: invokestatic 125	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   307: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   310: dup
    //   311: iconst_2
    //   312: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   315: areturn
    //   316: iconst_0
    //   317: istore 12
    //   319: goto -73 -> 246
    //   322: aload 4
    //   324: getfield 154	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:a	I
    //   327: bipush 7
    //   329: if_icmplt +69 -> 398
    //   332: aload 4
    //   334: getfield 270	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:w	Ljava/lang/String;
    //   337: astore 15
    //   339: new 272	com/google/android/gms/ads/internal/request/service/k
    //   342: dup
    //   343: aload 15
    //   345: aload 4
    //   347: getfield 236	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:f	Landroid/content/pm/ApplicationInfo;
    //   350: getfield 277	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   353: invokespecial 280	com/google/android/gms/ads/internal/request/service/k:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   356: astore 16
    //   358: aload 4
    //   360: getfield 217	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:c	Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    //   363: getfield 221	com/google/android/gms/ads/internal/client/AdRequestParcel:c	Landroid/os/Bundle;
    //   366: ifnull +43 -> 409
    //   369: aload 4
    //   371: getfield 217	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:c	Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    //   374: getfield 221	com/google/android/gms/ads/internal/client/AdRequestParcel:c	Landroid/os/Bundle;
    //   377: ldc 223
    //   379: invokevirtual 227	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   382: astore 47
    //   384: aload 47
    //   386: ifnull +23 -> 409
    //   389: aload_0
    //   390: aload 4
    //   392: aload 47
    //   394: invokestatic 285	com/google/android/gms/ads/internal/request/service/j:a	(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   397: areturn
    //   398: invokestatic 291	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   401: invokevirtual 295	java/util/UUID:toString	()Ljava/lang/String;
    //   404: astore 15
    //   406: goto -67 -> 339
    //   409: aload_3
    //   410: getfield 298	com/google/android/gms/ads/internal/request/service/a:b	Lcom/google/android/gms/ads/internal/config/c;
    //   413: aload 4
    //   415: invokeinterface 303 2 0
    //   420: astore 17
    //   422: aload_3
    //   423: getfield 306	com/google/android/gms/ads/internal/request/service/a:e	Lcom/google/android/gms/ads/internal/spamsignals/b;
    //   426: aload 4
    //   428: invokeinterface 311 2 0
    //   433: astore 18
    //   435: aload 9
    //   437: ifnull +38 -> 475
    //   440: ldc_w 313
    //   443: invokestatic 193	com/google/android/gms/ads/internal/util/c:a	(Ljava/lang/String;)V
    //   446: aload 9
    //   448: getstatic 316	com/google/android/gms/ads/internal/config/m:G	Lcom/google/android/gms/ads/internal/config/d;
    //   451: invokevirtual 84	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   454: checkcast 86	java/lang/Long
    //   457: invokevirtual 90	java/lang/Long:longValue	()J
    //   460: getstatic 96	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   463: invokeinterface 319 4 0
    //   468: pop
    //   469: ldc_w 321
    //   472: invokestatic 193	com/google/android/gms/ads/internal/util/c:a	(Ljava/lang/String;)V
    //   475: aload 4
    //   477: getfield 325	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:g	Landroid/content/pm/PackageInfo;
    //   480: getfield 328	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   483: pop
    //   484: aload 4
    //   486: aload 14
    //   488: aconst_null
    //   489: aload 13
    //   491: invokestatic 330	com/google/android/gms/ads/internal/request/service/b:a	(Lcom/google/android/gms/ads/internal/util/future/g;)Landroid/location/Location;
    //   494: aload 18
    //   496: aload 17
    //   498: aload 8
    //   500: aconst_null
    //   501: invokestatic 333	com/google/android/gms/ads/internal/request/service/j:a	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/service/r;Lcom/google/android/gms/ads/internal/request/service/y;Landroid/location/Location;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    //   504: astore 20
    //   506: aload 20
    //   508: ifnonnull +36 -> 544
    //   511: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   514: dup
    //   515: iconst_0
    //   516: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   519: areturn
    //   520: astore 44
    //   522: ldc_w 335
    //   525: aload 44
    //   527: invokestatic 111	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   530: goto -55 -> 475
    //   533: astore 45
    //   535: ldc_w 337
    //   538: invokestatic 125	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   541: goto -66 -> 475
    //   544: aload 4
    //   546: getfield 154	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:a	I
    //   549: bipush 7
    //   551: if_icmpge +14 -> 565
    //   554: aload 20
    //   556: ldc_w 339
    //   559: aload 15
    //   561: invokevirtual 345	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   564: pop
    //   565: aload 20
    //   567: ldc_w 347
    //   570: ldc_w 349
    //   573: invokevirtual 345	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   576: pop
    //   577: aload 20
    //   579: invokevirtual 350	org/json/JSONObject:toString	()Ljava/lang/String;
    //   582: astore 22
    //   584: aload 5
    //   586: aload 6
    //   588: iconst_1
    //   589: anewarray 165	java/lang/String
    //   592: dup
    //   593: iconst_0
    //   594: ldc_w 352
    //   597: aastore
    //   598: invokevirtual 170	com/google/android/gms/ads/internal/csi/l:a	(Lcom/google/android/gms/ads/internal/csi/j;[Ljava/lang/String;)Z
    //   601: pop
    //   602: aload 5
    //   604: invokevirtual 173	com/google/android/gms/ads/internal/csi/l:a	()Lcom/google/android/gms/ads/internal/csi/j;
    //   607: astore 24
    //   609: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   612: new 359	com/google/android/gms/ads/internal/request/service/d
    //   615: dup
    //   616: aload_1
    //   617: aload 16
    //   619: aload 5
    //   621: aload 24
    //   623: aload 22
    //   625: invokespecial 362	com/google/android/gms/ads/internal/request/service/d:<init>	(Lcom/google/android/gms/ads/internal/js/n;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/csi/l;Lcom/google/android/gms/ads/internal/csi/j;Ljava/lang/String;)V
    //   628: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   631: pop
    //   632: aload 16
    //   634: getfield 371	com/google/android/gms/ads/internal/request/service/k:d	Lcom/google/android/gms/ads/internal/util/future/a;
    //   637: ldc2_w 372
    //   640: getstatic 376	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   643: invokeinterface 319 4 0
    //   648: checkcast 378	com/google/android/gms/ads/internal/request/service/q
    //   651: astore 31
    //   653: aload 31
    //   655: ifnonnull +84 -> 739
    //   658: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   661: dup
    //   662: iconst_0
    //   663: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   666: astore 39
    //   668: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   671: new 380	com/google/android/gms/ads/internal/request/service/g
    //   674: dup
    //   675: aload_3
    //   676: aload_0
    //   677: aload 16
    //   679: aload 4
    //   681: invokespecial 383	com/google/android/gms/ads/internal/request/service/g:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   684: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   687: pop
    //   688: aload 39
    //   690: areturn
    //   691: astore 21
    //   693: ldc_w 385
    //   696: aload 21
    //   698: invokestatic 111	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   701: goto -124 -> 577
    //   704: astore 28
    //   706: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   709: dup
    //   710: iconst_0
    //   711: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   714: astore 29
    //   716: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   719: new 380	com/google/android/gms/ads/internal/request/service/g
    //   722: dup
    //   723: aload_3
    //   724: aload_0
    //   725: aload 16
    //   727: aload 4
    //   729: invokespecial 383	com/google/android/gms/ads/internal/request/service/g:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   732: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   735: pop
    //   736: aload 29
    //   738: areturn
    //   739: aload 31
    //   741: getfield 387	com/google/android/gms/ads/internal/request/service/q:h	I
    //   744: bipush 254
    //   746: if_icmpeq +40 -> 786
    //   749: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   752: dup
    //   753: aload 31
    //   755: getfield 387	com/google/android/gms/ads/internal/request/service/q:h	I
    //   758: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   761: astore 32
    //   763: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   766: new 380	com/google/android/gms/ads/internal/request/service/g
    //   769: dup
    //   770: aload_3
    //   771: aload_0
    //   772: aload 16
    //   774: aload 4
    //   776: invokespecial 383	com/google/android/gms/ads/internal/request/service/g:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   779: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   782: pop
    //   783: aload 32
    //   785: areturn
    //   786: aload 5
    //   788: invokevirtual 389	com/google/android/gms/ads/internal/csi/l:d	()Lcom/google/android/gms/ads/internal/csi/j;
    //   791: ifnull +24 -> 815
    //   794: aload 5
    //   796: aload 5
    //   798: invokevirtual 389	com/google/android/gms/ads/internal/csi/l:d	()Lcom/google/android/gms/ads/internal/csi/j;
    //   801: iconst_1
    //   802: anewarray 165	java/lang/String
    //   805: dup
    //   806: iconst_0
    //   807: ldc_w 391
    //   810: aastore
    //   811: invokevirtual 170	com/google/android/gms/ads/internal/csi/l:a	(Lcom/google/android/gms/ads/internal/csi/j;[Ljava/lang/String;)Z
    //   814: pop
    //   815: aload 31
    //   817: getfield 393	com/google/android/gms/ads/internal/request/service/q:f	Ljava/lang/String;
    //   820: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   823: istore 34
    //   825: aconst_null
    //   826: astore 35
    //   828: iload 34
    //   830: ifne +16 -> 846
    //   833: aload_0
    //   834: aload 4
    //   836: aload 31
    //   838: getfield 393	com/google/android/gms/ads/internal/request/service/q:f	Ljava/lang/String;
    //   841: invokestatic 285	com/google/android/gms/ads/internal/request/service/j:a	(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   844: astore 35
    //   846: aload 35
    //   848: ifnonnull +41 -> 889
    //   851: aload 31
    //   853: getfield 401	com/google/android/gms/ads/internal/request/service/q:g	Ljava/lang/String;
    //   856: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   859: ifne +30 -> 889
    //   862: aload 4
    //   864: aload_0
    //   865: aload 4
    //   867: getfield 404	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:k	Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    //   870: getfield 405	com/google/android/gms/ads/internal/util/client/VersionInfoParcel:b	Ljava/lang/String;
    //   873: aload 31
    //   875: getfield 401	com/google/android/gms/ads/internal/request/service/q:g	Ljava/lang/String;
    //   878: aconst_null
    //   879: aload 31
    //   881: aload 5
    //   883: aload_3
    //   884: invokestatic 408	com/google/android/gms/ads/internal/request/service/b:a	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/request/service/q;Lcom/google/android/gms/ads/internal/csi/l;Lcom/google/android/gms/ads/internal/request/service/a;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   887: astore 35
    //   889: aload 35
    //   891: ifnonnull +13 -> 904
    //   894: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   897: dup
    //   898: iconst_0
    //   899: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   902: astore 35
    //   904: aload 5
    //   906: aload 6
    //   908: iconst_1
    //   909: anewarray 165	java/lang/String
    //   912: dup
    //   913: iconst_0
    //   914: ldc_w 410
    //   917: aastore
    //   918: invokevirtual 170	com/google/android/gms/ads/internal/csi/l:a	(Lcom/google/android/gms/ads/internal/csi/j;[Ljava/lang/String;)Z
    //   921: pop
    //   922: aload 35
    //   924: aload 5
    //   926: invokevirtual 412	com/google/android/gms/ads/internal/csi/l:b	()Ljava/lang/String;
    //   929: putfield 415	com/google/android/gms/ads/internal/request/AdResponseParcel:y	Ljava/lang/String;
    //   932: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   935: new 380	com/google/android/gms/ads/internal/request/service/g
    //   938: dup
    //   939: aload_3
    //   940: aload_0
    //   941: aload 16
    //   943: aload 4
    //   945: invokespecial 383	com/google/android/gms/ads/internal/request/service/g:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   948: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   951: pop
    //   952: aload 35
    //   954: areturn
    //   955: astore 26
    //   957: getstatic 357	com/google/android/gms/ads/internal/util/y:a	Landroid/os/Handler;
    //   960: new 380	com/google/android/gms/ads/internal/request/service/g
    //   963: dup
    //   964: aload_3
    //   965: aload_0
    //   966: aload 16
    //   968: aload 4
    //   970: invokespecial 383	com/google/android/gms/ads/internal/request/service/g:<init>	(Lcom/google/android/gms/ads/internal/request/service/a;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/service/k;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   973: invokevirtual 368	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   976: pop
    //   977: aload 26
    //   979: athrow
    //   980: astore 42
    //   982: goto -417 -> 565
    //   985: astore 44
    //   987: goto -465 -> 522
    //   990: aload 10
    //   992: astore 13
    //   994: goto -714 -> 280
    //   997: aload 7
    //   999: astore 8
    //   1001: aconst_null
    //   1002: astore 9
    //   1004: goto -796 -> 208
    //   1007: aload 7
    //   1009: astore 8
    //   1011: aconst_null
    //   1012: astore 9
    //   1014: goto -806 -> 208
    //   1017: aconst_null
    //   1018: astore 7
    //   1020: goto -902 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   440	475	520	java/lang/InterruptedException
    //   440	475	533	java/util/concurrent/TimeoutException
    //   565	577	691	org/json/JSONException
    //   632	653	704	java/lang/Exception
    //   632	653	955	finally
    //   658	668	955	finally
    //   706	716	955	finally
    //   739	763	955	finally
    //   786	815	955	finally
    //   815	825	955	finally
    //   833	846	955	finally
    //   851	889	955	finally
    //   894	904	955	finally
    //   904	932	955	finally
    //   554	565	980	org/json/JSONException
    //   440	475	985	java/util/concurrent/ExecutionException
  }

  // ERROR //
  public static AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel, Context paramContext, String paramString1, String paramString2, String paramString3, q paramq, com.google.android.gms.ads.internal.csi.l paraml, a parama)
  {
    // Byte code:
    //   0: aload 6
    //   2: ifnull +857 -> 859
    //   5: aload 6
    //   7: invokevirtual 173	com/google/android/gms/ads/internal/csi/l:a	()Lcom/google/android/gms/ads/internal/csi/j;
    //   10: astore 8
    //   12: new 419	com/google/android/gms/ads/internal/request/service/o
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 422	com/google/android/gms/ads/internal/request/service/o:<init>	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    //   20: astore 9
    //   22: aload_3
    //   23: invokestatic 426	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: astore 13
    //   28: aload 13
    //   30: invokevirtual 430	java/lang/String:length	()I
    //   33: ifeq +497 -> 530
    //   36: ldc_w 432
    //   39: aload 13
    //   41: invokevirtual 435	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore 14
    //   46: aload 14
    //   48: invokestatic 125	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   51: new 437	java/net/URL
    //   54: dup
    //   55: aload_3
    //   56: invokespecial 439	java/net/URL:<init>	(Ljava/lang/String;)V
    //   59: astore 15
    //   61: invokestatic 246	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   64: getfield 443	com/google/android/gms/ads/internal/bc:i	Laom;
    //   67: invokeinterface 447 1 0
    //   72: lstore 16
    //   74: iconst_0
    //   75: istore 18
    //   77: aload 15
    //   79: astore 19
    //   81: aload 19
    //   83: invokevirtual 451	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   86: checkcast 453	java/net/HttpURLConnection
    //   89: astore 20
    //   91: invokestatic 246	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   94: getfield 456	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   97: aload_1
    //   98: aload_2
    //   99: iconst_0
    //   100: aload 20
    //   102: invokevirtual 459	com/google/android/gms/ads/internal/util/y:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   105: aload 4
    //   107: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   110: ifne +21 -> 131
    //   113: aload 5
    //   115: getfield 461	com/google/android/gms/ads/internal/request/service/q:d	Z
    //   118: ifeq +13 -> 131
    //   121: aload 20
    //   123: ldc_w 463
    //   126: aload 4
    //   128: invokevirtual 466	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aload_0
    //   132: getfield 468	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:J	Ljava/lang/String;
    //   135: astore 22
    //   137: aload 22
    //   139: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   142: ifne +19 -> 161
    //   145: ldc_w 470
    //   148: invokestatic 125	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   151: aload 20
    //   153: ldc_w 472
    //   156: aload 22
    //   158: invokevirtual 466	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload 5
    //   163: ifnull +64 -> 227
    //   166: aload 5
    //   168: getfield 473	com/google/android/gms/ads/internal/request/service/q:b	Ljava/lang/String;
    //   171: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   174: ifne +53 -> 227
    //   177: aload 20
    //   179: iconst_1
    //   180: invokevirtual 477	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   183: aload 5
    //   185: getfield 473	com/google/android/gms/ads/internal/request/service/q:b	Ljava/lang/String;
    //   188: invokevirtual 481	java/lang/String:getBytes	()[B
    //   191: astore 39
    //   193: aload 20
    //   195: aload 39
    //   197: arraylength
    //   198: invokevirtual 484	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   201: new 486	java/io/BufferedOutputStream
    //   204: dup
    //   205: aload 20
    //   207: invokevirtual 490	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   210: invokespecial 493	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   213: astore 40
    //   215: aload 40
    //   217: aload 39
    //   219: invokevirtual 497	java/io/BufferedOutputStream:write	([B)V
    //   222: aload 40
    //   224: invokestatic 502	aop:a	(Ljava/io/Closeable;)V
    //   227: aload 20
    //   229: invokevirtual 505	java/net/HttpURLConnection:getResponseCode	()I
    //   232: istore 23
    //   234: aload 20
    //   236: invokevirtual 509	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   239: astore 24
    //   241: iload 23
    //   243: sipush 200
    //   246: if_icmplt +379 -> 625
    //   249: iload 23
    //   251: sipush 300
    //   254: if_icmpge +371 -> 625
    //   257: aload 19
    //   259: invokevirtual 510	java/net/URL:toString	()Ljava/lang/String;
    //   262: astore 31
    //   264: new 512	java/io/InputStreamReader
    //   267: dup
    //   268: aload 20
    //   270: invokevirtual 516	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   273: invokespecial 519	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   276: astore 32
    //   278: invokestatic 246	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   281: getfield 456	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   284: pop
    //   285: aload 32
    //   287: invokestatic 522	com/google/android/gms/ads/internal/util/y:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   290: astore 36
    //   292: aload 32
    //   294: invokestatic 502	aop:a	(Ljava/io/Closeable;)V
    //   297: aload 31
    //   299: aload 24
    //   301: aload 36
    //   303: iload 23
    //   305: invokestatic 525	com/google/android/gms/ads/internal/request/service/b:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   308: aload 9
    //   310: aload 31
    //   312: putfield 526	com/google/android/gms/ads/internal/request/service/o:b	Ljava/lang/String;
    //   315: aload 9
    //   317: aload 36
    //   319: putfield 528	com/google/android/gms/ads/internal/request/service/o:c	Ljava/lang/String;
    //   322: aload 9
    //   324: aload 24
    //   326: invokevirtual 531	com/google/android/gms/ads/internal/request/service/o:a	(Ljava/util/Map;)V
    //   329: aload 6
    //   331: ifnull +21 -> 352
    //   334: aload 6
    //   336: aload 8
    //   338: iconst_1
    //   339: anewarray 165	java/lang/String
    //   342: dup
    //   343: iconst_0
    //   344: ldc_w 533
    //   347: aastore
    //   348: invokevirtual 170	com/google/android/gms/ads/internal/csi/l:a	(Lcom/google/android/gms/ads/internal/csi/j;[Ljava/lang/String;)Z
    //   351: pop
    //   352: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   355: dup
    //   356: aload 9
    //   358: getfield 536	com/google/android/gms/ads/internal/request/service/o:E	Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    //   361: aload 9
    //   363: getfield 526	com/google/android/gms/ads/internal/request/service/o:b	Ljava/lang/String;
    //   366: aload 9
    //   368: getfield 528	com/google/android/gms/ads/internal/request/service/o:c	Ljava/lang/String;
    //   371: aload 9
    //   373: getfield 539	com/google/android/gms/ads/internal/request/service/o:d	Ljava/util/List;
    //   376: aload 9
    //   378: getfield 541	com/google/android/gms/ads/internal/request/service/o:g	Ljava/util/List;
    //   381: aload 9
    //   383: getfield 543	com/google/android/gms/ads/internal/request/service/o:h	J
    //   386: aload 9
    //   388: getfield 545	com/google/android/gms/ads/internal/request/service/o:i	Z
    //   391: ldc2_w 159
    //   394: aload 9
    //   396: getfield 548	com/google/android/gms/ads/internal/request/service/o:j	Ljava/util/List;
    //   399: aload 9
    //   401: getfield 550	com/google/android/gms/ads/internal/request/service/o:k	J
    //   404: aload 9
    //   406: getfield 553	com/google/android/gms/ads/internal/request/service/o:l	I
    //   409: aload 9
    //   411: getfield 554	com/google/android/gms/ads/internal/request/service/o:a	Ljava/lang/String;
    //   414: lload 16
    //   416: aload 9
    //   418: getfield 556	com/google/android/gms/ads/internal/request/service/o:e	Ljava/lang/String;
    //   421: aload 9
    //   423: getfield 557	com/google/android/gms/ads/internal/request/service/o:f	Ljava/lang/String;
    //   426: aload 9
    //   428: getfield 559	com/google/android/gms/ads/internal/request/service/o:m	Z
    //   431: aload 9
    //   433: getfield 562	com/google/android/gms/ads/internal/request/service/o:n	Z
    //   436: aload 9
    //   438: getfield 564	com/google/android/gms/ads/internal/request/service/o:o	Z
    //   441: aload 9
    //   443: getfield 567	com/google/android/gms/ads/internal/request/service/o:p	Z
    //   446: iconst_0
    //   447: aload 9
    //   449: getfield 570	com/google/android/gms/ads/internal/request/service/o:q	Ljava/lang/String;
    //   452: aload 9
    //   454: getfield 573	com/google/android/gms/ads/internal/request/service/o:r	Z
    //   457: aload 9
    //   459: getfield 576	com/google/android/gms/ads/internal/request/service/o:s	Z
    //   462: aload 9
    //   464: getfield 580	com/google/android/gms/ads/internal/request/service/o:t	Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
    //   467: aload 9
    //   469: getfield 583	com/google/android/gms/ads/internal/request/service/o:u	Ljava/util/List;
    //   472: aload 9
    //   474: getfield 585	com/google/android/gms/ads/internal/request/service/o:v	Ljava/util/List;
    //   477: aload 9
    //   479: getfield 587	com/google/android/gms/ads/internal/request/service/o:w	Z
    //   482: aload 9
    //   484: getfield 591	com/google/android/gms/ads/internal/request/service/o:x	Lcom/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel;
    //   487: aload 9
    //   489: getfield 593	com/google/android/gms/ads/internal/request/service/o:y	Z
    //   492: aload 9
    //   494: getfield 596	com/google/android/gms/ads/internal/request/service/o:z	Ljava/lang/String;
    //   497: aload 9
    //   499: getfield 599	com/google/android/gms/ads/internal/request/service/o:A	Ljava/util/List;
    //   502: aload 9
    //   504: getfield 601	com/google/android/gms/ads/internal/request/service/o:B	Ljava/lang/String;
    //   507: aload 9
    //   509: getfield 604	com/google/android/gms/ads/internal/request/service/o:C	Z
    //   512: aload 9
    //   514: getfield 607	com/google/android/gms/ads/internal/request/service/o:D	Ljava/lang/String;
    //   517: invokespecial 610	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;ZZLcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V
    //   520: astore 38
    //   522: aload 20
    //   524: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   527: aload 38
    //   529: areturn
    //   530: new 165	java/lang/String
    //   533: dup
    //   534: ldc_w 432
    //   537: invokespecial 614	java/lang/String:<init>	(Ljava/lang/String;)V
    //   540: astore 14
    //   542: goto -496 -> 46
    //   545: astore 10
    //   547: aload 10
    //   549: invokevirtual 617	java/io/IOException:getMessage	()Ljava/lang/String;
    //   552: invokestatic 426	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   555: astore 11
    //   557: aload 11
    //   559: invokevirtual 430	java/lang/String:length	()I
    //   562: ifeq +264 -> 826
    //   565: ldc_w 619
    //   568: aload 11
    //   570: invokevirtual 435	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   573: astore 12
    //   575: aload 12
    //   577: invokestatic 621	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   580: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   583: dup
    //   584: iconst_2
    //   585: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   588: areturn
    //   589: astore 41
    //   591: aconst_null
    //   592: astore 42
    //   594: aload 42
    //   596: invokestatic 502	aop:a	(Ljava/io/Closeable;)V
    //   599: aload 41
    //   601: athrow
    //   602: astore 21
    //   604: aload 20
    //   606: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   609: aload 21
    //   611: athrow
    //   612: astore 33
    //   614: aconst_null
    //   615: astore 34
    //   617: aload 34
    //   619: invokestatic 502	aop:a	(Ljava/io/Closeable;)V
    //   622: aload 33
    //   624: athrow
    //   625: aload 19
    //   627: invokevirtual 510	java/net/URL:toString	()Ljava/lang/String;
    //   630: aload 24
    //   632: aconst_null
    //   633: iload 23
    //   635: invokestatic 525	com/google/android/gms/ads/internal/request/service/b:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   638: iload 23
    //   640: sipush 300
    //   643: if_icmplt +100 -> 743
    //   646: iload 23
    //   648: sipush 400
    //   651: if_icmpge +92 -> 743
    //   654: aload 20
    //   656: ldc_w 623
    //   659: invokevirtual 626	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   662: astore 26
    //   664: aload 26
    //   666: invokestatic 399	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   669: ifeq +27 -> 696
    //   672: ldc_w 628
    //   675: invokestatic 621	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   678: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   681: dup
    //   682: iconst_0
    //   683: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   686: astore 30
    //   688: aload 20
    //   690: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   693: aload 30
    //   695: areturn
    //   696: new 437	java/net/URL
    //   699: dup
    //   700: aload 26
    //   702: invokespecial 439	java/net/URL:<init>	(Ljava/lang/String;)V
    //   705: astore 27
    //   707: iload 18
    //   709: iconst_1
    //   710: iadd
    //   711: istore 28
    //   713: iload 28
    //   715: iconst_5
    //   716: if_icmple +71 -> 787
    //   719: ldc_w 630
    //   722: invokestatic 621	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   725: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   728: dup
    //   729: iconst_0
    //   730: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   733: astore 29
    //   735: aload 20
    //   737: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   740: aload 29
    //   742: areturn
    //   743: new 632	java/lang/StringBuilder
    //   746: dup
    //   747: bipush 46
    //   749: invokespecial 633	java/lang/StringBuilder:<init>	(I)V
    //   752: ldc_w 635
    //   755: invokevirtual 639	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: iload 23
    //   760: invokevirtual 642	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   763: invokevirtual 643	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   766: invokestatic 621	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   769: new 264	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   772: dup
    //   773: iconst_0
    //   774: invokespecial 267	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   777: astore 25
    //   779: aload 20
    //   781: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   784: aload 25
    //   786: areturn
    //   787: aload 9
    //   789: aload 24
    //   791: invokevirtual 531	com/google/android/gms/ads/internal/request/service/o:a	(Ljava/util/Map;)V
    //   794: aload 20
    //   796: invokevirtual 613	java/net/HttpURLConnection:disconnect	()V
    //   799: aload 7
    //   801: ifnull +14 -> 815
    //   804: iload 28
    //   806: istore 18
    //   808: aload 27
    //   810: astore 19
    //   812: goto -731 -> 81
    //   815: iload 28
    //   817: istore 18
    //   819: aload 27
    //   821: astore 19
    //   823: goto -742 -> 81
    //   826: new 165	java/lang/String
    //   829: dup
    //   830: ldc_w 619
    //   833: invokespecial 614	java/lang/String:<init>	(Ljava/lang/String;)V
    //   836: astore 12
    //   838: goto -263 -> 575
    //   841: astore 33
    //   843: aload 32
    //   845: astore 34
    //   847: goto -230 -> 617
    //   850: astore 41
    //   852: aload 40
    //   854: astore 42
    //   856: goto -262 -> 594
    //   859: aconst_null
    //   860: astore 8
    //   862: goto -850 -> 12
    //
    // Exception table:
    //   from	to	target	type
    //   12	46	545	java/io/IOException
    //   46	74	545	java/io/IOException
    //   81	91	545	java/io/IOException
    //   522	527	545	java/io/IOException
    //   530	542	545	java/io/IOException
    //   604	612	545	java/io/IOException
    //   688	693	545	java/io/IOException
    //   735	740	545	java/io/IOException
    //   779	784	545	java/io/IOException
    //   794	799	545	java/io/IOException
    //   201	215	589	finally
    //   91	131	602	finally
    //   131	161	602	finally
    //   166	201	602	finally
    //   222	227	602	finally
    //   227	241	602	finally
    //   257	264	602	finally
    //   292	329	602	finally
    //   334	352	602	finally
    //   352	522	602	finally
    //   594	602	602	finally
    //   617	625	602	finally
    //   625	638	602	finally
    //   654	688	602	finally
    //   696	707	602	finally
    //   719	735	602	finally
    //   743	779	602	finally
    //   787	794	602	finally
    //   264	278	612	finally
    //   278	292	841	finally
    //   215	222	850	finally
  }

  public static b a(Context paramContext, com.google.android.gms.ads.internal.config.a parama, a parama1)
  {
    synchronized (a)
    {
      if (b == null)
      {
        if (paramContext.getApplicationContext() != null)
          paramContext = paramContext.getApplicationContext();
        b = new b(paramContext, parama, parama1);
      }
      b localb = b;
      return localb;
    }
  }

  private static void a(String paramString1, Map paramMap, String paramString2, int paramInt)
  {
    if (c.a(2))
    {
      c.a(39 + String.valueOf(paramString1).length() + "Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        if (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          c.a(5 + String.valueOf(str1).length() + "    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          label143: String str2;
          if (localIterator2.hasNext())
          {
            str2 = String.valueOf((String)localIterator2.next());
            if (str2.length() == 0)
              break label194;
          }
          label194: for (String str3 = "      ".concat(str2); ; str3 = new String("      "))
          {
            c.a(str3);
            break label143;
            break;
          }
        }
      }
      c.a("  Body:");
      if (paramString2 != null)
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000)
          c.a(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
      c.a("    null");
      c.a(34 + "  Response Code:\n    " + paramInt + "\n}");
    }
  }

  public final AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    return a(this.c, this.f, this.e, this.d, paramAdRequestInfoParcel);
  }

  public final void a(AdRequestInfoParcel paramAdRequestInfoParcel, com.google.android.gms.ads.internal.request.z paramz)
  {
    bc.a().h.a(this.c, paramAdRequestInfoParcel.k);
    s.a(new i(this, paramAdRequestInfoParcel, paramz));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.b
 * JD-Core Version:    0.6.0
 */