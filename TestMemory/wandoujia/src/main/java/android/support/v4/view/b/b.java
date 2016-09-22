package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class b
  implements Interpolator
{
  private final float[] a;
  private final float b;

  public b(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
    this.b = (1.0F / (-1 + this.a.length));
  }

  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F)
      return 1.0F;
    if (paramFloat <= 0.0F)
      return 0.0F;
    int i = Math.min((int)(paramFloat * (-1 + this.a.length)), -2 + this.a.length);
    float f = (paramFloat - i * this.b) / this.b;
    return this.a[i] + f * (this.a[(i + 1)] - this.a[i]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.b.b
 * JD-Core Version:    0.6.0
 */