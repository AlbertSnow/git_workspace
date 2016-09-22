package com.wandoujia.ripple_framework;

public enum ReceiverMonitor$MediaState
{
  private final String state;

  static
  {
    MediaState[] arrayOfMediaState = new MediaState[2];
    arrayOfMediaState[0] = MOUNTED;
    arrayOfMediaState[1] = UNMOUNTED;
    $VALUES = arrayOfMediaState;
  }

  private ReceiverMonitor$MediaState(String paramString)
  {
    this.state = paramString;
  }

  public final String getMediaState()
  {
    return this.state;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ReceiverMonitor.MediaState
 * JD-Core Version:    0.6.0
 */