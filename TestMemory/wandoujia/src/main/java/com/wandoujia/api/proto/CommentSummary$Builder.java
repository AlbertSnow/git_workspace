package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class CommentSummary$Builder extends Message.Builder<CommentSummary>
{
  public List<CommentJson> comment;
  public Integer count;
  public EnjoySummary enjoySummary;
  public CommentJson savedComment;
  public String target;
  public UserCenterInfo user;

  public CommentSummary$Builder()
  {
  }

  public CommentSummary$Builder(CommentSummary paramCommentSummary)
  {
    super(paramCommentSummary);
    if (paramCommentSummary == null)
      return;
    this.count = paramCommentSummary.count;
    this.target = paramCommentSummary.target;
    this.savedComment = paramCommentSummary.savedComment;
    this.user = paramCommentSummary.user;
    this.comment = CommentSummary.access$000(paramCommentSummary.comment);
    this.enjoySummary = paramCommentSummary.enjoySummary;
  }

  public final CommentSummary build()
  {
    return new CommentSummary(this, null);
  }

  public final Builder comment(List<CommentJson> paramList)
  {
    this.comment = checkForNulls(paramList);
    return this;
  }

  public final Builder count(Integer paramInteger)
  {
    this.count = paramInteger;
    return this;
  }

  public final Builder enjoySummary(EnjoySummary paramEnjoySummary)
  {
    this.enjoySummary = paramEnjoySummary;
    return this;
  }

  public final Builder savedComment(CommentJson paramCommentJson)
  {
    this.savedComment = paramCommentJson;
    return this;
  }

  public final Builder target(String paramString)
  {
    this.target = paramString;
    return this;
  }

  public final Builder user(UserCenterInfo paramUserCenterInfo)
  {
    this.user = paramUserCenterInfo;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CommentSummary.Builder
 * JD-Core Version:    0.6.0
 */