package com.wandoujia.account.f;

import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.g.n;
import com.wandoujia.account.listener.a;

final class d
  implements a
{
  d(b paramb)
  {
  }

  public final void a()
  {
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (paramWandouResponse.getError() == AccountError.PERMISSION_DENIED.getError())
      new Thread(new n(this.a)).start();
  }

  public final void a(String paramString)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.f.d
 * JD-Core Version:    0.6.0
 */