package com.wandoujia.launcher.launcher.models;

import java.io.Serializable;
import java.util.List;

public class LauncherSuggestions
  implements Serializable
{
  private List<LauncherSuggestionModel> case0;
  private List<LauncherSuggestionModel> case1;
  private int error;
  private String msg;
  private String recommendTitle;

  public List<LauncherSuggestionModel> getCase0()
  {
    return this.case0;
  }

  public List<LauncherSuggestionModel> getCase1()
  {
    return this.case1;
  }

  public int getError()
  {
    return this.error;
  }

  public String getMsg()
  {
    return this.msg;
  }

  public String getRecommendTitle()
  {
    return this.recommendTitle;
  }

  public void setCase0(List<LauncherSuggestionModel> paramList)
  {
    this.case0 = paramList;
  }

  public void setCase1(List<LauncherSuggestionModel> paramList)
  {
    this.case1 = paramList;
  }

  public void setError(int paramInt)
  {
    this.error = paramInt;
  }

  public void setMsg(String paramString)
  {
    this.msg = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.models.LauncherSuggestions
 * JD-Core Version:    0.6.0
 */