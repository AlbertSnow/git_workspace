package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@a
public final class bd extends ar
{
  private static final Set d = Collections.synchronizedSet(new HashSet());
  private static final DecimalFormat e = new DecimalFormat("#,###");
  private File f;
  private boolean g;

  public bd(b paramb)
  {
    super(paramb);
    File localFile = this.a.getCacheDir();
    if (localFile == null)
      c.e("Context.getCacheDir() returned null");
    do
    {
      return;
      this.f = new File(localFile, "admobVideoStreams");
      if ((this.f.isDirectory()) || (this.f.mkdirs()))
        continue;
      String str3 = String.valueOf(this.f.getAbsolutePath());
      if (str3.length() != 0);
      for (String str4 = "Could not create preload cache directory at ".concat(str3); ; str4 = new String("Could not create preload cache directory at "))
      {
        c.e(str4);
        this.f = null;
        return;
      }
    }
    while ((this.f.setReadable(true, false)) && (this.f.setExecutable(true, false)));
    String str1 = String.valueOf(this.f.getAbsolutePath());
    if (str1.length() != 0);
    for (String str2 = "Could not set cache file permissions at ".concat(str1); ; str2 = new String("Could not set cache file permissions at "))
    {
      c.e(str2);
      this.f = null;
      return;
    }
  }

  private final File a(File paramFile)
  {
    return new File(this.f, String.valueOf(paramFile.getName()).concat(".done"));
  }

  public final void a()
  {
    this.g = true;
  }

