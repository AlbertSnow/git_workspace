package com.wandoujia.p4.campaign;

import android.webkit.WebView;

final class k
  implements Runnable
{
  k(e parame, String paramString)
  {
  }

  public final void run()
  {
    String str = this.b.getSystemApps();
    StringBuilder localStringBuilder = new StringBuilder("javascript:").append(this.a).append("(").append(str).append(")");
    e.a(this.b).loadUrl(localStringBuilder.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.k
 * JD-Core Version:    0.6.0
 */