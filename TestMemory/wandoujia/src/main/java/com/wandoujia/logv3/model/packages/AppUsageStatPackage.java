package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class AppUsageStatPackage extends Message
{
  public static final Long DEFAULT_END_TIME;
  public static final Integer DEFAULT_IS_SYSTEM;
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final Integer DEFAULT_SAMPLE_FREQUENCY;
  public static final Long DEFAULT_START_TIME;
  public static final Integer DEFAULT_VERSION_CODE = Integer.valueOf(0);
  public static final String DEFAULT_VERSION_NAME = "";

  @ProtoField(label=Message.Label.REQUIRED, tag=7, type=Message.Datatype.INT64)
  public final Long end_time;

  @ProtoField(label=Message.Label.REQUIRED, tag=4, type=Message.Datatype.INT32)
  public final Integer is_system;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String package_name;

  @ProtoField(label=Message.Label.REQUIRED, tag=5, type=Message.Datatype.INT32)
  public final Integer sample_frequency;

  @ProtoField(label=Message.Label.REQUIRED, tag=6, type=Message.Datatype.INT64)
  public final Long start_time;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT32)
  public final Integer version_code;

  @ProtoField(label=Message.Label.REQUIRED, tag=3, type=Message.Datatype.STRING)
  public final String version_name;

  static
  {
    DEFAULT_IS_SYSTEM = Integer.valueOf(0);
    DEFAULT_SAMPLE_FREQUENCY = Integer.valueOf(0);
    DEFAULT_START_TIME = Long.valueOf(0L);
    DEFAULT_END_TIME = Long.valueOf(0L);
  }

  private AppUsageStatPackage(AppUsageStatPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.package_name = paramBuilder.package_name;
    this.version_code = paramBuilder.version_code;
    this.version_name = paramBuilder.version_name;
    this.is_system = paramBuilder.is_system;
    this.sample_frequency = paramBuilder.sample_frequency;
    this.start_time = paramBuilder.start_time;
    this.end_time = paramBuilder.end_time;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppUsageStatPackage localAppUsageStatPackage;
    do
    {
      return true;
      if (!(paramObject instanceof AppUsageStatPackage))
        return false;
      localAppUsageStatPackage = (AppUsageStatPackage)paramObject;
    }
    while ((equals(this.package_name, localAppUsageStatPackage.package_name)) && (equals(this.version_code, localAppUsageStatPackage.version_code)) && (equals(this.version_name, localAppUsageStatPackage.version_name)) && (equals(this.is_system, localAppUsageStatPackage.is_system)) && (equals(this.sample_frequency, localAppUsageStatPackage.sample_frequency)) && (equals(this.start_time, localAppUsageStatPackage.start_time)) && (equals(this.end_time, localAppUsageStatPackage.end_time)));
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
      if (this.package_name == null)
        break label194;
      j = this.package_name.hashCode();
      int k = j * 37;
      if (this.version_code == null)
        break label199;
      m = this.version_code.hashCode();
      int n = 37 * (m + k);
      if (this.version_name == null)
        break label205;
      i1 = this.version_name.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.is_system == null)
        break label211;
      i3 = this.is_system.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.sample_frequency == null)
        break label217;
      i5 = this.sample_frequency.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.start_time == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.start_time.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      Long localLong = this.end_time;
      int i9 = 0;
      if (localLong != null)
        i9 = this.end_time.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.AppUsageStatPackage
 * JD-Core Version:    0.6.0
 */