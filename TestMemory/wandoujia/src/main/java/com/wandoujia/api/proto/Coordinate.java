package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Coordinate extends Message
{
  public static final Float DEFAULT_ACCURACY;
  public static final Double DEFAULT_LATITUDE = Double.valueOf(0.0D);
  public static final Double DEFAULT_LONGITUDE = Double.valueOf(0.0D);
  public static final Coordinate.CoordinateStandard DEFAULT_STANDARD;

  @ProtoField(tag=3, type=Message.Datatype.FLOAT)
  public final Float accuracy;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.DOUBLE)
  public final Double latitude;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.DOUBLE)
  public final Double longitude;

  @ProtoField(tag=4, type=Message.Datatype.ENUM)
  public final Coordinate.CoordinateStandard standard;

  static
  {
    DEFAULT_ACCURACY = Float.valueOf(0.0F);
    DEFAULT_STANDARD = Coordinate.CoordinateStandard.GCJ_02;
  }

  private Coordinate(Coordinate.Builder paramBuilder)
  {
    super(paramBuilder);
    this.latitude = paramBuilder.latitude;
    this.longitude = paramBuilder.longitude;
    this.accuracy = paramBuilder.accuracy;
    this.standard = paramBuilder.standard;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Coordinate localCoordinate;
    do
    {
      return true;
      if (!(paramObject instanceof Coordinate))
        return false;
      localCoordinate = (Coordinate)paramObject;
    }
    while ((equals(this.latitude, localCoordinate.latitude)) && (equals(this.longitude, localCoordinate.longitude)) && (equals(this.accuracy, localCoordinate.accuracy)) && (equals(this.standard, localCoordinate.standard)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.latitude == null)
        break label116;
      j = this.latitude.hashCode();
      int k = j * 37;
      if (this.longitude == null)
        break label121;
      m = this.longitude.hashCode();
      n = 37 * (m + k);
      if (this.accuracy == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.accuracy.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Coordinate.CoordinateStandard localCoordinateStandard = this.standard;
      int i3 = 0;
      if (localCoordinateStandard != null)
        i3 = this.standard.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Coordinate
 * JD-Core Version:    0.6.0
 */