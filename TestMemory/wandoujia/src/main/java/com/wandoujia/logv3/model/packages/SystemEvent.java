package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SystemEvent extends Message
{
  public static final String DEFAULT_DEBUG = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String debug;

  @ProtoField(tag=2)
  public final ExtraPackage extra_package;

  private SystemEvent(SystemEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.debug = paramBuilder.debug;
    this.extra_package = paramBuilder.extra_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SystemEvent localSystemEvent;
    do
    {
      return true;
      if (!(paramObject instanceof SystemEvent))
        return false;
      localSystemEvent = (SystemEvent)paramObject;
    }
    while ((equals(this.debug, localSystemEvent.debug)) && (equals(this.extra_package, localSystemEvent.extra_package)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.debug == null)
        break label64;
    label64: for (int j = this.debug.hashCode(); ; j = 0)
    {
      int k = j * 37;
      ExtraPackage localExtraPackage = this.extra_package;
      int m = 0;
      if (localExtraPackage != null)
        m = this.extra_package.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SystemEvent
 * JD-Core Version:    0.6.0
 */