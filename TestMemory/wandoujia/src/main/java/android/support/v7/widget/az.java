package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

final class az extends be
{
  az(LinearLayoutManager paramLinearLayoutManager, Context paramContext)
  {
    super(paramContext);
  }

  public final PointF a(int paramInt)
  {
    int i = 1;
    LinearLayoutManager localLinearLayoutManager = this.a;
    if (localLinearLayoutManager.p() == 0)
      return null;
    int j = LinearLayoutManager.e(localLinearLayoutManager.d(0));
    int k = 0;
    if (paramInt < j)
      k = i;
    if (k != localLinearLayoutManager.c)
      i = -1;
    if (localLinearLayoutManager.a == 0)
      return new PointF(i, 0.0F);
    return new PointF(0.0F, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.az
 * JD-Core Version:    0.6.0
 */