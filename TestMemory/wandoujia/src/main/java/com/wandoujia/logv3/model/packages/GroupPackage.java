package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class GroupPackage extends Message
{
  public static final String DEFAULT_ID = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String id;

  private GroupPackage(GroupPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof GroupPackage))
      return false;
    return equals(this.id, ((GroupPackage)paramObject).id);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.id != null);
    for (int j = this.id.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.GroupPackage
 * JD-Core Version:    0.6.0
 */