package com.wandoujia.logv3.toolkit;

import android.content.Intent;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;

public abstract interface k
{
  public abstract LaunchSourcePackage a(Intent paramIntent);

  public abstract void a(LaunchSourcePackage paramLaunchSourcePackage, ApplicationStartEvent paramApplicationStartEvent);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.k
 * JD-Core Version:    0.6.0
 */