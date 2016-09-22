package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class GiftDetail$Builder extends Message.Builder<GiftDetail>
{
  public String cdkey;
  public String cdkey_id;
  public String description;
  public String directions;
  public Long end_date_stamp;
  public String exchange_date_range;
  public Long id;
  public Boolean is_received;
  public String package_name;
  public String provide_type;
  public Integer received_count;
  public Integer remnant_count;
  public Long reuse_start_date;
  public String special_action;
  public String status;
  public String title;

  public GiftDetail$Builder()
  {
  }

  public GiftDetail$Builder(GiftDetail paramGiftDetail)
  {
    super(paramGiftDetail);
    if (paramGiftDetail == null)
      return;
    this.title = paramGiftDetail.title;
    this.description = paramGiftDetail.description;
    this.package_name = paramGiftDetail.package_name;
    this.received_count = paramGiftDetail.received_count;
    this.remnant_count = paramGiftDetail.remnant_count;
    this.is_received = paramGiftDetail.is_received;
    this.exchange_date_range = paramGiftDetail.exchange_date_range;
    this.directions = paramGiftDetail.directions;
    this.cdkey = paramGiftDetail.cdkey;
    this.special_action = paramGiftDetail.special_action;
    this.id = paramGiftDetail.id;
    this.cdkey_id = paramGiftDetail.cdkey_id;
    this.provide_type = paramGiftDetail.provide_type;
    this.end_date_stamp = paramGiftDetail.end_date_stamp;
    this.status = paramGiftDetail.status;
    this.reuse_start_date = paramGiftDetail.reuse_start_date;
  }

  public final GiftDetail build()
  {
    return new GiftDetail(this, null);
  }

  public final Builder cdkey(String paramString)
  {
    this.cdkey = paramString;
    return this;
  }

  public final Builder cdkey_id(String paramString)
  {
    this.cdkey_id = paramString;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder directions(String paramString)
  {
    this.directions = paramString;
    return this;
  }

  public final Builder end_date_stamp(Long paramLong)
  {
    this.end_date_stamp = paramLong;
    return this;
  }

  public final Builder exchange_date_range(String paramString)
  {
    this.exchange_date_range = paramString;
    return this;
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }

  public final Builder is_received(Boolean paramBoolean)
  {
    this.is_received = paramBoolean;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }

  public final Builder provide_type(String paramString)
  {
    this.provide_type = paramString;
    return this;
  }

  public final Builder received_count(Integer paramInteger)
  {
    this.received_count = paramInteger;
    return this;
  }

  public final Builder remnant_count(Integer paramInteger)
  {
    this.remnant_count = paramInteger;
    return this;
  }

  public final Builder reuse_start_date(Long paramLong)
  {
    this.reuse_start_date = paramLong;
    return this;
  }

  public final Builder special_action(String paramString)
  {
    this.special_action = paramString;
    return this;
  }

  public final Builder status(String paramString)
  {
    this.status = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.GiftDetail.Builder
 * JD-Core Version:    0.6.0
 */