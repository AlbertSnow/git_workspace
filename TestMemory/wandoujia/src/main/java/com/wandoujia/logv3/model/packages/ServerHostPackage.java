package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ServerHostPackage extends Message
{
  public static final String DEFAULT_HOST_IP = "";
  public static final String DEFAULT_HOST_NAME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String host_ip;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String host_name;

  private ServerHostPackage(ServerHostPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.host_ip = paramBuilder.host_ip;
    this.host_name = paramBuilder.host_name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ServerHostPackage localServerHostPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ServerHostPackage))
        return false;
      localServerHostPackage = (ServerHostPackage)paramObject;
    }
    while ((equals(this.host_ip, localServerHostPackage.host_ip)) && (equals(this.host_name, localServerHostPackage.host_name)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.host_ip == null)
        break label64;
    label64: for (int j = this.host_ip.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.host_name;
      int m = 0;
      if (str != null)
        m = this.host_name.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ServerHostPackage
 * JD-Core Version:    0.6.0
 */