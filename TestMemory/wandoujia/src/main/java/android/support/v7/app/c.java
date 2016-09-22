package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class c
  implements View.OnClickListener
{
  c(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    Message localMessage;
    if ((paramView == b.a(this.a)) && (b.b(this.a) != null))
      localMessage = Message.obtain(b.b(this.a));
    while (true)
    {
      if (localMessage != null)
        localMessage.sendToTarget();
      b.h(this.a).obtainMessage(1, b.g(this.a)).sendToTarget();
      return;
      if ((paramView == b.c(this.a)) && (b.d(this.a) != null))
      {
        localMessage = Message.obtain(b.d(this.a));
        continue;
      }
      if ((paramView == b.e(this.a)) && (b.f(this.a) != null))
      {
        localMessage = Message.obtain(b.f(this.a));
        continue;
      }
      localMessage = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.c
 * JD-Core Version:    0.6.0
 */