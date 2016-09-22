package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class IASSearchResultPackage$SectionResultPackage$Builder extends Message.Builder<IASSearchResultPackage.SectionResultPackage>
{
  public Integer item_num;
  public String section_type;
  public String title;

  public IASSearchResultPackage$SectionResultPackage$Builder()
  {
  }

  public IASSearchResultPackage$SectionResultPackage$Builder(IASSearchResultPackage.SectionResultPackage paramSectionResultPackage)
  {
    super(paramSectionResultPackage);
    if (paramSectionResultPackage == null)
      return;
    this.section_type = paramSectionResultPackage.section_type;
    this.title = paramSectionResultPackage.title;
    this.item_num = paramSectionResultPackage.item_num;
  }

  public final IASSearchResultPackage.SectionResultPackage build()
  {
    return new IASSearchResultPackage.SectionResultPackage(this, null);
  }

  public final Builder item_num(Integer paramInteger)
  {
    this.item_num = paramInteger;
    return this;
  }

  public final Builder section_type(String paramString)
  {
    this.section_type = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage.SectionResultPackage.Builder
 * JD-Core Version:    0.6.0
 */