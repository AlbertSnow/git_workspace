package com.wandoujia.feed.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Feed
  implements Serializable
{
  public static final int FLAG_ALL_READ = 1;
  public static final int FLAG_ALL_READ_FOR_NEW_USER = 8;
  public static final int FLAG_NOT_NOTIFY_UNREAD = 2;
  public static final int FLAG_UNREAD_FOR_NEW_ENTRIES = 4;
  private Map<String, String> attrs;
  private List<Author> author;
  private List<Category> category;
  private int configure;
  private List<Entry> entry;
  private String id;
  private List<Link> link;
  private String logo;
  private Boolean subscribed;
  private String subtitle;
  private String title;
  private long updated;

  public void clearEntry()
  {
    if (this.entry != null)
      this.entry.clear();
  }

  public String getAttr(String paramString)
  {
    if (this.attrs == null)
      return null;
    return (String)this.attrs.get(paramString);
  }

  public Map<String, String> getAttrs()
  {
    return this.attrs;
  }

  public List<Author> getAuthor()
  {
    return this.author;
  }

  public List<Category> getCategory()
  {
    return this.category;
  }

  public int getConfigure()
  {
    return this.configure;
  }

  public List<Entry> getEntry()
  {
    return this.entry;
  }

  public String getId()
  {
    return this.id;
  }

  public List<Link> getLink()
  {
    return this.link;
  }

  public String getLogo()
  {
    return this.logo;
  }

  public Boolean getSubscribed()
  {
    return this.subscribed;
  }

  public String getSubtitle()
  {
    return this.subtitle;
  }

  public String getTitle()
  {
    return this.title;
  }

  public long getUpdated()
  {
    return this.updated;
  }

  public void setAttrs(Map<String, String> paramMap)
  {
    this.attrs = paramMap;
  }

  public void setAuthor(List<Author> paramList)
  {
    this.author = paramList;
  }

  public void setCategory(List<Category> paramList)
  {
    this.category = paramList;
  }

  public void setConfigure(int paramInt)
  {
    this.configure = paramInt;
  }

  public void setEntry(List<Entry> paramList)
  {
    this.entry = paramList;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLink(List<Link> paramList)
  {
    this.link = paramList;
  }

  public void setLogo(String paramString)
  {
    this.logo = paramString;
  }

  public void setSubscribed(Boolean paramBoolean)
  {
    this.subscribed = paramBoolean;
  }

  public void setSubtitle(String paramString)
  {
    this.subtitle = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setUpdated(long paramLong)
  {
    this.updated = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.Feed
 * JD-Core Version:    0.6.0
 */