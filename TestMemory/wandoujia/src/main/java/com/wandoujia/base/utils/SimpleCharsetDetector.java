package com.wandoujia.base.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class SimpleCharsetDetector
{
  public static final String GBK = "GBK";
  private static final int MAX_BYTES = 400;
  public static final String UTF_8 = "UTF-8";

  public static String detectBytes(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null)
      return paramString;
    return detectInputStream(new ByteArrayInputStream(paramArrayOfByte), paramArrayOfByte.length);
  }

  public static Charset detectFile(File paramFile, String paramString)
  {
    if (paramFile == null)
      return Charset.forName(paramString);
    try
    {
      localBufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      arrayOfByte = new byte[3];
      localBufferedInputStream.mark(3);
      if (localBufferedInputStream.read(arrayOfByte, 0, 3) != -1)
        if ((arrayOfByte[0] == -1) && (arrayOfByte[1] == -2))
          str = "UTF-16LE";
    }
    catch (IOException localIOException1)
    {
      while (true)
      {
        try
        {
          BufferedInputStream localBufferedInputStream;
          byte[] arrayOfByte;
          localBufferedInputStream.close();
          return Charset.forName(str);
          if ((arrayOfByte[0] != -2) || (arrayOfByte[1] != -1))
            continue;
          str = "UTF-16BE";
          continue;
          if ((arrayOfByte[0] != -17) || (arrayOfByte[1] != -69) || (arrayOfByte[2] != -65))
            continue;
          str = "UTF-8";
          continue;
          localBufferedInputStream.reset();
          Charset localCharset = Charset.forName(detectInputStream(localBufferedInputStream, 400));
          return localCharset;
          localIOException1 = localIOException1;
          str = paramString;
          continue;
        }
        catch (IOException localIOException2)
        {
          continue;
        }
        String str = paramString;
      }
    }
  }

  private static String detectInputStream(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    try
    {
      int k = paramInputStream.read();
      if (k != -1)
      {
        i++;
        if (i <= paramInt)
        {
          j = 0;
          if (k >= 240);
          while (true)
          {
            if (j == 0)
              break label189;
            return "UTF-8";
            if (128 <= k)
            {
              j = 0;
              if (k <= 191)
                continue;
            }
            if ((192 <= k) && (k <= 223))
            {
              int i1 = paramInputStream.read();
              j = 0;
              if (128 > i1)
                continue;
              if (i1 <= 191)
                break;
              j = 0;
              continue;
            }
            if ((224 > k) || (k > 239))
              break;
            int m = paramInputStream.read();
            j = 0;
            if (128 > m)
              continue;
            j = 0;
            if (m > 191)
              continue;
            int n = paramInputStream.read();
            j = 0;
            if (128 > n)
              continue;
            if (n <= 191)
              break;
            j = 0;
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        int j = 1;
    }
    label189: return "GBK";
  }

  public static void trySkipBomHeader(InputStream paramInputStream)
  {
    try
    {
      if ((paramInputStream.available() >= 3) && (paramInputStream.markSupported()))
      {
        byte[] arrayOfByte = new byte[3];
        paramInputStream.mark(3);
        paramInputStream.read(arrayOfByte);
        if ((arrayOfByte[0] != -17) || (arrayOfByte[1] != -69) || (arrayOfByte[2] != -65))
          paramInputStream.reset();
      }
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.SimpleCharsetDetector
 * JD-Core Version:    0.6.0
 */