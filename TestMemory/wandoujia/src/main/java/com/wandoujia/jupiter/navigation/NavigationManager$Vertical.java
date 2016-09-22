package com.wandoujia.jupiter.navigation;

 enum NavigationManager$Vertical
{
  private final String uri;

  static
  {
    Vertical[] arrayOfVertical = new Vertical[2];
    arrayOfVertical[0] = APP;
    arrayOfVertical[1] = GAME;
    $VALUES = arrayOfVertical;
  }

  private NavigationManager$Vertical(String paramString)
  {
    this.uri = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.navigation.NavigationManager.Vertical
 * JD-Core Version:    0.6.0
 */