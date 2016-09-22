package com.wandoujia.jupiter.search.model;

import java.io.Serializable;

public class SearchHotQueries$HotQuery
  implements Serializable
{
  private static final String TAG_NEW = "new";
  private static final long serialVersionUID = 4380968925046845019L;
  public long mtime;
  public String query;
  public String tag;
  public int weight;

  public boolean isNew()
  {
    return "new".equalsIgnoreCase(this.tag);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.model.SearchHotQueries.HotQuery
 * JD-Core Version:    0.6.0
 */