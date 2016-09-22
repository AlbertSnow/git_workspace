package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.h;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

abstract class a extends ViewGroup
{
  private static final Interpolator h = new DecelerateInterpolator();
  protected final Context a;
  protected ActionMenuView b;
  protected ActionMenuPresenter c;
  protected ViewGroup d;
  protected boolean e;
  protected int f;
  protected cu g;
  private b i = new b(this);

  a(Context paramContext)
  {
    this(paramContext, null);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue localTypedValue = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true)) && (localTypedValue.resourceId != 0))
    {
      this.a = new ContextThemeWrapper(paramContext, localTypedValue.resourceId);
      return;
    }
    this.a = paramContext;
  }

  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean)
      return paramInt1 - paramInt2;
    return paramInt1 + paramInt2;
  }

  protected static int a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, 0 + (paramInt1 - paramView.getMeasuredWidth()));
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int j = paramView.getMeasuredWidth();
    int k = paramView.getMeasuredHeight();
    int m = paramInt2 + (paramInt3 - k) / 2;
    if (paramBoolean)
      paramView.layout(paramInt1 - j, m, paramInt1, k + m);
    while (true)
    {
      if (paramBoolean)
        j = -j;
      return j;
      paramView.layout(paramInt1, m, paramInt1 + j, k + m);
    }
  }

  public void a(int paramInt)
  {
    if (this.g != null)
      this.g.c();
    if (paramInt == 0)
    {
      if (getVisibility() != 0)
      {
        bg.c(this, 0.0F);
        if ((this.d != null) && (this.b != null))
          bg.c(this.b, 0.0F);
      }
      cu localcu3 = bg.q(this).a(1.0F);
      localcu3.a(200L);
      localcu3.a(h);
      if ((this.d != null) && (this.b != null))
      {
        h localh2 = new h();
        cu localcu4 = bg.q(this.b).a(1.0F);
        localcu4.a(200L);
        localh2.a(this.i.a(localcu3, paramInt));
        localh2.a(localcu3).a(localcu4);
        localh2.a();
        return;
      }
      localcu3.a(this.i.a(localcu3, paramInt));
      localcu3.d();
      return;
    }
    cu localcu1 = bg.q(this).a(0.0F);
    localcu1.a(200L);
    localcu1.a(h);
    if ((this.d != null) && (this.b != null))
    {
      h localh1 = new h();
      cu localcu2 = bg.q(this.b).a(0.0F);
      localcu2.a(200L);
      localh1.a(this.i.a(localcu1, paramInt));
      localh1.a(localcu1).a(localcu2);
      localh1.a();
      return;
    }
    localcu1.a(this.i.a(localcu1, paramInt));
    localcu1.d();
  }

  public boolean a()
  {
    if (this.c != null)
      return this.c.f();
    return false;
  }

  public int getAnimatedVisibility()
  {
    if (this.g != null)
      return this.i.a;
    return getVisibility();
  }

  public int getContentHeight()
  {
    return this.f;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
    setContentHeight(localTypedArray.getLayoutDimension(R.styleable.ActionBar_height, 0));
    localTypedArray.recycle();
    if (this.c != null)
      this.c.c();
  }

  public void setContentHeight(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }

  public void setSplitToolbar(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void setSplitView(ViewGroup paramViewGroup)
  {
    this.d = paramViewGroup;
  }

  public void setSplitWhenNarrow(boolean paramBoolean)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.a
 * JD-Core Version:    0.6.0
 */