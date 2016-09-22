package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat$10 extends FloatProperty<View>
{
  public final Float get(View paramView)
  {
    return Float.valueOf(AnimatorProxy.wrap(paramView).getScaleY());
  }

  public final void setValue(View paramView, float paramFloat)
  {
    AnimatorProxy.wrap(paramView).setScaleY(paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.animation.PreHoneycombCompat.10
 * JD-Core Version:    0.6.0
 */