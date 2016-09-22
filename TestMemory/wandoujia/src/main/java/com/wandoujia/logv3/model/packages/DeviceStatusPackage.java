package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class DeviceStatusPackage extends Message
{
  public static final String DEFAULT_ACTIVE_APP = "";
  public static final Boolean DEFAULT_AIRPLANE_MODE_ON;
  public static final Integer DEFAULT_BATTERY;
  public static final Integer DEFAULT_BRIGHTNESS;
  public static final String DEFAULT_CALENDAR_EVENTS = "";
  public static final Boolean DEFAULT_CHARGING;
  public static final String DEFAULT_EXTRA_MSG = "";
  public static final Boolean DEFAULT_HEADPHONE_PLUGGED;
  public static final String DEFAULT_NOTIFICATION = "";
  public static final Boolean DEFAULT_SCREEN_LOCKED;
  public static final String DEFAULT_SMS_RECORD = "";
  public static final DeviceStatusPackage.TriggerType DEFAULT_TRIGGER_TYPE = DeviceStatusPackage.TriggerType.UNKNOWN;
  public static final Float DEFAULT_VELOCITY;
  public static final Boolean DEFAULT_VIBRATION_ON;
  public static final Integer DEFAULT_VOLUME;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String active_app;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean airplane_mode_on;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer battery;

  @ProtoField(tag=9, type=Message.Datatype.INT32)
  public final Integer brightness;

  @ProtoField(tag=16, type=Message.Datatype.STRING)
  public final String calendar_events;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean charging;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String extra_msg;

  @ProtoField(tag=11, type=Message.Datatype.BOOL)
  public final Boolean headphone_plugged;

  @ProtoField(tag=10)
  public final Location location;

  @ProtoField(tag=15, type=Message.Datatype.STRING)
  public final String notification;

  @ProtoField(tag=4, type=Message.Datatype.BOOL)
  public final Boolean screen_locked;

  @ProtoField(tag=17, type=Message.Datatype.STRING)
  public final String sms_record;

  @ProtoField(tag=1, type=Message.Datatype.ENUM)
  public final DeviceStatusPackage.TriggerType trigger_type;

  @ProtoField(tag=12, type=Message.Datatype.FLOAT)
  public final Float velocity;

  @ProtoField(tag=8, type=Message.Datatype.BOOL)
  public final Boolean vibration_on;

  @ProtoField(tag=7, type=Message.Datatype.INT32)
  public final Integer volume;

  static
  {
    DEFAULT_BATTERY = Integer.valueOf(0);
    DEFAULT_CHARGING = Boolean.valueOf(false);
    DEFAULT_SCREEN_LOCKED = Boolean.valueOf(false);
    DEFAULT_AIRPLANE_MODE_ON = Boolean.valueOf(false);
    DEFAULT_VOLUME = Integer.valueOf(0);
    DEFAULT_VIBRATION_ON = Boolean.valueOf(false);
    DEFAULT_BRIGHTNESS = Integer.valueOf(0);
    DEFAULT_HEADPHONE_PLUGGED = Boolean.valueOf(false);
    DEFAULT_VELOCITY = Float.valueOf(0.0F);
  }

  private DeviceStatusPackage(DeviceStatusPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.trigger_type = paramBuilder.trigger_type;
    this.battery = paramBuilder.battery;
    this.charging = paramBuilder.charging;
    this.screen_locked = paramBuilder.screen_locked;
    this.airplane_mode_on = paramBuilder.airplane_mode_on;
    this.active_app = paramBuilder.active_app;
    this.volume = paramBuilder.volume;
    this.vibration_on = paramBuilder.vibration_on;
    this.brightness = paramBuilder.brightness;
    this.location = paramBuilder.location;
    this.headphone_plugged = paramBuilder.headphone_plugged;
    this.velocity = paramBuilder.velocity;
    this.extra_msg = paramBuilder.extra_msg;
    this.notification = paramBuilder.notification;
    this.calendar_events = paramBuilder.calendar_events;
    this.sms_record = paramBuilder.sms_record;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    DeviceStatusPackage localDeviceStatusPackage;
    do
    {
      return true;
      if (!(paramObject instanceof DeviceStatusPackage))
        return false;
      localDeviceStatusPackage = (DeviceStatusPackage)paramObject;
    }
    while ((equals(this.trigger_type, localDeviceStatusPackage.trigger_type)) && (equals(this.battery, localDeviceStatusPackage.battery)) && (equals(this.charging, localDeviceStatusPackage.charging)) && (equals(this.screen_locked, localDeviceStatusPackage.screen_locked)) && (equals(this.airplane_mode_on, localDeviceStatusPackage.airplane_mode_on)) && (equals(this.active_app, localDeviceStatusPackage.active_app)) && (equals(this.volume, localDeviceStatusPackage.volume)) && (equals(this.vibration_on, localDeviceStatusPackage.vibration_on)) && (equals(this.brightness, localDeviceStatusPackage.brightness)) && (equals(this.location, localDeviceStatusPackage.location)) && (equals(this.headphone_plugged, localDeviceStatusPackage.headphone_plugged)) && (equals(this.velocity, localDeviceStatusPackage.velocity)) && (equals(this.extra_msg, localDeviceStatusPackage.extra_msg)) && (equals(this.notification, localDeviceStatusPackage.notification)) && (equals(this.calendar_events, localDeviceStatusPackage.calendar_events)) && (equals(this.sms_record, localDeviceStatusPackage.sms_record)));
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
    label356: int i24;
    if (i == 0)
    {
      if (this.trigger_type == null)
        break label428;
      j = this.trigger_type.hashCode();
      int k = j * 37;
      if (this.battery == null)
        break label433;
      m = this.battery.hashCode();
      int n = 37 * (m + k);
      if (this.charging == null)
        break label439;
      i1 = this.charging.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.screen_locked == null)
        break label445;
      i3 = this.screen_locked.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.airplane_mode_on == null)
        break label451;
      i5 = this.airplane_mode_on.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.active_app == null)
        break label457;
      i7 = this.active_app.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.volume == null)
        break label463;
      i9 = this.volume.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.vibration_on == null)
        break label469;
      i11 = this.vibration_on.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.brightness == null)
        break label475;
      i13 = this.brightness.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.location == null)
        break label481;
      i15 = this.location.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.headphone_plugged == null)
        break label487;
      i17 = this.headphone_plugged.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.velocity == null)
        break label493;
      i19 = this.velocity.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.extra_msg == null)
        break label499;
      i21 = this.extra_msg.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.notification == null)
        break label505;
      i23 = this.notification.hashCode();
      i24 = 37 * (i23 + i22);
      if (this.calendar_events == null)
        break label511;
    }
    label428: label433: label439: label445: label451: label457: label463: label469: label475: label481: label487: label493: label499: label505: label511: for (int i25 = this.calendar_events.hashCode(); ; i25 = 0)
    {
      int i26 = 37 * (i25 + i24);
      String str = this.sms_record;
      int i27 = 0;
      if (str != null)
        i27 = this.sms_record.hashCode();
      i = i26 + i27;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DeviceStatusPackage
 * JD-Core Version:    0.6.0
 */