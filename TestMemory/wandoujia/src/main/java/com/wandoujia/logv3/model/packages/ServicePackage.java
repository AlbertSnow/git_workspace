package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ServicePackage extends Message
{
  public static final String DEFAULT_NAME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String name;

  private ServicePackage(ServicePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.name = paramBuilder.name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof ServicePackage))
      return false;
    return equals(this.name, ((ServicePackage)paramObject).name);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.name != null);
    for (int j = this.name.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ServicePackage
 * JD-Core Version:    0.6.0
 */