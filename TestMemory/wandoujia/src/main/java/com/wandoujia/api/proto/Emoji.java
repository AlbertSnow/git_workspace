package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Emoji extends Message
{
  public static final Integer DEFAULT_COUNT;
  public static final String DEFAULT_ID = "";
  public static final Long DEFAULT_TIMESTAMP = Long.valueOf(0L);

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer count;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String id;

  @ProtoField(tag=2)
  public final Image image;

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long timestamp;

  static
  {
    DEFAULT_COUNT = Integer.valueOf(0);
  }

  private Emoji(Emoji.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.image = paramBuilder.image;
    this.timestamp = paramBuilder.timestamp;
    this.count = paramBuilder.count;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Emoji localEmoji;
    do
    {
      return true;
      if (!(paramObject instanceof Emoji))
        return false;
      localEmoji = (Emoji)paramObject;
    }
    while ((equals(this.id, localEmoji.id)) && (equals(this.image, localEmoji.image)) && (equals(this.timestamp, localEmoji.timestamp)) && (equals(this.count, localEmoji.count)));
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
      if (this.image == null)
        break label121;
      m = this.image.hashCode();
      n = 37 * (m + k);
      if (this.timestamp == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.timestamp.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Integer localInteger = this.count;
      int i3 = 0;
      if (localInteger != null)
        i3 = this.count.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.Emoji
 * JD-Core Version:    0.6.0
 */