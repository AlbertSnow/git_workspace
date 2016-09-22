package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AccessPoint$Builder extends Message.Builder<AccessPoint>
{
  public String BSSID;
  public Integer RSSI;
  public String SSID;
  public Boolean connected;
  public Integer frequency;

  public AccessPoint$Builder()
  {
  }

  public AccessPoint$Builder(AccessPoint paramAccessPoint)
  {
    super(paramAccessPoint);
    if (paramAccessPoint == null)
      return;
    this.SSID = paramAccessPoint.SSID;
    this.BSSID = paramAccessPoint.BSSID;
    this.RSSI = paramAccessPoint.RSSI;
    this.frequency = paramAccessPoint.frequency;
    this.connected = paramAccessPoint.connected;
  }

  public final Builder BSSID(String paramString)
  {
    this.BSSID = paramString;
    return this;
  }

  public final Builder RSSI(Integer paramInteger)
  {
    this.RSSI = paramInteger;
    return this;
  }

  public final Builder SSID(String paramString)
  {
    this.SSID = paramString;
    return this;
  }

  public final AccessPoint build()
  {
    checkRequiredFields();
    return new AccessPoint(this, null);
  }

  public final Builder connected(Boolean paramBoolean)
  {
    this.connected = paramBoolean;
    return this;
  }

  public final Builder frequency(Integer paramInteger)
  {
    this.frequency = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AccessPoint.Builder
 * JD-Core Version:    0.6.0
 */