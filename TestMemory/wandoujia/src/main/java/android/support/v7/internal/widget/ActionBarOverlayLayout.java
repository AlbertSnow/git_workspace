package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ar;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v4.view.dh;
import android.support.v4.widget.ao;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import com.google.android.gms.common.internal.p;

public class ActionBarOverlayLayout extends ViewGroup
  implements ar, z
{
  private static int[] C;
  private final Runnable A = new j(this);
  private final Runnable B = new k(this);
  private final p D;
  private int a;
  private int b = 0;
  private ContentFrameLayout c;
  private ActionBarContainer d;
  private ActionBarContainer e;
  private aa f;
  private Drawable g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private final Rect o = new Rect();
  private final Rect p = new Rect();
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private l u;
  private ao v;
  private cu w;
  private cu x;
  private final dh y = new h(this);
  private final dh z = new i(this);

  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = R.attr.actionBarSize;
    arrayOfInt[1] = 16842841;
    C = arrayOfInt;
  }

  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.D = new p();
  }

  private void a(Context paramContext)
  {
    int i1 = 1;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(C);
    this.a = localTypedArray.getDimensionPixelSize(0, 0);
    this.g = localTypedArray.getDrawable(i1);
    if (this.g == null)
    {
      int i2 = i1;
      setWillNotDraw(i2);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19)
        break label87;
    }
    while (true)
    {
      this.h = i1;
      this.v = ao.a(paramContext);
      return;
      int i3 = 0;
      break;
      label87: i1 = 0;
    }
  }

  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    ActionBarOverlayLayout.LayoutParams localLayoutParams = (ActionBarOverlayLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = localLayoutParams.leftMargin;
    int i2 = paramRect.left;
    int i3 = 0;
    if (i1 != i2)
    {
      localLayoutParams.leftMargin = paramRect.left;
      i3 = 1;
    }
    if ((paramBoolean1) && (localLayoutParams.topMargin != paramRect.top))
    {
      localLayoutParams.topMargin = paramRect.top;
      i3 = 1;
    }
    if (localLayoutParams.rightMargin != paramRect.right)
    {
      localLayoutParams.rightMargin = paramRect.right;
      i3 = 1;
    }
    if ((paramBoolean2) && (localLayoutParams.bottomMargin != paramRect.bottom))
    {
      localLayoutParams.bottomMargin = paramRect.bottom;
      return true;
    }
    return i3;
  }

  private void i()
  {
    View localView;
    if (this.c == null)
    {
      this.c = ((ContentFrameLayout)findViewById(R.id.action_bar_activity_content));
      this.e = ((ActionBarContainer)findViewById(R.id.action_bar_container));
      localView = findViewById(R.id.action_bar);
      if (!(localView instanceof aa))
        break label75;
    }
    for (aa localaa = (aa)localView; ; localaa = ((Toolbar)localView).getWrapper())
    {
      this.f = localaa;
      this.d = ((ActionBarContainer)findViewById(R.id.split_action_bar));
      return;
      label75: if (!(localView instanceof Toolbar))
        break;
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localView.getClass().getSimpleName());
  }

  private void j()
  {
    removeCallbacks(this.A);
    removeCallbacks(this.B);
    if (this.w != null)
      this.w.c();
    if (this.x != null)
      this.x.c();
  }

  public final void a(int paramInt)
  {
    i();
    setOverlayMode(true);
  }

  public final void a(Menu paramMenu, y paramy)
  {
    i();
    this.f.a(paramMenu, paramy);
  }

  public final boolean a()
  {
    return this.i;
  }

  public final boolean b()
  {
    i();
    return this.f.f();
  }

  public final boolean c()
  {
    i();
    return this.f.g();
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionBarOverlayLayout.LayoutParams;
  }

  public final boolean d()
  {
    i();
    return this.f.h();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.g != null) && (!this.h))
      if (this.e.getVisibility() != 0)
        break label82;
    label82: for (int i1 = (int)(0.5F + (this.e.getBottom() + bg.n(this.e))); ; i1 = 0)
    {
      this.g.setBounds(0, i1, getWidth(), i1 + this.g.getIntrinsicHeight());
      this.g.draw(paramCanvas);
      return;
    }
  }

  public final boolean e()
  {
    i();
    return this.f.i();
  }

  public final boolean f()
  {
    i();
    return this.f.j();
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    i();
    bg.v(this);
    boolean bool = a(this.e, paramRect, true, false);
    if (this.d != null)
      bool |= a(this.d, paramRect, false, true);
    this.r.set(paramRect);
    ba.a(this, this.r, this.o);
    if (!this.p.equals(this.o))
    {
      this.p.set(this.o);
      bool = true;
    }
    if (bool)
      requestLayout();
    return true;
  }

  public final void g()
  {
    i();
    this.f.k();
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ActionBarOverlayLayout.LayoutParams(paramLayoutParams);
  }

  public int getActionBarHideOffset()
  {
    if (this.e != null)
      return -(int)bg.n(this.e);
    return 0;
  }

  public int getNestedScrollAxes()
  {
    return this.D.a();
  }

  public CharSequence getTitle()
  {
    i();
    return this.f.e();
  }

  public final void h()
  {
    i();
    this.f.l();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    bg.w(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    j();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = getPaddingLeft();
    getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = paramInt4 - paramInt2 - getPaddingBottom();
    int i5 = 0;
    if (i5 < i1)
    {
      View localView = getChildAt(i5);
      ActionBarOverlayLayout.LayoutParams localLayoutParams;
      int i6;
      int i7;
      int i8;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (ActionBarOverlayLayout.LayoutParams)localView.getLayoutParams();
        i6 = localView.getMeasuredWidth();
        i7 = localView.getMeasuredHeight();
        i8 = i2 + localLayoutParams.leftMargin;
        if (localView != this.d)
          break label143;
      }
      label143: for (int i9 = i4 - i7 - localLayoutParams.bottomMargin; ; i9 = i3 + localLayoutParams.topMargin)
      {
        localView.layout(i8, i9, i6 + i8, i7 + i9);
        i5++;
        break;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    i();
    measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
    ActionBarOverlayLayout.LayoutParams localLayoutParams1 = (ActionBarOverlayLayout.LayoutParams)this.e.getLayoutParams();
    int i1 = Math.max(0, this.e.getMeasuredWidth() + localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
    int i2 = Math.max(0, this.e.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin);
    int i3 = ba.a(0, bg.l(this.e));
    if (this.d != null)
    {
      measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
      ActionBarOverlayLayout.LayoutParams localLayoutParams3 = (ActionBarOverlayLayout.LayoutParams)this.d.getLayoutParams();
      int i11 = Math.max(i1, this.d.getMeasuredWidth() + localLayoutParams3.leftMargin + localLayoutParams3.rightMargin);
      int i12 = Math.max(i2, this.d.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin);
      i3 = ba.a(i3, bg.l(this.d));
      i1 = i11;
      i2 = i12;
    }
    int i4;
    int i5;
    if ((0x100 & bg.v(this)) != 0)
    {
      i4 = 1;
      if (i4 == 0)
        break label525;
      i5 = this.a;
      if ((this.j) && (this.e.getTabContainer() != null))
        i5 += this.a;
    }
    while (true)
    {
      label242: this.q.set(this.o);
      this.s.set(this.r);
      Rect localRect4;
      if ((!this.i) && (i4 == 0))
      {
        Rect localRect3 = this.q;
        localRect3.top = (i5 + localRect3.top);
        localRect4 = this.q;
      }
      label525: Rect localRect2;
      for (localRect4.bottom = (0 + localRect4.bottom); ; localRect2.bottom = (0 + localRect2.bottom))
      {
        a(this.c, this.q, true, true);
        if (!this.t.equals(this.s))
        {
          this.t.set(this.s);
          this.c.a(this.s);
        }
        measureChildWithMargins(this.c, paramInt1, 0, paramInt2, 0);
        ActionBarOverlayLayout.LayoutParams localLayoutParams2 = (ActionBarOverlayLayout.LayoutParams)this.c.getLayoutParams();
        int i6 = Math.max(i1, this.c.getMeasuredWidth() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin);
        int i7 = Math.max(i2, this.c.getMeasuredHeight() + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin);
        int i8 = ba.a(i3, bg.l(this.c));
        int i9 = i6 + (getPaddingLeft() + getPaddingRight());
        int i10 = Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(bg.a(Math.max(i9, getSuggestedMinimumWidth()), paramInt1, i8), bg.a(i10, paramInt2, i8 << 16));
        return;
        i4 = 0;
        break;
        if (this.e.getVisibility() == 8)
          break label589;
        i5 = this.e.getMeasuredHeight();
        break label242;
        Rect localRect1 = this.s;
        localRect1.top = (i5 + localRect1.top);
        localRect2 = this.s;
      }
      label589: i5 = 0;
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((!this.k) || (!paramBoolean))
      return false;
    this.v.a(0, (int)paramFloat2, 0, 0);
    int i1 = this.v.e();
    int i2 = this.e.getHeight();
    int i3 = 0;
    if (i1 > i2)
      i3 = 1;
    if (i3 != 0)
    {
      j();
      this.B.run();
    }
    while (true)
    {
      this.l = true;
      return true;
      j();
      this.A.run();
    }
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = (paramInt2 + this.m);
    setActionBarHideOffset(this.m);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.D.a(paramInt);
    this.m = getActionBarHideOffset();
    j();
    if (this.u != null)
      this.u.g();
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.e.getVisibility() != 0))
      return false;
    return this.k;
  }

  public void onStopNestedScroll(View paramView)
  {
    if ((this.k) && (!this.l))
    {
      if (this.m <= this.e.getHeight())
      {
        j();
        postDelayed(this.A, 600L);
      }
    }
    else
      return;
    j();
    postDelayed(this.B, 600L);
  }

  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool1 = true;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt);
    i();
    int i1 = paramInt ^ this.n;
    this.n = paramInt;
    boolean bool2;
    boolean bool3;
    if ((paramInt & 0x4) == 0)
    {
      bool2 = bool1;
      if ((paramInt & 0x100) == 0)
        break label122;
      bool3 = bool1;
      label51: if (this.u != null)
      {
        l locall = this.u;
        if (bool3)
          break label128;
        label69: locall.d(bool1);
        if ((!bool2) && (bool3))
          break label133;
        this.u.e();
      }
    }
    while (true)
    {
      if (((i1 & 0x100) != 0) && (this.u != null))
        bg.w(this);
      return;
      bool2 = false;
      break;
      label122: bool3 = false;
      break label51;
      label128: bool1 = false;
      break label69;
      label133: this.u.f();
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.b = paramInt;
    if (this.u != null)
      this.u.a(paramInt);
  }

  public void setActionBarHideOffset(int paramInt)
  {
    j();
    int i1 = this.e.getHeight();
    int i2 = Math.max(0, Math.min(paramInt, i1));
    bg.b(this.e, -i2);
    if ((this.d != null) && (this.d.getVisibility() != 8))
    {
      int i3 = (int)(i2 / i1 * this.d.getHeight());
      bg.b(this.d, i3);
    }
  }

  public void setActionBarVisibilityCallback(l paraml)
  {
    this.u = paraml;
    if (getWindowToken() != null)
    {
      this.u.a(this.b);
      if (this.n != 0)
      {
        onWindowSystemUiVisibilityChanged(this.n);
        bg.w(this);
      }
    }
  }

  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.k)
    {
      this.k = paramBoolean;
      if (!paramBoolean)
      {
        j();
        setActionBarHideOffset(0);
      }
    }
  }

  public void setIcon(int paramInt)
  {
    i();
    this.f.a(paramInt);
  }

  public void setIcon(Drawable paramDrawable)
  {
    i();
    this.f.a(paramDrawable);
  }

  public void setLogo(int paramInt)
  {
    i();
    this.f.b(paramInt);
  }

  public void setOverlayMode(boolean paramBoolean)
  {
    this.i = paramBoolean;
    if ((paramBoolean) && (getContext().getApplicationInfo().targetSdkVersion < 19));
    for (boolean bool = true; ; bool = false)
    {
      this.h = bool;
      return;
    }
  }

  public void setShowingForActionMode(boolean paramBoolean)
  {
  }

  public void setUiOptions(int paramInt)
  {
  }

  public void setWindowCallback(Window.Callback paramCallback)
  {
    i();
    this.f.a(paramCallback);
  }

  public void setWindowTitle(CharSequence paramCharSequence)
  {
    i();
    this.f.a(paramCharSequence);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.0
 */