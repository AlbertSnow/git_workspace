package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class GroupPackage$Builder extends Message.Builder<GroupPackage>
{
  public String id;

  public GroupPackage$Builder()
  {
  }

  public GroupPackage$Builder(GroupPackage paramGroupPackage)
  {
    super(paramGroupPackage);
    if (paramGroupPackage == null)
      return;
    this.id = paramGroupPackage.id;
  }

  public final GroupPackage build()
  {
    return new GroupPackage(this, null);
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.GroupPackage.Builder
 * JD-Core Version:    0.6.0
 */