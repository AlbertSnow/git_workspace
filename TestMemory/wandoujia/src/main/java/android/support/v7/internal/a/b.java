package android.support.v7.internal.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v4.view.dh;
import android.support.v4.view.dj;
import android.support.v7.app.ActionBar;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.b.a;
import android.support.v7.internal.view.h;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.aa;
import android.support.v7.internal.widget.l;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import com.sina.weibo.sdk.api.share.i;
import java.util.ArrayList;

public class b extends ActionBar
  implements l
{
  private static final boolean e;
  private dj A;
  f a;
  a b;
  android.support.v7.b.b c;
  boolean d;
  private Context f;
  private Context g;
  private ActionBarOverlayLayout h;
  private ActionBarContainer i;
  private aa j;
  private ActionBarContextView k;
  private ActionBarContainer l;
  private View m;
  private boolean n;
  private boolean o;
  private ArrayList<android.support.v7.app.f> p;
  private boolean q;
  private int r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private h w;
  private boolean x;
  private dh y;
  private dh z;

  static
  {
    b.class.desiredAssertionStatus();
    if (Build.VERSION.SDK_INT >= 14);
    for (boolean bool = true; ; bool = false)
    {
      e = bool;
      return;
    }
  }

  public b(Activity paramActivity, boolean paramBoolean)
  {
    new ArrayList();
    this.p = new ArrayList();
    this.r = 0;
    this.s = true;
    this.v = true;
    this.y = new c(this);
    this.z = new d(this);
    this.A = new e(this);
    View localView = paramActivity.getWindow().getDecorView();
    a(localView);
    if (!paramBoolean)
      this.m = localView.findViewById(16908290);
  }

  public b(Dialog paramDialog)
  {
    new ArrayList();
    this.p = new ArrayList();
    this.r = 0;
    this.s = true;
    this.v = true;
    this.y = new c(this);
    this.z = new d(this);
    this.A = new e(this);
    a(paramDialog.getWindow().getDecorView());
  }

  private void a(View paramView)
  {
    this.h = ((ActionBarOverlayLayout)paramView.findViewById(R.id.decor_content_parent));
    if (this.h != null)
      this.h.setActionBarVisibilityCallback(this);
    View localView = paramView.findViewById(R.id.action_bar);
    aa localaa;
    if ((localView instanceof aa))
      localaa = (aa)localView;
    while (true)
    {
      this.j = localaa;
      this.k = ((ActionBarContextView)paramView.findViewById(R.id.action_context_bar));
      this.i = ((ActionBarContainer)paramView.findViewById(R.id.action_bar_container));
      this.l = ((ActionBarContainer)paramView.findViewById(R.id.split_action_bar));
      if ((this.j != null) && (this.k != null) && (this.i != null))
        break;
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if ((localView instanceof Toolbar))
      {
        localaa = ((Toolbar)localView).getWrapper();
        continue;
      }
      if ("Can't make a decor toolbar out of " + localView != null);
      for (String str = localView.getClass().getSimpleName(); ; str = "null")
        throw new IllegalStateException(str);
    }
    this.f = this.j.b();
    int i1;
    if ((0x4 & this.j.m()) != 0)
      i1 = 1;
    TypedArray localTypedArray;
    while (true)
    {
      if (i1 != 0)
        this.n = true;
      i locali = i.a(this.f);
      locali.f();
      f(locali.d());
      localTypedArray = this.f.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
      if (!localTypedArray.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false))
        break;
      if (!this.h.a())
      {
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        i1 = 0;
        continue;
      }
      this.d = true;
      this.h.setHideOnContentScrollEnabled(true);
    }
    int i2 = localTypedArray.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
    if (i2 != 0)
    {
      float f1 = i2;
      bg.k(this.i, f1);
      if (this.l != null)
        bg.k(this.l, f1);
    }
    localTypedArray.recycle();
  }

  private static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3);
    do
      return true;
    while ((!paramBoolean1) && (!paramBoolean2));
    return false;
  }

  private void f(boolean paramBoolean)
  {
    this.q = paramBoolean;
    this.i.setTabContainer(null);
    this.j.n();
    this.h.setHasNonEmbeddedTabs(false);
  }

  private void g(boolean paramBoolean)
  {
    if (a(false, this.t, this.u))
      if (!this.v)
      {
        this.v = true;
        if (this.w != null)
          this.w.b();
        this.i.setVisibility(0);
        if ((this.r != 0) || (!e) || ((!this.x) && (!paramBoolean)))
          break label275;
        bg.b(this.i, 0.0F);
        float f2 = -this.i.getHeight();
        if (paramBoolean)
        {
          int[] arrayOfInt2 = { 0, 0 };
          this.i.getLocationInWindow(arrayOfInt2);
          f2 -= arrayOfInt2[1];
        }
        bg.b(this.i, f2);
        h localh2 = new h();
        cu localcu2 = bg.q(this.i).c(0.0F);
        localcu2.a(this.A);
        localh2.a(localcu2);
        if ((this.s) && (this.m != null))
        {
          bg.b(this.m, f2);
          localh2.a(bg.q(this.m).c(0.0F));
        }
        localh2.a(AnimationUtils.loadInterpolator(this.f, 17432582));
        localh2.c();
        localh2.a(this.z);
        this.w = localh2;
        localh2.a();
        if (this.h != null)
          bg.w(this.h);
      }
    label275: 
    do
    {
      return;
      bg.c(this.i, 1.0F);
      bg.b(this.i, 0.0F);
      if ((this.s) && (this.m != null))
        bg.b(this.m, 0.0F);
      this.z.b(null);
      break;
    }
    while (!this.v);
    this.v = false;
    if (this.w != null)
      this.w.b();
    if ((this.r == 0) && (e) && ((this.x) || (paramBoolean)))
    {
      bg.c(this.i, 1.0F);
      this.i.setTransitioning(true);
      h localh1 = new h();
      float f1 = -this.i.getHeight();
      if (paramBoolean)
      {
        int[] arrayOfInt1 = { 0, 0 };
        this.i.getLocationInWindow(arrayOfInt1);
        f1 -= arrayOfInt1[1];
      }
      cu localcu1 = bg.q(this.i).c(f1);
      localcu1.a(this.A);
      localh1.a(localcu1);
      if ((this.s) && (this.m != null))
        localh1.a(bg.q(this.m).c(f1));
      if ((this.l != null) && (this.l.getVisibility() == 0))
      {
        bg.c(this.l, 1.0F);
        localh1.a(bg.q(this.l).c(this.l.getHeight()));
      }
      localh1.a(AnimationUtils.loadInterpolator(this.f, 17432581));
      localh1.c();
      localh1.a(this.y);
      this.w = localh1;
      localh1.a();
      return;
    }
    this.y.b(null);
  }

  public final int a()
  {
    return this.j.m();
  }

  public final a a(android.support.v7.b.b paramb)
  {
    if (this.a != null)
      this.a.c();
    this.h.setHideOnContentScrollEnabled(false);
    this.k.c();
    f localf = new f(this, this.k.getContext(), paramb);
    if (localf.e())
    {
      localf.d();
      this.k.a(localf);
      e(true);
      this.k.sendAccessibilityEvent(32);
      this.a = localf;
      return localf;
    }
    return null;
  }

  public final void a(int paramInt)
  {
    this.r = paramInt;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.j.a(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    if (!this.n)
      if (!paramBoolean)
        break label46;
    label46: for (int i1 = 4; ; i1 = 0)
    {
      int i2 = this.j.m();
      this.n = true;
      this.j.c(i1 & 0x4 | i2 & 0xFFFFFFFB);
      return;
    }
  }

  public final Context b()
  {
    int i1;
    if (this.g == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.f.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0)
        break label61;
    }
    label61: for (this.g = new ContextThemeWrapper(this.f, i1); ; this.g = this.f)
      return this.g;
  }

  public final void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
    if ((!paramBoolean) && (this.w != null))
      this.w.b();
  }

  public final void c()
  {
    f(i.a(this.f).d());
  }

  public final void c(boolean paramBoolean)
  {
    if (paramBoolean == this.o);
    while (true)
    {
      return;
      this.o = paramBoolean;
      int i1 = this.p.size();
      for (int i2 = 0; i2 < i1; i2++)
        this.p.get(i2);
    }
  }

  public final void d(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public final boolean d()
  {
    if ((this.j != null) && (this.j.c()))
    {
      this.j.d();
      return true;
    }
    return false;
  }

  public final void e()
  {
    if (this.t)
    {
      this.t = false;
      g(true);
    }
  }

  public final void e(boolean paramBoolean)
  {
    int i1;
    label48: ActionBarContextView localActionBarContextView;
    int i2;
    if (paramBoolean)
    {
      if (!this.u)
      {
        this.u = true;
        if (this.h != null)
          this.h.setShowingForActionMode(true);
        g(false);
      }
      aa localaa = this.j;
      if (!paramBoolean)
        break label111;
      i1 = 8;
      localaa.d(i1);
      localActionBarContextView = this.k;
      i2 = 0;
      if (!paramBoolean)
        break label116;
    }
    while (true)
    {
      localActionBarContextView.a(i2);
      return;
      if (!this.u)
        break;
      this.u = false;
      if (this.h != null)
        this.h.setShowingForActionMode(false);
      g(false);
      break;
      label111: i1 = 0;
      break label48;
      label116: i2 = 8;
    }
  }

  public final void f()
  {
    if (!this.t)
    {
      this.t = true;
      g(true);
    }
  }

  public final void g()
  {
    if (this.w != null)
    {
      this.w.b();
      this.w = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.a.b
 * JD-Core Version:    0.6.0
 */