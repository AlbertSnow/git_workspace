package com.wandoujia.push2;

public enum NotifyUtils$NotificationState
{
  private String value;

  static
  {
    NotificationState[] arrayOfNotificationState = new NotificationState[3];
    arrayOfNotificationState[0] = ALLOW;
    arrayOfNotificationState[1] = DENY;
    arrayOfNotificationState[2] = UNKNOWN;
    $VALUES = arrayOfNotificationState;
  }

  private NotifyUtils$NotificationState(String paramString)
  {
    this.value = paramString;
  }

  public final String toString()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.NotifyUtils.NotificationState
 * JD-Core Version:    0.6.0
 */