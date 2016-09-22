package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class QueryMetaInfoPackage$Builder extends Message.Builder<QueryMetaInfoPackage>
{
  public Integer api_version;
  public List<String> corrected_query;
  public Integer exp_id;
  public ViewLogPackage from_package;
  public Boolean is_sensitive;
  public Integer limit_size;
  public String mode;
  public String query;
  public ViewLogPackage refer_package;
  public String session_id;
  public Integer start_index;

  public QueryMetaInfoPackage$Builder()
  {
  }

  public QueryMetaInfoPackage$Builder(QueryMetaInfoPackage paramQueryMetaInfoPackage)
  {
    super(paramQueryMetaInfoPackage);
    if (paramQueryMetaInfoPackage == null)
      return;
    this.query = paramQueryMetaInfoPackage.query;
    this.session_id = paramQueryMetaInfoPackage.session_id;
    this.api_version = paramQueryMetaInfoPackage.api_version;
    this.exp_id = paramQueryMetaInfoPackage.exp_id;
    this.start_index = paramQueryMetaInfoPackage.start_index;
    this.limit_size = paramQueryMetaInfoPackage.limit_size;
    this.mode = paramQueryMetaInfoPackage.mode;
    this.from_package = paramQueryMetaInfoPackage.from_package;
    this.refer_package = paramQueryMetaInfoPackage.refer_package;
    this.corrected_query = QueryMetaInfoPackage.access$000(paramQueryMetaInfoPackage.corrected_query);
    this.is_sensitive = paramQueryMetaInfoPackage.is_sensitive;
  }

  public final Builder api_version(Integer paramInteger)
  {
    this.api_version = paramInteger;
    return this;
  }

  public final QueryMetaInfoPackage build()
  {
    checkRequiredFields();
    return new QueryMetaInfoPackage(this, null);
  }

  public final Builder corrected_query(List<String> paramList)
  {
    this.corrected_query = checkForNulls(paramList);
    return this;
  }

  public final Builder exp_id(Integer paramInteger)
  {
    this.exp_id = paramInteger;
    return this;
  }

  public final Builder from_package(ViewLogPackage paramViewLogPackage)
  {
    this.from_package = paramViewLogPackage;
    return this;
  }

  public final Builder is_sensitive(Boolean paramBoolean)
  {
    this.is_sensitive = paramBoolean;
    return this;
  }

  public final Builder limit_size(Integer paramInteger)
  {
    this.limit_size = paramInteger;
    return this;
  }

  public final Builder mode(String paramString)
  {
    this.mode = paramString;
    return this;
  }

  public final Builder query(String paramString)
  {
    this.query = paramString;
    return this;
  }

  public final Builder refer_package(ViewLogPackage paramViewLogPackage)
  {
    this.refer_package = paramViewLogPackage;
    return this;
  }

  public final Builder session_id(String paramString)
  {
    this.session_id = paramString;
    return this;
  }

  public final Builder start_index(Integer paramInteger)
  {
    this.start_index = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.QueryMetaInfoPackage.Builder
 * JD-Core Version:    0.6.0
 */