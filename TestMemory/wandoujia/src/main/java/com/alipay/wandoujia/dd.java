package com.alipay.wandoujia;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class dd extends Animation
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final boolean e;
  private Camera f;

  public dd(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = paramBoolean;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.a;
    float f2 = f1 + paramFloat * (this.b - f1);
    float f3 = this.c;
    float f4 = this.d;
    Camera localCamera = this.f;
    Matrix localMatrix = paramTransformation.getMatrix();
    localCamera.save();
    if (this.e)
      localCamera.translate(0.0F, 0.0F, 310.0F * paramFloat);
    while (true)
    {
      localCamera.rotateY(f2);
      localCamera.getMatrix(localMatrix);
      localCamera.restore();
      localMatrix.preTranslate(-f3, -f4);
      localMatrix.postTranslate(f3, f4);
      return;
      localCamera.translate(0.0F, 0.0F, 310.0F * (1.0F - paramFloat));
    }
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.f = new Camera();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.dd
 * JD-Core Version:    0.6.0
 */