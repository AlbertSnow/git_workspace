package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SubscribeItemPackage$Builder extends Message.Builder<SubscribeItemPackage>
{
  public String item_createTime;
  public String item_feedName;
  public String item_id;
  public String item_type;
  public String item_updateTime;

  public SubscribeItemPackage$Builder()
  {
  }

  public SubscribeItemPackage$Builder(SubscribeItemPackage paramSubscribeItemPackage)
  {
    super(paramSubscribeItemPackage);
    if (paramSubscribeItemPackage == null)
      return;
    this.item_type = paramSubscribeItemPackage.item_type;
    this.item_id = paramSubscribeItemPackage.item_id;
    this.item_createTime = paramSubscribeItemPackage.item_createTime;
    this.item_updateTime = paramSubscribeItemPackage.item_updateTime;
    this.item_feedName = paramSubscribeItemPackage.item_feedName;
  }

  public final SubscribeItemPackage build()
  {
    return new SubscribeItemPackage(this, null);
  }

  public final Builder item_createTime(String paramString)
  {
    this.item_createTime = paramString;
    return this;
  }

  public final Builder item_feedName(String paramString)
  {
    this.item_feedName = paramString;
    return this;
  }

  public final Builder item_id(String paramString)
  {
    this.item_id = paramString;
    return this;
  }

  public final Builder item_type(String paramString)
  {
    this.item_type = paramString;
    return this;
  }

  public final Builder item_updateTime(String paramString)
  {
    this.item_updateTime = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribeItemPackage.Builder
 * JD-Core Version:    0.6.0
 */