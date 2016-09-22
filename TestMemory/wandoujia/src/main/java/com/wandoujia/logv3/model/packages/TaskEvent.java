package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TaskEvent extends Message
{
  public static final TaskEvent.Action DEFAULT_ACTION;
  public static final Long DEFAULT_EFFECT_NUM;
  public static final String DEFAULT_ERROR_DETAIL = "";
  public static final Integer DEFAULT_IDENTITY = Integer.valueOf(0);
  public static final TaskEvent.Result DEFAULT_RESULT;
  public static final String DEFAULT_RESULT_INFO = "";
  public static final TaskEvent.Status DEFAULT_STATUS = TaskEvent.Status.START;

  @ProtoField(tag=4, type=Message.Datatype.ENUM)
  public final TaskEvent.Action action;

  @ProtoField(tag=8, type=Message.Datatype.INT64)
  public final Long effect_num;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String error_detail;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer identity;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final TaskEvent.Result result;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String result_info;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final TaskEvent.Status status;

  @ProtoField(tag=6)
  public final ViewLogPackage view_log_package;

  static
  {
    DEFAULT_RESULT = TaskEvent.Result.SUCCESS;
    DEFAULT_ACTION = TaskEvent.Action.DOWNLOAD;
    DEFAULT_EFFECT_NUM = Long.valueOf(0L);
  }

  private TaskEvent(TaskEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.status = paramBuilder.status;
    this.result = paramBuilder.result;
    this.action = paramBuilder.action;
    this.error_detail = paramBuilder.error_detail;
    this.view_log_package = paramBuilder.view_log_package;
    this.result_info = paramBuilder.result_info;
    this.effect_num = paramBuilder.effect_num;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TaskEvent localTaskEvent;
    do
    {
      return true;
      if (!(paramObject instanceof TaskEvent))
        return false;
      localTaskEvent = (TaskEvent)paramObject;
    }
    while ((equals(this.identity, localTaskEvent.identity)) && (equals(this.status, localTaskEvent.status)) && (equals(this.result, localTaskEvent.result)) && (equals(this.action, localTaskEvent.action)) && (equals(this.error_detail, localTaskEvent.error_detail)) && (equals(this.view_log_package, localTaskEvent.view_log_package)) && (equals(this.result_info, localTaskEvent.result_info)) && (equals(this.effect_num, localTaskEvent.effect_num)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i7;
    label148: int i8;
    if (i == 0)
    {
      if (this.identity == null)
        break label220;
      j = this.identity.hashCode();
      int k = j * 37;
      if (this.status == null)
        break label225;
      m = this.status.hashCode();
      int n = 37 * (m + k);
      if (this.result == null)
        break label231;
      i1 = this.result.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.action == null)
        break label237;
      i3 = this.action.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.error_detail == null)
        break label243;
      i5 = this.error_detail.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.view_log_package == null)
        break label249;
      i7 = this.view_log_package.hashCode();
      i8 = 37 * (i7 + i6);
      if (this.result_info == null)
        break label255;
    }
    label220: label225: label231: label237: label243: label249: label255: for (int i9 = this.result_info.hashCode(); ; i9 = 0)
    {
      int i10 = 37 * (i9 + i8);
      Long localLong = this.effect_num;
      int i11 = 0;
      if (localLong != null)
        i11 = this.effect_num.hashCode();
      i = i10 + i11;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TaskEvent
 * JD-Core Version:    0.6.0
 */