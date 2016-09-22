package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public abstract class b
{
  public int a;
  public String b;

  public abstract int a();

  public void a(Bundle paramBundle)
  {
    this.a = paramBundle.getInt("_wxapi_baseresp_errcode");
    paramBundle.getString("_wxapi_baseresp_errstr");
    this.b = paramBundle.getString("_wxapi_baseresp_transaction");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.b
 * JD-Core Version:    0.6.0
 */