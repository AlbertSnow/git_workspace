package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class z
  implements aa
{
  public final Object a(Context paramContext)
  {
    return new EdgeEffect(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
  }

  public final boolean a(Object paramObject)
  {
    return ((EdgeEffect)paramObject).isFinished();
  }

  public final boolean a(Object paramObject, float paramFloat)
  {
    return b.a(paramObject, paramFloat);
  }

  public boolean a(Object paramObject, float paramFloat1, float paramFloat2)
  {
    return b.a(paramObject, paramFloat1);
  }

  public final boolean a(Object paramObject, int paramInt)
  {
    ((EdgeEffect)paramObject).onAbsorb(paramInt);
    return true;
  }

  public final boolean a(Object paramObject, Canvas paramCanvas)
  {
    return ((EdgeEffect)paramObject).draw(paramCanvas);
  }

  public final void b(Object paramObject)
  {
    ((EdgeEffect)paramObject).finish();
  }

  public final boolean c(Object paramObject)
  {
    EdgeEffect localEdgeEffect = (EdgeEffect)paramObject;
    localEdgeEffect.onRelease();
    return localEdgeEffect.isFinished();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.z
 * JD-Core Version:    0.6.0
 */