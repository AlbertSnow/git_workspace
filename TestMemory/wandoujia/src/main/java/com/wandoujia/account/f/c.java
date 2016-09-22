package com.wandoujia.account.f;

import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.listener.e;
import java.lang.ref.WeakReference;

final class c
  implements Runnable
{
  c(WeakReference paramWeakReference, AccountParamConstants.FinishType paramFinishType)
  {
  }

  public final void run()
  {
    if (this.a.get() != null)
      ((e)this.a.get()).a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.f.c
 * JD-Core Version:    0.6.0
 */