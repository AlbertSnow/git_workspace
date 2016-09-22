package com.org.apache.http.entity.mime.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class b extends a
{
  private final File a;
  private final String b;

  private b(File paramFile, String paramString)
  {
    super(paramString);
    if (paramFile == null)
      throw new IllegalArgumentException("File may not be null");
    this.a = paramFile;
    this.b = paramFile.getName();
  }

  private b(File paramFile, String paramString, byte paramByte)
  {
    this(paramFile, paramString);
  }

  public b(File paramFile, String paramString, char paramChar)
  {
    this(paramFile, paramString, 0);
  }

  public final void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null)
      throw new IllegalArgumentException("Output stream may not be null");
    FileInputStream localFileInputStream = new FileInputStream(this.a);
    try
    {
      byte[] arrayOfByte = new byte[4096];
      while (true)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      localFileInputStream.close();
    }
    paramOutputStream.flush();
    localFileInputStream.close();
  }

  public final String b()
  {
    return null;
  }

  public final String c()
  {
    return "binary";
  }

  public final long d()
  {
    return this.a.length();
  }

  public final String e()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.a.b
 * JD-Core Version:    0.6.0
 */