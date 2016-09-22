package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class DevicePackage$Builder extends Message.Builder<DevicePackage>
{
  public String android_id;
  public String brand;
  public String cpu;
  public String imei;
  public String imsi;
  public Boolean is_root;
  public String launcher_name;
  public String mac;
  public Long memory_size;
  public String model;
  public String os;
  public Integer os_bit;
  public String os_version;
  public String rom_name;
  public String rom_version;
  public String screen;
  public Long sdcard1_size;
  public Long sdcard2_size;
  public Integer sdk_int;

  public DevicePackage$Builder()
  {
  }

  public DevicePackage$Builder(DevicePackage paramDevicePackage)
  {
    super(paramDevicePackage);
    if (paramDevicePackage == null)
      return;
    this.os = paramDevicePackage.os;
    this.os_version = paramDevicePackage.os_version;
    this.sdk_int = paramDevicePackage.sdk_int;
    this.model = paramDevicePackage.model;
    this.brand = paramDevicePackage.brand;
    this.is_root = paramDevicePackage.is_root;
    this.rom_version = paramDevicePackage.rom_version;
    this.rom_name = paramDevicePackage.rom_name;
    this.launcher_name = paramDevicePackage.launcher_name;
    this.cpu = paramDevicePackage.cpu;
    this.screen = paramDevicePackage.screen;
    this.mac = paramDevicePackage.mac;
    this.imei = paramDevicePackage.imei;
    this.os_bit = paramDevicePackage.os_bit;
    this.memory_size = paramDevicePackage.memory_size;
    this.sdcard1_size = paramDevicePackage.sdcard1_size;
    this.sdcard2_size = paramDevicePackage.sdcard2_size;
    this.android_id = paramDevicePackage.android_id;
    this.imsi = paramDevicePackage.imsi;
  }

  public final Builder android_id(String paramString)
  {
    this.android_id = paramString;
    return this;
  }

  public final Builder brand(String paramString)
  {
    this.brand = paramString;
    return this;
  }

  public final DevicePackage build()
  {
    return new DevicePackage(this, null);
  }

  public final Builder cpu(String paramString)
  {
    this.cpu = paramString;
    return this;
  }

  public final Builder imei(String paramString)
  {
    this.imei = paramString;
    return this;
  }

  public final Builder imsi(String paramString)
  {
    this.imsi = paramString;
    return this;
  }

  public final Builder is_root(Boolean paramBoolean)
  {
    this.is_root = paramBoolean;
    return this;
  }

  public final Builder launcher_name(String paramString)
  {
    this.launcher_name = paramString;
    return this;
  }

  public final Builder mac(String paramString)
  {
    this.mac = paramString;
    return this;
  }

  public final Builder memory_size(Long paramLong)
  {
    this.memory_size = paramLong;
    return this;
  }

  public final Builder model(String paramString)
  {
    this.model = paramString;
    return this;
  }

  public final Builder os(String paramString)
  {
    this.os = paramString;
    return this;
  }

  public final Builder os_bit(Integer paramInteger)
  {
    this.os_bit = paramInteger;
    return this;
  }

  public final Builder os_version(String paramString)
  {
    this.os_version = paramString;
    return this;
  }

  public final Builder rom_name(String paramString)
  {
    this.rom_name = paramString;
    return this;
  }

  public final Builder rom_version(String paramString)
  {
    this.rom_version = paramString;
    return this;
  }

  public final Builder screen(String paramString)
  {
    this.screen = paramString;
    return this;
  }

  public final Builder sdcard1_size(Long paramLong)
  {
    this.sdcard1_size = paramLong;
    return this;
  }

  public final Builder sdcard2_size(Long paramLong)
  {
    this.sdcard2_size = paramLong;
    return this;
  }

  public final Builder sdk_int(Integer paramInteger)
  {
    this.sdk_int = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DevicePackage.Builder
 * JD-Core Version:    0.6.0
 */