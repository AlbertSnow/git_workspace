package com.wandoujia.update.protocol;

import com.wandoujia.gson.a.a;

public enum EventReportProtocol$EventType
{
  static
  {
    DOWNLOAD_COMPLETE = new EventType("DOWNLOAD_COMPLETE", 1);
    INSTALL_START = new EventType("INSTALL_START", 2);
    NOTIFICATION_SHOW = new EventType("NOTIFICATION_SHOW", 3);
    NOTIFICATION_CLICK = new EventType("NOTIFICATION_CLICK", 4);
    EventType[] arrayOfEventType = new EventType[5];
    arrayOfEventType[0] = DOWNLOAD_START;
    arrayOfEventType[1] = DOWNLOAD_COMPLETE;
    arrayOfEventType[2] = INSTALL_START;
    arrayOfEventType[3] = NOTIFICATION_SHOW;
    arrayOfEventType[4] = NOTIFICATION_CLICK;
    $VALUES = arrayOfEventType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.EventReportProtocol.EventType
 * JD-Core Version:    0.6.0
 */