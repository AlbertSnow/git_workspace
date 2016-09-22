package com.b.a;

import java.io.Closeable;
import java.io.InputStream;

public final class g
  implements Closeable
{
  private final InputStream[] a;

  private g(InputStream[] paramArrayOfInputStream)
  {
    this.a = paramArrayOfInputStream;
  }

  public final InputStream a()
  {
    return this.a[0];
  }

  public final void close()
  {
    InputStream[] arrayOfInputStream = this.a;
    int i = arrayOfInputStream.length;
    for (int j = 0; j < i; j++)
      j.a(arrayOfInputStream[j]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.g
 * JD-Core Version:    0.6.0
 */