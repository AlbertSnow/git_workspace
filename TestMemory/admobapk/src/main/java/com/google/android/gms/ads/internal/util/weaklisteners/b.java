package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.ad;
import java.lang.ref.WeakReference;

@a
final class b extends d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference a;

  public b(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    super(paramView);
    this.a = new WeakReference(paramOnGlobalLayoutListener);
  }

  protected final void a(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }

  protected final void b(ViewTreeObserver paramViewTreeObserver)
  {
    bc.a().g.a(paramViewTreeObserver, this);
  }

  public final void onGlobalLayout()
  {
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)this.a.get();
    if (localOnGlobalLayoutListener != null)
    {
      localOnGlobalLayoutListener.onGlobalLayout();
      return;
    }
    b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.weaklisteners.b
 * JD-Core Version:    0.6.0
 */