package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SnaplockSettingsPackage$Builder extends Message.Builder<SnaplockSettingsPackage>
{
  public Boolean daily_wallpaper_state;
  public Boolean display_fahrenheit;
  public Boolean display_shortcuts_on_front_page_switch;
  public String language;
  public Boolean lockscreen_password_switcher;
  public String lockscreen_password_type;
  public Boolean lockscreen_switch;
  public Boolean lockscreen_system_password;
  public Boolean need_password_when_camera_quick_unlock;
  public Boolean notification_switch;
  public Boolean notifications_brighten_screen_switch;
  public Boolean screen_lock_sound_switch;
  public Boolean shake_when_password_unlock;
  public Boolean show_battery_percentage_switch;
  public Boolean use_24_hour_format_switch;
  public String wallpaper_source;

  public SnaplockSettingsPackage$Builder()
  {
  }

  public SnaplockSettingsPackage$Builder(SnaplockSettingsPackage paramSnaplockSettingsPackage)
  {
    super(paramSnaplockSettingsPackage);
    if (paramSnaplockSettingsPackage == null)
      return;
    this.lockscreen_switch = paramSnaplockSettingsPackage.lockscreen_switch;
    this.show_battery_percentage_switch = paramSnaplockSettingsPackage.show_battery_percentage_switch;
    this.use_24_hour_format_switch = paramSnaplockSettingsPackage.use_24_hour_format_switch;
    this.display_fahrenheit = paramSnaplockSettingsPackage.display_fahrenheit;
    this.notification_switch = paramSnaplockSettingsPackage.notification_switch;
    this.screen_lock_sound_switch = paramSnaplockSettingsPackage.screen_lock_sound_switch;
    this.display_shortcuts_on_front_page_switch = paramSnaplockSettingsPackage.display_shortcuts_on_front_page_switch;
    this.notifications_brighten_screen_switch = paramSnaplockSettingsPackage.notifications_brighten_screen_switch;
    this.wallpaper_source = paramSnaplockSettingsPackage.wallpaper_source;
    this.lockscreen_password_switcher = paramSnaplockSettingsPackage.lockscreen_password_switcher;
    this.daily_wallpaper_state = paramSnaplockSettingsPackage.daily_wallpaper_state;
    this.shake_when_password_unlock = paramSnaplockSettingsPackage.shake_when_password_unlock;
    this.need_password_when_camera_quick_unlock = paramSnaplockSettingsPackage.need_password_when_camera_quick_unlock;
    this.lockscreen_password_type = paramSnaplockSettingsPackage.lockscreen_password_type;
    this.language = paramSnaplockSettingsPackage.language;
    this.lockscreen_system_password = paramSnaplockSettingsPackage.lockscreen_system_password;
  }

  public final SnaplockSettingsPackage build()
  {
    return new SnaplockSettingsPackage(this, null);
  }

  public final Builder daily_wallpaper_state(Boolean paramBoolean)
  {
    this.daily_wallpaper_state = paramBoolean;
    return this;
  }

  public final Builder display_fahrenheit(Boolean paramBoolean)
  {
    this.display_fahrenheit = paramBoolean;
    return this;
  }

  public final Builder display_shortcuts_on_front_page_switch(Boolean paramBoolean)
  {
    this.display_shortcuts_on_front_page_switch = paramBoolean;
    return this;
  }

  public final Builder language(String paramString)
  {
    this.language = paramString;
    return this;
  }

  public final Builder lockscreen_password_switcher(Boolean paramBoolean)
  {
    this.lockscreen_password_switcher = paramBoolean;
    return this;
  }

  public final Builder lockscreen_password_type(String paramString)
  {
    this.lockscreen_password_type = paramString;
    return this;
  }

  public final Builder lockscreen_switch(Boolean paramBoolean)
  {
    this.lockscreen_switch = paramBoolean;
    return this;
  }

  public final Builder lockscreen_system_password(Boolean paramBoolean)
  {
    this.lockscreen_system_password = paramBoolean;
    return this;
  }

  public final Builder need_password_when_camera_quick_unlock(Boolean paramBoolean)
  {
    this.need_password_when_camera_quick_unlock = paramBoolean;
    return this;
  }

  public final Builder notification_switch(Boolean paramBoolean)
  {
    this.notification_switch = paramBoolean;
    return this;
  }

  public final Builder notifications_brighten_screen_switch(Boolean paramBoolean)
  {
    this.notifications_brighten_screen_switch = paramBoolean;
    return this;
  }

  public final Builder screen_lock_sound_switch(Boolean paramBoolean)
  {
    this.screen_lock_sound_switch = paramBoolean;
    return this;
  }

  public final Builder shake_when_password_unlock(Boolean paramBoolean)
  {
    this.shake_when_password_unlock = paramBoolean;
    return this;
  }

  public final Builder show_battery_percentage_switch(Boolean paramBoolean)
  {
    this.show_battery_percentage_switch = paramBoolean;
    return this;
  }

  public final Builder use_24_hour_format_switch(Boolean paramBoolean)
  {
    this.use_24_hour_format_switch = paramBoolean;
    return this;
  }

  public final Builder wallpaper_source(String paramString)
  {
    this.wallpaper_source = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SnaplockSettingsPackage.Builder
 * JD-Core Version:    0.6.0
 */