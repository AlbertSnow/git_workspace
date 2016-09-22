package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.Date;

public class AppOperatorRemark
  implements Serializable
{
  private String backgroundImage;
  private String commentContent;
  private String commentatorImage;
  private String commentatorName;
  private String editorName;
  private Long editorUid = Long.valueOf(-1L);
  private Integer id;
  private String packageName;
  private Date updateDate;
  private boolean useComment = true;

  public String getBackgroundImage()
  {
    return this.backgroundImage;
  }

  public Integer getId()
  {
    return this.id;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public void setBackgroundImage(String paramString)
  {
    this.backgroundImage = paramString;
  }

  public void setId(Integer paramInteger)
  {
    this.id = paramInteger;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public String toString()
  {
    return "AppCommentDetail {commentDetail='" + this.commentContent + '\'' + " commentatorImage='" + this.commentatorImage + '\'' + ", commentatorName='" + this.commentatorName + '\'' + ", useComment='" + this.useComment + '\'' + ", backgroundImage='" + this.backgroundImage + '\'' + ", updateDate='" + this.updateDate + '\'' + ", editorName='" + this.editorName + '\'' + ", editorUid=" + String.valueOf(this.editorUid) + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.AppOperatorRemark
 * JD-Core Version:    0.6.0
 */