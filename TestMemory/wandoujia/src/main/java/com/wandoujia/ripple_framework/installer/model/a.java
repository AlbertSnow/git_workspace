package com.wandoujia.ripple_framework.installer.model;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.StringUtil;
import com.wandoujia.gson.c;
import java.util.List;

public final class a
{
  private String a;
  private String b;

  public final IncompatibleAppInfo a()
  {
    return new IncompatibleAppInfo(this);
  }

  public final a a(String paramString)
  {
    List localList = (List)new c().a(paramString, new b().getType());
    if (CollectionUtils.isEmpty(localList))
    {
      this.b = paramString;
      return this;
    }
    this.b = StringUtil.join(localList, "\n");
    return this;
  }

  public final a a(List<String> paramList)
  {
    this.b = StringUtil.join(paramList, "\n");
    return this;
  }

  public final a b(String paramString)
  {
    this.a = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.model.a
 * JD-Core Version:    0.6.0
 */