package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.d.f;
import android.support.v4.widget.ak;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.support.v7.internal.widget.ListViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ListPopupWindow
{
  private static Method a;
  int b = 2147483647;
  private Context c;
  private PopupWindow d;
  private ListAdapter e;
  private bh f;
  private int g = -2;
  private int h = -2;
  private int i;
  private int j;
  private boolean k;
  private int l = 0;
  private DataSetObserver m;
  private View n;
  private AdapterView.OnItemClickListener o;
  private final bp p = new bp(this, 0);
  private final bo q = new bo(this, 0);
  private final bn r = new bn(this, 0);
  private final bl s = new bl(this, 0);
  private Handler t = new Handler();
  private Rect u = new Rect();
  private boolean v;

  static
  {
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", arrayOfClass);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, R.attr.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    this.c = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ListPopupWindow, paramInt, 0);
    this.i = localTypedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.j = localTypedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.j != 0)
      this.k = true;
    localTypedArray.recycle();
    this.d = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt);
    this.d.setInputMethodMode(1);
    f.a(this.c.getResources().getConfiguration().locale);
  }

  public final void a()
  {
    this.d.dismiss();
    this.d.setContentView(null);
    this.f = null;
    this.t.removeCallbacks(this.p);
  }

  public final void a(int paramInt)
  {
    this.i = paramInt;
  }

  public final void a(Drawable paramDrawable)
  {
    this.d.setBackgroundDrawable(paramDrawable);
  }

  public void a(View paramView)
  {
    this.n = paramView;
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.o = paramOnItemClickListener;
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (this.m == null)
      this.m = new bm(this, 0);
    while (true)
    {
      this.e = paramListAdapter;
      if (this.e != null)
        paramListAdapter.registerDataSetObserver(this.m);
      if (this.f != null)
        this.f.setAdapter(this.e);
      return;
      if (this.e == null)
        continue;
      this.e.unregisterDataSetObserver(this.m);
    }
  }

  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.d.setOnDismissListener(paramOnDismissListener);
  }

  public final void b(int paramInt)
  {
    this.j = paramInt;
    this.k = true;
  }

  public final boolean b()
  {
    return this.d.isShowing();
  }

  public void c()
  {
    boolean bool2;
    label126: int i1;
    if (this.f == null)
    {
      Context localContext = this.c;
      new bf(this);
      if (!this.v)
      {
        bool2 = true;
        this.f = new bh(localContext, bool2);
        this.f.setAdapter(this.e);
        this.f.setOnItemClickListener(this.o);
        this.f.setFocusable(true);
        this.f.setFocusableInTouchMode(true);
        this.f.setOnItemSelectedListener(new bg(this));
        this.f.setOnScrollListener(this.r);
        bh localbh2 = this.f;
        this.d.setContentView(localbh2);
        Drawable localDrawable1 = this.d.getBackground();
        if (localDrawable1 == null)
          break label344;
        localDrawable1.getPadding(this.u);
        i1 = this.u.top + this.u.bottom;
        if (!this.k)
          this.j = (-this.u.top);
      }
    }
    int i2;
    int i16;
    int i19;
    int i20;
    label265: int i22;
    while (true)
    {
      this.d.getInputMethodMode();
      i2 = this.d.getMaxAvailableHeight(e(), this.j);
      if (this.g != -1)
        break label356;
      i16 = i1 + i2;
      boolean bool1 = h();
      if (!this.d.isShowing())
        break label850;
      if (this.h != -1)
        break label749;
      i19 = -1;
      if (this.g != -1)
        break label825;
      if (!bool1)
        break label779;
      i20 = i16;
      if (!bool1)
        break label791;
      PopupWindow localPopupWindow3 = this.d;
      if (this.h != -1)
        break label785;
      i22 = -1;
      label287: localPopupWindow3.setWindowLayoutMode(i22, 0);
      label295: this.d.setOutsideTouchable(true);
      this.d.update(e(), this.i, this.j, i19, i20);
      label326: return;
      bool2 = false;
      break;
      this.d.getContentView();
      break label126;
      label344: this.u.setEmpty();
      i1 = 0;
    }
    label356: int i3;
    switch (this.h)
    {
    default:
      i3 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
    case -2:
    case -1:
    }
    bh localbh1;
    int i4;
    int i5;
    int i6;
    int i7;
    Drawable localDrawable2;
    ListAdapter localListAdapter;
    label467: int i15;
    while (true)
    {
      localbh1 = this.f;
      i4 = i2 + 0;
      i5 = localbh1.getListPaddingTop();
      i6 = localbh1.getListPaddingBottom();
      localbh1.getListPaddingLeft();
      localbh1.getListPaddingRight();
      i7 = localbh1.getDividerHeight();
      localDrawable2 = localbh1.getDivider();
      localListAdapter = localbh1.getAdapter();
      if (localListAdapter != null)
        break label567;
      i8 = i6 + i5;
      if (i8 <= 0)
        break label1107;
      i15 = i1 + 0;
      label477: i16 = i15 + i8;
      break;
      i3 = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.u.left + this.u.right), -2147483648);
      continue;
      i3 = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.u.left + this.u.right), 1073741824);
    }
    label567: int i8 = i6 + i5;
    label584: View localView1;
    int i11;
    label602: View localView2;
    label634: int i13;
    if ((i7 > 0) && (localDrawable2 != null))
    {
      localView1 = null;
      int i9 = 0;
      int i10 = localListAdapter.getCount();
      i11 = 0;
      if (i11 >= i10)
        break label747;
      int i12 = localListAdapter.getItemViewType(i11);
      if (i12 == i9)
        break label1113;
      localView2 = null;
      i9 = i12;
      localView1 = localListAdapter.getView(i11, localView2, localbh1);
      ViewGroup.LayoutParams localLayoutParams = localView1.getLayoutParams();
      if ((localLayoutParams == null) || (localLayoutParams.height <= 0))
        break label733;
      i13 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
      label682: localView1.measure(i3, i13);
      if (i11 <= 0)
        break label1120;
    }
    label733: label861: label1120: for (int i14 = i8 + i7; ; i14 = i8)
    {
      while (true)
      {
        i8 = i14 + localView1.getMeasuredHeight();
        if (i8 >= i4)
        {
          i8 = i4;
          break label467;
          i7 = 0;
          break label584;
          i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label682;
        }
        i11++;
        break label602;
        label747: break label467;
        label749: if (this.h == -2)
        {
          i19 = e().getWidth();
          break;
        }
        i19 = this.h;
        break;
        i20 = -1;
        break label265;
        i22 = 0;
        break label287;
        PopupWindow localPopupWindow2 = this.d;
        if (this.h == -1);
        for (int i21 = -1; ; i21 = 0)
        {
          localPopupWindow2.setWindowLayoutMode(i21, -1);
          break;
        }
        if (this.g == -2)
        {
          i20 = i16;
          break label295;
        }
        i20 = this.g;
        break label295;
        int i17;
        int i18;
        if (this.h == -1)
        {
          i17 = -1;
          if (this.g != -1)
            break label1061;
          i18 = -1;
          label872: this.d.setWindowLayoutMode(i17, i18);
          if (a == null);
        }
        try
        {
          Method localMethod = a;
          PopupWindow localPopupWindow1 = this.d;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(true);
          localMethod.invoke(localPopupWindow1, arrayOfObject);
          this.d.setOutsideTouchable(true);
          this.d.setTouchInterceptor(this.q);
          ak.a(this.d, e(), this.i, this.j, this.l);
          this.f.setSelection(-1);
          if ((!this.v) || (this.f.isInTouchMode()))
            g();
          if (this.v)
            break label326;
          this.t.post(this.s);
          return;
          if (this.h == -2)
          {
            this.d.setWidth(e().getWidth());
            i17 = 0;
            break label861;
          }
          this.d.setWidth(this.h);
          i17 = 0;
          break label861;
          if (this.g == -2)
          {
            this.d.setHeight(i16);
            i18 = 0;
            break label872;
          }
          this.d.setHeight(this.g);
          i18 = 0;
        }
        catch (Exception localException)
        {
          break label924;
        }
      }
      i15 = 0;
      break label477;
      localView2 = localView1;
      break label634;
    }
  }

  public final void c(int paramInt)
  {
    this.l = paramInt;
  }

  public final void d()
  {
    this.v = true;
    this.d.setFocusable(true);
  }

  public void d(int paramInt)
  {
    Drawable localDrawable = this.d.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.u);
      this.h = (paramInt + (this.u.left + this.u.right));
      return;
    }
    this.h = paramInt;
  }

  public View e()
  {
    return this.n;
  }

  public final void f()
  {
    this.d.setInputMethodMode(2);
  }

  public final void g()
  {
    bh localbh = this.f;
    if (localbh != null)
    {
      bh.a(localbh, true);
      localbh.requestLayout();
    }
  }

  public final boolean h()
  {
    return this.d.getInputMethodMode() == 2;
  }

  public final ListView i()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ListPopupWindow
 * JD-Core Version:    0.6.0
 */