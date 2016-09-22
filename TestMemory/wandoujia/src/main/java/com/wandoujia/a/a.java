package com.wandoujia.a;

import android.text.TextUtils;
import java.util.zip.CRC32;

public final class a
{
  private String a;
  private int b;
  private char c;
  private int d;
  private String e;

  public static a a(byte[] paramArrayOfByte)
  {
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(new String(paramArrayOfByte, 0, 12).getBytes());
    String str = new String(paramArrayOfByte, 12, 4);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(localCRC32.getValue() % ()Math.pow(10.0D, 4.0D));
    if (!TextUtils.equals(str, String.format("%04d", arrayOfObject)))
      return null;
    try
    {
      a locala = new a();
      locala.a = new String(paramArrayOfByte, 0, 3);
      locala.b = Integer.valueOf(new String(paramArrayOfByte, 3, 2)).intValue();
      locala.c = (char)paramArrayOfByte[5];
      locala.d = Integer.valueOf(new String(paramArrayOfByte, 6, 6), 16).intValue();
      locala.e = new String(paramArrayOfByte, 12, 4);
      return locala;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  public final String a()
  {
    return this.a;
  }

  public final char b()
  {
    return this.c;
  }

  public final int c()
  {
    return this.d;
  }

  public final String toString()
  {
    return "HeaderModel{scheme='" + this.a + '\'' + ", version=" + this.b + ", format=" + this.c + ", length=" + this.d + ", sign='" + this.e + '\'' + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.a.a
 * JD-Core Version:    0.6.0
 */