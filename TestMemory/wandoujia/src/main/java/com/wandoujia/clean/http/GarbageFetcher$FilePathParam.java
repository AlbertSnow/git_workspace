package com.wandoujia.clean.http;

import java.io.Serializable;

class GarbageFetcher$FilePathParam
  implements Serializable
{
  private static final long serialVersionUID = -3345605724744049941L;
  long latestModification;
  String rootPathMd5;

  private GarbageFetcher$FilePathParam(String paramString, long paramLong)
  {
    this.rootPathMd5 = paramString;
    this.latestModification = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.http.GarbageFetcher.FilePathParam
 * JD-Core Version:    0.6.0
 */