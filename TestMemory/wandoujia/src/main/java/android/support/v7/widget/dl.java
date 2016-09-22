package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class dl extends Animation
{
  dl(SwitchCompat paramSwitchCompat, float paramFloat1, float paramFloat2)
  {
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwitchCompat.a(this.c, this.a + paramFloat * this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.dl
 * JD-Core Version:    0.6.0
 */