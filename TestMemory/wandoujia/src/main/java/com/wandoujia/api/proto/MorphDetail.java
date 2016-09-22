package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MorphDetail extends Message
{
  public static final List<MorphData> DEFAULT_ELEMENTS;
  public static final MorphTypeEnum.MorphType DEFAULT_MORPH_TYPE = MorphTypeEnum.MorphType.NOT_SUPPORT;
  public static final String DEFAULT_PRESENTER = "";
  public static final String DEFAULT_URL = "";
  public static final String DEFAULT_XML = "";

  @ProtoField(label=Message.Label.REPEATED, tag=5)
  public final List<MorphData> elements;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final MorphTypeEnum.MorphType morph_type;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String presenter;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String url;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String xml;

  static
  {
    DEFAULT_ELEMENTS = Collections.emptyList();
  }

  private MorphDetail(MorphDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.morph_type = paramBuilder.morph_type;
    this.url = paramBuilder.url;
    this.xml = paramBuilder.xml;
    this.presenter = paramBuilder.presenter;
    this.elements = immutableCopyOf(paramBuilder.elements);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MorphDetail localMorphDetail;
    do
    {
      return true;
      if (!(paramObject instanceof MorphDetail))
        return false;
      localMorphDetail = (MorphDetail)paramObject;
    }
    while ((equals(this.morph_type, localMorphDetail.morph_type)) && (equals(this.url, localMorphDetail.url)) && (equals(this.xml, localMorphDetail.xml)) && (equals(this.presenter, localMorphDetail.presenter)) && (equals(this.elements, localMorphDetail.elements)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i4;
    if (i == 0)
    {
      if (this.morph_type == null)
        break label144;
      j = this.morph_type.hashCode();
      int k = j * 37;
      if (this.url == null)
        break label149;
      m = this.url.hashCode();
      int n = 37 * (m + k);
      if (this.xml == null)
        break label155;
      i1 = this.xml.hashCode();
      int i2 = 37 * (i1 + n);
      String str = this.presenter;
      int i3 = 0;
      if (str != null)
        i3 = this.presenter.hashCode();
      i4 = 37 * (i2 + i3);
      if (this.elements == null)
        break label161;
    }
    label144: label149: label155: label161: for (int i5 = this.elements.hashCode(); ; i5 = 1)
    {
      i = i5 + i4;
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
 * Qualified Name:     com.wandoujia.api.proto.MorphDetail
 * JD-Core Version:    0.6.0
 */