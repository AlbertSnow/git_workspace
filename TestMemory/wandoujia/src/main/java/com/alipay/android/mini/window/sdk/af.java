package com.alipay.android.mini.window.sdk;

import android.support.v4.app.d;
import android.text.TextUtils;
import com.alipay.android.mini.widget.j;
import com.alipay.wandoujia.ra;

final class af
  implements Runnable
{
  af(TransContainer paramTransContainer, String paramString1, String paramString2, String paramString3, String paramString4, ra paramra1, ra paramra2)
  {
  }

  public final void run()
  {
    TransContainer.a(this.a);
    j localj = new j(this.a);
    if (TextUtils.isEmpty(this.b))
      localj.a(d.g("mini_error_title_default"));
    while (true)
    {
      localj.a(this.c);
      localj.b(this.d, new ag(this, this.f));
      localj.a(this.e, new ah(this, this.g));
      localj.a();
      return;
      localj.b(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.af
 * JD-Core Version:    0.6.0
 */