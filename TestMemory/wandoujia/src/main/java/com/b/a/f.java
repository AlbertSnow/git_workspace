package com.b.a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class f
{
  private final String a;
  private final long[] b;
  private boolean c;
  private d d;
  private long e;

  private f(a parama, String paramString)
  {
    this.a = paramString;
    this.b = new long[a.c()];
  }

  private static IOException a(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }

  public final File a(int paramInt)
  {
    return new File(a.f(this.f), this.a + ".0");
  }

  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.b)
      localStringBuilder.append(' ').append(l);
    return localStringBuilder.toString();
  }

  public final File b(int paramInt)
  {
    return new File(a.f(this.f), this.a + ".0" + ".tmp");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.f
 * JD-Core Version:    0.6.0
 */