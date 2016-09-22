package com.wandoujia.base.utils;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils
{
  private static String MD5 = "MD5";
  private static final long MIN_SEGMENT_FILE_LENGTH = 393216L;
  private static final int STREAM_BUFFER_LENGTH = 131072;

  // ERROR //
  public static String calculateFileSegmentMd5(String paramString)
  {
    // Byte code:
    //   0: ldc 13
    //   2: newarray byte
    //   4: astore 6
    //   6: new 29	java/io/RandomAccessFile
    //   9: dup
    //   10: aload_0
    //   11: ldc 31
    //   13: invokespecial 34	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: astore_2
    //   17: getstatic 18	com/wandoujia/base/utils/MD5Utils:MD5	Ljava/lang/String;
    //   20: invokestatic 38	com/wandoujia/base/utils/MD5Utils:getDigest	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   23: astore 9
    //   25: aload_2
    //   26: lconst_0
    //   27: invokevirtual 42	java/io/RandomAccessFile:seek	(J)V
    //   30: aload_2
    //   31: aload 6
    //   33: iconst_0
    //   34: ldc 13
    //   36: invokevirtual 46	java/io/RandomAccessFile:read	([BII)I
    //   39: istore 10
    //   41: iload 10
    //   43: iflt +13 -> 56
    //   46: aload 9
    //   48: aload 6
    //   50: iconst_0
    //   51: iload 10
    //   53: invokevirtual 52	java/security/MessageDigest:update	([BII)V
    //   56: aload_2
    //   57: aload_2
    //   58: invokevirtual 56	java/io/RandomAccessFile:length	()J
    //   61: ldc2_w 57
    //   64: lsub
    //   65: ldc2_w 59
    //   68: ldiv
    //   69: l2i
    //   70: i2l
    //   71: invokevirtual 42	java/io/RandomAccessFile:seek	(J)V
    //   74: aload_2
    //   75: aload 6
    //   77: iconst_0
    //   78: ldc 13
    //   80: invokevirtual 46	java/io/RandomAccessFile:read	([BII)I
    //   83: istore 11
    //   85: iload 11
    //   87: iflt +13 -> 100
    //   90: aload 9
    //   92: aload 6
    //   94: iconst_0
    //   95: iload 11
    //   97: invokevirtual 52	java/security/MessageDigest:update	([BII)V
    //   100: aload_2
    //   101: aload_2
    //   102: invokevirtual 56	java/io/RandomAccessFile:length	()J
    //   105: ldc2_w 57
    //   108: lsub
    //   109: l2i
    //   110: i2l
    //   111: invokevirtual 42	java/io/RandomAccessFile:seek	(J)V
    //   114: aload_2
    //   115: aload 6
    //   117: iconst_0
    //   118: ldc 13
    //   120: invokevirtual 46	java/io/RandomAccessFile:read	([BII)I
    //   123: istore 12
    //   125: iload 12
    //   127: iflt +13 -> 140
    //   130: aload 9
    //   132: aload 6
    //   134: iconst_0
    //   135: iload 12
    //   137: invokevirtual 52	java/security/MessageDigest:update	([BII)V
    //   140: aload_2
    //   141: invokevirtual 56	java/io/RandomAccessFile:length	()J
    //   144: invokestatic 66	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   147: invokevirtual 70	java/lang/String:getBytes	()[B
    //   150: astore 13
    //   152: aload 9
    //   154: aload 13
    //   156: iconst_0
    //   157: aload 13
    //   159: arraylength
    //   160: invokevirtual 52	java/security/MessageDigest:update	([BII)V
    //   163: aload 9
    //   165: invokevirtual 73	java/security/MessageDigest:digest	()[B
    //   168: invokestatic 77	com/wandoujia/base/utils/MD5Utils:getHexString	([B)Ljava/lang/String;
    //   171: astore 14
    //   173: aload_2
    //   174: invokestatic 83	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   177: aload 14
    //   179: areturn
    //   180: astore 5
    //   182: aconst_null
    //   183: astore_2
    //   184: aload_2
    //   185: invokestatic 83	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   188: aconst_null
    //   189: areturn
    //   190: astore 4
    //   192: aconst_null
    //   193: astore_2
    //   194: aload_2
    //   195: invokestatic 83	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   198: aconst_null
    //   199: areturn
    //   200: astore_1
    //   201: aconst_null
    //   202: astore_2
    //   203: aload_1
    //   204: astore_3
    //   205: aload_2
    //   206: invokestatic 83	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   209: aload_3
    //   210: athrow
    //   211: astore_3
    //   212: goto -7 -> 205
    //   215: astore 8
    //   217: goto -23 -> 194
    //   220: astore 7
    //   222: goto -38 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	180	java/io/FileNotFoundException
    //   0	17	190	java/io/IOException
    //   0	17	200	finally
    //   17	41	211	finally
    //   46	56	211	finally
    //   56	85	211	finally
    //   90	100	211	finally
    //   100	125	211	finally
    //   130	140	211	finally
    //   140	173	211	finally
    //   17	41	215	java/io/IOException
    //   46	56	215	java/io/IOException
    //   56	85	215	java/io/IOException
    //   90	100	215	java/io/IOException
    //   100	125	215	java/io/IOException
    //   130	140	215	java/io/IOException
    //   140	173	215	java/io/IOException
    //   17	41	220	java/io/FileNotFoundException
    //   46	56	220	java/io/FileNotFoundException
    //   56	85	220	java/io/FileNotFoundException
    //   90	100	220	java/io/FileNotFoundException
    //   100	125	220	java/io/FileNotFoundException
    //   130	140	220	java/io/FileNotFoundException
    //   140	173	220	java/io/FileNotFoundException
  }

  // ERROR //
  public static boolean checkMd5(String paramString1, String paramString2, java.lang.StringBuilder paramStringBuilder)
  {
    // Byte code:
    //   0: new 87	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 90	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: new 92	java/io/FileInputStream
    //   12: dup
    //   13: aload_3
    //   14: invokespecial 95	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: astore 4
    //   19: new 97	java/io/BufferedInputStream
    //   22: dup
    //   23: aload 4
    //   25: invokespecial 100	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: astore 5
    //   30: aload 5
    //   32: invokestatic 104	com/wandoujia/base/utils/MD5Utils:md5Digest	(Ljava/io/InputStream;)Ljava/lang/String;
    //   35: astore 17
    //   37: aload 17
    //   39: ifnull +39 -> 78
    //   42: aload 17
    //   44: aload_1
    //   45: invokevirtual 108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   48: ifeq +30 -> 78
    //   51: aload_2
    //   52: ifnull +10 -> 62
    //   55: aload_2
    //   56: aload 17
    //   58: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 116	java/io/BufferedInputStream:close	()V
    //   67: aload 4
    //   69: invokevirtual 117	java/io/FileInputStream:close	()V
    //   72: iconst_1
    //   73: istore 7
    //   75: iload 7
    //   77: ireturn
    //   78: aload_2
    //   79: ifnull +18 -> 97
    //   82: aload 17
    //   84: invokestatic 123	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   87: ifeq +26 -> 113
    //   90: aload_2
    //   91: ldc 125
    //   93: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload 5
    //   99: invokevirtual 116	java/io/BufferedInputStream:close	()V
    //   102: aload 4
    //   104: invokevirtual 117	java/io/FileInputStream:close	()V
    //   107: iconst_0
    //   108: ireturn
    //   109: astore 22
    //   111: iconst_0
    //   112: ireturn
    //   113: aload_2
    //   114: aload 17
    //   116: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: goto -23 -> 97
    //   123: astore 13
    //   125: aload 4
    //   127: astore 14
    //   129: aload 5
    //   131: ifnull +8 -> 139
    //   134: aload 5
    //   136: invokevirtual 116	java/io/BufferedInputStream:close	()V
    //   139: iconst_0
    //   140: istore 7
    //   142: aload 14
    //   144: ifnull -69 -> 75
    //   147: aload 14
    //   149: invokevirtual 117	java/io/FileInputStream:close	()V
    //   152: iconst_0
    //   153: ireturn
    //   154: astore 15
    //   156: iconst_0
    //   157: ireturn
    //   158: astore 28
    //   160: aconst_null
    //   161: astore 5
    //   163: aconst_null
    //   164: astore 4
    //   166: aload 5
    //   168: ifnull +8 -> 176
    //   171: aload 5
    //   173: invokevirtual 116	java/io/BufferedInputStream:close	()V
    //   176: iconst_0
    //   177: istore 7
    //   179: aload 4
    //   181: ifnull -106 -> 75
    //   184: aload 4
    //   186: invokevirtual 117	java/io/FileInputStream:close	()V
    //   189: iconst_0
    //   190: ireturn
    //   191: astore 8
    //   193: iconst_0
    //   194: ireturn
    //   195: astore 10
    //   197: aconst_null
    //   198: astore 5
    //   200: aconst_null
    //   201: astore 4
    //   203: aload 5
    //   205: ifnull +8 -> 213
    //   208: aload 5
    //   210: invokevirtual 116	java/io/BufferedInputStream:close	()V
    //   213: aload 4
    //   215: ifnull +8 -> 223
    //   218: aload 4
    //   220: invokevirtual 117	java/io/FileInputStream:close	()V
    //   223: aload 10
    //   225: athrow
    //   226: astore 19
    //   228: goto -161 -> 67
    //   231: astore 20
    //   233: goto -161 -> 72
    //   236: astore 21
    //   238: goto -136 -> 102
    //   241: astore 16
    //   243: goto -104 -> 139
    //   246: astore 9
    //   248: goto -72 -> 176
    //   251: astore 12
    //   253: goto -40 -> 213
    //   256: astore 11
    //   258: goto -35 -> 223
    //   261: astore 10
    //   263: aconst_null
    //   264: astore 5
    //   266: goto -63 -> 203
    //   269: astore 10
    //   271: goto -68 -> 203
    //   274: astore 26
    //   276: aconst_null
    //   277: astore 5
    //   279: goto -113 -> 166
    //   282: astore 6
    //   284: goto -118 -> 166
    //   287: astore 27
    //   289: aconst_null
    //   290: astore 5
    //   292: aconst_null
    //   293: astore 14
    //   295: goto -166 -> 129
    //   298: astore 25
    //   300: aload 4
    //   302: astore 14
    //   304: aconst_null
    //   305: astore 5
    //   307: goto -178 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   102	107	109	java/io/IOException
    //   30	37	123	java/io/FileNotFoundException
    //   42	51	123	java/io/FileNotFoundException
    //   55	62	123	java/io/FileNotFoundException
    //   82	97	123	java/io/FileNotFoundException
    //   113	120	123	java/io/FileNotFoundException
    //   147	152	154	java/io/IOException
    //   9	19	158	java/io/IOException
    //   184	189	191	java/io/IOException
    //   9	19	195	finally
    //   62	67	226	java/io/IOException
    //   67	72	231	java/io/IOException
    //   97	102	236	java/io/IOException
    //   134	139	241	java/io/IOException
    //   171	176	246	java/io/IOException
    //   208	213	251	java/io/IOException
    //   218	223	256	java/io/IOException
    //   19	30	261	finally
    //   30	37	269	finally
    //   42	51	269	finally
    //   55	62	269	finally
    //   82	97	269	finally
    //   113	120	269	finally
    //   19	30	274	java/io/IOException
    //   30	37	282	java/io/IOException
    //   42	51	282	java/io/IOException
    //   55	62	282	java/io/IOException
    //   82	97	282	java/io/IOException
    //   113	120	282	java/io/IOException
    //   9	19	287	java/io/FileNotFoundException
    //   19	30	298	java/io/FileNotFoundException
  }

  static MessageDigest getDigest(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
      return localMessageDigest;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    throw new RuntimeException(localNoSuchAlgorithmException.getMessage());
  }

  private static String getHexString(byte[] paramArrayOfByte)
  {
    return String.format("%032x", new Object[] { new BigInteger(1, paramArrayOfByte) });
  }

  public static String md5Digest(InputStream paramInputStream)
  {
    MessageDigest localMessageDigest = getDigest(MD5);
    byte[] arrayOfByte = new byte[131072];
    for (int i = paramInputStream.read(arrayOfByte, 0, 131072); i >= 0; i = paramInputStream.read(arrayOfByte, 0, 131072))
      localMessageDigest.update(arrayOfByte, 0, i);
    return getHexString(localMessageDigest.digest());
  }

  public static String md5Digest(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest = getDigest(MD5);
    for (int i = paramInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length); i >= 0; i = paramInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length))
      localMessageDigest.update(paramArrayOfByte, 0, i);
    return getHexString(localMessageDigest.digest());
  }

  public static String md5Digest(String paramString)
  {
    if (paramString == null)
      return null;
    MessageDigest localMessageDigest = getDigest(MD5);
    localMessageDigest.update(paramString.getBytes());
    return getHexString(localMessageDigest.digest());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.MD5Utils
 * JD-Core Version:    0.6.0
 */