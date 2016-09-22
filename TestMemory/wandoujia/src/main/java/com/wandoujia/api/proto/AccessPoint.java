package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class AccessPoint extends Message
{
  public static final String DEFAULT_BSSID = "";
  public static final Boolean DEFAULT_CONNECTED;
  public static final Integer DEFAULT_FREQUENCY;
  public static final Integer DEFAULT_RSSI = Integer.valueOf(0);
  public static final String DEFAULT_SSID = "";

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.STRING)
  public final String BSSID;

  @ProtoField(label=Message.Label.REQUIRED, tag=3, type=Message.Datatype.INT32)
  public final Integer RSSI;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String SSID;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean connected;

  @ProtoField(label=Message.Label.REQUIRED, tag=4, type=Message.Datatype.INT32)
  public final Integer frequency;

  static
  {
    DEFAULT_FREQUENCY = Integer.valueOf(0);
    DEFAULT_CONNECTED = Boolean.valueOf(false);
  }

  private AccessPoint(AccessPoint.Builder paramBuilder)
  {
    super(paramBuilder);
    this.SSID = paramBuilder.SSID;
    this.BSSID = paramBuilder.BSSID;
    this.RSSI = paramBuilder.RSSI;
    this.frequency = paramBuilder.frequency;
    this.connected = paramBuilder.connected;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AccessPoint localAccessPoint;
    do
    {
      return true;
      if (!(paramObject instanceof AccessPoint))
        return false;
      localAccessPoint = (AccessPoint)paramObject;
    }
    while ((equals(this.SSID, localAccessPoint.SSID)) && (equals(this.BSSID, localAccessPoint.BSSID)) && (equals(this.RSSI, localAccessPoint.RSSI)) && (equals(this.frequency, localAccessPoint.frequency)) && (equals(this.connected, localAccessPoint.connected)));
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
      if (this.SSID == null)
        break label142;
      j = this.SSID.hashCode();
      int k = j * 37;
      if (this.BSSID == null)
        break label147;
      m = this.BSSID.hashCode();
      int n = 37 * (m + k);
      if (this.RSSI == null)
        break label153;
      i1 = this.RSSI.hashCode();
      i2 = 37 * (i1 + n);
      if (this.frequency == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.frequency.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      Boolean localBoolean = this.connected;
      int i5 = 0;
      if (localBoolean != null)
        i5 = this.connected.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.AccessPoint
 * JD-Core Version:    0.6.0
 */