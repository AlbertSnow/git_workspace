package com.unipay.beans;

import java.io.Serializable;

public class BuyAppTool2Rsp
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public String AppId = "";
  public String HRet = "";
  public String MENO = "";
  public String callbackURL = "";
  public String consumeCode = "";
  public String cpId = "";
  public String imsi = "";
  public String mdn = "";
  public String orderid = "";
  public String payType = "";
  public String payfee = "";
  public String status = "";

  public String getAppId()
  {
    return this.AppId;
  }

  public String getCallbackURL()
  {
    return this.callbackURL;
  }

  public String getConsumeCode()
  {
    return this.consumeCode;
  }

  public String getCpId()
  {
    return this.cpId;
  }

  public String getHRet()
  {
    return this.HRet;
  }

  public String getImsi()
  {
    return this.imsi;
  }

  public String getMENO()
  {
    return this.MENO;
  }

  public String getMdn()
  {
    return this.mdn;
  }

  public String getOrderid()
  {
    return this.orderid;
  }

  public String getPayType()
  {
    return this.payType;
  }

  public String getPayfee()
  {
    return this.payfee;
  }

  public String getStatus()
  {
    return this.status;
  }

  public void setAppId(String paramString)
  {
    this.AppId = paramString;
  }

  public void setCallbackURL(String paramString)
  {
    this.callbackURL = paramString;
  }

  public void setConsumeCode(String paramString)
  {
    this.consumeCode = paramString;
  }

  public void setCpId(String paramString)
  {
    this.cpId = paramString;
  }

  public void setHRet(String paramString)
  {
    this.HRet = paramString;
  }

  public void setImsi(String paramString)
  {
    this.imsi = paramString;
  }

  public void setMENO(String paramString)
  {
    this.MENO = paramString;
  }

  public void setMdn(String paramString)
  {
    this.mdn = paramString;
  }

  public void setOrderid(String paramString)
  {
    this.orderid = paramString;
  }

  public void setPayType(String paramString)
  {
    this.payType = paramString;
  }

  public void setPayfee(String paramString)
  {
    this.payfee = paramString;
  }

  public void setStatus(String paramString)
  {
    this.status = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.beans.BuyAppTool2Rsp
 * JD-Core Version:    0.6.0
 */