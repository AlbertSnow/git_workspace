package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AppStatusPackage extends Message
{
  public static final Integer DEFAULT_APP_VERSION_CODE;
  public static final String DEFAULT_APP_VERSION_NAME = "";
  public static final Boolean DEFAULT_IS_INSTALLED;
  public static final Boolean DEFAULT_IS_PREDOWNLOAD = Boolean.valueOf(false);
  public static final AppStatusPackage.Pattern DEFAULT_PATTERN;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer app_version_code;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String app_version_name;

  @ProtoField(tag=2, type=Message.Datatype.BOOL)
  public final Boolean is_installed;

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean is_predownload;

  @ProtoField(tag=5, type=Message.Datatype.ENUM)
  public final AppStatusPackage.Pattern pattern;

  static
  {
    DEFAULT_IS_INSTALLED = Boolean.valueOf(false);
    DEFAULT_APP_VERSION_CODE = Integer.valueOf(0);
    DEFAULT_PATTERN = AppStatusPackage.Pattern.AUTO;
  }

  private AppStatusPackage(AppStatusPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.is_predownload = paramBuilder.is_predownload;
    this.is_installed = paramBuilder.is_installed;
    this.app_version_name = paramBuilder.app_version_name;
    this.app_version_code = paramBuilder.app_version_code;
    this.pattern = paramBuilder.pattern;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppStatusPackage localAppStatusPackage;
    do
    {
      return true;
      if (!(paramObject instanceof AppStatusPackage))
        return false;
      localAppStatusPackage = (AppStatusPackage)paramObject;
    }
    while ((equals(this.is_predownload, localAppStatusPackage.is_predownload)) && (equals(this.is_installed, localAppStatusPackage.is_installed)) && (equals(this.app_version_name, localAppStatusPackage.app_version_name)) && (equals(this.app_version_code, localAppStatusPackage.app_version_code)) && (equals(this.pattern, localAppStatusPackage.pattern)));
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
      if (this.is_predownload == null)
        break label142;
      j = this.is_predownload.hashCode();
      int k = j * 37;
      if (this.is_installed == null)
        break label147;
      m = this.is_installed.hashCode();
      int n = 37 * (m + k);
      if (this.app_version_name == null)
        break label153;
      i1 = this.app_version_name.hashCode();
      i2 = 37 * (i1 + n);
      if (this.app_version_code == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.app_version_code.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      AppStatusPackage.Pattern localPattern = this.pattern;
      int i5 = 0;
      if (localPattern != null)
        i5 = this.pattern.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.AppStatusPackage
 * JD-Core Version:    0.6.0
 */