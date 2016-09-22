package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.layout;
import android.support.v7.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class v
  implements x, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int a = R.layout.abc_popup_menu_item_layout;
  boolean b;
  private final Context c;
  private final LayoutInflater d;
  private final i e;
  private final w f;
  private final boolean g;
  private final int h;
  private final int i;
  private View j;
  private ListPopupWindow k;
  private ViewTreeObserver l;
  private y m;
  private ViewGroup n;
  private boolean o;
  private int p;
  private int q = 0;

  private v(Context paramContext, i parami, View paramView)
  {
    this(paramContext, parami, paramView, false, R.attr.popupMenuStyle);
  }

  public v(Context paramContext, i parami, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, parami, paramView, paramBoolean, paramInt, 0);
  }

  private v(Context paramContext, i parami, View paramView, boolean paramBoolean, int paramInt, byte paramByte)
  {
    this.c = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.e = parami;
    this.f = new w(this, this.e);
    this.g = paramBoolean;
    this.i = paramInt;
    Resources localResources = paramContext.getResources();
    this.h = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    this.j = paramView;
    parami.a(this, paramContext);
  }

  public final void a()
  {
    this.q = 8388613;
  }

  public final void a(Context paramContext, i parami)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if (parami != this.e);
    do
    {
      return;
      f();
    }
    while (this.m == null);
    this.m.a(parami, paramBoolean);
  }

  public final void a(y paramy)
  {
    this.m = paramy;
  }

  public final void a(View paramView)
  {
    this.j = paramView;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final boolean a(ac paramac)
  {
    v localv;
    int i2;
    if (paramac.hasVisibleItems())
    {
      localv = new v(this.c, paramac, this.j);
      localv.m = this.m;
      int i1 = paramac.size();
      i2 = 0;
      if (i2 >= i1)
        break label118;
      MenuItem localMenuItem = paramac.getItem(i2);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label118: for (boolean bool = true; ; bool = false)
    {
      localv.b = bool;
      if (localv.e())
      {
        if (this.m != null)
          this.m.a(paramac);
        return true;
        i2++;
        break;
      }
      return false;
    }
  }

  public final void b(boolean paramBoolean)
  {
    this.o = false;
    this.f.notifyDataSetChanged();
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    return false;
  }

  public final void c()
  {
    if (!e())
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }

  public final boolean c(m paramm)
  {
    return false;
  }

  public final ListPopupWindow d()
  {
    return this.k;
  }

  public final boolean e()
  {
    int i1 = 0;
    this.k = new ListPopupWindow(this.c, null, this.i, 0);
    this.k.a(this);
    this.k.a(this);
    this.k.a(this.f);
    this.k.d();
    View localView1 = this.j;
    int i6;
    View localView2;
    View localView3;
    label191: int i9;
    if (localView1 != null)
    {
      if (this.l == null);
      for (int i2 = 1; ; i2 = 0)
      {
        this.l = localView1.getViewTreeObserver();
        if (i2 != 0)
          this.l.addOnGlobalLayoutListener(this);
        this.k.a(localView1);
        this.k.c(this.q);
        if (!this.o)
        {
          w localw = this.f;
          int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i5 = localw.getCount();
          i6 = 0;
          int i7 = 0;
          localView2 = null;
          if (i6 < i5)
          {
            int i8 = localw.getItemViewType(i6);
            if (i8 == i7)
              break label330;
            i7 = i8;
            localView3 = null;
            if (this.n == null)
              this.n = new FrameLayout(this.c);
            localView2 = localw.getView(i6, localView3, this.n);
            localView2.measure(i3, i4);
            i9 = localView2.getMeasuredWidth();
            if (i9 < this.h)
              break;
            i1 = this.h;
          }
          this.p = i1;
          this.o = true;
        }
        this.k.d(this.p);
        this.k.f();
        this.k.c();
        this.k.i().setOnKeyListener(this);
        return true;
      }
    }
    return false;
    if (i9 > i1);
    while (true)
    {
      i6++;
      i1 = i9;
      break;
      label330: localView3 = localView2;
      break label191;
      i9 = i1;
    }
  }

  public final void f()
  {
    if (g())
      this.k.a();
  }

  public final boolean g()
  {
    return (this.k != null) && (this.k.b());
  }

  public void onDismiss()
  {
    this.k = null;
    this.e.close();
    if (this.l != null)
    {
      if (!this.l.isAlive())
        this.l = this.j.getViewTreeObserver();
      this.l.removeGlobalOnLayoutListener(this);
      this.l = null;
    }
  }

  public void onGlobalLayout()
  {
    if (g())
    {
      View localView = this.j;
      if ((localView != null) && (localView.isShown()))
        break label28;
      f();
    }
    label28: 
    do
      return;
    while (!g());
    this.k.c();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    w localw = this.f;
    w.a(localw).b(localw.a(paramInt));
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      f();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.v
 * JD-Core Version:    0.6.0
 */