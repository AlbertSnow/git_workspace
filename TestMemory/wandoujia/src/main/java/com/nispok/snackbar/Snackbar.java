package com.nispok.snackbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.nispok.snackbar.a.b;
import com.nispok.snackbar.enums.SnackbarType;
import com.nispok.snackbar.layouts.SnackbarLayout;

public class Snackbar extends SnackbarLayout
{
  private boolean A = true;
  private boolean B = false;
  private boolean C = true;
  private boolean D = false;
  private Rect E = new Rect();
  private Rect F = new Rect();
  private Point G = new Point();
  private Point H = new Point();
  private Activity I;
  private boolean J;
  private Runnable K = new f(this);
  private Runnable L = new g(this);
  private int a = -10000;
  private int b = -10000;
  private SnackbarType c = SnackbarType.SINGLE_LINE;
  private Snackbar.SnackbarDuration d = Snackbar.SnackbarDuration.LENGTH_LONG;
  private CharSequence e;
  private TextView f;
  private TextView g;
  private int h = this.a;
  private int i = this.a;
  private int j;
  private Snackbar.SnackbarPosition k = Snackbar.SnackbarPosition.BOTTOM;
  private Snackbar.SnackbarPosition l = Snackbar.SnackbarPosition.BOTTOM_CENTER;
  private int m = this.b;
  private long n;
  private long o;
  private long p = -1L;
  private CharSequence q;
  private CharSequence r;
  private int s = -1;
  private int t = this.a;
  private boolean u = true;
  private boolean v = true;
  private long w = -1L;
  private com.nispok.snackbar.a.a x;
  private com.nispok.snackbar.a.a y;
  private boolean z;

  private Snackbar(Context paramContext)
  {
    super(paramContext);
    if (Build.VERSION.SDK_INT >= 16)
      addView(new p(getContext()));
  }

  private static int a(int paramInt, float paramFloat)
  {
    return (int)(0.5F + paramFloat * paramInt);
  }

