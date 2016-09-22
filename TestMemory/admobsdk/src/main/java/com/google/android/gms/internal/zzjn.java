package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzjn
{
  private final WeakReference<View> zzNw;

  public zzjn(View paramView)
  {
    this.zzNw = new WeakReference(paramView);
  }

  public final void zzhL()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver != null)
      zza(localViewTreeObserver);
  }

  public final void detach()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver != null)
      zzb(localViewTreeObserver);
  }

  protected abstract void zza(ViewTreeObserver paramViewTreeObserver);

  protected abstract void zzb(ViewTreeObserver paramViewTreeObserver);

  protected ViewTreeObserver getViewTreeObserver()
  {
    View localView = (View)this.zzNw.get();
    if (localView == null)
      return null;
    ViewTreeObserver localViewTreeObserver = localView.getViewTreeObserver();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive()))
      return null;
    return localViewTreeObserver;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjn
 * JD-Core Version:    0.6.0
 */