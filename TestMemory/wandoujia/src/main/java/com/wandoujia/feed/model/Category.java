package com.wandoujia.feed.model;

import java.io.Serializable;

public class Category
  implements Serializable
{
  private String label;
  private String scheme;
  private String term;

  public String getLabel()
  {
    return this.label;
  }

  public String getScheme()
  {
    return this.scheme;
  }

  public String getTerm()
  {
    return this.term;
  }

  public void setLabel(String paramString)
  {
    this.label = paramString;
  }

  public void setScheme(String paramString)
  {
    this.scheme = paramString;
  }

  public void setTerm(String paramString)
  {
    this.term = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.Category
 * JD-Core Version:    0.6.0
 */