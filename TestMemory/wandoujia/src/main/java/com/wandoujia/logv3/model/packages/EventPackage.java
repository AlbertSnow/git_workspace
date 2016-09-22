package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EventPackage extends Message
{

  @ProtoField(tag=3)
  public final ApplicationActiveEvent active_event;

  @ProtoField(tag=1)
  public final ClickEvent click_event;

  @ProtoField(tag=7)
  public final ConsumptionEvent consumption_event;

  @ProtoField(tag=5)
  public final ApplicationCrashEvent crash_event;

  @ProtoField(tag=2)
  public final ShowEvent show_event;

  @ProtoField(tag=4)
  public final ApplicationStartEvent start_event;

  @ProtoField(tag=6)
  public final TaskEvent task_event;

  private EventPackage(EventPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.click_event = paramBuilder.click_event;
    this.show_event = paramBuilder.show_event;
    this.active_event = paramBuilder.active_event;
    this.start_event = paramBuilder.start_event;
    this.crash_event = paramBuilder.crash_event;
    this.task_event = paramBuilder.task_event;
    this.consumption_event = paramBuilder.consumption_event;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    EventPackage localEventPackage;
    do
    {
      return true;
      if (!(paramObject instanceof EventPackage))
        return false;
      localEventPackage = (EventPackage)paramObject;
    }
    while ((equals(this.click_event, localEventPackage.click_event)) && (equals(this.show_event, localEventPackage.show_event)) && (equals(this.active_event, localEventPackage.active_event)) && (equals(this.start_event, localEventPackage.start_event)) && (equals(this.crash_event, localEventPackage.crash_event)) && (equals(this.task_event, localEventPackage.task_event)) && (equals(this.consumption_event, localEventPackage.consumption_event)));
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
    label122: int i6;
    if (i == 0)
    {
      if (this.click_event == null)
        break label194;
      j = this.click_event.hashCode();
      int k = j * 37;
      if (this.show_event == null)
        break label199;
      m = this.show_event.hashCode();
      int n = 37 * (m + k);
      if (this.active_event == null)
        break label205;
      i1 = this.active_event.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.start_event == null)
        break label211;
      i3 = this.start_event.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.crash_event == null)
        break label217;
      i5 = this.crash_event.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.task_event == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.task_event.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      ConsumptionEvent localConsumptionEvent = this.consumption_event;
      int i9 = 0;
      if (localConsumptionEvent != null)
        i9 = this.consumption_event.hashCode();
      i = i8 + i9;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.EventPackage
 * JD-Core Version:    0.6.0
 */