package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TaskEvent$Builder extends Message.Builder<TaskEvent>
{
  public TaskEvent.Action action;
  public Long effect_num;
  public String error_detail;
  public Integer identity;
  public TaskEvent.Result result;
  public String result_info;
  public TaskEvent.Status status;
  public ViewLogPackage view_log_package;

  public TaskEvent$Builder()
  {
  }

  public TaskEvent$Builder(TaskEvent paramTaskEvent)
  {
    super(paramTaskEvent);
    if (paramTaskEvent == null)
      return;
    this.identity = paramTaskEvent.identity;
    this.status = paramTaskEvent.status;
    this.result = paramTaskEvent.result;
    this.action = paramTaskEvent.action;
    this.error_detail = paramTaskEvent.error_detail;
    this.view_log_package = paramTaskEvent.view_log_package;
    this.result_info = paramTaskEvent.result_info;
    this.effect_num = paramTaskEvent.effect_num;
  }

  public final Builder action(TaskEvent.Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final TaskEvent build()
  {
    return new TaskEvent(this, null);
  }

  public final Builder effect_num(Long paramLong)
  {
    this.effect_num = paramLong;
    return this;
  }

  public final Builder error_detail(String paramString)
  {
    this.error_detail = paramString;
    return this;
  }

  public final Builder identity(Integer paramInteger)
  {
    this.identity = paramInteger;
    return this;
  }

  public final Builder result(TaskEvent.Result paramResult)
  {
    this.result = paramResult;
    return this;
  }

  public final Builder result_info(String paramString)
  {
    this.result_info = paramString;
    return this;
  }

  public final Builder status(TaskEvent.Status paramStatus)
  {
    this.status = paramStatus;
    return this;
  }

  public final Builder view_log_package(ViewLogPackage paramViewLogPackage)
  {
    this.view_log_package = paramViewLogPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TaskEvent.Builder
 * JD-Core Version:    0.6.0
 */