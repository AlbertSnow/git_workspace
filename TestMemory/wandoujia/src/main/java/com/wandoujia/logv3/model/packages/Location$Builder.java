package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class Location$Builder extends Message.Builder<Location>
{
  public Float accuracy;
  public Double latitude;
  public Double longitude;
  public Location.Standard standard;

  public Location$Builder()
  {
  }

  public Location$Builder(Location paramLocation)
  {
    super(paramLocation);
    if (paramLocation == null)
      return;
    this.latitude = paramLocation.latitude;
    this.longitude = paramLocation.longitude;
    this.accuracy = paramLocation.accuracy;
    this.standard = paramLocation.standard;
  }

  public final Builder accuracy(Float paramFloat)
  {
    this.accuracy = paramFloat;
    return this;
  }

  public final Location build()
  {
    checkRequiredFields();
    return new Location(this, null);
  }

  public final Builder latitude(Double paramDouble)
  {
    this.latitude = paramDouble;
    return this;
  }

  public final Builder longitude(Double paramDouble)
  {
    this.longitude = paramDouble;
    return this;
  }

  public final Builder standard(Location.Standard paramStandard)
  {
    this.standard = paramStandard;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.Location.Builder
 * JD-Core Version:    0.6.0
 */