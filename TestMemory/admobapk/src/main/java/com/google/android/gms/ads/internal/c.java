package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import anw;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.overlay.ak;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.purchase.g;
import com.google.android.gms.ads.internal.purchase.n;
import com.google.android.gms.ads.internal.request.ae;
import com.google.android.gms.ads.internal.request.q;
import com.google.android.gms.ads.internal.state.i;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import ha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;

@com.google.android.gms.ads.internal.report.client.a
public abstract class c extends a
  implements av, ab, com.google.android.gms.ads.internal.mediation.d, ak, com.google.android.gms.ads.internal.purchase.m
{
  public final com.google.android.gms.ads.internal.mediation.client.b h;
  private final Messenger i;
  private transient boolean j;

  public c(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel, m paramm)
  {
    this(new bd(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel), paramb, null, paramm);
  }

  private c(bd parambd, com.google.android.gms.ads.internal.mediation.client.b paramb, as paramas, m paramm)
  {
    super(parambd, null, paramm);
    this.h = paramb;
    this.i = new Messenger(new com.google.android.gms.ads.internal.prefetch.b(this.d.c));
    this.j = false;
  }

  // ERROR //
  private final q a(AdRequestParcel paramAdRequestParcel, Bundle paramBundle, com.google.android.gms.ads.internal.state.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   4: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   7: invokevirtual 70	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   10: astore 4
    //   12: aload_0
    //   13: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   16: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   19: invokevirtual 74	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   22: aload 4
    //   24: getfield 80	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   27: iconst_0
    //   28: invokevirtual 86	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   31: astore 73
    //   33: aload 73
    //   35: astore 6
    //   37: aload_0
    //   38: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   41: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   44: invokevirtual 90	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   47: invokevirtual 96	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   50: astore 7
    //   52: aload_0
    //   53: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   56: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   59: astore 8
    //   61: aconst_null
    //   62: astore 9
    //   64: aload 8
    //   66: ifnull +218 -> 284
    //   69: aload_0
    //   70: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   73: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   76: invokevirtual 106	com/google/android/gms/ads/internal/be:getParent	()Landroid/view/ViewParent;
    //   79: astore 61
    //   81: aconst_null
    //   82: astore 9
    //   84: aload 61
    //   86: ifnull +198 -> 284
    //   89: iconst_2
    //   90: newarray int
    //   92: astore 62
    //   94: aload_0
    //   95: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   98: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   101: aload 62
    //   103: invokevirtual 110	com/google/android/gms/ads/internal/be:getLocationOnScreen	([I)V
    //   106: aload 62
    //   108: iconst_0
    //   109: iaload
    //   110: istore 63
    //   112: aload 62
    //   114: iconst_1
    //   115: iaload
    //   116: istore 64
    //   118: aload_0
    //   119: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   122: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   125: invokevirtual 114	com/google/android/gms/ads/internal/be:getWidth	()I
    //   128: istore 65
    //   130: aload_0
    //   131: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   134: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   137: invokevirtual 117	com/google/android/gms/ads/internal/be:getHeight	()I
    //   140: istore 66
    //   142: aload_0
    //   143: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   146: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   149: invokevirtual 121	com/google/android/gms/ads/internal/be:isShown	()Z
    //   152: istore 67
    //   154: iconst_0
    //   155: istore 68
    //   157: iload 67
    //   159: ifeq +70 -> 229
    //   162: iload 63
    //   164: iload 65
    //   166: iadd
    //   167: istore 69
    //   169: iconst_0
    //   170: istore 68
    //   172: iload 69
    //   174: ifle +55 -> 229
    //   177: iload 64
    //   179: iload 66
    //   181: iadd
    //   182: istore 70
    //   184: iconst_0
    //   185: istore 68
    //   187: iload 70
    //   189: ifle +40 -> 229
    //   192: aload 7
    //   194: getfield 127	android/util/DisplayMetrics:widthPixels	I
    //   197: istore 71
    //   199: iconst_0
    //   200: istore 68
    //   202: iload 63
    //   204: iload 71
    //   206: if_icmpgt +23 -> 229
    //   209: aload 7
    //   211: getfield 130	android/util/DisplayMetrics:heightPixels	I
    //   214: istore 72
    //   216: iconst_0
    //   217: istore 68
    //   219: iload 64
    //   221: iload 72
    //   223: if_icmpgt +6 -> 229
    //   226: iconst_1
    //   227: istore 68
    //   229: new 132	android/os/Bundle
    //   232: dup
    //   233: iconst_5
    //   234: invokespecial 135	android/os/Bundle:<init>	(I)V
    //   237: astore 9
    //   239: aload 9
    //   241: ldc 137
    //   243: iload 63
    //   245: invokevirtual 141	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   248: aload 9
    //   250: ldc 143
    //   252: iload 64
    //   254: invokevirtual 141	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   257: aload 9
    //   259: ldc 145
    //   261: iload 65
    //   263: invokevirtual 141	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   266: aload 9
    //   268: ldc 147
    //   270: iload 66
    //   272: invokevirtual 141	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   275: aload 9
    //   277: ldc 149
    //   279: iload 68
    //   281: invokevirtual 141	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   284: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   287: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   290: invokevirtual 162	com/google/android/gms/ads/internal/state/h:a	()Ljava/lang/String;
    //   293: astore 10
    //   295: aload_0
    //   296: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   299: new 164	com/google/android/gms/ads/internal/state/c
    //   302: dup
    //   303: aload 10
    //   305: aload_0
    //   306: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   309: getfield 167	com/google/android/gms/ads/internal/bd:b	Ljava/lang/String;
    //   312: invokespecial 170	com/google/android/gms/ads/internal/state/c:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: putfield 174	com/google/android/gms/ads/internal/bd:l	Lcom/google/android/gms/ads/internal/state/c;
    //   318: aload_0
    //   319: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   322: getfield 174	com/google/android/gms/ads/internal/bd:l	Lcom/google/android/gms/ads/internal/state/c;
    //   325: astore 11
    //   327: aload 11
    //   329: getfield 177	com/google/android/gms/ads/internal/state/c:c	Ljava/lang/Object;
    //   332: astore 12
    //   334: aload 12
    //   336: monitorenter
    //   337: aload 11
    //   339: invokestatic 183	android/os/SystemClock:elapsedRealtime	()J
    //   342: putfield 186	com/google/android/gms/ads/internal/state/c:i	J
    //   345: aload 11
    //   347: getfield 188	com/google/android/gms/ads/internal/state/c:a	Lcom/google/android/gms/ads/internal/state/h;
    //   350: invokevirtual 191	com/google/android/gms/ads/internal/state/h:b	()Lcom/google/android/gms/ads/internal/state/i;
    //   353: aload_1
    //   354: aload 11
    //   356: getfield 186	com/google/android/gms/ads/internal/state/c:i	J
    //   359: invokevirtual 196	com/google/android/gms/ads/internal/state/i:a	(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;J)V
    //   362: aload 12
    //   364: monitorexit
    //   365: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   368: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   371: aload_0
    //   372: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   375: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   378: aload_0
    //   379: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   382: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   385: aload_0
    //   386: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   389: getfield 203	com/google/android/gms/ads/internal/bd:i	Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   392: invokevirtual 208	com/google/android/gms/ads/internal/util/y:a	(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)Ljava/lang/String;
    //   395: astore 14
    //   397: lconst_0
    //   398: lstore 15
    //   400: aload_0
    //   401: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   404: getfield 212	com/google/android/gms/ads/internal/bd:p	Lcom/google/android/gms/ads/internal/client/at;
    //   407: ifnull +21 -> 428
    //   410: aload_0
    //   411: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   414: getfield 212	com/google/android/gms/ads/internal/bd:p	Lcom/google/android/gms/ads/internal/client/at;
    //   417: invokeinterface 216 1 0
    //   422: lstore 59
    //   424: lload 59
    //   426: lstore 15
    //   428: invokestatic 222	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   431: invokevirtual 225	java/util/UUID:toString	()Ljava/lang/String;
    //   434: astore 17
    //   436: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   439: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   442: aload_0
    //   443: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   446: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   449: aload_0
    //   450: aload 10
    //   452: invokevirtual 228	com/google/android/gms/ads/internal/state/h:a	(Landroid/content/Context;Lcom/google/android/gms/ads/internal/state/j;Ljava/lang/String;)Landroid/os/Bundle;
    //   455: astore 18
    //   457: new 230	java/util/ArrayList
    //   460: dup
    //   461: invokespecial 233	java/util/ArrayList:<init>	()V
    //   464: astore 19
    //   466: iconst_0
    //   467: istore 20
    //   469: iload 20
    //   471: aload_0
    //   472: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   475: getfield 237	com/google/android/gms/ads/internal/bd:v	Ldh;
    //   478: invokevirtual 242	dh:size	()I
    //   481: if_icmpge +58 -> 539
    //   484: aload 19
    //   486: aload_0
    //   487: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   490: getfield 237	com/google/android/gms/ads/internal/bd:v	Ldh;
    //   493: iload 20
    //   495: invokevirtual 245	dh:b	(I)Ljava/lang/Object;
    //   498: checkcast 247	java/lang/String
    //   501: invokeinterface 253 2 0
    //   506: pop
    //   507: iinc 20 1
    //   510: goto -41 -> 469
    //   513: astore 5
    //   515: aconst_null
    //   516: astore 6
    //   518: goto -481 -> 37
    //   521: astore 13
    //   523: aload 12
    //   525: monitorexit
    //   526: aload 13
    //   528: athrow
    //   529: astore 58
    //   531: ldc 255
    //   533: invokestatic 260	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   536: goto -108 -> 428
    //   539: aload_0
    //   540: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   543: getfield 264	com/google/android/gms/ads/internal/bd:q	Lcom/google/android/gms/ads/internal/purchase/client/d;
    //   546: ifnull +500 -> 1046
    //   549: iconst_1
    //   550: istore 21
    //   552: aload_0
    //   553: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   556: getfield 268	com/google/android/gms/ads/internal/bd:r	Lcom/google/android/gms/ads/internal/purchase/client/p;
    //   559: ifnull +493 -> 1052
    //   562: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   565: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   568: invokevirtual 270	com/google/android/gms/ads/internal/state/h:l	()Z
    //   571: ifeq +481 -> 1052
    //   574: iconst_1
    //   575: istore 22
    //   577: aload_0
    //   578: getfield 274	com/google/android/gms/ads/internal/c:g	Lcom/google/android/gms/ads/internal/m;
    //   581: getfield 279	com/google/android/gms/ads/internal/m:c	Lcom/google/android/gms/ads/internal/overlay/as;
    //   584: aload_0
    //   585: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   588: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   591: invokeinterface 284 2 0
    //   596: istore 23
    //   598: ldc_w 286
    //   601: astore 24
    //   603: getstatic 292	com/google/android/gms/ads/internal/config/m:aU	Lcom/google/android/gms/ads/internal/config/d;
    //   606: astore 25
    //   608: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   611: getfield 296	com/google/android/gms/ads/internal/bc:n	Lcom/google/android/gms/ads/internal/config/k;
    //   614: aload 25
    //   616: invokevirtual 301	com/google/android/gms/ads/internal/config/k:a	(Lcom/google/android/gms/ads/internal/config/d;)Ljava/lang/Object;
    //   619: checkcast 303	java/lang/Boolean
    //   622: invokevirtual 306	java/lang/Boolean:booleanValue	()Z
    //   625: ifeq +42 -> 667
    //   628: ldc_w 308
    //   631: invokestatic 310	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   634: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   637: getfield 313	com/google/android/gms/ads/internal/bc:g	Lcom/google/android/gms/ads/internal/util/ad;
    //   640: aload_0
    //   641: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   644: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   647: invokevirtual 318	com/google/android/gms/ads/internal/util/ad:b	(Landroid/content/Context;)Landroid/webkit/CookieManager;
    //   650: astore 56
    //   652: aload 56
    //   654: ifnull +13 -> 667
    //   657: aload 56
    //   659: ldc_w 320
    //   662: invokevirtual 326	android/webkit/CookieManager:getCookie	(Ljava/lang/String;)Ljava/lang/String;
    //   665: astore 24
    //   667: aconst_null
    //   668: astore 26
    //   670: aload_3
    //   671: ifnull +9 -> 680
    //   674: aload_3
    //   675: getfield 330	com/google/android/gms/ads/internal/state/e:c	Ljava/lang/String;
    //   678: astore 26
    //   680: aload_0
    //   681: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   684: getfield 203	com/google/android/gms/ads/internal/bd:i	Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    //   687: astore 27
    //   689: aload_0
    //   690: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   693: getfield 167	com/google/android/gms/ads/internal/bd:b	Ljava/lang/String;
    //   696: astore 28
    //   698: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   701: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   704: getfield 331	com/google/android/gms/ads/internal/state/h:b	Ljava/lang/String;
    //   707: astore 29
    //   709: aload_0
    //   710: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   713: getfield 334	com/google/android/gms/ads/internal/bd:e	Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    //   716: astore 30
    //   718: aload_0
    //   719: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   722: getfield 338	com/google/android/gms/ads/internal/bd:A	Ljava/util/List;
    //   725: astore 31
    //   727: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   730: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   733: invokevirtual 340	com/google/android/gms/ads/internal/state/h:e	()Z
    //   736: istore 32
    //   738: aload_0
    //   739: getfield 56	com/google/android/gms/ads/internal/c:i	Landroid/os/Messenger;
    //   742: astore 33
    //   744: aload 7
    //   746: getfield 127	android/util/DisplayMetrics:widthPixels	I
    //   749: istore 34
    //   751: aload 7
    //   753: getfield 130	android/util/DisplayMetrics:heightPixels	I
    //   756: istore 35
    //   758: aload 7
    //   760: getfield 344	android/util/DisplayMetrics:density	F
    //   763: fstore 36
    //   765: invokestatic 347	com/google/android/gms/ads/internal/config/m:a	()Ljava/util/List;
    //   768: astore 37
    //   770: aload_0
    //   771: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   774: getfield 349	com/google/android/gms/ads/internal/bd:a	Ljava/lang/String;
    //   777: astore 38
    //   779: aload_0
    //   780: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   783: getfield 353	com/google/android/gms/ads/internal/bd:w	Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
    //   786: astore 39
    //   788: new 355	com/google/android/gms/ads/internal/request/CapabilityParcel
    //   791: dup
    //   792: iload 21
    //   794: iload 22
    //   796: iload 23
    //   798: invokespecial 358	com/google/android/gms/ads/internal/request/CapabilityParcel:<init>	(ZZZ)V
    //   801: astore 40
    //   803: aload_0
    //   804: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   807: astore 41
    //   809: aload 41
    //   811: getfield 360	com/google/android/gms/ads/internal/bd:I	Z
    //   814: ifeq +11 -> 825
    //   817: aload 41
    //   819: getfield 362	com/google/android/gms/ads/internal/bd:J	Z
    //   822: ifne +276 -> 1098
    //   825: aload 41
    //   827: getfield 360	com/google/android/gms/ads/internal/bd:I	Z
    //   830: ifeq +236 -> 1066
    //   833: aload 41
    //   835: getfield 365	com/google/android/gms/ads/internal/bd:K	Z
    //   838: ifeq +220 -> 1058
    //   841: ldc_w 367
    //   844: astore 42
    //   846: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   849: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   852: pop
    //   853: invokestatic 370	com/google/android/gms/ads/internal/util/y:d	()F
    //   856: fstore 44
    //   858: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   861: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   864: pop
    //   865: invokestatic 371	com/google/android/gms/ads/internal/util/y:e	()Z
    //   868: istore 46
    //   870: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   873: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   876: pop
    //   877: aload_0
    //   878: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   881: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   884: invokestatic 374	com/google/android/gms/ads/internal/util/y:h	(Landroid/content/Context;)I
    //   887: istore 48
    //   889: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   892: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   895: pop
    //   896: aload_0
    //   897: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   900: getfield 100	com/google/android/gms/ads/internal/bd:f	Lcom/google/android/gms/ads/internal/be;
    //   903: invokestatic 377	com/google/android/gms/ads/internal/util/y:d	(Landroid/view/View;)I
    //   906: istore 50
    //   908: aload_0
    //   909: getfield 44	com/google/android/gms/ads/internal/c:d	Lcom/google/android/gms/ads/internal/bd;
    //   912: getfield 48	com/google/android/gms/ads/internal/bd:c	Landroid/content/Context;
    //   915: instanceof 379
    //   918: istore 51
    //   920: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   923: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   926: invokevirtual 381	com/google/android/gms/ads/internal/state/h:i	()Z
    //   929: istore 52
    //   931: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   934: getfield 157	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   937: getfield 383	com/google/android/gms/ads/internal/state/h:h	Z
    //   940: istore 53
    //   942: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   945: getfield 386	com/google/android/gms/ads/internal/bc:x	Lcom/google/android/gms/ads/internal/gmsg/aq;
    //   948: getfield 390	com/google/android/gms/ads/internal/gmsg/aq:a	Ljava/util/List;
    //   951: invokeinterface 391 1 0
    //   956: istore 54
    //   958: invokestatic 154	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   961: getfield 200	com/google/android/gms/ads/internal/bc:e	Lcom/google/android/gms/ads/internal/util/y;
    //   964: pop
    //   965: new 393	com/google/android/gms/ads/internal/request/q
    //   968: dup
    //   969: aload 9
    //   971: aload_1
    //   972: aload 27
    //   974: aload 28
    //   976: aload 4
    //   978: aload 6
    //   980: aload 10
    //   982: aload 29
    //   984: aload 30
    //   986: aload 18
    //   988: aload 31
    //   990: aload 19
    //   992: aload_2
    //   993: iload 32
    //   995: aload 33
    //   997: iload 34
    //   999: iload 35
    //   1001: fload 36
    //   1003: aload 14
    //   1005: lload 15
    //   1007: aload 17
    //   1009: aload 37
    //   1011: aload 38
    //   1013: aload 39
    //   1015: aload 40
    //   1017: aload 42
    //   1019: fload 44
    //   1021: iload 46
    //   1023: iload 48
    //   1025: iload 50
    //   1027: iload 51
    //   1029: iload 52
    //   1031: aload 24
    //   1033: aload 26
    //   1035: iload 53
    //   1037: iload 54
    //   1039: invokestatic 396	com/google/android/gms/ads/internal/util/y:f	()Landroid/os/Bundle;
    //   1042: invokespecial 399	com/google/android/gms/ads/internal/request/q:<init>	(Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;Lcom/google/android/gms/ads/internal/request/CapabilityParcel;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;)V
    //   1045: areturn
    //   1046: iconst_0
    //   1047: istore 21
    //   1049: goto -497 -> 552
    //   1052: iconst_0
    //   1053: istore 22
    //   1055: goto -478 -> 577
    //   1058: ldc_w 401
    //   1061: astore 42
    //   1063: goto -217 -> 846
    //   1066: aload 41
    //   1068: getfield 362	com/google/android/gms/ads/internal/bd:J	Z
    //   1071: ifeq +27 -> 1098
    //   1074: aload 41
    //   1076: getfield 365	com/google/android/gms/ads/internal/bd:K	Z
    //   1079: ifeq +11 -> 1090
    //   1082: ldc_w 403
    //   1085: astore 42
    //   1087: goto -241 -> 846
    //   1090: ldc_w 405
    //   1093: astore 42
    //   1095: goto -249 -> 846
    //   1098: ldc_w 286
    //   1101: astore 42
    //   1103: goto -257 -> 846
    //
    // Exception table:
    //   from	to	target	type
    //   12	33	513	android/content/pm/PackageManager$NameNotFoundException
    //   337	365	521	finally
    //   523	526	521	finally
    //   410	424	529	android/os/RemoteException
  }

  public final void A()
  {
    if (this.d.j != null)
    {
      String str = this.d.j.p;
      com.google.android.gms.ads.internal.util.c.e(74 + String.valueOf(str).length() + "Mediation adapter " + str + " refreshed, but mediation adapters should never refresh.");
    }
    a(this.d.j, true);
    p();
  }

  public final void B()
  {
    C();
  }

  public final void C()
  {
    a(this.d.j, false);
  }

  public final String D()
  {
    if (this.d.j == null)
      return null;
    return this.d.j.p;
  }

  public void E()
  {
    throw new IllegalStateException("showInterstitial is not supported for current ad type");
  }

  public final void F()
  {
    y.a(new e(this));
  }

  public final void G()
  {
    y.a(new f(this));
  }

  public void a(com.google.android.gms.ads.internal.purchase.client.d paramd)
  {
    anw.b("setInAppPurchaseListener must be called on the main UI thread.");
    this.d.q = paramd;
  }

  public final void a(p paramp, String paramString)
  {
    anw.b("setPlayStorePurchaseParams must be called on the main UI thread.");
    this.d.B = new n(paramString);
    this.d.r = paramp;
    if ((!bc.a().h.d()) && (paramp != null))
      ((Future)new com.google.android.gms.ads.internal.purchase.c(this.d.c, this.d.r, this.d.B).d());
  }

  public void a(com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    if (parama == null)
    {
      com.google.android.gms.ads.internal.util.c.e("Ad state was null when trying to ping impression URLs.");
      return;
    }
    if (parama == null)
      com.google.android.gms.ads.internal.util.c.e("Ad state was null when trying to ping impression URLs.");
    while (true)
    {
      if ((parama.q != null) && (parama.q.d != null))
        com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, parama, this.d.b, paramBoolean, parama.q.d);
      if ((parama.n == null) || (parama.n.g == null))
        break;
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, parama, this.d.b, paramBoolean, parama.n.g);
      return;
      com.google.android.gms.ads.internal.util.c.b("Pinging Impression URLs.");
      com.google.android.gms.ads.internal.state.c localc = this.d.l;
      synchronized (localc.c)
      {
        if ((localc.j != -1L) && (localc.e == -1L))
        {
          localc.e = SystemClock.elapsedRealtime();
          localc.a.a(localc);
        }
        localc.a.b().b();
        if ((parama.e == null) || (parama.B))
          continue;
        y.a(this.d.c, this.d.e.b, parama.e);
        parama.B = true;
      }
    }
  }

  public final void a(String paramString, ArrayList paramArrayList)
  {
    com.google.android.gms.ads.internal.purchase.e locale = new com.google.android.gms.ads.internal.purchase.e(paramString, paramArrayList, this.d.c, this.d.e.b);
    if (this.d.q == null)
    {
      com.google.android.gms.ads.internal.util.c.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      if (!com.google.android.gms.ads.internal.util.client.a.b(this.d.c))
      {
        com.google.android.gms.ads.internal.util.c.e("Google Play Service unavailable, cannot launch default purchase flow.");
        return;
      }
      if (this.d.r == null)
      {
        com.google.android.gms.ads.internal.util.c.e("PlayStorePurchaseListener is not set.");
        return;
      }
      if (this.d.B == null)
      {
        com.google.android.gms.ads.internal.util.c.e("PlayStorePurchaseVerifier is not initialized.");
        return;
      }
      if (this.d.F)
      {
        com.google.android.gms.ads.internal.util.c.e("An in-app purchase request is already in progress, abort");
        return;
      }
      this.d.F = true;
      try
      {
        if (!this.d.r.a(paramString))
        {
          this.d.F = false;
          return;
        }
      }
      catch (RemoteException localRemoteException2)
      {
        com.google.android.gms.ads.internal.util.c.e("Could not start In-App purchase.");
        this.d.F = false;
        return;
      }
      Context localContext = this.d.c;
      boolean bool = this.d.e.e;
      GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = new GInAppPurchaseManagerInfoParcel(this.d.c, this.d.B, locale, this);
      Intent localIntent = new Intent();
      localIntent.setClassName(localContext, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
      localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", bool);
      GInAppPurchaseManagerInfoParcel.a(localIntent, localGInAppPurchaseManagerInfoParcel);
      y.a(localContext, localIntent);
      return;
    }
    try
    {
      this.d.q.a(locale);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not start In-App purchase.");
    }
  }

  public final void a(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, g paramg)
  {
    try
    {
      if (this.d.r != null)
        this.d.r.a(new com.google.android.gms.ads.internal.purchase.h(this.d.c, paramString, paramBoolean, paramInt, paramIntent, paramg));
      y.a.postDelayed(new d(this, paramIntent), 500L);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.e("Fail to invoke PlayStorePurchaseListener.");
    }
  }

  public boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.csi.l paraml)
  {
    if (!r())
      return false;
    Bundle localBundle = a(bc.a().h.a(this.d.c));
    this.c.a();
    this.d.E = 0;
    com.google.android.gms.ads.internal.config.d locald = com.google.android.gms.ads.internal.config.m.aE;
    boolean bool = ((Boolean)bc.a().n.a(locald)).booleanValue();
    com.google.android.gms.ads.internal.state.e locale = null;
    if (bool)
    {
      locale = bc.a().h.j();
      bc.a().v.a(this.d.c, this.d.e, false, locale, locale.b, this.d.b);
    }
    q localq = a(paramAdRequestParcel, localBundle, locale);
    paraml.a("seq_num", localq.g);
    paraml.a("request_id", localq.v);
    paraml.a("session_id", localq.h);
    if (localq.f != null)
      paraml.a("app_version", String.valueOf(localq.f.versionCode));
    bd localbd = this.d;
    Context localContext = this.d.c;
    ha localha = this.d.d;
    if (localq.b.c.getBundle("sdk_less_server_data") != null);
    for (Object localObject = new ae(localContext, localq, this); ; localObject = new com.google.android.gms.ads.internal.request.c(localContext, localq, localha, this))
    {
      ((Future)((com.google.android.gms.ads.internal.util.a)localObject).d());
      localbd.g = ((com.google.android.gms.ads.internal.util.a)localObject);
      return true;
    }
  }

  public boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.d.c()))
    {
      if (parama.h <= 0L)
        break label43;
      this.c.a(paramAdRequestParcel, parama.h);
    }
    while (true)
    {
      return this.c.b;
      label43: if ((parama.q != null) && (parama.q.i > 0L))
      {
        this.c.a(paramAdRequestParcel, parama.q.i);
        continue;
      }
      if ((parama.m) || (parama.d != 2))
        continue;
      this.c.a(paramAdRequestParcel);
    }
  }

  final boolean a(com.google.android.gms.ads.internal.state.a parama)
  {
    boolean bool = false;
    AdRequestParcel localAdRequestParcel;
    if (this.e != null)
    {
      localAdRequestParcel = this.e;
      this.e = null;
    }
    while (true)
    {
      return a(localAdRequestParcel, parama, bool);
      localAdRequestParcel = parama.a;
      Bundle localBundle = localAdRequestParcel.c;
      bool = false;
      if (localBundle == null)
        continue;
      bool = localAdRequestParcel.c.getBoolean("_noRefresh", false);
    }
  }

  public boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    if ((parama1 != null) && (parama1.r != null))
      parama1.r.a(null);
    if (parama2.r != null)
      parama2.r.a(this);
    int m;
    int k;
    if (parama2.q != null)
    {
      m = parama2.q.o;
      k = parama2.q.p;
    }
    while (true)
    {
      com.google.android.gms.ads.internal.state.k localk = this.d.C;
      synchronized (localk.a)
      {
        localk.b = m;
        localk.c = k;
        localk.d.a(localk.e, localk);
        return true;
      }
      k = 0;
      m = 0;
    }
  }

  public final void b(com.google.android.gms.ads.internal.state.a parama)
  {
    super.b(parama);
    if (parama.n != null)
    {
      com.google.android.gms.ads.internal.util.c.b("Pinging network fill URLs.");
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, parama, this.d.b, false, parama.n.h);
      if ((parama.q.f != null) && (parama.q.f.size() > 0))
      {
        com.google.android.gms.ads.internal.util.c.b("Pinging urls remotely");
        bc.a().e.a(this.d.c, parama.q.f);
      }
    }
    if ((parama.d == 3) && (parama.q != null) && (parama.q.e != null))
    {
      com.google.android.gms.ads.internal.util.c.b("Pinging no fill URLs.");
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, parama, this.d.b, false, parama.q.e);
    }
  }

  protected final boolean b(AdRequestParcel paramAdRequestParcel)
  {
    return (super.b(paramAdRequestParcel)) && (!this.j);
  }

  public final void e()
  {
    if (this.d.j == null)
    {
      com.google.android.gms.ads.internal.util.c.e("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((this.d.j.q != null) && (this.d.j.q.c != null))
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, this.d.j, this.d.b, false, this.d.j.q.c);
    if ((this.d.j.n != null) && (this.d.j.n.f != null))
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, this.d.j, this.d.b, false, this.d.j.n.f);
    super.e();
  }

  public void h()
  {
    anw.b("pause must be called on the main UI thread.");
    if ((this.d.j != null) && (this.d.j.b != null) && (this.d.c()))
      ad.a(this.d.j.b);
    if ((this.d.j != null) && (this.d.j.o != null));
    try
    {
      this.d.j.o.d();
      this.f.b(this.d.j);
      this.c.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.e("Could not pause mediation adapter.");
    }
  }

  public void i()
  {
    anw.b("resume must be called on the main UI thread.");
    com.google.android.gms.ads.internal.state.a locala = this.d.j;
    com.google.android.gms.ads.internal.webview.b localb1 = null;
    if (locala != null)
    {
      com.google.android.gms.ads.internal.webview.b localb2 = this.d.j.b;
      localb1 = null;
      if (localb2 != null)
        localb1 = this.d.j.b;
    }
    if ((localb1 != null) && (this.d.c()))
      ad.b(this.d.j.b);
    if ((this.d.j != null) && (this.d.j.o != null));
    try
    {
      this.d.j.o.e();
      if ((localb1 == null) || (!localb1.u()))
        this.c.c();
      this.f.c(this.d.j);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.e("Could not resume mediation adapter.");
    }
  }

  protected boolean r()
  {
    int k = 1;
    if ((!y.a(this.d.c.getPackageManager(), this.d.c.getPackageName(), "android.permission.INTERNET")) || (!y.a(this.d.c)))
      k = 0;
    return k;
  }

  public final void s()
  {
    this.f.a(this.d.j);
    this.j = false;
    m();
    com.google.android.gms.ads.internal.state.c localc = this.d.l;
    synchronized (localc.c)
    {
      if ((localc.j != -1L) && (!localc.b.isEmpty()))
      {
        com.google.android.gms.ads.internal.state.d locald = (com.google.android.gms.ads.internal.state.d)localc.b.getLast();
        if (locald.b == -1L)
        {
          locald.b = SystemClock.elapsedRealtime();
          localc.a.a(localc);
        }
      }
      return;
    }
  }

  public void t()
  {
    this.j = true;
    o();
  }

  public final void u()
  {
    this.f.b(this.d.j);
  }

  public final void v()
  {
    this.f.c(this.d.j);
  }

  public final void w()
  {
    e();
  }

  public final void x()
  {
    s();
  }

  public final void y()
  {
    n();
  }

  public final void z()
  {
    t();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.c
 * JD-Core Version:    0.6.0
 */