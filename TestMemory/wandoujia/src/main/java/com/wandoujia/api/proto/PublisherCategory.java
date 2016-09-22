package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class PublisherCategory extends Message
{
  public static final String DEFAULT_DESCRIPTION = "";
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  public static final String DEFAULT_NAME = "";
  public static final Integer DEFAULT_RANK = Integer.valueOf(0);

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer id;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer rank;

  private PublisherCategory(PublisherCategory.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.name = paramBuilder.name;
    this.description = paramBuilder.description;
    this.rank = paramBuilder.rank;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PublisherCategory localPublisherCategory;
    do
    {
      return true;
      if (!(paramObject instanceof PublisherCategory))
        return false;
      localPublisherCategory = (PublisherCategory)paramObject;
    }
    while ((equals(this.id, localPublisherCategory.id)) && (equals(this.name, localPublisherCategory.name)) && (equals(this.description, localPublisherCategory.description)) && (equals(this.rank, localPublisherCategory.rank)));
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
      if (this.id == null)
        break label116;
      j = this.id.hashCode();
      int k = j * 37;
      if (this.name == null)
        break label121;
      m = this.name.hashCode();
      n = 37 * (m + k);
      if (this.description == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.description.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Integer localInteger = this.rank;
      int i3 = 0;
      if (localInteger != null)
        i3 = this.rank.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.PublisherCategory
 * JD-Core Version:    0.6.0
 */