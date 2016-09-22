package com.wandoujia.p4.app_launcher.model;

import java.io.Serializable;
import java.util.List;

public class ALSuggestion
  implements Serializable
{
  private static final long serialVersionUID = 6780073405482949786L;
  public List<ALAppInfo> appsElemList;
  public int expireTime;
  public List<ALSuggestion.FunctionInfo> intentElemList;
  public List<ALSuggestion.SwitcherInfo> switcherList;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.model.ALSuggestion
 * JD-Core Version:    0.6.0
 */