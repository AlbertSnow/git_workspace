package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ClickEvent extends Message
{

  @ProtoField(tag=1)
  public final ViewLogPackage click;

  @ProtoField(tag=3)
  public final ViewLogPackage from_click;

  @ProtoField(tag=2)
  public final ViewLogPackage refer_click;

  private ClickEvent(ClickEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.click = paramBuilder.click;
    this.refer_click = paramBuilder.refer_click;
    this.from_click = paramBuilder.from_click;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ClickEvent localClickEvent;
    do
    {
      return true;
      if (!(paramObject instanceof ClickEvent))
        return false;
      localClickEvent = (ClickEvent)paramObject;
    }
    while ((equals(this.click, localClickEvent.click)) && (equals(this.refer_click, localClickEvent.refer_click)) && (equals(this.from_click, localClickEvent.from_click)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.click == null)
        break label90;
      j = this.click.hashCode();
      k = j * 37;
      if (this.refer_click == null)
        break label95;
    }
    label90: label95: for (int m = this.refer_click.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      ViewLogPackage localViewLogPackage = this.from_click;
      int i1 = 0;
      if (localViewLogPackage != null)
        i1 = this.from_click.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClickEvent
 * JD-Core Version:    0.6.0
 */