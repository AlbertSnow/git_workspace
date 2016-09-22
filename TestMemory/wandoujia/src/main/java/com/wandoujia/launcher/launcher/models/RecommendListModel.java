package com.wandoujia.launcher.launcher.models;

import java.io.Serializable;
import java.util.List;

public class RecommendListModel
  implements Serializable
{
  private List<RecommendListModel.RecommendInfoModel> list;

  public List<RecommendListModel.RecommendInfoModel> getList()
  {
    return this.list;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.models.RecommendListModel
 * JD-Core Version:    0.6.0
 */