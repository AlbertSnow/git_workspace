package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class IdPackage$Builder extends Message.Builder<IdPackage>
{
  public String identity;
  public String pcid;
  public String udid;

  public IdPackage$Builder()
  {
  }

  public IdPackage$Builder(IdPackage paramIdPackage)
  {
    super(paramIdPackage);
    if (paramIdPackage == null)
      return;
    this.identity = paramIdPackage.identity;
    this.udid = paramIdPackage.udid;
    this.pcid = paramIdPackage.pcid;
  }

  public final IdPackage build()
  {
    checkRequiredFields();
    return new IdPackage(this, null);
  }

  public final Builder identity(String paramString)
  {
    this.identity = paramString;
    return this;
  }

  public final Builder pcid(String paramString)
  {
    this.pcid = paramString;
    return this;
  }

  public final Builder udid(String paramString)
  {
    this.udid = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IdPackage.Builder
 * JD-Core Version:    0.6.0
 */