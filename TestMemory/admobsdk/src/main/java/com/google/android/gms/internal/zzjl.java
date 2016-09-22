package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;

@zzhb
class zzjl extends zzjn
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> zzNv;

  public zzjl(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    super(paramView);
    this.zzNv = new WeakReference(paramOnGlobalLayoutListener);
  }

  public void onGlobalLayout()
  {
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)this.zzNv.get();
    if (localOnGlobalLayoutListener != null)
      localOnGlobalLayoutListener.onGlobalLayout();
    else
      detach();
  }

  protected void zza(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }

  protected void zzb(ViewTreeObserver paramViewTreeObserver)
  {
    zzr.zzbE().zza(paramViewTreeObserver, this);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjl
 * JD-Core Version:    0.6.0
 */