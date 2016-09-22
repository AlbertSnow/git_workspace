package com.tencent.open.yyb;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.tencent.connect.b.c;
import com.tencent.open.a.f;

final class d
  implements DownloadListener
{
  d(AppbarActivity paramAppbarActivity)
  {
  }

  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    f.a("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)onDownloadStart : url = " + paramString1);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    try
    {
      this.a.startActivity(localIntent);
      c localc = AppbarActivity.c(this.a);
      if (localc != null)
        a.a(localc.b(), "200", "SDK.APPBAR.HOME ACTION");
      return;
    }
    catch (Exception localException)
    {
      while (true)
        f.b("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)onDownloadStart : activity aciton_view not found.");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.d
 * JD-Core Version:    0.6.0
 */