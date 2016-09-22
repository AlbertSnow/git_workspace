package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

class bh
  implements bq
{
  WeakHashMap<View, cu> a = null;

  public void A(View paramView)
  {
    if ((paramView instanceof aq))
      ((aq)paramView).stopNestedScroll();
  }

  public boolean B(View paramView)
  {
    return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
  }

  public boolean C(View paramView)
  {
    return paramView.getWindowToken() != null;
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }

  public int a(View paramView)
  {
    return 2;
  }

  long a()
  {
    return 10L;
  }

  public dk a(View paramView, dk paramdk)
  {
    return paramdk;
  }

  public void a(View paramView, float paramFloat)
  {
  }

  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.invalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(View paramView, int paramInt, Paint paramPaint)
  {
  }

  public void a(View paramView, Paint paramPaint)
  {
  }

  public void a(View paramView, a parama)
  {
  }

  public void a(View paramView, as paramas)
  {
  }

  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }

  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, paramLong + a());
  }

  public void a(View paramView, String paramString)
  {
  }

  public void a(View paramView, boolean paramBoolean)
  {
  }

  public void a(ViewGroup paramViewGroup)
  {
  }

  public boolean a(View paramView, int paramInt)
  {
    if ((paramView instanceof bb))
    {
      bb localbb = (bb)paramView;
      int i = localbb.computeHorizontalScrollOffset();
      int j = localbb.computeHorizontalScrollRange() - localbb.computeHorizontalScrollExtent();
      int k;
      if (j != 0)
        if (paramInt < 0)
          if (i > 0)
            k = 1;
      while (k != 0)
      {
        return true;
        k = 0;
        continue;
        if (i < j - 1)
        {
          k = 1;
          continue;
        }
        k = 0;
      }
    }
    return false;
  }

  public void b(View paramView, float paramFloat)
  {
  }

  public boolean b(View paramView)
  {
    return false;
  }

  public boolean b(View paramView, int paramInt)
  {
    if ((paramView instanceof bb))
    {
      bb localbb = (bb)paramView;
      int i = localbb.computeVerticalScrollOffset();
      int j = localbb.computeVerticalScrollRange() - localbb.computeVerticalScrollExtent();
      int k;
      if (j != 0)
        if (paramInt < 0)
          if (i > 0)
            k = 1;
      while (k != 0)
      {
        return true;
        k = 0;
        continue;
        if (i < j - 1)
        {
          k = 1;
          continue;
        }
        k = 0;
      }
    }
    return false;
  }

  public void c(View paramView, float paramFloat)
  {
  }

  public void c(View paramView, int paramInt)
  {
  }

  public boolean c(View paramView)
  {
    return false;
  }

  public void d(View paramView)
  {
    paramView.invalidate();
  }

  public void d(View paramView, float paramFloat)
  {
  }

  public void d(View paramView, int paramInt)
  {
  }

  public int e(View paramView)
  {
    return 0;
  }

  public void e(View paramView, float paramFloat)
  {
  }

  public void e(View paramView, int paramInt)
  {
  }

  public float f(View paramView)
  {
    return 1.0F;
  }

  public void f(View paramView, float paramFloat)
  {
  }

  public void f(View paramView, int paramInt)
  {
  }

  public int g(View paramView)
  {
    return 0;
  }

  public void g(View paramView, float paramFloat)
  {
  }

  public int h(View paramView)
  {
    return 0;
  }

  public void h(View paramView, float paramFloat)
  {
  }

  public ViewParent i(View paramView)
  {
    return paramView.getParent();
  }

  public void i(View paramView, float paramFloat)
  {
  }

  public void j(View paramView, float paramFloat)
  {
  }

  public boolean j(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    int i = 0;
    if (localDrawable != null)
    {
      int j = localDrawable.getOpacity();
      i = 0;
      if (j == -1)
        i = 1;
    }
    return i;
  }

  public int k(View paramView)
  {
    return paramView.getMeasuredWidth();
  }

  public void k(View paramView, float paramFloat)
  {
  }

  public int l(View paramView)
  {
    return 0;
  }

  public float m(View paramView)
  {
    return 0.0F;
  }

  public float n(View paramView)
  {
    return 0.0F;
  }

  public float o(View paramView)
  {
    return 0.0F;
  }

  public float p(View paramView)
  {
    return 0.0F;
  }

  public int q(View paramView)
  {
    return c.a(paramView);
  }

  public int r(View paramView)
  {
    return c.b(paramView);
  }

  public cu s(View paramView)
  {
    return new cu(paramView);
  }

  public void t(View paramView)
  {
  }

  public float u(View paramView)
  {
    return 0.0F;
  }

  public int v(View paramView)
  {
    return 0;
  }

  public void w(View paramView)
  {
  }

  public boolean x(View paramView)
  {
    return false;
  }

  public void y(View paramView)
  {
  }

  public void z(View paramView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bh
 * JD-Core Version:    0.6.0
 */