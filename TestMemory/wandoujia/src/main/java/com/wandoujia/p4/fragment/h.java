package com.wandoujia.p4.fragment;

import android.content.Context;
import android.os.Handler;
import com.wandoujia.jupiter.view.p;

final class h
{
  private p b;
  private boolean c;
  private Context d;
  private final Handler e = new i(this);

  public h(NetworkListAsyncloadFragment paramNetworkListAsyncloadFragment, Context paramContext)
  {
    this.d = paramContext;
  }

  private void b()
  {
    if (this.b != null)
    {
      this.b.b();
      this.b = null;
    }
  }

  public final void a()
  {
    b();
    for (NetworkListAsyncloadFragment.Message localMessage : NetworkListAsyncloadFragment.Message.values())
      this.e.removeMessages(localMessage.ordinal());
  }

  public final void a(NetworkListAsyncloadFragment.Message paramMessage)
  {
    if ((NetworkListAsyncloadFragment.b(this.a)) && (this.a.isResumed()))
    {
      a();
      this.e.sendEmptyMessage(paramMessage.ordinal());
    }
  }

  public final void a(NetworkListAsyncloadFragment.Message paramMessage, long paramLong)
  {
    if ((NetworkListAsyncloadFragment.b(this.a)) && (this.a.isResumed()))
      this.e.sendEmptyMessageDelayed(paramMessage.ordinal(), paramLong);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.h
 * JD-Core Version:    0.6.0
 */