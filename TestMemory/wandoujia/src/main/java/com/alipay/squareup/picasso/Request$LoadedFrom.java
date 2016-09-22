package com.alipay.squareup.picasso;

 enum Request$LoadedFrom
{
  final int debugColor;

  static
  {
    DISK = new LoadedFrom("DISK", 1, -256);
    NETWORK = new LoadedFrom("NETWORK", 2, -65536);
    LoadedFrom[] arrayOfLoadedFrom = new LoadedFrom[3];
    arrayOfLoadedFrom[0] = MEMORY;
    arrayOfLoadedFrom[1] = DISK;
    arrayOfLoadedFrom[2] = NETWORK;
    $VALUES = arrayOfLoadedFrom;
  }

  private Request$LoadedFrom(int paramInt)
  {
    this.debugColor = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Request.LoadedFrom
 * JD-Core Version:    0.6.0
 */