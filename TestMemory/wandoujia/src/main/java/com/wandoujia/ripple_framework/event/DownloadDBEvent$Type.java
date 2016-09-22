package com.wandoujia.ripple_framework.event;

public enum DownloadDBEvent$Type
{
  static
  {
    DOWNLOAD_DB_DATA_DELETED = new Type("DOWNLOAD_DB_DATA_DELETED", 1);
    DOWNLOAD_DB_DATA_UPDATED = new Type("DOWNLOAD_DB_DATA_UPDATED", 2);
    Type[] arrayOfType = new Type[3];
    arrayOfType[0] = DOWNLOAD_DB_DATA_INSERTED;
    arrayOfType[1] = DOWNLOAD_DB_DATA_DELETED;
    arrayOfType[2] = DOWNLOAD_DB_DATA_UPDATED;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.event.DownloadDBEvent.Type
 * JD-Core Version:    0.6.0
 */