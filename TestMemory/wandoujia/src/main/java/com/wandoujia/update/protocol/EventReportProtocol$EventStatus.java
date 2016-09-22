package com.wandoujia.update.protocol;

import com.wandoujia.gson.a.a;

public enum EventReportProtocol$EventStatus
{
  static
  {
    ERROR_DOWNLOAD = new EventStatus("ERROR_DOWNLOAD", 1);
    EventStatus[] arrayOfEventStatus = new EventStatus[2];
    arrayOfEventStatus[0] = OK;
    arrayOfEventStatus[1] = ERROR_DOWNLOAD;
    $VALUES = arrayOfEventStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.EventReportProtocol.EventStatus
 * JD-Core Version:    0.6.0
 */