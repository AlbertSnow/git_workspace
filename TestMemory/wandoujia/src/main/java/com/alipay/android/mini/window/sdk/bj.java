package com.alipay.android.mini.window.sdk;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

final class bj
  implements View.OnClickListener
{
  bj(MiniWebActivity paramMiniWebActivity)
  {
  }

  public final void onClick(View paramView)
  {
    MiniWebActivity.d(this.a).goBack();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bj
 * JD-Core Version:    0.6.0
 */