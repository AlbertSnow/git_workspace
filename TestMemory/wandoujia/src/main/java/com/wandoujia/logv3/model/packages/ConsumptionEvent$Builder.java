package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ConsumptionEvent$Builder extends Message.Builder<ConsumptionEvent>
{
  public ViewLogPackage from_page;
  public ConsumptionEvent.Result result;
  public String source;
  public ConsumptionEvent.Type type;
  public ViewLogPackage view;

  public ConsumptionEvent$Builder()
  {
  }

  public ConsumptionEvent$Builder(ConsumptionEvent paramConsumptionEvent)
  {
    super(paramConsumptionEvent);
    if (paramConsumptionEvent == null)
      return;
    this.type = paramConsumptionEvent.type;
    this.source = paramConsumptionEvent.source;
    this.result = paramConsumptionEvent.result;
    this.view = paramConsumptionEvent.view;
    this.from_page = paramConsumptionEvent.from_page;
  }

  public final ConsumptionEvent build()
  {
    return new ConsumptionEvent(this, null);
  }

  public final Builder from_page(ViewLogPackage paramViewLogPackage)
  {
    this.from_page = paramViewLogPackage;
    return this;
  }

  public final Builder result(ConsumptionEvent.Result paramResult)
  {
    this.result = paramResult;
    return this;
  }

  public final Builder source(String paramString)
  {
    this.source = paramString;
    return this;
  }

  public final Builder type(ConsumptionEvent.Type paramType)
  {
    this.type = paramType;
    return this;
  }

  public final Builder view(ViewLogPackage paramViewLogPackage)
  {
    this.view = paramViewLogPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder
 * JD-Core Version:    0.6.0
 */