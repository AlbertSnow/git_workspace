package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class HostPackage extends Message
{
  public static final String DEFAULT_APPKEYID = "";
  public static final Integer DEFAULT_HOST_VERSION_CODE = Integer.valueOf(0);
  public static final String DEFAULT_HOST_VERSION_NAME = "";
  public static final String DEFAULT_PACKAGE_NAME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String appkeyid;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer host_version_code;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String host_version_name;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String package_name;

  private HostPackage(HostPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.appkeyid = paramBuilder.appkeyid;
    this.package_name = paramBuilder.package_name;
    this.host_version_name = paramBuilder.host_version_name;
    this.host_version_code = paramBuilder.host_version_code;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    HostPackage localHostPackage;
    do
    {
      return true;
      if (!(paramObject instanceof HostPackage))
        return false;
      localHostPackage = (HostPackage)paramObject;
    }
    while ((equals(this.appkeyid, localHostPackage.appkeyid)) && (equals(this.package_name, localHostPackage.package_name)) && (equals(this.host_version_name, localHostPackage.host_version_name)) && (equals(this.host_version_code, localHostPackage.host_version_code)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.appkeyid == null)
        break label116;
      j = this.appkeyid.hashCode();
      int k = j * 37;
      if (this.package_name == null)
        break label121;
      m = this.package_name.hashCode();
      n = 37 * (m + k);
      if (this.host_version_name == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.host_version_name.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Integer localInteger = this.host_version_code;
      int i3 = 0;
      if (localInteger != null)
        i3 = this.host_version_code.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.HostPackage
 * JD-Core Version:    0.6.0
 */