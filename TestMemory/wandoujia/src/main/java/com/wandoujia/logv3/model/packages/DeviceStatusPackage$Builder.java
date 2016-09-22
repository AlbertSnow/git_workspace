package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class DeviceStatusPackage$Builder extends Message.Builder<DeviceStatusPackage>
{
  public String active_app;
  public Boolean airplane_mode_on;
  public Integer battery;
  public Integer brightness;
  public String calendar_events;
  public Boolean charging;
  public String extra_msg;
  public Boolean headphone_plugged;
  public Location location;
  public String notification;
  public Boolean screen_locked;
  public String sms_record;
  public DeviceStatusPackage.TriggerType trigger_type;
  public Float velocity;
  public Boolean vibration_on;
  public Integer volume;

  public DeviceStatusPackage$Builder()
  {
  }

  public DeviceStatusPackage$Builder(DeviceStatusPackage paramDeviceStatusPackage)
  {
    super(paramDeviceStatusPackage);
    if (paramDeviceStatusPackage == null)
      return;
    this.trigger_type = paramDeviceStatusPackage.trigger_type;
    this.battery = paramDeviceStatusPackage.battery;
    this.charging = paramDeviceStatusPackage.charging;
    this.screen_locked = paramDeviceStatusPackage.screen_locked;
    this.airplane_mode_on = paramDeviceStatusPackage.airplane_mode_on;
    this.active_app = paramDeviceStatusPackage.active_app;
    this.volume = paramDeviceStatusPackage.volume;
    this.vibration_on = paramDeviceStatusPackage.vibration_on;
    this.brightness = paramDeviceStatusPackage.brightness;
    this.location = paramDeviceStatusPackage.location;
    this.headphone_plugged = paramDeviceStatusPackage.headphone_plugged;
    this.velocity = paramDeviceStatusPackage.velocity;
    this.extra_msg = paramDeviceStatusPackage.extra_msg;
    this.notification = paramDeviceStatusPackage.notification;
    this.calendar_events = paramDeviceStatusPackage.calendar_events;
    this.sms_record = paramDeviceStatusPackage.sms_record;
  }

  public final Builder active_app(String paramString)
  {
    this.active_app = paramString;
    return this;
  }

  public final Builder airplane_mode_on(Boolean paramBoolean)
  {
    this.airplane_mode_on = paramBoolean;
    return this;
  }

  public final Builder battery(Integer paramInteger)
  {
    this.battery = paramInteger;
    return this;
  }

  public final Builder brightness(Integer paramInteger)
  {
    this.brightness = paramInteger;
    return this;
  }

  public final DeviceStatusPackage build()
  {
    return new DeviceStatusPackage(this, null);
  }

  public final Builder calendar_events(String paramString)
  {
    this.calendar_events = paramString;
    return this;
  }

  public final Builder charging(Boolean paramBoolean)
  {
    this.charging = paramBoolean;
    return this;
  }

  public final Builder extra_msg(String paramString)
  {
    this.extra_msg = paramString;
    return this;
  }

  public final Builder headphone_plugged(Boolean paramBoolean)
  {
    this.headphone_plugged = paramBoolean;
    return this;
  }

  public final Builder location(Location paramLocation)
  {
    this.location = paramLocation;
    return this;
  }

  public final Builder notification(String paramString)
  {
    this.notification = paramString;
    return this;
  }

  public final Builder screen_locked(Boolean paramBoolean)
  {
    this.screen_locked = paramBoolean;
    return this;
  }

  public final Builder sms_record(String paramString)
  {
    this.sms_record = paramString;
    return this;
  }

  public final Builder trigger_type(DeviceStatusPackage.TriggerType paramTriggerType)
  {
    this.trigger_type = paramTriggerType;
    return this;
  }

  public final Builder velocity(Float paramFloat)
  {
    this.velocity = paramFloat;
    return this;
  }

  public final Builder vibration_on(Boolean paramBoolean)
  {
    this.vibration_on = paramBoolean;
    return this;
  }

  public final Builder volume(Integer paramInteger)
  {
    this.volume = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DeviceStatusPackage.Builder
 * JD-Core Version:    0.6.0
 */