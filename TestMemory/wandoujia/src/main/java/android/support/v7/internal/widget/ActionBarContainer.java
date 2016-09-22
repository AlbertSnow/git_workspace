package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout
{
  Drawable a;
  Drawable b;
  Drawable c;
  boolean d;
  boolean e;
  private boolean f;
  private View g;
  private View h;
  private View i;
  private int j;

  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int k;
    Object localObject;
    label30: boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      k = 1;
      if (k == 0)
        break label144;
      localObject = new f(this);
      setBackgroundDrawable((Drawable)localObject);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ActionBar);
      this.a = localTypedArray.getDrawable(R.styleable.ActionBar_background);
      this.b = localTypedArray.getDrawable(R.styleable.ActionBar_backgroundStacked);
      this.j = localTypedArray.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
      if (getId() == R.id.split_action_bar)
      {
        this.d = true;
        this.c = localTypedArray.getDrawable(R.styleable.ActionBar_backgroundSplit);
      }
      localTypedArray.recycle();
      if (!this.d)
        break label163;
      if (this.c != null)
        break label157;
      bool = true;
    }
    while (true)
    {
      setWillNotDraw(bool);
      return;
      k = 0;
      break;
      label144: localObject = new e(this);
      break label30;
      label157: bool = false;
      continue;
      label163: if ((this.a == null) && (this.b == null))
      {
        bool = true;
        continue;
      }
      bool = false;
    }
  }

  private static boolean a(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }

  private static int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.a != null) && (this.a.isStateful()))
      this.a.setState(getDrawableState());
    if ((this.b != null) && (this.b.isStateful()))
      this.b.setState(getDrawableState());
    if ((this.c != null) && (this.c.isStateful()))
      this.c.setState(getDrawableState());
  }

  public View getTabContainer()
  {
    return this.g;
  }

  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null)
        this.a.jumpToCurrentState();
      if (this.b != null)
        this.b.jumpToCurrentState();
      if (this.c != null)
        this.c.jumpToCurrentState();
    }
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.h = findViewById(R.id.action_bar);
    this.i = findViewById(R.id.action_context_bar);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.f) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.g;
    boolean bool2;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      bool2 = bool1;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        int k = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, k - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, k - localLayoutParams.bottomMargin);
      }
      if (!this.d)
        break label147;
      if (this.c == null)
        break label333;
      this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    while (true)
    {
      if (bool1)
        invalidate();
      return;
      bool2 = false;
      break;
      label147: if (this.a != null)
        if (this.h.getVisibility() == 0)
          this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
      label199: for (boolean bool3 = bool1; ; bool3 = false)
      {
        this.e = bool2;
        if ((bool2) && (this.b != null))
        {
          this.b.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          break;
          if ((this.i != null) && (this.i.getVisibility() == 0))
          {
            this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            break label199;
          }
          this.a.setBounds(0, 0, 0, 0);
          break label199;
        }
        bool1 = bool3;
        break;
      }
      label333: bool1 = false;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.h == null) && (View.MeasureSpec.getMode(paramInt2) == -2147483648) && (this.j >= 0))
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), -2147483648);
    super.onMeasure(paramInt1, paramInt2);
    if (this.h == null);
    int k;
    do
    {
      return;
      k = View.MeasureSpec.getMode(paramInt2);
    }
    while ((this.g == null) || (this.g.getVisibility() == 8) || (k == 1073741824));
    int m;
    if (!a(this.h))
    {
      m = b(this.h);
      if (k != -2147483648)
        break label167;
    }
    label167: for (int n = View.MeasureSpec.getSize(paramInt2); ; n = 2147483647)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(m + b(this.g), n));
      return;
      if (!a(this.i))
      {
        m = b(this.i);
        break;
      }
      m = 0;
      break;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.a != null)
    {
      this.a.setCallback(null);
      unscheduleDrawable(this.a);
    }
    this.a = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.h != null)
        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
    }
    if (this.d)
      if (this.c != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a == null) && (this.b == null))
        continue;
      bool = false;
    }
  }

  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.c != null)
    {
      this.c.setCallback(null);
      unscheduleDrawable(this.c);
    }
    this.c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.d) && (this.c != null))
        this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    if (this.d)
      if (this.c != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a == null) && (this.b == null))
        continue;
      bool = false;
    }
  }

  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.b != null)
    {
      this.b.setCallback(null);
      unscheduleDrawable(this.b);
    }
    this.b = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.e) && (this.b != null))
        this.b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
    }
    if (this.d)
      if (this.c != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a == null) && (this.b == null))
        continue;
      bool = false;
    }
  }

  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.g != null)
      removeView(this.g);
    this.g = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      ViewGroup.LayoutParams localLayoutParams = paramScrollingTabContainerView.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramScrollingTabContainerView.setAllowCollapse(false);
    }
  }

  public void setTransitioning(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (paramBoolean);
    for (int k = 393216; ; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (this.a != null)
        this.a.setVisible(bool, false);
      if (this.b != null)
        this.b.setVisible(bool, false);
      if (this.c != null)
        this.c.setVisible(bool, false);
      return;
    }
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.a) && (!this.d)) || ((paramDrawable == this.b) && (this.e)) || ((paramDrawable == this.c) && (this.d)) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.6.0
 */