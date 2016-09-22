package com.wandoujia.entities.game;

public enum GameDetailInfoType$LanguageType
{
  private String code;

  static
  {
    CHS = new LanguageType("CHS", 1, "CHS");
    CHT = new LanguageType("CHT", 2, "CHT");
    JA = new LanguageType("JA", 3, "JA");
    KO = new LanguageType("KO", 4, "KO");
    OTHER = new LanguageType("OTHER", 5, "OTHER");
    UNKNOWN = new LanguageType("UNKNOWN", 6, "UNKNOWN");
    LanguageType[] arrayOfLanguageType = new LanguageType[7];
    arrayOfLanguageType[0] = EN;
    arrayOfLanguageType[1] = CHS;
    arrayOfLanguageType[2] = CHT;
    arrayOfLanguageType[3] = JA;
    arrayOfLanguageType[4] = KO;
    arrayOfLanguageType[5] = OTHER;
    arrayOfLanguageType[6] = UNKNOWN;
    $VALUES = arrayOfLanguageType;
  }

  private GameDetailInfoType$LanguageType(String paramString)
  {
    this.code = paramString;
  }

  public final String getCode()
  {
    return this.code;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameDetailInfoType.LanguageType
 * JD-Core Version:    0.6.0
 */