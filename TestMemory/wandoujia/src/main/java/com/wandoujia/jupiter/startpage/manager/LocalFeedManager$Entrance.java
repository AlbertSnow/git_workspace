package com.wandoujia.jupiter.startpage.manager;

public enum LocalFeedManager$Entrance
{
  private final String entryName;

  static
  {
    OTHER = new Entrance("OTHER", 1, "other");
    Entrance[] arrayOfEntrance = new Entrance[2];
    arrayOfEntrance[0] = TIPS_VIEW;
    arrayOfEntrance[1] = OTHER;
    $VALUES = arrayOfEntrance;
  }

  private LocalFeedManager$Entrance(String paramString)
  {
    this.entryName = paramString;
  }

  public final String getName()
  {
    return this.entryName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.manager.LocalFeedManager.Entrance
 * JD-Core Version:    0.6.0
 */