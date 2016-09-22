package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class cv
  implements dd
{
  private WeakHashMap<View, Runnable> a = null;

  private void c(cu paramcu, View paramView)
  {
    WeakHashMap localWeakHashMap = this.a;
    Object localObject = null;
    if (localWeakHashMap != null)
      localObject = (Runnable)this.a.get(paramView);
    if (localObject == null)
    {
      localObject = new cw(this, paramcu, paramView, 0);
      if (this.a == null)
        this.a = new WeakHashMap();
      this.a.put(paramView, localObject);
    }
    paramView.removeCallbacks((Runnable)localObject);
    paramView.post((Runnable)localObject);
  }

  private void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dh));
    for (dh localdh = (dh)localObject; ; localdh = null)
    {
      cu.e();
      cu.f();
      if (localdh != null)
      {
        localdh.a(paramView);
        localdh.b(paramView);
      }
      if (this.a != null)
        this.a.remove(paramView);
      return;
    }
  }

  public void a(cu paramcu, View paramView)
  {
    c(paramcu, paramView);
  }

  public void a(cu paramcu, View paramView, float paramFloat)
  {
    c(paramcu, paramView);
  }

  public void a(cu paramcu, View paramView, dh paramdh)
  {
    paramView.setTag(2113929216, paramdh);
  }

  public void a(View paramView)
  {
  }

  public void a(View paramView, long paramLong)
  {
  }

  public void a(View paramView, dj paramdj)
  {
  }

  public void a(View paramView, Interpolator paramInterpolator)
  {
  }

  public void b(cu paramcu, View paramView)
  {
    c(paramcu, paramView);
  }

  public void b(cu paramcu, View paramView, float paramFloat)
  {
    c(paramcu, paramView);
  }

  public void b(View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null)
        paramView.removeCallbacks(localRunnable);
    }
    c(paramView);
  }

  public void c(cu paramcu, View paramView, float paramFloat)
  {
    c(paramcu, paramView);
  }

  public void d(cu paramcu, View paramView, float paramFloat)
  {
    c(paramcu, paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cv
 * JD-Core Version:    0.6.0
 */