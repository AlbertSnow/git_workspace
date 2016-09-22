package com.wandoujia.account.dto;

import java.io.Serializable;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonFilter;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown=true)
@org.codehaus.jackson.annotate.JsonIgnoreProperties(ignoreUnknown=true)
@JsonFilter("social_bean_filter")
public class SocialBean
  implements Serializable
{
  private static final long serialVersionUID = -439525790788960406L;
  private String accessToken;
  private String avatar;
  private Date bindTime;
  private String data;
  private String fromUid;
  private String nick;
  private Platform platform;
  private String refreshToken;
  private boolean valid = true;

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    SocialBean localSocialBean;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localSocialBean = (SocialBean)paramObject;
      if (this.fromUid == null)
      {
        if (localSocialBean.fromUid != null)
          return false;
      }
      else if (!this.fromUid.equals(localSocialBean.fromUid))
        return false;
    }
    while (this.platform == localSocialBean.platform);
    return false;
  }

  public String getAccessToken()
  {
    return this.accessToken;
  }

  public String getAvatar()
  {
    return this.avatar;
  }

  public Date getBindTime()
  {
    return this.bindTime;
  }

  public String getData()
  {
    return this.data;
  }

  public String getFromUid()
  {
    return this.fromUid;
  }

  public String getNick()
  {
    return this.nick;
  }

  public Platform getPlatform()
  {
    return this.platform;
  }

  public String getRefreshToken()
  {
    return this.refreshToken;
  }

  public int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.fromUid == null)
    {
      i = 0;
      j = 31 * (i + 31);
      Platform localPlatform = this.platform;
      k = 0;
      if (localPlatform != null)
        break label45;
    }
    while (true)
    {
      return j + k;
      i = this.fromUid.hashCode();
      break;
      label45: k = this.platform.hashCode();
    }
  }

  public boolean isValid()
  {
    return this.valid;
  }

  public void setAccessToken(String paramString)
  {
    this.accessToken = paramString;
  }

  public void setAvatar(String paramString)
  {
    this.avatar = paramString;
  }

  public void setBindTime(Date paramDate)
  {
    this.bindTime = paramDate;
  }

  public void setData(String paramString)
  {
    this.data = paramString;
  }

  public void setFromUid(String paramString)
  {
    this.fromUid = paramString;
  }

  public void setNick(String paramString)
  {
    this.nick = paramString;
  }

  public void setPlatform(Platform paramPlatform)
  {
    this.platform = paramPlatform;
  }

  public void setRefreshToken(String paramString)
  {
    this.refreshToken = paramString;
  }

  public void setValid(boolean paramBoolean)
  {
    this.valid = paramBoolean;
  }

  public String toString()
  {
    return "SocialBean [platform=" + this.platform + ", fromUid=" + this.fromUid + ", accessToken=" + this.accessToken + ", refreshTokenString=" + this.refreshToken + ", bindTime=" + this.bindTime + ", data=" + this.data + ", nick=" + this.nick + ", avatar=" + this.avatar + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.SocialBean
 * JD-Core Version:    0.6.0
 */