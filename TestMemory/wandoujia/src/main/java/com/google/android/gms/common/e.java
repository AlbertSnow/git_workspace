package com.google.android.gms.common;

import android.support.v4.app.d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class e
{
  private int a;

  protected e(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 25);
    for (boolean bool = true; ; bool = false)
    {
      d.b(bool, "cert hash data has incorrect length");
      this.a = Arrays.hashCode(paramArrayOfByte);
      return;
    }
  }

  protected static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError(localUnsupportedEncodingException);
  }

  abstract byte[] a();

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof e)))
      return false;
    e locale = (e)paramObject;
    return Arrays.equals(a(), locale.a());
  }

  public int hashCode()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.e
 * JD-Core Version:    0.6.0
 */