package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;

@a
public final class r
  implements t
{
  public static void a(b paramb)
  {
    paramb.a("/install", new r());
  }

  // ERROR //
  public final void a(b paramb, java.util.Map paramMap)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 28
    //   3: invokeinterface 34 2 0
    //   8: checkcast 36	java/lang/String
    //   11: astore_3
    //   12: ldc 38
    //   14: aload_3
    //   15: invokevirtual 42	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   18: ifeq +51 -> 69
    //   21: invokestatic 47	com/google/android/gms/ads/internal/directappinstall/d:a	()Lcom/google/android/gms/ads/internal/directappinstall/d;
    //   24: pop
    //   25: aload_1
    //   26: invokeinterface 51 1 0
    //   31: aload_2
    //   32: invokestatic 54	com/google/android/gms/ads/internal/directappinstall/d:a	(Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;
    //   35: astore 50
    //   37: new 56	java/util/HashMap
    //   40: dup
    //   41: invokespecial 57	java/util/HashMap:<init>	()V
    //   44: astore 51
    //   46: aload 51
    //   48: ldc 59
    //   50: aload 50
    //   52: invokeinterface 63 3 0
    //   57: pop
    //   58: aload_1
    //   59: ldc 65
    //   61: aload 51
    //   63: invokeinterface 68 3 0
    //   68: return
    //   69: ldc 70
    //   71: aload_3
    //   72: invokevirtual 42	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: ifeq -7 -> 68
    //   78: invokestatic 47	com/google/android/gms/ads/internal/directappinstall/d:a	()Lcom/google/android/gms/ads/internal/directappinstall/d;
    //   81: pop
    //   82: aload_1
    //   83: invokeinterface 51 1 0
    //   88: astore 5
    //   90: aload_2
    //   91: ldc 72
    //   93: invokeinterface 34 2 0
    //   98: checkcast 36	java/lang/String
    //   101: astore 6
    //   103: aload_2
    //   104: ldc 74
    //   106: invokeinterface 34 2 0
    //   111: checkcast 36	java/lang/String
    //   114: astore 7
    //   116: aload 6
    //   118: invokestatic 80	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   121: ifeq +9 -> 130
    //   124: ldc 82
    //   126: invokestatic 88	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;)V
    //   129: return
    //   130: new 90	android/app/DownloadManager$Request
    //   133: dup
    //   134: aload 6
    //   136: invokestatic 96	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   139: invokespecial 99	android/app/DownloadManager$Request:<init>	(Landroid/net/Uri;)V
    //   142: astore 8
    //   144: invokestatic 105	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   147: invokevirtual 111	java/io/File:toString	()Ljava/lang/String;
    //   150: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   153: astore 10
    //   155: ldc 117
    //   157: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   160: astore 11
    //   162: aload 11
    //   164: invokevirtual 121	java/lang/String:length	()I
    //   167: ifeq +584 -> 751
    //   170: aload 10
    //   172: aload 11
    //   174: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   177: astore 12
    //   179: aload 8
    //   181: aload 5
    //   183: aload 12
    //   185: aload 7
    //   187: invokevirtual 129	android/app/DownloadManager$Request:setDestinationInExternalFilesDir	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;
    //   190: iconst_1
    //   191: invokevirtual 133	android/app/DownloadManager$Request:setVisibleInDownloadsUi	(Z)Landroid/app/DownloadManager$Request;
    //   194: iconst_3
    //   195: invokevirtual 137	android/app/DownloadManager$Request:setAllowedNetworkTypes	(I)Landroid/app/DownloadManager$Request;
    //   198: pop
    //   199: bipush 11
    //   201: invokestatic 142	aoq:a	(I)Z
    //   204: ifeq +572 -> 776
    //   207: aload 8
    //   209: iconst_1
    //   210: invokevirtual 145	android/app/DownloadManager$Request:setNotificationVisibility	(I)Landroid/app/DownloadManager$Request;
    //   213: astore 48
    //   215: aload 48
    //   217: astore 15
    //   219: aload_2
    //   220: ldc 147
    //   222: invokeinterface 34 2 0
    //   227: checkcast 36	java/lang/String
    //   230: astore 16
    //   232: new 149	java/lang/StringBuilder
    //   235: dup
    //   236: bipush 32
    //   238: aload 7
    //   240: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   243: invokevirtual 121	java/lang/String:length	()I
    //   246: iadd
    //   247: aload 6
    //   249: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   252: invokevirtual 121	java/lang/String:length	()I
    //   255: iadd
    //   256: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   259: ldc 154
    //   261: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload 7
    //   266: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: ldc 160
    //   271: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: aload 6
    //   276: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   282: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   285: aload 5
    //   287: ldc 166
    //   289: invokevirtual 172	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   292: checkcast 174	android/app/DownloadManager
    //   295: astore 17
    //   297: aload 5
    //   299: invokestatic 180	aon:d	()Laom;
    //   302: invokestatic 185	com/google/android/gms/ads/internal/directappinstall/b:a	(Landroid/content/Context;Laom;)Lcom/google/android/gms/ads/internal/directappinstall/b;
    //   305: astore 18
    //   307: aload 17
    //   309: aload 15
    //   311: invokevirtual 189	android/app/DownloadManager:enqueue	(Landroid/app/DownloadManager$Request;)J
    //   314: lstore 19
    //   316: aload 18
    //   318: getfield 192	com/google/android/gms/ads/internal/directappinstall/b:b	Lcom/google/android/gms/ads/internal/directappinstall/c;
    //   321: invokevirtual 198	com/google/android/gms/ads/internal/directappinstall/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   324: astore 21
    //   326: aload 21
    //   328: ldc 200
    //   330: iconst_1
    //   331: anewarray 36	java/lang/String
    //   334: dup
    //   335: iconst_0
    //   336: ldc 202
    //   338: aastore
    //   339: ldc 204
    //   341: iconst_1
    //   342: anewarray 36	java/lang/String
    //   345: dup
    //   346: iconst_0
    //   347: aload 7
    //   349: aastore
    //   350: aconst_null
    //   351: aconst_null
    //   352: aconst_null
    //   353: invokevirtual 210	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   356: astore 47
    //   358: aload 47
    //   360: astore 23
    //   362: aload 23
    //   364: ifnull +253 -> 617
    //   367: aload 23
    //   369: invokeinterface 215 1 0
    //   374: ifle +236 -> 610
    //   377: aload 23
    //   379: invokeinterface 219 1 0
    //   384: pop
    //   385: aload 23
    //   387: aload 23
    //   389: ldc 202
    //   391: invokeinterface 223 2 0
    //   396: invokeinterface 227 2 0
    //   401: astore 31
    //   403: aload 31
    //   405: invokestatic 80	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   408: ifne +183 -> 591
    //   411: invokestatic 47	com/google/android/gms/ads/internal/directappinstall/d:a	()Lcom/google/android/gms/ads/internal/directappinstall/d;
    //   414: pop
    //   415: aload 18
    //   417: getfield 230	com/google/android/gms/ads/internal/directappinstall/b:a	Landroid/content/Context;
    //   420: astore 34
    //   422: aload 31
    //   424: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   427: astore 35
    //   429: aload 35
    //   431: invokevirtual 121	java/lang/String:length	()I
    //   434: ifeq +406 -> 840
    //   437: ldc 232
    //   439: aload 35
    //   441: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   444: astore 36
    //   446: aload 36
    //   448: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   451: new 107	java/io/File
    //   454: dup
    //   455: aload 31
    //   457: invokespecial 234	java/io/File:<init>	(Ljava/lang/String;)V
    //   460: astore 37
    //   462: aload 37
    //   464: invokevirtual 237	java/io/File:exists	()Z
    //   467: ifeq +449 -> 916
    //   470: aload 37
    //   472: invokevirtual 240	java/io/File:delete	()Z
    //   475: pop
    //   476: aload 37
    //   478: invokevirtual 237	java/io/File:exists	()Z
    //   481: ifne +387 -> 868
    //   484: aload 31
    //   486: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   489: astore 45
    //   491: aload 45
    //   493: invokevirtual 121	java/lang/String:length	()I
    //   496: ifeq +358 -> 854
    //   499: ldc 242
    //   501: aload 45
    //   503: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   506: astore 46
    //   508: aload 46
    //   510: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   513: aload 34
    //   515: invokestatic 180	aon:d	()Laom;
    //   518: invokestatic 185	com/google/android/gms/ads/internal/directappinstall/b:a	(Landroid/content/Context;Laom;)Lcom/google/android/gms/ads/internal/directappinstall/b;
    //   521: astore 38
    //   523: aload 31
    //   525: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   528: astore 39
    //   530: aload 39
    //   532: invokevirtual 121	java/lang/String:length	()I
    //   535: ifeq +425 -> 960
    //   538: ldc 244
    //   540: aload 39
    //   542: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   545: astore 40
    //   547: aload 40
    //   549: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   552: iconst_1
    //   553: anewarray 36	java/lang/String
    //   556: dup
    //   557: iconst_0
    //   558: aload 31
    //   560: aastore
    //   561: astore 41
    //   563: aload 38
    //   565: getfield 192	com/google/android/gms/ads/internal/directappinstall/b:b	Lcom/google/android/gms/ads/internal/directappinstall/c;
    //   568: invokevirtual 198	com/google/android/gms/ads/internal/directappinstall/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   571: ldc 200
    //   573: ldc 246
    //   575: aload 41
    //   577: invokevirtual 249	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   580: ifle +3 -> 583
    //   583: aload 38
    //   585: getfield 192	com/google/android/gms/ads/internal/directappinstall/b:b	Lcom/google/android/gms/ads/internal/directappinstall/c;
    //   588: invokevirtual 252	com/google/android/gms/ads/internal/directappinstall/c:close	()V
    //   591: aload 21
    //   593: ldc 200
    //   595: ldc 204
    //   597: iconst_1
    //   598: anewarray 36	java/lang/String
    //   601: dup
    //   602: iconst_0
    //   603: aload 7
    //   605: aastore
    //   606: invokevirtual 249	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   609: pop
    //   610: aload 23
    //   612: invokeinterface 253 1 0
    //   617: aload 18
    //   619: getfield 256	com/google/android/gms/ads/internal/directappinstall/b:c	Laom;
    //   622: invokeinterface 261 1 0
    //   627: aload 18
    //   629: getfield 264	com/google/android/gms/ads/internal/directappinstall/b:d	J
    //   632: lsub
    //   633: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   636: astore 24
    //   638: iconst_1
    //   639: anewarray 36	java/lang/String
    //   642: astore 25
    //   644: aload 25
    //   646: iconst_0
    //   647: aload 24
    //   649: invokevirtual 272	java/lang/Long:longValue	()J
    //   652: invokestatic 275	java/lang/Long:toString	(J)Ljava/lang/String;
    //   655: aastore
    //   656: aload 21
    //   658: ldc 200
    //   660: ldc_w 277
    //   663: aload 25
    //   665: invokevirtual 249	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   668: pop
    //   669: new 279	android/content/ContentValues
    //   672: dup
    //   673: invokespecial 280	android/content/ContentValues:<init>	()V
    //   676: astore 27
    //   678: aload 27
    //   680: ldc_w 282
    //   683: lload 19
    //   685: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   688: invokevirtual 285	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   691: aload 27
    //   693: ldc_w 287
    //   696: aload 7
    //   698: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   701: aload 27
    //   703: ldc 147
    //   705: aload 16
    //   707: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   710: aload 27
    //   712: ldc_w 292
    //   715: aload 18
    //   717: getfield 256	com/google/android/gms/ads/internal/directappinstall/b:c	Laom;
    //   720: invokeinterface 261 1 0
    //   725: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   728: invokevirtual 285	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   731: aload 21
    //   733: ldc 200
    //   735: aconst_null
    //   736: aload 27
    //   738: invokevirtual 296	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   741: pop2
    //   742: aload 18
    //   744: getfield 192	com/google/android/gms/ads/internal/directappinstall/b:b	Lcom/google/android/gms/ads/internal/directappinstall/c;
    //   747: invokevirtual 252	com/google/android/gms/ads/internal/directappinstall/c:close	()V
    //   750: return
    //   751: new 36	java/lang/String
    //   754: dup
    //   755: aload 10
    //   757: invokespecial 297	java/lang/String:<init>	(Ljava/lang/String;)V
    //   760: astore 12
    //   762: goto -583 -> 179
    //   765: astore 9
    //   767: ldc_w 299
    //   770: aload 9
    //   772: invokestatic 302	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   775: return
    //   776: aload 8
    //   778: iconst_1
    //   779: invokevirtual 305	android/app/DownloadManager$Request:setShowRunningNotification	(Z)Landroid/app/DownloadManager$Request;
    //   782: astore 14
    //   784: aload 14
    //   786: astore 15
    //   788: goto -569 -> 219
    //   791: astore 22
    //   793: new 149	java/lang/StringBuilder
    //   796: dup
    //   797: bipush 70
    //   799: aload 7
    //   801: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   804: invokevirtual 121	java/lang/String:length	()I
    //   807: iadd
    //   808: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   811: ldc_w 307
    //   814: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: aload 7
    //   819: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   822: ldc_w 309
    //   825: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   831: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   834: aconst_null
    //   835: astore 23
    //   837: goto -475 -> 362
    //   840: new 36	java/lang/String
    //   843: dup
    //   844: ldc 232
    //   846: invokespecial 297	java/lang/String:<init>	(Ljava/lang/String;)V
    //   849: astore 36
    //   851: goto -405 -> 446
    //   854: new 36	java/lang/String
    //   857: dup
    //   858: ldc 242
    //   860: invokespecial 297	java/lang/String:<init>	(Ljava/lang/String;)V
    //   863: astore 46
    //   865: goto -357 -> 508
    //   868: aload 31
    //   870: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   873: astore 43
    //   875: aload 43
    //   877: invokevirtual 121	java/lang/String:length	()I
    //   880: ifeq +21 -> 901
    //   883: ldc_w 311
    //   886: aload 43
    //   888: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   891: astore 44
    //   893: aload 44
    //   895: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   898: goto -385 -> 513
    //   901: new 36	java/lang/String
    //   904: dup
    //   905: ldc_w 311
    //   908: invokespecial 297	java/lang/String:<init>	(Ljava/lang/String;)V
    //   911: astore 44
    //   913: goto -20 -> 893
    //   916: new 149	java/lang/StringBuilder
    //   919: dup
    //   920: bipush 21
    //   922: aload 31
    //   924: invokestatic 115	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   927: invokevirtual 121	java/lang/String:length	()I
    //   930: iadd
    //   931: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   934: ldc_w 313
    //   937: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   940: aload 31
    //   942: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: ldc_w 315
    //   948: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   954: invokestatic 164	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   957: goto -444 -> 513
    //   960: new 36	java/lang/String
    //   963: dup
    //   964: ldc 244
    //   966: invokespecial 297	java/lang/String:<init>	(Ljava/lang/String;)V
    //   969: astore 40
    //   971: goto -424 -> 547
    //
    // Exception table:
    //   from	to	target	type
    //   130	179	765	java/lang/IllegalArgumentException
    //   179	215	765	java/lang/IllegalArgumentException
    //   751	762	765	java/lang/IllegalArgumentException
    //   776	784	765	java/lang/IllegalArgumentException
    //   326	358	791	android/database/sqlite/SQLiteException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.r
 * JD-Core Version:    0.6.0
 */