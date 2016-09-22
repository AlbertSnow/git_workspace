package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

@TargetApi(14)
@zzhb
public class zzbe
  implements Application.ActivityLifecycleCallbacks
{
  private Activity mActivity;
  private Context mContext;
  private final Object zzpV = new Object();

  public zzbe(Application paramApplication, Activity paramActivity)
  {
    paramApplication.registerActivityLifecycleCallbacks(this);
    setActivity(paramActivity);
    this.mContext = paramApplication.getApplicationContext();
  }

  public void onActivityCreated(Activity activity, Bundle savedInstanceState)
  {
  }

  @Nullable
  public Activity getActivity()
  {
    return this.mActivity;
  }

  public Context getContext()
  {
    return this.mContext;
  }

  public void onActivityStarted(Activity activity)
  {
    setActivity(activity);
  }

  public void onActivityResumed(Activity activity)
  {
    setActivity(activity);
  }

  public void onActivityPaused(Activity activity)
  {
    setActivity(activity);
  }

  public void onActivityStopped(Activity activity)
  {
  }

  public void onActivitySaveInstanceState(Activity activity, Bundle savedInstanceState)
  {
  }

  public void onActivityDestroyed(Activity activity)
  {
    synchronized (this.zzpV)
    {
      if (this.mActivity == null)
        return;
      if (this.mActivity.equals(activity))
        this.mActivity = null;
    }
  }

  private void setActivity(Activity activity)
  {
    synchronized (this.zzpV)
    {
      if (!activity.getClass().getName().startsWith("com.google.android.gms.ads"))
        this.mActivity = activity;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbe
 * JD-Core Version:    0.6.0
 */