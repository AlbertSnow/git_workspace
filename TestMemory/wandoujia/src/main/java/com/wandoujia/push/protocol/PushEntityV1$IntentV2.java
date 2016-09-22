package com.wandoujia.push.protocol;

import java.io.Serializable;

public class PushEntityV1$IntentV2
  implements Serializable
{
  private String intentUri;
  private String target;

  public String getIntentUri()
  {
    return this.intentUri;
  }

  public String getTarget()
  {
    return this.target;
  }

  public void setIntentUri(String paramString)
  {
    this.intentUri = paramString;
  }

  public void setTarget(String paramString)
  {
    this.target = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.IntentV2
 * JD-Core Version:    0.6.0
 */