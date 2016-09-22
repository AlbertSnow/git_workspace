package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ViewLogPackage extends Message
{
  public static final ViewLogPackage.Action DEFAULT_ACTION;
  public static final ViewLogPackage.Element DEFAULT_ELEMENT = ViewLogPackage.Element.BUTTON;
  public static final String DEFAULT_MODULE = "";
  public static final String DEFAULT_NAME = "";
  public static final Long DEFAULT_VALUE;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final ViewLogPackage.Action action;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final ViewLogPackage.Element element;

  @ProtoField(tag=5)
  public final ViewLogPackage.IndexPackage index;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String module;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=1)
  public final UrlPackage url_package;

  @ProtoField(tag=7, type=Message.Datatype.INT64)
  public final Long value;

  static
  {
    DEFAULT_ACTION = ViewLogPackage.Action.REDIRECT;
    DEFAULT_VALUE = Long.valueOf(0L);
  }

  private ViewLogPackage(ViewLogPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.url_package = paramBuilder.url_package;
    this.element = paramBuilder.element;
    this.action = paramBuilder.action;
    this.module = paramBuilder.module;
    this.index = paramBuilder.index;
    this.name = paramBuilder.name;
    this.value = paramBuilder.value;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ViewLogPackage localViewLogPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ViewLogPackage))
        return false;
      localViewLogPackage = (ViewLogPackage)paramObject;
    }
    while ((equals(this.url_package, localViewLogPackage.url_package)) && (equals(this.element, localViewLogPackage.element)) && (equals(this.action, localViewLogPackage.action)) && (equals(this.module, localViewLogPackage.module)) && (equals(this.index, localViewLogPackage.index)) && (equals(this.name, localViewLogPackage.name)) && (equals(this.value, localViewLogPackage.value)));
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
      if (this.url_package == null)
        break label194;
      j = this.url_package.hashCode();
      int k = j * 37;
      if (this.element == null)
        break label199;
      m = this.element.hashCode();
      int n = 37 * (m + k);
      if (this.action == null)
        break label205;
      i1 = this.action.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.module == null)
        break label211;
      i3 = this.module.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.index == null)
        break label217;
      i5 = this.index.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.name == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.name.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      Long localLong = this.value;
      int i9 = 0;
      if (localLong != null)
        i9 = this.value.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage
 * JD-Core Version:    0.6.0
 */