package com.android.volley.toolbox;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class e extends FilterInputStream
{
  public int a = 0;

  public e(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public final int read()
  {
    int i = super.read();
    if (i != -1)
      this.a = (1 + this.a);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i != -1)
      this.a = (i + this.a);
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.e
 * JD-Core Version:    0.6.0
 */