package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ViewLogPackage$IndexPackage$Builder extends Message.Builder<ViewLogPackage.IndexPackage>
{
  public Integer index;
  public Integer sub_index;

  public ViewLogPackage$IndexPackage$Builder()
  {
  }

  public ViewLogPackage$IndexPackage$Builder(ViewLogPackage.IndexPackage paramIndexPackage)
  {
    super(paramIndexPackage);
    if (paramIndexPackage == null)
      return;
    this.index = paramIndexPackage.index;
    this.sub_index = paramIndexPackage.sub_index;
  }

  public final ViewLogPackage.IndexPackage build()
  {
    return new ViewLogPackage.IndexPackage(this, null);
  }

  public final Builder index(Integer paramInteger)
  {
    this.index = paramInteger;
    return this;
  }

  public final Builder sub_index(Integer paramInteger)
  {
    this.sub_index = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage.Builder
 * JD-Core Version:    0.6.0
 */