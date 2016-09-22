package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
  private final Runnable a = new f(this);
  private final Runnable b = new g(this);

  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }

  private void a()
  {
    removeCallbacks(this.a);
    removeCallbacks(this.b);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ContentLoadingProgressBar
 * JD-Core Version:    0.6.0
 */