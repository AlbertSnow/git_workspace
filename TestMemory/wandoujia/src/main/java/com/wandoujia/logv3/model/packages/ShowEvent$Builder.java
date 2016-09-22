package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ShowEvent$Builder extends Message.Builder<ShowEvent>
{
  public ViewLogPackage from_click;
  public ViewLogPackage from_page;
  public ViewLogPackage refer_click;
  public ShowEvent.Type type;
  public ViewLogPackage view;

  public ShowEvent$Builder()
  {
  }

  public ShowEvent$Builder(ShowEvent paramShowEvent)
  {
    super(paramShowEvent);
    if (paramShowEvent == null)
      return;
    this.type = paramShowEvent.type;
    this.view = paramShowEvent.view;
    this.from_page = paramShowEvent.from_page;
    this.refer_click = paramShowEvent.refer_click;
    this.from_click = paramShowEvent.from_click;
  }

  public final ShowEvent build()
  {
    return new ShowEvent(this, null);
  }

  public final Builder from_click(ViewLogPackage paramViewLogPackage)
  {
    this.from_click = paramViewLogPackage;
    return this;
  }

  public final Builder from_page(ViewLogPackage paramViewLogPackage)
  {
    this.from_page = paramViewLogPackage;
    return this;
  }

  public final Builder refer_click(ViewLogPackage paramViewLogPackage)
  {
    this.refer_click = paramViewLogPackage;
    return this;
  }

  public final Builder type(ShowEvent.Type paramType)
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.ShowEvent.Builder
 * JD-Core Version:    0.6.0
 */