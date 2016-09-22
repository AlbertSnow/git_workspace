package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class IdPackage extends Message
{
  public static final String DEFAULT_IDENTITY = "";
  public static final String DEFAULT_PCID = "";
  public static final String DEFAULT_UDID = "";

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String identity;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String pcid;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String udid;

  private IdPackage(IdPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.udid = paramBuilder.udid;
    this.pcid = paramBuilder.pcid;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IdPackage localIdPackage;
    do
    {
      return true;
      if (!(paramObject instanceof IdPackage))
        return false;
      localIdPackage = (IdPackage)paramObject;
    }
    while ((equals(this.identity, localIdPackage.identity)) && (equals(this.udid, localIdPackage.udid)) && (equals(this.pcid, localIdPackage.pcid)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.identity == null)
        break label90;
      j = this.identity.hashCode();
      k = j * 37;
      if (this.udid == null)
        break label95;
    }
    label90: label95: for (int m = this.udid.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.pcid;
      int i1 = 0;
      if (str != null)
        i1 = this.pcid.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IdPackage
 * JD-Core Version:    0.6.0
 */