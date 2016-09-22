package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class NetworkPackage extends Message
{
  public static final String DEFAULT_ISP = "";
  public static final String DEFAULT_REMOTE_IP = "";
  public static final String DEFAULT_SSID = "";
  public static final NetworkPackage.Subtype DEFAULT_SUB_TYPE;
  public static final NetworkPackage.Type DEFAULT_TYPE = NetworkPackage.Type.UNKNOWN_TYPE;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String isp;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String remote_ip;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String ssid;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final NetworkPackage.Subtype sub_type;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final NetworkPackage.Type type;

  static
  {
    DEFAULT_SUB_TYPE = NetworkPackage.Subtype.UNKNOWN;
  }

  private NetworkPackage(NetworkPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.sub_type = paramBuilder.sub_type;
    this.isp = paramBuilder.isp;
    this.remote_ip = paramBuilder.remote_ip;
    this.ssid = paramBuilder.ssid;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    NetworkPackage localNetworkPackage;
    do
    {
      return true;
      if (!(paramObject instanceof NetworkPackage))
        return false;
      localNetworkPackage = (NetworkPackage)paramObject;
    }
    while ((equals(this.type, localNetworkPackage.type)) && (equals(this.sub_type, localNetworkPackage.sub_type)) && (equals(this.isp, localNetworkPackage.isp)) && (equals(this.remote_ip, localNetworkPackage.remote_ip)) && (equals(this.ssid, localNetworkPackage.ssid)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.type == null)
        break label142;
      j = this.type.hashCode();
      int k = j * 37;
      if (this.sub_type == null)
        break label147;
      m = this.sub_type.hashCode();
      int n = 37 * (m + k);
      if (this.isp == null)
        break label153;
      i1 = this.isp.hashCode();
      i2 = 37 * (i1 + n);
      if (this.remote_ip == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.remote_ip.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      String str = this.ssid;
      int i5 = 0;
      if (str != null)
        i5 = this.ssid.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NetworkPackage
 * JD-Core Version:    0.6.0
 */