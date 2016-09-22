package com.sina.weibo.sdk.api.share;

import android.os.Bundle;

public final class f extends c
{
  public f()
  {
  }

  public f(Bundle paramBundle)
  {
    this.b = paramBundle.getInt("_weibo_resp_errcode");
    paramBundle.getString("_weibo_resp_errstr");
    this.a = paramBundle.getString("_weibo_transaction");
    paramBundle.getString("_weibo_appPackage");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.f
 * JD-Core Version:    0.6.0
 */