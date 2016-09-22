package com.wandoujia.p4.app.detail.model;

import java.io.Serializable;

public class CommentJson
  implements Serializable
{
  private static final long serialVersionUID = 5703790763659287143L;
  private Boolean agree;
  private int agreeCount;
  private String authorId;
  private String authorName;
  private String avatar;
  private String content;
  private String date;
  private Boolean enjoy;
  private boolean hot;
  private Long id;

  public CommentJson()
  {
  }

  public CommentJson(Long paramLong, String paramString1, String paramString2, String paramString3, Boolean paramBoolean1, String paramString4, String paramString5, Boolean paramBoolean2, int paramInt, boolean paramBoolean)
  {
    this.id = paramLong;
    this.authorId = paramString1;
    this.authorName = paramString2;
    this.avatar = paramString3;
    this.enjoy = paramBoolean1;
    this.date = paramString4;
    this.content = paramString5;
    this.agree = paramBoolean2;
    this.agreeCount = paramInt;
    this.hot = paramBoolean;
  }

  public Boolean getAgree()
  {
    return this.agree;
  }

  public int getAgreeCount()
  {
    return this.agreeCount;
  }

  public String getAuthorId()
  {
    return this.authorId;
  }

  public String getAuthorName()
  {
    return this.authorName;
  }

  public String getAvatar()
  {
    return this.avatar;
  }

  public String getContent()
  {
    return this.content;
  }

  public String getDate()
  {
    return this.date;
  }

  public Boolean getEnjoy()
  {
    return this.enjoy;
  }

  public Long getId()
  {
    return this.id;
  }

  public boolean isHot()
  {
    return this.hot;
  }

  public void setAgree(Boolean paramBoolean)
  {
    this.agree = paramBoolean;
  }

  public void setAgreeCount(int paramInt)
  {
    this.agreeCount = paramInt;
  }

  public void setAuthorId(String paramString)
  {
    this.authorId = paramString;
  }

  public void setAuthorName(String paramString)
  {
    this.authorName = paramString;
  }

  public void setAvatar(String paramString)
  {
    this.avatar = paramString;
  }

  public void setContent(String paramString)
  {
    this.content = paramString;
  }

  public void setDate(String paramString)
  {
    this.date = paramString;
  }

  public void setEnjoy(Boolean paramBoolean)
  {
    this.enjoy = paramBoolean;
  }

  public void setHot(boolean paramBoolean)
  {
    this.hot = paramBoolean;
  }

  public void setId(Long paramLong)
  {
    this.id = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.model.CommentJson
 * JD-Core Version:    0.6.0
 */