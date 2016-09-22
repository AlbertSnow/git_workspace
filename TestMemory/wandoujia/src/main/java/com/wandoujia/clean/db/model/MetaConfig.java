package com.wandoujia.clean.db.model;

import java.io.Serializable;
import java.util.List;

public class MetaConfig
  implements Serializable
{
  private static final long serialVersionUID = -9011912158288018621L;
  public List<GarbageContentType> contentTypes;
  public List<GarbageLabel> labels;
  public List<WhiteListBean> whiteList;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.model.MetaConfig
 * JD-Core Version:    0.6.0
 */