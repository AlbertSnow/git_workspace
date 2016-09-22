package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class OpenTypePackage extends Message
{
  public static final OpenTypePackage.Mode DEFAULT_MODE;
  public static final String DEFAULT_OPEN_PROVIDER_PACKAGE_NAME = "";
  public static final OpenTypePackage.OpenType DEFAULT_TYPE = OpenTypePackage.OpenType.WDJ;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final OpenTypePackage.Mode mode;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String open_provider_package_name;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final OpenTypePackage.OpenType type;

  static
  {
    DEFAULT_MODE = OpenTypePackage.Mode.ONLINE;
  }

  private OpenTypePackage(OpenTypePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.type = paramBuilder.type;
    this.mode = paramBuilder.mode;
    this.open_provider_package_name = paramBuilder.open_provider_package_name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    OpenTypePackage localOpenTypePackage;
    do
    {
      return true;
      if (!(paramObject instanceof OpenTypePackage))
        return false;
      localOpenTypePackage = (OpenTypePackage)paramObject;
    }
    while ((equals(this.type, localOpenTypePackage.type)) && (equals(this.mode, localOpenTypePackage.mode)) && (equals(this.open_provider_package_name, localOpenTypePackage.open_provider_package_name)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.type == null)
        break label90;
      j = this.type.hashCode();
      k = j * 37;
      if (this.mode == null)
        break label95;
    }
    label90: label95: for (int m = this.mode.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.open_provider_package_name;
      int i1 = 0;
      if (str != null)
        i1 = this.open_provider_package_name.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OpenTypePackage
 * JD-Core Version:    0.6.0
 */