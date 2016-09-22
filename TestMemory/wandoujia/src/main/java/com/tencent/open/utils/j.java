package com.tencent.open.utils;

import android.os.Bundle;
import org.json.JSONObject;

final class j extends Thread
{
  j(i parami, Bundle paramBundle)
  {
  }

  public final void run()
  {
    try
    {
      JSONObject localJSONObject = o.c(a.a(i.a(this.b), "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", "GET", this.a).a);
      i.a(this.b, localJSONObject);
      label33: i.b(this.b);
      return;
    }
    catch (Exception localException)
    {
      break label33;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.j
 * JD-Core Version:    0.6.0
 */