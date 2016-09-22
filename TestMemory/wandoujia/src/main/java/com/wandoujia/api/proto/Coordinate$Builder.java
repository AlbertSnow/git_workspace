package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Coordinate$Builder extends Message.Builder<Coordinate>
{
  public Float accuracy;
  public Double latitude;
  public Double longitude;
  public Coordinate.CoordinateStandard standard;

  public Coordinate$Builder()
  {
  }

  public Coordinate$Builder(Coordinate paramCoordinate)
  {
    super(paramCoordinate);
    if (paramCoordinate == null)
      return;
    this.latitude = paramCoordinate.latitude;
    this.longitude = paramCoordinate.longitude;
    this.accuracy = paramCoordinate.accuracy;
    this.standard = paramCoordinate.standard;
  }

  public final Builder accuracy(Float paramFloat)
  {
    this.accuracy = paramFloat;
    return this;
  }

  public final Coordinate build()
  {
    checkRequiredFields();
    return new Coordinate(this, null);
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

  public final Builder standard(Coordinate.CoordinateStandard paramCoordinateStandard)
  {
    this.standard = paramCoordinateStandard;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Coordinate.Builder
 * JD-Core Version:    0.6.0
 */