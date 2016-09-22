package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ExtraPackage$Builder extends Message.Builder<ExtraPackage>
{
  public AppStatusPackage app_status_package;
  public AppUsageStatPackage app_usage_stat_package;
  public CardPackage card_package;
  public ContentPackage content_package;
  public DevicePackage device_package;
  public DeviceStatusPackage device_status_package;
  public DownloadPackage download_package;
  public FeedPackage feed_package;
  public GameLauncherPackage game_launcher_package;
  public LogTrackPackage log_track_package;
  public OpenTypePackage open_type_package;
  public ResourcePackage resource_package;
  public SnaplockSettingsPackage snaplock_settings_package;
  public TimingPackage timing_package;

  public ExtraPackage$Builder()
  {
  }

  public ExtraPackage$Builder(ExtraPackage paramExtraPackage)
  {
    super(paramExtraPackage);
    if (paramExtraPackage == null)
      return;
    this.card_package = paramExtraPackage.card_package;
    this.device_package = paramExtraPackage.device_package;
    this.content_package = paramExtraPackage.content_package;
    this.feed_package = paramExtraPackage.feed_package;
    this.resource_package = paramExtraPackage.resource_package;
    this.open_type_package = paramExtraPackage.open_type_package;
    this.app_status_package = paramExtraPackage.app_status_package;
    this.download_package = paramExtraPackage.download_package;
    this.device_status_package = paramExtraPackage.device_status_package;
    this.game_launcher_package = paramExtraPackage.game_launcher_package;
    this.timing_package = paramExtraPackage.timing_package;
    this.app_usage_stat_package = paramExtraPackage.app_usage_stat_package;
    this.snaplock_settings_package = paramExtraPackage.snaplock_settings_package;
    this.log_track_package = paramExtraPackage.log_track_package;
  }

  public final Builder app_status_package(AppStatusPackage paramAppStatusPackage)
  {
    this.app_status_package = paramAppStatusPackage;
    return this;
  }

  public final Builder app_usage_stat_package(AppUsageStatPackage paramAppUsageStatPackage)
  {
    this.app_usage_stat_package = paramAppUsageStatPackage;
    return this;
  }

  public final ExtraPackage build()
  {
    return new ExtraPackage(this, null);
  }

  public final Builder card_package(CardPackage paramCardPackage)
  {
    this.card_package = paramCardPackage;
    return this;
  }

  public final Builder content_package(ContentPackage paramContentPackage)
  {
    this.content_package = paramContentPackage;
    return this;
  }

  public final Builder device_package(DevicePackage paramDevicePackage)
  {
    this.device_package = paramDevicePackage;
    return this;
  }

  public final Builder device_status_package(DeviceStatusPackage paramDeviceStatusPackage)
  {
    this.device_status_package = paramDeviceStatusPackage;
    return this;
  }

  public final Builder download_package(DownloadPackage paramDownloadPackage)
  {
    this.download_package = paramDownloadPackage;
    return this;
  }

  public final Builder feed_package(FeedPackage paramFeedPackage)
  {
    this.feed_package = paramFeedPackage;
    return this;
  }

  public final Builder game_launcher_package(GameLauncherPackage paramGameLauncherPackage)
  {
    this.game_launcher_package = paramGameLauncherPackage;
    return this;
  }

  public final Builder log_track_package(LogTrackPackage paramLogTrackPackage)
  {
    this.log_track_package = paramLogTrackPackage;
    return this;
  }

  public final Builder open_type_package(OpenTypePackage paramOpenTypePackage)
  {
    this.open_type_package = paramOpenTypePackage;
    return this;
  }

  public final Builder resource_package(ResourcePackage paramResourcePackage)
  {
    this.resource_package = paramResourcePackage;
    return this;
  }

  public final Builder snaplock_settings_package(SnaplockSettingsPackage paramSnaplockSettingsPackage)
  {
    this.snaplock_settings_package = paramSnaplockSettingsPackage;
    return this;
  }

  public final Builder timing_package(TimingPackage paramTimingPackage)
  {
    this.timing_package = paramTimingPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ExtraPackage.Builder
 * JD-Core Version:    0.6.0
 */