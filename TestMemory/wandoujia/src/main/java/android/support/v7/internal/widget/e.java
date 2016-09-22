package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class e extends Drawable
{
  final ActionBarContainer a;

  public e(ActionBarContainer paramActionBarContainer)
  {
    this.a = paramActionBarContainer;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.a.d)
      if (this.a.c != null)
        this.a.c.draw(paramCanvas);
    do
    {
      return;
      if (this.a.a == null)
        continue;
      this.a.a.draw(paramCanvas);
    }
    while ((this.a.b == null) || (!this.a.e));
    this.a.b.draw(paramCanvas);
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.e
 * JD-Core Version:    0.6.0
 */