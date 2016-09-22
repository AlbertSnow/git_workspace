package com.wandoujia.clean.db.model;

import java.io.Serializable;

public class WhiteListBean
  implements Serializable
{
  public static final int TYPE_APK_FOLDER = 2;
  private static final long serialVersionUID = -7440134723082220175L;
  public String filePath;
  public int type;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.model.WhiteListBean
 * JD-Core Version:    0.6.0
 */