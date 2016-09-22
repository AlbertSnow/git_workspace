package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class OrderPackage$Builder extends Message.Builder<OrderPackage>
{
  public Integer app_key_id;
  public String charge_type;
  public String default_charge_type;
  public Integer default_money;
  public Integer link_order_id;
  public Integer money;
  public Integer order_id;
  public Integer order_money;
  public String trade_status;

  public OrderPackage$Builder()
  {
  }

  public OrderPackage$Builder(OrderPackage paramOrderPackage)
  {
    super(paramOrderPackage);
    if (paramOrderPackage == null)
      return;
    this.order_id = paramOrderPackage.order_id;
    this.link_order_id = paramOrderPackage.link_order_id;
    this.app_key_id = paramOrderPackage.app_key_id;
    this.default_charge_type = paramOrderPackage.default_charge_type;
    this.default_money = paramOrderPackage.default_money;
    this.order_money = paramOrderPackage.order_money;
    this.charge_type = paramOrderPackage.charge_type;
    this.money = paramOrderPackage.money;
    this.trade_status = paramOrderPackage.trade_status;
  }

  public final Builder app_key_id(Integer paramInteger)
  {
    this.app_key_id = paramInteger;
    return this;
  }

  public final OrderPackage build()
  {
    return new OrderPackage(this, null);
  }

  public final Builder charge_type(String paramString)
  {
    this.charge_type = paramString;
    return this;
  }

  public final Builder default_charge_type(String paramString)
  {
    this.default_charge_type = paramString;
    return this;
  }

  public final Builder default_money(Integer paramInteger)
  {
    this.default_money = paramInteger;
    return this;
  }

  public final Builder link_order_id(Integer paramInteger)
  {
    this.link_order_id = paramInteger;
    return this;
  }

  public final Builder money(Integer paramInteger)
  {
    this.money = paramInteger;
    return this;
  }

  public final Builder order_id(Integer paramInteger)
  {
    this.order_id = paramInteger;
    return this;
  }

  public final Builder order_money(Integer paramInteger)
  {
    this.order_money = paramInteger;
    return this;
  }

  public final Builder trade_status(String paramString)
  {
    this.trade_status = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OrderPackage.Builder
 * JD-Core Version:    0.6.0
 */