package com.wandoujia.push.protocol;

import java.io.Serializable;

public class StandardPushEntity$Callback$Pair
  implements Serializable
{
  private String key;
  private String value;

  public StandardPushEntity$Callback$Pair()
  {
    this.key = null;
    this.value = null;
  }

  public StandardPushEntity$Callback$Pair(String paramString1, String paramString2)
  {
    this.key = paramString1;
    this.value = paramString2;
  }

  public String getKey()
  {
    return this.key;
  }

  public String getValue()
  {
    return this.value;
  }

  public void setKey(String paramString)
  {
    this.key = paramString;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }

  public String toString()
  {
    return "[ " + this.key + " : " + this.value + " ]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.StandardPushEntity.Callback.Pair
 * JD-Core Version:    0.6.0
 */