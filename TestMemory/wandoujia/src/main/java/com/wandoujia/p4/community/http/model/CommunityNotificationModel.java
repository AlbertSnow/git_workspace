package com.wandoujia.p4.community.http.model;

import com.wandoujia.mvc.BaseModel;
import java.io.Serializable;

public class CommunityNotificationModel
  implements BaseModel, Serializable
{
  private static final long serialVersionUID = 576225586738373194L;
  private CommunityReplyModel comment;
  private String commentType;
  private long createdTime;
  private String id;
  private String parentCommentContent;
  private String parentCommentId;
  private String parentCommentType;
  private String topic_id;

  public CommunityReplyModel getComment()
  {
    return this.comment;
  }

  public String getCommentType()
  {
    return this.commentType;
  }

  public long getCreatedTime()
  {
    return this.createdTime;
  }

  public String getId()
  {
    return this.id;
  }

  public String getParentCommentContent()
  {
    return this.parentCommentContent;
  }

  public String getParentCommentId()
  {
    return this.parentCommentId;
  }

  public String getParentCommentType()
  {
    return this.parentCommentType;
  }

  public String getTopicId()
  {
    return this.topic_id;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityNotificationModel
 * JD-Core Version:    0.6.0
 */