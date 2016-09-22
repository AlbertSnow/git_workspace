package com.wandoujia.jupiter.search.model;

import java.io.Serializable;
import java.util.List;

public class SearchHotQueries
  implements Serializable
{
  private static final long serialVersionUID = -3737227546034237620L;
  public List<BaseHotQueries.EditorQuery> editorQueries;
  public List<SearchHotQueries.VerticalHotQuery> hotQueries;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.model.SearchHotQueries
 * JD-Core Version:    0.6.0
 */