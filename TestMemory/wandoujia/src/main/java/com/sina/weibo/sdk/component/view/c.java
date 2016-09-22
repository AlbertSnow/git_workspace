package com.sina.weibo.sdk.component.view;

import org.json.JSONObject;

final class c
  implements Runnable
{
  c(b paramb, JSONObject paramJSONObject)
  {
  }

  public final void run()
  {
    if (this.b != null)
      AttentionComponentView.a(this.a.a, this.b.optBoolean("followed_by", false));
    AttentionComponentView.b(this.a.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.c
 * JD-Core Version:    0.6.0
 */