package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ResourcePackage extends Message
{
  public static final String DEFAULT_APP_URI = "";
  public static final Boolean DEFAULT_CAN_DOWNLOAD;
  public static final String DEFAULT_IDENTITY = "";
  public static final String DEFAULT_PROVIDER_NAME = "";
  public static final String DEFAULT_SUB_TYPE = "";
  public static final ResourcePackage.Type DEFAULT_TYPE = ResourcePackage.Type.WDJ_HOSTED;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String app_uri;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean can_download;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String identity;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String provider_name;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String sub_type;

  @ProtoField(tag=2, type=Message.Datatype.ENUM)
  public final ResourcePackage.Type type;

  static
  {
    DEFAULT_CAN_DOWNLOAD = Boolean.valueOf(false);
  }

  private ResourcePackage(ResourcePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.type = paramBuilder.type;
    this.provider_name = paramBuilder.provider_name;
    this.app_uri = paramBuilder.app_uri;
    this.can_download = paramBuilder.can_download;
    this.sub_type = paramBuilder.sub_type;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ResourcePackage localResourcePackage;
    do
    {
      return true;
      if (!(paramObject instanceof ResourcePackage))
        return false;
      localResourcePackage = (ResourcePackage)paramObject;
    }
    while ((equals(this.identity, localResourcePackage.identity)) && (equals(this.type, localResourcePackage.type)) && (equals(this.provider_name, localResourcePackage.provider_name)) && (equals(this.app_uri, localResourcePackage.app_uri)) && (equals(this.can_download, localResourcePackage.can_download)) && (equals(this.sub_type, localResourcePackage.sub_type)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i4;
    if (i == 0)
    {
      if (this.identity == null)
        break label168;
      j = this.identity.hashCode();
      int k = j * 37;
      if (this.type == null)
        break label173;
      m = this.type.hashCode();
      int n = 37 * (m + k);
      if (this.provider_name == null)
        break label179;
      i1 = this.provider_name.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.app_uri == null)
        break label185;
      i3 = this.app_uri.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.can_download == null)
        break label191;
    }
    label168: label173: label179: label185: label191: for (int i5 = this.can_download.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      String str = this.sub_type;
      int i7 = 0;
      if (str != null)
        i7 = this.sub_type.hashCode();
      i = i6 + i7;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ResourcePackage
 * JD-Core Version:    0.6.0
 */