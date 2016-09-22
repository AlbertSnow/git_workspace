package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class IconSet$Builder extends Message.Builder<IconSet>
{
  public String px100;
  public String px24;
  public String px256;
  public String px36;
  public String px48;
  public String px68;
  public String px78;

  public IconSet$Builder()
  {
  }

  public IconSet$Builder(IconSet paramIconSet)
  {
    super(paramIconSet);
    if (paramIconSet == null)
      return;
    this.px24 = paramIconSet.px24;
    this.px36 = paramIconSet.px36;
    this.px48 = paramIconSet.px48;
    this.px68 = paramIconSet.px68;
    this.px78 = paramIconSet.px78;
    this.px100 = paramIconSet.px100;
    this.px256 = paramIconSet.px256;
  }

  public final IconSet build()
  {
    return new IconSet(this, null);
  }

  public final Builder px100(String paramString)
  {
    this.px100 = paramString;
    return this;
  }

  public final Builder px24(String paramString)
  {
    this.px24 = paramString;
    return this;
  }

  public final Builder px256(String paramString)
  {
    this.px256 = paramString;
    return this;
  }

  public final Builder px36(String paramString)
  {
    this.px36 = paramString;
    return this;
  }

  public final Builder px48(String paramString)
  {
    this.px48 = paramString;
    return this;
  }

  public final Builder px68(String paramString)
  {
    this.px68 = paramString;
    return this;
  }

  public final Builder px78(String paramString)
  {
    this.px78 = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.IconSet.Builder
 * JD-Core Version:    0.6.0
 */