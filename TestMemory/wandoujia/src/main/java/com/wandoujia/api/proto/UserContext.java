package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserContext extends Message
{
  public static final List<AccessPoint> DEFAULT_ACCESS_POINT;
  public static final String DEFAULT_ROM = "";
  public static final Long DEFAULT_TIMESTAMP = Long.valueOf(0L);
  public static final String DEFAULT_UDID = "";

  @ProtoField(label=Message.Label.REPEATED, tag=5)
  public final List<AccessPoint> access_point;

  @ProtoField(tag=3)
  public final Coordinate coordinate;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String rom;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT64)
  public final Long timestamp;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String udid;

  static
  {
    DEFAULT_ACCESS_POINT = Collections.emptyList();
  }

  private UserContext(UserContext.Builder paramBuilder)
  {
    super(paramBuilder);
    this.udid = paramBuilder.udid;
    this.timestamp = paramBuilder.timestamp;
    this.coordinate = paramBuilder.coordinate;
    this.rom = paramBuilder.rom;
    this.access_point = immutableCopyOf(paramBuilder.access_point);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    UserContext localUserContext;
    do
    {
      return true;
      if (!(paramObject instanceof UserContext))
        return false;
      localUserContext = (UserContext)paramObject;
    }
    while ((equals(this.udid, localUserContext.udid)) && (equals(this.timestamp, localUserContext.timestamp)) && (equals(this.coordinate, localUserContext.coordinate)) && (equals(this.rom, localUserContext.rom)) && (equals(this.access_point, localUserContext.access_point)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i4;
    if (i == 0)
    {
      if (this.udid == null)
        break label144;
      j = this.udid.hashCode();
      int k = j * 37;
      if (this.timestamp == null)
        break label149;
      m = this.timestamp.hashCode();
      int n = 37 * (m + k);
      if (this.coordinate == null)
        break label155;
      i1 = this.coordinate.hashCode();
      int i2 = 37 * (i1 + n);
      String str = this.rom;
      int i3 = 0;
      if (str != null)
        i3 = this.rom.hashCode();
      i4 = 37 * (i2 + i3);
      if (this.access_point == null)
        break label161;
    }
    label144: label149: label155: label161: for (int i5 = this.access_point.hashCode(); ; i5 = 1)
    {
      i = i5 + i4;
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
 * Qualified Name:     com.wandoujia.api.proto.UserContext
 * JD-Core Version:    0.6.0
 */