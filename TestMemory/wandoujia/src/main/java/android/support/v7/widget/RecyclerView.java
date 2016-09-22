package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.al;
import android.support.v4.view.aq;
import android.support.v4.view.bb;
import android.support.v4.view.bc;
import android.support.v4.view.bg;
import android.support.v4.view.bs;
import android.support.v4.widget.x;
import android.support.v7.app.f;
import android.support.v7.recyclerview.R.styleable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import de.greenrobot.event.util.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup
  implements aq, bb
{
  private static final Interpolator ak;
  private static final boolean h;
  private static final Class<?>[] i;
  private boolean A;
  private final boolean B;
  private final AccessibilityManager C;
  private boolean D = false;
  private int E = 0;
  private x F;
  private x G;
  private x H;
  private x I;
  private int J = 0;
  private int K = -1;
  private VelocityTracker L;
  private int M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private final int R;
  private final int S;
  private float T = 1.4E-45F;
  private final cn U = new cn(this);
  private cf V;
  private List<cf> W;
  final ch a = new ch(this);
  private cb aa = new cb(this, 0);
  private boolean ab = false;
  private cp ac;
  private f ad;
  private final int[] ae = new int[2];
  private final android.support.v4.c.a af;
  private final int[] ag = new int[2];
  private final int[] ah = new int[2];
  private final int[] ai = new int[2];
  private Runnable aj = new bw(this);
  m b;
  p c;
  ca d = new s();
  final cm e = new cm();
  boolean f = false;
  boolean g = false;
  private final ci j = new ci(this, 0);
  private RecyclerView.SavedState k;
  private boolean l;
  private final Runnable m = new bv(this);
  private final Rect n = new Rect();
  private by o;
  private ce p;
  private f q;
  private final ArrayList<cc> r = new ArrayList();
  private final ArrayList<f> s = new ArrayList();
  private f t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z;

  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20));
    for (boolean bool = true; ; bool = false)
    {
      h = bool;
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = AttributeSet.class;
      arrayOfClass[2] = Integer.TYPE;
      arrayOfClass[3] = Integer.TYPE;
      i = arrayOfClass;
      ak = new bx();
      return;
    }
  }

  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusableInTouchMode(true);
    boolean bool1;
    if (Build.VERSION.SDK_INT >= 16)
      bool1 = true;
    label271: String str3;
    while (true)
    {
      this.B = bool1;
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      this.Q = localViewConfiguration.getScaledTouchSlop();
      this.R = localViewConfiguration.getScaledMinimumFlingVelocity();
      this.S = localViewConfiguration.getScaledMaximumFlingVelocity();
      boolean bool2;
      String str2;
      if (bg.a(this) == 2)
      {
        bool2 = true;
        setWillNotDraw(bool2);
        this.d.a(this.aa);
        this.b = new m(new n(this));
        this.c = new p(new r(this));
        if (bg.e(this) == 0)
          bg.c(this, 1);
        this.C = ((AccessibilityManager)getContext().getSystemService("accessibility"));
        setAccessibilityDelegateCompat(new cp(this));
        if (paramAttributeSet != null)
        {
          TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, paramInt, 0);
          String str1 = localTypedArray.getString(R.styleable.RecyclerView_layoutManager);
          localTypedArray.recycle();
          if (str1 != null)
          {
            str2 = str1.trim();
            if (str2.length() != 0)
            {
              if (str2.charAt(0) != '.')
                break label580;
              str3 = paramContext.getPackageName() + str2;
            }
          }
        }
      }
      try
      {
        label453: Object localObject1;
        Class localClass;
        if (isInEditMode())
        {
          localObject1 = getClass().getClassLoader();
          localClass = ((ClassLoader)localObject1).loadClass(str3).asSubclass(ce.class);
        }
        try
        {
          Constructor localConstructor2 = localClass.getConstructor(i);
          arrayOfObject = new Object[4];
          arrayOfObject[0] = paramContext;
          arrayOfObject[1] = paramAttributeSet;
          arrayOfObject[2] = Integer.valueOf(paramInt);
          arrayOfObject[3] = Integer.valueOf(0);
          localObject2 = localConstructor2;
          ((Constructor)localObject2).setAccessible(true);
          setLayoutManager((ce)((Constructor)localObject2).newInstance(arrayOfObject));
          this.af = new android.support.v4.c.a(this);
          setNestedScrollingEnabled(true);
          return;
          bool1 = false;
          continue;
          bool2 = false;
          break label271;
          label580: if (str2.contains("."))
          {
            str3 = str2;
            break label453;
          }
          str3 = RecyclerView.class.getPackage().getName() + '.' + str2;
          break label453;
          ClassLoader localClassLoader = paramContext.getClassLoader();
          localObject1 = localClassLoader;
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          try
          {
            Constructor localConstructor1 = localClass.getConstructor(new Class[0]);
            Object localObject2 = localConstructor1;
            Object[] arrayOfObject = null;
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            localNoSuchMethodException2.initCause(localNoSuchMethodException1);
            throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + str3, localNoSuchMethodException2);
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str3, localClassNotFoundException);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str3, localInvocationTargetException);
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str3, localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str3, localIllegalAccessException);
      }
      catch (ClassCastException localClassCastException)
      {
      }
    }
    throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str3, localClassCastException);
  }

  private void a(android.support.v4.e.a<View, Rect> parama)
  {
    List localList = this.e.d;
    int i1 = -1 + localList.size();
    if (i1 >= 0)
    {
      View localView = (View)localList.get(i1);
      co localco = b(localView);
      cd localcd = (cd)this.e.a.remove(localco);
      if (!this.e.a())
        this.e.b.remove(localco);
      if (parama.remove(localView) != null)
        this.p.a(localView, this.a);
      while (true)
      {
        i1--;
        break;
        if (localcd != null)
        {
          a(localcd);
          continue;
        }
        int i2 = localView.getLeft();
        int i3 = localView.getTop();
        localView.getRight();
        localView.getBottom();
        a(new cd(localco, i2, i3));
      }
    }
    localList.clear();
  }

  private void a(cd paramcd)
  {
    View localView = paramcd.a.a;
    a(paramcd.a);
    int i1 = paramcd.b;
    int i2 = paramcd.c;
    int i3 = localView.getLeft();
    int i4 = localView.getTop();
    if ((i1 != i3) || (i2 != i4))
    {
      paramcd.a.a(false);
      localView.layout(i3, i4, i3 + localView.getWidth(), i4 + localView.getHeight());
      if (this.d.a(paramcd.a, i1, i2, i3, i4))
        v();
      return;
    }
    paramcd.a.a(false);
    this.d.a(paramcd.a);
    v();
  }

  private void a(co paramco)
  {
    View localView = paramco.a;
    if (localView.getParent() == this);
    for (int i1 = 1; ; i1 = 0)
    {
      this.a.b(a(localView));
      if (!paramco.q())
        break;
      this.c.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.c.a(localView);
      return;
    }
    p localp = this.c;
    int i2 = localp.a.a(localView);
    if (i2 < 0)
      throw new IllegalArgumentException("view is not a child, cannot hide " + localView);
    localp.b.a(i2);
    localp.c.add(localView);
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = al.b(paramMotionEvent);
    if (al.b(paramMotionEvent, i1) == this.K)
      if (i1 != 0)
        break label81;
    label81: for (int i2 = 1; ; i2 = 0)
    {
      this.K = al.b(paramMotionEvent, i2);
      int i3 = (int)(0.5F + al.c(paramMotionEvent, i2));
      this.O = i3;
      this.M = i3;
      int i4 = (int)(0.5F + al.d(paramMotionEvent, i2));
      this.P = i4;
      this.N = i4;
      return;
    }
  }

  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    h();
    by localby = this.o;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    if (localby != null)
    {
      b();
      r();
      android.support.v4.c.a.a("RV Scroll");
      i3 = 0;
      i4 = 0;
      if (paramInt1 != 0)
      {
        i3 = this.p.a(paramInt1, this.a, this.e);
        i4 = paramInt1 - i3;
      }
      i1 = 0;
      i2 = 0;
      if (paramInt2 != 0)
      {
        i1 = this.p.b(paramInt2, this.a, this.e);
        i2 = paramInt2 - i1;
      }
      android.support.v4.c.a.a();
      if (u())
      {
        int i9 = this.c.a();
        int i10 = 0;
        if (i10 < i9)
        {
          View localView1 = this.c.b(i10);
          co localco1 = a(localView1);
          co localco2;
          if ((localco1 != null) && (localco1.g != null))
          {
            localco2 = localco1.g;
            if (localco2 == null)
              break label259;
          }
          label259: for (View localView2 = localco2.a; ; localView2 = null)
          {
            if (localView2 != null)
            {
              int i11 = localView1.getLeft();
              int i12 = localView1.getTop();
              if ((i11 != localView2.getLeft()) || (i12 != localView2.getTop()))
                localView2.layout(i11, i12, i11 + localView2.getWidth(), i12 + localView2.getHeight());
            }
            i10++;
            break;
          }
        }
      }
      s();
      a(false);
    }
    int i5 = i2;
    int i6 = i3;
    int i7 = i1;
    if (!this.r.isEmpty())
      invalidate();
    if (dispatchNestedScroll(i6, i7, i4, i5, this.ag))
    {
      this.O -= this.ag[0];
      this.P -= this.ag[1];
      paramMotionEvent.offsetLocation(this.ag[0], this.ag[1]);
      int[] arrayOfInt1 = this.ai;
      arrayOfInt1[0] += this.ag[0];
      int[] arrayOfInt2 = this.ai;
      arrayOfInt2[1] += this.ag[1];
    }
    while (true)
    {
      if ((i6 != 0) || (i7 != 0))
        d(i6, i7);
      if (!awakenScrollBars())
        invalidate();
      if ((i6 == 0) && (i7 == 0))
        break;
      return true;
      if (bg.a(this) == 2)
        continue;
      float f1;
      float f2;
      float f3;
      float f4;
      int i8;
      if (paramMotionEvent != null)
      {
        f1 = paramMotionEvent.getX();
        f2 = i4;
        f3 = paramMotionEvent.getY();
        f4 = i5;
        if (f2 >= 0.0F)
          break label607;
        l();
        boolean bool3 = this.F.a(-f2 / getWidth(), 1.0F - f3 / getHeight());
        i8 = 0;
        if (bool3)
          i8 = 1;
        label534: if (f4 >= 0.0F)
          break label664;
        n();
        if (this.G.a(-f4 / getHeight(), f1 / getWidth()))
          i8 = 1;
      }
      while (true)
      {
        if ((i8 != 0) || (f2 != 0.0F) || (f4 != 0.0F))
          bg.d(this);
        e(paramInt1, paramInt2);
        break;
        label607: boolean bool1 = f2 < 0.0F;
        i8 = 0;
        if (!bool1)
          break label534;
        m();
        boolean bool2 = this.H.a(f2 / getWidth(), f3 / getHeight());
        i8 = 0;
        if (!bool2)
          break label534;
        i8 = 1;
        break label534;
        label664: if (f4 <= 0.0F)
          continue;
        o();
        if (!this.I.a(f4 / getHeight(), 1.0F - f1 / getWidth()))
          continue;
        i8 = 1;
      }
    }
    return false;
  }

  static co b(View paramView)
  {
    if (paramView == null)
      return null;
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).a;
  }

  public static int c(View paramView)
  {
    co localco = b(paramView);
    if (localco != null)
      return localco.e();
    return -1;
  }

  public static int d(View paramView)
  {
    co localco = b(paramView);
    if (localco != null)
      return localco.d();
    return -1;
  }

  private void e(int paramInt1, int paramInt2)
  {
    x localx = this.F;
    boolean bool1 = false;
    if (localx != null)
    {
      boolean bool2 = this.F.a();
      bool1 = false;
      if (!bool2)
      {
        bool1 = false;
        if (paramInt1 > 0)
          bool1 = this.F.c();
      }
    }
    if ((this.H != null) && (!this.H.a()) && (paramInt1 < 0))
      bool1 |= this.H.c();
    if ((this.G != null) && (!this.G.a()) && (paramInt2 > 0))
      bool1 |= this.G.c();
    if ((this.I != null) && (!this.I.a()) && (paramInt2 < 0))
      bool1 |= this.I.c();
    if (bool1)
      bg.d(this);
  }

  private void f(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    switch (i1)
    {
    default:
      i3 = bg.o(this);
    case 1073741824:
    case -2147483648:
    }
    switch (i2)
    {
    default:
      i4 = bg.p(this);
    case 1073741824:
    case -2147483648:
    }
    setMeasuredDimension(i3, i4);
  }

  private void f(View paramView)
  {
    co localco = b(paramView);
    if ((this.o != null) && (localco != null))
      this.o.c(localco);
  }

  private boolean g(int paramInt1, int paramInt2)
  {
    int i1 = this.c.a();
    int i3;
    if (i1 == 0)
    {
      if (paramInt1 == 0)
      {
        i3 = 0;
        if (paramInt2 == 0);
      }
      else
      {
        i3 = 1;
      }
      return i3;
    }
    for (int i2 = 0; ; i2++)
    {
      i3 = 0;
      if (i2 >= i1)
        break;
      co localco = b(this.c.b(i2));
      if (localco.b())
        continue;
      int i4 = localco.d();
      if ((i4 < paramInt1) || (i4 > paramInt2))
        return true;
    }
  }

  private float getScrollFactor()
  {
    if (this.T == 1.4E-45F)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true))
        this.T = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
    }
    else
    {
      return this.T;
    }
    return 0.0F;
  }

  private void h()
  {
    this.m.run();
  }

  private void i()
  {
    setScrollState(0);
    j();
  }

  private void j()
  {
    this.U.b();
    if (this.p != null)
      this.p.x();
  }

  private void k()
  {
    x localx = this.F;
    boolean bool = false;
    if (localx != null)
      bool = this.F.c();
    if (this.G != null)
      bool |= this.G.c();
    if (this.H != null)
      bool |= this.H.c();
    if (this.I != null)
      bool |= this.I.c();
    if (bool)
      bg.d(this);
  }

  private void l()
  {
    if (this.F != null)
      return;
    this.F = new x(getContext());
    if (this.l)
    {
      this.F.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.F.a(getMeasuredHeight(), getMeasuredWidth());
  }

  private void m()
  {
    if (this.H != null)
      return;
    this.H = new x(getContext());
    if (this.l)
    {
      this.H.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.H.a(getMeasuredHeight(), getMeasuredWidth());
  }

  private void n()
  {
    if (this.G != null)
      return;
    this.G = new x(getContext());
    if (this.l)
    {
      this.G.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.G.a(getMeasuredWidth(), getMeasuredHeight());
  }

  private void o()
  {
    if (this.I != null)
      return;
    this.I = new x(getContext());
    if (this.l)
    {
      this.I.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.I.a(getMeasuredWidth(), getMeasuredHeight());
  }

  private void p()
  {
    this.I = null;
    this.G = null;
    this.H = null;
    this.F = null;
  }

  private void q()
  {
    if (this.L != null)
      this.L.clear();
    stopNestedScroll();
    k();
    setScrollState(0);
  }

  private void r()
  {
    this.E = (1 + this.E);
  }

  private void s()
  {
    this.E = (-1 + this.E);
    if (this.E <= 0)
    {
      this.E = 0;
      int i1 = this.z;
      this.z = 0;
      if ((i1 != 0) && (this.C != null) && (this.C.isEnabled()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        localAccessibilityEvent.setEventType(2048);
        android.support.v4.view.a.a.a(localAccessibilityEvent, i1);
        sendAccessibilityEventUnchecked(localAccessibilityEvent);
      }
    }
  }

  private void setScrollState(int paramInt)
  {
    if (paramInt == this.J);
    while (true)
    {
      return;
      this.J = paramInt;
      if (paramInt != 2)
        j();
      if (this.p != null)
        this.p.g(paramInt);
      if (this.V != null)
        this.V.a(this, paramInt);
      if (this.W == null)
        continue;
      for (int i1 = -1 + this.W.size(); i1 >= 0; i1--)
        ((cf)this.W.get(i1)).a(this, paramInt);
    }
  }

  private boolean t()
  {
    return this.E > 0;
  }

  private boolean u()
  {
    return (this.d != null) && (this.d.k());
  }

  private void v()
  {
    if ((!this.ab) && (this.u))
    {
      bg.a(this, this.aj);
      this.ab = true;
    }
  }

  private void w()
  {
    boolean bool1 = true;
    if (this.D)
    {
      this.b.a();
      z();
      this.p.a(this);
    }
    boolean bool2;
    label89: boolean bool3;
    label129: cm localcm2;
    boolean bool4;
    if ((this.d != null) && (this.p.d()))
    {
      this.b.b();
      if (((!this.f) || (this.g)) && (!this.f) && ((!this.g) || (!u())))
        break label206;
      bool2 = bool1;
      cm localcm1 = this.e;
      if ((!this.w) || (this.d == null) || ((!this.D) && (!bool2)) || (this.D))
        break label211;
      bool3 = bool1;
      cm.c(localcm1, bool3);
      localcm2 = this.e;
      if ((!cm.b(this.e)) || (!bool2) || (this.D))
        break label223;
      if ((this.d == null) || (!this.p.d()))
        break label217;
      bool4 = bool1;
      label183: if (!bool4)
        break label223;
    }
    while (true)
    {
      cm.d(localcm2, bool1);
      return;
      this.b.e();
      break;
      label206: bool2 = false;
      break label89;
      label211: bool3 = false;
      break label129;
      label217: bool4 = false;
      break label183;
      label223: bool1 = false;
    }
  }

  private void x()
  {
    int i1 = 0;
    int i2 = this.c.a.a();
    for (int i3 = 0; i3 < i2; i3++)
      ((RecyclerView.LayoutParams)this.c.c(i3).getLayoutParams()).c = true;
    ch localch = this.a;
    int i4 = localch.b.size();
    while (i1 < i4)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((co)localch.b.get(i1)).a.getLayoutParams();
      if (localLayoutParams != null)
        localLayoutParams.c = true;
      i1++;
    }
  }

  private void y()
  {
    int i1 = this.c.a.a();
    for (int i2 = 0; i2 < i1; i2++)
    {
      co localco = b(this.c.c(i2));
      if (localco.b())
        continue;
      localco.a();
    }
    this.a.e();
  }

  private void z()
  {
    int i1 = this.c.a.a();
    for (int i2 = 0; i2 < i1; i2++)
    {
      co localco = b(this.c.c(i2));
      if ((localco == null) || (localco.b()))
        continue;
      localco.a(6);
    }
    x();
    this.a.c();
  }

  public final co a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this))
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    return b(paramView);
  }

  public final void a()
  {
    if (this.p == null)
      return;
    this.p.b(this);
  }

  public final void a(int paramInt)
  {
    i();
    if (this.p == null)
      return;
    this.p.c(paramInt);
    awakenScrollBars();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (this.p == null);
    while (true)
    {
      return;
      if (!this.p.f())
        paramInt1 = 0;
      boolean bool = this.p.g();
      int i1 = 0;
      if (!bool);
      while ((paramInt1 != 0) || (i1 != 0))
      {
        this.U.b(paramInt1, i1);
        return;
        i1 = paramInt2;
      }
    }
  }

  final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = paramInt1 + paramInt2;
    int i2 = this.c.a.a();
    int i3 = 0;
    if (i3 < i2)
    {
      co localco2 = b(this.c.c(i3));
      if ((localco2 != null) && (!localco2.b()))
      {
        if (localco2.b < i1)
          break label87;
        localco2.a(-paramInt2, paramBoolean);
        cm.a(this.e, true);
      }
      while (true)
      {
        i3++;
        break;
        label87: if (localco2.b < paramInt1)
          continue;
        int i6 = paramInt1 - 1;
        int i7 = -paramInt2;
        localco2.a(8);
        localco2.a(i7, paramBoolean);
        localco2.b = i6;
        cm.a(this.e, true);
      }
    }
    ch localch = this.a;
    int i4 = paramInt1 + paramInt2;
    int i5 = -1 + localch.b.size();
    if (i5 >= 0)
    {
      co localco1 = (co)localch.b.get(i5);
      if (localco1 != null)
      {
        if (localco1.d() < i4)
          break label211;
        localco1.a(-paramInt2, paramBoolean);
      }
      while (true)
      {
        i5--;
        break;
        label211: if (localco1.d() < paramInt1)
          continue;
        localco1.a(8);
        localch.d(i5);
      }
    }
    requestLayout();
  }

  public final void a(cc paramcc)
  {
    if (this.p != null)
      this.p.a("Cannot add item decoration during a scroll  or layout");
    if (this.r.isEmpty())
      setWillNotDraw(false);
    this.r.add(paramcc);
    x();
    requestLayout();
  }

  public void a(cf paramcf)
  {
    if (this.W == null)
      this.W = new ArrayList();
    this.W.add(paramcf);
  }

  final void a(String paramString)
  {
    if (t())
    {
      if (paramString == null)
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      throw new IllegalStateException(paramString);
    }
  }

  final void a(boolean paramBoolean)
  {
    if (this.x)
    {
      if ((paramBoolean) && (this.y) && (this.p != null) && (this.o != null))
        c();
      this.x = false;
      this.y = false;
    }
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }

  final void b()
  {
    if (!this.x)
    {
      this.x = true;
      this.y = false;
    }
  }

  final void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      l();
      this.F.a(-paramInt1);
      if (paramInt2 >= 0)
        break label69;
      n();
      this.G.a(-paramInt2);
    }
    while (true)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        bg.d(this);
      return;
      if (paramInt1 <= 0)
        break;
      m();
      this.H.a(paramInt1);
      break;
      label69: if (paramInt2 <= 0)
        continue;
      o();
      this.I.a(paramInt2);
    }
  }

  public final void b(cc paramcc)
  {
    if (this.p != null)
      this.p.a("Cannot remove item decoration during a scroll  or layout");
    this.r.remove(paramcc);
    if (this.r.isEmpty())
      if (bg.a(this) != 2)
        break label60;
    label60: for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      x();
      requestLayout();
      return;
    }
  }

  public void b(cf paramcf)
  {
    if (this.W != null)
      this.W.remove(paramcf);
  }

  final void c()
  {
    if (this.o == null)
      break label7;
    label7: 
    do
      return;
    while (this.p == null);
    this.e.d.clear();
    b();
    r();
    w();
    cm localcm1 = this.e;
    android.support.v4.e.a locala1;
    if ((cm.b(this.e)) && (this.g) && (u()))
      locala1 = new android.support.v4.e.a();
    int[] arrayOfInt;
    label150: int i2;
    int i3;
    int i4;
    label316: int i35;
    while (true)
    {
      localcm1.c = locala1;
      this.g = false;
      this.f = false;
      cm.b(this.e, cm.a(this.e));
      this.e.e = this.o.a();
      arrayOfInt = this.ae;
      int i1 = this.c.a();
      if (i1 == 0)
      {
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        if (cm.b(this.e))
        {
          this.e.a.clear();
          this.e.b.clear();
          int i31 = this.c.a();
          for (int i32 = 0; i32 < i31; i32++)
          {
            co localco10 = b(this.c.b(i32));
            if ((localco10.b()) || (localco10.k()))
              continue;
            View localView3 = localco10.a;
            android.support.v4.e.a locala6 = this.e.a;
            int i33 = localView3.getLeft();
            int i34 = localView3.getTop();
            localView3.getRight();
            localView3.getBottom();
            locala6.put(localco10, new cd(localco10, i33, i34));
          }
          locala1 = null;
          continue;
        }
      }
      else
      {
        i2 = 2147483647;
        i3 = -2147483648;
        i4 = 0;
        if (i4 >= i1)
          break;
        co localco11 = b(this.c.b(i4));
        if (localco11.b())
          break label2096;
        i35 = localco11.d();
        if (i35 < i2)
          i2 = i35;
        if (i35 <= i3)
          break label2096;
      }
    }
    for (int i36 = i2; ; i36 = i2)
    {
      i4++;
      i2 = i36;
      i3 = i35;
      break label316;
      arrayOfInt[0] = i2;
      arrayOfInt[1] = i3;
      break label150;
      android.support.v4.e.a locala5;
      int i26;
      label649: View localView2;
      int i27;
      if (cm.a(this.e))
      {
        int i24 = this.c.a.a();
        for (int i25 = 0; i25 < i24; i25++)
        {
          co localco9 = b(this.c.c(i25));
          if ((localco9.b()) || (localco9.c != -1))
            continue;
          localco9.c = localco9.b;
        }
        if (this.e.c != null)
        {
          int i29 = this.c.a();
          for (int i30 = 0; i30 < i29; i30++)
          {
            co localco8 = b(this.c.b(i30));
            if ((!localco8.m()) || (localco8.o()) || (localco8.b()))
              continue;
            long l4 = localco8.b;
            this.e.c.put(Long.valueOf(l4), localco8);
            this.e.a.remove(localco8);
          }
        }
        boolean bool2 = cm.c(this.e);
        cm.a(this.e, false);
        this.p.c(this.a, this.e);
        cm.a(this.e, bool2);
        locala5 = new android.support.v4.e.a();
        i26 = 0;
        if (i26 < this.c.a())
        {
          localView2 = this.c.b(i26);
          if (!b(localView2).b())
          {
            i27 = 0;
            label686: if (i27 >= this.e.a.size())
              break label2090;
            if (((co)this.e.a.b(i27)).a != localView2)
              break label773;
          }
        }
      }
      label773: label917: label929: label1443: label2084: label2090: for (int i28 = 1; ; i28 = 0)
      {
        if (i28 == 0)
          locala5.put(localView2, new Rect(localView2.getLeft(), localView2.getTop(), localView2.getRight(), localView2.getBottom()));
        i26++;
        break label649;
        i27++;
        break label686;
        y();
        this.b.c();
        for (android.support.v4.e.a locala2 = locala5; ; locala2 = null)
        {
          this.e.e = this.o.a();
          cm.d(this.e);
          cm.b(this.e, false);
          this.p.c(this.a, this.e);
          cm.a(this.e, false);
          this.k = null;
          cm localcm2 = this.e;
          boolean bool1;
          android.support.v4.e.a locala3;
          int i6;
          co localco6;
          View localView1;
          if ((cm.b(this.e)) && (this.d != null))
          {
            bool1 = true;
            cm.c(localcm2, bool1);
            if (!cm.b(this.e))
              break label1972;
            if (this.e.c == null)
              break label1144;
            locala3 = new android.support.v4.e.a();
            int i5 = this.c.a();
            i6 = 0;
            if (i6 >= i5)
              break label1209;
            localco6 = b(this.c.b(i6));
            if (!localco6.b())
            {
              localView1 = localco6.a;
              long l2 = localco6.b;
              if ((locala3 == null) || (this.e.c.get(Long.valueOf(l2)) == null))
                break label1150;
              locala3.put(Long.valueOf(l2), localco6);
            }
          }
          while (true)
          {
            i6++;
            break label929;
            y();
            this.b.e();
            if (this.e.c == null)
              break label2084;
            int i22 = this.c.a();
            for (int i23 = 0; i23 < i22; i23++)
            {
              co localco7 = b(this.c.b(i23));
              if ((!localco7.m()) || (localco7.o()) || (localco7.b()))
                continue;
              long l3 = localco7.b;
              this.e.c.put(Long.valueOf(l3), localco7);
              this.e.a.remove(localco7);
            }
            bool1 = false;
            break;
            label1144: locala3 = null;
            break label917;
            label1150: android.support.v4.e.a locala4 = this.e.b;
            int i20 = localView1.getLeft();
            int i21 = localView1.getTop();
            localView1.getRight();
            localView1.getBottom();
            locala4.put(localco6, new cd(localco6, i20, i21));
          }
          label1209: a(locala2);
          for (int i7 = -1 + this.e.a.size(); i7 >= 0; i7--)
          {
            co localco5 = (co)this.e.a.b(i7);
            if (this.e.b.containsKey(localco5))
              continue;
            cd localcd4 = (cd)this.e.a.c(i7);
            this.e.a.d(i7);
            this.a.b(localcd4.a);
            a(localcd4);
          }
          int i8 = this.e.b.size();
          if (i8 > 0)
          {
            int i17 = i8 - 1;
            if (i17 >= 0)
            {
              co localco4 = (co)this.e.b.b(i17);
              cd localcd3 = (cd)this.e.b.c(i17);
              Rect localRect;
              if ((this.e.a.isEmpty()) || (!this.e.a.containsKey(localco4)))
              {
                this.e.b.d(i17);
                if (locala2 == null)
                  break label1524;
                localRect = (Rect)locala2.get(localco4.a);
                int i18 = localcd3.b;
                int i19 = localcd3.c;
                if ((localRect == null) || ((localRect.left == i18) && (localRect.top == i19)))
                  break label1530;
                localco4.a(false);
                if (this.d.a(localco4, localRect.left, localRect.top, i18, i19))
                  v();
              }
              while (true)
              {
                i17--;
                break;
                label1524: localRect = null;
                break label1443;
                label1530: localco4.a(false);
                this.d.b(localco4);
                v();
              }
            }
          }
          int i9 = this.e.b.size();
          for (int i10 = 0; i10 < i9; i10++)
          {
            co localco3 = (co)this.e.b.b(i10);
            cd localcd1 = (cd)this.e.b.c(i10);
            cd localcd2 = (cd)this.e.a.get(localco3);
            if ((localcd2 == null) || (localcd1 == null) || ((localcd2.b == localcd1.b) && (localcd2.c == localcd1.c)))
              continue;
            localco3.a(false);
            if (!this.d.a(localco3, localcd2.b, localcd2.c, localcd1.b, localcd1.c))
              continue;
            v();
          }
          int i11;
          int i12;
          label1738: co localco1;
          co localco2;
          int i13;
          int i14;
          int i15;
          int i16;
          if (this.e.c != null)
          {
            i11 = this.e.c.size();
            i12 = i11 - 1;
            if (i12 < 0)
              break label1972;
            long l1 = ((Long)this.e.c.b(i12)).longValue();
            localco1 = (co)this.e.c.get(Long.valueOf(l1));
            if ((!localco1.b()) && (ch.a(this.a) != null) && (ch.a(this.a).contains(localco1)))
            {
              localco2 = (co)locala3.get(Long.valueOf(l1));
              localco1.a(false);
              a(localco1);
              localco1.f = localco2;
              this.a.b(localco1);
              i13 = localco1.a.getLeft();
              i14 = localco1.a.getTop();
              if ((localco2 != null) && (!localco2.b()))
                break label1936;
              i15 = i14;
              i16 = i13;
            }
          }
          while (true)
          {
            this.d.a(localco1, localco2, i13, i14, i16, i15);
            v();
            i12--;
            break label1738;
            i11 = 0;
            break;
            i16 = localco2.a.getLeft();
            i15 = localco2.a.getTop();
            localco2.a(false);
            localco2.g = localco1;
          }
          label1972: a(false);
          this.p.b(this.a);
          cm.b(this.e, this.e.e);
          this.D = false;
          cm.c(this.e, false);
          cm.d(this.e, false);
          s();
          if (ch.a(this.a) != null)
            ch.a(this.a).clear();
          this.e.c = null;
          if (!g(this.ae[0], this.ae[1]))
            break;
          d(0, 0);
          return;
        }
      }
      label1936: label2096: i35 = i3;
    }
  }

  final void c(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = this.c.a.a();
    int i3 = paramInt1 + paramInt2;
    for (int i4 = 0; i4 < i2; i4++)
    {
      View localView = this.c.c(i4);
      co localco2 = b(localView);
      if ((localco2 == null) || (localco2.b()) || (localco2.b < paramInt1) || (localco2.b >= i3))
        continue;
      localco2.a(2);
      if (u())
        localco2.a(64);
      ((RecyclerView.LayoutParams)localView.getLayoutParams()).c = true;
    }
    ch localch = this.a;
    int i5 = paramInt1 + paramInt2;
    int i6 = localch.b.size();
    while (i1 < i6)
    {
      co localco1 = (co)localch.b.get(i1);
      if (localco1 != null)
      {
        int i7 = localco1.d();
        if ((i7 >= paramInt1) && (i7 < i5))
          localco1.a(2);
      }
      i1++;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof RecyclerView.LayoutParams)) && (this.p.a((RecyclerView.LayoutParams)paramLayoutParams));
  }

  public int computeHorizontalScrollExtent()
  {
    if (this.p.f())
      return this.p.c(this.e);
    return 0;
  }

  public int computeHorizontalScrollOffset()
  {
    if (this.p.f())
      return this.p.a(this.e);
    return 0;
  }

  public int computeHorizontalScrollRange()
  {
    if (this.p.f())
      return this.p.e(this.e);
    return 0;
  }

  public int computeVerticalScrollExtent()
  {
    if (this.p.g())
      return this.p.d(this.e);
    return 0;
  }

  public int computeVerticalScrollOffset()
  {
    if (this.p.g())
      return this.p.b(this.e);
    return 0;
  }

  public int computeVerticalScrollRange()
  {
    if (this.p.g())
      return this.p.f(this.e);
    return 0;
  }

  final void d()
  {
    int i1 = this.c.a();
    int i2 = 0;
    if (i2 < i1)
    {
      co localco = b(this.c.b(i2));
      if ((localco != null) && (!localco.b()))
      {
        if ((!localco.o()) && (!localco.k()))
          break label62;
        requestLayout();
      }
      while (true)
      {
        i2++;
        break;
        label62: if (!localco.l())
          continue;
        int i3 = this.o.a(localco.b);
        if (localco.d != i3)
          break label127;
        if ((!localco.m()) || (!u()))
        {
          this.o.b(localco, localco.b);
          continue;
        }
        requestLayout();
      }
      label127: requestLayout();
    }
  }

  final void d(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    if (this.V != null)
      this.V.a(this, paramInt1, paramInt2);
    if (this.W != null)
      for (int i3 = -1 + this.W.size(); i3 >= 0; i3--)
        ((cf)this.W.get(i3)).a(this, paramInt1, paramInt2);
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.af.a(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.af.a(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.af.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.af.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2 = this.r.size();
    for (int i3 = 0; i3 < i2; i3++)
      this.r.get(i3);
    int i14;
    int i4;
    if ((this.F != null) && (!this.F.a()))
    {
      int i13 = paramCanvas.save();
      if (this.l)
      {
        i14 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i14 + -getHeight(), 0.0F);
        if ((this.F == null) || (!this.F.a(paramCanvas)))
          break label455;
        i4 = i1;
        label118: paramCanvas.restoreToCount(i13);
      }
    }
    while (true)
    {
      int i12;
      label189: int i9;
      label244: int i10;
      if ((this.G != null) && (!this.G.a()))
      {
        int i11 = paramCanvas.save();
        if (this.l)
          paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        if ((this.G != null) && (this.G.a(paramCanvas)))
        {
          i12 = i1;
          i4 |= i12;
          paramCanvas.restoreToCount(i11);
        }
      }
      else
      {
        if ((this.H != null) && (!this.H.a()))
        {
          int i7 = paramCanvas.save();
          int i8 = getWidth();
          if (!this.l)
            break label467;
          i9 = getPaddingTop();
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i9, -i8);
          if ((this.H == null) || (!this.H.a(paramCanvas)))
            break label473;
          i10 = i1;
          label284: i4 |= i10;
          paramCanvas.restoreToCount(i7);
        }
        if ((this.I != null) && (!this.I.a()))
        {
          int i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.l)
            break label479;
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label360: x localx = this.I;
          int i6 = 0;
          if (localx != null)
          {
            boolean bool = this.I.a(paramCanvas);
            i6 = 0;
            if (bool)
              i6 = i1;
          }
          i4 |= i6;
          paramCanvas.restoreToCount(i5);
        }
        if ((i4 != 0) || (this.d == null) || (this.r.size() <= 0) || (!this.d.b()))
          break label498;
      }
      while (true)
      {
        if (i1 != 0)
          bg.d(this);
        return;
        i14 = 0;
        break;
        label455: i4 = 0;
        break label118;
        i12 = 0;
        break label189;
        label467: i9 = 0;
        break label244;
        label473: i10 = 0;
        break label284;
        label479: paramCanvas.translate(-getWidth(), -getHeight());
        break label360;
        label498: i1 = i4;
      }
      i4 = 0;
    }
  }

  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }

  final Rect e(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.c)
      return localLayoutParams.b;
    Rect localRect = localLayoutParams.b;
    localRect.set(0, 0, 0, 0);
    int i1 = this.r.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.n.set(0, 0, 0, 0);
      ((cc)this.r.get(i2)).a(this.n, paramView, this, this.e);
      localRect.left += this.n.left;
      localRect.top += this.n.top;
      localRect.right += this.n.right;
      localRect.bottom += this.n.bottom;
    }
    localLayoutParams.c = false;
    return localRect;
  }

  public final boolean e()
  {
    return (!this.w) || (this.D) || (this.b.d());
  }

  public View focusSearch(View paramView, int paramInt)
  {
    View localView = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    if ((localView == null) && (this.o != null) && (this.p != null))
    {
      b();
      localView = this.p.c(paramInt, this.a, this.e);
      a(false);
    }
    if (localView != null)
      return localView;
    return super.focusSearch(paramView, paramInt);
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.a();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.a(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.a(paramLayoutParams);
  }

  public by getAdapter()
  {
    return this.o;
  }

  public int getBaseline()
  {
    if (this.p != null)
      return -1;
    return super.getBaseline();
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ad == null)
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    return this.ad.a();
  }

  public cp getCompatAccessibilityDelegate()
  {
    return this.ac;
  }

  public ca getItemAnimator()
  {
    return this.d;
  }

  public ce getLayoutManager()
  {
    return this.p;
  }

  public int getMaxFlingVelocity()
  {
    return this.S;
  }

  public int getMinFlingVelocity()
  {
    return this.R;
  }

  public cg getRecycledViewPool()
  {
    return this.a.d();
  }

  public int getScrollState()
  {
    return this.J;
  }

  public boolean hasNestedScrollingParent()
  {
    return this.af.c();
  }

  public boolean isAttachedToWindow()
  {
    return this.u;
  }

  public boolean isNestedScrollingEnabled()
  {
    return this.af.b();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.E = 0;
    this.u = true;
    this.w = false;
    this.ab = false;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.d != null)
      this.d.c();
    this.w = false;
    i();
    this.u = false;
    if (this.p != null)
      this.p.a(this, this.a);
    removeCallbacks(this.aj);
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.r.size();
    for (int i2 = 0; i2 < i1; i2++)
      ((cc)this.r.get(i2)).a(paramCanvas, this);
  }

  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.p == null);
    label100: label103: 
    while (true)
    {
      return false;
      if (((0x2 & al.d(paramMotionEvent)) == 0) || (paramMotionEvent.getAction() != 8))
        continue;
      float f1;
      float f2;
      if (this.p.g())
      {
        f1 = al.e(paramMotionEvent, 9);
        if (!this.p.f())
          break label100;
        f2 = al.e(paramMotionEvent, 10);
      }
      while (true)
      {
        if ((f1 == 0.0F) && (f2 == 0.0F))
          break label103;
        float f3 = getScrollFactor();
        scrollBy((int)(f2 * f3), (int)(f1 * f3));
        return false;
        f1 = 0.0F;
        break;
        f2 = 0.0F;
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0))
      this.t = null;
    int i3 = this.s.size();
    int i4 = 0;
    if (i4 < i3)
    {
      f localf = (f)this.s.get(i4);
      if ((localf.b()) && (i2 != 3))
        this.t = localf;
    }
    for (int i5 = 1; ; i5 = 0)
    {
      if (i5 == 0)
        break label101;
      q();
      return true;
      i4++;
      break;
    }
    label101: boolean bool1 = this.p.f();
    boolean bool2 = this.p.g();
    if (this.L == null)
      this.L = VelocityTracker.obtain();
    this.L.addMovement(paramMotionEvent);
    int i6 = al.a(paramMotionEvent);
    int i7 = al.b(paramMotionEvent);
    switch (i6)
    {
    case 4:
    default:
      if (this.J == 1)
        break;
      return false;
    case 0:
      label196: this.K = al.b(paramMotionEvent, 0);
      int i21 = (int)(0.5F + paramMotionEvent.getX());
      this.O = i21;
      this.M = i21;
      int i22 = (int)(0.5F + paramMotionEvent.getY());
      this.P = i22;
      this.N = i22;
      if (this.J == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      if (!bool1);
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    for (int i23 = 1; ; i23 = 0)
    {
      if (bool2)
        i23 |= 2;
      startNestedScroll(i23);
      break label196;
      this.K = al.b(paramMotionEvent, i7);
      int i19 = (int)(0.5F + al.c(paramMotionEvent, i7));
      this.O = i19;
      this.M = i19;
      int i20 = (int)(0.5F + al.d(paramMotionEvent, i7));
      this.P = i20;
      this.N = i20;
      break label196;
      int i8 = al.a(paramMotionEvent, this.K);
      if (i8 < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.K).append(" not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i9 = (int)(0.5F + al.c(paramMotionEvent, i8));
      int i10 = (int)(0.5F + al.d(paramMotionEvent, i8));
      if (this.J == 1)
        break label196;
      int i11 = i9 - this.M;
      int i12 = i10 - this.N;
      int i18;
      if ((bool1) && (Math.abs(i11) > this.Q))
      {
        int i16 = this.M;
        int i17 = this.Q;
        if (i11 < 0)
        {
          i18 = i1;
          label506: this.O = (i16 + i18 * i17);
        }
      }
      for (int i13 = 1; ; i13 = 0)
      {
        int i14;
        int i15;
        if ((bool2) && (Math.abs(i12) > this.Q))
        {
          i14 = this.N;
          i15 = this.Q;
          if (i12 >= 0)
            break label588;
        }
        while (true)
        {
          this.P = (i14 + i1 * i15);
          i13 = 1;
          if (i13 == 0)
            break;
          setScrollState(1);
          break;
          i18 = 1;
          break label506;
          label588: i1 = 1;
        }
        a(paramMotionEvent);
        break label196;
        this.L.clear();
        stopNestedScroll();
        break label196;
        q();
        break label196;
        break;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b();
    android.support.v4.c.a.a("RV OnLayout");
    c();
    android.support.v4.c.a.a();
    a(false);
    this.w = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.A)
    {
      b();
      w();
      if (cm.a(this.e))
      {
        cm.b(this.e, true);
        this.A = false;
        a(false);
      }
    }
    else
    {
      if (this.o == null)
        break label107;
      this.e.e = this.o.a();
      label65: if (this.p != null)
        break label118;
      f(paramInt1, paramInt2);
    }
    while (true)
    {
      cm.b(this.e, false);
      return;
      this.b.e();
      cm.b(this.e, false);
      break;
      label107: this.e.e = 0;
      break label65;
      label118: this.p.a(this.a, this.e, paramInt1, paramInt2);
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.k = ((RecyclerView.SavedState)paramParcelable);
    super.onRestoreInstanceState(this.k.getSuperState());
    if ((this.p != null) && (this.k.a != null))
      this.p.a(this.k.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new RecyclerView.SavedState(super.onSaveInstanceState());
    if (this.k != null)
    {
      RecyclerView.SavedState.a(localSavedState, this.k);
      return localSavedState;
    }
    if (this.p != null)
    {
      localSavedState.a = this.p.e();
      return localSavedState;
    }
    localSavedState.a = null;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
      p();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i24;
    int i2;
    if (this.t != null)
    {
      if (i1 == 0)
        this.t = null;
    }
    else
    {
      if (i1 == 0)
        break label112;
      int i23 = this.s.size();
      i24 = 0;
      if (i24 >= i23)
        break label112;
      f localf = (f)this.s.get(i24);
      if (!localf.b())
        break label106;
      this.t = localf;
      i2 = 1;
    }
    while (true)
    {
      if (i2 == 0)
        break label117;
      q();
      return true;
      if ((i1 == 3) || (i1 == 1))
        this.t = null;
      i2 = 1;
      continue;
      label106: i24++;
      break;
      label112: i2 = 0;
    }
    label117: boolean bool1 = this.p.f();
    boolean bool2 = this.p.g();
    if (this.L == null)
      this.L = VelocityTracker.obtain();
    this.L.addMovement(paramMotionEvent);
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = al.a(paramMotionEvent);
    int i4 = al.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt3 = this.ai;
      this.ai[1] = 0;
      arrayOfInt3[0] = 0;
    }
    localMotionEvent.offsetLocation(this.ai[0], this.ai[1]);
    switch (i3)
    {
    case 4:
    default:
      localMotionEvent.recycle();
      return true;
    case 0:
      this.K = al.b(paramMotionEvent, 0);
      int i20 = (int)(0.5F + paramMotionEvent.getX());
      this.O = i20;
      this.M = i20;
      int i21 = (int)(0.5F + paramMotionEvent.getY());
      this.P = i21;
      this.N = i21;
      if (!bool1)
        break;
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    label640: label674: label835: label979: for (int i22 = 1; ; i22 = 0)
    {
      if (bool2)
        i22 |= 2;
      startNestedScroll(i22);
      break;
      this.K = al.b(paramMotionEvent, i4);
      int i18 = (int)(0.5F + al.c(paramMotionEvent, i4));
      this.O = i18;
      this.M = i18;
      int i19 = (int)(0.5F + al.d(paramMotionEvent, i4));
      this.P = i19;
      this.N = i19;
      break;
      int i12 = al.a(paramMotionEvent, this.K);
      if (i12 < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.K).append(" not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i13 = (int)(0.5F + al.c(paramMotionEvent, i12));
      int i14 = (int)(0.5F + al.d(paramMotionEvent, i12));
      int i15 = this.O - i13;
      int i16 = this.P - i14;
      if (dispatchNestedPreScroll(i15, i16, this.ah, this.ag))
      {
        i15 -= this.ah[0];
        i16 -= this.ah[1];
        localMotionEvent.offsetLocation(this.ag[0], this.ag[1]);
        int[] arrayOfInt1 = this.ai;
        arrayOfInt1[0] += this.ag[0];
        int[] arrayOfInt2 = this.ai;
        arrayOfInt2[1] += this.ag[1];
      }
      if (this.J != 1)
      {
        if ((!bool1) || (Math.abs(i15) <= this.Q))
          break label1118;
        if (i15 <= 0)
          break label757;
        i15 -= this.Q;
      }
      label726: label854: label1111: label1118: for (int i17 = 1; ; i17 = 0)
      {
        if ((bool2) && (Math.abs(i16) > this.Q))
        {
          if (i16 > 0)
          {
            i16 -= this.Q;
            i17 = 1;
          }
        }
        else
        {
          if (i17 != 0)
            setScrollState(1);
          if (this.J != 1)
            break;
          this.O = (i13 - this.ag[0]);
          this.P = (i14 - this.ag[1]);
          if (!bool1)
            break label781;
          if (!bool2)
            break label787;
        }
        while (a(i15, i16, localMotionEvent))
        {
          getParent().requestDisallowInterceptTouchEvent(true);
          break;
          label757: i15 += this.Q;
          break label640;
          i16 += this.Q;
          break label674;
          i15 = 0;
          break label726;
          i16 = 0;
        }
        a(paramMotionEvent);
        break;
        this.L.computeCurrentVelocity(1000, this.S);
        float f1;
        float f2;
        int i5;
        int i6;
        boolean bool3;
        boolean bool4;
        if (bool1)
        {
          f1 = -bc.a(this.L, this.K);
          if (!bool2)
            break label1079;
          f2 = -bc.b(this.L, this.K);
          if ((f1 != 0.0F) || (f2 != 0.0F))
          {
            i5 = (int)f1;
            i6 = (int)f2;
            if (this.p == null)
              break label1091;
            bool3 = this.p.f();
            bool4 = this.p.g();
            if ((bool3) && (Math.abs(i5) >= this.R))
              break label1111;
          }
        }
        for (int i8 = 0; ; i8 = i5)
        {
          if ((!bool4) || (Math.abs(i6) < this.R));
          for (int i9 = 0; ; i9 = i6)
          {
            boolean bool5;
            if (((i8 != 0) || (i9 != 0)) && (!dispatchNestedPreFling(i8, i9)))
              if ((bool3) || (bool4))
              {
                bool5 = true;
                dispatchNestedFling(i8, i9, bool5);
                if (!bool5)
                  break label1091;
                int i10 = Math.max(-this.S, Math.min(i8, this.S));
                int i11 = Math.max(-this.S, Math.min(i9, this.S));
                this.U.a(i10, i11);
              }
            for (int i7 = 1; ; i7 = 0)
            {
              if (i7 == 0)
                setScrollState(0);
              this.L.clear();
              k();
              break;
              f1 = 0.0F;
              break label835;
              f2 = 0.0F;
              break label854;
              bool5 = false;
              break label979;
            }
            q();
            break;
          }
        }
      }
    }
  }

  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    co localco = b(paramView);
    if (localco != null)
    {
      if (!localco.q())
        break label32;
      localco.j();
    }
    label32: 
    do
    {
      f(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    while (localco.b());
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localco);
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    int i1;
    Rect localRect1;
    if ((this.p.o()) || (t()))
    {
      i1 = 1;
      if ((i1 == 0) && (paramView2 != null))
      {
        this.n.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
        ViewGroup.LayoutParams localLayoutParams = paramView2.getLayoutParams();
        if ((localLayoutParams instanceof RecyclerView.LayoutParams))
        {
          RecyclerView.LayoutParams localLayoutParams1 = (RecyclerView.LayoutParams)localLayoutParams;
          if (!localLayoutParams1.c)
          {
            Rect localRect2 = localLayoutParams1.b;
            Rect localRect3 = this.n;
            localRect3.left -= localRect2.left;
            Rect localRect4 = this.n;
            localRect4.right += localRect2.right;
            Rect localRect5 = this.n;
            localRect5.top -= localRect2.top;
            Rect localRect6 = this.n;
            localRect6.bottom += localRect2.bottom;
          }
        }
        offsetDescendantRectToMyCoords(paramView2, this.n);
        offsetRectIntoDescendantCoords(paramView1, this.n);
        localRect1 = this.n;
        if (this.w)
          break label224;
      }
    }
    label224: for (boolean bool = true; ; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, localRect1, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
      i1 = 0;
      break;
    }
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    ce localce = this.p;
    int i1 = localce.s();
    int i2 = localce.t();
    int i3 = localce.q() - localce.u();
    int i4 = localce.r() - localce.v();
    int i5 = paramView.getLeft() + paramRect.left;
    int i6 = paramView.getTop() + paramRect.top;
    int i7 = i5 + paramRect.width();
    int i8 = i6 + paramRect.height();
    int i9 = Math.min(0, i5 - i1);
    int i10 = Math.min(0, i6 - i2);
    int i11 = Math.max(0, i7 - i3);
    int i12 = Math.max(0, i8 - i4);
    int i14;
    int i15;
    if (bg.h(localce.f) == 1)
      if (i11 != 0)
      {
        i14 = i11;
        if (i10 == 0)
          break label230;
        i15 = i10;
        label160: if ((i14 == 0) && (i15 == 0))
          break label256;
        if (!paramBoolean)
          break label245;
        scrollBy(i14, i15);
      }
    while (true)
    {
      return true;
      i11 = Math.max(i9, i7 - i3);
      break;
      if (i9 != 0);
      for (int i13 = i9; ; i13 = Math.min(i5 - i1, i11))
      {
        i14 = i13;
        break;
      }
      label230: i15 = Math.min(i6 - i2, i12);
      break label160;
      label245: a(i14, i15);
    }
    label256: return false;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i1 = this.s.size();
    for (int i2 = 0; i2 < i1; i2++)
      this.s.get(i2);
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    if (!this.x)
    {
      super.requestLayout();
      return;
    }
    this.y = true;
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.p == null);
    boolean bool1;
    boolean bool2;
    do
    {
      return;
      bool1 = this.p.f();
      bool2 = this.p.g();
    }
    while ((!bool1) && (!bool2));
    if (bool1)
      if (!bool2)
        break label57;
    while (true)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label57: paramInt2 = 0;
    }
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
  }

  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = t();
    int i1 = 0;
    if (bool)
      if (paramAccessibilityEvent == null)
        break label60;
    label60: for (int i2 = android.support.v4.view.a.a.b(paramAccessibilityEvent); ; i2 = 0)
    {
      int i3 = 0;
      if (i2 == 0);
      while (true)
      {
        this.z = (i3 | this.z);
        i1 = 1;
        if (i1 != 0)
          return;
        super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        return;
        i3 = i2;
      }
    }
  }

  public void setAccessibilityDelegateCompat(cp paramcp)
  {
    this.ac = paramcp;
    bg.a(this, this.ac);
  }

  public void setAdapter(by paramby)
  {
    if (this.o != null)
      this.o.b(this.j);
    if (this.d != null)
      this.d.c();
    if (this.p != null)
    {
      ce localce = this.p;
      ch localch2 = this.a;
      for (int i1 = -1 + localce.p(); i1 >= 0; i1--)
      {
        if (b(localce.d(i1)).b())
          continue;
        localce.a(i1, localch2);
      }
      this.p.b(this.a);
    }
    this.a.a();
    this.b.a();
    by localby1 = this.o;
    this.o = paramby;
    if (paramby != null)
      paramby.a(this.j);
    ch localch1 = this.a;
    by localby2 = this.o;
    localch1.a();
    localch1.d().a(localby1, localby2);
    cm.a(this.e, true);
    z();
    requestLayout();
  }

  public void setChildDrawingOrderCallback$65aef0ea(f paramf)
  {
    if (paramf == this.ad)
      return;
    this.ad = paramf;
    if (this.ad != null);
    for (boolean bool = true; ; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
      p();
    this.l = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.w)
      requestLayout();
  }

  public void setHasFixedSize(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }

  public void setItemAnimator(ca paramca)
  {
    if (this.d != null)
    {
      this.d.c();
      this.d.a(null);
    }
    this.d = paramca;
    if (this.d != null)
      this.d.a(this.aa);
  }

  public void setItemViewCacheSize(int paramInt)
  {
    this.a.a(paramInt);
  }

  public void setLayoutManager(ce paramce)
  {
    if (paramce == this.p)
      return;
    if (this.p != null)
    {
      if (this.u)
        this.p.a(this, this.a);
      this.p.c(null);
    }
    this.a.a();
    p localp = this.c;
    localp.b.a();
    localp.c.clear();
    localp.a.b();
    this.p = paramce;
    if (paramce != null)
    {
      if (paramce.f != null)
        throw new IllegalArgumentException("LayoutManager " + paramce + " is already attached to a RecyclerView: " + paramce.f);
      this.p.c(this);
    }
    requestLayout();
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.af.a(paramBoolean);
  }

  @Deprecated
  public void setOnScrollListener(cf paramcf)
  {
    this.V = paramcf;
  }

  public void setRecycledViewPool(cg paramcg)
  {
    this.a.a(paramcg);
  }

  public void setRecyclerListener$cc56996(f paramf)
  {
    this.q = paramf;
  }

  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default:
      new StringBuilder("setScrollingTouchSlop(): bad argument constant ").append(paramInt).append("; using default value");
    case 0:
      this.Q = localViewConfiguration.getScaledTouchSlop();
      return;
    case 1:
    }
    this.Q = bs.a(localViewConfiguration);
  }

  public void setViewCacheExtension$7dcbd027(b paramb)
  {
    this.a.a(paramb);
  }

  public boolean startNestedScroll(int paramInt)
  {
    return this.af.a(paramInt);
  }

  public void stopNestedScroll()
  {
    this.af.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView
 * JD-Core Version:    0.6.0
 */