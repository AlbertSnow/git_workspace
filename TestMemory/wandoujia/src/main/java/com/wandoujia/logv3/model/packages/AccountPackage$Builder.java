package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class AccountPackage$Builder extends Message.Builder<AccountPackage>
{
  public String email;
  public String telephone;
  public String uid;

  public AccountPackage$Builder()
  {
  }

  public AccountPackage$Builder(AccountPackage paramAccountPackage)
  {
    super(paramAccountPackage);
    if (paramAccountPackage == null)
      return;
    this.uid = paramAccountPackage.uid;
    this.telephone = paramAccountPackage.telephone;
    this.email = paramAccountPackage.email;
  }

  public final AccountPackage build()
  {
    return new AccountPackage(this, null);
  }

  public final Builder email(String paramString)
  {
    this.email = paramString;
    return this;
  }

  public final Builder telephone(String paramString)
  {
    this.telephone = paramString;
    return this;
  }

  public final Builder uid(String paramString)
  {
    this.uid = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.AccountPackage.Builder
 * JD-Core Version:    0.6.0
 */