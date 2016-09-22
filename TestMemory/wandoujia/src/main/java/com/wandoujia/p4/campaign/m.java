package com.wandoujia.p4.campaign;

import android.webkit.WebView;

final class m
  implements Runnable
{
  m(e parame, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    String str = this.c.getAppInfo(this.a);
    StringBuilder localStringBuilder = new StringBuilder("javascript:").append(this.b).append("(").append(str).append(")");
    e.a(this.c).loadUrl(localStringBuilder.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.m
 * JD-Core Version:    0.6.0
 */