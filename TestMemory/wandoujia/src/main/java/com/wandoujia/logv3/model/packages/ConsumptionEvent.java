package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ConsumptionEvent extends Message
{
  public static final ConsumptionEvent.Result DEFAULT_RESULT;
  public static final String DEFAULT_SOURCE = "";
  public static final ConsumptionEvent.Type DEFAULT_TYPE = ConsumptionEvent.Type.DOWNLOAD;

  @ProtoField(tag=5)
  public final ViewLogPackage from_page;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final ConsumptionEvent.Result result;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String source;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final ConsumptionEvent.Type type;

  @ProtoField(tag=4)
  public final ViewLogPackage view;

  static
  {
    DEFAULT_RESULT = ConsumptionEvent.Result.SUCCESS;
  }

  private ConsumptionEvent(ConsumptionEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.source = paramBuilder.source;
    this.result = paramBuilder.result;
    this.view = paramBuilder.view;
    this.from_page = paramBuilder.from_page;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ConsumptionEvent localConsumptionEvent;
    do
    {
      return true;
      if (!(paramObject instanceof ConsumptionEvent))
        return false;
      localConsumptionEvent = (ConsumptionEvent)paramObject;
    }
    while ((equals(this.type, localConsumptionEvent.type)) && (equals(this.source, localConsumptionEvent.source)) && (equals(this.result, localConsumptionEvent.result)) && (equals(this.view, localConsumptionEvent.view)) && (equals(this.from_page, localConsumptionEvent.from_page)));
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
      if (this.source == null)
        break label147;
      m = this.source.hashCode();
      int n = 37 * (m + k);
      if (this.result == null)
        break label153;
      i1 = this.result.hashCode();
      i2 = 37 * (i1 + n);
      if (this.view == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.view.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      ViewLogPackage localViewLogPackage = this.from_page;
      int i5 = 0;
      if (localViewLogPackage != null)
        i5 = this.from_page.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.ConsumptionEvent
 * JD-Core Version:    0.6.0
 */