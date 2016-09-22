package com.wandoujia.accessibility.content_provider;

public enum AutoInstall$Methods
{
  private String fName = "";

  static
  {
    SET_ENABLE = new Methods("SET_ENABLE", 1, "setEnable");
    GET_STATE = new Methods("GET_STATE", 2, "getState");
    IS_BLOCK = new Methods("IS_BLOCK", 3, "isBlock");
    FORCE_TURN_OFF = new Methods("FORCE_TURN_OFF", 4, "forceTurnOff");
    UPDATE_BLOCK = new Methods("UPDATE_BLOCK", 5, "updateBlock");
    Methods[] arrayOfMethods = new Methods[6];
    arrayOfMethods[0] = UPDATE_LABEL;
    arrayOfMethods[1] = SET_ENABLE;
    arrayOfMethods[2] = GET_STATE;
    arrayOfMethods[3] = IS_BLOCK;
    arrayOfMethods[4] = FORCE_TURN_OFF;
    arrayOfMethods[5] = UPDATE_BLOCK;
    $VALUES = arrayOfMethods;
  }

  private AutoInstall$Methods(String paramString)
  {
    this.fName = paramString;
  }

  public final String getMethodName()
  {
    return this.fName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.AutoInstall.Methods
 * JD-Core Version:    0.6.0
 */