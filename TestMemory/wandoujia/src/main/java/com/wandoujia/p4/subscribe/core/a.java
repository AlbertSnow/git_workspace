package com.wandoujia.p4.subscribe.core;

import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.listener.e;
import java.util.concurrent.CountDownLatch;

final class a
  implements e
{
  a(CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(AccountParamConstants.FinishType paramFinishType)
  {
    this.a.countDown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.a
 * JD-Core Version:    0.6.0
 */