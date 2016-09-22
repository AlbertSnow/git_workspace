package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.report.client.a;
import java.lang.ref.WeakReference;

@a
abstract class d
{
  private final WeakReference a;

  public d(View paramView)
  {
    this.a = new WeakReference(paramView);
  }

  private ViewTreeObserver c()
  {
    View localView = (View)this.a.get();
    ViewTreeObserver localViewTreeObserver;
    if (localView == null)
      localViewTreeObserver = null;
    do
    {
      return localViewTreeObserver;
      localViewTreeObserver = localView.getViewTreeObserver();
    }
    while ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive()));
    return null;
  }

  public final void a()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null)
      a(localViewTreeObserver);
  }

  protected abstract void a(ViewTreeObserver paramViewTreeObserver);

  public final void b()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null)
      b(localViewTreeObserver);
  }

  protected abstract void b(ViewTreeObserver paramViewTreeObserver);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.weaklisteners.d
 * JD-Core Version:    0.6.0
 */