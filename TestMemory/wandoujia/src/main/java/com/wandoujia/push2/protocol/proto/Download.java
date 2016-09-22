package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Download extends Message
{
  public static final List<Download.Msg> DEFAULT_MESSAGES = Collections.emptyList();

  @ProtoField(tag=1)
  public final Download.Conf conf;

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<Download.Msg> messages;

  private Download(Download.Builder paramBuilder)
  {
    super(paramBuilder);
    this.conf = paramBuilder.conf;
    this.messages = immutableCopyOf(paramBuilder.messages);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Download localDownload;
    do
    {
      return true;
      if (!(paramObject instanceof Download))
        return false;
      localDownload = (Download)paramObject;
    }
    while ((equals(this.conf, localDownload.conf)) && (equals(this.messages, localDownload.messages)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.conf == null)
        break label59;
      j = this.conf.hashCode();
      k = j * 37;
      if (this.messages == null)
        break label64;
    }
    label59: label64: for (int m = this.messages.hashCode(); ; m = 1)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download
 * JD-Core Version:    0.6.0
 */