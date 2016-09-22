package com.wandoujia.ripple_framework.download;

 enum DownloadManager$DownloadOperation$OpType
{
  static
  {
    CANCEL = new OpType("CANCEL", 1);
    PAUSE = new OpType("PAUSE", 2);
    RESUME = new OpType("RESUME", 3);
    RETRY = new OpType("RETRY", 4);
    OpType[] arrayOfOpType = new OpType[5];
    arrayOfOpType[0] = START;
    arrayOfOpType[1] = CANCEL;
    arrayOfOpType[2] = PAUSE;
    arrayOfOpType[3] = RESUME;
    arrayOfOpType[4] = RETRY;
    $VALUES = arrayOfOpType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadManager.DownloadOperation.OpType
 * JD-Core Version:    0.6.0
 */