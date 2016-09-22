package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.b.a;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

final class ad extends Drawable
  implements Animatable
{
  private static final Interpolator b = new LinearInterpolator();
  private static final Interpolator c = new a();
  boolean a;
  private final int[] d = { -16777216 };
  private final ArrayList<Animation> e = new ArrayList();
  private final ah f;
  private float g;
  private Resources h;
  private View i;
  private Animation j;
  private float k;
  private double l;
  private double m;
  private final Drawable.Callback n = new ag(this);

  public ad(Context paramContext, View paramView)
  {
    this.i = paramView;
    this.h = paramContext.getResources();
    this.f = new ah(this.n);
    this.f.a(this.d);
    a(1);
    ah localah = this.f;
    ae localae = new ae(this, localah);
    localae.setRepeatCount(-1);
    localae.setRepeatMode(1);
    localae.setInterpolator(b);
    localae.setAnimationListener(new af(this, localah));
    this.j = localae;
  }

  private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float paramFloat1, float paramFloat2)
  {
    ah localah = this.f;
    float f1 = this.h.getDisplayMetrics().density;
    this.l = (paramDouble1 * f1);
    this.m = (paramDouble2 * f1);
    localah.a(f1 * (float)paramDouble4);
    localah.a(paramDouble3 * f1);
    localah.c(0);
    localah.a(paramFloat1 * f1, f1 * paramFloat2);
    localah.a((int)this.l, (int)this.m);
  }

  private static float b(ah paramah)
  {
    return (float)Math.toRadians(paramah.d() / (6.283185307179586D * paramah.j()));
  }

  private static void c(float paramFloat, ah paramah)
  {
    if (paramFloat > 0.75F)
    {
      float f1 = (paramFloat - 0.75F) / 0.25F;
      int i1 = paramah.h();
      int i2 = paramah.a();
      int i3 = Integer.valueOf(i1).intValue();
      int i4 = 0xFF & i3 >> 24;
      int i5 = 0xFF & i3 >> 16;
      int i6 = 0xFF & i3 >> 8;
      int i7 = i3 & 0xFF;
      int i8 = Integer.valueOf(i2).intValue();
      int i9 = 0xFF & i8 >> 24;
      int i10 = 0xFF & i8 >> 16;
      int i11 = 0xFF & i8 >> 8;
      int i12 = i8 & 0xFF;
      paramah.b(i4 + (int)(f1 * (i9 - i4)) << 24 | i5 + (int)(f1 * (i10 - i5)) << 16 | i6 + (int)(f1 * (i11 - i6)) << 8 | i7 + (int)(f1 * (i12 - i7)));
    }
  }

  public final void a(float paramFloat)
  {
    this.f.e(paramFloat);
  }

  public final void a(int paramInt)
  {
    if (paramInt == 0)
    {
      a(56.0D, 56.0D, 12.5D, 3.0D, 12.0F, 6.0F);
      return;
    }
    a(40.0D, 40.0D, 8.75D, 2.5D, 10.0F, 5.0F);
  }

  public final void a(boolean paramBoolean)
  {
    this.f.a(paramBoolean);
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.f.a(paramArrayOfInt);
    this.f.c(0);
  }

  public final void b(float paramFloat)
  {
    this.f.b(0.0F);
    this.f.c(paramFloat);
  }

  public final void b(int paramInt)
  {
    this.f.a(paramInt);
  }

  public final void c(float paramFloat)
  {
    this.f.d(paramFloat);
  }

  final void d(float paramFloat)
  {
    this.g = paramFloat;
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.g, localRect.exactCenterX(), localRect.exactCenterY());
    this.f.a(paramCanvas, localRect);
    paramCanvas.restoreToCount(i1);
  }

  public final int getAlpha()
  {
    return this.f.c();
  }

  public final int getIntrinsicHeight()
  {
    return (int)this.m;
  }

  public final int getIntrinsicWidth()
  {
    return (int)this.l;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final boolean isRunning()
  {
    ArrayList localArrayList = this.e;
    int i1 = localArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Animation localAnimation = (Animation)localArrayList.get(i2);
      if ((localAnimation.hasStarted()) && (!localAnimation.hasEnded()))
        return true;
    }
    return false;
  }

  public final void setAlpha(int paramInt)
  {
    this.f.d(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.f.a(paramColorFilter);
  }

  public final void start()
  {
    this.j.reset();
    this.f.l();
    if (this.f.i() != this.f.e())
    {
      this.a = true;
      this.j.setDuration(666L);
      this.i.startAnimation(this.j);
      return;
    }
    this.f.c(0);
    this.f.m();
    this.j.setDuration(1332L);
    this.i.startAnimation(this.j);
  }

  public final void stop()
  {
    this.i.clearAnimation();
    d(0.0F);
    this.f.a(false);
    this.f.c(0);
    this.f.m();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ad
 * JD-Core Version:    0.6.0
 */