package com.wandoujia.push2;

public enum LogHelper$Action
{
  static
  {
    DELIVER_TO_APP = new Action("DELIVER_TO_APP", 1);
    NOTIFICATION_SHOW = new Action("NOTIFICATION_SHOW", 2);
    NOTIFICATION_CLICK = new Action("NOTIFICATION_CLICK", 3);
    NOTIFICATION_CANCELED = new Action("NOTIFICATION_CANCELED", 4);
    ERROR = new Action("ERROR", 5);
    Action[] arrayOfAction = new Action[6];
    arrayOfAction[0] = RECV_MSG_FROM_SERVER;
    arrayOfAction[1] = DELIVER_TO_APP;
    arrayOfAction[2] = NOTIFICATION_SHOW;
    arrayOfAction[3] = NOTIFICATION_CLICK;
    arrayOfAction[4] = NOTIFICATION_CANCELED;
    arrayOfAction[5] = ERROR;
    $VALUES = arrayOfAction;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.LogHelper.Action
 * JD-Core Version:    0.6.0
 */