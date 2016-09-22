package com.wandoujia.ripple_framework.action;

public enum ActionType
{
  static
  {
    CLEAR_DOWNLOAD_COMPLETE_APP = new ActionType("CLEAR_DOWNLOAD_COMPLETE_APP", 1);
    CLEAR_DOWNLOAD_COMPLETE_MM = new ActionType("CLEAR_DOWNLOAD_COMPLETE_MM", 2);
    DESIGN_AWARD = new ActionType("DESIGN_AWARD", 3);
    DOWNLOAD_APP = new ActionType("DOWNLOAD_APP", 4);
    ActionType[] arrayOfActionType = new ActionType[5];
    arrayOfActionType[0] = REDIRECT;
    arrayOfActionType[1] = CLEAR_DOWNLOAD_COMPLETE_APP;
    arrayOfActionType[2] = CLEAR_DOWNLOAD_COMPLETE_MM;
    arrayOfActionType[3] = DESIGN_AWARD;
    arrayOfActionType[4] = DOWNLOAD_APP;
    $VALUES = arrayOfActionType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.action.ActionType
 * JD-Core Version:    0.6.0
 */