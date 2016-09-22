package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class IASSearchResultPackage$SectionResultPackage extends Message
{
  public static final Integer DEFAULT_ITEM_NUM = Integer.valueOf(0);
  public static final String DEFAULT_SECTION_TYPE = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer item_num;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String section_type;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  private IASSearchResultPackage$SectionResultPackage(IASSearchResultPackage.SectionResultPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.section_type = paramBuilder.section_type;
    this.title = paramBuilder.title;
    this.item_num = paramBuilder.item_num;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SectionResultPackage localSectionResultPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SectionResultPackage))
        return false;
      localSectionResultPackage = (SectionResultPackage)paramObject;
    }
    while ((equals(this.section_type, localSectionResultPackage.section_type)) && (equals(this.title, localSectionResultPackage.title)) && (equals(this.item_num, localSectionResultPackage.item_num)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.section_type == null)
        break label90;
      j = this.section_type.hashCode();
      k = j * 37;
      if (this.title == null)
        break label95;
    }
    label90: label95: for (int m = this.title.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Integer localInteger = this.item_num;
      int i1 = 0;
      if (localInteger != null)
        i1 = this.item_num.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage.SectionResultPackage
 * JD-Core Version:    0.6.0
 */