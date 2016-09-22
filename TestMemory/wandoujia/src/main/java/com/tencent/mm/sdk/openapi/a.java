package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public abstract class a
{
  public String a;

  public abstract int a();

  public void a(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", a());
    paramBundle.putString("_wxapi_basereq_transaction", this.a);
  }

  public void b(Bundle paramBundle)
  {
    this.a = paramBundle.getString("_wxapi_basereq_transaction");
  }

  abstract boolean b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.a
 * JD-Core Version:    0.6.0
 */