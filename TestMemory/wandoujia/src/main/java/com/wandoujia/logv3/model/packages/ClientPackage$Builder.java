package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ClientPackage$Builder extends Message.Builder<ClientPackage>
{
  public Long create_date;
  public String first_source;
  public Integer internal_version_code;
  public ClientPackage.Language language;
  public String last_source;
  public String locale;
  public ClientPackage.Platform platform;
  public ClientPackage.Product product;
  public Integer version_code;
  public String version_name;
  public String windows_source;

  public ClientPackage$Builder()
  {
  }

  public ClientPackage$Builder(ClientPackage paramClientPackage)
  {
    super(paramClientPackage);
    if (paramClientPackage == null)
      return;
    this.product = paramClientPackage.product;
    this.platform = paramClientPackage.platform;
    this.first_source = paramClientPackage.first_source;
    this.last_source = paramClientPackage.last_source;
    this.windows_source = paramClientPackage.windows_source;
    this.version_name = paramClientPackage.version_name;
    this.version_code = paramClientPackage.version_code;
    this.locale = paramClientPackage.locale;
    this.language = paramClientPackage.language;
    this.internal_version_code = paramClientPackage.internal_version_code;
    this.create_date = paramClientPackage.create_date;
  }

  public final ClientPackage build()
  {
    return new ClientPackage(this, null);
  }

  public final Builder create_date(Long paramLong)
  {
    this.create_date = paramLong;
    return this;
  }

  public final Builder first_source(String paramString)
  {
    this.first_source = paramString;
    return this;
  }

  public final Builder internal_version_code(Integer paramInteger)
  {
    this.internal_version_code = paramInteger;
    return this;
  }

  public final Builder language(ClientPackage.Language paramLanguage)
  {
    this.language = paramLanguage;
    return this;
  }

  public final Builder last_source(String paramString)
  {
    this.last_source = paramString;
    return this;
  }

  public final Builder locale(String paramString)
  {
    this.locale = paramString;
    return this;
  }

  public final Builder platform(ClientPackage.Platform paramPlatform)
  {
    this.platform = paramPlatform;
    return this;
  }

  public final Builder product(ClientPackage.Product paramProduct)
  {
    this.product = paramProduct;
    return this;
  }

  public final Builder version_code(Integer paramInteger)
  {
    this.version_code = paramInteger;
    return this;
  }

  public final Builder version_name(String paramString)
  {
    this.version_name = paramString;
    return this;
  }

  public final Builder windows_source(String paramString)
  {
    this.windows_source = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClientPackage.Builder
 * JD-Core Version:    0.6.0
 */