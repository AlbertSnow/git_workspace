package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ApplicationCrashEvent extends Message
{
  public static final String DEFAULT_ACTIVITY = "";
  public static final String DEFAULT_DETAIL = "";
  public static final Boolean DEFAULT_IS_LAUNCH;
  public static final ApplicationCrashEvent.Type DEFAULT_TYPE = ApplicationCrashEvent.Type.APP_CRASH;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String activity;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String detail;

  @ProtoField(tag=4, type=Message.Datatype.BOOL)
  public final Boolean is_launch;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final ApplicationCrashEvent.Type type;

  @ProtoField(tag=3)
  public final ViewLogPackage view;

  static
  {
    DEFAULT_IS_LAUNCH = Boolean.valueOf(false);
  }

  private ApplicationCrashEvent(ApplicationCrashEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.detail = paramBuilder.detail;
    this.view = paramBuilder.view;
    this.is_launch = paramBuilder.is_launch;
    this.activity = paramBuilder.activity;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ApplicationCrashEvent localApplicationCrashEvent;
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationCrashEvent))
        return false;
      localApplicationCrashEvent = (ApplicationCrashEvent)paramObject;
    }
    while ((equals(this.type, localApplicationCrashEvent.type)) && (equals(this.detail, localApplicationCrashEvent.detail)) && (equals(this.view, localApplicationCrashEvent.view)) && (equals(this.is_launch, localApplicationCrashEvent.is_launch)) && (equals(this.activity, localApplicationCrashEvent.activity)));
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
      if (this.type == null)
        break label142;
      j = this.type.hashCode();
      int k = j * 37;
      if (this.detail == null)
        break label147;
      m = this.detail.hashCode();
      int n = 37 * (m + k);
      if (this.view == null)
        break label153;
      i1 = this.view.hashCode();
      i2 = 37 * (i1 + n);
      if (this.is_launch == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.is_launch.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      String str = this.activity;
      int i5 = 0;
      if (str != null)
        i5 = this.activity.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationCrashEvent
 * JD-Core Version:    0.6.0
 */