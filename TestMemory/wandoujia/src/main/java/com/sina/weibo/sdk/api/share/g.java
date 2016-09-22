package com.sina.weibo.sdk.api.share;

import android.os.Bundle;

public final class g extends b
{
  public com.sina.weibo.sdk.api.h b;

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putAll(this.b.a(paramBundle));
  }

  final boolean a(com.sina.weibo.sdk.g paramg)
  {
    if ((this.b == null) || (paramg == null) || (!paramg.c()));
    do
      return false;
    while (!h.a(paramg, this.b));
    return this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.g
 * JD-Core Version:    0.6.0
 */