package com.sina.weibo.sdk.auth.sso;

 enum SsoHandler$AuthType
{
  static
  {
    AuthType[] arrayOfAuthType = new AuthType[3];
    arrayOfAuthType[0] = ALL;
    arrayOfAuthType[1] = SsoOnly;
    arrayOfAuthType[2] = WebOnly;
    ENUM$VALUES = arrayOfAuthType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.sso.SsoHandler.AuthType
 * JD-Core Version:    0.6.0
 */