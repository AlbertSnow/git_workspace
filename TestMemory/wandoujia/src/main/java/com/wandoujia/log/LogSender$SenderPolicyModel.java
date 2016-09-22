package com.wandoujia.log;

import java.io.Serializable;

public class LogSender$SenderPolicyModel
  implements Serializable
{
  private long duration;
  private LogSender.TimePolicy timePolicy;

  public LogSender$SenderPolicyModel()
  {
  }

  public LogSender$SenderPolicyModel(LogSender.TimePolicy paramTimePolicy, long paramLong)
  {
    this.timePolicy = paramTimePolicy;
    this.duration = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogSender.SenderPolicyModel
 * JD-Core Version:    0.6.0
 */