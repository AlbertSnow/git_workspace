package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TriggerPackage$Builder extends Message.Builder<TriggerPackage>
{
  public String source;
  public String type;

  public TriggerPackage$Builder()
  {
  }

  public TriggerPackage$Builder(TriggerPackage paramTriggerPackage)
  {
    super(paramTriggerPackage);
    if (paramTriggerPackage == null)
      return;
    this.type = paramTriggerPackage.type;
    this.source = paramTriggerPackage.source;
  }

  public final TriggerPackage build()
  {
    return new TriggerPackage(this, null);
  }

  public final Builder source(String paramString)
  {
    this.source = paramString;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TriggerPackage.Builder
 * JD-Core Version:    0.6.0
 */