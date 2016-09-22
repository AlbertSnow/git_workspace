package com.google.zxing.qrcode.detector;

import com.google.zxing.f;

public final class a extends f
{
  private final float a;

  a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramFloat1, paramFloat2);
    this.a = paramFloat3;
  }

  final boolean a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = Math.abs(paramFloat2 - b()) < paramFloat1;
    int i = 0;
    if (!bool1)
    {
      boolean bool2 = Math.abs(paramFloat3 - a()) < paramFloat1;
      i = 0;
      if (!bool2)
      {
        float f = Math.abs(paramFloat1 - this.a);
        if (f > 1.0F)
        {
          boolean bool3 = f < this.a;
          i = 0;
          if (bool3);
        }
        else
        {
          i = 1;
        }
      }
    }
    return i;
  }

  final a b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return new a((paramFloat2 + a()) / 2.0F, (paramFloat1 + b()) / 2.0F, (paramFloat3 + this.a) / 2.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.a
 * JD-Core Version:    0.6.0
 */