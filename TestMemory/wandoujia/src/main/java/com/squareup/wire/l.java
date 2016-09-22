package com.squareup.wire;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class l
{
  private static final Charset a = Charset.forName("UTF-8");

  public static String a(byte[] paramArrayOfByte)
  {
    int i = 4 * (paramArrayOfByte.length / 3);
    if (paramArrayOfByte.length % 3 > 0)
      i += 4;
    n localn = new n(new byte[i]);
    localn.a(paramArrayOfByte, paramArrayOfByte.length);
    try
    {
      String str = new String(n.a(localn), "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return new String(n.a(localn));
  }

  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes(a);
    m localm = new m(new byte[3 * arrayOfByte1.length / 4]);
    if (!localm.a(arrayOfByte1, arrayOfByte1.length))
      throw new IllegalArgumentException("bad base-64");
    if (m.a(localm) == m.b(localm).length)
      return m.b(localm);
    byte[] arrayOfByte2 = new byte[m.a(localm)];
    System.arraycopy(m.b(localm), 0, arrayOfByte2, 0, m.a(localm));
    return arrayOfByte2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.l
 * JD-Core Version:    0.6.0
 */