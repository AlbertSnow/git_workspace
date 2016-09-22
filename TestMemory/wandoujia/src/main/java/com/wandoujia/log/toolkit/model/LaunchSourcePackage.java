package com.wandoujia.log.toolkit.model;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class LaunchSourcePackage extends Message
{
  public static final String DEFAULT_LAUNCH_KEYWORD = "";
  public static final String DEFAULT_LAUNCH_SOURCE = "UNKNOWN";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String launch_keyword;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String launch_source;

  private LaunchSourcePackage(LaunchSourcePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.launch_source = paramBuilder.launch_source;
    this.launch_keyword = paramBuilder.launch_keyword;
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
    while ((equals(this.launch_source, localLaunchSourcePackage.launch_source)) && (equals(this.launch_keyword, localLaunchSourcePackage.launch_keyword)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.launch_source == null)
        break label64;
    label64: for (int j = this.launch_source.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.launch_keyword;
      int m = 0;
      if (str != null)
        m = this.launch_keyword.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.toolkit.model.LaunchSourcePackage
 * JD-Core Version:    0.6.0
 */