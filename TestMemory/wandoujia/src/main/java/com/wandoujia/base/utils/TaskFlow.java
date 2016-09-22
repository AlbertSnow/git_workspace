package com.wandoujia.base.utils;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class TaskFlow
{
  private CountDownLatch counter;
  private Exception error;
  private boolean terminating;

  public TaskFlow()
  {
    this.counter = new CountDownLatch(0);
    this.terminating = false;
  }

  private TaskFlow(int paramInt)
  {
    this.counter = new CountDownLatch(paramInt);
  }

  private void reject(Exception paramException)
  {
    this.terminating = true;
    this.error = paramException;
  }

  public void eventually(TaskFlow.Task paramTask)
  {
    this.error = null;
    this.terminating = false;
    then(new TaskFlow.Task[] { paramTask });
  }

  public TaskFlow except(TaskFlow.ErrorHandler paramErrorHandler)
  {
    try
    {
      this.counter.await();
      TaskFlow localTaskFlow = new TaskFlow(0);
      if ((this.terminating) && (this.error != null) && (paramErrorHandler.handle(this.error)))
      {
        this.terminating = false;
        this.error = null;
      }
      return localTaskFlow;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        reject(localInterruptedException);
    }
  }

  public TaskFlow then(TaskFlow.Task paramTask)
  {
    return then(new TaskFlow.Task[] { paramTask });
  }

  public TaskFlow then(List<TaskFlow.Task> paramList)
  {
    return then((TaskFlow.Task[])paramList.toArray(new TaskFlow.Task[0]));
  }

  public TaskFlow then(TaskFlow.Task[] paramArrayOfTask)
  {
    int i = 0;
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IllegalStateException("Cannot be called in UI thread.");
    while (true)
    {
      TaskFlow localTaskFlow;
      int j;
      try
      {
        this.counter.await();
        if (!this.terminating)
          continue;
        localTaskFlow = new TaskFlow(0);
        localTaskFlow.reject(this.error);
        return localTaskFlow;
      }
      catch (InterruptedException localInterruptedException)
      {
        reject(localInterruptedException);
        continue;
        localTaskFlow = new TaskFlow(paramArrayOfTask.length);
        j = paramArrayOfTask.length;
      }
      while (i < j)
      {
        ThreadPool.execute(new j(this, paramArrayOfTask[i], localTaskFlow));
        i++;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.TaskFlow
 * JD-Core Version:    0.6.0
 */