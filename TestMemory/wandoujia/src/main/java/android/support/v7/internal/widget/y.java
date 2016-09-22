package android.support.v7.internal.widget;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class y
  implements ViewTreeObserver.OnScrollChangedListener
{
  y(Field paramField, PopupWindow paramPopupWindow, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
  }

  public final void onScrollChanged()
  {
    try
    {
      WeakReference localWeakReference = (WeakReference)this.a.get(this.b);
      if (localWeakReference != null)
      {
        if (localWeakReference.get() == null)
          return;
        this.c.onScrollChanged();
        return;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.y
 * JD-Core Version:    0.6.0
 */