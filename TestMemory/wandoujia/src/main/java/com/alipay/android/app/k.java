package com.alipay.android.app;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

final class k extends IRemoteServiceCallback.Stub
{
  k(i parami)
  {
  }

  public final boolean isHideLoadingScreen()
  {
    return false;
  }

  public final void payEnd(boolean paramBoolean, String paramString)
  {
  }

  public final void startActivity(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramString1, paramString2));
    if (paramBundle == null)
      paramBundle = new Bundle();
    if (!paramBundle.containsKey("CallingPid"))
      paramBundle.putInt("CallingPid", paramInt);
    i.a(this.a, localIntent, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.k
 * JD-Core Version:    0.6.0
 */