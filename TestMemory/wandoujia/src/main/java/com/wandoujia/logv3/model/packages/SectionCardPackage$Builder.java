package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SectionCardPackage$Builder extends Message.Builder<SectionCardPackage>
{
  public String section_card_id;
  public String section_extra;
  public String section_id;
  public Integer section_index;
  public String section_title;

  public SectionCardPackage$Builder()
  {
  }

  public SectionCardPackage$Builder(SectionCardPackage paramSectionCardPackage)
  {
    super(paramSectionCardPackage);
    if (paramSectionCardPackage == null)
      return;
    this.section_id = paramSectionCardPackage.section_id;
    this.section_title = paramSectionCardPackage.section_title;
    this.section_index = paramSectionCardPackage.section_index;
    this.section_card_id = paramSectionCardPackage.section_card_id;
    this.section_extra = paramSectionCardPackage.section_extra;
  }

  public final SectionCardPackage build()
  {
    return new SectionCardPackage(this, null);
  }

  public final Builder section_card_id(String paramString)
  {
    this.section_card_id = paramString;
    return this;
  }

  public final Builder section_extra(String paramString)
  {
    this.section_extra = paramString;
    return this;
  }

  public final Builder section_id(String paramString)
  {
    this.section_id = paramString;
    return this;
  }

  public final Builder section_index(Integer paramInteger)
  {
    this.section_index = paramInteger;
    return this;
  }

  public final Builder section_title(String paramString)
  {
    this.section_title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SectionCardPackage.Builder
 * JD-Core Version:    0.6.0
 */