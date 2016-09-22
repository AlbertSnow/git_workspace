package com.wandoujia.p4.connection.ui;

import java.io.Serializable;

class ConnectionActivity$PushContent
  implements Serializable
{
  private String authcode;
  private String type;
  private String udid;

  public ConnectionActivity$PushContent(String paramString1, String paramString2, String paramString3)
  {
    this.type = paramString1;
    this.udid = paramString2;
    this.authcode = paramString3;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.ConnectionActivity.PushContent
 * JD-Core Version:    0.6.0
 */