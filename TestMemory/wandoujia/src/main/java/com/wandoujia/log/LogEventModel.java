package com.wandoujia.log;

import java.util.Map;

public final class LogEventModel
{
  public final String a;
  public final Map<String, String> b;
  public final long c;
  public final LogEventModel.Priority d;

  LogEventModel(String paramString, Map<String, String> paramMap, long paramLong, LogEventModel.Priority paramPriority)
  {
    this.a = paramString;
    this.b = paramMap;
    this.c = paramLong;
    this.d = paramPriority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogEventModel
 * JD-Core Version:    0.6.0
 */