package com.wandoujia.jupiter.view;

import android.view.View;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.jupiter.share.ShareUtil;

final class o
  implements j
{
  o(m paramm, View paramView, SharePlatformEnum paramSharePlatformEnum)
  {
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    ShareUtil.a(this.a.getContext(), ShareUtil.a(this.a.getContext(), this.b, ShareView.a(this.c.a), ShareView.b(this.c.a)), this.b, ShareView.a(this.c.a), ShareView.b(this.c.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.o
 * JD-Core Version:    0.6.0
 */