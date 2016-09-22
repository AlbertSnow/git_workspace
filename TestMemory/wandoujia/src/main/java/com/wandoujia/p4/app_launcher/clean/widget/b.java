package com.wandoujia.p4.app_launcher.clean.widget;

import android.os.Handler;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.jupiter.JupiterApplication;
import java.lang.ref.WeakReference;

public final class b
{
  private int a;
  private int b;
  private ValueAnimator c;
  private ValueAnimator d;
  private final WeakReference<i> e;

  public b(i parami)
  {
    this.e = new WeakReference(parami);
  }

  private void b()
  {
    JupiterApplication.a().post(new c(this));
  }

  private void c()
  {
    if ((this.c != null) && (this.c.isRunning()))
      this.c.cancel();
  }

  private void d()
  {
    if (this.d != null)
      this.d.cancel();
  }

  public final void a()
  {
    this.a = 0;
    this.b = 0;
    c();
    d();
    b();
  }

  public final void a(int paramInt)
  {
    JupiterApplication.a().post(new f(this, paramInt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.b
 * JD-Core Version:    0.6.0
 */