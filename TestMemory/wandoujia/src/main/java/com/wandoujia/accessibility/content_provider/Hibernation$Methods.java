package com.wandoujia.accessibility.content_provider;

public enum Hibernation$Methods
{
  private String fName = "";

  static
  {
    CHECK_BLOCK = new Methods("CHECK_BLOCK", 1, "checkBlock");
    UPDATE_WHITE_LIST = new Methods("UPDATE_WHITE_LIST", 2, "updateWhiteList");
    Methods[] arrayOfMethods = new Methods[3];
    arrayOfMethods[0] = START_ON_BOARD;
    arrayOfMethods[1] = CHECK_BLOCK;
    arrayOfMethods[2] = UPDATE_WHITE_LIST;
    $VALUES = arrayOfMethods;
  }

  private Hibernation$Methods(String paramString)
  {
    this.fName = paramString;
  }

  public final String getMethodName()
  {
    return this.fName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.Hibernation.Methods
 * JD-Core Version:    0.6.0
 */