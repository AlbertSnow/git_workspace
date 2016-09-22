package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.bc;

@com.google.android.gms.ads.internal.report.client.a
public final class bk
{
  public Activity a;
  private final View b;
  private boolean c;
  private boolean d;
  private boolean e;
  private ViewTreeObserver.OnGlobalLayoutListener f;
  private ViewTreeObserver.OnScrollChangedListener g;

  public bk(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.a = paramActivity;
    this.b = paramView;
    this.f = paramOnGlobalLayoutListener;
    this.g = paramOnScrollChangedListener;
  }

  private final void e()
  {
    if (!this.c)
    {
      if (this.f != null)
      {
        if (this.a != null)
          y.a(this.a, this.f);
        com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.b, this.f);
      }
      if (this.g != null)
      {
        if (this.a != null)
          y.a(this.a, this.g);
        com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.b, this.g);
      }
      this.c = true;
    }
  }

  private final void f()
  {
    if (this.a == null);
    do
      return;
    while (!this.c);
    if ((this.f != null) && (this.a != null))
      bc.a().g.a(this.a, this.f);
    if ((this.g != null) && (this.a != null))
      y.b(this.a, this.g);
    this.c = false;
  }

  public final void a()
  {
    this.e = true;
    if (this.d)
      e();
  }

  public final void b()
  {
    this.e = false;
    f();
  }

  public final void c()
  {
    this.d = true;
    if (this.e)
      e();
  }

  public final void d()
  {
    this.d = false;
    f();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.bk
 * JD-Core Version:    0.6.0
 */