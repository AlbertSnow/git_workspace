package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FavoriteSummary extends Message
{
  public static final Boolean DEFAULT_FAVORITED;
  public static final List<String> DEFAULT_FRIENDS_AVATAR = Collections.emptyList();
  public static final Long DEFAULT_NEXT_VERSION;
  public static final Integer DEFAULT_TOTAL_COUNT = Integer.valueOf(0);
  public static final Long DEFAULT_UPDATE_TIME;
  public static final Long DEFAULT_VERSION;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean favorited;

  @ProtoField(label=Message.Label.REPEATED, tag=1, type=Message.Datatype.STRING)
  public final List<String> friends_avatar;

  @ProtoField(tag=5, type=Message.Datatype.INT64)
  public final Long next_version;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT32)
  public final Integer total_count;

  @ProtoField(tag=6, type=Message.Datatype.INT64)
  public final Long update_time;

  @ProtoField(tag=4, type=Message.Datatype.INT64)
  public final Long version;

  static
  {
    DEFAULT_FAVORITED = Boolean.valueOf(false);
    DEFAULT_VERSION = Long.valueOf(0L);
    DEFAULT_NEXT_VERSION = Long.valueOf(0L);
    DEFAULT_UPDATE_TIME = Long.valueOf(0L);
  }

  private FavoriteSummary(FavoriteSummary.Builder paramBuilder)
  {
    super(paramBuilder);
    this.friends_avatar = immutableCopyOf(paramBuilder.friends_avatar);
    this.total_count = paramBuilder.total_count;
    this.favorited = paramBuilder.favorited;
    this.version = paramBuilder.version;
    this.next_version = paramBuilder.next_version;
    this.update_time = paramBuilder.update_time;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    FavoriteSummary localFavoriteSummary;
    do
    {
      return true;
      if (!(paramObject instanceof FavoriteSummary))
        return false;
      localFavoriteSummary = (FavoriteSummary)paramObject;
    }
    while ((equals(this.friends_avatar, localFavoriteSummary.friends_avatar)) && (equals(this.total_count, localFavoriteSummary.total_count)) && (equals(this.favorited, localFavoriteSummary.favorited)) && (equals(this.version, localFavoriteSummary.version)) && (equals(this.next_version, localFavoriteSummary.next_version)) && (equals(this.update_time, localFavoriteSummary.update_time)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label47: int i1;
    label72: int i3;
    label98: int i4;
    if (i == 0)
    {
      if (this.friends_avatar == null)
        break label170;
      j = this.friends_avatar.hashCode();
      int k = j * 37;
      if (this.total_count == null)
        break label175;
      m = this.total_count.hashCode();
      int n = 37 * (m + k);
      if (this.favorited == null)
        break label181;
      i1 = this.favorited.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.version == null)
        break label187;
      i3 = this.version.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.next_version == null)
        break label193;
    }
    label170: label175: label181: label187: label193: for (int i5 = this.next_version.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      Long localLong = this.update_time;
      int i7 = 0;
      if (localLong != null)
        i7 = this.update_time.hashCode();
      i = i6 + i7;
      this.hashCode = i;
      return i;
      j = 1;
      break;
      m = 0;
      break label47;
      i1 = 0;
      break label72;
      i3 = 0;
      break label98;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavoriteSummary
 * JD-Core Version:    0.6.0
 */