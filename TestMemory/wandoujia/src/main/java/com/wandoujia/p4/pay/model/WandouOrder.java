package com.wandoujia.p4.pay.model;

import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public class WandouOrder
{
  private String chargeType = null;
  private String desc = null;
  private String message = null;
  private boolean mobileOperation = false;
  private Long moneyInFen = null;
  private String name = null;
  private Long orderId = Long.valueOf(0L);
  private String out_trade_no = null;
  private String rechargeInfo = null;

  public WandouOrder(String paramString1, String paramString2, Long paramLong)
  {
    this.name = paramString1;
    this.desc = paramString2;
    this.moneyInFen = paramLong;
  }

  public void fromJSONString(String paramString)
  {
    JSONObject localJSONObject = new JSONObject(paramString);
    this.orderId = Long.valueOf(localJSONObject.getLong("order_no"));
    this.name = localJSONObject.optString("name");
    this.desc = localJSONObject.optString("desc");
    this.moneyInFen = Long.valueOf(localJSONObject.getLong("money"));
    this.message = localJSONObject.optString("message", this.message);
    this.out_trade_no = localJSONObject.optString("out_trade_no");
    this.mobileOperation = localJSONObject.optBoolean("mobile_operation");
  }

  public String getChargeType()
  {
    return this.chargeType;
  }

  public String getDesc()
  {
    return this.desc;
  }

  public String getMessage()
  {
    return this.message;
  }

  public Long getMoneyInFen()
  {
    return this.moneyInFen;
  }

  public String getName()
  {
    return this.name;
  }

  public Long getOrderId()
  {
    return this.orderId;
  }

  public String getOut_trade_no()
  {
    return this.out_trade_no;
  }

  public String getRehargeInfo()
  {
    return this.rechargeInfo;
  }

  public String getShowMoney()
  {
    BigDecimal localBigDecimal = new BigDecimal("100");
    return new BigDecimal(this.moneyInFen.longValue()).divide(localBigDecimal).toPlainString();
  }

  public void setChargeType(String paramString)
  {
    this.chargeType = paramString;
  }

  public void setDesc(String paramString)
  {
    this.desc = paramString;
  }

  public void setMessage(String paramString)
  {
    this.message = paramString;
  }

  public void setMobileOperation(boolean paramBoolean)
  {
    this.mobileOperation = paramBoolean;
  }

  public void setMoneyInFen(Long paramLong)
  {
    this.moneyInFen = paramLong;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setOrderId(Long paramLong)
  {
    this.orderId = paramLong;
  }

  public void setOut_trade_no(String paramString)
  {
    this.out_trade_no = paramString;
  }

  public void setRechargeInfo(String paramString)
  {
    this.rechargeInfo = paramString;
  }

  public String toJSONString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("order_no", this.orderId);
      localJSONObject.put("name", this.name);
      localJSONObject.put("desc", this.desc);
      localJSONObject.put("money", this.moneyInFen);
      localJSONObject.put("message", this.message);
      localJSONObject.put("out_trade_no", this.out_trade_no);
      localJSONObject.put("mobile_operation", this.mobileOperation);
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONException.toString();
  }

  public String toString()
  {
    return toJSONString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.WandouOrder
 * JD-Core Version:    0.6.0
 */