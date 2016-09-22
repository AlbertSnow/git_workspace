package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class f
{
  private static final e a;
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      a = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new g();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new l();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new k();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new j();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new i();
      return;
    }
    a = new e();
  }

  public f(Object paramObject)
  {
    this.b = paramObject;
  }

  public static f a(f paramf)
  {
    Object localObject = a.a(paramf.b);
    if (localObject != null)
      return new f(localObject);
    return null;
  }

  public final Object a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    a.a(this.b, paramInt);
  }

  public final void a(Rect paramRect)
  {
    a.a(this.b, paramRect);
  }

  public final void a(View paramView)
  {
    a.a(this.b, paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    a.a(this.b, paramCharSequence);
  }

  public final void a(Object paramObject)
  {
    a.a(this.b, ((m)paramObject).a);
  }

  public final void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }

  public final int b()
  {
    return a.b(this.b);
  }

  public final void b(int paramInt)
  {
    a.b(this.b, paramInt);
  }

  public final void b(Rect paramRect)
  {
    a.b(this.b, paramRect);
  }

  public final void b(View paramView)
  {
    a.b(this.b, paramView);
  }

  public final void b(CharSequence paramCharSequence)
  {
    a.b(this.b, paramCharSequence);
  }

  public final void b(Object paramObject)
  {
    a.b(this.b, n.a((n)paramObject));
  }

  public final void b(boolean paramBoolean)
  {
    a.b(this.b, paramBoolean);
  }

  public final int c()
  {
    return a.c(this.b);
  }

  public final void c(Rect paramRect)
  {
    a.c(this.b, paramRect);
  }

  public final void c(View paramView)
  {
    a.c(this.b, paramView);
  }

  public final void c(CharSequence paramCharSequence)
  {
    a.c(this.b, paramCharSequence);
  }

  public final void c(boolean paramBoolean)
  {
    a.c(this.b, paramBoolean);
  }

  public final void d(Rect paramRect)
  {
    a.d(this.b, paramRect);
  }

  public final void d(boolean paramBoolean)
  {
    a.d(this.b, paramBoolean);
  }

  public final boolean d()
  {
    return a.f(this.b);
  }

  public final void e(boolean paramBoolean)
  {
    a.e(this.b, paramBoolean);
  }

  public final boolean e()
  {
    return a.g(this.b);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    f localf;
    do
      while (true)
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localf = (f)paramObject;
        if (this.b != null)
          break;
        if (localf.b != null)
          return false;
      }
    while (this.b.equals(localf.b));
    return false;
  }

  public final void f(boolean paramBoolean)
  {
    a.f(this.b, paramBoolean);
  }

  public final boolean f()
  {
    return a.h(this.b);
  }

  public final void g(boolean paramBoolean)
  {
    a.g(this.b, paramBoolean);
  }

  public final boolean g()
  {
    return a.i(this.b);
  }

  public final void h(boolean paramBoolean)
  {
    a.h(this.b, paramBoolean);
  }

  public final boolean h()
  {
    return a.j(this.b);
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }

  public final void i(boolean paramBoolean)
  {
    a.i(this.b, paramBoolean);
  }

  public final boolean i()
  {
    return a.k(this.b);
  }

  public final boolean j()
  {
    return a.l(this.b);
  }

  public final boolean k()
  {
    return a.m(this.b);
  }

  public final CharSequence l()
  {
    return a.p(this.b);
  }

  public final CharSequence m()
  {
    return a.q(this.b);
  }

  public final CharSequence n()
  {
    return a.s(this.b);
  }

  public final void o()
  {
    a.t(this.b);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    a(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    c(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(l());
    localStringBuilder.append("; className: ").append(m());
    localStringBuilder.append("; text: ").append(a.r(this.b));
    localStringBuilder.append("; contentDescription: ").append(n());
    localStringBuilder.append("; viewId: ").append(a.u(this.b));
    localStringBuilder.append("; checkable: ").append(a.d(this.b));
    localStringBuilder.append("; checked: ").append(a.e(this.b));
    localStringBuilder.append("; focusable: ").append(d());
    localStringBuilder.append("; focused: ").append(e());
    localStringBuilder.append("; selected: ").append(h());
    localStringBuilder.append("; clickable: ").append(i());
    localStringBuilder.append("; longClickable: ").append(j());
    localStringBuilder.append("; enabled: ").append(k());
    localStringBuilder.append("; password: ").append(a.n(this.b));
    localStringBuilder.append("; scrollable: " + a.o(this.b));
    localStringBuilder.append("; [");
    int i = b();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      int k = i & (j ^ 0xFFFFFFFF);
      String str;
      switch (j)
      {
      default:
        str = "ACTION_UNKNOWN";
      case 1:
      case 2:
      case 4:
      case 8:
      case 16:
      case 32:
      case 64:
      case 128:
      case 256:
      case 512:
      case 1024:
      case 2048:
      case 4096:
      case 8192:
      case 65536:
      case 16384:
      case 32768:
      case 131072:
      }
      while (true)
      {
        localStringBuilder.append(str);
        if (k != 0)
          localStringBuilder.append(", ");
        i = k;
        break;
        str = "ACTION_FOCUS";
        continue;
        str = "ACTION_CLEAR_FOCUS";
        continue;
        str = "ACTION_SELECT";
        continue;
        str = "ACTION_CLEAR_SELECTION";
        continue;
        str = "ACTION_CLICK";
        continue;
        str = "ACTION_LONG_CLICK";
        continue;
        str = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        str = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        str = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        str = "ACTION_SCROLL_FORWARD";
        continue;
        str = "ACTION_SCROLL_BACKWARD";
        continue;
        str = "ACTION_CUT";
        continue;
        str = "ACTION_COPY";
        continue;
        str = "ACTION_PASTE";
        continue;
        str = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.f
 * JD-Core Version:    0.6.0
 */