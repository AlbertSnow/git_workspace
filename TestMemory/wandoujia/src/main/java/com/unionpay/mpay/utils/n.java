package com.unionpay.mpay.utils;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.unionpay.mpay.net.c;
import com.unionpay.mpay.net.d;

public final class n
  implements Handler.Callback, Runnable
{
  private d a = null;
  private Handler b = null;
  private n.a c = null;

  public n(String paramString, n.a parama)
  {
    this.a = new d(0, paramString, null);
    this.b = new Handler(this);
    this.c = parama;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    do
      return true;
    while (this.c == null);
    if (paramMessage.obj != null);
    for (byte[] arrayOfByte = (byte[])paramMessage.obj; ; arrayOfByte = null)
    {
      this.c.a(paramMessage.arg1, arrayOfByte);
      break;
    }
  }

  public final void run()
  {
    c localc = new c(this.a);
    int i = localc.a();
    Message localMessage = this.b.obtainMessage();
    localMessage.what = 0;
    localMessage.arg1 = i;
    localMessage.obj = localc.b();
    this.b.sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.utils.n
 * JD-Core Version:    0.6.0
 */