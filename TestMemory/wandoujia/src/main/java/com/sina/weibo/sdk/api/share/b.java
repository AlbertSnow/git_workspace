package com.sina.weibo.sdk.api.share;

import android.os.Bundle;
import com.sina.weibo.sdk.g;

public abstract class b extends a
{
  public void a(Bundle paramBundle)
  {
    paramBundle.putInt("_weibo_command_type", 1);
    paramBundle.putString("_weibo_transaction", this.a);
  }

  abstract boolean a(g paramg);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.b
 * JD-Core Version:    0.6.0
 */