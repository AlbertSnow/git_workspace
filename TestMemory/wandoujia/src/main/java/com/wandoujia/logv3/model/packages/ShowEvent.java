package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ShowEvent extends Message
{
  public static final ShowEvent.Type DEFAULT_TYPE = ShowEvent.Type.PAGE;

  @ProtoField(tag=5)
  public final ViewLogPackage from_click;

  @ProtoField(tag=3)
  public final ViewLogPackage from_page;

  @ProtoField(tag=4)
  public final ViewLogPackage refer_click;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final ShowEvent.Type type;

  @ProtoField(tag=2)
  public final ViewLogPackage view;

  private ShowEvent(ShowEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.view = paramBuilder.view;
    this.from_page = paramBuilder.from_page;
    this.refer_click = paramBuilder.refer_click;
    this.from_click = paramBuilder.from_click;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ShowEvent localShowEvent;
    do
    {
      return true;
      if (!(paramObject instanceof ShowEvent))
        return false;
      localShowEvent = (ShowEvent)paramObject;
    }
    while ((equals(this.type, localShowEvent.type)) && (equals(this.view, localShowEvent.view)) && (equals(this.from_page, localShowEvent.from_page)) && (equals(this.refer_click, localShowEvent.refer_click)) && (equals(this.from_click, localShowEvent.from_click)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.type == null)
        break label142;
      j = this.type.hashCode();
      int k = j * 37;
      if (this.view == null)
        break label147;
      m = this.view.hashCode();
      int n = 37 * (m + k);
      if (this.from_page == null)
        break label153;
      i1 = this.from_page.hashCode();
      i2 = 37 * (i1 + n);
      if (this.refer_click == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.refer_click.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      ViewLogPackage localViewLogPackage = this.from_click;
      int i5 = 0;
      if (localViewLogPackage != null)
        i5 = this.from_click.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ShowEvent
 * JD-Core Version:    0.6.0
 */