package com.sina.weibo.sdk;

import android.text.TextUtils;

public final class g
{
  private String a;
  private int b;

  public final String a()
  {
    return this.a;
  }

  public final int b()
  {
    return this.b;
  }

  public final boolean c()
  {
    return (!TextUtils.isEmpty(this.a)) && (this.b > 0);
  }

  public final String toString()
  {
    return "WeiboInfo: PackageName = " + this.a + ", supportApi = " + this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.g
 * JD-Core Version:    0.6.0
 */