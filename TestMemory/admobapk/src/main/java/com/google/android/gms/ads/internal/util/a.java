package com.google.android.gms.ads.internal.util;

@com.google.android.gms.ads.internal.report.client.a
public abstract class a
  implements an
{
  private final Runnable a = new b(this);
  private boolean b;
  volatile Thread j;

  public a()
  {
    this.b = false;
  }

  public a(boolean paramBoolean)
  {
    this.b = true;
  }

  public abstract void a();

  public abstract void b();

  public final void c()
  {
    b();
    if (this.j != null)
      this.j.interrupt();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.a
 * JD-Core Version:    0.6.0
 */