  private ViewGroup.MarginLayoutParams a(Context paramContext, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    SnackbarLayout localSnackbarLayout = (SnackbarLayout)LayoutInflater.from(paramContext).inflate(R.layout.sb__template, this, true);
    localSnackbarLayout.setOrientation(1);
    Resources localResources = getResources();
    int i1;
    float f1;
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    label142: Drawable localDrawable;
    label179: TextView localTextView1;
    TextView localTextView2;
    if (this.h != this.a)
    {
      i1 = this.h;
      this.h = i1;
      this.j = localResources.getDimensionPixelOffset(R.dimen.sb__offset);
      this.J = paramBoolean;
      f1 = localResources.getDisplayMetrics().density;
      if (!this.J)
        break label561;
      localSnackbarLayout.setMinimumHeight(a(this.c.getMinHeight(), f1));
      localSnackbarLayout.setMaxHeight(a(this.c.getMaxHeight(), f1));
      localSnackbarLayout.setBackgroundColor(this.h);
      localMarginLayoutParams = a(paramViewGroup, -1, -2, this.k);
      if (this.m != this.b)
      {
        localDrawable = localResources.getDrawable(this.m);
        if (Build.VERSION.SDK_INT >= 16)
          break label644;
        localSnackbarLayout.setBackgroundDrawable(localDrawable);
      }
      localSnackbarLayout.findViewById(R.id.sb__divider).setVisibility(8);
      this.f = ((TextView)localSnackbarLayout.findViewById(R.id.sb__text));
      this.f.setText(this.e);
      this.f.setTypeface(null);
      this.g = ((TextView)localSnackbarLayout.findViewById(R.id.sb__sub_text));
      this.g.setText(null);
      this.g.setTypeface(null);
      if (this.i != this.a)
      {
        this.f.setTextColor(this.i);
        this.g.setTextColor(this.i);
      }
      this.f.setMaxLines(this.c.getMaxLines());
      this.g.setMaxLines(this.c.getMaxLines());
      localTextView1 = (TextView)localSnackbarLayout.findViewById(R.id.sb__action);
      localTextView2 = (TextView)localSnackbarLayout.findViewById(R.id.sb__sub_action);
      if ((TextUtils.isEmpty(this.q)) && (this.s == -1))
        break label677;
      requestLayout();
      localTextView1.setText(this.q);
      localTextView1.setTypeface(null);
      if (TextUtils.isEmpty(this.r))
        break label654;
      localTextView2.setText(this.r);
      localTextView2.setTypeface(null);
      localTextView2.setVisibility(0);
      localSnackbarLayout.findViewById(R.id.sb__action_divider).setVisibility(0);
      localTextView2.setOnClickListener(new h(this));
      label437: if (this.s != -1)
        localTextView1.setCompoundDrawablesWithIntrinsicBounds(this.s, 0, 0, 0);
      if (this.t != this.a)
        localTextView1.setTextColor(this.t);
      localTextView1.setOnClickListener(new i(this));
      localTextView1.setMaxLines(this.c.getMaxLines());
    }
    while (true)
    {
      setClickable(true);
      if ((this.C) && (localResources.getBoolean(R.bool.sb__is_swipeable)))
        setOnTouchListener(new b(this, new j(this)));
      return localMarginLayoutParams;
      i1 = localResources.getColor(R.color.sb__background);
      break;
      label561: this.c = SnackbarType.SINGLE_LINE;
      localSnackbarLayout.setMinimumWidth(localResources.getDimensionPixelSize(R.dimen.sb__min_width));
      localSnackbarLayout.setMaxWidth(localResources.getDimensionPixelSize(R.dimen.sb__max_width));
      localSnackbarLayout.setBackgroundResource(R.drawable.sb__bg);
      ((GradientDrawable)localSnackbarLayout.getBackground()).setColor(this.h);
      localMarginLayoutParams = a(paramViewGroup, -2, a(this.c.getMaxHeight(), f1), this.l);
      break label142;
      label644: localSnackbarLayout.setBackground(localDrawable);
      break label179;
      label654: localTextView2.setVisibility(8);
      localSnackbarLayout.findViewById(R.id.sb__action_divider).setVisibility(8);
      break label437;
      label677: localTextView1.setVisibility(8);
    }
  }

