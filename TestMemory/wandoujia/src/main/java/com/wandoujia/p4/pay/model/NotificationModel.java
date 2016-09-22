package com.wandoujia.p4.pay.model;

import java.io.Serializable;

public class NotificationModel
  implements Serializable
{
  private Long error;
  private String msg;
  private NotificationModel.Notification notification;

  public Long getError()
  {
    return this.error;
  }

  public String getMsg()
  {
    return this.msg;
  }

  public NotificationModel.Notification getNotification()
  {
    return this.notification;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.NotificationModel
 * JD-Core Version:    0.6.0
 */