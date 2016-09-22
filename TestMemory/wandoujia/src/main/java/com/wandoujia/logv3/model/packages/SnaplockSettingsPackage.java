package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SnaplockSettingsPackage extends Message
{
  public static final Boolean DEFAULT_DAILY_WALLPAPER_STATE;
  public static final Boolean DEFAULT_DISPLAY_FAHRENHEIT;
  public static final Boolean DEFAULT_DISPLAY_SHORTCUTS_ON_FRONT_PAGE_SWITCH;
  public static final String DEFAULT_LANGUAGE = "";
  public static final Boolean DEFAULT_LOCKSCREEN_PASSWORD_SWITCHER;
  public static final String DEFAULT_LOCKSCREEN_PASSWORD_TYPE = "";
  public static final Boolean DEFAULT_LOCKSCREEN_SWITCH = Boolean.valueOf(false);
  public static final Boolean DEFAULT_LOCKSCREEN_SYSTEM_PASSWORD;
  public static final Boolean DEFAULT_NEED_PASSWORD_WHEN_CAMERA_QUICK_UNLOCK;
  public static final Boolean DEFAULT_NOTIFICATIONS_BRIGHTEN_SCREEN_SWITCH;
  public static final Boolean DEFAULT_NOTIFICATION_SWITCH;
  public static final Boolean DEFAULT_SCREEN_LOCK_SOUND_SWITCH;
  public static final Boolean DEFAULT_SHAKE_WHEN_PASSWORD_UNLOCK;
  public static final Boolean DEFAULT_SHOW_BATTERY_PERCENTAGE_SWITCH = Boolean.valueOf(false);
  public static final Boolean DEFAULT_USE_24_HOUR_FORMAT_SWITCH = Boolean.valueOf(false);
  public static final String DEFAULT_WALLPAPER_SOURCE = "";

  @ProtoField(tag=11, type=Message.Datatype.BOOL)
  public final Boolean daily_wallpaper_state;

  @ProtoField(tag=4, type=Message.Datatype.BOOL)
  public final Boolean display_fahrenheit;

  @ProtoField(tag=7, type=Message.Datatype.BOOL)
  public final Boolean display_shortcuts_on_front_page_switch;

  @ProtoField(tag=15, type=Message.Datatype.STRING)
  public final String language;

  @ProtoField(tag=10, type=Message.Datatype.BOOL)
  public final Boolean lockscreen_password_switcher;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String lockscreen_password_type;

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean lockscreen_switch;

  @ProtoField(tag=16, type=Message.Datatype.BOOL)
  public final Boolean lockscreen_system_password;

  @ProtoField(tag=13, type=Message.Datatype.BOOL)
  public final Boolean need_password_when_camera_quick_unlock;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean notification_switch;

  @ProtoField(tag=8, type=Message.Datatype.BOOL)
  public final Boolean notifications_brighten_screen_switch;

  @ProtoField(tag=6, type=Message.Datatype.BOOL)
  public final Boolean screen_lock_sound_switch;

  @ProtoField(tag=12, type=Message.Datatype.BOOL)
  public final Boolean shake_when_password_unlock;

  @ProtoField(tag=2, type=Message.Datatype.BOOL)
  public final Boolean show_battery_percentage_switch;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean use_24_hour_format_switch;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String wallpaper_source;

  static
  {
    DEFAULT_DISPLAY_FAHRENHEIT = Boolean.valueOf(false);
    DEFAULT_NOTIFICATION_SWITCH = Boolean.valueOf(false);
    DEFAULT_SCREEN_LOCK_SOUND_SWITCH = Boolean.valueOf(false);
    DEFAULT_DISPLAY_SHORTCUTS_ON_FRONT_PAGE_SWITCH = Boolean.valueOf(false);
    DEFAULT_NOTIFICATIONS_BRIGHTEN_SCREEN_SWITCH = Boolean.valueOf(false);
    DEFAULT_LOCKSCREEN_PASSWORD_SWITCHER = Boolean.valueOf(false);
    DEFAULT_DAILY_WALLPAPER_STATE = Boolean.valueOf(false);
    DEFAULT_SHAKE_WHEN_PASSWORD_UNLOCK = Boolean.valueOf(false);
    DEFAULT_NEED_PASSWORD_WHEN_CAMERA_QUICK_UNLOCK = Boolean.valueOf(false);
    DEFAULT_LOCKSCREEN_SYSTEM_PASSWORD = Boolean.valueOf(false);
  }

  private SnaplockSettingsPackage(SnaplockSettingsPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.lockscreen_switch = paramBuilder.lockscreen_switch;
    this.show_battery_percentage_switch = paramBuilder.show_battery_percentage_switch;
    this.use_24_hour_format_switch = paramBuilder.use_24_hour_format_switch;
    this.display_fahrenheit = paramBuilder.display_fahrenheit;
    this.notification_switch = paramBuilder.notification_switch;
    this.screen_lock_sound_switch = paramBuilder.screen_lock_sound_switch;
    this.display_shortcuts_on_front_page_switch = paramBuilder.display_shortcuts_on_front_page_switch;
    this.notifications_brighten_screen_switch = paramBuilder.notifications_brighten_screen_switch;
    this.wallpaper_source = paramBuilder.wallpaper_source;
    this.lockscreen_password_switcher = paramBuilder.lockscreen_password_switcher;
    this.daily_wallpaper_state = paramBuilder.daily_wallpaper_state;
    this.shake_when_password_unlock = paramBuilder.shake_when_password_unlock;
    this.need_password_when_camera_quick_unlock = paramBuilder.need_password_when_camera_quick_unlock;
    this.lockscreen_password_type = paramBuilder.lockscreen_password_type;
    this.language = paramBuilder.language;
    this.lockscreen_system_password = paramBuilder.lockscreen_system_password;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SnaplockSettingsPackage localSnaplockSettingsPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SnaplockSettingsPackage))
        return false;
      localSnaplockSettingsPackage = (SnaplockSettingsPackage)paramObject;
    }
    while ((equals(this.lockscreen_switch, localSnaplockSettingsPackage.lockscreen_switch)) && (equals(this.show_battery_percentage_switch, localSnaplockSettingsPackage.show_battery_percentage_switch)) && (equals(this.use_24_hour_format_switch, localSnaplockSettingsPackage.use_24_hour_format_switch)) && (equals(this.display_fahrenheit, localSnaplockSettingsPackage.display_fahrenheit)) && (equals(this.notification_switch, localSnaplockSettingsPackage.notification_switch)) && (equals(this.screen_lock_sound_switch, localSnaplockSettingsPackage.screen_lock_sound_switch)) && (equals(this.display_shortcuts_on_front_page_switch, localSnaplockSettingsPackage.display_shortcuts_on_front_page_switch)) && (equals(this.notifications_brighten_screen_switch, localSnaplockSettingsPackage.notifications_brighten_screen_switch)) && (equals(this.wallpaper_source, localSnaplockSettingsPackage.wallpaper_source)) && (equals(this.lockscreen_password_switcher, localSnaplockSettingsPackage.lockscreen_password_switcher)) && (equals(this.daily_wallpaper_state, localSnaplockSettingsPackage.daily_wallpaper_state)) && (equals(this.shake_when_password_unlock, localSnaplockSettingsPackage.shake_when_password_unlock)) && (equals(this.need_password_when_camera_quick_unlock, localSnaplockSettingsPackage.need_password_when_camera_quick_unlock)) && (equals(this.lockscreen_password_type, localSnaplockSettingsPackage.lockscreen_password_type)) && (equals(this.language, localSnaplockSettingsPackage.language)) && (equals(this.lockscreen_system_password, localSnaplockSettingsPackage.lockscreen_system_password)));
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
      if (this.lockscreen_switch == null)
        break label428;
      j = this.lockscreen_switch.hashCode();
      int k = j * 37;
      if (this.show_battery_percentage_switch == null)
        break label433;
      m = this.show_battery_percentage_switch.hashCode();
      int n = 37 * (m + k);
      if (this.use_24_hour_format_switch == null)
        break label439;
      i1 = this.use_24_hour_format_switch.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.display_fahrenheit == null)
        break label445;
      i3 = this.display_fahrenheit.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.notification_switch == null)
        break label451;
      i5 = this.notification_switch.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.screen_lock_sound_switch == null)
        break label457;
      i7 = this.screen_lock_sound_switch.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.display_shortcuts_on_front_page_switch == null)
        break label463;
      i9 = this.display_shortcuts_on_front_page_switch.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.notifications_brighten_screen_switch == null)
        break label469;
      i11 = this.notifications_brighten_screen_switch.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.wallpaper_source == null)
        break label475;
      i13 = this.wallpaper_source.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.lockscreen_password_switcher == null)
        break label481;
      i15 = this.lockscreen_password_switcher.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.daily_wallpaper_state == null)
        break label487;
      i17 = this.daily_wallpaper_state.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.shake_when_password_unlock == null)
        break label493;
      i19 = this.shake_when_password_unlock.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.need_password_when_camera_quick_unlock == null)
        break label499;
      i21 = this.need_password_when_camera_quick_unlock.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.lockscreen_password_type == null)
        break label505;
      i23 = this.lockscreen_password_type.hashCode();
      i24 = 37 * (i23 + i22);
      if (this.language == null)
        break label511;
    }
    label428: label433: label439: label445: label451: label457: label463: label469: label475: label481: label487: label493: label499: label505: label511: for (int i25 = this.language.hashCode(); ; i25 = 0)
    {
      int i26 = 37 * (i25 + i24);
      Boolean localBoolean = this.lockscreen_system_password;
      int i27 = 0;
      if (localBoolean != null)
        i27 = this.lockscreen_system_password.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.SnaplockSettingsPackage
 * JD-Core Version:    0.6.0
 */