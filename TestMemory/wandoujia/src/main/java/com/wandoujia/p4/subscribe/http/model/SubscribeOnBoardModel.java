package com.wandoujia.p4.subscribe.http.model;

import java.io.Serializable;
import java.util.List;

public class SubscribeOnBoardModel
  implements Serializable
{
  private static final long serialVersionUID = -1474712881201165027L;
  public List<SubscribeOnBoardModel.SubscribeOnBoardPage> pages;
  public SubscribeOnBoardModel.OnBoardType type;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel
 * JD-Core Version:    0.6.0
 */