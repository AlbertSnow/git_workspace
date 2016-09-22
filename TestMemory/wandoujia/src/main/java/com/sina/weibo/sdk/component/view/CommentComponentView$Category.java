package com.sina.weibo.sdk.component.view;

public enum CommentComponentView$Category
{
  private String mVal;

  static
  {
    Category[] arrayOfCategory = new Category[2];
    arrayOfCategory[0] = MOVIE;
    arrayOfCategory[1] = TRAVEL;
    ENUM$VALUES = arrayOfCategory;
  }

  private CommentComponentView$Category(String arg3)
  {
    Object localObject;
    this.mVal = localObject;
  }

  public final String getValue()
  {
    return this.mVal;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.CommentComponentView.Category
 * JD-Core Version:    0.6.0
 */