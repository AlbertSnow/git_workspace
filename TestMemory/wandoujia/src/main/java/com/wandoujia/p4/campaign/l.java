package com.wandoujia.p4.campaign;

import android.webkit.WebView;

final class l
  implements Runnable
{
  l(e parame, String[] paramArrayOfString, String paramString)
  {
  }

  public final void run()
  {
    String str = this.c.getAppInfos(this.a);
    StringBuilder localStringBuilder = new StringBuilder("javascript:").append(this.b).append("(").append(str).append(")");
    e.a(this.c).loadUrl(localStringBuilder.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.l
 * JD-Core Version:    0.6.0
 */