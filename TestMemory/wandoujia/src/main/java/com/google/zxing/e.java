package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

public final class e
{
  private final String a;
  private final byte[] b;
  private f[] c;
  private final BarcodeFormat d;
  private Map<ResultMetadataType, Object> e;

  public e(String paramString, byte[] paramArrayOfByte, f[] paramArrayOff, BarcodeFormat paramBarcodeFormat)
  {
    this(paramString, paramArrayOfByte, paramArrayOff, paramBarcodeFormat, 0);
  }

  private e(String paramString, byte[] paramArrayOfByte, f[] paramArrayOff, BarcodeFormat paramBarcodeFormat, byte paramByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
    this.c = paramArrayOff;
    this.d = paramBarcodeFormat;
    this.e = null;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(ResultMetadataType paramResultMetadataType, Object paramObject)
  {
    if (this.e == null)
      this.e = new EnumMap(ResultMetadataType.class);
    this.e.put(paramResultMetadataType, paramObject);
  }

  public final void a(Map<ResultMetadataType, Object> paramMap)
  {
    if (paramMap != null)
    {
      if (this.e == null)
        this.e = paramMap;
    }
    else
      return;
    this.e.putAll(paramMap);
  }

  public final void a(f[] paramArrayOff)
  {
    f[] arrayOff1 = this.c;
    if (arrayOff1 == null)
      this.c = paramArrayOff;
    do
      return;
    while ((paramArrayOff == null) || (paramArrayOff.length <= 0));
    f[] arrayOff2 = new f[arrayOff1.length + paramArrayOff.length];
    System.arraycopy(arrayOff1, 0, arrayOff2, 0, arrayOff1.length);
    System.arraycopy(paramArrayOff, 0, arrayOff2, arrayOff1.length, paramArrayOff.length);
    this.c = arrayOff2;
  }

  public final byte[] b()
  {
    return this.b;
  }

  public final f[] c()
  {
    return this.c;
  }

  public final BarcodeFormat d()
  {
    return this.d;
  }

  public final Map<ResultMetadataType, Object> e()
  {
    return this.e;
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.e
 * JD-Core Version:    0.6.0
 */