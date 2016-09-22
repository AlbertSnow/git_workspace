package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Author extends Message
{
  public static final String DEFAULT_NAME = "";

  @ProtoField(tag=2)
  public final Image avatar;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String name;

  private Author(Author.Builder paramBuilder)
  {
    super(paramBuilder);
    this.name = paramBuilder.name;
    this.avatar = paramBuilder.avatar;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Author localAuthor;
    do
    {
      return true;
      if (!(paramObject instanceof Author))
        return false;
      localAuthor = (Author)paramObject;
    }
    while ((equals(this.name, localAuthor.name)) && (equals(this.avatar, localAuthor.avatar)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.name == null)
        break label64;
    label64: for (int j = this.name.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Image localImage = this.avatar;
      int m = 0;
      if (localImage != null)
        m = this.avatar.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Author
 * JD-Core Version:    0.6.0
 */