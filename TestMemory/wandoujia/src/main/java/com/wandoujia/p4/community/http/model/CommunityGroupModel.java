package com.wandoujia.p4.community.http.model;

import com.wandoujia.mvc.BaseModel;
import java.io.Serializable;
import java.util.List;

public class CommunityGroupModel
  implements BaseModel, Serializable
{
  private static final String STATUS_BALLOTING = "BALLOTING";
  private static final String USER_PERMISSION_ADD_TOPIC = "ADD_TOPIC";
  private static final long serialVersionUID = 5810099655435552537L;
  private List<String> aliases;
  private CommunityUserModel author;
  private int ballotCount;
  private CommunityImageInfo banner;
  private boolean curUserBalloted;
  private long curUserJoinTime;
  private List<String> curUserPermissions;
  private String curUserRole;
  private String description;
  private CommunityImageInfo icon;
  private String id;
  private String itemStatus;
  private int membersCount;
  private String slogan;
  private List<String> subjectIds;
  private String subjectType;
  private String title;
  private int todayTopicsCount;
  private int totalTopicsCount;

  public boolean currentGroupBalloting()
  {
    return (this.itemStatus != null) && ("BALLOTING".equals(this.itemStatus));
  }

  public boolean currentUserCanAddTopic()
  {
    return (this.curUserPermissions != null) && (this.curUserPermissions.contains("ADD_TOPIC"));
  }

  public CommunityUserModel getAuthor()
  {
    return this.author;
  }

  public int getBallotCount()
  {
    return this.ballotCount;
  }

  public CommunityImageInfo getBanner()
  {
    return this.banner;
  }

  public long getCurUserJoinTime()
  {
    return this.curUserJoinTime;
  }

  public List<String> getCurUserPermissions()
  {
    return this.curUserPermissions;
  }

  public String getCurUserRole()
  {
    return this.curUserRole;
  }

  public String getDescription()
  {
    return this.description;
  }

  public CommunityImageInfo getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public int getMembersCount()
  {
    return this.membersCount;
  }

  public String getSlogan()
  {
    return this.slogan;
  }

  public List<String> getSubjectIds()
  {
    return this.subjectIds;
  }

  public String getSubjectType()
  {
    return this.subjectType;
  }

  public String getTitle()
  {
    return this.title;
  }

  public int getTodayTopicCount()
  {
    return this.todayTopicsCount;
  }

  public int getTotalTopicCount()
  {
    return this.totalTopicsCount;
  }

  public boolean isCurUserBalloted()
  {
    return this.curUserBalloted;
  }

  public void setCurUserPermissions(List<String> paramList)
  {
    this.curUserPermissions = paramList;
  }

  public void setCurUserRole(String paramString)
  {
    this.curUserRole = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setMembersCount(int paramInt)
  {
    this.membersCount = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityGroupModel
 * JD-Core Version:    0.6.0
 */