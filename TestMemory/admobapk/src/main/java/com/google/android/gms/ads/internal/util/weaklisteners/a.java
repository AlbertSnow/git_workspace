package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  public static void a(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    new b(paramView, paramOnGlobalLayoutListener).a();
  }

  public static void a(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    new c(paramView, paramOnScrollChangedListener).a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.weaklisteners.a
 * JD-Core Version:    0.6.0
 */