package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.List;

public abstract class q
{
  // ERROR //
  public static String a(Context paramContext, char paramChar)
  {
    // Byte code:
    //   0: iload_1
    //   1: bipush 65
    //   3: if_icmplt +20 -> 23
    //   6: iload_1
    //   7: bipush 90
    //   9: if_icmpgt +14 -> 23
    //   12: iload_1
    //   13: bipush 32
    //   15: iadd
    //   16: i2c
    //   17: invokestatic 20	java/lang/String:valueOf	(C)Ljava/lang/String;
    //   20: astore_3
    //   21: aload_3
    //   22: areturn
    //   23: iload_1
    //   24: bipush 97
    //   26: if_icmplt +14 -> 40
    //   29: iload_1
    //   30: bipush 122
    //   32: if_icmpgt +8 -> 40
    //   35: iload_1
    //   36: invokestatic 20	java/lang/String:valueOf	(C)Ljava/lang/String;
    //   39: areturn
    //   40: iload_1
    //   41: sipush 12295
    //   44: if_icmpne +6 -> 50
    //   47: ldc 22
    //   49: areturn
    //   50: iload_1
    //   51: i2d
    //   52: ldc2_w 23
    //   55: dcmpg
    //   56: istore_2
    //   57: aconst_null
    //   58: astore_3
    //   59: iload_2
    //   60: iflt -39 -> 21
    //   63: aconst_null
    //   64: astore_3
    //   65: iload_1
    //   66: ldc 25
    //   68: if_icmpgt -47 -> 21
    //   71: new 27	java/io/RandomAccessFile
    //   74: dup
    //   75: aload_0
    //   76: invokestatic 31	android/support/v4/app/q:b	(Landroid/content/Context;)Ljava/io/File;
    //   79: ldc 33
    //   81: invokespecial 36	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   84: astore 4
    //   86: bipush 6
    //   88: iload_1
    //   89: sipush 19968
    //   92: isub
    //   93: imul
    //   94: i2l
    //   95: lstore 5
    //   97: aload 4
    //   99: lload 5
    //   101: invokevirtual 40	java/io/RandomAccessFile:seek	(J)V
    //   104: bipush 6
    //   106: newarray byte
    //   108: astore 13
    //   110: aload 4
    //   112: aload 13
    //   114: invokevirtual 44	java/io/RandomAccessFile:read	([B)I
    //   117: pop
    //   118: new 16	java/lang/String
    //   121: dup
    //   122: aload 13
    //   124: invokespecial 47	java/lang/String:<init>	([B)V
    //   127: invokevirtual 51	java/lang/String:trim	()Ljava/lang/String;
    //   130: astore 15
    //   132: aload 4
    //   134: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   137: aload 15
    //   139: areturn
    //   140: astore 16
    //   142: aload 15
    //   144: areturn
    //   145: astore 19
    //   147: aconst_null
    //   148: astore 4
    //   150: aconst_null
    //   151: astore_3
    //   152: aload 4
    //   154: ifnull -133 -> 21
    //   157: aload 4
    //   159: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   162: aconst_null
    //   163: areturn
    //   164: astore 8
    //   166: aconst_null
    //   167: areturn
    //   168: astore 18
    //   170: aconst_null
    //   171: astore 4
    //   173: aconst_null
    //   174: astore_3
    //   175: aload 4
    //   177: ifnull -156 -> 21
    //   180: aload 4
    //   182: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   185: aconst_null
    //   186: areturn
    //   187: astore 10
    //   189: aconst_null
    //   190: areturn
    //   191: astore 17
    //   193: aconst_null
    //   194: astore 4
    //   196: aload 17
    //   198: astore 11
    //   200: aload 4
    //   202: ifnull +8 -> 210
    //   205: aload 4
    //   207: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   210: aload 11
    //   212: athrow
    //   213: astore 12
    //   215: goto -5 -> 210
    //   218: astore 11
    //   220: goto -20 -> 200
    //   223: astore 9
    //   225: goto -52 -> 173
    //   228: astore 7
    //   230: goto -80 -> 150
    //
    // Exception table:
    //   from	to	target	type
    //   132	137	140	java/io/IOException
    //   71	86	145	java/io/FileNotFoundException
    //   157	162	164	java/io/IOException
    //   71	86	168	java/io/IOException
    //   180	185	187	java/io/IOException
    //   71	86	191	finally
    //   205	210	213	java/io/IOException
    //   97	132	218	finally
    //   97	132	223	java/io/IOException
    //   97	132	228	java/io/FileNotFoundException
  }

