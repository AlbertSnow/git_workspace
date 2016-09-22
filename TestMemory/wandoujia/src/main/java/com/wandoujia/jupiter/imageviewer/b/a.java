package com.wandoujia.jupiter.imageviewer.b;

import android.annotation.TargetApi;
import android.support.v4.view.cl;
import android.view.View;
import com.nineoldandroids.view.ViewHelper;

@TargetApi(11)
public final class a
  implements cl
{
  private static float a = 0.6F;

  public final void a(View paramView, float paramFloat)
  {
    int i = paramView.getWidth();
    if (paramFloat >= -1.0F)
    {
      if (paramFloat <= 0.0F)
      {
        ViewHelper.setAlpha(paramView, 1.0F);
        ViewHelper.setTranslationX(paramView, 0.0F);
        ViewHelper.setScaleX(paramView, 1.0F);
        ViewHelper.setScaleY(paramView, 1.0F);
        return;
      }
      if (paramFloat <= 1.0F)
      {
        ViewHelper.setAlpha(paramView, 1.0F - paramFloat);
        ViewHelper.setTranslationX(paramView, i * -paramFloat);
        float f = a + (1.0F - a) * (1.0F - Math.abs(paramFloat));
        ViewHelper.setScaleY(paramView, f);
        ViewHelper.setScaleY(paramView, f);
        return;
      }
    }
    ViewHelper.setAlpha(paramView, 0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.b.a
 * JD-Core Version:    0.6.0
 */