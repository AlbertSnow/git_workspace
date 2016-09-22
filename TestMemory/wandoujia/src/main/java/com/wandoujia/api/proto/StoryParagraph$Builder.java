package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class StoryParagraph$Builder extends Message.Builder<StoryParagraph>
{
  public ParagraphContent item;
  public String type;
  public String type_name;

  public StoryParagraph$Builder()
  {
  }

  public StoryParagraph$Builder(StoryParagraph paramStoryParagraph)
  {
    super(paramStoryParagraph);
    if (paramStoryParagraph == null)
      return;
    this.type = paramStoryParagraph.type;
    this.type_name = paramStoryParagraph.type_name;
    this.item = paramStoryParagraph.item;
  }

  public final StoryParagraph build()
  {
    return new StoryParagraph(this, null);
  }

  public final Builder item(ParagraphContent paramParagraphContent)
  {
    this.item = paramParagraphContent;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }

  public final Builder type_name(String paramString)
  {
    this.type_name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.StoryParagraph.Builder
 * JD-Core Version:    0.6.0
 */