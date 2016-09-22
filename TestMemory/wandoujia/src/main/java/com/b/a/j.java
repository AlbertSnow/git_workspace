package com.b.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class j
{
  static final Charset a = Charset.forName("US-ASCII");

  static
  {
    Charset.forName("UTF-8");
  }

  static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    catch (Exception localException)
    {
    }
  }

  static void a(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null)
      throw new IOException("not a readable directory: " + paramFile);
    int i = arrayOfFile.length;
    for (int j = 0; j < i; j++)
    {
      File localFile = arrayOfFile[j];
      if (localFile.isDirectory())
        a(localFile);
      if (localFile.delete())
        continue;
      throw new IOException("failed to delete file: " + localFile);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.j
 * JD-Core Version:    0.6.0
 */