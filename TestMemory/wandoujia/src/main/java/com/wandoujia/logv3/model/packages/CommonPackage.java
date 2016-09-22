package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class CommonPackage extends Message
{

  @ProtoField(tag=5)
  public final AccountPackage account_package;

  @ProtoField(label=Message.Label.REQUIRED, tag=2)
  public final ClientPackage client_package;

  @ProtoField(tag=7)
  public final HostPackage host_package;

  @ProtoField(label=Message.Label.REQUIRED, tag=1)
  public final IdPackage id_package;

  @ProtoField(tag=6)
  public final LaunchSourcePackage launch_source_package;

  @ProtoField(tag=4)
  public final NetworkPackage network_package;

  @ProtoField(label=Message.Label.REQUIRED, tag=3)
  public final TimePackage time_package;

  private CommonPackage(CommonPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id_package = paramBuilder.id_package;
    this.client_package = paramBuilder.client_package;
    this.time_package = paramBuilder.time_package;
    this.network_package = paramBuilder.network_package;
    this.account_package = paramBuilder.account_package;
    this.launch_source_package = paramBuilder.launch_source_package;
    this.host_package = paramBuilder.host_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CommonPackage localCommonPackage;
    do
    {
      return true;
      if (!(paramObject instanceof CommonPackage))
        return false;
      localCommonPackage = (CommonPackage)paramObject;
    }
    while ((equals(this.id_package, localCommonPackage.id_package)) && (equals(this.client_package, localCommonPackage.client_package)) && (equals(this.time_package, localCommonPackage.time_package)) && (equals(this.network_package, localCommonPackage.network_package)) && (equals(this.account_package, localCommonPackage.account_package)) && (equals(this.launch_source_package, localCommonPackage.launch_source_package)) && (equals(this.host_package, localCommonPackage.host_package)));
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
    label122: int i6;
    if (i == 0)
    {
      if (this.id_package == null)
        break label194;
      j = this.id_package.hashCode();
      int k = j * 37;
      if (this.client_package == null)
        break label199;
      m = this.client_package.hashCode();
      int n = 37 * (m + k);
      if (this.time_package == null)
        break label205;
      i1 = this.time_package.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.network_package == null)
        break label211;
      i3 = this.network_package.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.account_package == null)
        break label217;
      i5 = this.account_package.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.launch_source_package == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.launch_source_package.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      HostPackage localHostPackage = this.host_package;
      int i9 = 0;
      if (localHostPackage != null)
        i9 = this.host_package.hashCode();
      i = i8 + i9;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.CommonPackage
 * JD-Core Version:    0.6.0
 */