package com.wandoujia.p4.app_launcher.model;

import com.wandoujia.mvc.Action;

public final class b
  implements ALBaseIconModel
{
  private ALSuggestion.FunctionInfo a;
  private Action b;
  private int c;

  public b(ALSuggestion.FunctionInfo paramFunctionInfo, int paramInt)
  {
    this.a = paramFunctionInfo;
    this.c = paramInt;
  }

  public final ALBaseIconModel.Type a()
  {
    return ALBaseIconModel.Type.Function;
  }

  public final String b()
  {
    return this.a.title;
  }

  public final Action c()
  {
    if (this.b == null)
      this.b = new com.wandoujia.p4.app_launcher.a.b(this.a);
    return this.b;
  }

  public final String d()
  {
    return this.a.icons.px256;
  }

  public final int e()
  {
    return this.c;
  }

  public final String f()
  {
    return this.a.packageName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.model.b
 * JD-Core Version:    0.6.0
 */