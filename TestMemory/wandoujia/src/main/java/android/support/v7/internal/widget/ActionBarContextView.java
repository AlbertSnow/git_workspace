package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v4.view.dh;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.h;
import android.support.v7.internal.view.menu.i;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a
  implements dh
{
  private CharSequence h;
  private CharSequence i;
  private View j;
  private View k;
  private LinearLayout l;
  private TextView m;
  private TextView n;
  private int o;
  private int p;
  private Drawable q;
  private boolean r;
  private int s;
  private h t;
  private boolean u;
  private int v;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.actionModeStyle);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    com.tencent.mm.sdk.channel.a locala = com.tencent.mm.sdk.channel.a.a(paramContext, paramAttributeSet, R.styleable.ActionMode, paramInt);
    setBackgroundDrawable(locala.a(R.styleable.ActionMode_background));
    this.o = locala.f(R.styleable.ActionMode_titleTextStyle, 0);
    this.p = locala.f(R.styleable.ActionMode_subtitleTextStyle, 0);
    this.f = locala.e(R.styleable.ActionMode_height, 0);
    this.q = locala.a(R.styleable.ActionMode_backgroundSplit);
    this.s = locala.f(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
    locala.b();
  }

  private void e()
  {
    int i1 = 8;
    int i2 = 1;
    if (this.l == null)
    {
      LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
      this.l = ((LinearLayout)getChildAt(-1 + getChildCount()));
      this.m = ((TextView)this.l.findViewById(R.id.action_bar_title));
      this.n = ((TextView)this.l.findViewById(R.id.action_bar_subtitle));
      if (this.o != 0)
        this.m.setTextAppearance(getContext(), this.o);
      if (this.p != 0)
        this.n.setTextAppearance(getContext(), this.p);
    }
    this.m.setText(this.h);
    this.n.setText(this.i);
    int i3;
    label166: TextView localTextView;
    if (!TextUtils.isEmpty(this.h))
    {
      i3 = i2;
      if (TextUtils.isEmpty(this.i))
        break label232;
      localTextView = this.n;
      if (i2 == 0)
        break label237;
    }
    label232: label237: for (int i4 = 0; ; i4 = i1)
    {
      localTextView.setVisibility(i4);
      LinearLayout localLinearLayout = this.l;
      if ((i3 != 0) || (i2 != 0))
        i1 = 0;
      localLinearLayout.setVisibility(i1);
      if (this.l.getParent() == null)
        addView(this.l);
      return;
      i3 = 0;
      break;
      i2 = 0;
      break label166;
    }
  }

  private void f()
  {
    h localh = this.t;
    if (localh != null)
    {
      this.t = null;
      localh.b();
    }
  }

  public final void a(android.support.v7.b.a parama)
  {
    i locali;
    ViewGroup.LayoutParams localLayoutParams;
    if (this.j == null)
    {
      this.j = LayoutInflater.from(getContext()).inflate(this.s, this, false);
      addView(this.j);
      this.j.findViewById(R.id.action_mode_close_button).setOnClickListener(new g(parama));
      locali = (i)parama.b();
      if (this.c != null)
        this.c.h();
      this.c = new ActionMenuPresenter(getContext());
      this.c.d();
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      if (this.e)
        break label190;
      locali.a(this.c, this.a);
      this.b = ((ActionMenuView)this.c.a(this));
      this.b.setBackgroundDrawable(null);
      addView(this.b, localLayoutParams);
    }
    while (true)
    {
      this.u = true;
      return;
      if (this.j.getParent() != null)
        break;
      addView(this.j);
      break;
      label190: this.c.a(getContext().getResources().getDisplayMetrics().widthPixels);
      this.c.e();
      localLayoutParams.width = -1;
      localLayoutParams.height = this.f;
      locali.a(this.c, this.a);
      this.b = ((ActionMenuView)this.c.a(this));
      this.b.setBackgroundDrawable(this.q);
      this.d.addView(this.b, localLayoutParams);
    }
  }

  public final void a(View paramView)
  {
  }

  public final boolean a()
  {
    if (this.c != null)
      return this.c.f();
    return false;
  }

  public final void b()
  {
    if (this.v == 2)
      return;
    if (this.j == null)
    {
      c();
      return;
    }
    f();
    this.v = 2;
    cu localcu = bg.q(this.j).b(-this.j.getWidth() - ((ViewGroup.MarginLayoutParams)this.j.getLayoutParams()).leftMargin);
    localcu.a(200L);
    localcu.a(this);
    localcu.a(new DecelerateInterpolator());
    h localh = new h();
    localh.a(localcu);
    if (this.b != null)
      this.b.getChildCount();
    this.t = localh;
    this.t.a();
  }

  public final void b(View paramView)
  {
    if (this.v == 2)
      c();
    this.v = 0;
  }

  public final void c()
  {
    f();
    removeAllViews();
    if (this.d != null)
      this.d.removeView(this.b);
    this.k = null;
    this.b = null;
    this.u = false;
  }

  public final void c(View paramView)
  {
  }

  public final boolean d()
  {
    return this.r;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public CharSequence getSubtitle()
  {
    return this.i;
  }

  public CharSequence getTitle()
  {
    return this.h;
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
    {
      this.c.g();
      this.c.i();
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.h);
      }
    }
    else
      return;
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = ba.a(this);
    int i1;
    int i2;
    int i3;
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i5;
    if (bool1)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      if ((this.j == null) || (this.j.getVisibility() == 8))
        break label367;
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.j.getLayoutParams();
      if (!bool1)
        break label329;
      i5 = localMarginLayoutParams.rightMargin;
      label87: if (!bool1)
        break label339;
    }
    h localh;
    label329: label339: for (int i6 = localMarginLayoutParams.leftMargin; ; i6 = localMarginLayoutParams.rightMargin)
    {
      int i7 = a(i1, i5, bool1);
      i1 = a(i7 + a(this.j, i7, i2, i3, bool1), i6, bool1);
      if (!this.u)
        break label367;
      this.v = 1;
      bg.a(this.j, -this.j.getWidth() - ((ViewGroup.MarginLayoutParams)this.j.getLayoutParams()).leftMargin);
      cu localcu1 = bg.q(this.j).b(0.0F);
      localcu1.a(200L);
      localcu1.a(this);
      localcu1.a(new DecelerateInterpolator());
      localh = new h();
      localh.a(localcu1);
      if (this.b == null)
        break label349;
      int i8 = this.b.getChildCount();
      if (i8 <= 0)
        break label349;
      for (int i9 = i8 - 1; i9 >= 0; i9--)
      {
        View localView = this.b.getChildAt(i9);
        bg.h(localView, 0.0F);
        cu localcu2 = bg.q(localView).b();
        localcu2.a(300L);
        localh.a(localcu2);
      }
      i1 = getPaddingLeft();
      break;
      i5 = localMarginLayoutParams.leftMargin;
      break label87;
    }
    label349: this.t = localh;
    this.t.a();
    this.u = false;
    label367: if ((this.l != null) && (this.k == null) && (this.l.getVisibility() != 8))
      i1 += a(this.l, i1, i2, i3, bool1);
    if (this.k != null)
      a(this.k, i1, i2, i3, bool1);
    int i4;
    ActionMenuView localActionMenuView;
    if (bool1)
    {
      i4 = getPaddingLeft();
      if (this.b != null)
      {
        localActionMenuView = this.b;
        if (bool1)
          break label497;
      }
    }
    label497: for (boolean bool2 = true; ; bool2 = false)
    {
      a(localActionMenuView, i4, i2, i3, bool2);
      return;
      i4 = paramInt3 - paramInt1 - getPaddingRight();
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != i1)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4;
    int i6;
    int i7;
    int i8;
    int i16;
    label288: int i17;
    label314: label321: int i12;
    label350: label380: int i13;
    label400: int i10;
    label436: int i11;
    if (this.f > 0)
    {
      i4 = this.f;
      int i5 = getPaddingTop() + getPaddingBottom();
      i6 = i3 - getPaddingLeft() - getPaddingRight();
      i7 = i4 - i5;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      if (this.j != null)
      {
        int i18 = a(this.j, i6, i8);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.j.getLayoutParams();
        i6 = i18 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.b != null) && (this.b.getParent() == this))
        i6 = a(this.b, i6, i8);
      if ((this.l != null) && (this.k == null))
      {
        if (!this.r)
          break label496;
        int i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.l.measure(i14, i8);
        int i15 = this.l.getMeasuredWidth();
        if (i15 > i6)
          break label483;
        i16 = 1;
        if (i16 != 0)
          i6 -= i15;
        LinearLayout localLinearLayout = this.l;
        if (i16 == 0)
          break label489;
        i17 = 0;
        localLinearLayout.setVisibility(i17);
      }
      if (this.k != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.k.getLayoutParams();
        if (localLayoutParams.width == -2)
          break label512;
        i12 = i1;
        if (localLayoutParams.width >= 0)
          i6 = Math.min(localLayoutParams.width, i6);
        if (localLayoutParams.height == -2)
          break label520;
        if (localLayoutParams.height < 0)
          break label527;
        i13 = Math.min(localLayoutParams.height, i7);
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i6, i12), View.MeasureSpec.makeMeasureSpec(i13, i1));
      }
      if (this.f > 0)
        break label543;
      int i9 = getChildCount();
      i10 = 0;
      if (i2 >= i9)
        break label534;
      i11 = i5 + getChildAt(i2).getMeasuredHeight();
      if (i11 <= i10)
        break label552;
    }
    while (true)
    {
      i2++;
      i10 = i11;
      break label436;
      i4 = View.MeasureSpec.getSize(paramInt2);
      break;
      label483: i16 = 0;
      break label288;
      label489: i17 = 8;
      break label314;
      label496: i6 = a(this.l, i6, i8);
      break label321;
      label512: i12 = -2147483648;
      break label350;
      label520: i1 = -2147483648;
      break label380;
      label527: i13 = i7;
      break label400;
      label534: setMeasuredDimension(i3, i10);
      return;
      label543: setMeasuredDimension(i3, i4);
      return;
      label552: i11 = i10;
    }
  }

  public void setContentHeight(int paramInt)
  {
    this.f = paramInt;
  }

  public void setCustomView(View paramView)
  {
    if (this.k != null)
      removeView(this.k);
    this.k = paramView;
    if (this.l != null)
    {
      removeView(this.l);
      this.l = null;
    }
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public void setSplitToolbar(boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams;
    if (this.e != paramBoolean)
      if (this.c != null)
      {
        localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
        if (paramBoolean)
          break label94;
        this.b = ((ActionMenuView)this.c.a(this));
        this.b.setBackgroundDrawable(null);
        ViewGroup localViewGroup2 = (ViewGroup)this.b.getParent();
        if (localViewGroup2 != null)
          localViewGroup2.removeView(this.b);
        addView(this.b, localLayoutParams);
      }
    while (true)
    {
      super.setSplitToolbar(paramBoolean);
      return;
      label94: this.c.a(getContext().getResources().getDisplayMetrics().widthPixels);
      this.c.e();
      localLayoutParams.width = -1;
      localLayoutParams.height = this.f;
      this.b = ((ActionMenuView)this.c.a(this));
      this.b.setBackgroundDrawable(this.q);
      ViewGroup localViewGroup1 = (ViewGroup)this.b.getParent();
      if (localViewGroup1 != null)
        localViewGroup1.removeView(this.b);
      this.d.addView(this.b, localLayoutParams);
    }
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    e();
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    e();
  }

  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != this.r)
      requestLayout();
    this.r = paramBoolean;
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * JD-Core Version:    0.6.0
 */