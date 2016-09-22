package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.bg;
import android.support.v7.gridlayout.R.dimen;
import android.support.v7.gridlayout.R.styleable;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.reflect.Array;
import java.util.Arrays;

public class GridLayout extends ViewGroup
{
  private static an A;
  private static an B;
  private static an C;
  static final an b;
  public static final an c;
  public static final an d;
  public static final an e;
  private static Printer f = new LogPrinter(3, GridLayout.class.getName());
  private static Printer g = new ae();
  private static final int h = R.styleable.GridLayout_orientation;
  private static final int i = R.styleable.GridLayout_rowCount;
  private static final int j = R.styleable.GridLayout_columnCount;
  private static final int k = R.styleable.GridLayout_useDefaultMargins;
  private static final int l = R.styleable.GridLayout_alignmentMode;
  private static final int m = R.styleable.GridLayout_rowOrderPreserved;
  private static final int n = R.styleable.GridLayout_columnOrderPreserved;
  private static final an v;
  private static final an w;
  private static an x;
  private static an y;
  private static an z;
  Printer a = f;
  private ap o = new ap(this, true, 0);
  private ap p = new ap(this, false, 0);
  private int q = 0;
  private boolean r = false;
  private int s = 1;
  private int t;
  private int u = 0;

  static
  {
    b = new af();
    v = new ag();
    w = new ah();
    x = v;
    y = w;
    c = v;
    z = w;
    A = a(c, z);
    B = a(z, c);
    C = new aj();
    d = new ak();
    e = new am();
  }

