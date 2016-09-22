package com.wandoujia.ripple_framework.event;

public enum DownloadEvent$Type
{
  static
  {
    DOWNLOAD_EVENT_NOTIFY = new Type("DOWNLOAD_EVENT_NOTIFY", 3);
    Type[] arrayOfType = new Type[4];
    arrayOfType[0] = DOWNLOAD_INFO_LOADED;
    arrayOfType[1] = DOWNLOAD_PROGRESS_CHANGE;
    arrayOfType[2] = DOWNLOAD_STATE_CHANGE;
    arrayOfType[3] = DOWNLOAD_EVENT_NOTIFY;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.event.DownloadEvent.Type
 * JD-Core Version:    0.6.0
 */