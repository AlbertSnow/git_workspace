package com.unionpay.pboctransaction.a;

import com.unionpay.mobile.tsm.connect.IInitCallback.Stub;
import com.unionpay.pboctransaction.b;

final class c extends IInitCallback.Stub
{
  c(a parama)
  {
  }

  public final void initFailed()
  {
    if (this.a.a != null)
      this.a.a.b();
  }

  public final void initSucceed()
  {
    if (this.a.a != null)
      this.a.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.a.c
 * JD-Core Version:    0.6.0
 */