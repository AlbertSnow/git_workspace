package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class DevicePackage extends Message
{
  public static final String DEFAULT_ANDROID_ID = "";
  public static final String DEFAULT_BRAND = "";
  public static final String DEFAULT_CPU = "";
  public static final String DEFAULT_IMEI = "";
  public static final String DEFAULT_IMSI = "";
  public static final Boolean DEFAULT_IS_ROOT;
  public static final String DEFAULT_LAUNCHER_NAME = "";
  public static final String DEFAULT_MAC = "";
  public static final Long DEFAULT_MEMORY_SIZE;
  public static final String DEFAULT_MODEL = "";
  public static final String DEFAULT_OS = "";
  public static final Integer DEFAULT_OS_BIT;
  public static final String DEFAULT_OS_VERSION = "";
  public static final String DEFAULT_ROM_NAME = "";
  public static final String DEFAULT_ROM_VERSION = "";
  public static final String DEFAULT_SCREEN = "";
  public static final Long DEFAULT_SDCARD1_SIZE;
  public static final Long DEFAULT_SDCARD2_SIZE;
  public static final Integer DEFAULT_SDK_INT = Integer.valueOf(0);

  @ProtoField(tag=18, type=Message.Datatype.STRING)
  public final String android_id;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String brand;

  @ProtoField(tag=10, type=Message.Datatype.STRING)
  public final String cpu;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String imei;

  @ProtoField(tag=19, type=Message.Datatype.STRING)
  public final String imsi;

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean is_root;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String launcher_name;

  @ProtoField(tag=12, type=Message.Datatype.STRING)
  public final String mac;

  @ProtoField(tag=15, type=Message.Datatype.INT64)
  public final Long memory_size;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String model;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String os;

  @ProtoField(tag=14, type=Message.Datatype.INT32)
  public final Integer os_bit;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String os_version;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String rom_name;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String rom_version;

  @ProtoField(tag=11, type=Message.Datatype.STRING)
  public final String screen;

  @ProtoField(tag=16, type=Message.Datatype.INT64)
  public final Long sdcard1_size;

  @ProtoField(tag=17, type=Message.Datatype.INT64)
  public final Long sdcard2_size;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer sdk_int;

  static
  {
    DEFAULT_IS_ROOT = Boolean.valueOf(false);
    DEFAULT_OS_BIT = Integer.valueOf(0);
    DEFAULT_MEMORY_SIZE = Long.valueOf(0L);
    DEFAULT_SDCARD1_SIZE = Long.valueOf(0L);
    DEFAULT_SDCARD2_SIZE = Long.valueOf(0L);
  }

  private DevicePackage(DevicePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.os = paramBuilder.os;
    this.os_version = paramBuilder.os_version;
    this.sdk_int = paramBuilder.sdk_int;
    this.model = paramBuilder.model;
    this.brand = paramBuilder.brand;
    this.is_root = paramBuilder.is_root;
    this.rom_version = paramBuilder.rom_version;
    this.rom_name = paramBuilder.rom_name;
    this.launcher_name = paramBuilder.launcher_name;
    this.cpu = paramBuilder.cpu;
    this.screen = paramBuilder.screen;
    this.mac = paramBuilder.mac;
    this.imei = paramBuilder.imei;
    this.os_bit = paramBuilder.os_bit;
    this.memory_size = paramBuilder.memory_size;
    this.sdcard1_size = paramBuilder.sdcard1_size;
    this.sdcard2_size = paramBuilder.sdcard2_size;
    this.android_id = paramBuilder.android_id;
    this.imsi = paramBuilder.imsi;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    DevicePackage localDevicePackage;
    do
    {
      return true;
      if (!(paramObject instanceof DevicePackage))
        return false;
      localDevicePackage = (DevicePackage)paramObject;
    }
    while ((equals(this.os, localDevicePackage.os)) && (equals(this.os_version, localDevicePackage.os_version)) && (equals(this.sdk_int, localDevicePackage.sdk_int)) && (equals(this.model, localDevicePackage.model)) && (equals(this.brand, localDevicePackage.brand)) && (equals(this.is_root, localDevicePackage.is_root)) && (equals(this.rom_version, localDevicePackage.rom_version)) && (equals(this.rom_name, localDevicePackage.rom_name)) && (equals(this.launcher_name, localDevicePackage.launcher_name)) && (equals(this.cpu, localDevicePackage.cpu)) && (equals(this.screen, localDevicePackage.screen)) && (equals(this.mac, localDevicePackage.mac)) && (equals(this.imei, localDevicePackage.imei)) && (equals(this.os_bit, localDevicePackage.os_bit)) && (equals(this.memory_size, localDevicePackage.memory_size)) && (equals(this.sdcard1_size, localDevicePackage.sdcard1_size)) && (equals(this.sdcard2_size, localDevicePackage.sdcard2_size)) && (equals(this.android_id, localDevicePackage.android_id)) && (equals(this.imsi, localDevicePackage.imsi)));
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
    label226: int i15;
    label252: int i17;
    label278: int i19;
    label304: int i21;
    label330: int i23;
    label356: int i25;
    label382: int i27;
    label408: int i29;
    label434: int i30;
    if (i == 0)
    {
      if (this.os == null)
        break label506;
      j = this.os.hashCode();
      int k = j * 37;
      if (this.os_version == null)
        break label511;
      m = this.os_version.hashCode();
      int n = 37 * (m + k);
      if (this.sdk_int == null)
        break label517;
      i1 = this.sdk_int.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.model == null)
        break label523;
      i3 = this.model.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.brand == null)
        break label529;
      i5 = this.brand.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.is_root == null)
        break label535;
      i7 = this.is_root.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.rom_version == null)
        break label541;
      i9 = this.rom_version.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.rom_name == null)
        break label547;
      i11 = this.rom_name.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.launcher_name == null)
        break label553;
      i13 = this.launcher_name.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.cpu == null)
        break label559;
      i15 = this.cpu.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.screen == null)
        break label565;
      i17 = this.screen.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.mac == null)
        break label571;
      i19 = this.mac.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.imei == null)
        break label577;
      i21 = this.imei.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.os_bit == null)
        break label583;
      i23 = this.os_bit.hashCode();
      int i24 = 37 * (i23 + i22);
      if (this.memory_size == null)
        break label589;
      i25 = this.memory_size.hashCode();
      int i26 = 37 * (i25 + i24);
      if (this.sdcard1_size == null)
        break label595;
      i27 = this.sdcard1_size.hashCode();
      int i28 = 37 * (i27 + i26);
      if (this.sdcard2_size == null)
        break label601;
      i29 = this.sdcard2_size.hashCode();
      i30 = 37 * (i29 + i28);
      if (this.android_id == null)
        break label607;
    }
    label517: label523: label529: label535: label541: label547: label553: label559: label565: label571: label577: label583: label589: label595: label601: label607: for (int i31 = this.android_id.hashCode(); ; i31 = 0)
    {
      int i32 = 37 * (i31 + i30);
      String str = this.imsi;
      int i33 = 0;
      if (str != null)
        i33 = this.imsi.hashCode();
      i = i32 + i33;
      this.hashCode = i;
      return i;
      label506: j = 0;
      break;
      label511: m = 0;
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
      i15 = 0;
      break label252;
      i17 = 0;
      break label278;
      i19 = 0;
      break label304;
      i21 = 0;
      break label330;
      i23 = 0;
      break label356;
      i25 = 0;
      break label382;
      i27 = 0;
      break label408;
      i29 = 0;
      break label434;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DevicePackage
 * JD-Core Version:    0.6.0
 */