package com.wandoujia.account.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PhoneInfo
  implements Serializable
{
  private static final long serialVersionUID = -1026639547778337137L;
  private int bottom;
  private int height;
  private String largeicon;
  private int left;
  private int right;
  private String smallicon;
  private int top;
  private int width;

  public int getBottom()
  {
    return this.bottom;
  }

  public int getHeight()
  {
    return this.height;
  }

  public String getLargeicon()
  {
    return this.largeicon;
  }

  public int getLeft()
  {
    return this.left;
  }

  public int getRight()
  {
    return this.right;
  }

  public String getSmallicon()
  {
    return this.smallicon;
  }

  public int getTop()
  {
    return this.top;
  }

  public int getWidth()
  {
    return this.width;
  }

  public void setBottom(int paramInt)
  {
    this.bottom = paramInt;
  }

  public void setHeight(int paramInt)
  {
    this.height = paramInt;
  }

  public void setLargeicon(String paramString)
  {
    this.largeicon = paramString;
  }

  public void setLeft(int paramInt)
  {
    this.left = paramInt;
  }

  public void setRight(int paramInt)
  {
    this.right = paramInt;
  }

  public void setSmallicon(String paramString)
  {
    this.smallicon = paramString;
  }

  public void setTop(int paramInt)
  {
    this.top = paramInt;
  }

  public void setWidth(int paramInt)
  {
    this.width = paramInt;
  }

  public String toString()
  {
    return "PhoneInfo [largeicon=" + this.largeicon + ", smallicon=" + this.smallicon + ", top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ", height=" + this.height + ", width=" + this.width + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.PhoneInfo
 * JD-Core Version:    0.6.0
 */