package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.aa;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class f extends a
  implements j
{
  private final Context a;
  private final i b;
  private android.support.v7.b.b c;
  private WeakReference<View> d;

  public f(b paramb, Context paramContext, android.support.v7.b.b paramb1)
  {
    this.a = paramContext;
    this.c = paramb1;
    this.b = new i(paramContext).a();
    this.b.a(this);
  }

  public final MenuInflater a()
  {
    return new e(this.a);
  }

  public final void a(int paramInt)
  {
    b(b.j(this.e).getResources().getString(paramInt));
  }

  public final void a(i parami)
  {
    if (this.c == null)
      return;
    d();
    b.h(this.e).a();
  }

  public final void a(View paramView)
  {
    b.h(this.e).setCustomView(paramView);
    this.d = new WeakReference(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    b.h(this.e).setSubtitle(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    b.h(this.e).setTitleOptional(paramBoolean);
  }

  public final boolean a(i parami, MenuItem paramMenuItem)
  {
    if (this.c != null)
      return this.c.a(this, paramMenuItem);
    return false;
  }

  public final Menu b()
  {
    return this.b;
  }

  public final void b(int paramInt)
  {
    a(b.j(this.e).getResources().getString(paramInt));
  }

  public final void b(CharSequence paramCharSequence)
  {
    b.h(this.e).setTitle(paramCharSequence);
  }

  public final void c()
  {
    if (this.e.a != this)
      return;
    if (!b.a(b.i(), b.g(this.e)))
    {
      this.e.b = this;
      this.e.c = this.c;
    }
    while (true)
    {
      this.c = null;
      this.e.e(false);
      b.h(this.e).b();
      b.i(this.e).a().sendAccessibilityEvent(32);
      b.f(this.e).setHideOnContentScrollEnabled(this.e.d);
      this.e.a = null;
      return;
      this.c.a(this);
    }
  }

  public final void d()
  {
    if (this.e.a != this)
      return;
    this.b.g();
    try
    {
      this.c.b(this, this.b);
      return;
    }
    finally
    {
      this.b.h();
    }
    throw localObject;
  }

  public final boolean e()
  {
    this.b.g();
    try
    {
      boolean bool = this.c.a(this, this.b);
      return bool;
    }
    finally
    {
      this.b.h();
    }
    throw localObject;
  }

  public final CharSequence f()
  {
    return b.h(this.e).getTitle();
  }

  public final CharSequence g()
  {
    return b.h(this.e).getSubtitle();
  }

  public final boolean h()
  {
    return b.h(this.e).d();
  }

  public final View i()
  {
    if (this.d != null)
      return (View)this.d.get();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.a.f
 * JD-Core Version:    0.6.0
 */