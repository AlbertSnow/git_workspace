package com.org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public final class g
  implements HttpEntity
{
  private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private final c b;
  private final Header c;
  private long d;
  private volatile boolean e;

  public g()
  {
    this(HttpMultipartMode.STRICT);
  }

  public g(HttpMultipartMode paramHttpMultipartMode)
  {
    String str = a();
    if (paramHttpMultipartMode == null)
      paramHttpMultipartMode = HttpMultipartMode.STRICT;
    this.b = new c(str, paramHttpMultipartMode);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("multipart/form-data; boundary=");
    localStringBuilder.append(str);
    this.c = new BasicHeader("Content-Type", localStringBuilder.toString());
    this.e = true;
  }

  private static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Random localRandom = new Random();
    int i = 30 + localRandom.nextInt(11);
    for (int j = 0; j < i; j++)
      localStringBuilder.append(a[localRandom.nextInt(a.length)]);
    return localStringBuilder.toString();
  }

  public final void a(String paramString, com.org.apache.http.entity.mime.a.a parama)
  {
    a locala = new a(paramString, parama);
    this.b.a(locala);
    this.e = true;
  }

  public final void consumeContent()
  {
    if (isStreaming())
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
  }

  public final InputStream getContent()
  {
    throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
  }

  public final Header getContentEncoding()
  {
    return null;
  }

  public final long getContentLength()
  {
    if (this.e)
    {
      this.d = this.b.b();
      this.e = false;
    }
    return this.d;
  }

  public final Header getContentType()
  {
    return this.c;
  }

  public final boolean isChunked()
  {
    return !isRepeatable();
  }

  public final boolean isRepeatable()
  {
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext())
      if (((a)localIterator.next()).a().d() < 0L)
        return false;
    return true;
  }

  public final boolean isStreaming()
  {
    return !isRepeatable();
  }

  public final void writeTo(OutputStream paramOutputStream)
  {
    this.b.a(paramOutputStream);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.g
 * JD-Core Version:    0.6.0
 */