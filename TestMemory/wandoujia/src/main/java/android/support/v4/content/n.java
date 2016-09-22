package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

final class n extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    m localm = (m)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      ModernAsyncTask.a(localm.a);
      return;
    case 2:
    }
    ModernAsyncTask.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.n
 * JD-Core Version:    0.6.0
 */