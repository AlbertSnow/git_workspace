package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;

public class NetCheckInfo$Infos
  implements Serializable
{
  private String info;
  private String result;
  private String value;

  public String getValue()
  {
    return this.value;
  }

  public void setInfo(String paramString)
  {
    this.info = paramString;
  }

  public void setResult(String paramString)
  {
    this.result = paramString;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.NetCheckInfo.Infos
 * JD-Core Version:    0.6.0
 */