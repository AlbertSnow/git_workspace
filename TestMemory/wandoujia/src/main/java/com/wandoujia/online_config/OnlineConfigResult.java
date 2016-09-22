package com.wandoujia.online_config;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class OnlineConfigResult
  implements Serializable
{
  private String alert_update_gl_interval = "";
  private String auto_install_batch_update_guide_count = "";
  private String auto_install_first_install_guide_enable = "";
  private String auto_install_package_installer_guide_enable = "";
  private String cfg_version = "";
  private String disk_clean_extreme_low_megabytes = "";
  private String disk_clean_extreme_low_percent = "";
  private String disk_clean_is_enable = "";
  private String disk_clean_low_megabytes = "";
  private String disk_clean_low_percent = "";
  private String enable_al_install_suggestion = "";
  private String enable_apk_gl = "";
  private String enable_clean_widget = "";
  private String enable_download_recommend_gl = "";
  private String enable_gl_bottom_upgrade = "";
  private String enable_gl_guide = "";
  private String enable_guess_apk_gl = "";
  private String enable_miui_special_icon = "";
  private String enable_mm_clean = "";
  private String enable_predownload_apk_gl = "";
  private String enable_redesign_al = "";
  private String enable_redesign_gl = "";
  private String enable_touchwiz_special_icon = "";
  private String enable_update_apk_gl = "";
  private String enable_update_gl_for_new_user = "";
  private String enable_upgrade_guess = "";
  private String fast_clean_apk_icon = "";
  private String fast_clean_apk_url = "";
  private String fast_clean_apk_vc = "";
  private String gift_config = "";
  private String gl_guide_action = "";
  private String gl_guide_button = "";
  private String gl_guide_game_limit = "";
  private String gl_guide_icon_source = "";
  private String gl_guide_subtitle = "";
  private String gl_guide_title = "";
  private String jupiter_dialog_not_install_count_one_day = "";
  private String jupiter_dialog_not_install_ignore_internal = "";
  private String jupiter_dialog_not_install_max_num_one_time = "";
  private String jupiter_dialog_not_install_promote_count = "";
  private String jupiter_download_https_enable = "";
  private String jupiter_notification_not_install_count_one_day = "";
  private String jupiter_notification_not_install_promote_count = "";
  private String jupiter_wifi_cooperation = "";
  private String launcher_apk_icon = "";
  private String launcher_apk_update_log = "";
  private String launcher_apk_url = "";
  private String launcher_apk_vc = "";
  private String launcher_zero_game_icon = "";
  private String mario_game_folder_boost_result_memory = "";
  private String mario_game_folder_boost_result_percent = "";
  private String mm_clean_min_duration = "";
  private String phoenix_apk_url = "";
  private String recommend_app_info = "";
  private String recommend_battery_config = "";
  private String recommend_clean_config = "";
  private String speed_up_notification_interval = "";
  private String uninstall_app_record = "";
  private String update = "";
  private String upgrade_notification_channel_white_list = "";
  private String upgrade_notification_show_hour_end = "";
  private String upgrade_notification_show_hour_start = "";
  private String upgrade_notification_show_network_disconnect_notification = "";
  private String upgrade_notification_text_config = "";
  private String xibaibai_clean_switcher = "";

  public String getUpdate()
  {
    return this.update;
  }

  public Map<String, String> toMap()
  {
    HashMap localHashMap = new HashMap();
    Field[] arrayOfField = OnlineConfigResult.class.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    while (true)
    {
      Field localField;
      if (j < i)
        localField = arrayOfField[j];
      try
      {
        localHashMap.put(localField.getName(), (String)localField.get(this));
        label53: j++;
        continue;
        return localHashMap;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label53;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label53;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.online_config.OnlineConfigResult
 * JD-Core Version:    0.6.0
 */