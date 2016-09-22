package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class OrderPackage extends Message
{
  public static final Integer DEFAULT_APP_KEY_ID;
  public static final String DEFAULT_CHARGE_TYPE = "";
  public static final String DEFAULT_DEFAULT_CHARGE_TYPE = "";
  public static final Integer DEFAULT_DEFAULT_MONEY;
  public static final Integer DEFAULT_LINK_ORDER_ID;
  public static final Integer DEFAULT_MONEY;
  public static final Integer DEFAULT_ORDER_ID = Integer.valueOf(0);
  public static final Integer DEFAULT_ORDER_MONEY;
  public static final String DEFAULT_TRADE_STATUS = "";

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer app_key_id;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String charge_type;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String default_charge_type;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer default_money;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer link_order_id;

  @ProtoField(tag=8, type=Message.Datatype.INT32)
  public final Integer money;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer order_id;

  @ProtoField(tag=6, type=Message.Datatype.INT32)
  public final Integer order_money;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String trade_status;

  static
  {
    DEFAULT_LINK_ORDER_ID = Integer.valueOf(0);
    DEFAULT_APP_KEY_ID = Integer.valueOf(0);
    DEFAULT_DEFAULT_MONEY = Integer.valueOf(0);
    DEFAULT_ORDER_MONEY = Integer.valueOf(0);
    DEFAULT_MONEY = Integer.valueOf(0);
  }

  private OrderPackage(OrderPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.order_id = paramBuilder.order_id;
    this.link_order_id = paramBuilder.link_order_id;
    this.app_key_id = paramBuilder.app_key_id;
    this.default_charge_type = paramBuilder.default_charge_type;
    this.default_money = paramBuilder.default_money;
    this.order_money = paramBuilder.order_money;
    this.charge_type = paramBuilder.charge_type;
    this.money = paramBuilder.money;
    this.trade_status = paramBuilder.trade_status;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    OrderPackage localOrderPackage;
    do
    {
      return true;
      if (!(paramObject instanceof OrderPackage))
        return false;
      localOrderPackage = (OrderPackage)paramObject;
    }
    while ((equals(this.order_id, localOrderPackage.order_id)) && (equals(this.link_order_id, localOrderPackage.link_order_id)) && (equals(this.app_key_id, localOrderPackage.app_key_id)) && (equals(this.default_charge_type, localOrderPackage.default_charge_type)) && (equals(this.default_money, localOrderPackage.default_money)) && (equals(this.order_money, localOrderPackage.order_money)) && (equals(this.charge_type, localOrderPackage.charge_type)) && (equals(this.money, localOrderPackage.money)) && (equals(this.trade_status, localOrderPackage.trade_status)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i7;
    label148: int i9;
    label174: int i10;
    if (i == 0)
    {
      if (this.order_id == null)
        break label246;
      j = this.order_id.hashCode();
      int k = j * 37;
      if (this.link_order_id == null)
        break label251;
      m = this.link_order_id.hashCode();
      int n = 37 * (m + k);
      if (this.app_key_id == null)
        break label257;
      i1 = this.app_key_id.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.default_charge_type == null)
        break label263;
      i3 = this.default_charge_type.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.default_money == null)
        break label269;
      i5 = this.default_money.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.order_money == null)
        break label275;
      i7 = this.order_money.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.charge_type == null)
        break label281;
      i9 = this.charge_type.hashCode();
      i10 = 37 * (i9 + i8);
      if (this.money == null)
        break label287;
    }
    label257: label263: label269: label275: label281: label287: for (int i11 = this.money.hashCode(); ; i11 = 0)
    {
      int i12 = 37 * (i11 + i10);
      String str = this.trade_status;
      int i13 = 0;
      if (str != null)
        i13 = this.trade_status.hashCode();
      i = i12 + i13;
      this.hashCode = i;
      return i;
      label246: j = 0;
      break;
      label251: m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OrderPackage
 * JD-Core Version:    0.6.0
 */