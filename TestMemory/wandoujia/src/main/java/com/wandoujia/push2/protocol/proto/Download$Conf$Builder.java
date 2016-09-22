package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message.Builder;

public final class Download$Conf$Builder extends Message.Builder<Download.Conf>
{
  public Integer timeout;

  public Download$Conf$Builder()
  {
  }

  public Download$Conf$Builder(Download.Conf paramConf)
  {
    super(paramConf);
    if (paramConf == null)
      return;
    this.timeout = paramConf.timeout;
  }

  public final Download.Conf build()
  {
    return new Download.Conf(this, null);
  }

  public final Builder timeout(Integer paramInteger)
  {
    this.timeout = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download.Conf.Builder
 * JD-Core Version:    0.6.0
 */