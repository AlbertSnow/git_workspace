package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class i extends Drawable
  implements Drawable.Callback, h
{
  private static PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  Drawable a;
  private ColorStateList c;
  private PorterDuff.Mode d = b;
  private int e;
  private PorterDuff.Mode f;
  private boolean g;

  i(Drawable paramDrawable)
  {
    a(paramDrawable);
  }

  private boolean a(int[] paramArrayOfInt)
  {
    if ((this.c != null) && (this.d != null))
    {
      int i = this.c.getColorForState(paramArrayOfInt, this.c.getDefaultColor());
      PorterDuff.Mode localMode = this.d;
      if ((!this.g) || (i != this.e) || (localMode != this.f))
      {
        setColorFilter(i, localMode);
        this.e = i;
        this.f = localMode;
        this.g = true;
        return true;
      }
    }
    return false;
  }

  public final Drawable a()
  {
    return this.a;
  }

  public final void a(Drawable paramDrawable)
  {
    if (this.a != null)
      this.a.setCallback(null);
    this.a = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    invalidateSelf();
  }

  public void draw(Canvas paramCanvas)
  {
    this.a.draw(paramCanvas);
  }

  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }

  public Drawable getCurrent()
  {
    return this.a.getCurrent();
  }

  public int getIntrinsicHeight()
  {
    return this.a.getIntrinsicHeight();
  }

  public int getIntrinsicWidth()
  {
    return this.a.getIntrinsicWidth();
  }

  public int getMinimumHeight()
  {
    return this.a.getMinimumHeight();
  }

  public int getMinimumWidth()
  {
    return this.a.getMinimumWidth();
  }

  public int getOpacity()
  {
    return this.a.getOpacity();
  }

  public boolean getPadding(Rect paramRect)
  {
    return this.a.getPadding(paramRect);
  }

  public int[] getState()
  {
    return this.a.getState();
  }

  public Region getTransparentRegion()
  {
    return this.a.getTransparentRegion();
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }

  public boolean isStateful()
  {
    return ((this.c != null) && (this.c.isStateful())) || (this.a.isStateful());
  }

  public Drawable mutate()
  {
    Drawable localDrawable1 = this.a;
    Drawable localDrawable2 = localDrawable1.mutate();
    if (localDrawable2 != localDrawable1)
      a(localDrawable2);
    return this;
  }

  protected void onBoundsChange(Rect paramRect)
  {
    this.a.setBounds(paramRect);
  }

  protected boolean onLevelChange(int paramInt)
  {
    return this.a.setLevel(paramInt);
  }

  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }

  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }

  public void setChangingConfigurations(int paramInt)
  {
    this.a.setChangingConfigurations(paramInt);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }

  public void setDither(boolean paramBoolean)
  {
    this.a.setDither(paramBoolean);
  }

  public void setFilterBitmap(boolean paramBoolean)
  {
    this.a.setFilterBitmap(paramBoolean);
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.a.setState(paramArrayOfInt);
    return (a(paramArrayOfInt)) || (bool);
  }

  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }

  public void setTintList(ColorStateList paramColorStateList)
  {
    this.c = paramColorStateList;
    a(getState());
  }

  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.d = paramMode;
    a(getState());
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (super.setVisible(paramBoolean1, paramBoolean2)) || (this.a.setVisible(paramBoolean1, paramBoolean2));
  }

  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.i
 * JD-Core Version:    0.6.0
 */