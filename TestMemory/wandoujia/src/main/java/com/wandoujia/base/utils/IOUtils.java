package com.wandoujia.base.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class IOUtils
{
  private static final int BUFFER_SIZE = 8192;
  public static final String DEFAULT_ENCODING = "utf-8";
  private static final int EOF = -1;
  private static final int SKIP_BUFFER_SIZE = 2048;
  private static byte[] SKIP_BYTE_BUFFER;

  public static void close(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static int copy(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l = copyLarge(paramInputStream, paramOutputStream);
    if (l > 2147483647L)
      return -1;
    return (int)l;
  }

  public static void copy(InputStream paramInputStream, OutputStream paramOutputStream, String paramString)
  {
    if (paramString == null)
      paramString = "utf-8";
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream, paramString);
    char[] arrayOfChar = new char[8192];
    while (-1 != localInputStreamReader.read(arrayOfChar))
    {
      byte[] arrayOfByte = getBytes(arrayOfChar);
      paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    }
  }

  public static void copy(InputStream paramInputStream, Writer paramWriter, String paramString)
  {
    if (paramString == null)
      paramString = "utf-8";
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream, paramString);
    char[] arrayOfChar = new char[8192];
    while (true)
    {
      int i = localInputStreamReader.read(arrayOfChar);
      if (-1 == i)
        break;
      paramWriter.write(arrayOfChar, 0, i);
    }
  }

  public static long copyLarge(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[8192];
    long l = 0L;
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (-1 == i)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
      l += i;
    }
    return l;
  }

  public static long copyLarge(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong1, long paramLong2)
  {
    return copyLarge(paramInputStream, paramOutputStream, paramLong1, paramLong2, new byte[8192]);
  }

  public static long copyLarge(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    if (paramLong1 > 0L)
      skipFully(paramInputStream, paramLong1);
    if (paramLong2 == 0L)
      return 0L;
    int i = paramArrayOfByte.length;
    if ((paramLong2 > 0L) && (paramLong2 < i));
    for (int j = (int)paramLong2; ; j = i)
    {
      long l = 0L;
      while (j > 0)
      {
        int k = paramInputStream.read(paramArrayOfByte, 0, j);
        if (-1 == k)
          break;
        paramOutputStream.write(paramArrayOfByte, 0, k);
        l += k;
        if (paramLong2 <= 0L)
          continue;
        j = (int)Math.min(paramLong2 - l, i);
      }
      return l;
    }
  }

  private static byte[] getBytes(char[] paramArrayOfChar)
  {
    Charset localCharset = Charset.forName("UTF-8");
    CharBuffer localCharBuffer = CharBuffer.allocate(paramArrayOfChar.length);
    localCharBuffer.put(paramArrayOfChar);
    localCharBuffer.flip();
    return localCharset.encode(localCharBuffer).array();
  }

  // ERROR //
  public static byte[] readBytes(File paramFile)
  {
    // Byte code:
    //   0: new 121	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 124	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_1
    //   9: aload_0
    //   10: invokevirtual 130	java/io/File:length	()J
    //   13: l2i
    //   14: newarray byte
    //   16: astore_3
    //   17: aload_1
    //   18: aload_3
    //   19: invokevirtual 68	java/io/InputStream:read	([B)I
    //   22: pop
    //   23: aload_1
    //   24: invokestatic 132	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   27: aload_3
    //   28: areturn
    //   29: astore_2
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_1
    //   33: invokestatic 132	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   36: aload_2
    //   37: athrow
    //   38: astore_2
    //   39: goto -7 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	29	finally
    //   9	23	38	finally
  }

  public static byte[] readBytes(InputStream paramInputStream)
  {
    try
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      try
      {
        byte[] arrayOfByte1 = new byte[8192];
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte1);
          if (i <= 0)
            break;
          localByteArrayOutputStream.write(arrayOfByte1, 0, i);
        }
      }
      finally
      {
      }
      close(paramInputStream);
      close(localByteArrayOutputStream);
      throw localObject1;
      byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
      close(paramInputStream);
      close(localByteArrayOutputStream);
      return arrayOfByte2;
    }
    finally
    {
      while (true)
        ByteArrayOutputStream localByteArrayOutputStream = null;
    }
  }

  public static String readString(File paramFile)
  {
    return readString(paramFile, "utf-8");
  }

  public static String readString(File paramFile, String paramString)
  {
    return readString(new FileInputStream(paramFile), paramString);
  }

  public static String readString(InputStream paramInputStream)
  {
    return readString(paramInputStream, "utf-8");
  }

  public static String readString(InputStream paramInputStream, String paramString)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      copy(paramInputStream, localStringWriter, paramString);
      String str = localStringWriter.toString();
      return str;
    }
    finally
    {
      close(paramInputStream);
      close(localStringWriter);
    }
    throw localObject;
  }

  public static long skip(InputStream paramInputStream, long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Skip count must be non-negative, actual: " + paramLong);
    if (SKIP_BYTE_BUFFER == null)
      SKIP_BYTE_BUFFER = new byte[2048];
    long l1 = paramLong;
    while (l1 > 0L)
    {
      long l2 = paramInputStream.read(SKIP_BYTE_BUFFER, 0, (int)Math.min(l1, 2048L));
      if (l2 < 0L)
        break;
      l1 -= l2;
    }
    return paramLong - l1;
  }

  public static void skipFully(InputStream paramInputStream, long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Bytes to skip must not be negative: " + paramLong);
    long l = skip(paramInputStream, paramLong);
    if (l != paramLong)
      throw new EOFException("Bytes to skip: " + paramLong + " actual: " + l);
  }

  public static void write(InputStream paramInputStream, File paramFile)
  {
    try
    {
      localFileOutputStream = new FileOutputStream(paramFile);
      try
      {
        byte[] arrayOfByte = new byte[8192];
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
      }
      finally
      {
      }
      close(paramInputStream);
      close(localFileOutputStream);
      throw localObject1;
      localFileOutputStream.flush();
      close(paramInputStream);
      close(localFileOutputStream);
      return;
    }
    finally
    {
      while (true)
        FileOutputStream localFileOutputStream = null;
    }
  }

  public static void write(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    write(paramInputStream, true, paramOutputStream, true);
  }

  public static void write(InputStream paramInputStream, boolean paramBoolean1, OutputStream paramOutputStream, boolean paramBoolean2)
  {
    try
    {
      byte[] arrayOfByte = new byte[8192];
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      if (paramBoolean1)
        close(paramInputStream);
      if (paramBoolean2)
        close(paramOutputStream);
    }
    paramOutputStream.flush();
    if (paramBoolean1)
      close(paramInputStream);
    if (paramBoolean2)
      close(paramOutputStream);
  }

  public static void write(byte[] paramArrayOfByte, File paramFile)
  {
    write(paramArrayOfByte, paramFile, false);
  }

  // ERROR //
  public static void write(byte[] paramArrayOfByte, File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 196	java/io/FileOutputStream
    //   3: dup
    //   4: aload_1
    //   5: iload_2
    //   6: invokespecial 211	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokevirtual 214	java/io/OutputStream:write	([B)V
    //   15: aload_3
    //   16: invokevirtual 200	java/io/OutputStream:flush	()V
    //   19: aload_3
    //   20: invokestatic 132	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   23: return
    //   24: astore 4
    //   26: aconst_null
    //   27: astore_3
    //   28: aload_3
    //   29: invokestatic 132	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   32: aload 4
    //   34: athrow
    //   35: astore 4
    //   37: goto -9 -> 28
    //
    // Exception table:
    //   from	to	target	type
    //   0	10	24	finally
    //   10	19	35	finally
  }

  public static void writeString(String paramString, OutputStream paramOutputStream)
  {
    writeString(paramString, paramOutputStream, "utf-8");
  }

  public static void writeString(String paramString1, OutputStream paramOutputStream, String paramString2)
  {
    try
    {
      PrintWriter localPrintWriter = new PrintWriter(new OutputStreamWriter(paramOutputStream, paramString2));
      localPrintWriter.write(paramString1);
      localPrintWriter.flush();
      paramOutputStream.flush();
      return;
    }
    finally
    {
      close(paramOutputStream);
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.IOUtils
 * JD-Core Version:    0.6.0
 */