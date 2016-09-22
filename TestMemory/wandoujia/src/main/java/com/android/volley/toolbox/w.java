package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

public final class w extends ByteArrayOutputStream
{
  private final b a;

  public w(b paramb, int paramInt)
  {
    this.a = paramb;
    this.buf = this.a.a(Math.max(paramInt, 256));
  }

  private void a(int paramInt)
  {
    if (paramInt + this.count <= this.buf.length)
      return;
    byte[] arrayOfByte = this.a.a(2 * (paramInt + this.count));
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.a.a(this.buf);
    this.buf = arrayOfByte;
  }

  public final void close()
  {
    this.a.a(this.buf);
    this.buf = null;
    super.close();
  }

  public final void finalize()
  {
    this.a.a(this.buf);
  }

  public final void write(int paramInt)
  {
    monitorenter;
    try
    {
      a(1);
      super.write(paramInt);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    monitorenter;
    try
    {
      a(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.w
 * JD-Core Version:    0.6.0
 */