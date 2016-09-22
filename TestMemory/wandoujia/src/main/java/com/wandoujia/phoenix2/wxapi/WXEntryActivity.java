package com.wandoujia.phoenix2.wxapi;

import android.os.Bundle;
import android.webkit.WebView;
import com.tencent.mm.sdk.openapi.a;
import com.tencent.mm.sdk.openapi.b;
import com.tencent.mm.sdk.openapi.d;
import com.tencent.mm.sdk.openapi.e;
import com.tencent.mm.sdk.openapi.k;
import com.wandoujia.account.activities.WDJWXEntryActivity;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.p4.campaign.v;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class WXEntryActivity extends WDJWXEntryActivity
  implements e
{
  private d a;

  public final void a(a parama)
  {
    super.a(parama);
  }

  public final void a(b paramb)
  {
    super.a(paramb);
    if (paramb == null)
      return;
    StringBuilder localStringBuilder1 = new StringBuilder("javascript:").append(v.c()).append("(");
    boolean bool;
    StringBuilder localStringBuilder2;
    WebView localWebView;
    SharePlatformEnum localSharePlatformEnum1;
    if ((paramb.a == 0) || (paramb.a == -2))
    {
      bool = true;
      localStringBuilder2 = localStringBuilder1.append(bool).append(")");
      localWebView = v.b();
      if (localWebView != null)
        break label222;
      localSharePlatformEnum1 = SharePlatformEnum.WECHAT_SESSION;
      if ((paramb.b == null) || (!paramb.b.startsWith("moment")))
        break label241;
    }
    label222: label241: for (SharePlatformEnum localSharePlatformEnum2 = SharePlatformEnum.WECHAT_MOMENT; ; localSharePlatformEnum2 = localSharePlatformEnum1)
    {
      TaskEvent.Result localResult;
      switch (paramb.a)
      {
      case -1:
      default:
        localResult = TaskEvent.Result.SUCCESS;
      case 0:
      case -2:
      case -4:
      case -3:
      }
      while (true)
      {
        ((Logger)h.k().a("log")).a(new TaskEvent.Builder().action(TaskEvent.Action.SHARE).result(localResult).result_info(localSharePlatformEnum2.name()), new ExtraPackage.Builder());
        return;
        bool = false;
        break;
        localResult = TaskEvent.Result.SUCCESS;
        continue;
        localResult = TaskEvent.Result.CANCEL;
        continue;
        localResult = TaskEvent.Result.FAIL;
      }
      localWebView.loadUrl(localStringBuilder2.toString());
      v.a(null);
      v.a(null);
      return;
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = k.a(this, "wxed6dfca0ae67f7a3", false);
    this.a.a("wxed6dfca0ae67f7a3");
    d.a(getIntent(), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.phoenix2.wxapi.WXEntryActivity
 * JD-Core Version:    0.6.0
 */