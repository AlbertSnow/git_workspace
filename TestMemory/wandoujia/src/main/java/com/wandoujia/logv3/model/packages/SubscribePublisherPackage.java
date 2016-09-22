package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SubscribePublisherPackage extends Message
{
  public static final Boolean DEFAULT_PUBLISHER_DEFAULTSELECTED;
  public static final String DEFAULT_PUBLISHER_ID = "";
  public static final String DEFAULT_PUBLISHER_NICK = "";
  public static final Boolean DEFAULT_PUBLISHER_SUBSCRIBED = Boolean.valueOf(false);
  public static final String DEFAULT_PUBLISHER_SUBSCRIBEDCOUNT = "";
  public static final String DEFAULT_PUBLISHER_TYPE = "";

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean publisher_defaultSelected;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String publisher_id;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String publisher_nick;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean publisher_subscribed;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String publisher_subscribedCount;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String publisher_type;

  static
  {
    DEFAULT_PUBLISHER_DEFAULTSELECTED = Boolean.valueOf(false);
  }

  private SubscribePublisherPackage(SubscribePublisherPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.publisher_type = paramBuilder.publisher_type;
    this.publisher_id = paramBuilder.publisher_id;
    this.publisher_nick = paramBuilder.publisher_nick;
    this.publisher_subscribedCount = paramBuilder.publisher_subscribedCount;
    this.publisher_subscribed = paramBuilder.publisher_subscribed;
    this.publisher_defaultSelected = paramBuilder.publisher_defaultSelected;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SubscribePublisherPackage localSubscribePublisherPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SubscribePublisherPackage))
        return false;
      localSubscribePublisherPackage = (SubscribePublisherPackage)paramObject;
    }
    while ((equals(this.publisher_type, localSubscribePublisherPackage.publisher_type)) && (equals(this.publisher_id, localSubscribePublisherPackage.publisher_id)) && (equals(this.publisher_nick, localSubscribePublisherPackage.publisher_nick)) && (equals(this.publisher_subscribedCount, localSubscribePublisherPackage.publisher_subscribedCount)) && (equals(this.publisher_subscribed, localSubscribePublisherPackage.publisher_subscribed)) && (equals(this.publisher_defaultSelected, localSubscribePublisherPackage.publisher_defaultSelected)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i4;
    if (i == 0)
    {
      if (this.publisher_type == null)
        break label168;
      j = this.publisher_type.hashCode();
      int k = j * 37;
      if (this.publisher_id == null)
        break label173;
      m = this.publisher_id.hashCode();
      int n = 37 * (m + k);
      if (this.publisher_nick == null)
        break label179;
      i1 = this.publisher_nick.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.publisher_subscribedCount == null)
        break label185;
      i3 = this.publisher_subscribedCount.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.publisher_subscribed == null)
        break label191;
    }
    label168: label173: label179: label185: label191: for (int i5 = this.publisher_subscribed.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      Boolean localBoolean = this.publisher_defaultSelected;
      int i7 = 0;
      if (localBoolean != null)
        i7 = this.publisher_defaultSelected.hashCode();
      i = i6 + i7;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribePublisherPackage
 * JD-Core Version:    0.6.0
 */