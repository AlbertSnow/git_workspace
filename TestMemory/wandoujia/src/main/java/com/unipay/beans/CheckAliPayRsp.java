package com.unipay.beans;

import java.io.Serializable;

public class CheckAliPayRsp
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public String AppId = "";
  public String HRet = "";
  public String MENO = "";
  public String consumeCode = "";
  public String encrypt = "";
  public String orderid = "";
  public String payfee = "";
  public String status = "";

  public String getAppId()
  {
    return this.AppId;
  }

  public String getConsumeCode()
  {
    return this.consumeCode;
  }

  public String getEncrypt()
  {
    return this.encrypt;
  }

  public String getHRet()
  {
    return this.HRet;
  }

  public String getMENO()
  {
    return this.MENO;
  }

  public String getOrderid()
  {
    return this.orderid;
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

  public void setConsumeCode(String paramString)
  {
    this.consumeCode = paramString;
  }

  public void setEncrypt(String paramString)
  {
    this.encrypt = paramString;
  }

  public void setHRet(String paramString)
  {
    this.HRet = paramString;
  }

  public void setMENO(String paramString)
  {
    this.MENO = paramString;
  }

  public void setOrderid(String paramString)
  {
    this.orderid = paramString;
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
 * Qualified Name:     com.unipay.beans.CheckAliPayRsp
 * JD-Core Version:    0.6.0
 */