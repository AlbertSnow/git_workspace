package com.unipay.beans;

import java.io.Serializable;

public class CheckPayReg
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public int HRet = -1;
  public String Passwd = "";
  public int Usertype = -1;
  public String imsi = "";
  public String mdn = "";
  public int smsUp = -1;
  public int status = -1;

  public CheckPayReg(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.imsi = paramString1;
    this.mdn = paramString2;
    this.Passwd = paramString3;
    this.smsUp = paramInt1;
    this.HRet = paramInt2;
    this.status = paramInt3;
    this.Usertype = paramInt4;
  }

  public int getHRet()
  {
    return this.HRet;
  }

  public String getImsi()
  {
    if (this.imsi == null)
      this.imsi = "";
    return this.imsi;
  }

  public String getMdn()
  {
    if (this.mdn == null)
      this.mdn = "";
    return this.mdn;
  }

  public String getPasswd()
  {
    if (this.Passwd == null)
      this.Passwd = "";
    return this.Passwd;
  }

  public int getSmsUp()
  {
    return this.smsUp;
  }

  public int getStatus()
  {
    return this.status;
  }

  public int getUsertype()
  {
    return this.Usertype;
  }

  public void setHRet(int paramInt)
  {
    this.HRet = paramInt;
  }

  public void setImsi(String paramString)
  {
    this.imsi = paramString;
  }

  public void setMdn(String paramString)
  {
    this.mdn = paramString;
  }

  public void setPasswd(String paramString)
  {
    this.Passwd = paramString;
  }

  public void setSmsUp(int paramInt)
  {
    this.smsUp = paramInt;
  }

  public void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public void setUsertype(int paramInt)
  {
    this.Usertype = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.beans.CheckPayReg
 * JD-Core Version:    0.6.0
 */