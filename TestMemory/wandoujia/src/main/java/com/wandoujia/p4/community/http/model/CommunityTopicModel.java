package com.wandoujia.p4.community.http.model;

import com.wandoujia.mvc.BaseModel;
import java.io.Serializable;
import java.util.List;

public class CommunityTopicModel
  implements BaseModel, Serializable
{
  private static final String USER_PERMISSION_ADD_BLACKUSER = "ADD_GROUP_BLACKUSER";
  private static final String USER_PERMISSION_ADD_REPLY = "ADD_REPLY";
  private static final String USER_PERMISSION_DELETE = "DELETE";
  private static final String USER_PERMISSION_FEATURE = "FEATURE";
  private static final String USER_PERMISSION_STICK = "STICK";
  private static final String USER_PERMISSION_VOTE = "VOTE";
  private static final long serialVersionUID = -4867357341783078898L;
  private CommunityUserModel author;
  private long createdTime;
  private List<String> curUserPermissions;
  private CommunityGroupModel group;
  private String id;
  private boolean isCurUserLiked;
  private boolean isFeatured;
  private boolean isSticky;
  private int likesCount;
  private String message;
  private List<CommunityImageInfo> pictures;
  private int repliesCount;
  private long updatedTime;

  public boolean currentUserCanAddBlackUser()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("ADD_GROUP_BLACKUSER"));
  }

  public boolean currentUserCanAddReply()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("ADD_REPLY"));
  }

  public boolean currentUserCanDelete()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("DELETE"));
  }

  public boolean currentUserCanFeature()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("FEATURE"));
  }

  public boolean currentUserCanStick()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("STICK"));
  }

  public boolean currentUserCanVote()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("VOTE"));
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof CommunityTopicModel)));
    CommunityTopicModel localCommunityTopicModel;
    do
    {
      return false;
      localCommunityTopicModel = (CommunityTopicModel)paramObject;
    }
    while ((localCommunityTopicModel == null) || (!this.id.equals(localCommunityTopicModel.getId())));
    return true;
  }

  public CommunityUserModel getAuthor()
  {
    return this.author;
  }

  public long getCreatedTime()
  {
    return this.createdTime;
  }

  public List<String> getCurUserPermissions()
  {
    return this.curUserPermissions;
  }

  public CommunityGroupModel getGroup()
  {
    return this.group;
  }

  public String getId()
  {
    return this.id;
  }

  public int getLikesCount()
  {
    return this.likesCount;
  }

  public String getMessage()
  {
    return this.message;
  }

  public List<CommunityImageInfo> getPictures()
  {
    return this.pictures;
  }

  public int getRepliesCount()
  {
    return this.repliesCount;
  }

  public long getUpdatedTime()
  {
    return this.updatedTime;
  }

  public boolean isCurUserLiked()
  {
    return this.isCurUserLiked;
  }

  public boolean isFeatured()
  {
    return this.isFeatured;
  }

  public boolean isSticky()
  {
    return this.isSticky;
  }

  public void setCurUserLiked(boolean paramBoolean)
  {
    this.isCurUserLiked = paramBoolean;
  }

  public void setCurUserPermissions(List<String> paramList)
  {
    this.curUserPermissions = paramList;
  }

  public void setData(CommunityTopicModel paramCommunityTopicModel)
  {
    this.author = paramCommunityTopicModel.author;
    this.createdTime = paramCommunityTopicModel.createdTime;
    this.isCurUserLiked = paramCommunityTopicModel.isCurUserLiked;
    this.group = paramCommunityTopicModel.group;
    this.likesCount = paramCommunityTopicModel.likesCount;
    this.message = paramCommunityTopicModel.getMessage();
    this.pictures = paramCommunityTopicModel.pictures;
    this.repliesCount = paramCommunityTopicModel.repliesCount;
    this.updatedTime = paramCommunityTopicModel.updatedTime;
    this.curUserPermissions = paramCommunityTopicModel.curUserPermissions;
  }

  public void setGroup(CommunityGroupModel paramCommunityGroupModel)
  {
    this.group = paramCommunityGroupModel;
  }

  public void setLikesCount(int paramInt)
  {
    this.likesCount = paramInt;
  }

  public void setRepliesCount(int paramInt)
  {
    this.repliesCount = paramInt;
  }

  public void setSticky(boolean paramBoolean)
  {
    this.isSticky = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityTopicModel
 * JD-Core Version:    0.6.0
 */