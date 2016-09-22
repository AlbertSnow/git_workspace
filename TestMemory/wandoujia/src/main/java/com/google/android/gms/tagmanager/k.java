package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class k
  implements ComponentCallbacks2
{
  k(i parami)
  {
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onLowMemory()
  {
  }

  public final void onTrimMemory(int paramInt)
  {
    if (paramInt == 20)
      this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.k
 * JD-Core Version:    0.6.0
 */