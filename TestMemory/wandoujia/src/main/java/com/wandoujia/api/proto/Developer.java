package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Developer extends Message
{
  public static final String DEFAULT_EMAIL = "";
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  public static final String DEFAULT_NAME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String email;

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long id;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String name;

  private Developer(Developer.Builder paramBuilder)
  {
    super(paramBuilder);
    this.email = paramBuilder.email;
    this.id = paramBuilder.id;
    this.name = paramBuilder.name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Developer localDeveloper;
    do
    {
      return true;
      if (!(paramObject instanceof Developer))
        return false;
      localDeveloper = (Developer)paramObject;
    }
    while ((equals(this.email, localDeveloper.email)) && (equals(this.id, localDeveloper.id)) && (equals(this.name, localDeveloper.name)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.email == null)
        break label90;
      j = this.email.hashCode();
      k = j * 37;
      if (this.id == null)
        break label95;
    }
    label90: label95: for (int m = this.id.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.name;
      int i1 = 0;
      if (str != null)
        i1 = this.name.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Developer
 * JD-Core Version:    0.6.0
 */