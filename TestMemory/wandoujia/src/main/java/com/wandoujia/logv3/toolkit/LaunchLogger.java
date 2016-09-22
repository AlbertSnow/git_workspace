package com.wandoujia.logv3.toolkit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.wandoujia.base.log.Log;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent.Builder;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent.Reason;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;

public final class LaunchLogger
{
  private k a;
  private LaunchLogger.LaunchState b;
  private String c;
  private long d;

  public LaunchLogger(k paramk)
  {
    this.a = paramk;
    this.b = LaunchLogger.LaunchState.NOT_LAUNCH;
    this.c = null;
  }

  private void a(Activity paramActivity, LaunchLogger.LaunchState paramLaunchState)
  {
    this.c = paramActivity.getClass().getName();
    this.b = paramLaunchState;
  }

  private boolean a(Activity paramActivity, Intent paramIntent, ApplicationStartEvent.Reason paramReason)
  {
    LaunchSourcePackage localLaunchSourcePackage = this.a.a(paramIntent);
    if ((localLaunchSourcePackage == null) || (localLaunchSourcePackage.source == null) || (localLaunchSourcePackage.source == LaunchSourcePackage.DEFAULT_SOURCE))
      return false;
    this.a.a(this.a.a(paramIntent), c(paramActivity, paramIntent, paramReason));
    return true;
  }

  private void b(Activity paramActivity, Intent paramIntent, ApplicationStartEvent.Reason paramReason)
  {
    this.a.a(this.a.a(paramIntent), c(paramActivity, paramIntent, paramReason));
  }

  private static ApplicationStartEvent c(Activity paramActivity, Intent paramIntent, ApplicationStartEvent.Reason paramReason)
  {
    ApplicationStartEvent.Builder localBuilder = new ApplicationStartEvent.Builder();
    localBuilder.activity(paramActivity.getClass().getSimpleName()).action(paramIntent.getAction()).data(paramIntent.getDataString()).reason(paramReason);
    return localBuilder.build();
  }

  public final void a(Activity paramActivity)
  {
    if ((paramActivity.isTaskRoot()) && (this.d != 0L))
    {
      Log.d("LaunchLogger", "Task is closed, duration is " + (System.currentTimeMillis() - this.d), new Object[0]);
      this.d = 0L;
    }
    if (paramActivity.getClass().getName().equals(this.c))
      a(paramActivity, LaunchLogger.LaunchState.NOT_LAUNCH);
  }

  public final void a(Activity paramActivity, Intent paramIntent)
  {
    a(paramActivity, LaunchLogger.LaunchState.LAUNCHED);
    a(paramActivity, paramIntent, ApplicationStartEvent.Reason.RELOAD);
  }

  public final void a(Activity paramActivity, Intent paramIntent, Bundle paramBundle)
  {
    a(paramActivity, LaunchLogger.LaunchState.LAUNCHED);
    if (paramBundle != null);
    do
    {
      return;
      if (!paramActivity.isTaskRoot())
      {
        a(paramActivity, paramIntent, ApplicationStartEvent.Reason.RELOAD);
        return;
      }
      this.d = System.currentTimeMillis();
    }
    while ((paramIntent.getExtras() != null) && (paramIntent.getExtras().getBoolean("force_not_launch", false)));
    b(paramActivity, paramIntent, ApplicationStartEvent.Reason.NEW);
  }

  public final void b(Activity paramActivity)
  {
    a(paramActivity, LaunchLogger.LaunchState.USER_WANNA_CLOSE);
  }

  public final void b(Activity paramActivity, Intent paramIntent)
  {
    LaunchLogger.LaunchState localLaunchState = LaunchLogger.LaunchState.USER_WANNA_CLOSE;
    if ((paramActivity.getClass().getName().equals(this.c)) && (localLaunchState.equals(this.b)));
    for (int i = 1; ; i = 0)
    {
      a(paramActivity, LaunchLogger.LaunchState.LAUNCHED);
      if (i != 0)
        break;
      return;
    }
    b(paramActivity, paramIntent, ApplicationStartEvent.Reason.RESTART);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.LaunchLogger
 * JD-Core Version:    0.6.0
 */