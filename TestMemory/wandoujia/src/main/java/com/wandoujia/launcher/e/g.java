package com.wandoujia.launcher.e;

import com.wandoujia.launcher_base.b.a;
import java.io.File;

public final class g
{
  private static final String a = a.h() + "mario" + File.separator + "cache" + File.separator + "preferences";

  static
  {
    new File(a).mkdirs();
  }

  // ERROR //
  public static boolean a(android.content.SharedPreferences paramSharedPreferences, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aconst_null
    //   4: astore_2
    //   5: new 27	java/io/File
    //   8: dup
    //   9: getstatic 39	com/wandoujia/launcher/e/g:a	Ljava/lang/String;
    //   12: aload_1
    //   13: invokespecial 54	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: astore_3
    //   17: new 56	java/io/ObjectOutputStream
    //   20: dup
    //   21: new 58	java/io/FileOutputStream
    //   24: dup
    //   25: aload_3
    //   26: invokespecial 61	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: invokespecial 64	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore 4
    //   34: aload 4
    //   36: aload_0
    //   37: invokeinterface 70 1 0
    //   42: invokevirtual 74	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   45: iconst_1
    //   46: istore 6
    //   48: aload 4
    //   50: invokevirtual 77	java/io/ObjectOutputStream:flush	()V
    //   53: aload 4
    //   55: invokevirtual 80	java/io/ObjectOutputStream:close	()V
    //   58: ldc 2
    //   60: monitorexit
    //   61: iload 6
    //   63: ireturn
    //   64: astore 15
    //   66: aconst_null
    //   67: astore 4
    //   69: iconst_0
    //   70: istore 6
    //   72: aload 4
    //   74: ifnull -16 -> 58
    //   77: aload 4
    //   79: invokevirtual 77	java/io/ObjectOutputStream:flush	()V
    //   82: aload 4
    //   84: invokevirtual 80	java/io/ObjectOutputStream:close	()V
    //   87: iconst_0
    //   88: istore 6
    //   90: goto -32 -> 58
    //   93: astore 8
    //   95: iconst_0
    //   96: istore 6
    //   98: goto -40 -> 58
    //   101: astore 14
    //   103: iconst_0
    //   104: istore 6
    //   106: aload_2
    //   107: ifnull -49 -> 58
    //   110: aload_2
    //   111: invokevirtual 77	java/io/ObjectOutputStream:flush	()V
    //   114: aload_2
    //   115: invokevirtual 80	java/io/ObjectOutputStream:close	()V
    //   118: iconst_0
    //   119: istore 6
    //   121: goto -63 -> 58
    //   124: astore 10
    //   126: iconst_0
    //   127: istore 6
    //   129: goto -71 -> 58
    //   132: astore 11
    //   134: aload_2
    //   135: ifnull +11 -> 146
    //   138: aload_2
    //   139: invokevirtual 77	java/io/ObjectOutputStream:flush	()V
    //   142: aload_2
    //   143: invokevirtual 80	java/io/ObjectOutputStream:close	()V
    //   146: aload 11
    //   148: athrow
    //   149: astore 7
    //   151: ldc 2
    //   153: monitorexit
    //   154: aload 7
    //   156: athrow
    //   157: astore 12
    //   159: goto -13 -> 146
    //   162: astore 11
    //   164: aload 4
    //   166: astore_2
    //   167: goto -33 -> 134
    //   170: astore 9
    //   172: aload 4
    //   174: astore_2
    //   175: goto -72 -> 103
    //   178: astore 5
    //   180: goto -111 -> 69
    //   183: astore 13
    //   185: goto -127 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   17	34	64	java/io/FileNotFoundException
    //   77	87	93	java/io/IOException
    //   17	34	101	java/io/IOException
    //   110	118	124	java/io/IOException
    //   17	34	132	finally
    //   5	17	149	finally
    //   48	58	149	finally
    //   77	87	149	finally
    //   110	118	149	finally
    //   138	146	149	finally
    //   146	149	149	finally
    //   138	146	157	java/io/IOException
    //   34	45	162	finally
    //   34	45	170	java/io/IOException
    //   34	45	178	java/io/FileNotFoundException
    //   48	58	183	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.g
 * JD-Core Version:    0.6.0
 */