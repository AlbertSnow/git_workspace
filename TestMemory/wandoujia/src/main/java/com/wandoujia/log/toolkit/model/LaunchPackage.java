package com.wandoujia.log.toolkit.model;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class LaunchPackage extends Message
{
  public static final String DEFAULT_ACTION = "";
  public static final String DEFAULT_ACTIVITY = "";
  public static final String DEFAULT_DATA = "";
  public static final String DEFAULT_REASON = "";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String action;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String activity;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String data;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String reason;

  @ProtoField(tag=1)
  public final LaunchSourcePackage sourcePackage;

  private LaunchPackage(LaunchPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.sourcePackage = paramBuilder.sourcePackage;
    this.action = paramBuilder.action;
    this.activity = paramBuilder.activity;
    this.data = paramBuilder.data;
    this.reason = paramBuilder.reason;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LaunchPackage localLaunchPackage;
    do
    {
      return true;
      if (!(paramObject instanceof LaunchPackage))
        return false;
      localLaunchPackage = (LaunchPackage)paramObject;
    }
    while ((equals(this.sourcePackage, localLaunchPackage.sourcePackage)) && (equals(this.action, localLaunchPackage.action)) && (equals(this.activity, localLaunchPackage.activity)) && (equals(this.data, localLaunchPackage.data)) && (equals(this.reason, localLaunchPackage.reason)));
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
      if (this.sourcePackage == null)
        break label142;
      j = this.sourcePackage.hashCode();
      int k = j * 37;
      if (this.action == null)
        break label147;
      m = this.action.hashCode();
      int n = 37 * (m + k);
      if (this.activity == null)
        break label153;
      i1 = this.activity.hashCode();
      i2 = 37 * (i1 + n);
      if (this.data == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.data.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      String str = this.reason;
      int i5 = 0;
      if (str != null)
        i5 = this.reason.hashCode();
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
 * Qualified Name:     com.wandoujia.log.toolkit.model.LaunchPackage
 * JD-Core Version:    0.6.0
 */