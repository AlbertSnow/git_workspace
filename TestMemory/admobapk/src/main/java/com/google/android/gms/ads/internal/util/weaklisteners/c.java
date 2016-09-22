package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.report.client.a;
import java.lang.ref.WeakReference;

@a
final class c extends d
  implements ViewTreeObserver.OnScrollChangedListener
{
  private final WeakReference a;

  public c(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramView);
    this.a = new WeakReference(paramOnScrollChangedListener);
  }

  protected final void a(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnScrollChangedListener(this);
  }

  protected final void b(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.removeOnScrollChangedListener(this);
  }

  public final void onScrollChanged()
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)this.a.get();
    if (localOnScrollChangedListener != null)
    {
      localOnScrollChangedListener.onScrollChanged();
      return;
    }
    b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.weaklisteners.c
 * JD-Core Version:    0.6.0
 */