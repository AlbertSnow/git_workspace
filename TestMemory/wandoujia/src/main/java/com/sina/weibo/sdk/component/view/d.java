package com.sina.weibo.sdk.component.view;

import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.sina.weibo.sdk.component.n;

final class d
  implements n
{
  d(AttentionComponentView paramAttentionComponentView)
  {
  }

  public final void a(String paramString)
  {
    String str = b.l(paramString).getString("result");
    if (!TextUtils.isEmpty(str))
      try
      {
        long l = Integer.parseInt(str);
        if (l == 1L)
        {
          AttentionComponentView.a(this.a, true);
          return;
        }
        if (l == 0L)
        {
          AttentionComponentView.a(this.a, false);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.d
 * JD-Core Version:    0.6.0
 */