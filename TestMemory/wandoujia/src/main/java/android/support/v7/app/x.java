package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.widget.au;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

final class x extends FrameLayout
{
  public x(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, Context paramContext)
  {
    super(paramContext);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.a.a(paramKeyEvent);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((i < -5) || (j < -5) || (i > 5 + getWidth()) || (j > 5 + getHeight()));
      for (int k = 1; k != 0; k = 0)
      {
        AppCompatDelegateImplV7.d(this.a);
        return true;
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  public final void setBackgroundResource(int paramInt)
  {
    setBackgroundDrawable(au.a(getContext(), paramInt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.x
 * JD-Core Version:    0.6.0
 */