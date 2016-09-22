package com.alipay.ut.b;

import java.io.File;
import java.util.HashMap;

public final class c
{
  private static final Object c = new Object();
  private final Object a = new Object();
  private File b;
  private HashMap<File, d> d = new HashMap();

  public c(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.b = new File(paramString);
      return;
    }
    throw new RuntimeException("Directory can not be empty");
  }

  private File b()
  {
    synchronized (this.a)
    {
      File localFile = this.b;
      return localFile;
    }
  }

  private static File b(File paramFile)
  {
    return new File(paramFile.getPath() + ".bak");
  }

  // ERROR //
  public final b a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 74	com/alipay/ut/b/c:b	()Ljava/io/File;
    //   4: astore_2
    //   5: new 51	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 52	java/lang/StringBuilder:<init>	()V
    //   12: aload_1
    //   13: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 76
    //   18: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_3
    //   25: aload_3
    //   26: getstatic 80	java/io/File:separatorChar	C
    //   29: invokevirtual 84	java/lang/String:indexOf	(I)I
    //   32: ifge +55 -> 87
    //   35: new 35	java/io/File
    //   38: dup
    //   39: aload_2
    //   40: aload_3
    //   41: invokespecial 87	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   44: astore 4
    //   46: getstatic 19	com/alipay/ut/b/c:c	Ljava/lang/Object;
    //   49: astore 5
    //   51: aload 5
    //   53: monitorenter
    //   54: aload_0
    //   55: getfield 27	com/alipay/ut/b/c:d	Ljava/util/HashMap;
    //   58: aload 4
    //   60: invokevirtual 91	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast 93	com/alipay/ut/b/d
    //   66: astore 7
    //   68: aload 7
    //   70: ifnull +46 -> 116
    //   73: aload 7
    //   75: invokevirtual 96	com/alipay/ut/b/d:b	()Z
    //   78: ifne +38 -> 116
    //   81: aload 5
    //   83: monitorexit
    //   84: aload 7
    //   86: areturn
    //   87: new 98	java/lang/IllegalArgumentException
    //   90: dup
    //   91: new 51	java/lang/StringBuilder
    //   94: dup
    //   95: ldc 100
    //   97: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: aload_3
    //   101: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc 103
    //   106: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokespecial 104	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   115: athrow
    //   116: aload 5
    //   118: monitorexit
    //   119: aload 4
    //   121: invokestatic 47	com/alipay/ut/b/c:b	(Ljava/io/File;)Ljava/io/File;
    //   124: astore 8
    //   126: aload 8
    //   128: invokevirtual 107	java/io/File:exists	()Z
    //   131: ifeq +17 -> 148
    //   134: aload 4
    //   136: invokevirtual 110	java/io/File:delete	()Z
    //   139: pop
    //   140: aload 8
    //   142: aload 4
    //   144: invokevirtual 114	java/io/File:renameTo	(Ljava/io/File;)Z
    //   147: pop
    //   148: aload 4
    //   150: invokevirtual 107	java/io/File:exists	()Z
    //   153: ifeq +9 -> 162
    //   156: aload 4
    //   158: invokevirtual 117	java/io/File:canRead	()Z
    //   161: pop
    //   162: aload 4
    //   164: invokevirtual 107	java/io/File:exists	()Z
    //   167: ifeq +238 -> 405
    //   170: aload 4
    //   172: invokevirtual 117	java/io/File:canRead	()Z
    //   175: ifeq +230 -> 405
    //   178: new 119	java/io/FileInputStream
    //   181: dup
    //   182: aload 4
    //   184: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   187: astore 13
    //   189: invokestatic 128	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   192: astore 23
    //   194: aload 23
    //   196: aload 13
    //   198: aconst_null
    //   199: invokeinterface 134 3 0
    //   204: aload 23
    //   206: iconst_1
    //   207: anewarray 29	java/lang/String
    //   210: invokestatic 139	com/wandoujia/p4/community/utils/a:a	(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;
    //   213: checkcast 24	java/util/HashMap
    //   216: astore 9
    //   218: aload 13
    //   220: invokevirtual 142	java/io/FileInputStream:close	()V
    //   223: getstatic 19	com/alipay/ut/b/c:c	Ljava/lang/Object;
    //   226: astore 10
    //   228: aload 10
    //   230: monitorenter
    //   231: aload 7
    //   233: ifnull +89 -> 322
    //   236: aload 7
    //   238: aload 9
    //   240: invokevirtual 145	com/alipay/ut/b/d:a	(Ljava/util/Map;)V
    //   243: aload 10
    //   245: monitorexit
    //   246: aload 7
    //   248: areturn
    //   249: astore 12
    //   251: aload 10
    //   253: monitorexit
    //   254: aload 12
    //   256: athrow
    //   257: astore 6
    //   259: aload 5
    //   261: monitorexit
    //   262: aload 6
    //   264: athrow
    //   265: astore 16
    //   267: aconst_null
    //   268: astore 9
    //   270: new 119	java/io/FileInputStream
    //   273: dup
    //   274: aload 4
    //   276: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   279: astore 17
    //   281: aload 17
    //   283: invokevirtual 148	java/io/FileInputStream:available	()I
    //   286: newarray byte
    //   288: astore 20
    //   290: aload 17
    //   292: aload 20
    //   294: invokevirtual 152	java/io/FileInputStream:read	([B)I
    //   297: pop
    //   298: new 29	java/lang/String
    //   301: dup
    //   302: aload 20
    //   304: iconst_0
    //   305: aload 20
    //   307: arraylength
    //   308: ldc 154
    //   310: invokespecial 157	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   313: pop
    //   314: goto -91 -> 223
    //   317: astore 19
    //   319: goto -96 -> 223
    //   322: aload_0
    //   323: getfield 27	com/alipay/ut/b/c:d	Ljava/util/HashMap;
    //   326: aload 4
    //   328: invokevirtual 91	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   331: checkcast 93	com/alipay/ut/b/d
    //   334: astore 7
    //   336: aload 7
    //   338: ifnonnull -95 -> 243
    //   341: new 93	com/alipay/ut/b/d
    //   344: dup
    //   345: aload 4
    //   347: aload 9
    //   349: invokespecial 160	com/alipay/ut/b/d:<init>	(Ljava/io/File;Ljava/util/Map;)V
    //   352: astore 7
    //   354: aload_0
    //   355: getfield 27	com/alipay/ut/b/c:d	Ljava/util/HashMap;
    //   358: aload 4
    //   360: aload 7
    //   362: invokevirtual 164	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   365: pop
    //   366: goto -123 -> 243
    //   369: astore 15
    //   371: aconst_null
    //   372: astore 9
    //   374: goto -151 -> 223
    //   377: astore 26
    //   379: goto -156 -> 223
    //   382: astore 14
    //   384: aconst_null
    //   385: astore 9
    //   387: goto -164 -> 223
    //   390: astore 25
    //   392: goto -169 -> 223
    //   395: astore 18
    //   397: goto -174 -> 223
    //   400: astore 24
    //   402: goto -132 -> 270
    //   405: aconst_null
    //   406: astore 9
    //   408: goto -185 -> 223
    //
    // Exception table:
    //   from	to	target	type
    //   236	243	249	finally
    //   243	246	249	finally
    //   251	254	249	finally
    //   322	336	249	finally
    //   341	366	249	finally
    //   54	68	257	finally
    //   73	84	257	finally
    //   116	119	257	finally
    //   259	262	257	finally
    //   178	218	265	org/xmlpull/v1/XmlPullParserException
    //   270	314	317	java/io/FileNotFoundException
    //   178	218	369	java/io/IOException
    //   218	223	377	java/io/IOException
    //   178	218	382	java/io/FileNotFoundException
    //   218	223	390	java/io/FileNotFoundException
    //   270	314	395	java/io/IOException
    //   218	223	400	org/xmlpull/v1/XmlPullParserException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.b.c
 * JD-Core Version:    0.6.0
 */