  // ERROR //
  public static String a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 57	java/lang/StringBuffer
    //   3: dup
    //   4: ldc 59
    //   6: invokespecial 62	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   9: astore_2
    //   10: new 27	java/io/RandomAccessFile
    //   13: dup
    //   14: aload_0
    //   15: invokestatic 31	android/support/v4/app/q:b	(Landroid/content/Context;)Ljava/io/File;
    //   18: ldc 33
    //   20: invokespecial 36	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: astore_3
    //   24: iconst_0
    //   25: istore 4
    //   27: iload 4
    //   29: aload_1
    //   30: invokevirtual 66	java/lang/String:length	()I
    //   33: if_icmpge +192 -> 225
    //   36: aload_1
    //   37: iload 4
    //   39: invokevirtual 70	java/lang/String:charAt	(I)C
    //   42: istore 12
    //   44: iload 12
    //   46: bipush 65
    //   48: if_icmplt +24 -> 72
    //   51: iload 12
    //   53: bipush 90
    //   55: if_icmpgt +17 -> 72
    //   58: aload_2
    //   59: iload 12
    //   61: bipush 32
    //   63: iadd
    //   64: i2c
    //   65: invokevirtual 74	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   68: pop
    //   69: goto +193 -> 262
    //   72: iload 12
    //   74: bipush 97
    //   76: if_icmplt +38 -> 114
    //   79: iload 12
    //   81: bipush 122
    //   83: if_icmpgt +31 -> 114
    //   86: aload_2
    //   87: iload 12
    //   89: invokevirtual 74	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   92: pop
    //   93: goto +169 -> 262
    //   96: astore 9
    //   98: aload_3
    //   99: ifnull +7 -> 106
    //   102: aload_3
    //   103: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   106: aload_2
    //   107: invokevirtual 77	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   110: invokevirtual 51	java/lang/String:trim	()Ljava/lang/String;
    //   113: areturn
    //   114: iload 12
    //   116: sipush 12295
    //   119: if_icmpne +35 -> 154
    //   122: aload_2
    //   123: ldc 79
    //   125: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   128: pop
    //   129: goto +133 -> 262
    //   132: astore 5
    //   134: aload_3
    //   135: astore 6
    //   137: aload 5
    //   139: astore 7
    //   141: aload 6
    //   143: ifnull +8 -> 151
    //   146: aload 6
    //   148: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   151: aload 7
    //   153: athrow
    //   154: iload 12
    //   156: sipush 19968
    //   159: if_icmpge +10 -> 169
    //   162: iload 12
    //   164: ldc 25
    //   166: if_icmpgt +96 -> 262
    //   169: bipush 6
    //   171: iload 12
    //   173: sipush 19968
    //   176: isub
    //   177: imul
    //   178: i2l
    //   179: lstore 13
    //   181: aload_3
    //   182: lload 13
    //   184: invokevirtual 40	java/io/RandomAccessFile:seek	(J)V
    //   187: bipush 6
    //   189: newarray byte
    //   191: astore 15
    //   193: aload_3
    //   194: aload 15
    //   196: invokevirtual 44	java/io/RandomAccessFile:read	([B)I
    //   199: pop
    //   200: aload_2
    //   201: new 16	java/lang/String
    //   204: dup
    //   205: aload 15
    //   207: invokespecial 47	java/lang/String:<init>	([B)V
    //   210: invokevirtual 51	java/lang/String:trim	()Ljava/lang/String;
    //   213: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   216: bipush 32
    //   218: invokevirtual 74	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   221: pop
    //   222: goto +40 -> 262
    //   225: aload_3
    //   226: invokevirtual 54	java/io/RandomAccessFile:close	()V
    //   229: goto -123 -> 106
    //   232: astore 11
    //   234: goto -128 -> 106
    //   237: astore 10
    //   239: goto -133 -> 106
    //   242: astore 8
    //   244: goto -93 -> 151
    //   247: astore 7
    //   249: aconst_null
    //   250: astore 6
    //   252: goto -111 -> 141
    //   255: astore 21
    //   257: aconst_null
    //   258: astore_3
    //   259: goto -161 -> 98
    //   262: iinc 4 1
    //   265: goto -238 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   27	44	96	java/io/IOException
    //   58	69	96	java/io/IOException
    //   86	93	96	java/io/IOException
    //   122	129	96	java/io/IOException
    //   181	222	96	java/io/IOException
    //   27	44	132	finally
    //   58	69	132	finally
    //   86	93	132	finally
    //   122	129	132	finally
    //   181	222	132	finally
    //   225	229	232	java/io/IOException
    //   102	106	237	java/io/IOException
    //   146	151	242	java/io/IOException
    //   10	24	247	finally
    //   10	24	255	java/io/IOException
  }

  // ERROR //
  private static boolean a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 85	java/io/File
    //   5: dup
    //   6: new 87	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   13: aload_0
    //   14: invokevirtual 94	android/content/Context:getFilesDir	()Ljava/io/File;
    //   17: invokevirtual 97	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   20: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: ldc 102
    //   25: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokespecial 104	java/io/File:<init>	(Ljava/lang/String;)V
    //   34: astore_2
    //   35: aload_2
    //   36: invokevirtual 108	java/io/File:exists	()Z
    //   39: ifeq +8 -> 47
    //   42: aload_2
    //   43: invokevirtual 111	java/io/File:delete	()Z
    //   46: pop
    //   47: aload_2
    //   48: invokevirtual 114	java/io/File:createNewFile	()Z
    //   51: pop
    //   52: new 116	java/io/FileOutputStream
    //   55: dup
    //   56: aload_2
    //   57: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   60: astore 4
    //   62: aload 4
    //   64: new 57	java/lang/StringBuffer
    //   67: dup
    //   68: ldc 121
    //   70: invokespecial 62	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   73: ldc 123
    //   75: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   78: invokevirtual 77	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   81: invokevirtual 127	java/lang/String:getBytes	()[B
    //   84: invokevirtual 130	java/io/FileOutputStream:write	([B)V
    //   87: aload 4
    //   89: invokevirtual 133	java/io/FileOutputStream:flush	()V
    //   92: aload 4
    //   94: invokevirtual 134	java/io/FileOutputStream:close	()V
    //   97: iconst_1
    //   98: ireturn
    //   99: astore 7
    //   101: aload_1
    //   102: ifnull +7 -> 109
    //   105: aload_1
    //   106: invokevirtual 134	java/io/FileOutputStream:close	()V
    //   109: iconst_0
    //   110: ireturn
    //   111: astore_3
    //   112: aconst_null
    //   113: astore 4
    //   115: aload_3
    //   116: astore 5
    //   118: aload 4
    //   120: ifnull +8 -> 128
    //   123: aload 4
    //   125: invokevirtual 134	java/io/FileOutputStream:close	()V
    //   128: aload 5
    //   130: athrow
    //   131: astore 11
    //   133: goto -36 -> 97
    //   136: astore 8
    //   138: goto -29 -> 109
    //   141: astore 6
    //   143: goto -15 -> 128
    //   146: astore 5
    //   148: goto -30 -> 118
    //   151: astore 10
    //   153: aload 4
    //   155: astore_1
    //   156: goto -55 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   2	47	99	java/io/IOException
    //   47	62	99	java/io/IOException
    //   2	47	111	finally
    //   47	62	111	finally
    //   92	97	131	java/io/IOException
    //   105	109	136	java/io/IOException
    //   123	128	141	java/io/IOException
    //   62	92	146	finally
    //   62	92	151	java/io/IOException
  }

  private static File b(Context paramContext)
  {
    File localFile = new File(paramContext.getFilesDir().getAbsolutePath() + "/pinyin4android");
    if (!localFile.exists())
      a(paramContext);
    return localFile;
  }

  public abstract Fragment.SavedState a(Fragment paramFragment);

  public abstract Fragment a(int paramInt);

  public abstract Fragment a(Bundle paramBundle, String paramString);

  public abstract Fragment a(String paramString);

  public abstract ac a();

  public abstract void a(Bundle paramBundle, String paramString, Fragment paramFragment);

  public abstract void a(r paramr);

  public abstract void b(int paramInt);

  public abstract void b(r paramr);

  public abstract boolean b();

  public abstract void c();

  public abstract boolean d();

  public abstract int e();

  public abstract List<Fragment> f();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.q
 * JD-Core Version:    0.6.0
 */