package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class CommentJson extends Message
{
  public static final Boolean DEFAULT_AGREE;
  public static final Integer DEFAULT_AGREECOUNT;
  public static final String DEFAULT_AUTHORID = "";
  public static final String DEFAULT_AUTHORNAME = "";
  public static final String DEFAULT_AVATAR = "";
  public static final String DEFAULT_CONTENT = "";
  public static final String DEFAULT_DATE = "";
  public static final Boolean DEFAULT_ENJOY;
  public static final Boolean DEFAULT_HOT;
  public static final Long DEFAULT_ID = Long.valueOf(0L);

  @ProtoField(tag=8, type=Message.Datatype.BOOL)
  public final Boolean agree;

  @ProtoField(tag=9, type=Message.Datatype.INT32)
  public final Integer agreeCount;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String authorId;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String authorName;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String avatar;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String content;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String date;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean enjoy;

  @ProtoField(tag=10, type=Message.Datatype.BOOL)
  public final Boolean hot;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long id;

  static
  {
    DEFAULT_ENJOY = Boolean.valueOf(false);
    DEFAULT_AGREE = Boolean.valueOf(false);
    DEFAULT_AGREECOUNT = Integer.valueOf(0);
    DEFAULT_HOT = Boolean.valueOf(false);
  }

  private CommentJson(CommentJson.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.authorId = paramBuilder.authorId;
    this.authorName = paramBuilder.authorName;
    this.avatar = paramBuilder.avatar;
    this.enjoy = paramBuilder.enjoy;
    this.date = paramBuilder.date;
    this.content = paramBuilder.content;
    this.agree = paramBuilder.agree;
    this.agreeCount = paramBuilder.agreeCount;
    this.hot = paramBuilder.hot;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CommentJson localCommentJson;
    do
    {
      return true;
      if (!(paramObject instanceof CommentJson))
        return false;
      localCommentJson = (CommentJson)paramObject;
    }
    while ((equals(this.id, localCommentJson.id)) && (equals(this.authorId, localCommentJson.authorId)) && (equals(this.authorName, localCommentJson.authorName)) && (equals(this.avatar, localCommentJson.avatar)) && (equals(this.enjoy, localCommentJson.enjoy)) && (equals(this.date, localCommentJson.date)) && (equals(this.content, localCommentJson.content)) && (equals(this.agree, localCommentJson.agree)) && (equals(this.agreeCount, localCommentJson.agreeCount)) && (equals(this.hot, localCommentJson.hot)));
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
    label200: int i12;
    if (i == 0)
    {
      if (this.id == null)
        break label272;
      j = this.id.hashCode();
      int k = j * 37;
      if (this.authorId == null)
        break label277;
      m = this.authorId.hashCode();
      int n = 37 * (m + k);
      if (this.authorName == null)
        break label283;
      i1 = this.authorName.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.avatar == null)
        break label289;
      i3 = this.avatar.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.enjoy == null)
        break label295;
      i5 = this.enjoy.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.date == null)
        break label301;
      i7 = this.date.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.content == null)
        break label307;
      i9 = this.content.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.agree == null)
        break label313;
      i11 = this.agree.hashCode();
      i12 = 37 * (i11 + i10);
      if (this.agreeCount == null)
        break label319;
    }
    label272: label277: label283: label289: label295: label301: label307: label313: label319: for (int i13 = this.agreeCount.hashCode(); ; i13 = 0)
    {
      int i14 = 37 * (i13 + i12);
      Boolean localBoolean = this.hot;
      int i15 = 0;
      if (localBoolean != null)
        i15 = this.hot.hashCode();
      i = i14 + i15;
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
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CommentJson
 * JD-Core Version:    0.6.0
 */