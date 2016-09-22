package com.wandoujia.base.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class GZipUtil
{
  private static final int BUFFER_SIZE = 1024;

  public static void zip(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    try
    {
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(paramOutputStream);
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localGZIPOutputStream.write(arrayOfByte, 0, i);
      }
      localGZIPOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  // ERROR //
  public static byte[] zipBytes(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 37	java/io/ByteArrayInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 40	java/io/ByteArrayInputStream:<init>	([B)V
    //   14: astore_1
    //   15: new 42	java/io/ByteArrayOutputStream
    //   18: dup
    //   19: invokespecial 43	java/io/ByteArrayOutputStream:<init>	()V
    //   22: astore_2
    //   23: new 17	java/util/zip/GZIPOutputStream
    //   26: dup
    //   27: aload_2
    //   28: invokespecial 20	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   31: astore_3
    //   32: sipush 1024
    //   35: newarray byte
    //   37: astore 6
    //   39: aload_1
    //   40: aload 6
    //   42: iconst_0
    //   43: sipush 1024
    //   46: invokevirtual 46	java/io/ByteArrayInputStream:read	([BII)I
    //   49: istore 7
    //   51: iload 7
    //   53: iconst_m1
    //   54: if_icmpeq +31 -> 85
    //   57: aload_3
    //   58: aload 6
    //   60: iconst_0
    //   61: iload 7
    //   63: invokevirtual 30	java/util/zip/GZIPOutputStream:write	([BII)V
    //   66: goto -27 -> 39
    //   69: astore 5
    //   71: aload_1
    //   72: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   75: aload_2
    //   76: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   79: aload_3
    //   80: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   83: aconst_null
    //   84: areturn
    //   85: aload_3
    //   86: invokevirtual 33	java/util/zip/GZIPOutputStream:close	()V
    //   89: aload_2
    //   90: invokevirtual 55	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   93: astore 8
    //   95: aload_1
    //   96: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   99: aload_2
    //   100: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   103: aload_3
    //   104: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   107: aload 8
    //   109: areturn
    //   110: astore 14
    //   112: aconst_null
    //   113: astore_2
    //   114: aconst_null
    //   115: astore_1
    //   116: aconst_null
    //   117: astore_3
    //   118: aload 14
    //   120: astore 4
    //   122: aload_1
    //   123: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   126: aload_2
    //   127: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   130: aload_3
    //   131: invokestatic 51	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   134: aload 4
    //   136: athrow
    //   137: astore 12
    //   139: aload 12
    //   141: astore 4
    //   143: aconst_null
    //   144: astore_3
    //   145: aconst_null
    //   146: astore_2
    //   147: goto -25 -> 122
    //   150: astore 10
    //   152: aload 10
    //   154: astore 4
    //   156: aconst_null
    //   157: astore_3
    //   158: goto -36 -> 122
    //   161: astore 4
    //   163: goto -41 -> 122
    //   166: astore 13
    //   168: aconst_null
    //   169: astore_3
    //   170: aconst_null
    //   171: astore_2
    //   172: aconst_null
    //   173: astore_1
    //   174: goto -103 -> 71
    //   177: astore 11
    //   179: aconst_null
    //   180: astore_3
    //   181: aconst_null
    //   182: astore_2
    //   183: goto -112 -> 71
    //   186: astore 9
    //   188: aconst_null
    //   189: astore_3
    //   190: goto -119 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   32	39	69	java/io/IOException
    //   39	51	69	java/io/IOException
    //   57	66	69	java/io/IOException
    //   85	95	69	java/io/IOException
    //   6	15	110	finally
    //   15	23	137	finally
    //   23	32	150	finally
    //   32	39	161	finally
    //   39	51	161	finally
    //   57	66	161	finally
    //   85	95	161	finally
    //   6	15	166	java/io/IOException
    //   15	23	177	java/io/IOException
    //   23	32	186	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.GZipUtil
 * JD-Core Version:    0.6.0
 */