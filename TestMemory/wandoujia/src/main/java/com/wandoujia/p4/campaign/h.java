package com.wandoujia.p4.campaign;

import android.webkit.WebView;
import com.wandoujia.account.a;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;

final class h
  implements com.wandoujia.account.listener.e
{
  h(e parame, String paramString)
  {
  }

  public final void a(AccountParamConstants.FinishType paramFinishType)
  {
    if (this.a != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("javascript:").append(this.a).append("(").append(a.i()).append(")");
      e.a(this.b).loadUrl(localStringBuilder.toString());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.h
 * JD-Core Version:    0.6.0
 */