package com.wandoujia.p4.account.activity;

import com.wandoujia.account.d.a;
import com.wandoujia.account.dto.AccountVerification;
import com.wandoujia.account.dto.AccountVerification.AccountVerificationMethod;

final class p
  implements a
{
  p(AccountChangeActivity paramAccountChangeActivity)
  {
  }

  public final void a()
  {
    this.a.setResult(403);
    this.a.finish();
  }

  public final void a(String paramString, AccountVerification paramAccountVerification)
  {
    if (paramAccountVerification.getMethod() != AccountVerification.AccountVerificationMethod.EMAIL)
    {
      AccountChangeActivity.a(this.a);
      return;
    }
    AccountChangeActivity.a(this.a, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.p
 * JD-Core Version:    0.6.0
 */