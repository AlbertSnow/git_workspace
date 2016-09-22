package com.wandoujia.net;

import java.io.Serializable;

public class TrackInfo
  implements Serializable
{
  public long bodyReceiveDuration = -1L;
  public long connectDuration = -1L;
  public long headerReceiveDuration = -1L;
  public String ip;
  public long ipResolveDuration = -1L;
  public String url;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.TrackInfo
 * JD-Core Version:    0.6.0
 */