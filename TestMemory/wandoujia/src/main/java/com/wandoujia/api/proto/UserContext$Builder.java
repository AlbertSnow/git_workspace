package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class UserContext$Builder extends Message.Builder<UserContext>
{
  public List<AccessPoint> access_point;
  public Coordinate coordinate;
  public String rom;
  public Long timestamp;
  public String udid;

  public UserContext$Builder()
  {
  }

  public UserContext$Builder(UserContext paramUserContext)
  {
    super(paramUserContext);
    if (paramUserContext == null)
      return;
    this.udid = paramUserContext.udid;
    this.timestamp = paramUserContext.timestamp;
    this.coordinate = paramUserContext.coordinate;
    this.rom = paramUserContext.rom;
    this.access_point = UserContext.access$000(paramUserContext.access_point);
  }

  public final Builder access_point(List<AccessPoint> paramList)
  {
    this.access_point = checkForNulls(paramList);
    return this;
  }

  public final UserContext build()
  {
    checkRequiredFields();
    return new UserContext(this, null);
  }

  public final Builder coordinate(Coordinate paramCoordinate)
  {
    this.coordinate = paramCoordinate;
    return this;
  }

  public final Builder rom(String paramString)
  {
    this.rom = paramString;
    return this;
  }

  public final Builder timestamp(Long paramLong)
  {
    this.timestamp = paramLong;
    return this;
  }

  public final Builder udid(String paramString)
  {
    this.udid = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.UserContext.Builder
 * JD-Core Version:    0.6.0
 */