  private static ViewGroup.MarginLayoutParams a(ViewGroup paramViewGroup, int paramInt1, int paramInt2, Snackbar.SnackbarPosition paramSnackbarPosition)
  {
    if ((paramViewGroup instanceof FrameLayout))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt1, paramInt2);
      localLayoutParams.gravity = paramSnackbarPosition.getLayoutGravity();
      return localLayoutParams;
    }
    if ((paramViewGroup instanceof RelativeLayout))
    {
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
      if (paramSnackbarPosition == Snackbar.SnackbarPosition.TOP)
      {
        localLayoutParams1.addRule(10, -1);
        return localLayoutParams1;
      }
      localLayoutParams1.addRule(12, -1);
      return localLayoutParams1;
    }
    if ((paramViewGroup instanceof LinearLayout))
    {
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(paramInt1, paramInt2);
      localLayoutParams2.gravity = paramSnackbarPosition.getLayoutGravity();
      return localLayoutParams2;
    }
    throw new IllegalStateException("Requires FrameLayout or RelativeLayout for the parent of Snackbar");
  }

  public static Snackbar a(Context paramContext)
  {
    return new Snackbar(paramContext);
  }

  private void a(Activity paramActivity, ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    int i1 = 1;
    Rect localRect1;
    int i2;
    label114: Rect localRect2;
    label137: Point localPoint1;
    Point localPoint2;
    if (this.J)
    {
      paramMarginLayoutParams.topMargin = 0;
      paramMarginLayoutParams.rightMargin = 0;
      paramMarginLayoutParams.leftMargin = 0;
      paramMarginLayoutParams.bottomMargin = 0;
      localRect1 = this.E;
      localRect1.bottom = 0;
      localRect1.right = 0;
      localRect1.top = 0;
      localRect1.left = 0;
      if (paramActivity != null)
      {
        ViewGroup localViewGroup = (ViewGroup)paramActivity.getWindow().getDecorView();
        Display localDisplay = paramActivity.getWindowManager().getDefaultDisplay();
        if ((Build.VERSION.SDK_INT < 19) || ((0x8000000 & paramActivity.getWindow().getAttributes().flags) == 0))
          break label298;
        i2 = i1;
        if ((Build.VERSION.SDK_INT < 16) || ((0x200 & localViewGroup.getWindowSystemUiVisibility()) != 512))
          break label304;
        localRect2 = this.F;
        localPoint1 = this.H;
        localPoint2 = this.G;
        localViewGroup.getWindowVisibleDisplayFrame(localRect2);
        a.b(localDisplay, localPoint1);
        a.a(localDisplay, localPoint2);
        if (localPoint2.x >= localPoint1.x)
          break label309;
        if ((i2 != 0) || (i1 != 0))
          localRect1.right = Math.max(Math.min(localPoint1.x - localPoint2.x, localPoint1.x - localRect2.right), 0);
      }
    }
    while (true)
    {
      paramMarginLayoutParams.rightMargin += this.E.right;
      paramMarginLayoutParams.bottomMargin += this.E.bottom;
      return;
      paramMarginLayoutParams.topMargin = 0;
      paramMarginLayoutParams.rightMargin = 0;
      paramMarginLayoutParams.leftMargin = (0 + this.j);
      paramMarginLayoutParams.bottomMargin = (0 + this.j);
      break;
      label298: i2 = 0;
      break label114;
      label304: i1 = 0;
      break label137;
      label309: if ((localPoint2.y >= localPoint1.y) || ((i2 == 0) && (i1 == 0)))
        continue;
      localRect1.bottom = Math.max(Math.min(localPoint1.y - localPoint2.y, localPoint1.y - localRect2.bottom), 0);
    }
  }

  private void a(Activity paramActivity, ViewGroup.MarginLayoutParams paramMarginLayoutParams, ViewGroup paramViewGroup)
  {
    paramViewGroup.removeView(this);
    if (Build.VERSION.SDK_INT >= 21)
      for (int i2 = 0; i2 < paramViewGroup.getChildCount(); i2++)
      {
        float f1 = paramViewGroup.getChildAt(i2).getElevation();
        if (f1 <= getElevation())
          continue;
        setElevation(f1);
      }
    paramViewGroup.addView(this, paramMarginLayoutParams);
    bringToFront();
    if (Build.VERSION.SDK_INT < 19)
    {
      paramViewGroup.requestLayout();
      paramViewGroup.invalidate();
    }
    this.B = true;
    this.I = paramActivity;
    getViewTreeObserver().addOnPreDrawListener(new k(this));
    if (!this.u)
    {
      if (l())
        n();
      return;
    }
    Context localContext = getContext();
    if (this.k == Snackbar.SnackbarPosition.TOP);
    for (int i1 = R.anim.sb__top_in; ; i1 = R.anim.sb__bottom_in)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(localContext, i1);
      localAnimation.setAnimationListener(new l(this));
      startAnimation(localAnimation);
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.D)
      return;
    this.D = true;
    if (!paramBoolean)
    {
      o();
      return;
    }
    Context localContext = getContext();
    if (this.k == Snackbar.SnackbarPosition.TOP);
    for (int i1 = R.anim.sb__top_out; ; i1 = R.anim.sb__bottom_out)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(localContext, i1);
      localAnimation.setAnimationListener(new n(this));
      startAnimation(localAnimation);
      return;
    }
  }

  static boolean b(Context paramContext)
  {
    if (paramContext == null)
      return true;
    return paramContext.getResources().getBoolean(R.bool.sb__is_phone);
  }

  private boolean l()
  {
    return !m();
  }

  private boolean m()
  {
    return getDuration() == Snackbar.SnackbarDuration.LENGTH_INDEFINITE.getDuration();
  }

  private void n()
  {
    postDelayed(this.K, getDuration());
  }

  private void o()
  {
    clearAnimation();
    ViewGroup localViewGroup = (ViewGroup)getParent();
    if (localViewGroup != null)
      localViewGroup.removeView(this);
    this.B = false;
    this.I = null;
  }

  public final Snackbar a()
  {
    this.r = getContext().getString(2131624939);
    return this;
  }

  public final Snackbar a(int paramInt)
  {
    return a(getContext().getText(paramInt));
  }

  public final Snackbar a(long paramLong)
  {
    if (paramLong > 0L);
    while (true)
    {
      this.w = paramLong;
      return this;
      paramLong = this.w;
    }
  }

  public final Snackbar a(Snackbar.SnackbarDuration paramSnackbarDuration)
  {
    this.d = paramSnackbarDuration;
    return this;
  }

  public final Snackbar a(com.nispok.snackbar.a.a parama)
  {
    this.x = parama;
    return this;
  }

  public final Snackbar a(SnackbarType paramSnackbarType)
  {
    this.c = paramSnackbarType;
    return this;
  }

  public final Snackbar a(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    if (this.f != null)
      this.f.setText(this.e);
    return this;
  }

  public final void a(Activity paramActivity)
  {
    b(paramActivity);
  }

  public final void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    b(paramViewGroup, paramBoolean);
  }

  public final Snackbar b()
  {
    this.s = 2130838314;
    return this;
  }

  public final Snackbar b(int paramInt)
  {
    this.h = getResources().getColor(paramInt);
    return this;
  }

  public final Snackbar b(com.nispok.snackbar.a.a parama)
  {
    this.y = parama;
    return this;
  }

  public final void b(Activity paramActivity)
  {
    ViewGroup localViewGroup = (ViewGroup)paramActivity.findViewById(16908290);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = a(paramActivity, localViewGroup, b(paramActivity));
    a(paramActivity, localMarginLayoutParams);
    a(paramActivity, localMarginLayoutParams, localViewGroup);
  }

  public final void b(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = a(paramViewGroup.getContext(), paramViewGroup, paramBoolean);
    a(null, localMarginLayoutParams);
    a(null, localMarginLayoutParams, paramViewGroup);
  }

  public final Snackbar c()
  {
    this.A = true;
    return this;
  }

  public final Snackbar c(int paramInt)
  {
    this.q = getContext().getString(paramInt);
    return this;
  }

  public final Snackbar d()
  {
    this.u = false;
    return this;
  }

  public final Snackbar e()
  {
    this.v = false;
    return this;
  }

  public final void f()
  {
    g();
  }

  public final void g()
  {
    a(this.v);
  }

  public int getActionColor()
  {
    return this.t;
  }

  public CharSequence getActionLabel()
  {
    return this.q;
  }

  public int getColor()
  {
    return this.h;
  }

  public long getDuration()
  {
    if (this.w == -1L)
      return this.d.getDuration();
    return this.w;
  }

  public int getLineColor()
  {
    return null.intValue();
  }

  public int getOffset()
  {
    return this.j;
  }

  public CharSequence getText()
  {
    return this.e;
  }

  public int getTextColor()
  {
    return this.i;
  }

  public SnackbarType getType()
  {
    return this.c;
  }

  final void h()
  {
    if (this.L != null)
      post(this.L);
  }

  protected final void i()
  {
    if (this.D);
    do
      return;
    while ((ViewGroup)getParent() == null);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)getLayoutParams();
    a(this.I, localMarginLayoutParams);
    setLayoutParams(localMarginLayoutParams);
  }

  public final boolean j()
  {
    return this.B;
  }

  public final boolean k()
  {
    return this.D;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.B = false;
    if (this.K != null)
      removeCallbacks(this.K);
    if (this.L != null)
      removeCallbacks(this.L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.Snackbar
 * JD-Core Version:    0.6.0
 */