  public GridLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public GridLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.t = paramContext.getResources().getDimensionPixelOffset(R.dimen.default_gap);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.GridLayout);
    try
    {
      setRowCount(localTypedArray.getInt(i, -2147483648));
      setColumnCount(localTypedArray.getInt(j, -2147483648));
      setOrientation(localTypedArray.getInt(h, 0));
      setUseDefaultMargins(localTypedArray.getBoolean(k, false));
      setAlignmentMode(localTypedArray.getInt(l, 1));
      setRowOrderPreserved(localTypedArray.getBoolean(m, true));
      setColumnOrderPreserved(localTypedArray.getBoolean(n, true));
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  private static int a(int paramInt1, int paramInt2)
  {
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1 + paramInt2), View.MeasureSpec.getMode(paramInt1));
  }

  static int a(int[] paramArrayOfInt)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = paramArrayOfInt.length;
    while (i2 < i3)
    {
      i1 = Math.max(i1, paramArrayOfInt[i2]);
      i2++;
    }
    return i1;
  }

  static GridLayout.LayoutParams a(View paramView)
  {
    return (GridLayout.LayoutParams)paramView.getLayoutParams();
  }

  static an a(int paramInt, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = 7;
      label7: if (!paramBoolean)
        break label86;
    }
    label86: for (int i2 = 0; ; i2 = 4)
      switch ((i1 & paramInt) >> i2)
      {
      default:
        return b;
        i1 = 112;
        break label7;
      case 3:
      case 5:
      case 7:
      case 1:
      case 8388611:
      case 8388613:
      }
    if (paramBoolean)
      return A;
    return x;
    if (paramBoolean)
      return B;
    return y;
    return e;
    return C;
    return c;
    return z;
  }

  private static an a(an paraman1, an paraman2)
  {
    return new ai(paraman1, paraman2);
  }

  public static av a()
  {
    return a(-2147483648, 1, b, 0.0F);
  }

  public static av a(int paramInt1, int paramInt2, an paraman, float paramFloat)
  {
    if (paramInt1 != -2147483648);
    for (boolean bool = true; ; bool = false)
      return new av(bool, paramInt1, paramInt2, paraman, paramFloat, 0);
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      GridLayout.LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (GridLayout.LayoutParams)localView.getLayoutParams();
        if (!paramBoolean)
          break label72;
        a(localView, paramInt1, paramInt2, localLayoutParams.width, localLayoutParams.height);
      }
      while (true)
      {
        i2++;
        break;
        label72: boolean bool;
        label82: av localav;
        label94: as localas;
        if (this.q == 0)
        {
          bool = true;
          if (!bool)
            break label189;
          localav = localLayoutParams.b;
          if (localav.a(bool) != e)
            break label197;
          localas = localav.c;
          if (!bool)
            break label199;
        }
        int i3;
        label189: label197: label199: for (ap localap = this.o; ; localap = this.p)
        {
          int[] arrayOfInt = localap.e();
          i3 = arrayOfInt[localas.b] - arrayOfInt[localas.a] - b(localView, bool);
          if (!bool)
            break label208;
          a(localView, paramInt1, paramInt2, i3, localLayoutParams.height);
          break;
          bool = false;
          break label82;
          localav = localLayoutParams.a;
          break label94;
          break;
        }
        label208: a(localView, paramInt1, paramInt2, localLayoutParams.width, i3);
      }
    }
  }

  private static void a(GridLayout.LayoutParams paramLayoutParams, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    as localas1 = new as(paramInt1, paramInt1 + paramInt2);
    paramLayoutParams.a = paramLayoutParams.a.a(localas1);
    as localas2 = new as(paramInt3, paramInt3 + paramInt4);
    paramLayoutParams.b = paramLayoutParams.b.a(localas2);
  }

  private void a(GridLayout.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    String str;
    av localav;
    label18: as localas;
    if (paramBoolean)
    {
      str = "column";
      if (!paramBoolean)
        break label184;
      localav = paramLayoutParams.b;
      localas = localav.c;
      if ((localas.a != -2147483648) && (localas.a < 0))
        b(str + " indices must be positive");
      if (!paramBoolean)
        break label193;
    }
    label184: label193: for (ap localap = this.o; ; localap = this.p)
    {
      int i1 = localap.b;
      if (i1 != -2147483648)
      {
        if (localas.b > i1)
          b(str + " indices (start + span) mustn't exceed the " + str + " count");
        if (localas.a() > i1)
          b(str + " span mustn't exceed the " + str + " count");
      }
      return;
      str = "row";
      break;
      localav = paramLayoutParams.a;
      break label18;
    }
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.measure(getChildMeasureSpec(paramInt1, b(paramView, true), paramInt3), getChildMeasureSpec(paramInt2, b(paramView, false), paramInt4));
  }

  static boolean a(int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }

  static <T> T[] a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT1.getClass().getComponentType(), paramArrayOfT1.length + paramArrayOfT2.length);
    System.arraycopy(paramArrayOfT1, 0, arrayOfObject, 0, paramArrayOfT1.length);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, paramArrayOfT1.length, paramArrayOfT2.length);
    return arrayOfObject;
  }

  private int b(View paramView, boolean paramBoolean)
  {
    return b(paramView, paramBoolean, true) + b(paramView, paramBoolean, false);
  }

  private int b(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.s == 1)
      return a(paramView, paramBoolean1, paramBoolean2);
    ap localap;
    int[] arrayOfInt;
    label37: GridLayout.LayoutParams localLayoutParams;
    av localav;
    if (paramBoolean1)
    {
      localap = this.o;
      if (!paramBoolean2)
        break label86;
      arrayOfInt = localap.c();
      localLayoutParams = (GridLayout.LayoutParams)paramView.getLayoutParams();
      if (!paramBoolean1)
        break label96;
      localav = localLayoutParams.b;
      label57: if (!paramBoolean2)
        break label106;
    }
    label86: label96: label106: for (int i1 = localav.c.a; ; i1 = localav.c.b)
    {
      return arrayOfInt[i1];
      localap = this.p;
      break;
      arrayOfInt = localap.d();
      break label37;
      localav = localLayoutParams.a;
      break label57;
    }
  }

  private static void b(String paramString)
  {
    throw new IllegalArgumentException(paramString + ". ");
  }

  private boolean b()
  {
    return bg.h(this) == 1;
  }

  private static int c(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
      return paramView.getMeasuredWidth();
    return paramView.getMeasuredHeight();
  }

  private void c()
  {
    this.u = 0;
    this.o.f();
    this.p.f();
    d();
  }

  private void d()
  {
    this.o.g();
    this.p.g();
  }

  private int e()
  {
    int i1 = 1;
    int i2 = getChildCount();
    int i3 = 0;
    GridLayout.LayoutParams localLayoutParams;
    if (i3 < i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 8)
        break label64;
      localLayoutParams = (GridLayout.LayoutParams)localView.getLayoutParams();
    }
    label64: for (int i4 = i1 * 31 + localLayoutParams.hashCode(); ; i4 = i1)
    {
      i3++;
      i1 = i4;
      break;
      return i1;
    }
  }

  private void f()
  {
    int i1;
    ap localap;
    label25: int i2;
    label39: int i3;
    int i4;
    int[] arrayOfInt;
    int i6;
    GridLayout.LayoutParams localLayoutParams;
    av localav1;
    label91: boolean bool1;
    int i7;
    av localav2;
    label135: as localas2;
    boolean bool2;
    int i8;
    if (this.u == 0)
      if (this.q == 0)
      {
        i1 = 1;
        if (i1 == 0)
          break label225;
        localap = this.o;
        if (localap.b == -2147483648)
          break label233;
        i2 = localap.b;
        i3 = 0;
        i4 = 0;
        arrayOfInt = new int[i2];
        int i5 = getChildCount();
        i6 = 0;
        if (i6 >= i5)
          break label443;
        localLayoutParams = (GridLayout.LayoutParams)getChildAt(i6).getLayoutParams();
        if (i1 == 0)
          break label238;
        localav1 = localLayoutParams.a;
        as localas1 = localav1.c;
        bool1 = localav1.b;
        i7 = localas1.a();
        if (bool1)
          i3 = localas1.a;
        if (i1 == 0)
          break label248;
        localav2 = localLayoutParams.b;
        localas2 = localav2.c;
        bool2 = localav2.b;
        i8 = localas2.a();
        if (i2 != 0)
          break label258;
        if (!bool2)
          break label482;
      }
    label186: label225: label482: for (int i10 = localas2.a; ; i10 = i4)
    {
      if (i2 != 0)
      {
        if ((!bool1) || (!bool2))
          while (true)
          {
            int i11 = i10 + i8;
            int i13;
            if (i11 > arrayOfInt.length)
              i13 = 0;
            while (true)
            {
              if (i13 != 0)
                break label357;
              if (!bool2)
                break label333;
              i3++;
              break label186;
              i1 = 0;
              break;
              localap = this.p;
              break label25;
              label233: i2 = 0;
              break label39;
              label238: localav1 = localLayoutParams.b;
              break label91;
              label248: localav2 = localLayoutParams.a;
              break label135;
              if (bool2);
              for (int i9 = Math.min(localas2.a, i2); ; i9 = 0)
              {
                i8 = Math.min(i8, i2 - i9);
                break;
              }
              for (int i12 = i10; ; i12++)
              {
                if (i12 >= i11)
                  break label327;
                if (arrayOfInt[i12] <= i3)
                  continue;
                i13 = 0;
                break;
              }
              i13 = 1;
            }
            if (i10 + i8 <= i2)
            {
              i10++;
              continue;
            }
            i3++;
            i10 = 0;
          }
        label357: int i14 = i10 + i8;
        int i15 = i3 + i7;
        int i16 = arrayOfInt.length;
        Arrays.fill(arrayOfInt, Math.min(i10, i16), Math.min(i14, i16), i15);
      }
      if (i1 != 0)
        a(localLayoutParams, i3, i7, i10, i8);
      while (true)
      {
        i4 = i10 + i8;
        i6++;
        break;
        a(localLayoutParams, i10, i8, i3, i7);
      }
      this.u = e();
      do
        return;
      while (this.u == e());
      this.a.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
      c();
      break;
    }
  }

  final int a(View paramView, boolean paramBoolean)
  {
    if (paramView.getVisibility() == 8)
      return 0;
    return c(paramView, paramBoolean) + b(paramView, paramBoolean);
  }

  final int a(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    GridLayout.LayoutParams localLayoutParams = (GridLayout.LayoutParams)paramView.getLayoutParams();
    int i1;
    if (paramBoolean1)
      if (paramBoolean2)
        i1 = localLayoutParams.leftMargin;
    while (i1 == -2147483648)
    {
      if (!this.r)
      {
        return 0;
        i1 = localLayoutParams.rightMargin;
        continue;
        if (paramBoolean2)
        {
          i1 = localLayoutParams.topMargin;
          continue;
        }
        i1 = localLayoutParams.bottomMargin;
        continue;
      }
      av localav;
      ap localap;
      if (paramBoolean1)
      {
        localav = localLayoutParams.b;
        if (!paramBoolean1)
          break label153;
        localap = this.o;
        label95: as localas = localav.c;
        if ((paramBoolean1) && (b()))
        {
          if (paramBoolean2)
            break label162;
          paramBoolean2 = true;
        }
        label119: if (!paramBoolean2)
          break label167;
        if (localas.a == 0);
      }
      while (true)
      {
        if (paramView.getClass() != Space.class)
          break label176;
        return 0;
        localav = localLayoutParams.a;
        break;
        label153: localap = this.p;
        break label95;
        label162: paramBoolean2 = false;
        break label119;
        label167: localap.a();
      }
      label176: return this.t / 2;
    }
    return i1;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!(paramLayoutParams instanceof GridLayout.LayoutParams))
      return false;
    GridLayout.LayoutParams localLayoutParams = (GridLayout.LayoutParams)paramLayoutParams;
    a(localLayoutParams, true);
    a(localLayoutParams, false);
    return true;
  }

  public int getAlignmentMode()
  {
    return this.s;
  }

  public int getColumnCount()
  {
    return this.o.a();
  }

  public int getOrientation()
  {
    return this.q;
  }

  public Printer getPrinter()
  {
    return this.a;
  }

  public int getRowCount()
  {
    return this.p.a();
  }

  public boolean getUseDefaultMargins()
  {
    return this.r;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f();
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    int i3 = getPaddingLeft();
    int i4 = getPaddingTop();
    int i5 = getPaddingRight();
    int i6 = getPaddingBottom();
    this.o.c(i1 - i3 - i5);
    this.p.c(i2 - i4 - i6);
    int[] arrayOfInt1 = this.o.e();
    int[] arrayOfInt2 = this.p.e();
    int i7 = getChildCount();
    int i8 = 0;
    if (i8 < i7)
    {
      View localView = getChildAt(i8);
      int i10;
      int i18;
      int i19;
      int i20;
      int i21;
      int i26;
      int i27;
      int i28;
      int i29;
      if (localView.getVisibility() != 8)
      {
        GridLayout.LayoutParams localLayoutParams = (GridLayout.LayoutParams)localView.getLayoutParams();
        av localav1 = localLayoutParams.b;
        av localav2 = localLayoutParams.a;
        as localas1 = localav1.c;
        as localas2 = localav2.c;
        int i9 = arrayOfInt1[localas1.a];
        i10 = arrayOfInt2[localas2.a];
        int i11 = arrayOfInt1[localas1.b];
        int i12 = arrayOfInt2[localas2.b];
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int i15 = c(localView, true);
        int i16 = c(localView, false);
        an localan1 = localav1.a(true);
        an localan2 = localav2.a(false);
        ar localar1 = (ar)this.o.b().a(i8);
        ar localar2 = (ar)this.p.b().a(i8);
        int i17 = localan1.a(localView, i13 - localar1.a(true));
        i18 = localan2.a(localView, i14 - localar2.a(true));
        i19 = b(localView, true, true);
        i20 = b(localView, false, true);
        i21 = b(localView, true, false);
        int i22 = b(localView, false, false);
        int i23 = i19 + i21;
        int i24 = i20 + i22;
        int i25 = localar1.a(this, localView, localan1, i15 + i23, true);
        i26 = localar2.a(this, localView, localan2, i16 + i24, false);
        i27 = localan1.a(i15, i13 - i23);
        i28 = localan2.a(i16, i14 - i24);
        i29 = i25 + (i9 + i17);
        if (b())
          break label543;
      }
      label543: for (int i30 = i29 + (i3 + i19); ; i30 = i1 - i27 - i5 - i21 - i29)
      {
        int i31 = i20 + (i26 + (i18 + (i4 + i10)));
        if ((i27 != localView.getMeasuredWidth()) || (i28 != localView.getMeasuredHeight()))
          localView.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
        localView.layout(i30, i31, i27 + i30, i28 + i31);
        i8++;
        break;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    f();
    d();
    int i1 = getPaddingLeft() + getPaddingRight();
    int i2 = getPaddingTop() + getPaddingBottom();
    int i3 = a(paramInt1, -i1);
    int i4 = a(paramInt2, -i2);
    a(i3, i4, true);
    int i6;
    int i5;
    if (this.q == 0)
    {
      i6 = this.o.b(i3);
      a(i3, i4, false);
      i5 = this.p.b(i4);
    }
    while (true)
    {
      int i7 = Math.max(i6 + i1, getSuggestedMinimumWidth());
      int i8 = Math.max(i5 + i2, getSuggestedMinimumHeight());
      setMeasuredDimension(bg.a(i7, paramInt1, 0), bg.a(i8, paramInt2, 0));
      return;
      i5 = this.p.b(i4);
      a(i3, i4, false);
      i6 = this.o.b(i3);
    }
  }

  public void requestLayout()
  {
    super.requestLayout();
    c();
  }

  public void setAlignmentMode(int paramInt)
  {
    this.s = paramInt;
    requestLayout();
  }

  public void setColumnCount(int paramInt)
  {
    this.o.a(paramInt);
    c();
    requestLayout();
  }

  public void setColumnOrderPreserved(boolean paramBoolean)
  {
    this.o.a(paramBoolean);
    c();
    requestLayout();
  }

  public void setOrientation(int paramInt)
  {
    if (this.q != paramInt)
    {
      this.q = paramInt;
      c();
      requestLayout();
    }
  }

  public void setPrinter(Printer paramPrinter)
  {
    if (paramPrinter == null)
      paramPrinter = g;
    this.a = paramPrinter;
  }

  public void setRowCount(int paramInt)
  {
    this.p.a(paramInt);
    c();
    requestLayout();
  }

  public void setRowOrderPreserved(boolean paramBoolean)
  {
    this.p.a(paramBoolean);
    c();
    requestLayout();
  }

  public void setUseDefaultMargins(boolean paramBoolean)
  {
    this.r = paramBoolean;
    requestLayout();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.GridLayout
 * JD-Core Version:    0.6.0
 */