package com.wandoujia.entities.game;

import java.io.Serializable;

public class StoryParagraph
  implements Serializable
{
  private ParagraphContent item;
  private StoryParagraph.ParagraphType type;

  public ParagraphContent getItem()
  {
    return this.item;
  }

  public StoryParagraph.ParagraphType getType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.StoryParagraph
 * JD-Core Version:    0.6.0
 */