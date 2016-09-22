package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ClientPackage extends Message
{
  public static final Long DEFAULT_CREATE_DATE;
  public static final String DEFAULT_FIRST_SOURCE = "";
  public static final Integer DEFAULT_INTERNAL_VERSION_CODE;
  public static final ClientPackage.Language DEFAULT_LANGUAGE;
  public static final String DEFAULT_LAST_SOURCE = "";
  public static final String DEFAULT_LOCALE = "";
  public static final ClientPackage.Platform DEFAULT_PLATFORM;
  public static final ClientPackage.Product DEFAULT_PRODUCT = ClientPackage.Product.WINDOWS;
  public static final Integer DEFAULT_VERSION_CODE;
  public static final String DEFAULT_VERSION_NAME = "";
  public static final String DEFAULT_WINDOWS_SOURCE = "";

  @ProtoField(tag=11, type=Message.Datatype.INT64)
  public final Long create_date;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String first_source;

  @ProtoField(tag=10, type=Message.Datatype.INT32)
  public final Integer internal_version_code;

  @ProtoField(tag=9, type=Message.Datatype.ENUM)
  public final ClientPackage.Language language;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String last_source;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String locale;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final ClientPackage.Platform platform;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final ClientPackage.Product product;

  @ProtoField(tag=7, type=Message.Datatype.INT32)
  public final Integer version_code;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String version_name;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String windows_source;

  static
  {
    DEFAULT_PLATFORM = ClientPackage.Platform.ANDROID_PHONE;
    DEFAULT_VERSION_CODE = Integer.valueOf(0);
    DEFAULT_LANGUAGE = ClientPackage.Language.SIMPLE_CHINESE;
    DEFAULT_INTERNAL_VERSION_CODE = Integer.valueOf(0);
    DEFAULT_CREATE_DATE = Long.valueOf(0L);
  }

  private ClientPackage(ClientPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.product = paramBuilder.product;
    this.platform = paramBuilder.platform;
    this.first_source = paramBuilder.first_source;
    this.last_source = paramBuilder.last_source;
    this.windows_source = paramBuilder.windows_source;
    this.version_name = paramBuilder.version_name;
    this.version_code = paramBuilder.version_code;
    this.locale = paramBuilder.locale;
    this.language = paramBuilder.language;
    this.internal_version_code = paramBuilder.internal_version_code;
    this.create_date = paramBuilder.create_date;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ClientPackage localClientPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ClientPackage))
        return false;
      localClientPackage = (ClientPackage)paramObject;
    }
    while ((equals(this.product, localClientPackage.product)) && (equals(this.platform, localClientPackage.platform)) && (equals(this.first_source, localClientPackage.first_source)) && (equals(this.last_source, localClientPackage.last_source)) && (equals(this.windows_source, localClientPackage.windows_source)) && (equals(this.version_name, localClientPackage.version_name)) && (equals(this.version_code, localClientPackage.version_code)) && (equals(this.locale, localClientPackage.locale)) && (equals(this.language, localClientPackage.language)) && (equals(this.internal_version_code, localClientPackage.internal_version_code)) && (equals(this.create_date, localClientPackage.create_date)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i7;
    label148: int i9;
    label174: int i11;
    label200: int i13;
    label226: int i14;
    if (i == 0)
    {
      if (this.product == null)
        break label298;
      j = this.product.hashCode();
      int k = j * 37;
      if (this.platform == null)
        break label303;
      m = this.platform.hashCode();
      int n = 37 * (m + k);
      if (this.first_source == null)
        break label309;
      i1 = this.first_source.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.last_source == null)
        break label315;
      i3 = this.last_source.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.windows_source == null)
        break label321;
      i5 = this.windows_source.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.version_name == null)
        break label327;
      i7 = this.version_name.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.version_code == null)
        break label333;
      i9 = this.version_code.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.locale == null)
        break label339;
      i11 = this.locale.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.language == null)
        break label345;
      i13 = this.language.hashCode();
      i14 = 37 * (i13 + i12);
      if (this.internal_version_code == null)
        break label351;
    }
    label298: label303: label309: label315: label321: label327: label333: label339: label345: label351: for (int i15 = this.internal_version_code.hashCode(); ; i15 = 0)
    {
      int i16 = 37 * (i15 + i14);
      Long localLong = this.create_date;
      int i17 = 0;
      if (localLong != null)
        i17 = this.create_date.hashCode();
      i = i16 + i17;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
      i13 = 0;
      break label226;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClientPackage
 * JD-Core Version:    0.6.0
 */