package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class CardPackage$Builder extends Message.Builder<CardPackage>
{
  public String identity;
  public Integer num;
  public String parent_id;
  public String status;
  public String sub_status;
  public String sub_type;
  public String tag;
  public String type;

  public CardPackage$Builder()
  {
  }

  public CardPackage$Builder(CardPackage paramCardPackage)
  {
    super(paramCardPackage);
    if (paramCardPackage == null)
      return;
    this.identity = paramCardPackage.identity;
    this.parent_id = paramCardPackage.parent_id;
    this.type = paramCardPackage.type;
    this.sub_type = paramCardPackage.sub_type;
    this.tag = paramCardPackage.tag;
    this.status = paramCardPackage.status;
    this.sub_status = paramCardPackage.sub_status;
    this.num = paramCardPackage.num;
  }

  public final CardPackage build()
  {
    return new CardPackage(this, null);
  }

  public final Builder identity(String paramString)
  {
    this.identity = paramString;
    return this;
  }

  public final Builder num(Integer paramInteger)
  {
    this.num = paramInteger;
    return this;
  }

  public final Builder parent_id(String paramString)
  {
    this.parent_id = paramString;
    return this;
  }

  public final Builder status(String paramString)
  {
    this.status = paramString;
    return this;
  }

  public final Builder sub_status(String paramString)
  {
    this.sub_status = paramString;
    return this;
  }

  public final Builder sub_type(String paramString)
  {
    this.sub_type = paramString;
    return this;
  }

  public final Builder tag(String paramString)
  {
    this.tag = paramString;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.CardPackage.Builder
 * JD-Core Version:    0.6.0
 */