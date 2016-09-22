package com.google.android.gms.ads.internal.appcontent;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.report.client.a;

@a
@TargetApi(14)
public final class c
  implements Application.ActivityLifecycleCallbacks
{
  Activity a;
  Context b;
  private final Object c = new Object();

  public c(Application paramApplication, Context paramContext)
  {
    paramApplication.registerActivityLifecycleCallbacks(this);
    if ((paramContext instanceof Activity))
      a((Activity)paramContext);
    this.b = paramContext;
  }

  private final void a(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads"))
        this.a = paramActivity;
      return;
    }
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (this.a == null)
        return;
      if (this.a.equals(paramActivity))
        this.a = null;
      return;
    }
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity);
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.c
 * JD-Core Version:    0.6.0
 */