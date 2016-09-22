package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import java.util.concurrent.RejectedExecutionException;

public class AsyncTaskUtils
{
  public static boolean isRunning(AsyncTask paramAsyncTask)
  {
    if (paramAsyncTask == null);
    do
      return false;
    while ((!paramAsyncTask.getStatus().equals(AsyncTask.Status.PENDING)) && (!paramAsyncTask.getStatus().equals(AsyncTask.Status.RUNNING)));
    return true;
  }

  @TargetApi(11)
  public static <T> void runAsyncTask(AsyncTask<T, ?, ?> paramAsyncTask, T[] paramArrayOfT)
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramArrayOfT);
        return;
      }
      paramAsyncTask.execute(paramArrayOfT);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
    }
  }

  public static void stopAsyncTask(AsyncTask<?, ?, ?> paramAsyncTask)
  {
    if ((paramAsyncTask != null) && (paramAsyncTask.getStatus() != AsyncTask.Status.FINISHED))
      paramAsyncTask.cancel(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.AsyncTaskUtils
 * JD-Core Version:    0.6.0
 */