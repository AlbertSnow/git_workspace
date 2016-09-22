package com.unipay.beans;

import java.io.Serializable;

public class PayValueBean
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String _$1 = "";
  private String _$2 = "";
  private String _$3 = "";
  private String _$4 = "";
  private String _$5 = "";
  private String _$6 = "";

  public PayValueBean(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this._$5 = paramString1;
    this._$4 = "1";
    this._$3 = paramString2;
    this._$2 = paramString3;
    this._$1 = paramString4;
    this._$6 = "2";
  }

  public String getCustomCode()
  {
    return this._$4;
  }

  public String getMoney()
  {
    return this._$2;
  }

  public String getOrderid()
  {
    return this._$1;
  }

  public String getProps()
  {
    return this._$3;
  }

  public String getVacCode()
  {
    return this._$5;
  }

  public String getVac_mode()
  {
    return this._$6;
  }

  public void setCustomCode(String paramString)
  {
    this._$4 = paramString;
  }

  public void setMoney(String paramString)
  {
    this._$2 = paramString;
  }

  public void setOrderid(String paramString)
  {
    this._$1 = paramString;
  }

  public void setProps(String paramString)
  {
    this._$3 = paramString;
  }

  public void setVacCode(String paramString)
  {
    this._$5 = paramString;
  }

  public void setVac_mode(String paramString)
  {
    this._$6 = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.beans.PayValueBean
 * JD-Core Version:    0.6.0
 */