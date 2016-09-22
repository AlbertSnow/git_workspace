package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class NormalBody
  implements Serializable
{
  public static final int STYLE_GOLD = 1;
  public static final int STYLE_IRON = 0;
  public static final int STYLE_POPUP = 2;
  public static final int TYPE_KING = 1;
  public static final int TYPE_PEOPLE = 0;
  public static final int TYPE_TEST = 2;

  @a(a="description")
  private String description;

  @a(a="download")
  private Download download;

  @a(a="gold_style")
  private NormalBody.GoldStyle goldStyle;

  @a(a="icon")
  private String icon;

  @a(a="id")
  private String id;

  @a(a="intent")
  private String intent;

  @a(a="iron_style")
  private NormalBody.IronStyle ironStyle;

  @a(a="popup_style")
  private NormalBody.PopupStyle popupStyle;

  @a(a="style")
  private int style;

  @a(a="title")
  private String title;

  @a(a="type")
  private int type;

  public String getDescription()
  {
    return this.description;
  }

  public Download getDownload()
  {
    return this.download;
  }

  public NormalBody.GoldStyle getGoldStyle()
  {
    return this.goldStyle;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public String getIntent()
  {
    return this.intent;
  }

  public NormalBody.IronStyle getIronStyle()
  {
    return this.ironStyle;
  }

  public NormalBody.PopupStyle getPopupStyle()
  {
    return this.popupStyle;
  }

  public int getStyle()
  {
    return this.style;
  }

  public String getTitle()
  {
    return this.title;
  }

  public int getType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.NormalBody
 * JD-Core Version:    0.6.0
 */