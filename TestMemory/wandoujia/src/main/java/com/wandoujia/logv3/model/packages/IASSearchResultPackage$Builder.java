package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class IASSearchResultPackage$Builder extends Message.Builder<IASSearchResultPackage>
{
  public String item_id;
  public List<IASSearchResultPackage.QueryUnderstandingScore> query_understanding_result;
  public List<IASSearchResultPackage.SectionResultPackage> section_result;

  public IASSearchResultPackage$Builder()
  {
  }

  public IASSearchResultPackage$Builder(IASSearchResultPackage paramIASSearchResultPackage)
  {
    super(paramIASSearchResultPackage);
    if (paramIASSearchResultPackage == null)
      return;
    this.query_understanding_result = IASSearchResultPackage.access$000(paramIASSearchResultPackage.query_understanding_result);
    this.section_result = IASSearchResultPackage.access$100(paramIASSearchResultPackage.section_result);
    this.item_id = paramIASSearchResultPackage.item_id;
  }

  public final IASSearchResultPackage build()
  {
    return new IASSearchResultPackage(this, null);
  }

  public final Builder item_id(String paramString)
  {
    this.item_id = paramString;
    return this;
  }

  public final Builder query_understanding_result(List<IASSearchResultPackage.QueryUnderstandingScore> paramList)
  {
    this.query_understanding_result = checkForNulls(paramList);
    return this;
  }

  public final Builder section_result(List<IASSearchResultPackage.SectionResultPackage> paramList)
  {
    this.section_result = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage.Builder
 * JD-Core Version:    0.6.0
 */