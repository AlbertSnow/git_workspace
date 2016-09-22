package com.wandoujia.plugin.qr.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.zxing.c;

public final class f extends c
{
  private final byte[] a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;

  public f(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt5, paramInt6);
    if ((paramInt3 + paramInt5 > paramInt1) || (paramInt4 + paramInt6 > paramInt2))
      throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }

  public final byte[] a()
  {
    int i = 0;
    int j = b();
    int k = c();
    byte[] arrayOfByte1;
    if ((j == this.b) && (k == this.c))
      arrayOfByte1 = this.a;
    while (true)
    {
      return arrayOfByte1;
      int m = j * k;
      arrayOfByte1 = new byte[m];
      int n = this.e * this.b + this.d;
      if (j == this.b)
      {
        System.arraycopy(this.a, n, arrayOfByte1, 0, m);
        return arrayOfByte1;
      }
      byte[] arrayOfByte2 = this.a;
      while (i < k)
      {
        System.arraycopy(arrayOfByte2, n, arrayOfByte1, i * j, j);
        n += this.b;
        i++;
      }
    }
  }

  public final byte[] a(int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramInt < 0) || (paramInt >= c()))
      throw new IllegalArgumentException("Requested row is outside the image: " + paramInt);
    int i = b();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < i))
      paramArrayOfByte = new byte[i];
    int j = (paramInt + this.e) * this.b + this.d;
    System.arraycopy(this.a, j, paramArrayOfByte, 0, i);
    return paramArrayOfByte;
  }

  public final Bitmap d()
  {
    int i = b();
    int j = c();
    int[] arrayOfInt = new int[i * j];
    byte[] arrayOfByte = this.a;
    int k = this.e * this.b + this.d;
    int m = 0;
    int n = k;
    while (m < j)
    {
      int i1 = m * i;
      for (int i2 = 0; i2 < i; i2++)
      {
        int i3 = 0xFF & arrayOfByte[(n + i2)];
        arrayOfInt[(i1 + i2)] = (0xFF000000 | i3 * 65793);
      }
      n += this.b;
      m++;
    }
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    localBitmap.setPixels(arrayOfInt, 0, i, 0, 0, i, j);
    return localBitmap;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a.f
 * JD-Core Version:    0.6.0
 */