package com.b.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class e extends FilterOutputStream
{
  private e(d paramd, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  public final void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      d.c(this.a);
    }
  }

  public final void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      d.c(this.a);
    }
  }

  public final void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      d.c(this.a);
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      d.c(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.e
 * JD-Core Version:    0.6.0
 */