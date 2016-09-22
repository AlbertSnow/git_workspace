package com.wandoujia.jupiter.activity;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.jupiter.share.ShareUtil;
import com.wandoujia.ripple_framework.view.LoadingView;

final class m
  implements j
{
  m(k paramk, SharePlatformEnum paramSharePlatformEnum)
  {
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    ShareActivity.c(this.b.a).b();
    ShareUtil.a(this.b.a, ShareUtil.a(this.b.a, this.a, ShareActivity.a(this.b.a), ShareActivity.b(this.b.a)), this.a, ShareActivity.a(this.b.a), ShareActivity.b(this.b.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.m
 * JD-Core Version:    0.6.0
 */