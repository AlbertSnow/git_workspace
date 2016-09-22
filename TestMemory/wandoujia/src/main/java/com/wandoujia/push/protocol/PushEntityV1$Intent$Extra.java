package com.wandoujia.push.protocol;

import java.io.Serializable;

public class PushEntityV1$Intent$Extra
  implements Serializable
{
  private String key;
  private String type;
  private String value;

  public String getKey()
  {
    return this.key;
  }

  public String getType()
  {
    return this.type;
  }

  public String getValue()
  {
    return this.value;
  }

  public void setKey(String paramString)
  {
    this.key = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }

  public String toString()
  {
    return "[ key is " + this.key + ", value is " + this.value + ", type is " + this.type + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.Intent.Extra
 * JD-Core Version:    0.6.0
 */