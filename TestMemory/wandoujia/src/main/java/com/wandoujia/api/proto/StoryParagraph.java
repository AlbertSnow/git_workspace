package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class StoryParagraph extends Message
{
  public static final String DEFAULT_TYPE = "";
  public static final String DEFAULT_TYPE_NAME = "";

  @ProtoField(tag=3)
  public final ParagraphContent item;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String type;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String type_name;

  private StoryParagraph(StoryParagraph.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.type_name = paramBuilder.type_name;
    this.item = paramBuilder.item;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    StoryParagraph localStoryParagraph;
    do
    {
      return true;
      if (!(paramObject instanceof StoryParagraph))
        return false;
      localStoryParagraph = (StoryParagraph)paramObject;
    }
    while ((equals(this.type, localStoryParagraph.type)) && (equals(this.type_name, localStoryParagraph.type_name)) && (equals(this.item, localStoryParagraph.item)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.type == null)
        break label90;
      j = this.type.hashCode();
      k = j * 37;
      if (this.type_name == null)
        break label95;
    }
    label90: label95: for (int m = this.type_name.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      ParagraphContent localParagraphContent = this.item;
      int i1 = 0;
      if (localParagraphContent != null)
        i1 = this.item.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.StoryParagraph
 * JD-Core Version:    0.6.0
 */