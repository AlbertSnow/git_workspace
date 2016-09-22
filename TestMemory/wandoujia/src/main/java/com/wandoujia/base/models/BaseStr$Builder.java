package com.wandoujia.base.models;

import com.squareup.wire.Message.Builder;

public final class BaseStr$Builder extends Message.Builder<BaseStr>
{
  public String val;

  public BaseStr$Builder()
  {
  }

  public BaseStr$Builder(BaseStr paramBaseStr)
  {
    super(paramBaseStr);
    if (paramBaseStr == null)
      return;
    this.val = paramBaseStr.val;
  }

  public final BaseStr build()
  {
    return new BaseStr(this, null);
  }

  public final Builder val(String paramString)
  {
    this.val = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseStr.Builder
 * JD-Core Version:    0.6.0
 */