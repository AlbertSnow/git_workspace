package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SearchResultPackage extends Message
{
  public static final Boolean DEFAULT_ADJUSTED = Boolean.valueOf(false);
  public static final List<ContentPackage> DEFAULT_SEARCH_RESULT_PACKAGE = Collections.emptyList();

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean adjusted;

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<ContentPackage> search_result_package;

  private SearchResultPackage(SearchResultPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.adjusted = paramBuilder.adjusted;
    this.search_result_package = immutableCopyOf(paramBuilder.search_result_package);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SearchResultPackage localSearchResultPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SearchResultPackage))
        return false;
      localSearchResultPackage = (SearchResultPackage)paramObject;
    }
    while ((equals(this.adjusted, localSearchResultPackage.adjusted)) && (equals(this.search_result_package, localSearchResultPackage.search_result_package)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.adjusted == null)
        break label59;
      j = this.adjusted.hashCode();
      k = j * 37;
      if (this.search_result_package == null)
        break label64;
    }
    label59: label64: for (int m = this.search_result_package.hashCode(); ; m = 1)
    {
      i = m + k;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SearchResultPackage
 * JD-Core Version:    0.6.0
 */