package com.wandoujia.jupiter.search.manage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

class SearchHistoryManager$OldSearchHistory
  implements Serializable
{
  private static final long serialVersionUID = 5804017391236580607L;
  Map<String, Long> history = new HashMap();

  public Map<String, Long> getHistory()
  {
    return this.history;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.manage.SearchHistoryManager.OldSearchHistory
 * JD-Core Version:    0.6.0
 */