package com.wandoujia.appmanager;

import android.support.v4.app.b;
import com.redstone.sdk.enabler.remote.IRsServiceObserver.Stub;

final class am extends IRsServiceObserver.Stub
{
  am(ah paramah, String paramString)
  {
  }

  public final void a(String paramString, int paramInt)
  {
    if (paramInt == -1)
    {
      this.a.a(this.b, 1011);
      b.a("redstone.install.faild", b.a(this.b, false));
    }
    do
      return;
    while (paramInt != 1);
    b.a("redstone.install.faild", b.a(this.b, true));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.am
 * JD-Core Version:    0.6.0
 */