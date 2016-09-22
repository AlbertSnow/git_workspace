package com.wandoujia.entities.app.comment;

 enum Comment$Favorite
{
  static
  {
    NO = new Favorite("NO", 1);
    UNKNOWN = new Favorite("UNKNOWN", 2);
    Favorite[] arrayOfFavorite = new Favorite[3];
    arrayOfFavorite[0] = YES;
    arrayOfFavorite[1] = NO;
    arrayOfFavorite[2] = UNKNOWN;
    $VALUES = arrayOfFavorite;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.comment.Comment.Favorite
 * JD-Core Version:    0.6.0
 */