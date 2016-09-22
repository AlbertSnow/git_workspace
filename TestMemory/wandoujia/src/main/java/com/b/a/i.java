package com.b.a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class i extends ByteArrayOutputStream
{
  i(h paramh, int paramInt)
  {
    super(paramInt);
  }

  public final String toString()
  {
    int i;
    if ((this.count > 0) && (this.buf[(-1 + this.count)] == 13))
      i = -1 + this.count;
    try
    {
      while (true)
      {
        String str = new String(this.buf, 0, i, h.a(this.a).name());
        return str;
        i = this.count;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError(localUnsupportedEncodingException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.b.a.i
 * JD-Core Version:    0.6.0
 */