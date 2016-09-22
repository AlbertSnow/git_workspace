package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class NotificationEvent extends Message
{
  public static final NotificationEvent.Action DEFAULT_ACTION = NotificationEvent.Action.SHOW;
  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final NotificationEvent.Action action;

  @ProtoField(tag=5)
  public final ExtraPackage extra_package;

  @ProtoField(tag=4)
  public final UrlPackage landing_page;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String type;

  private NotificationEvent(NotificationEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.action = paramBuilder.action;
    this.title = paramBuilder.title;
    this.type = paramBuilder.type;
    this.landing_page = paramBuilder.landing_page;
    this.extra_package = paramBuilder.extra_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    NotificationEvent localNotificationEvent;
    do
    {
      return true;
      if (!(paramObject instanceof NotificationEvent))
        return false;
      localNotificationEvent = (NotificationEvent)paramObject;
    }
    while ((equals(this.action, localNotificationEvent.action)) && (equals(this.title, localNotificationEvent.title)) && (equals(this.type, localNotificationEvent.type)) && (equals(this.landing_page, localNotificationEvent.landing_page)) && (equals(this.extra_package, localNotificationEvent.extra_package)));
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
      if (this.action == null)
        break label142;
      j = this.action.hashCode();
      int k = j * 37;
      if (this.title == null)
        break label147;
      m = this.title.hashCode();
      int n = 37 * (m + k);
      if (this.type == null)
        break label153;
      i1 = this.type.hashCode();
      i2 = 37 * (i1 + n);
      if (this.landing_page == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.landing_page.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      ExtraPackage localExtraPackage = this.extra_package;
      int i5 = 0;
      if (localExtraPackage != null)
        i5 = this.extra_package.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.NotificationEvent
 * JD-Core Version:    0.6.0
 */