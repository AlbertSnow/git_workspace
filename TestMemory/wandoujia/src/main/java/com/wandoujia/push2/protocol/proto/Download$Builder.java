package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Download$Builder extends Message.Builder<Download>
{
  public Download.Conf conf;
  public List<Download.Msg> messages;

  public Download$Builder()
  {
  }

  public Download$Builder(Download paramDownload)
  {
    super(paramDownload);
    if (paramDownload == null)
      return;
    this.conf = paramDownload.conf;
    this.messages = Download.access$000(paramDownload.messages);
  }

  public final Download build()
  {
    return new Download(this, null);
  }

  public final Builder conf(Download.Conf paramConf)
  {
    this.conf = paramConf;
    return this;
  }

  public final Builder messages(List<Download.Msg> paramList)
  {
    this.messages = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download.Builder
 * JD-Core Version:    0.6.0
 */