  // ERROR //
  public final boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: aload_1
    //   9: aconst_null
    //   10: ldc 119
    //   12: aconst_null
    //   13: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_0
    //   19: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   22: ifnonnull +54 -> 76
    //   25: iconst_0
    //   26: istore 6
    //   28: iload 6
    //   30: getstatic 127	com/google/android/gms/ads/internal/config/m:g	Lcom/google/android/gms/ads/internal/config/d;
    //   33: invokevirtual 132	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   36: checkcast 134	java/lang/Integer
    //   39: invokevirtual 137	java/lang/Integer:intValue	()I
    //   42: if_icmple +217 -> 259
    //   45: aload_0
    //   46: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   49: ifnonnull +81 -> 130
    //   52: iconst_0
    //   53: istore 78
    //   55: iload 78
    //   57: ifne -39 -> 18
    //   60: ldc 139
    //   62: invokestatic 56	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: aload_1
    //   67: aconst_null
    //   68: ldc 141
    //   70: aconst_null
    //   71: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   74: iconst_0
    //   75: ireturn
    //   76: aload_0
    //   77: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   80: invokevirtual 145	java/io/File:listFiles	()[Ljava/io/File;
    //   83: astore_2
    //   84: aload_2
    //   85: arraylength
    //   86: istore_3
    //   87: iconst_0
    //   88: istore 4
    //   90: iconst_0
    //   91: istore 5
    //   93: iload 5
    //   95: iload_3
    //   96: if_icmpge +27 -> 123
    //   99: aload_2
    //   100: iload 5
    //   102: aaload
    //   103: invokevirtual 106	java/io/File:getName	()Ljava/lang/String;
    //   106: ldc 108
    //   108: invokevirtual 148	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   111: ifne +6 -> 117
    //   114: iinc 4 1
    //   117: iinc 5 1
    //   120: goto -27 -> 93
    //   123: iload 4
    //   125: istore 6
    //   127: goto -99 -> 28
    //   130: aconst_null
    //   131: astore 72
    //   133: ldc2_w 149
    //   136: lstore 73
    //   138: aload_0
    //   139: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   142: invokevirtual 145	java/io/File:listFiles	()[Ljava/io/File;
    //   145: astore 75
    //   147: aload 75
    //   149: arraylength
    //   150: istore 76
    //   152: iconst_0
    //   153: istore 77
    //   155: iload 77
    //   157: iload 76
    //   159: if_icmpge +56 -> 215
    //   162: aload 75
    //   164: iload 77
    //   166: aaload
    //   167: astore 80
    //   169: aload 80
    //   171: invokevirtual 106	java/io/File:getName	()Ljava/lang/String;
    //   174: ldc 108
    //   176: invokevirtual 148	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   179: ifne +1608 -> 1787
    //   182: aload 80
    //   184: invokevirtual 154	java/io/File:lastModified	()J
    //   187: lstore 81
    //   189: lload 81
    //   191: lload 73
    //   193: lcmp
    //   194: ifge +1593 -> 1787
    //   197: aload 80
    //   199: astore 83
    //   201: iinc 77 1
    //   204: aload 83
    //   206: astore 72
    //   208: lload 81
    //   210: lstore 73
    //   212: goto -57 -> 155
    //   215: iconst_0
    //   216: istore 78
    //   218: aload 72
    //   220: ifnull -165 -> 55
    //   223: aload 72
    //   225: invokevirtual 157	java/io/File:delete	()Z
    //   228: istore 78
    //   230: aload_0
    //   231: aload 72
    //   233: invokespecial 159	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/io/File;)Ljava/io/File;
    //   236: astore 79
    //   238: aload 79
    //   240: invokevirtual 162	java/io/File:isFile	()Z
    //   243: ifeq -188 -> 55
    //   246: iload 78
    //   248: aload 79
    //   250: invokevirtual 157	java/io/File:delete	()Z
    //   253: iand
    //   254: istore 78
    //   256: goto -201 -> 55
    //   259: aload_0
    //   260: aload_1
    //   261: invokevirtual 165	com/google/android/gms/ads/internal/gmsg/bd:b	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore 7
    //   266: new 58	java/io/File
    //   269: dup
    //   270: aload_0
    //   271: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   274: aload 7
    //   276: invokespecial 63	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   279: astore 8
    //   281: aload_0
    //   282: aload 8
    //   284: invokespecial 159	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/io/File;)Ljava/io/File;
    //   287: astore 9
    //   289: aload 8
    //   291: invokevirtual 162	java/io/File:isFile	()Z
    //   294: ifeq +75 -> 369
    //   297: aload 9
    //   299: invokevirtual 162	java/io/File:isFile	()Z
    //   302: ifeq +67 -> 369
    //   305: aload 8
    //   307: invokevirtual 167	java/io/File:length	()J
    //   310: l2i
    //   311: istore 69
    //   313: aload_1
    //   314: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   317: astore 70
    //   319: aload 70
    //   321: invokevirtual 86	java/lang/String:length	()I
    //   324: ifeq +31 -> 355
    //   327: ldc 169
    //   329: aload 70
    //   331: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   334: astore 71
    //   336: aload 71
    //   338: invokestatic 171	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   341: aload_0
    //   342: aload_1
    //   343: aload 8
    //   345: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   348: iload 69
    //   350: invokevirtual 174	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   353: iconst_1
    //   354: ireturn
    //   355: new 78	java/lang/String
    //   358: dup
    //   359: ldc 169
    //   361: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   364: astore 71
    //   366: goto -30 -> 336
    //   369: aload_0
    //   370: getfield 65	com/google/android/gms/ads/internal/gmsg/bd:f	Ljava/io/File;
    //   373: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   376: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   379: astore 10
    //   381: aload_1
    //   382: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   385: astore 11
    //   387: aload 11
    //   389: invokevirtual 86	java/lang/String:length	()I
    //   392: ifeq +87 -> 479
    //   395: aload 10
    //   397: aload 11
    //   399: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   402: astore 12
    //   404: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   407: astore 13
    //   409: aload 13
    //   411: monitorenter
    //   412: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   415: aload 12
    //   417: invokeinterface 180 2 0
    //   422: ifeq +85 -> 507
    //   425: aload_1
    //   426: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   429: astore 67
    //   431: aload 67
    //   433: invokevirtual 86	java/lang/String:length	()I
    //   436: ifeq +57 -> 493
    //   439: ldc 182
    //   441: aload 67
    //   443: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   446: astore 68
    //   448: aload 68
    //   450: invokestatic 56	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   453: aload_0
    //   454: aload_1
    //   455: aload 8
    //   457: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   460: ldc 184
    //   462: aconst_null
    //   463: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   466: aload 13
    //   468: monitorexit
    //   469: iconst_0
    //   470: ireturn
    //   471: astore 14
    //   473: aload 13
    //   475: monitorexit
    //   476: aload 14
    //   478: athrow
    //   479: new 78	java/lang/String
    //   482: dup
    //   483: aload 10
    //   485: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   488: astore 12
    //   490: goto -86 -> 404
    //   493: new 78	java/lang/String
    //   496: dup
    //   497: ldc 182
    //   499: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   502: astore 68
    //   504: goto -56 -> 448
    //   507: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   510: aload 12
    //   512: invokeinterface 187 2 0
    //   517: pop
    //   518: aload 13
    //   520: monitorexit
    //   521: aconst_null
    //   522: astore 16
    //   524: new 189	java/net/URL
    //   527: dup
    //   528: aload_1
    //   529: invokespecial 190	java/net/URL:<init>	(Ljava/lang/String;)V
    //   532: invokevirtual 194	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   535: astore 25
    //   537: getstatic 197	com/google/android/gms/ads/internal/config/m:l	Lcom/google/android/gms/ads/internal/config/d;
    //   540: invokevirtual 132	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   543: checkcast 134	java/lang/Integer
    //   546: invokevirtual 137	java/lang/Integer:intValue	()I
    //   549: istore 26
    //   551: aload 25
    //   553: iload 26
    //   555: invokevirtual 203	java/net/URLConnection:setConnectTimeout	(I)V
    //   558: aload 25
    //   560: iload 26
    //   562: invokevirtual 206	java/net/URLConnection:setReadTimeout	(I)V
    //   565: aload 25
    //   567: instanceof 208
    //   570: ifeq +277 -> 847
    //   573: aload 25
    //   575: checkcast 208	java/net/HttpURLConnection
    //   578: invokevirtual 211	java/net/HttpURLConnection:getResponseCode	()I
    //   581: istore 64
    //   583: iload 64
    //   585: sipush 400
    //   588: if_icmplt +259 -> 847
    //   591: ldc 213
    //   593: astore 18
    //   595: iload 64
    //   597: invokestatic 217	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   600: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   603: astore 65
    //   605: aload 65
    //   607: invokevirtual 86	java/lang/String:length	()I
    //   610: ifeq +212 -> 822
    //   613: ldc 219
    //   615: aload 65
    //   617: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   620: astore 66
    //   622: aload 66
    //   624: astore 19
    //   626: new 113	java/io/IOException
    //   629: dup
    //   630: new 221	java/lang/StringBuilder
    //   633: dup
    //   634: bipush 32
    //   636: aload_1
    //   637: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   640: invokevirtual 86	java/lang/String:length	()I
    //   643: iadd
    //   644: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   647: ldc 225
    //   649: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: iload 64
    //   654: invokevirtual 232	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   657: ldc 234
    //   659: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: aload_1
    //   663: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   669: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   672: athrow
    //   673: astore 17
    //   675: aload 17
    //   677: instanceof 115
    //   680: ifeq +15 -> 695
    //   683: invokestatic 242	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   686: getfield 246	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   689: aload 17
    //   691: iconst_1
    //   692: invokevirtual 251	com/google/android/gms/ads/internal/state/h:a	(Ljava/lang/Throwable;Z)V
    //   695: aload 16
    //   697: invokevirtual 256	java/io/FileOutputStream:close	()V
    //   700: aload_0
    //   701: getfield 110	com/google/android/gms/ads/internal/gmsg/bd:g	Z
    //   704: ifeq +978 -> 1682
    //   707: new 221	java/lang/StringBuilder
    //   710: dup
    //   711: bipush 26
    //   713: aload_1
    //   714: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   717: invokevirtual 86	java/lang/String:length	()I
    //   720: iadd
    //   721: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   724: ldc_w 258
    //   727: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   730: aload_1
    //   731: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: ldc_w 260
    //   737: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   743: invokestatic 262	com/google/android/gms/ads/internal/util/c:d	(Ljava/lang/String;)V
    //   746: aload 8
    //   748: invokevirtual 265	java/io/File:exists	()Z
    //   751: ifeq +44 -> 795
    //   754: aload 8
    //   756: invokevirtual 157	java/io/File:delete	()Z
    //   759: ifne +36 -> 795
    //   762: aload 8
    //   764: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   767: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   770: astore 22
    //   772: aload 22
    //   774: invokevirtual 86	java/lang/String:length	()I
    //   777: ifeq +949 -> 1726
    //   780: ldc_w 267
    //   783: aload 22
    //   785: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   788: astore 23
    //   790: aload 23
    //   792: invokestatic 56	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   795: aload_0
    //   796: aload_1
    //   797: aload 8
    //   799: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   802: aload 18
    //   804: aload 19
    //   806: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   809: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   812: aload 12
    //   814: invokeinterface 270 2 0
    //   819: pop
    //   820: iconst_0
    //   821: ireturn
    //   822: new 78	java/lang/String
    //   825: dup
    //   826: ldc 219
    //   828: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   831: astore 19
    //   833: goto -207 -> 626
    //   836: astore 17
    //   838: aconst_null
    //   839: astore 19
    //   841: aconst_null
    //   842: astore 16
    //   844: goto -169 -> 675
    //   847: aload 25
    //   849: invokevirtual 273	java/net/URLConnection:getContentLength	()I
    //   852: istore 27
    //   854: iload 27
    //   856: ifge +74 -> 930
    //   859: aload_1
    //   860: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   863: astore 28
    //   865: aload 28
    //   867: invokevirtual 86	java/lang/String:length	()I
    //   870: ifeq +45 -> 915
    //   873: ldc_w 275
    //   876: aload 28
    //   878: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   881: astore 29
    //   883: aload 29
    //   885: invokestatic 56	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   888: aload_0
    //   889: aload_1
    //   890: aload 8
    //   892: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   895: ldc_w 277
    //   898: aconst_null
    //   899: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   902: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   905: aload 12
    //   907: invokeinterface 270 2 0
    //   912: pop
    //   913: iconst_0
    //   914: ireturn
    //   915: new 78	java/lang/String
    //   918: dup
    //   919: ldc_w 275
    //   922: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   925: astore 29
    //   927: goto -44 -> 883
    //   930: getstatic 37	com/google/android/gms/ads/internal/gmsg/bd:e	Ljava/text/DecimalFormat;
    //   933: iload 27
    //   935: i2l
    //   936: invokevirtual 281	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   939: astore 31
    //   941: getstatic 283	com/google/android/gms/ads/internal/config/m:h	Lcom/google/android/gms/ads/internal/config/d;
    //   944: invokevirtual 132	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   947: checkcast 134	java/lang/Integer
    //   950: invokevirtual 137	java/lang/Integer:intValue	()I
    //   953: istore 32
    //   955: iload 27
    //   957: iload 32
    //   959: if_icmple +124 -> 1083
    //   962: new 221	java/lang/StringBuilder
    //   965: dup
    //   966: bipush 33
    //   968: aload 31
    //   970: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   973: invokevirtual 86	java/lang/String:length	()I
    //   976: iadd
    //   977: aload_1
    //   978: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   981: invokevirtual 86	java/lang/String:length	()I
    //   984: iadd
    //   985: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   988: ldc_w 285
    //   991: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   994: aload 31
    //   996: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   999: ldc_w 287
    //   1002: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1005: aload_1
    //   1006: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1009: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1012: invokestatic 56	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   1015: aload 31
    //   1017: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1020: astore 33
    //   1022: aload 33
    //   1024: invokevirtual 86	java/lang/String:length	()I
    //   1027: ifeq +41 -> 1068
    //   1030: ldc_w 289
    //   1033: aload 33
    //   1035: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1038: astore 34
    //   1040: aload_0
    //   1041: aload_1
    //   1042: aload 8
    //   1044: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1047: ldc_w 291
    //   1050: aload 34
    //   1052: invokevirtual 122	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1055: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   1058: aload 12
    //   1060: invokeinterface 270 2 0
    //   1065: pop
    //   1066: iconst_0
    //   1067: ireturn
    //   1068: new 78	java/lang/String
    //   1071: dup
    //   1072: ldc_w 289
    //   1075: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1078: astore 34
    //   1080: goto -40 -> 1040
    //   1083: new 221	java/lang/StringBuilder
    //   1086: dup
    //   1087: bipush 20
    //   1089: aload 31
    //   1091: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1094: invokevirtual 86	java/lang/String:length	()I
    //   1097: iadd
    //   1098: aload_1
    //   1099: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1102: invokevirtual 86	java/lang/String:length	()I
    //   1105: iadd
    //   1106: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   1109: ldc_w 293
    //   1112: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1115: aload 31
    //   1117: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1120: ldc_w 295
    //   1123: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1126: aload_1
    //   1127: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1130: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1133: invokestatic 171	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   1136: aload 25
    //   1138: invokevirtual 299	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   1141: invokestatic 305	java/nio/channels/Channels:newChannel	(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
    //   1144: astore 36
    //   1146: new 253	java/io/FileOutputStream
    //   1149: dup
    //   1150: aload 8
    //   1152: invokespecial 308	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   1155: astore 37
    //   1157: aload 37
    //   1159: invokevirtual 312	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   1162: astore 38
    //   1164: ldc_w 313
    //   1167: invokestatic 319	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   1170: astore 39
    //   1172: invokestatic 242	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   1175: getfield 323	com/google/android/gms/ads/internal/bc:i	Laom;
    //   1178: astore 40
    //   1180: iconst_0
    //   1181: istore 41
    //   1183: aload 40
    //   1185: invokeinterface 327 1 0
    //   1190: lstore 42
    //   1192: getstatic 330	com/google/android/gms/ads/internal/config/m:k	Lcom/google/android/gms/ads/internal/config/d;
    //   1195: invokevirtual 132	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   1198: checkcast 332	java/lang/Long
    //   1201: invokevirtual 335	java/lang/Long:longValue	()J
    //   1204: lstore 44
    //   1206: new 337	com/google/android/gms/ads/internal/util/bh
    //   1209: dup
    //   1210: lload 44
    //   1212: invokespecial 340	com/google/android/gms/ads/internal/util/bh:<init>	(J)V
    //   1215: astore 46
    //   1217: getstatic 343	com/google/android/gms/ads/internal/config/m:j	Lcom/google/android/gms/ads/internal/config/d;
    //   1220: invokevirtual 132	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   1223: checkcast 332	java/lang/Long
    //   1226: invokevirtual 335	java/lang/Long:longValue	()J
    //   1229: lstore 47
    //   1231: aload 36
    //   1233: aload 39
    //   1235: invokeinterface 349 2 0
    //   1240: istore 49
    //   1242: iload 49
    //   1244: iflt +298 -> 1542
    //   1247: iload 41
    //   1249: iload 49
    //   1251: iadd
    //   1252: istore 41
    //   1254: iload 41
    //   1256: iload 32
    //   1258: if_icmple +87 -> 1345
    //   1261: ldc_w 291
    //   1264: astore 18
    //   1266: iload 41
    //   1268: invokestatic 217	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1271: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1274: astore 62
    //   1276: aload 62
    //   1278: invokevirtual 86	java/lang/String:length	()I
    //   1281: ifeq +37 -> 1318
    //   1284: ldc_w 289
    //   1287: aload 62
    //   1289: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1292: astore 63
    //   1294: aload 63
    //   1296: astore 19
    //   1298: new 113	java/io/IOException
    //   1301: dup
    //   1302: ldc_w 351
    //   1305: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1308: athrow
    //   1309: astore 17
    //   1311: aload 37
    //   1313: astore 16
    //   1315: goto -640 -> 675
    //   1318: new 78	java/lang/String
    //   1321: dup
    //   1322: ldc_w 289
    //   1325: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1328: astore 19
    //   1330: goto -32 -> 1298
    //   1333: astore 17
    //   1335: aload 37
    //   1337: astore 16
    //   1339: aconst_null
    //   1340: astore 19
    //   1342: goto -667 -> 675
    //   1345: aload 39
    //   1347: invokevirtual 355	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   1350: pop
    //   1351: aload 38
    //   1353: aload 39
    //   1355: invokevirtual 360	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   1358: ifgt -7 -> 1351
    //   1361: aload 39
    //   1363: invokevirtual 363	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1366: pop
    //   1367: aload 40
    //   1369: invokeinterface 327 1 0
    //   1374: lload 42
    //   1376: lsub
    //   1377: ldc2_w 364
    //   1380: lload 47
    //   1382: lmul
    //   1383: lcmp
    //   1384: ifle +82 -> 1466
    //   1387: ldc_w 367
    //   1390: astore 18
    //   1392: lload 47
    //   1394: invokestatic 369	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1397: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1400: astore 58
    //   1402: new 221	java/lang/StringBuilder
    //   1405: dup
    //   1406: bipush 29
    //   1408: aload 58
    //   1410: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1413: invokevirtual 86	java/lang/String:length	()I
    //   1416: iadd
    //   1417: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   1420: ldc_w 371
    //   1423: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1426: aload 58
    //   1428: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1431: ldc_w 373
    //   1434: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1437: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1440: astore 59
    //   1442: aload 59
    //   1444: astore 19
    //   1446: new 113	java/io/IOException
    //   1449: dup
    //   1450: ldc_w 375
    //   1453: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1456: athrow
    //   1457: astore 17
    //   1459: aload 37
    //   1461: astore 16
    //   1463: goto -788 -> 675
    //   1466: aload_0
    //   1467: getfield 110	com/google/android/gms/ads/internal/gmsg/bd:g	Z
    //   1470: ifeq +31 -> 1501
    //   1473: ldc_w 377
    //   1476: astore 18
    //   1478: new 113	java/io/IOException
    //   1481: dup
    //   1482: ldc_w 379
    //   1485: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1488: athrow
    //   1489: astore 17
    //   1491: aload 37
    //   1493: astore 16
    //   1495: aconst_null
    //   1496: astore 19
    //   1498: goto -823 -> 675
    //   1501: aload 46
    //   1503: invokevirtual 381	com/google/android/gms/ads/internal/util/bh:a	()Z
    //   1506: ifeq -275 -> 1231
    //   1509: aload 8
    //   1511: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1514: astore 60
    //   1516: getstatic 386	com/google/android/gms/ads/internal/util/client/a:a	Landroid/os/Handler;
    //   1519: new 388	com/google/android/gms/ads/internal/gmsg/as
    //   1522: dup
    //   1523: aload_0
    //   1524: aload_1
    //   1525: aload 60
    //   1527: iload 41
    //   1529: iload 27
    //   1531: iconst_0
    //   1532: invokespecial 391	com/google/android/gms/ads/internal/gmsg/as:<init>	(Lcom/google/android/gms/ads/internal/gmsg/ar;Ljava/lang/String;Ljava/lang/String;IIZ)V
    //   1535: invokevirtual 397	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1538: pop
    //   1539: goto -308 -> 1231
    //   1542: aload 37
    //   1544: invokevirtual 256	java/io/FileOutputStream:close	()V
    //   1547: iconst_3
    //   1548: invokestatic 400	com/google/android/gms/ads/internal/util/c:a	(I)Z
    //   1551: ifeq +67 -> 1618
    //   1554: getstatic 37	com/google/android/gms/ads/internal/gmsg/bd:e	Ljava/text/DecimalFormat;
    //   1557: iload 41
    //   1559: i2l
    //   1560: invokevirtual 281	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   1563: astore 55
    //   1565: new 221	java/lang/StringBuilder
    //   1568: dup
    //   1569: bipush 22
    //   1571: aload 55
    //   1573: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1576: invokevirtual 86	java/lang/String:length	()I
    //   1579: iadd
    //   1580: aload_1
    //   1581: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1584: invokevirtual 86	java/lang/String:length	()I
    //   1587: iadd
    //   1588: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   1591: ldc_w 402
    //   1594: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1597: aload 55
    //   1599: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1602: ldc_w 295
    //   1605: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1608: aload_1
    //   1609: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1612: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1615: invokestatic 171	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   1618: aload 8
    //   1620: iconst_1
    //   1621: iconst_0
    //   1622: invokevirtual 97	java/io/File:setReadable	(ZZ)Z
    //   1625: pop
    //   1626: aload 9
    //   1628: invokevirtual 162	java/io/File:isFile	()Z
    //   1631: ifeq +37 -> 1668
    //   1634: aload 9
    //   1636: invokestatic 407	java/lang/System:currentTimeMillis	()J
    //   1639: invokevirtual 411	java/io/File:setLastModified	(J)Z
    //   1642: pop
    //   1643: aload_0
    //   1644: aload_1
    //   1645: aload 8
    //   1647: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1650: iload 41
    //   1652: invokevirtual 174	com/google/android/gms/ads/internal/gmsg/bd:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1655: getstatic 28	com/google/android/gms/ads/internal/gmsg/bd:d	Ljava/util/Set;
    //   1658: aload 12
    //   1660: invokeinterface 270 2 0
    //   1665: pop
    //   1666: iconst_1
    //   1667: ireturn
    //   1668: aload 9
    //   1670: invokevirtual 414	java/io/File:createNewFile	()Z
    //   1673: pop
    //   1674: goto -31 -> 1643
    //   1677: astore 51
    //   1679: goto -36 -> 1643
    //   1682: new 221	java/lang/StringBuilder
    //   1685: dup
    //   1686: bipush 25
    //   1688: aload_1
    //   1689: invokestatic 82	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1692: invokevirtual 86	java/lang/String:length	()I
    //   1695: iadd
    //   1696: invokespecial 223	java/lang/StringBuilder:<init>	(I)V
    //   1699: ldc_w 416
    //   1702: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1705: aload_1
    //   1706: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1709: ldc_w 260
    //   1712: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1715: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1718: aload 17
    //   1720: invokestatic 420	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1723: goto -977 -> 746
    //   1726: new 78	java/lang/String
    //   1729: dup
    //   1730: ldc_w 267
    //   1733: invokespecial 93	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1736: astore 23
    //   1738: goto -948 -> 790
    //   1741: astore 24
    //   1743: goto -1043 -> 700
    //   1746: astore 20
    //   1748: goto -1048 -> 700
    //   1751: astore 17
    //   1753: aconst_null
    //   1754: astore 19
    //   1756: aconst_null
    //   1757: astore 16
    //   1759: goto -1084 -> 675
    //   1762: astore 17
    //   1764: aconst_null
    //   1765: astore 16
    //   1767: goto -1092 -> 675
    //   1770: astore 17
    //   1772: ldc_w 422
    //   1775: astore 18
    //   1777: aload 37
    //   1779: astore 16
    //   1781: aconst_null
    //   1782: astore 19
    //   1784: goto -1109 -> 675
    //   1787: lload 73
    //   1789: lstore 81
    //   1791: aload 72
    //   1793: astore 83
    //   1795: goto -1594 -> 201
    //   1798: astore 17
    //   1800: ldc_w 422
    //   1803: astore 18
    //   1805: aconst_null
    //   1806: astore 19
    //   1808: aconst_null
    //   1809: astore 16
    //   1811: goto -1136 -> 675
    //   1814: astore 17
    //   1816: ldc_w 422
    //   1819: astore 18
    //   1821: aconst_null
    //   1822: astore 19
    //   1824: aconst_null
    //   1825: astore 16
    //   1827: goto -1152 -> 675
    //   1830: astore 17
    //   1832: ldc_w 422
    //   1835: astore 18
    //   1837: aload 37
    //   1839: astore 16
    //   1841: aconst_null
    //   1842: astore 19
    //   1844: goto -1169 -> 675
    //
    // Exception table:
    //   from	to	target	type
    //   412	448	471	finally
    //   448	469	471	finally
    //   473	476	471	finally
    //   493	504	471	finally
    //   507	521	471	finally
    //   626	673	673	java/io/IOException
    //   595	622	836	java/io/IOException
    //   822	833	836	java/io/IOException
    //   1298	1309	1309	java/io/IOException
    //   1446	1457	1309	java/io/IOException
    //   1266	1294	1333	java/io/IOException
    //   1318	1330	1333	java/io/IOException
    //   1392	1442	1333	java/io/IOException
    //   1478	1489	1333	java/io/IOException
    //   1298	1309	1457	java/lang/RuntimeException
    //   1446	1457	1457	java/lang/RuntimeException
    //   1266	1294	1489	java/lang/RuntimeException
    //   1318	1330	1489	java/lang/RuntimeException
    //   1392	1442	1489	java/lang/RuntimeException
    //   1478	1489	1489	java/lang/RuntimeException
    //   1668	1674	1677	java/io/IOException
    //   695	700	1741	java/io/IOException
    //   695	700	1746	java/lang/NullPointerException
    //   595	622	1751	java/lang/RuntimeException
    //   822	833	1751	java/lang/RuntimeException
    //   626	673	1762	java/lang/RuntimeException
    //   1157	1180	1770	java/lang/RuntimeException
    //   1183	1231	1770	java/lang/RuntimeException
    //   1231	1242	1770	java/lang/RuntimeException
    //   1345	1351	1770	java/lang/RuntimeException
    //   1351	1387	1770	java/lang/RuntimeException
    //   1466	1473	1770	java/lang/RuntimeException
    //   1501	1539	1770	java/lang/RuntimeException
    //   1542	1618	1770	java/lang/RuntimeException
    //   1618	1643	1770	java/lang/RuntimeException
    //   1643	1666	1770	java/lang/RuntimeException
    //   1668	1674	1770	java/lang/RuntimeException
    //   524	583	1798	java/io/IOException
    //   847	854	1798	java/io/IOException
    //   859	883	1798	java/io/IOException
    //   883	913	1798	java/io/IOException
    //   915	927	1798	java/io/IOException
    //   930	955	1798	java/io/IOException
    //   962	1040	1798	java/io/IOException
    //   1040	1066	1798	java/io/IOException
    //   1068	1080	1798	java/io/IOException
    //   1083	1157	1798	java/io/IOException
    //   524	583	1814	java/lang/RuntimeException
    //   847	854	1814	java/lang/RuntimeException
    //   859	883	1814	java/lang/RuntimeException
    //   883	913	1814	java/lang/RuntimeException
    //   915	927	1814	java/lang/RuntimeException
    //   930	955	1814	java/lang/RuntimeException
    //   962	1040	1814	java/lang/RuntimeException
    //   1040	1066	1814	java/lang/RuntimeException
    //   1068	1080	1814	java/lang/RuntimeException
    //   1083	1157	1814	java/lang/RuntimeException
    //   1157	1180	1830	java/io/IOException
    //   1183	1231	1830	java/io/IOException
    //   1231	1242	1830	java/io/IOException
    //   1345	1351	1830	java/io/IOException
    //   1351	1387	1830	java/io/IOException
    //   1466	1473	1830	java/io/IOException
    //   1501	1539	1830	java/io/IOException
    //   1542	1618	1830	java/io/IOException
    //   1618	1643	1830	java/io/IOException
    //   1643	1666	1830	java/io/IOException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.bd
 * JD-Core Version:    0.6.0
 */