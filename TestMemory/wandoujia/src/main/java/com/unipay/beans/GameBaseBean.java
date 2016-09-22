package com.unipay.beans;

import java.io.Serializable;

public class GameBaseBean
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String _$1 = "";
  private String _$2 = "";
  private String _$3 = "";
  private String _$4 = "";
  private String _$5 = "";
  private String _$6 = "";
  private String _$7 = "";
  private String _$8 = "";

  public GameBaseBean(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this._$6 = paramString1;
    this._$7 = paramString2;
    this._$8 = paramString3;
    this._$5 = paramString4;
    this._$4 = paramString5;
    this._$3 = paramString6;
    this._$2 = paramString7;
    this._$1 = paramString8;
  }

  public String getAppid()
  {
    return this._$6;
  }

  public String getChannelid()
  {
    return this._$1;
  }

  public String getCompany()
  {
    return this._$5;
  }

  public String getCpid()
  {
    return this._$7;
  }

  public String getGame()
  {
    return this._$3;
  }

  public String getPrmCode()
  {
    return this._$8;
  }

  public String getTelephone()
  {
    return this._$4;
  }

  public String getUid()
  {
    return this._$2;
  }

  public void setAppid(String paramString)
  {
    this._$6 = paramString;
  }

  public void setChannelid(String paramString)
  {
    this._$1 = paramString;
  }

  public void setCompany(String paramString)
  {
    this._$5 = paramString;
  }

  public void setCpid(String paramString)
  {
    this._$7 = paramString;
  }

  public void setGame(String paramString)
  {
    this._$3 = paramString;
  }

  public void setPrmCode(String paramString)
  {
    this._$8 = paramString;
  }

  public void setTelephone(String paramString)
  {
    this._$4 = paramString;
  }

  public void setUid(String paramString)
  {
    this._$2 = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.beans.GameBaseBean
 * JD-Core Version:    0.6.0
 */