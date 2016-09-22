package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import com.tencent.open.yyb.a;

final class af extends Transition.EpicenterCallback
{
  private Rect a;

  af(a parama)
  {
  }

  public final Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.a == null) && (this.b.a != null))
      this.a = b.a(this.b.a);
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.af
 * JD-Core Version:    0.6.0
 */