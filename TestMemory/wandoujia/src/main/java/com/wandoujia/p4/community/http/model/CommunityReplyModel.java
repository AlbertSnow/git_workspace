package com.wandoujia.p4.community.http.model;

import com.wandoujia.mvc.BaseModel;
import java.io.Serializable;
import java.util.List;

public class CommunityReplyModel
  implements BaseModel, Serializable
{
  private static final String USER_PERMISSION_DELETE = "DELETE";
  private static final long serialVersionUID = 1776824463032601936L;
  private CommunityUserModel author;
  private long createdTime;
  private List<String> curUserPermissions;
  private long groupId;
  private String id;
  private String message;
  private CommunityReplyModel parentReply;
  private CommunityImageInfo picture;
  private int sequence;
  private int status;

  public boolean currentUserCanDelete()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("DELETE"));
  }

  public CommunityUserModel getAuthor()
  {
    return this.author;
  }

  public long getCreatTime()
  {
    return this.createdTime;
  }

  public long getGroupId()
  {
    return this.groupId;
  }

  public String getId()
  {
    return this.id;
  }

  public String getMessage()
  {
    return this.message;
  }

  public CommunityReplyModel getParentReply()
  {
    return this.parentReply;
  }

  public CommunityImageInfo getPicture()
  {
    return this.picture;
  }

  public int getSequence()
  {
    return this.sequence;
  }

  public boolean isReplyDeleted()
  {
    return this.status == 0;
  }

  public void setAuthor(CommunityUserModel paramCommunityUserModel)
  {
    this.author = paramCommunityUserModel;
  }

  public void setCreatTime(long paramLong)
  {
    this.createdTime = paramLong;
  }

  public void setGroupId(long paramLong)
  {
    this.groupId = paramLong;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setMessage(String paramString)
  {
    this.message = paramString;
  }

  public void setPicture(CommunityImageInfo paramCommunityImageInfo)
  {
    this.picture = paramCommunityImageInfo;
  }

  public void setSequence(int paramInt)
  {
    this.sequence = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityReplyModel
 * JD-Core Version:    0.6.0
 */