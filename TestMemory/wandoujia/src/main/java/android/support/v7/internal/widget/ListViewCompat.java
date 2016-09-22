package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
  private Rect a = new Rect();
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private Field f;
  private ae g;

  static
  {
    new int[] { 0 };
  }

  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      this.f = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.f.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
    }
  }

  protected final void a(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    Drawable localDrawable1 = getSelector();
    boolean bool2;
    if ((localDrawable1 != null) && (paramInt != -1))
      bool2 = bool1;
    while (true)
    {
      if (bool2)
        localDrawable1.setVisible(false, false);
      Rect localRect1 = this.a;
      localRect1.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      localRect1.left -= this.b;
      localRect1.top -= this.c;
      localRect1.right += this.d;
      localRect1.bottom += this.e;
      try
      {
        boolean bool3 = this.f.getBoolean(this);
        boolean bool4;
        if (paramView.isEnabled() != bool3)
        {
          Field localField = this.f;
          if (bool3)
            break label258;
          bool4 = bool1;
          label157: localField.set(this, Boolean.valueOf(bool4));
          if (paramInt != -1)
            refreshDrawableState();
        }
        label177: float f1;
        float f2;
        if (bool2)
        {
          Rect localRect2 = this.a;
          f1 = localRect2.exactCenterX();
          f2 = localRect2.exactCenterY();
          if (getVisibility() != 0)
            break label264;
        }
        while (true)
        {
          localDrawable1.setVisible(bool1, false);
          a.a(localDrawable1, f1, f2);
          Drawable localDrawable2 = getSelector();
          if ((localDrawable2 != null) && (paramInt != -1))
            a.a(localDrawable2, paramFloat1, paramFloat2);
          return;
          bool2 = false;
          break;
          label258: bool4 = false;
          break label157;
          label264: bool1 = false;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label177;
      }
    }
  }

  protected boolean a()
  {
    return false;
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!this.a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.a);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }

  protected void drawableStateChanged()
  {
    boolean bool = true;
    super.drawableStateChanged();
    setSelectorEnabled(bool);
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
      if ((!a()) || (!isPressed()))
        break label48;
    while (true)
    {
      if (bool)
        localDrawable.setState(getDrawableState());
      return;
      label48: bool = false;
    }
  }

  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null);
    for (ae localae = new ae(paramDrawable); ; localae = null)
    {
      this.g = localae;
      super.setSelector(this.g);
      Rect localRect = new Rect();
      if (paramDrawable != null)
        paramDrawable.getPadding(localRect);
      this.b = localRect.left;
      this.c = localRect.top;
      this.d = localRect.right;
      this.e = localRect.bottom;
      return;
    }
  }

  protected void setSelectorEnabled(boolean paramBoolean)
  {
    if (this.g != null)
      this.g.a(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ListViewCompat
 * JD-Core Version:    0.6.0
 */