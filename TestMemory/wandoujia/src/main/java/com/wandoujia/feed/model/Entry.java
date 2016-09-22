package com.wandoujia.feed.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Entry
  implements Serializable
{
  private Map<String, String> attrs;
  private List<Author> author;
  private List<Category> category;
  private String entryId;
  private String feedUri;
  private String id;
  private List<Link> link;
  private String summary;
  private String title;
  private Boolean unread;
  private long updated;

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

  public String getEntryId()
  {
    return this.entryId;
  }

  public String getFeedUri()
  {
    return this.feedUri;
  }

  public String getId()
  {
    return this.id;
  }

  public List<Link> getLink()
  {
    return this.link;
  }

  public String getSummary()
  {
    return this.summary;
  }

  public String getTitle()
  {
    return this.title;
  }

  public Boolean getUnread()
  {
    return this.unread;
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

  public void setEntryId(String paramString)
  {
    this.entryId = paramString;
  }

  public void setFeedUri(String paramString)
  {
    this.feedUri = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLink(List<Link> paramList)
  {
    this.link = paramList;
  }

  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setUnread(Boolean paramBoolean)
  {
    this.unread = paramBoolean;
  }

  public void setUpdated(long paramLong)
  {
    this.updated = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.Entry
 * JD-Core Version:    0.6.0
 */