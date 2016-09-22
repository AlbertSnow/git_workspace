package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CommentSummary extends Message
{
  public static final List<CommentJson> DEFAULT_COMMENT;
  public static final Integer DEFAULT_COUNT = Integer.valueOf(0);
  public static final String DEFAULT_TARGET = "";

  @ProtoField(label=Message.Label.REPEATED, tag=5)
  public final List<CommentJson> comment;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer count;

  @ProtoField(tag=6)
  public final EnjoySummary enjoySummary;

  @ProtoField(tag=3)
  public final CommentJson savedComment;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String target;

  @ProtoField(tag=4)
  public final UserCenterInfo user;

  static
  {
    DEFAULT_COMMENT = Collections.emptyList();
  }

  private CommentSummary(CommentSummary.Builder paramBuilder)
  {
    super(paramBuilder);
    this.count = paramBuilder.count;
    this.target = paramBuilder.target;
    this.savedComment = paramBuilder.savedComment;
    this.user = paramBuilder.user;
    this.comment = immutableCopyOf(paramBuilder.comment);
    this.enjoySummary = paramBuilder.enjoySummary;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CommentSummary localCommentSummary;
    do
    {
      return true;
      if (!(paramObject instanceof CommentSummary))
        return false;
      localCommentSummary = (CommentSummary)paramObject;
    }
    while ((equals(this.count, localCommentSummary.count)) && (equals(this.target, localCommentSummary.target)) && (equals(this.savedComment, localCommentSummary.savedComment)) && (equals(this.user, localCommentSummary.user)) && (equals(this.comment, localCommentSummary.comment)) && (equals(this.enjoySummary, localCommentSummary.enjoySummary)));
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
      if (this.count == null)
        break label170;
      j = this.count.hashCode();
      int k = j * 37;
      if (this.target == null)
        break label175;
      m = this.target.hashCode();
      int n = 37 * (m + k);
      if (this.savedComment == null)
        break label181;
      i1 = this.savedComment.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.user == null)
        break label187;
      i3 = this.user.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.comment == null)
        break label193;
    }
    label170: label175: label181: label187: label193: for (int i5 = this.comment.hashCode(); ; i5 = 1)
    {
      int i6 = 37 * (i5 + i4);
      EnjoySummary localEnjoySummary = this.enjoySummary;
      int i7 = 0;
      if (localEnjoySummary != null)
        i7 = this.enjoySummary.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.CommentSummary
 * JD-Core Version:    0.6.0
 */