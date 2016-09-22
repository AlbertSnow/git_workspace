package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class NotificationPackage extends Message
{
  public static final String DEFAULT_ID = "";
  public static final String DEFAULT_STYLE = "";
  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String id;

  @ProtoField(tag=5)
  public final UrlPackage landing_page;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String style;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String type;

  private NotificationPackage(NotificationPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.title = paramBuilder.title;
    this.id = paramBuilder.id;
    this.type = paramBuilder.type;
    this.style = paramBuilder.style;
    this.landing_page = paramBuilder.landing_page;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    NotificationPackage localNotificationPackage;
    do
    {
      return true;
      if (!(paramObject instanceof NotificationPackage))
        return false;
      localNotificationPackage = (NotificationPackage)paramObject;
    }
    while ((equals(this.title, localNotificationPackage.title)) && (equals(this.id, localNotificationPackage.id)) && (equals(this.type, localNotificationPackage.type)) && (equals(this.style, localNotificationPackage.style)) && (equals(this.landing_page, localNotificationPackage.landing_page)));
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
      if (this.title == null)
        break label142;
      j = this.title.hashCode();
      int k = j * 37;
      if (this.id == null)
        break label147;
      m = this.id.hashCode();
      int n = 37 * (m + k);
      if (this.type == null)
        break label153;
      i1 = this.type.hashCode();
      i2 = 37 * (i1 + n);
      if (this.style == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.style.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      UrlPackage localUrlPackage = this.landing_page;
      int i5 = 0;
      if (localUrlPackage != null)
        i5 = this.landing_page.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.NotificationPackage
 * JD-Core Version:    0.6.0
 */