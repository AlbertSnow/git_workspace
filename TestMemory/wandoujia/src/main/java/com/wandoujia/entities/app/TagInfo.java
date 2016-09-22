package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class TagInfo
  implements Serializable
{
  private String alias;
  private String banner;
  private String contentUrl;
  private int defaultAppCount;
  private String icon;
  private String id;
  private String intent;
  private String name;
  private List<TagInfo> subCategories;
  private Object tag;
  private String thumbnail;
  private String type;

  public String getAlias()
  {
    return this.alias;
  }

  public String getBanner()
  {
    return this.banner;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public String getIntent()
  {
    return this.intent;
  }

  public String getName()
  {
    return this.name;
  }

  public Object getTag()
  {
    return this.tag;
  }

  public String getThumbnail()
  {
    return this.thumbnail;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAlias(String paramString)
  {
    this.alias = paramString;
  }

  public void setBanner(String paramString)
  {
    this.banner = paramString;
  }

  public void setIcon(String paramString)
  {
    this.icon = paramString;
  }

  public void setIntent(String paramString)
  {
    this.intent = paramString;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }

  public void setThumbnail(String paramString)
  {
    this.thumbnail = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.TagInfo
 * JD-Core Version:    0.6.0
 */