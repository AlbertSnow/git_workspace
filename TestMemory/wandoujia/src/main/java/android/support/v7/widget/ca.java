package android.support.v7.widget;

import android.support.v7.app.f;
import java.util.ArrayList;

public abstract class ca
{
  private cb a = null;
  private ArrayList<f> b = new ArrayList();
  private long c = 120L;
  private long d = 120L;
  private long e = 250L;
  private long f = 250L;
  private boolean g = true;

  public abstract void a();

  final void a(cb paramcb)
  {
    this.a = paramcb;
  }

  public abstract boolean a(co paramco);

  public abstract boolean a(co paramco, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean a(co paramco1, co paramco2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean b();

  public abstract boolean b(co paramco);

  public abstract void c();

  public abstract void c(co paramco);

  public final long d()
  {
    return this.e;
  }

  public final void d(co paramco)
  {
    if (this.a != null)
      this.a.a(paramco);
  }

  public final void e()
  {
    this.e = 300L;
  }

  public final void e(co paramco)
  {
    if (this.a != null)
      this.a.c(paramco);
  }

  public final long f()
  {
    return this.c;
  }

  public final void f(co paramco)
  {
    if (this.a != null)
      this.a.b(paramco);
  }

  public final long g()
  {
    return this.d;
  }

  public final void g(co paramco)
  {
    if (this.a != null)
      this.a.d(paramco);
  }

  public final void h()
  {
    this.d = 150L;
  }

  public final long i()
  {
    return this.f;
  }

  public final void j()
  {
    this.f = 300L;
  }

  public final boolean k()
  {
    return this.g;
  }

  public final void l()
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
      this.b.get(j);
    this.b.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ca
 * JD-Core Version:    0.6.0
 */