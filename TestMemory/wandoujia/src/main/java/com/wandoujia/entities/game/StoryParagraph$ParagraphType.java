package com.wandoujia.entities.game;

import com.wandoujia.gson.a.a;

public enum StoryParagraph$ParagraphType
{
  static
  {
    IMAGE = new ParagraphType("IMAGE", 1);
    QUOTE = new ParagraphType("QUOTE", 2);
    SPACE = new ParagraphType("SPACE", 3);
    ParagraphType[] arrayOfParagraphType = new ParagraphType[4];
    arrayOfParagraphType[0] = TEXT;
    arrayOfParagraphType[1] = IMAGE;
    arrayOfParagraphType[2] = QUOTE;
    arrayOfParagraphType[3] = SPACE;
    $VALUES = arrayOfParagraphType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.StoryParagraph.ParagraphType
 * JD-Core Version:    0.6.0
 */