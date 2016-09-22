package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SectionCardPackage extends Message
{
  public static final String DEFAULT_SECTION_CARD_ID = "";
  public static final String DEFAULT_SECTION_EXTRA = "";
  public static final String DEFAULT_SECTION_ID = "";
  public static final Integer DEFAULT_SECTION_INDEX = Integer.valueOf(0);
  public static final String DEFAULT_SECTION_TITLE = "";

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String section_card_id;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String section_extra;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String section_id;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer section_index;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String section_title;

  private SectionCardPackage(SectionCardPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.section_id = paramBuilder.section_id;
    this.section_title = paramBuilder.section_title;
    this.section_index = paramBuilder.section_index;
    this.section_card_id = paramBuilder.section_card_id;
    this.section_extra = paramBuilder.section_extra;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SectionCardPackage localSectionCardPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SectionCardPackage))
        return false;
      localSectionCardPackage = (SectionCardPackage)paramObject;
    }
    while ((equals(this.section_id, localSectionCardPackage.section_id)) && (equals(this.section_title, localSectionCardPackage.section_title)) && (equals(this.section_index, localSectionCardPackage.section_index)) && (equals(this.section_card_id, localSectionCardPackage.section_card_id)) && (equals(this.section_extra, localSectionCardPackage.section_extra)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.section_id == null)
        break label142;
      j = this.section_id.hashCode();
      int k = j * 37;
      if (this.section_title == null)
        break label147;
      m = this.section_title.hashCode();
      int n = 37 * (m + k);
      if (this.section_index == null)
        break label153;
      i1 = this.section_index.hashCode();
      i2 = 37 * (i1 + n);
      if (this.section_card_id == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.section_card_id.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      String str = this.section_extra;
      int i5 = 0;
      if (str != null)
        i5 = this.section_extra.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SectionCardPackage
 * JD-Core Version:    0.6.0
 */