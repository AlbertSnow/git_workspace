package com.wandoujia.logv3;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.logv3.model.packages.CommonPackage;
import com.wandoujia.logv3.model.packages.DevicePackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;

public abstract interface c
{
  public abstract CommonPackage a(Context paramContext, CommonPackage paramCommonPackage);

  public abstract CommonPackage a(LaunchSourcePackage paramLaunchSourcePackage, CommonPackage paramCommonPackage);

  public abstract DevicePackage a(Context paramContext);

  public abstract LaunchSourcePackage a(Intent paramIntent);

  public abstract CommonPackage b(Context paramContext);

  public abstract String h();

  public abstract String i();

  public abstract String j();

  public abstract i k();

  public abstract LogSender.SenderPolicyModel l();

  public abstract LogSender.SenderPolicyModel m();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.c
 * JD-Core Version:    0.6.0
 */