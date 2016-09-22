package com.wandoujia.entities.game;

public enum GameDetailInfoType$GameTagType
{
  private int tagType;

  static
  {
    GAME_THEME = new GameTagType("GAME_THEME", 1, 1);
    GAME_STYLE = new GameTagType("GAME_STYLE", 2, 2);
    UNKNOWN = new GameTagType("UNKNOWN", 3, -1);
    GameTagType[] arrayOfGameTagType = new GameTagType[4];
    arrayOfGameTagType[0] = GAME_TYPE;
    arrayOfGameTagType[1] = GAME_THEME;
    arrayOfGameTagType[2] = GAME_STYLE;
    arrayOfGameTagType[3] = UNKNOWN;
    $VALUES = arrayOfGameTagType;
  }

  private GameDetailInfoType$GameTagType(int paramInt)
  {
    this.tagType = paramInt;
  }

  public final int getTagType()
  {
    return this.tagType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameDetailInfoType.GameTagType
 * JD-Core Version:    0.6.0
 */