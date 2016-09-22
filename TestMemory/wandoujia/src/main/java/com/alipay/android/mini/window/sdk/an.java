package com.alipay.android.mini.window.sdk;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.alipay.wandoujia.bw;

final class an
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private boolean a = false;

  an(am paramam)
  {
  }

  public final void onGlobalLayout()
  {
    if (!this.a)
    {
      this.a = true;
      if (!am.a(this.b))
        break label47;
      this.b.a(am.b(this.b), new com.alipay.wandoujia.an("switch"));
    }
    label47: bw localbw;
    do
    {
      return;
      localbw = this.b.b.b();
    }
    while (localbw == null);
    localbw.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.an
 * JD-Core Version:    0.6.0
 */