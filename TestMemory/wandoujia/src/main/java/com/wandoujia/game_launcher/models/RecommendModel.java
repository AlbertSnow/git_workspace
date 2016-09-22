package com.wandoujia.game_launcher.models;

import com.wandoujia.entities.game.GameLiteInfo;
import java.io.Serializable;
import java.util.List;

public class RecommendModel
  implements Serializable
{
  private GameLiteInfo app;
  private String date;
  private String headImage;
  private String operationTitle;
  private String packageName;
  private String recommendWording;
  private List<StoryParagraph> story;

  public GameLiteInfo getApp()
  {
    return this.app;
  }

  public String getDate()
  {
    return this.date;
  }

  public String getHeadImage()
  {
    return this.headImage;
  }

  public String getOperationTitle()
  {
    return this.operationTitle;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getRecommendWording()
  {
    return this.recommendWording;
  }

  public List<StoryParagraph> getStory()
  {
    return this.story;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.models.RecommendModel
 * JD-Core Version:    0.6.0
 */