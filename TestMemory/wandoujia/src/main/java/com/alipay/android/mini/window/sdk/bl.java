package com.alipay.android.mini.window.sdk;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

final class bl
  implements View.OnClickListener
{
  bl(MiniWebActivity paramMiniWebActivity)
  {
  }

  public final void onClick(View paramView)
  {
    MiniWebActivity.d(this.a).reload();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bl
 * JD-Core Version:    0.6.0
 */