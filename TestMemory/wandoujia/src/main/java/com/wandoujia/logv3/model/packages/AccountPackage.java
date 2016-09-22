package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AccountPackage extends Message
{
  public static final String DEFAULT_EMAIL = "";
  public static final String DEFAULT_TELEPHONE = "";
  public static final String DEFAULT_UID = "";

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String email;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String telephone;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String uid;

  private AccountPackage(AccountPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.uid = paramBuilder.uid;
    this.telephone = paramBuilder.telephone;
    this.email = paramBuilder.email;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AccountPackage localAccountPackage;
    do
    {
      return true;
      if (!(paramObject instanceof AccountPackage))
        return false;
      localAccountPackage = (AccountPackage)paramObject;
    }
    while ((equals(this.uid, localAccountPackage.uid)) && (equals(this.telephone, localAccountPackage.telephone)) && (equals(this.email, localAccountPackage.email)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.uid == null)
        break label90;
      j = this.uid.hashCode();
      k = j * 37;
      if (this.telephone == null)
        break label95;
    }
    label90: label95: for (int m = this.telephone.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.email;
      int i1 = 0;
      if (str != null)
        i1 = this.email.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.AccountPackage
 * JD-Core Version:    0.6.0
 */