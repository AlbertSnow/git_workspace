package com.org.apache.http.entity.mime.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class c extends a
{
  private final byte[] a;
  private final Charset b;

  public c(String paramString1, String paramString2, Charset paramCharset)
  {
    super(paramString2);
    if (paramString1 == null)
      throw new IllegalArgumentException("Text may not be null");
    if (paramCharset == null)
      paramCharset = Charset.forName("US-ASCII");
    this.a = paramString1.getBytes(paramCharset.name());
    this.b = paramCharset;
  }

  public final void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null)
      throw new IllegalArgumentException("Output stream may not be null");
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.a);
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = localByteArrayInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    paramOutputStream.flush();
  }

  public final String b()
  {
    return this.b.name();
  }

  public final String c()
  {
    return "8bit";
  }

  public final long d()
  {
    return this.a.length;
  }

  public final String e()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.a.c
 * JD-Core Version:    0.6.0
 */