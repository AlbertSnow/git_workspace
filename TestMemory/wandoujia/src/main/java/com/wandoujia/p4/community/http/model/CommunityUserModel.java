package com.wandoujia.p4.community.http.model;

import android.text.TextUtils;
import java.io.Serializable;

public class CommunityUserModel
  implements Serializable
{
  private static final long serialVersionUID = 8505201518844669585L;
  private String avatar;
  private Long joinTime;
  private String nick;
  private String role;
  private Long uid;

  public String getAvatar()
  {
    return this.avatar;
  }

  public Long getJoinTime()
  {
    return this.joinTime;
  }

  public String getNick()
  {
    return this.nick;
  }

  public String getRole()
  {
    return this.role;
  }

  public Long getUid()
  {
    return this.uid;
  }

  public boolean isAdmin()
  {
    return (!TextUtils.isEmpty(this.role)) && (this.role.equals("GROUP_ADMIN"));
  }

  public boolean isOwner()
  {
    return (!TextUtils.isEmpty(this.role)) && (this.role.equals("GROUP_OWNER"));
  }

  public void setAvatar(String paramString)
  {
    this.avatar = paramString;
  }

  public void setJoinTime(Long paramLong)
  {
    this.joinTime = paramLong;
  }

  public void setNick(String paramString)
  {
    this.nick = paramString;
  }

  public void setRole(String paramString)
  {
    this.role = paramString;
  }

  public void setUid(Long paramLong)
  {
    this.uid = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityUserModel
 * JD-Core Version:    0.6.0
 */