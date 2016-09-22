package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class bg
{
  private static bq a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new bp();
      return;
    }
    if (i >= 19)
    {
      a = new bo();
      return;
    }
    if (i >= 17)
    {
      a = new bn();
      return;
    }
    if (i >= 16)
    {
      a = new bm();
      return;
    }
    if (i >= 14)
    {
      a = new bl();
      return;
    }
    if (i >= 11)
    {
      a = new bk();
      return;
    }
    if (i >= 9)
    {
      a = new bj();
      return;
    }
    if (i >= 7)
    {
      a = new bi();
      return;
    }
    a = new bh();
  }

  public static void A(View paramView)
  {
    a.A(paramView);
  }

  public static boolean B(View paramView)
  {
    return a.B(paramView);
  }

  public static boolean C(View paramView)
  {
    return a.C(paramView);
  }

  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }

  public static int a(View paramView)
  {
    return a.a(paramView);
  }

  public static dk a(View paramView, dk paramdk)
  {
    return a.a(paramView, paramdk);
  }

  public static void a(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }

  public static void a(View paramView, Paint paramPaint)
  {
    a.a(paramView, paramPaint);
  }

  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }

  public static void a(View paramView, as paramas)
  {
    a.a(paramView, paramas);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }

  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }

  public static void a(View paramView, String paramString)
  {
    a.a(paramView, paramString);
  }

  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }

  public static void a(ViewGroup paramViewGroup)
  {
    a.a(paramViewGroup);
  }

  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }

  public static void b(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }

  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }

  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }

  public static void c(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }

  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }

  public static boolean c(View paramView)
  {
    return a.c(paramView);
  }

  public static void d(View paramView)
  {
    a.d(paramView);
  }

  public static void d(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }

  public static void d(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }

  public static int e(View paramView)
  {
    return a.e(paramView);
  }

  public static void e(View paramView, float paramFloat)
  {
    a.e(paramView, paramFloat);
  }

  public static void e(View paramView, int paramInt)
  {
    a.e(paramView, paramInt);
  }

  public static float f(View paramView)
  {
    return a.f(paramView);
  }

  public static void f(View paramView, float paramFloat)
  {
    a.f(paramView, paramFloat);
  }

  public static void f(View paramView, int paramInt)
  {
    a.f(paramView, paramInt);
  }

  public static int g(View paramView)
  {
    return a.g(paramView);
  }

  public static void g(View paramView, float paramFloat)
  {
    a.g(paramView, paramFloat);
  }

  public static int h(View paramView)
  {
    return a.h(paramView);
  }

  public static void h(View paramView, float paramFloat)
  {
    a.h(paramView, paramFloat);
  }

  public static ViewParent i(View paramView)
  {
    return a.i(paramView);
  }

  public static void i(View paramView, float paramFloat)
  {
    a.i(paramView, paramFloat);
  }

  public static void j(View paramView, float paramFloat)
  {
    a.i(paramView, paramFloat);
  }

  public static boolean j(View paramView)
  {
    return a.j(paramView);
  }

  public static int k(View paramView)
  {
    return a.k(paramView);
  }

  public static void k(View paramView, float paramFloat)
  {
    a.j(paramView, paramFloat);
  }

  public static int l(View paramView)
  {
    return a.l(paramView);
  }

  public static void l(View paramView, float paramFloat)
  {
    a.k(paramView, paramFloat);
  }

  public static float m(View paramView)
  {
    return a.m(paramView);
  }

  public static float n(View paramView)
  {
    return a.n(paramView);
  }

  public static int o(View paramView)
  {
    return a.q(paramView);
  }

  public static int p(View paramView)
  {
    return a.r(paramView);
  }

  public static cu q(View paramView)
  {
    return a.s(paramView);
  }

  public static void r(View paramView)
  {
    a.t(paramView);
  }

  public static float s(View paramView)
  {
    return a.u(paramView);
  }

  public static float t(View paramView)
  {
    return a.p(paramView);
  }

  public static float u(View paramView)
  {
    return a.o(paramView);
  }

  public static int v(View paramView)
  {
    return a.v(paramView);
  }

  public static void w(View paramView)
  {
    a.w(paramView);
  }

  public static boolean x(View paramView)
  {
    return a.x(paramView);
  }

  public static void y(View paramView)
  {
    a.y(paramView);
  }

  public static void z(View paramView)
  {
    a.z(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bg
 * JD-Core Version:    0.6.0
 */