package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PublisherDetail extends Message
{
  public static final String DEFAULT_AVATAR = "";
  public static final String DEFAULT_CIRCLEAVATAR = "";
  public static final Long DEFAULT_CREATETIME;
  public static final Boolean DEFAULT_DEFAULTSELECTED;
  public static final String DEFAULT_DESCRIPTION = "";
  public static final Integer DEFAULT_FEEDCOUNT;
  public static final String DEFAULT_FULLDESCRIPTION = "";
  public static final String DEFAULT_ID = "";
  public static final String DEFAULT_NICK = "";
  public static final Boolean DEFAULT_SUBSCRIBED = Boolean.valueOf(false);
  public static final Integer DEFAULT_SUBSCRIBEDCOUNT = Integer.valueOf(0);
  public static final List<String> DEFAULT_TAGS;
  public static final String DEFAULT_TYPE = "";
  public static final String DEFAULT_UID = "";

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String avatar;

  @ProtoField(tag=14)
  public final PublisherCategory category;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String circleAvatar;

  @ProtoField(tag=13, type=Message.Datatype.INT64)
  public final Long createTime;

  @ProtoField(tag=12, type=Message.Datatype.BOOL)
  public final Boolean defaultSelected;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=11, type=Message.Datatype.INT32)
  public final Integer feedCount;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String fullDescription;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String id;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String nick;

  @ProtoField(tag=15)
  public final RelatedApp relatedApp;

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean subscribed;

  @ProtoField(tag=10, type=Message.Datatype.INT32)
  public final Integer subscribedCount;

  @ProtoField(label=Message.Label.REPEATED, tag=16, type=Message.Datatype.STRING)
  public final List<String> tags;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String type;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String uid;

  static
  {
    DEFAULT_FEEDCOUNT = Integer.valueOf(0);
    DEFAULT_DEFAULTSELECTED = Boolean.valueOf(false);
    DEFAULT_CREATETIME = Long.valueOf(0L);
    DEFAULT_TAGS = Collections.emptyList();
  }

  private PublisherDetail(PublisherDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.subscribed = paramBuilder.subscribed;
    this.type = paramBuilder.type;
    this.id = paramBuilder.id;
    this.uid = paramBuilder.uid;
    this.nick = paramBuilder.nick;
    this.avatar = paramBuilder.avatar;
    this.circleAvatar = paramBuilder.circleAvatar;
    this.description = paramBuilder.description;
    this.fullDescription = paramBuilder.fullDescription;
    this.subscribedCount = paramBuilder.subscribedCount;
    this.feedCount = paramBuilder.feedCount;
    this.defaultSelected = paramBuilder.defaultSelected;
    this.createTime = paramBuilder.createTime;
    this.category = paramBuilder.category;
    this.relatedApp = paramBuilder.relatedApp;
    this.tags = immutableCopyOf(paramBuilder.tags);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PublisherDetail localPublisherDetail;
    do
    {
      return true;
      if (!(paramObject instanceof PublisherDetail))
        return false;
      localPublisherDetail = (PublisherDetail)paramObject;
    }
    while ((equals(this.subscribed, localPublisherDetail.subscribed)) && (equals(this.type, localPublisherDetail.type)) && (equals(this.id, localPublisherDetail.id)) && (equals(this.uid, localPublisherDetail.uid)) && (equals(this.nick, localPublisherDetail.nick)) && (equals(this.avatar, localPublisherDetail.avatar)) && (equals(this.circleAvatar, localPublisherDetail.circleAvatar)) && (equals(this.description, localPublisherDetail.description)) && (equals(this.fullDescription, localPublisherDetail.fullDescription)) && (equals(this.subscribedCount, localPublisherDetail.subscribedCount)) && (equals(this.feedCount, localPublisherDetail.feedCount)) && (equals(this.defaultSelected, localPublisherDetail.defaultSelected)) && (equals(this.createTime, localPublisherDetail.createTime)) && (equals(this.category, localPublisherDetail.category)) && (equals(this.relatedApp, localPublisherDetail.relatedApp)) && (equals(this.tags, localPublisherDetail.tags)));
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
    label122: int i7;
    label148: int i9;
    label174: int i11;
    label200: int i13;
    label226: int i15;
    label252: int i17;
    label278: int i19;
    label304: int i21;
    label330: int i23;
    label356: int i26;
    if (i == 0)
    {
      if (this.subscribed == null)
        break label430;
      j = this.subscribed.hashCode();
      int k = j * 37;
      if (this.type == null)
        break label435;
      m = this.type.hashCode();
      int n = 37 * (m + k);
      if (this.id == null)
        break label441;
      i1 = this.id.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.uid == null)
        break label447;
      i3 = this.uid.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.nick == null)
        break label453;
      i5 = this.nick.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.avatar == null)
        break label459;
      i7 = this.avatar.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.circleAvatar == null)
        break label465;
      i9 = this.circleAvatar.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.description == null)
        break label471;
      i11 = this.description.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.fullDescription == null)
        break label477;
      i13 = this.fullDescription.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.subscribedCount == null)
        break label483;
      i15 = this.subscribedCount.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.feedCount == null)
        break label489;
      i17 = this.feedCount.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.defaultSelected == null)
        break label495;
      i19 = this.defaultSelected.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.createTime == null)
        break label501;
      i21 = this.createTime.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.category == null)
        break label507;
      i23 = this.category.hashCode();
      int i24 = 37 * (i23 + i22);
      RelatedApp localRelatedApp = this.relatedApp;
      int i25 = 0;
      if (localRelatedApp != null)
        i25 = this.relatedApp.hashCode();
      i26 = 37 * (i24 + i25);
      if (this.tags == null)
        break label513;
    }
    label513: for (int i27 = this.tags.hashCode(); ; i27 = 1)
    {
      i = i27 + i26;
      this.hashCode = i;
      return i;
      label430: j = 0;
      break;
      label435: m = 0;
      break label45;
      label441: i1 = 0;
      break label70;
      label447: i3 = 0;
      break label96;
      label453: i5 = 0;
      break label122;
      label459: i7 = 0;
      break label148;
      label465: i9 = 0;
      break label174;
      label471: i11 = 0;
      break label200;
      label477: i13 = 0;
      break label226;
      label483: i15 = 0;
      break label252;
      label489: i17 = 0;
      break label278;
      label495: i19 = 0;
      break label304;
      label501: i21 = 0;
      break label330;
      label507: i23 = 0;
      break label356;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherDetail
 * JD-Core Version:    0.6.0
 */