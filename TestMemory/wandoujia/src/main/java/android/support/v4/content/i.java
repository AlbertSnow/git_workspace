package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class i extends Handler
{
  i(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
      return;
    case 1:
    }
    h.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.i
 * JD-Core Version:    0.6.0
 */