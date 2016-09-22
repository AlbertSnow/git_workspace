package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat$12 extends IntProperty<View>
{
  public final Integer get(View paramView)
  {
    return Integer.valueOf(AnimatorProxy.wrap(paramView).getScrollY());
  }

  public final void setValue(View paramView, int paramInt)
  {
    AnimatorProxy.wrap(paramView).setScrollY(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.animation.PreHoneycombCompat.12
 * JD-Core Version:    0.6.0
 */