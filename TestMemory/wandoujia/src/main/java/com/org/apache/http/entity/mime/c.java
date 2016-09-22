package com.org.apache.http.entity.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

public final class c
{
  private static final ByteArrayBuffer a = a(e.a, ": ");
  private static final ByteArrayBuffer b = a(e.a, "\r\n");
  private static final ByteArrayBuffer c = a(e.a, "--");
  private final Charset d;
  private final String e;
  private final List<a> f;
  private final HttpMultipartMode g;

  public c(String paramString, HttpMultipartMode paramHttpMultipartMode)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Multipart boundary may not be null");
    this.d = e.a;
    this.e = paramString;
    this.f = new ArrayList();
    this.g = paramHttpMultipartMode;
  }

  private static ByteArrayBuffer a(Charset paramCharset, String paramString)
  {
    ByteBuffer localByteBuffer = paramCharset.encode(CharBuffer.wrap(paramString));
    ByteArrayBuffer localByteArrayBuffer = new ByteArrayBuffer(localByteBuffer.remaining());
    localByteArrayBuffer.append(localByteBuffer.array(), localByteBuffer.position(), localByteBuffer.remaining());
    return localByteArrayBuffer;
  }

  private void a(HttpMultipartMode paramHttpMultipartMode, OutputStream paramOutputStream, boolean paramBoolean)
  {
    ByteArrayBuffer localByteArrayBuffer = a(this.d, this.e);
    Iterator localIterator1 = this.f.iterator();
    if (localIterator1.hasNext())
    {
      a locala = (a)localIterator1.next();
      a(c, paramOutputStream);
      a(localByteArrayBuffer, paramOutputStream);
      a(b, paramOutputStream);
      b localb = locala.b();
      switch (d.a[paramHttpMultipartMode.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        a(b, paramOutputStream);
        if (paramBoolean)
          locala.a().a(paramOutputStream);
        a(b, paramOutputStream);
        break;
        Iterator localIterator2 = localb.iterator();
        while (localIterator2.hasNext())
        {
          f localf = (f)localIterator2.next();
          a(localf.a(), paramOutputStream);
          a(a, paramOutputStream);
          a(localf.b(), paramOutputStream);
          a(b, paramOutputStream);
        }
        a(locala.b().a("Content-Disposition"), this.d, paramOutputStream);
        if (locala.a().e() == null)
          continue;
        a(locala.b().a("Content-Type"), this.d, paramOutputStream);
      }
    }
    a(c, paramOutputStream);
    a(localByteArrayBuffer, paramOutputStream);
    a(c, paramOutputStream);
    a(b, paramOutputStream);
  }

  private static void a(f paramf, Charset paramCharset, OutputStream paramOutputStream)
  {
    a(paramf.a(), paramCharset, paramOutputStream);
    a(a, paramOutputStream);
    a(paramf.b(), paramCharset, paramOutputStream);
    a(b, paramOutputStream);
  }

  private static void a(String paramString, OutputStream paramOutputStream)
  {
    a(a(e.a, paramString), paramOutputStream);
  }

  private static void a(String paramString, Charset paramCharset, OutputStream paramOutputStream)
  {
    a(a(paramCharset, paramString), paramOutputStream);
  }

  private static void a(ByteArrayBuffer paramByteArrayBuffer, OutputStream paramOutputStream)
  {
    paramOutputStream.write(paramByteArrayBuffer.buffer(), 0, paramByteArrayBuffer.length());
  }

  public final List<a> a()
  {
    return this.f;
  }

  public final void a(a parama)
  {
    this.f.add(parama);
  }

  public final void a(OutputStream paramOutputStream)
  {
    a(this.g, paramOutputStream, true);
  }

  public final long b()
  {
    Iterator localIterator = this.f.iterator();
    long l1 = 0L;
    while (localIterator.hasNext())
    {
      long l2 = ((a)localIterator.next()).a().d();
      if (l2 >= 0L)
      {
        l1 = l2 + l1;
        continue;
      }
      return -1L;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      a(this.g, localByteArrayOutputStream, false);
      int i = localByteArrayOutputStream.toByteArray().length;
      return l1 + i;
    }
    catch (IOException localIOException)
    {
    }
    return -1L;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.c
 * JD-Core Version:    0.6.0
 */