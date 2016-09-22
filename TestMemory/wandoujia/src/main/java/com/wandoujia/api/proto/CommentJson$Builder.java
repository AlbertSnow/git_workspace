package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class CommentJson$Builder extends Message.Builder<CommentJson>
{
  public Boolean agree;
  public Integer agreeCount;
  public String authorId;
  public String authorName;
  public String avatar;
  public String content;
  public String date;
  public Boolean enjoy;
  public Boolean hot;
  public Long id;

  public CommentJson$Builder()
  {
  }

  public CommentJson$Builder(CommentJson paramCommentJson)
  {
    super(paramCommentJson);
    if (paramCommentJson == null)
      return;
    this.id = paramCommentJson.id;
    this.authorId = paramCommentJson.authorId;
    this.authorName = paramCommentJson.authorName;
    this.avatar = paramCommentJson.avatar;
    this.enjoy = paramCommentJson.enjoy;
    this.date = paramCommentJson.date;
    this.content = paramCommentJson.content;
    this.agree = paramCommentJson.agree;
    this.agreeCount = paramCommentJson.agreeCount;
    this.hot = paramCommentJson.hot;
  }

  public final Builder agree(Boolean paramBoolean)
  {
    this.agree = paramBoolean;
    return this;
  }

  public final Builder agreeCount(Integer paramInteger)
  {
    this.agreeCount = paramInteger;
    return this;
  }

  public final Builder authorId(String paramString)
  {
    this.authorId = paramString;
    return this;
  }

  public final Builder authorName(String paramString)
  {
    this.authorName = paramString;
    return this;
  }

  public final Builder avatar(String paramString)
  {
    this.avatar = paramString;
    return this;
  }

  public final CommentJson build()
  {
    return new CommentJson(this, null);
  }

  public final Builder content(String paramString)
  {
    this.content = paramString;
    return this;
  }

  public final Builder date(String paramString)
  {
    this.date = paramString;
    return this;
  }

  public final Builder enjoy(Boolean paramBoolean)
  {
    this.enjoy = paramBoolean;
    return this;
  }

  public final Builder hot(Boolean paramBoolean)
  {
    this.hot = paramBoolean;
    return this;
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CommentJson.Builder
 * JD-Core Version:    0.6.0
 */