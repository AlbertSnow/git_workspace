package com.tencent.open;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;

final class e extends Handler
{
  private b a;

  public e(a parama, b paramb, Looper paramLooper)
  {
    super(paramLooper);
    this.a = paramb;
  }

  public final void handleMessage(Message paramMessage)
  {
    f.b("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + paramMessage.what);
    switch (paramMessage.what)
    {
    case 2:
    case 4:
    default:
    case 1:
    case 3:
    case 5:
    }
    do
    {
      do
      {
        return;
        b.a(this.a, (String)paramMessage.obj);
        return;
      }
      while ((a.a(this.b) == null) || (a.a(this.b).get() == null));
      a.a((Context)a.a(this.b).get(), (String)paramMessage.obj);
      return;
    }
    while ((a.a(this.b) == null) || (a.a(this.b).get() == null));
    a.b((Context)a.a(this.b).get(), (String)paramMessage.obj);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.e
 * JD-Core Version:    0.6.0
 */