package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExtraPackage extends Message
{

  @ProtoField(tag=7)
  public final AppStatusPackage app_status_package;

  @ProtoField(tag=12)
  public final AppUsageStatPackage app_usage_stat_package;

  @ProtoField(tag=1)
  public final CardPackage card_package;

  @ProtoField(tag=3)
  public final ContentPackage content_package;

  @ProtoField(tag=2)
  public final DevicePackage device_package;

  @ProtoField(tag=9)
  public final DeviceStatusPackage device_status_package;

  @ProtoField(tag=8)
  public final DownloadPackage download_package;

  @ProtoField(tag=4)
  public final FeedPackage feed_package;

  @ProtoField(tag=10)
  public final GameLauncherPackage game_launcher_package;

  @ProtoField(tag=14)
  public final LogTrackPackage log_track_package;

  @ProtoField(tag=6)
  public final OpenTypePackage open_type_package;

  @ProtoField(tag=5)
  public final ResourcePackage resource_package;

  @ProtoField(tag=13)
  public final SnaplockSettingsPackage snaplock_settings_package;

  @ProtoField(tag=11)
  public final TimingPackage timing_package;

  private ExtraPackage(ExtraPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.card_package = paramBuilder.card_package;
    this.device_package = paramBuilder.device_package;
    this.content_package = paramBuilder.content_package;
    this.feed_package = paramBuilder.feed_package;
    this.resource_package = paramBuilder.resource_package;
    this.open_type_package = paramBuilder.open_type_package;
    this.app_status_package = paramBuilder.app_status_package;
    this.download_package = paramBuilder.download_package;
    this.device_status_package = paramBuilder.device_status_package;
    this.game_launcher_package = paramBuilder.game_launcher_package;
    this.timing_package = paramBuilder.timing_package;
    this.app_usage_stat_package = paramBuilder.app_usage_stat_package;
    this.snaplock_settings_package = paramBuilder.snaplock_settings_package;
    this.log_track_package = paramBuilder.log_track_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ExtraPackage localExtraPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ExtraPackage))
        return false;
      localExtraPackage = (ExtraPackage)paramObject;
    }
    while ((equals(this.card_package, localExtraPackage.card_package)) && (equals(this.device_package, localExtraPackage.device_package)) && (equals(this.content_package, localExtraPackage.content_package)) && (equals(this.feed_package, localExtraPackage.feed_package)) && (equals(this.resource_package, localExtraPackage.resource_package)) && (equals(this.open_type_package, localExtraPackage.open_type_package)) && (equals(this.app_status_package, localExtraPackage.app_status_package)) && (equals(this.download_package, localExtraPackage.download_package)) && (equals(this.device_status_package, localExtraPackage.device_status_package)) && (equals(this.game_launcher_package, localExtraPackage.game_launcher_package)) && (equals(this.timing_package, localExtraPackage.timing_package)) && (equals(this.app_usage_stat_package, localExtraPackage.app_usage_stat_package)) && (equals(this.snaplock_settings_package, localExtraPackage.snaplock_settings_package)) && (equals(this.log_track_package, localExtraPackage.log_track_package)));
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
    label304: int i20;
    if (i == 0)
    {
      if (this.card_package == null)
        break label376;
      j = this.card_package.hashCode();
      int k = j * 37;
      if (this.device_package == null)
        break label381;
      m = this.device_package.hashCode();
      int n = 37 * (m + k);
      if (this.content_package == null)
        break label387;
      i1 = this.content_package.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.feed_package == null)
        break label393;
      i3 = this.feed_package.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.resource_package == null)
        break label399;
      i5 = this.resource_package.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.open_type_package == null)
        break label405;
      i7 = this.open_type_package.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.app_status_package == null)
        break label411;
      i9 = this.app_status_package.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.download_package == null)
        break label417;
      i11 = this.download_package.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.device_status_package == null)
        break label423;
      i13 = this.device_status_package.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.game_launcher_package == null)
        break label429;
      i15 = this.game_launcher_package.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.timing_package == null)
        break label435;
      i17 = this.timing_package.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.app_usage_stat_package == null)
        break label441;
      i19 = this.app_usage_stat_package.hashCode();
      i20 = 37 * (i19 + i18);
      if (this.snaplock_settings_package == null)
        break label447;
    }
    label387: label393: label399: label405: label411: label417: label423: label429: label435: label441: label447: for (int i21 = this.snaplock_settings_package.hashCode(); ; i21 = 0)
    {
      int i22 = 37 * (i21 + i20);
      LogTrackPackage localLogTrackPackage = this.log_track_package;
      int i23 = 0;
      if (localLogTrackPackage != null)
        i23 = this.log_track_package.hashCode();
      i = i22 + i23;
      this.hashCode = i;
      return i;
      label376: j = 0;
      break;
      label381: m = 0;
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
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ExtraPackage
 * JD-Core Version:    0.6.0
 */