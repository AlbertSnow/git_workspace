package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class FeedPackage extends Message
{
  public static final String DEFAULT_DETAIL = "";
  public static final String DEFAULT_IDENTITY = "";
  public static final String DEFAULT_NAME = "";
  public static final String DEFAULT_TEMPLATE = "";

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String detail;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String identity;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String template;

  private FeedPackage(FeedPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.name = paramBuilder.name;
    this.template = paramBuilder.template;
    this.detail = paramBuilder.detail;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FeedPackage localFeedPackage;
    do
    {
      return true;
      if (!(paramObject instanceof FeedPackage))
        return false;
      localFeedPackage = (FeedPackage)paramObject;
    }
    while ((equals(this.identity, localFeedPackage.identity)) && (equals(this.name, localFeedPackage.name)) && (equals(this.template, localFeedPackage.template)) && (equals(this.detail, localFeedPackage.detail)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.identity == null)
        break label116;
      j = this.identity.hashCode();
      int k = j * 37;
      if (this.name == null)
        break label121;
      m = this.name.hashCode();
      n = 37 * (m + k);
      if (this.template == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.template.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.detail;
      int i3 = 0;
      if (str != null)
        i3 = this.detail.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.FeedPackage
 * JD-Core Version:    0.6.0
 */