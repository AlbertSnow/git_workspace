package com.wandoujia.rootkit.c;

import com.wandoujia.rootkit.a.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  private static a a(String paramString)
  {
    try
    {
      ArrayList localArrayList = com.wandoujia.rootkit.b.d();
      File localFile = new File(paramString);
      a locala;
      boolean bool;
      do
      {
        Iterator localIterator;
        while (!localIterator.hasNext())
          localIterator = localArrayList.iterator();
        locala = (a)localIterator.next();
        bool = locala.b().equals(localFile);
      }
      while (!bool);
      return locala;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  public static boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 59
    //   3: invokevirtual 65	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   6: ifeq +24 -> 30
    //   9: aload_0
    //   10: ldc 59
    //   12: invokevirtual 66	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   15: ifne +15 -> 30
    //   18: aload_0
    //   19: iconst_0
    //   20: aload_0
    //   21: ldc 59
    //   23: invokevirtual 70	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   26: invokevirtual 74	java/lang/String:substring	(II)Ljava/lang/String;
    //   29: astore_0
    //   30: iconst_0
    //   31: istore_2
    //   32: iload_2
    //   33: ifne +108 -> 141
    //   36: invokestatic 20	com/wandoujia/rootkit/b:d	()Ljava/util/ArrayList;
    //   39: invokevirtual 31	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   42: astore 13
    //   44: aload 13
    //   46: invokeinterface 37 1 0
    //   51: ifeq +76 -> 127
    //   54: aload 13
    //   56: invokeinterface 41 1 0
    //   61: checkcast 43	com/wandoujia/rootkit/a/a
    //   64: astore 17
    //   66: aload 17
    //   68: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   71: invokevirtual 78	java/io/File:toString	()Ljava/lang/String;
    //   74: pop
    //   75: aload_0
    //   76: aload 17
    //   78: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   81: invokevirtual 78	java/io/File:toString	()Ljava/lang/String;
    //   84: invokevirtual 66	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   87: istore 19
    //   89: iload 19
    //   91: ifeq -47 -> 44
    //   94: iconst_1
    //   95: istore 14
    //   97: iload 14
    //   99: ifne +646 -> 745
    //   102: new 22	java/io/File
    //   105: dup
    //   106: aload_0
    //   107: invokespecial 25	java/io/File:<init>	(Ljava/lang/String;)V
    //   110: invokevirtual 81	java/io/File:getParent	()Ljava/lang/String;
    //   113: invokevirtual 82	java/lang/String:toString	()Ljava/lang/String;
    //   116: astore 16
    //   118: aload 16
    //   120: astore_0
    //   121: iload 14
    //   123: istore_2
    //   124: goto -92 -> 32
    //   127: iload_2
    //   128: istore 14
    //   130: goto -33 -> 97
    //   133: astore 12
    //   135: iconst_0
    //   136: ireturn
    //   137: astore 15
    //   139: iconst_0
    //   140: ireturn
    //   141: aload_0
    //   142: invokestatic 84	com/wandoujia/rootkit/c/b:a	(Ljava/lang/String;)Lcom/wandoujia/rootkit/a/a;
    //   145: astore_3
    //   146: new 86	java/lang/StringBuilder
    //   149: dup
    //   150: ldc 88
    //   152: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload_3
    //   156: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   159: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   162: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: ldc 98
    //   167: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: aload_1
    //   171: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   174: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_3
    //   179: invokevirtual 105	com/wandoujia/rootkit/a/a:c	()Ljava/util/Set;
    //   182: aload_1
    //   183: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   186: invokeinterface 110 2 0
    //   191: ifne +486 -> 677
    //   194: bipush 8
    //   196: anewarray 61	java/lang/String
    //   199: astore 9
    //   201: aload 9
    //   203: iconst_0
    //   204: new 86	java/lang/StringBuilder
    //   207: dup
    //   208: ldc 112
    //   210: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   213: aload_1
    //   214: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   217: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: ldc 114
    //   222: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload_3
    //   226: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   229: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   232: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: ldc 114
    //   237: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: aload_3
    //   241: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   244: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   247: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: aastore
    //   254: aload 9
    //   256: iconst_1
    //   257: new 86	java/lang/StringBuilder
    //   260: dup
    //   261: ldc 119
    //   263: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload_1
    //   267: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   270: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: ldc 114
    //   275: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload_3
    //   279: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   282: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   285: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: ldc 114
    //   290: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload_3
    //   294: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   297: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   300: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   306: aastore
    //   307: aload 9
    //   309: iconst_2
    //   310: new 86	java/lang/StringBuilder
    //   313: dup
    //   314: ldc 121
    //   316: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload_1
    //   320: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   323: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: ldc 114
    //   328: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload_3
    //   332: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   335: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   338: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: ldc 114
    //   343: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_3
    //   347: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   350: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   353: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   359: aastore
    //   360: aload 9
    //   362: iconst_3
    //   363: new 86	java/lang/StringBuilder
    //   366: dup
    //   367: ldc 123
    //   369: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   372: aload_1
    //   373: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   376: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: ldc 114
    //   381: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: aload_3
    //   385: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   388: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   391: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: ldc 114
    //   396: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: aload_3
    //   400: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   403: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   406: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: aastore
    //   413: aload 9
    //   415: iconst_4
    //   416: new 86	java/lang/StringBuilder
    //   419: dup
    //   420: ldc 125
    //   422: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   425: aload_1
    //   426: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   429: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: ldc 114
    //   434: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: aload_3
    //   438: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   441: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   444: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: ldc 114
    //   449: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: aload_3
    //   453: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   456: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   459: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: ldc 127
    //   464: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: aastore
    //   471: aload 9
    //   473: iconst_5
    //   474: new 86	java/lang/StringBuilder
    //   477: dup
    //   478: ldc 129
    //   480: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   483: aload_1
    //   484: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   487: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: ldc 114
    //   492: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: aload_3
    //   496: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   499: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   502: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: ldc 114
    //   507: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: aload_3
    //   511: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   514: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   517: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: ldc 127
    //   522: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   528: aastore
    //   529: aload 9
    //   531: bipush 6
    //   533: new 86	java/lang/StringBuilder
    //   536: dup
    //   537: ldc 131
    //   539: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   542: aload_1
    //   543: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   546: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: ldc 114
    //   551: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: aload_3
    //   555: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   558: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   561: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: ldc 114
    //   566: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: aload_3
    //   570: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   573: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   576: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: ldc 127
    //   581: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   587: aastore
    //   588: aload 9
    //   590: bipush 7
    //   592: new 86	java/lang/StringBuilder
    //   595: dup
    //   596: ldc 133
    //   598: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   601: aload_1
    //   602: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   605: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: ldc 114
    //   610: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: aload_3
    //   614: invokevirtual 116	com/wandoujia/rootkit/a/a:a	()Ljava/io/File;
    //   617: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   620: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: ldc 114
    //   625: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: aload_3
    //   629: invokevirtual 47	com/wandoujia/rootkit/a/a:b	()Ljava/io/File;
    //   632: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   635: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: ldc 127
    //   640: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   646: aastore
    //   647: new 135	com/wandoujia/rootkit/b/b
    //   650: dup
    //   651: aload 9
    //   653: invokespecial 138	com/wandoujia/rootkit/b/b:<init>	([Ljava/lang/String;)V
    //   656: astore 10
    //   658: invokestatic 143	com/wandoujia/rootkit/b/c:a	()Lcom/wandoujia/rootkit/b/c;
    //   661: aload 10
    //   663: invokevirtual 146	com/wandoujia/rootkit/b/c:a	(Lcom/wandoujia/rootkit/b/a;)Lcom/wandoujia/rootkit/b/a;
    //   666: pop
    //   667: aload 10
    //   669: invokevirtual 148	com/wandoujia/rootkit/b/b:c	()V
    //   672: aload_0
    //   673: invokestatic 84	com/wandoujia/rootkit/c/b:a	(Ljava/lang/String;)Lcom/wandoujia/rootkit/a/a;
    //   676: astore_3
    //   677: new 86	java/lang/StringBuilder
    //   680: dup
    //   681: invokespecial 149	java/lang/StringBuilder:<init>	()V
    //   684: aload_3
    //   685: invokevirtual 105	com/wandoujia/rootkit/a/a:c	()Ljava/util/Set;
    //   688: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   691: ldc 154
    //   693: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: aload_1
    //   697: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   700: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   703: pop
    //   704: aload_3
    //   705: invokevirtual 105	com/wandoujia/rootkit/a/a:c	()Ljava/util/Set;
    //   708: aload_1
    //   709: invokevirtual 101	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   712: invokeinterface 110 2 0
    //   717: ifeq +13 -> 730
    //   720: aload_3
    //   721: invokevirtual 105	com/wandoujia/rootkit/a/a:c	()Ljava/util/Set;
    //   724: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   727: pop
    //   728: iconst_1
    //   729: ireturn
    //   730: aload_3
    //   731: invokevirtual 105	com/wandoujia/rootkit/a/a:c	()Ljava/util/Set;
    //   734: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   737: pop
    //   738: iconst_0
    //   739: ireturn
    //   740: astore 8
    //   742: goto -70 -> 672
    //   745: iload 14
    //   747: istore_2
    //   748: goto -716 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   36	44	133	java/lang/Exception
    //   44	89	133	java/lang/Exception
    //   102	118	137	java/lang/Exception
    //   194	672	740	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.c.b
 * JD-Core Version:    0.6.0
 */