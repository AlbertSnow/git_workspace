package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class SearchResultPackage$Builder extends Message.Builder<SearchResultPackage>
{
  public Boolean adjusted;
  public List<ContentPackage> search_result_package;

  public SearchResultPackage$Builder()
  {
  }

  public SearchResultPackage$Builder(SearchResultPackage paramSearchResultPackage)
  {
    super(paramSearchResultPackage);
    if (paramSearchResultPackage == null)
      return;
    this.adjusted = paramSearchResultPackage.adjusted;
    this.search_result_package = SearchResultPackage.access$000(paramSearchResultPackage.search_result_package);
  }

  public final Builder adjusted(Boolean paramBoolean)
  {
    this.adjusted = paramBoolean;
    return this;
  }

  public final SearchResultPackage build()
  {
    return new SearchResultPackage(this, null);
  }

  public final Builder search_result_package(List<ContentPackage> paramList)
  {
    this.search_result_package = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SearchResultPackage.Builder
 * JD-Core Version:    0.6.0
 */