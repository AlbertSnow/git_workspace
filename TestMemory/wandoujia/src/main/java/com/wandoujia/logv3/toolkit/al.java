package com.wandoujia.logv3.toolkit;

import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

public final class al
{
  public ViewLogPackage.Element a;
  public ViewLogPackage.Action b;
  public String c;
  public Long d;

  public al(ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString)
  {
    this.a = paramElement;
    this.b = paramAction;
    this.c = paramString;
  }

  public al(ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString, Long paramLong)
  {
    this.a = paramElement;
    this.b = paramAction;
    this.c = paramString;
    this.d = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.al
 * JD-Core Version:    0.6.0
 */