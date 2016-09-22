package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class AppDetail$Builder extends Message.Builder<AppDetail>
{
  public Boolean ad;
  public Integer ad_type;
  public String alias;
  public List<ApkDetail> apk;
  public AppAuth app_auth;
  public Color app_color;
  public AppDetail.AppPlatform app_platform;
  public String app_type;
  public AppAward award;
  public String banner;
  public List<AppCategory> categories;
  public Integer comments_count;
  public Image cover_image;
  public Integer crash_without_gsf;
  public List<AppTag> deprecated_tag;
  public String description;
  public String detail_param;
  public Developer developer;
  public Integer dislikes_count;
  public String editor_comment;
  public List<ExtensionPack> extension_pack;
  public IconSet icons;
  public Integer id;
  public String impr_url;
  public Integer in_app_purchase;
  public String installed_count_str;
  public Boolean is_online_game;
  public String language;
  public Integer likes_count;
  public Integer likes_rate;
  public Boolean need_network;
  public String package_name;
  public ReviewBean review;
  public ScreenShotSet screenshots;
  public List<Tag> tag;
  public String tagline;
  public String title;
  public String title_en;
  public TrailerBean trailer;
  public Long updated_date;
  public String user_notice;

  public AppDetail$Builder()
  {
  }

  public AppDetail$Builder(AppDetail paramAppDetail)
  {
    super(paramAppDetail);
    if (paramAppDetail == null)
      return;
    this.ad = paramAppDetail.ad;
    this.ad_type = paramAppDetail.ad_type;
    this.detail_param = paramAppDetail.detail_param;
    this.apk = AppDetail.access$000(paramAppDetail.apk);
    this.award = paramAppDetail.award;
    this.description = paramAppDetail.description;
    this.title = paramAppDetail.title;
    this.comments_count = paramAppDetail.comments_count;
    this.likes_count = paramAppDetail.likes_count;
    this.dislikes_count = paramAppDetail.dislikes_count;
    this.editor_comment = paramAppDetail.editor_comment;
    this.tagline = paramAppDetail.tagline;
    this.installed_count_str = paramAppDetail.installed_count_str;
    this.package_name = paramAppDetail.package_name;
    this.id = paramAppDetail.id;
    this.likes_rate = paramAppDetail.likes_rate;
    this.banner = paramAppDetail.banner;
    this.updated_date = paramAppDetail.updated_date;
    this.impr_url = paramAppDetail.impr_url;
    this.app_type = paramAppDetail.app_type;
    this.developer = paramAppDetail.developer;
    this.icons = paramAppDetail.icons;
    this.extension_pack = AppDetail.access$100(paramAppDetail.extension_pack);
    this.screenshots = paramAppDetail.screenshots;
    this.deprecated_tag = AppDetail.access$200(paramAppDetail.deprecated_tag);
    this.is_online_game = paramAppDetail.is_online_game;
    this.need_network = paramAppDetail.need_network;
    this.crash_without_gsf = paramAppDetail.crash_without_gsf;
    this.in_app_purchase = paramAppDetail.in_app_purchase;
    this.language = paramAppDetail.language;
    this.user_notice = paramAppDetail.user_notice;
    this.cover_image = paramAppDetail.cover_image;
    this.trailer = paramAppDetail.trailer;
    this.review = paramAppDetail.review;
    this.tag = AppDetail.access$300(paramAppDetail.tag);
    this.categories = AppDetail.access$400(paramAppDetail.categories);
    this.title_en = paramAppDetail.title_en;
    this.alias = paramAppDetail.alias;
    this.app_platform = paramAppDetail.app_platform;
    this.app_auth = paramAppDetail.app_auth;
    this.app_color = paramAppDetail.app_color;
  }

  public final Builder ad(Boolean paramBoolean)
  {
    this.ad = paramBoolean;
    return this;
  }

  public final Builder ad_type(Integer paramInteger)
  {
    this.ad_type = paramInteger;
    return this;
  }

  public final Builder alias(String paramString)
  {
    this.alias = paramString;
    return this;
  }

  public final Builder apk(List<ApkDetail> paramList)
  {
    this.apk = checkForNulls(paramList);
    return this;
  }

  public final Builder app_auth(AppAuth paramAppAuth)
  {
    this.app_auth = paramAppAuth;
    return this;
  }

  public final Builder app_color(Color paramColor)
  {
    this.app_color = paramColor;
    return this;
  }

  public final Builder app_platform(AppDetail.AppPlatform paramAppPlatform)
  {
    this.app_platform = paramAppPlatform;
    return this;
  }

  public final Builder app_type(String paramString)
  {
    this.app_type = paramString;
    return this;
  }

  public final Builder award(AppAward paramAppAward)
  {
    this.award = paramAppAward;
    return this;
  }

  public final Builder banner(String paramString)
  {
    this.banner = paramString;
    return this;
  }

  public final AppDetail build()
  {
    return new AppDetail(this, null);
  }

  public final Builder categories(List<AppCategory> paramList)
  {
    this.categories = checkForNulls(paramList);
    return this;
  }

  public final Builder comments_count(Integer paramInteger)
  {
    this.comments_count = paramInteger;
    return this;
  }

  public final Builder cover_image(Image paramImage)
  {
    this.cover_image = paramImage;
    return this;
  }

  public final Builder crash_without_gsf(Integer paramInteger)
  {
    this.crash_without_gsf = paramInteger;
    return this;
  }

  public final Builder deprecated_tag(List<AppTag> paramList)
  {
    this.deprecated_tag = checkForNulls(paramList);
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder detail_param(String paramString)
  {
    this.detail_param = paramString;
    return this;
  }

  public final Builder developer(Developer paramDeveloper)
  {
    this.developer = paramDeveloper;
    return this;
  }

  public final Builder dislikes_count(Integer paramInteger)
  {
    this.dislikes_count = paramInteger;
    return this;
  }

  public final Builder editor_comment(String paramString)
  {
    this.editor_comment = paramString;
    return this;
  }

  public final Builder extension_pack(List<ExtensionPack> paramList)
  {
    this.extension_pack = checkForNulls(paramList);
    return this;
  }

  public final Builder icons(IconSet paramIconSet)
  {
    this.icons = paramIconSet;
    return this;
  }

  public final Builder id(Integer paramInteger)
  {
    this.id = paramInteger;
    return this;
  }

  public final Builder impr_url(String paramString)
  {
    this.impr_url = paramString;
    return this;
  }

  public final Builder in_app_purchase(Integer paramInteger)
  {
    this.in_app_purchase = paramInteger;
    return this;
  }

  public final Builder installed_count_str(String paramString)
  {
    this.installed_count_str = paramString;
    return this;
  }

  public final Builder is_online_game(Boolean paramBoolean)
  {
    this.is_online_game = paramBoolean;
    return this;
  }

  public final Builder language(String paramString)
  {
    this.language = paramString;
    return this;
  }

  public final Builder likes_count(Integer paramInteger)
  {
    this.likes_count = paramInteger;
    return this;
  }

  public final Builder likes_rate(Integer paramInteger)
  {
    this.likes_rate = paramInteger;
    return this;
  }

  public final Builder need_network(Boolean paramBoolean)
  {
    this.need_network = paramBoolean;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }

  public final Builder review(ReviewBean paramReviewBean)
  {
    this.review = paramReviewBean;
    return this;
  }

  public final Builder screenshots(ScreenShotSet paramScreenShotSet)
  {
    this.screenshots = paramScreenShotSet;
    return this;
  }

  public final Builder tag(List<Tag> paramList)
  {
    this.tag = checkForNulls(paramList);
    return this;
  }

  public final Builder tagline(String paramString)
  {
    this.tagline = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  public final Builder title_en(String paramString)
  {
    this.title_en = paramString;
    return this;
  }

  public final Builder trailer(TrailerBean paramTrailerBean)
  {
    this.trailer = paramTrailerBean;
    return this;
  }

  public final Builder updated_date(Long paramLong)
  {
    this.updated_date = paramLong;
    return this;
  }

  public final Builder user_notice(String paramString)
  {
    this.user_notice = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppDetail.Builder
 * JD-Core Version:    0.6.0
 */