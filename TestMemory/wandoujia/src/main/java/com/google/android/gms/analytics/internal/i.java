package com.google.android.gms.analytics.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class i
{
  private int a;
  private ByteArrayOutputStream b = new ByteArrayOutputStream();

  public i(h paramh)
  {
  }

  public final int a()
  {
    return this.a;
  }

  public final boolean a(d paramd)
  {
    android.support.v4.app.d.a(paramd);
    if (1 + this.a > as.g())
      return false;
    String str = this.c.a(paramd, false);
    if (str == null)
    {
      this.c.l().a(paramd, "Error formatting hit");
      return true;
    }
    byte[] arrayOfByte = str.getBytes();
    int i = arrayOfByte.length;
    if (i > as.c())
    {
      this.c.l().a(paramd, "Hit size exceeds the maximum size limit");
      return true;
    }
    if (this.b.size() > 0)
      i++;
    if (i + this.b.size() > ((Integer)az.t.a()).intValue())
      return false;
    try
    {
      if (this.b.size() > 0)
        this.b.write(h.c());
      this.b.write(arrayOfByte);
      this.a = (1 + this.a);
      return true;
    }
    catch (IOException localIOException)
    {
      this.c.e("Failed to write payload when batching hits", localIOException);
    }
    return true;
  }

  public final byte[] b()
  {
    return this.b.toByteArray();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.i
 * JD-Core Version:    0.6.0
 */