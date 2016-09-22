package com.wandoujia.jupiter.c;

import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.listener.e;
import java.util.concurrent.CountDownLatch;

final class f
  implements e
{
  f(boolean[] paramArrayOfBoolean, CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(AccountParamConstants.FinishType paramFinishType)
  {
    boolean[] arrayOfBoolean = this.a;
    if (paramFinishType != AccountParamConstants.FinishType.CANCEL);
    for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[0] = i;
      this.b.countDown();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.f
 * JD-Core Version:    0.6.0
 */