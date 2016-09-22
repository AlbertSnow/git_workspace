package android.support.v7.internal.view;

import android.support.v4.view.cu;
import android.support.v4.view.dh;
import android.support.v4.view.di;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  private final ArrayList<cu> a = new ArrayList();
  private long b = -1L;
  private Interpolator c;
  private dh d;
  private boolean e;
  private final di f = new i(this);

  public final h a(cu paramcu)
  {
    if (!this.e)
      this.a.add(paramcu);
    return this;
  }

  public final h a(dh paramdh)
  {
    if (!this.e)
      this.d = paramdh;
    return this;
  }

  public final h a(Interpolator paramInterpolator)
  {
    if (!this.e)
      this.c = paramInterpolator;
    return this;
  }

  public final void a()
  {
    if (this.e)
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      cu localcu = (cu)localIterator.next();
      if (this.b >= 0L)
        localcu.a(this.b);
      if (this.c != null)
        localcu.a(this.c);
      if (this.d != null)
        localcu.a(this.f);
      localcu.d();
    }
    this.e = true;
  }

  public final void b()
  {
    if (!this.e)
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((cu)localIterator.next()).c();
    this.e = false;
  }

  public final h c()
  {
    if (!this.e)
      this.b = 250L;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.h
 * JD-Core Version:    0.6.0
 */