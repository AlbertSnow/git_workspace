package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class EventPackage$Builder extends Message.Builder<EventPackage>
{
  public ApplicationActiveEvent active_event;
  public ClickEvent click_event;
  public ConsumptionEvent consumption_event;
  public ApplicationCrashEvent crash_event;
  public ShowEvent show_event;
  public ApplicationStartEvent start_event;
  public TaskEvent task_event;

  public EventPackage$Builder()
  {
  }

  public EventPackage$Builder(EventPackage paramEventPackage)
  {
    super(paramEventPackage);
    if (paramEventPackage == null)
      return;
    this.click_event = paramEventPackage.click_event;
    this.show_event = paramEventPackage.show_event;
    this.active_event = paramEventPackage.active_event;
    this.start_event = paramEventPackage.start_event;
    this.crash_event = paramEventPackage.crash_event;
    this.task_event = paramEventPackage.task_event;
    this.consumption_event = paramEventPackage.consumption_event;
  }

  public final Builder active_event(ApplicationActiveEvent paramApplicationActiveEvent)
  {
    this.active_event = paramApplicationActiveEvent;
    return this;
  }

  public final EventPackage build()
  {
    return new EventPackage(this, null);
  }

  public final Builder click_event(ClickEvent paramClickEvent)
  {
    this.click_event = paramClickEvent;
    return this;
  }

  public final Builder consumption_event(ConsumptionEvent paramConsumptionEvent)
  {
    this.consumption_event = paramConsumptionEvent;
    return this;
  }

  public final Builder crash_event(ApplicationCrashEvent paramApplicationCrashEvent)
  {
    this.crash_event = paramApplicationCrashEvent;
    return this;
  }

  public final Builder show_event(ShowEvent paramShowEvent)
  {
    this.show_event = paramShowEvent;
    return this;
  }

  public final Builder start_event(ApplicationStartEvent paramApplicationStartEvent)
  {
    this.start_event = paramApplicationStartEvent;
    return this;
  }

  public final Builder task_event(TaskEvent paramTaskEvent)
  {
    this.task_event = paramTaskEvent;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.EventPackage.Builder
 * JD-Core Version:    0.6.0
 */