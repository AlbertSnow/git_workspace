package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ViewLogPackage$Builder extends Message.Builder<ViewLogPackage>
{
  public ViewLogPackage.Action action;
  public ViewLogPackage.Element element;
  public ViewLogPackage.IndexPackage index;
  public String module;
  public String name;
  public UrlPackage url_package;
  public Long value;

  public ViewLogPackage$Builder()
  {
  }

  public ViewLogPackage$Builder(ViewLogPackage paramViewLogPackage)
  {
    super(paramViewLogPackage);
    if (paramViewLogPackage == null)
      return;
    this.url_package = paramViewLogPackage.url_package;
    this.element = paramViewLogPackage.element;
    this.action = paramViewLogPackage.action;
    this.module = paramViewLogPackage.module;
    this.index = paramViewLogPackage.index;
    this.name = paramViewLogPackage.name;
    this.value = paramViewLogPackage.value;
  }

  public final Builder action(ViewLogPackage.Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final ViewLogPackage build()
  {
    return new ViewLogPackage(this, null);
  }

  public final Builder element(ViewLogPackage.Element paramElement)
  {
    this.element = paramElement;
    return this;
  }

  public final Builder index(ViewLogPackage.IndexPackage paramIndexPackage)
  {
    this.index = paramIndexPackage;
    return this;
  }

  public final Builder module(String paramString)
  {
    this.module = paramString;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder url_package(UrlPackage paramUrlPackage)
  {
    this.url_package = paramUrlPackage;
    return this;
  }

  public final Builder value(Long paramLong)
  {
    this.value = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage.Builder
 * JD-Core Version:    0.6.0
 */