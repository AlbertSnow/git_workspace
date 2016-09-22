package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class MorphDetail$Builder extends Message.Builder<MorphDetail>
{
  public List<MorphData> elements;
  public MorphTypeEnum.MorphType morph_type;
  public String presenter;
  public String url;
  public String xml;

  public MorphDetail$Builder()
  {
  }

  public MorphDetail$Builder(MorphDetail paramMorphDetail)
  {
    super(paramMorphDetail);
    if (paramMorphDetail == null)
      return;
    this.morph_type = paramMorphDetail.morph_type;
    this.url = paramMorphDetail.url;
    this.xml = paramMorphDetail.xml;
    this.presenter = paramMorphDetail.presenter;
    this.elements = MorphDetail.access$000(paramMorphDetail.elements);
  }

  public final MorphDetail build()
  {
    return new MorphDetail(this, null);
  }

  public final Builder elements(List<MorphData> paramList)
  {
    this.elements = checkForNulls(paramList);
    return this;
  }

  public final Builder morph_type(MorphTypeEnum.MorphType paramMorphType)
  {
    this.morph_type = paramMorphType;
    return this;
  }

  public final Builder presenter(String paramString)
  {
    this.presenter = paramString;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }

  public final Builder xml(String paramString)
  {
    this.xml = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphDetail.Builder
 * JD-Core Version:    0.6.0
 */