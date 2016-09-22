package com.tencent.open.a;

import java.io.File;

public final class d
{
  private File a;
  private long b;
  private long c;

  public final long a()
  {
    return this.c;
  }

  public final void a(long paramLong)
  {
    this.b = paramLong;
  }

  public final void a(File paramFile)
  {
    this.a = paramFile;
  }

  public final void b(long paramLong)
  {
    this.c = paramLong;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.a.getAbsolutePath();
    arrayOfObject[1] = Long.valueOf(this.c);
    arrayOfObject[2] = Long.valueOf(this.b);
    return String.format("[%s : %d / %d]", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.d
 * JD-Core Version:    0.6.0
 */