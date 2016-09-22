package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ClickEvent$Builder extends Message.Builder<ClickEvent>
{
  public ViewLogPackage click;
  public ViewLogPackage from_click;
  public ViewLogPackage refer_click;

  public ClickEvent$Builder()
  {
  }

  public ClickEvent$Builder(ClickEvent paramClickEvent)
  {
    super(paramClickEvent);
    if (paramClickEvent == null)
      return;
    this.click = paramClickEvent.click;
    this.refer_click = paramClickEvent.refer_click;
    this.from_click = paramClickEvent.from_click;
  }

  public final ClickEvent build()
  {
    return new ClickEvent(this, null);
  }

  public final Builder click(ViewLogPackage paramViewLogPackage)
  {
    this.click = paramViewLogPackage;
    return this;
  }

  public final Builder from_click(ViewLogPackage paramViewLogPackage)
  {
    this.from_click = paramViewLogPackage;
    return this;
  }

  public final Builder refer_click(ViewLogPackage paramViewLogPackage)
  {
    this.refer_click = paramViewLogPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClickEvent.Builder
 * JD-Core Version:    0.6.0
 */