package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class LaunchSourcePackage extends Message
{
  public static final String DEFAULT_KEYWORD = "";
  public static final LaunchSourcePackage.Source DEFAULT_SOURCE = LaunchSourcePackage.Source.UNKNOWN;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String keyword;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final LaunchSourcePackage.Source source;

  private LaunchSourcePackage(LaunchSourcePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.source = paramBuilder.source;
    this.keyword = paramBuilder.keyword;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LaunchSourcePackage localLaunchSourcePackage;
    do
    {
      return true;
      if (!(paramObject instanceof LaunchSourcePackage))
        return false;
      localLaunchSourcePackage = (LaunchSourcePackage)paramObject;
    }
    while ((equals(this.source, localLaunchSourcePackage.source)) && (equals(this.keyword, localLaunchSourcePackage.keyword)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.source == null)
        break label64;
    label64: for (int j = this.source.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.keyword;
      int m = 0;
      if (str != null)
        m = this.keyword.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LaunchSourcePackage
 * JD-Core Version:    0.6.0
 */