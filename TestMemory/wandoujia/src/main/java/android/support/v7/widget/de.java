package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

final class de extends be
{
  de(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF a(int paramInt)
  {
    int i = StaggeredGridLayoutManager.a(this.a, paramInt);
    if (i == 0)
      return null;
    return new PointF(i, 0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.de
 * JD-Core Version:    0.6.0
 */