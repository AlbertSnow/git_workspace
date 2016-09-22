package com.google.zxing.common;

public final class h
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  private final float f;
  private final float g;
  private final float h;
  private final float i;

  private h(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    this.a = paramFloat1;
    this.b = paramFloat4;
    this.c = paramFloat7;
    this.d = paramFloat2;
    this.e = paramFloat5;
    this.f = paramFloat8;
    this.g = paramFloat3;
    this.h = paramFloat6;
    this.i = paramFloat9;
  }

  private static h a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    float f1 = paramFloat5 + (paramFloat1 - paramFloat3) - paramFloat7;
    float f2 = paramFloat6 + (paramFloat2 - paramFloat4) - paramFloat8;
    if ((f1 == 0.0F) && (f2 == 0.0F))
      return new h(paramFloat3 - paramFloat1, paramFloat5 - paramFloat3, paramFloat1, paramFloat4 - paramFloat2, paramFloat6 - paramFloat4, paramFloat2, 0.0F, 0.0F, 1.0F);
    float f3 = paramFloat3 - paramFloat5;
    float f4 = paramFloat7 - paramFloat5;
    float f5 = paramFloat4 - paramFloat6;
    float f6 = paramFloat8 - paramFloat6;
    float f7 = f3 * f6 - f4 * f5;
    float f8 = (f6 * f1 - f4 * f2) / f7;
    float f9 = (f2 * f3 - f1 * f5) / f7;
    return new h(paramFloat3 - paramFloat1 + f8 * paramFloat3, paramFloat7 - paramFloat1 + f9 * paramFloat7, paramFloat1, paramFloat4 - paramFloat2 + f8 * paramFloat4, paramFloat8 - paramFloat2 + f9 * paramFloat8, paramFloat2, f8, f9, 1.0F);
  }

  public static h a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    h localh1 = a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    h localh2 = new h(localh1.e * localh1.i - localh1.f * localh1.h, localh1.f * localh1.g - localh1.d * localh1.i, localh1.d * localh1.h - localh1.e * localh1.g, localh1.c * localh1.h - localh1.b * localh1.i, localh1.a * localh1.i - localh1.c * localh1.g, localh1.b * localh1.g - localh1.a * localh1.h, localh1.b * localh1.f - localh1.c * localh1.e, localh1.c * localh1.d - localh1.a * localh1.f, localh1.a * localh1.e - localh1.b * localh1.d);
    h localh3 = a(paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16);
    h localh4 = new h(localh3.a * localh2.a + localh3.d * localh2.b + localh3.g * localh2.c, localh3.a * localh2.d + localh3.d * localh2.e + localh3.g * localh2.f, localh3.a * localh2.g + localh3.d * localh2.h + localh3.g * localh2.i, localh3.b * localh2.a + localh3.e * localh2.b + localh3.h * localh2.c, localh3.b * localh2.d + localh3.e * localh2.e + localh3.h * localh2.f, localh3.b * localh2.g + localh3.e * localh2.h + localh3.h * localh2.i, localh3.c * localh2.a + localh3.f * localh2.b + localh3.i * localh2.c, localh3.c * localh2.d + localh3.f * localh2.e + localh3.i * localh2.f, localh3.c * localh2.g + localh3.f * localh2.h + localh3.i * localh2.i);
    return localh4;
  }

  public final void a(float[] paramArrayOfFloat)
  {
    int j = paramArrayOfFloat.length;
    float f1 = this.a;
    float f2 = this.b;
    float f3 = this.c;
    float f4 = this.d;
    float f5 = this.e;
    float f6 = this.f;
    float f7 = this.g;
    float f8 = this.h;
    float f9 = this.i;
    for (int k = 0; k < j; k += 2)
    {
      float f10 = paramArrayOfFloat[k];
      float f11 = paramArrayOfFloat[(k + 1)];
      float f12 = f9 + (f3 * f10 + f6 * f11);
      paramArrayOfFloat[k] = ((f7 + (f1 * f10 + f4 * f11)) / f12);
      paramArrayOfFloat[(k + 1)] = ((f8 + (f10 * f2 + f11 * f5)) / f12);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.h
 * JD-Core Version:    0.6.0
 */