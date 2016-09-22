package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class XibaibaiResultPackage$Builder extends Message.Builder<XibaibaiResultPackage>
{
  public String id;

  public XibaibaiResultPackage$Builder()
  {
  }

  public XibaibaiResultPackage$Builder(XibaibaiResultPackage paramXibaibaiResultPackage)
  {
    super(paramXibaibaiResultPackage);
    if (paramXibaibaiResultPackage == null)
      return;
    this.id = paramXibaibaiResultPackage.id;
  }

  public final XibaibaiResultPackage build()
  {
    return new XibaibaiResultPackage(this, null);
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.XibaibaiResultPackage.Builder
 * JD-Core Version:    0.6.0
 */