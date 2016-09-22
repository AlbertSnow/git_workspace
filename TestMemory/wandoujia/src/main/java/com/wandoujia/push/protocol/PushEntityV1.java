package com.wandoujia.push.protocol;

import java.util.Map;

public class PushEntityV1 extends StandardPushEntity
{
  private Map<String, Object> extra;
  private PushEntityV1.Notification notification;
  private PushEntityV1.Redirect redirect;

  public Map<String, Object> getExtra()
  {
    return this.extra;
  }

  public PushEntityV1.Notification getNotification()
  {
    return this.notification;
  }

  public PushEntityV1.Redirect getRedirect()
  {
    return this.redirect;
  }

  public void setExtra(Map<String, Object> paramMap)
  {
    this.extra = paramMap;
  }

  public void setNotification(PushEntityV1.Notification paramNotification)
  {
    this.notification = paramNotification;
  }

  public void setRedirect(PushEntityV1.Redirect paramRedirect)
  {
    this.redirect = paramRedirect;
  }

  public String toString()
  {
    return "[msgType is " + this.msgType + ", destType is " + this.destType + ", destDid is " + this.destDid + ", destUid is " + this.destUid + ", notification is " + this.notification + ", redirect is " + this.redirect + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1
 * JD-Core Version:    0.6.0
 */