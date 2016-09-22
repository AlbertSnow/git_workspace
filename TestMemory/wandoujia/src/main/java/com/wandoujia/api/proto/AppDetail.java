package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AppDetail extends Message
{
  public static final Boolean DEFAULT_AD = Boolean.valueOf(false);
  public static final Integer DEFAULT_AD_TYPE = Integer.valueOf(0);
  public static final String DEFAULT_ALIAS = "";
  public static final List<ApkDetail> DEFAULT_APK = Collections.emptyList();
  public static final AppDetail.AppPlatform DEFAULT_APP_PLATFORM;
  public static final String DEFAULT_APP_TYPE = "";
  public static final String DEFAULT_BANNER = "";
  public static final List<AppCategory> DEFAULT_CATEGORIES;
  public static final Integer DEFAULT_COMMENTS_COUNT = Integer.valueOf(0);
  public static final Integer DEFAULT_CRASH_WITHOUT_GSF;
  public static final List<AppTag> DEFAULT_DEPRECATED_TAG;
  public static final String DEFAULT_DESCRIPTION = "";
  public static final String DEFAULT_DETAIL_PARAM = "";
  public static final Integer DEFAULT_DISLIKES_COUNT;
  public static final String DEFAULT_EDITOR_COMMENT = "";
  public static final List<ExtensionPack> DEFAULT_EXTENSION_PACK;
  public static final Integer DEFAULT_ID;
  public static final String DEFAULT_IMPR_URL = "";
  public static final String DEFAULT_INSTALLED_COUNT_STR = "";
  public static final Integer DEFAULT_IN_APP_PURCHASE;
  public static final Boolean DEFAULT_IS_ONLINE_GAME;
  public static final String DEFAULT_LANGUAGE = "";
  public static final Integer DEFAULT_LIKES_COUNT = Integer.valueOf(0);
  public static final Integer DEFAULT_LIKES_RATE;
  public static final Boolean DEFAULT_NEED_NETWORK;
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final List<Tag> DEFAULT_TAG;
  public static final String DEFAULT_TAGLINE = "";
  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TITLE_EN = "";
  public static final Long DEFAULT_UPDATED_DATE;
  public static final String DEFAULT_USER_NOTICE = "";

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean ad;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer ad_type;

  @ProtoField(tag=38, type=Message.Datatype.STRING)
  public final String alias;

  @ProtoField(label=Message.Label.REPEATED, tag=4)
  public final List<ApkDetail> apk;

  @ProtoField(tag=40)
  public final AppAuth app_auth;

  @ProtoField(tag=41)
  public final Color app_color;

  @ProtoField(tag=39, type=Message.Datatype.ENUM)
  public final AppDetail.AppPlatform app_platform;

  @ProtoField(tag=20, type=Message.Datatype.STRING)
  public final String app_type;

  @ProtoField(tag=5)
  public final AppAward award;

  @ProtoField(tag=17, type=Message.Datatype.STRING)
  public final String banner;

  @ProtoField(label=Message.Label.REPEATED, tag=36)
  public final List<AppCategory> categories;

  @ProtoField(tag=8, type=Message.Datatype.INT32)
  public final Integer comments_count;

  @ProtoField(tag=32)
  public final Image cover_image;

  @ProtoField(tag=28, type=Message.Datatype.INT32)
  public final Integer crash_without_gsf;

  @ProtoField(label=Message.Label.REPEATED, tag=25)
  public final List<AppTag> deprecated_tag;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String detail_param;

  @ProtoField(tag=21)
  public final Developer developer;

  @ProtoField(tag=10, type=Message.Datatype.INT32)
  public final Integer dislikes_count;

  @ProtoField(tag=11, type=Message.Datatype.STRING)
  public final String editor_comment;

  @ProtoField(label=Message.Label.REPEATED, tag=23)
  public final List<ExtensionPack> extension_pack;

  @ProtoField(tag=22)
  public final IconSet icons;

  @ProtoField(tag=15, type=Message.Datatype.INT32)
  public final Integer id;

  @ProtoField(tag=19, type=Message.Datatype.STRING)
  public final String impr_url;

  @ProtoField(tag=29, type=Message.Datatype.INT32)
  public final Integer in_app_purchase;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String installed_count_str;

  @ProtoField(tag=26, type=Message.Datatype.BOOL)
  public final Boolean is_online_game;

  @ProtoField(tag=30, type=Message.Datatype.STRING)
  public final String language;

  @ProtoField(tag=9, type=Message.Datatype.INT32)
  public final Integer likes_count;

  @ProtoField(tag=16, type=Message.Datatype.INT32)
  public final Integer likes_rate;

  @ProtoField(tag=27, type=Message.Datatype.BOOL)
  public final Boolean need_network;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String package_name;

  @ProtoField(tag=34)
  public final ReviewBean review;

  @ProtoField(tag=24)
  public final ScreenShotSet screenshots;

  @ProtoField(label=Message.Label.REPEATED, tag=35)
  public final List<Tag> tag;

  @ProtoField(tag=12, type=Message.Datatype.STRING)
  public final String tagline;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=37, type=Message.Datatype.STRING)
  public final String title_en;

  @ProtoField(tag=33)
  public final TrailerBean trailer;

  @ProtoField(tag=18, type=Message.Datatype.INT64)
  public final Long updated_date;

  @ProtoField(tag=31, type=Message.Datatype.STRING)
  public final String user_notice;

  static
  {
    DEFAULT_DISLIKES_COUNT = Integer.valueOf(0);
    DEFAULT_ID = Integer.valueOf(0);
    DEFAULT_LIKES_RATE = Integer.valueOf(0);
    DEFAULT_UPDATED_DATE = Long.valueOf(0L);
    DEFAULT_EXTENSION_PACK = Collections.emptyList();
    DEFAULT_DEPRECATED_TAG = Collections.emptyList();
    DEFAULT_IS_ONLINE_GAME = Boolean.valueOf(false);
    DEFAULT_NEED_NETWORK = Boolean.valueOf(false);
    DEFAULT_CRASH_WITHOUT_GSF = Integer.valueOf(0);
    DEFAULT_IN_APP_PURCHASE = Integer.valueOf(0);
    DEFAULT_TAG = Collections.emptyList();
    DEFAULT_CATEGORIES = Collections.emptyList();
    DEFAULT_APP_PLATFORM = AppDetail.AppPlatform.ANDROID;
  }

  private AppDetail(AppDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.ad = paramBuilder.ad;
    this.ad_type = paramBuilder.ad_type;
    this.detail_param = paramBuilder.detail_param;
    this.apk = immutableCopyOf(paramBuilder.apk);
    this.award = paramBuilder.award;
    this.description = paramBuilder.description;
    this.title = paramBuilder.title;
    this.comments_count = paramBuilder.comments_count;
    this.likes_count = paramBuilder.likes_count;
    this.dislikes_count = paramBuilder.dislikes_count;
    this.editor_comment = paramBuilder.editor_comment;
    this.tagline = paramBuilder.tagline;
    this.installed_count_str = paramBuilder.installed_count_str;
    this.package_name = paramBuilder.package_name;
    this.id = paramBuilder.id;
    this.likes_rate = paramBuilder.likes_rate;
    this.banner = paramBuilder.banner;
    this.updated_date = paramBuilder.updated_date;
    this.impr_url = paramBuilder.impr_url;
    this.app_type = paramBuilder.app_type;
    this.developer = paramBuilder.developer;
    this.icons = paramBuilder.icons;
    this.extension_pack = immutableCopyOf(paramBuilder.extension_pack);
    this.screenshots = paramBuilder.screenshots;
    this.deprecated_tag = immutableCopyOf(paramBuilder.deprecated_tag);
    this.is_online_game = paramBuilder.is_online_game;
    this.need_network = paramBuilder.need_network;
    this.crash_without_gsf = paramBuilder.crash_without_gsf;
    this.in_app_purchase = paramBuilder.in_app_purchase;
    this.language = paramBuilder.language;
    this.user_notice = paramBuilder.user_notice;
    this.cover_image = paramBuilder.cover_image;
    this.trailer = paramBuilder.trailer;
    this.review = paramBuilder.review;
    this.tag = immutableCopyOf(paramBuilder.tag);
    this.categories = immutableCopyOf(paramBuilder.categories);
    this.title_en = paramBuilder.title_en;
    this.alias = paramBuilder.alias;
    this.app_platform = paramBuilder.app_platform;
    this.app_auth = paramBuilder.app_auth;
    this.app_color = paramBuilder.app_color;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppDetail localAppDetail;
    do
    {
      return true;
      if (!(paramObject instanceof AppDetail))
        return false;
      localAppDetail = (AppDetail)paramObject;
    }
    while ((equals(this.ad, localAppDetail.ad)) && (equals(this.ad_type, localAppDetail.ad_type)) && (equals(this.detail_param, localAppDetail.detail_param)) && (equals(this.apk, localAppDetail.apk)) && (equals(this.award, localAppDetail.award)) && (equals(this.description, localAppDetail.description)) && (equals(this.title, localAppDetail.title)) && (equals(this.comments_count, localAppDetail.comments_count)) && (equals(this.likes_count, localAppDetail.likes_count)) && (equals(this.dislikes_count, localAppDetail.dislikes_count)) && (equals(this.editor_comment, localAppDetail.editor_comment)) && (equals(this.tagline, localAppDetail.tagline)) && (equals(this.installed_count_str, localAppDetail.installed_count_str)) && (equals(this.package_name, localAppDetail.package_name)) && (equals(this.id, localAppDetail.id)) && (equals(this.likes_rate, localAppDetail.likes_rate)) && (equals(this.banner, localAppDetail.banner)) && (equals(this.updated_date, localAppDetail.updated_date)) && (equals(this.impr_url, localAppDetail.impr_url)) && (equals(this.app_type, localAppDetail.app_type)) && (equals(this.developer, localAppDetail.developer)) && (equals(this.icons, localAppDetail.icons)) && (equals(this.extension_pack, localAppDetail.extension_pack)) && (equals(this.screenshots, localAppDetail.screenshots)) && (equals(this.deprecated_tag, localAppDetail.deprecated_tag)) && (equals(this.is_online_game, localAppDetail.is_online_game)) && (equals(this.need_network, localAppDetail.need_network)) && (equals(this.crash_without_gsf, localAppDetail.crash_without_gsf)) && (equals(this.in_app_purchase, localAppDetail.in_app_purchase)) && (equals(this.language, localAppDetail.language)) && (equals(this.user_notice, localAppDetail.user_notice)) && (equals(this.cover_image, localAppDetail.cover_image)) && (equals(this.trailer, localAppDetail.trailer)) && (equals(this.review, localAppDetail.review)) && (equals(this.tag, localAppDetail.tag)) && (equals(this.categories, localAppDetail.categories)) && (equals(this.title_en, localAppDetail.title_en)) && (equals(this.alias, localAppDetail.alias)) && (equals(this.app_platform, localAppDetail.app_platform)) && (equals(this.app_auth, localAppDetail.app_auth)) && (equals(this.app_color, localAppDetail.app_color)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    int k;
    int n;
    label48: int i2;
    label74: int i4;
    label102: int i6;
    label128: int i8;
    label154: int i10;
    label180: int i12;
    label206: int i14;
    label232: int i16;
    label258: int i18;
    label284: int i20;
    label310: int i22;
    label336: int i24;
    label362: int i26;
    label388: int i28;
    label414: int i30;
    label440: int i32;
    label466: int i34;
    label492: int i36;
    label518: int i38;
    label544: int i40;
    label570: int i42;
    label598: int i44;
    label624: int i46;
    label652: int i48;
    label678: int i50;
    label704: int i52;
    label730: int i54;
    label756: int i56;
    label782: int i58;
    label808: int i60;
    label834: int i62;
    label860: int i64;
    label886: int i66;
    label914: int i69;
    label966: int i71;
    label992: int i73;
    label1018: int i74;
    if (j == 0)
    {
      if (this.ad == null)
        break label1090;
      k = this.ad.hashCode();
      int m = k * 37;
      if (this.ad_type == null)
        break label1095;
      n = this.ad_type.hashCode();
      int i1 = 37 * (n + m);
      if (this.detail_param == null)
        break label1101;
      i2 = this.detail_param.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.apk == null)
        break label1107;
      i4 = this.apk.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.award == null)
        break label1113;
      i6 = this.award.hashCode();
      int i7 = 37 * (i6 + i5);
      if (this.description == null)
        break label1119;
      i8 = this.description.hashCode();
      int i9 = 37 * (i8 + i7);
      if (this.title == null)
        break label1125;
      i10 = this.title.hashCode();
      int i11 = 37 * (i10 + i9);
      if (this.comments_count == null)
        break label1131;
      i12 = this.comments_count.hashCode();
      int i13 = 37 * (i12 + i11);
      if (this.likes_count == null)
        break label1137;
      i14 = this.likes_count.hashCode();
      int i15 = 37 * (i14 + i13);
      if (this.dislikes_count == null)
        break label1143;
      i16 = this.dislikes_count.hashCode();
      int i17 = 37 * (i16 + i15);
      if (this.editor_comment == null)
        break label1149;
      i18 = this.editor_comment.hashCode();
      int i19 = 37 * (i18 + i17);
      if (this.tagline == null)
        break label1155;
      i20 = this.tagline.hashCode();
      int i21 = 37 * (i20 + i19);
      if (this.installed_count_str == null)
        break label1161;
      i22 = this.installed_count_str.hashCode();
      int i23 = 37 * (i22 + i21);
      if (this.package_name == null)
        break label1167;
      i24 = this.package_name.hashCode();
      int i25 = 37 * (i24 + i23);
      if (this.id == null)
        break label1173;
      i26 = this.id.hashCode();
      int i27 = 37 * (i26 + i25);
      if (this.likes_rate == null)
        break label1179;
      i28 = this.likes_rate.hashCode();
      int i29 = 37 * (i28 + i27);
      if (this.banner == null)
        break label1185;
      i30 = this.banner.hashCode();
      int i31 = 37 * (i30 + i29);
      if (this.updated_date == null)
        break label1191;
      i32 = this.updated_date.hashCode();
      int i33 = 37 * (i32 + i31);
      if (this.impr_url == null)
        break label1197;
      i34 = this.impr_url.hashCode();
      int i35 = 37 * (i34 + i33);
      if (this.app_type == null)
        break label1203;
      i36 = this.app_type.hashCode();
      int i37 = 37 * (i36 + i35);
      if (this.developer == null)
        break label1209;
      i38 = this.developer.hashCode();
      int i39 = 37 * (i38 + i37);
      if (this.icons == null)
        break label1215;
      i40 = this.icons.hashCode();
      int i41 = 37 * (i40 + i39);
      if (this.extension_pack == null)
        break label1221;
      i42 = this.extension_pack.hashCode();
      int i43 = 37 * (i42 + i41);
      if (this.screenshots == null)
        break label1227;
      i44 = this.screenshots.hashCode();
      int i45 = 37 * (i44 + i43);
      if (this.deprecated_tag == null)
        break label1233;
      i46 = this.deprecated_tag.hashCode();
      int i47 = 37 * (i46 + i45);
      if (this.is_online_game == null)
        break label1239;
      i48 = this.is_online_game.hashCode();
      int i49 = 37 * (i48 + i47);
      if (this.need_network == null)
        break label1245;
      i50 = this.need_network.hashCode();
      int i51 = 37 * (i50 + i49);
      if (this.crash_without_gsf == null)
        break label1251;
      i52 = this.crash_without_gsf.hashCode();
      int i53 = 37 * (i52 + i51);
      if (this.in_app_purchase == null)
        break label1257;
      i54 = this.in_app_purchase.hashCode();
      int i55 = 37 * (i54 + i53);
      if (this.language == null)
        break label1263;
      i56 = this.language.hashCode();
      int i57 = 37 * (i56 + i55);
      if (this.user_notice == null)
        break label1269;
      i58 = this.user_notice.hashCode();
      int i59 = 37 * (i58 + i57);
      if (this.cover_image == null)
        break label1275;
      i60 = this.cover_image.hashCode();
      int i61 = 37 * (i60 + i59);
      if (this.trailer == null)
        break label1281;
      i62 = this.trailer.hashCode();
      int i63 = 37 * (i62 + i61);
      if (this.review == null)
        break label1287;
      i64 = this.review.hashCode();
      int i65 = 37 * (i64 + i63);
      if (this.tag == null)
        break label1293;
      i66 = this.tag.hashCode();
      int i67 = 37 * (i66 + i65);
      if (this.categories != null)
        i = this.categories.hashCode();
      int i68 = 37 * (i67 + i);
      if (this.title_en == null)
        break label1299;
      i69 = this.title_en.hashCode();
      int i70 = 37 * (i69 + i68);
      if (this.alias == null)
        break label1305;
      i71 = this.alias.hashCode();
      int i72 = 37 * (i71 + i70);
      if (this.app_platform == null)
        break label1311;
      i73 = this.app_platform.hashCode();
      i74 = 37 * (i73 + i72);
      if (this.app_auth == null)
        break label1317;
    }
    label1155: label1161: label1167: label1173: label1179: label1185: label1317: for (int i75 = this.app_auth.hashCode(); ; i75 = 0)
    {
      int i76 = 37 * (i75 + i74);
      Color localColor = this.app_color;
      int i77 = 0;
      if (localColor != null)
        i77 = this.app_color.hashCode();
      j = i76 + i77;
      this.hashCode = j;
      return j;
      label1090: k = 0;
      break;
      label1095: n = 0;
      break label48;
      label1101: i2 = 0;
      break label74;
      label1107: i4 = i;
      break label102;
      label1113: i6 = 0;
      break label128;
      label1119: i8 = 0;
      break label154;
      label1125: i10 = 0;
      break label180;
      label1131: i12 = 0;
      break label206;
      label1137: i14 = 0;
      break label232;
      label1143: i16 = 0;
      break label258;
      label1149: i18 = 0;
      break label284;
      i20 = 0;
      break label310;
      i22 = 0;
      break label336;
      i24 = 0;
      break label362;
      i26 = 0;
      break label388;
      i28 = 0;
      break label414;
      i30 = 0;
      break label440;
      label1191: i32 = 0;
      break label466;
      label1197: i34 = 0;
      break label492;
      label1203: i36 = 0;
      break label518;
      label1209: i38 = 0;
      break label544;
      label1215: i40 = 0;
      break label570;
      label1221: i42 = i;
      break label598;
      label1227: i44 = 0;
      break label624;
      label1233: i46 = i;
      break label652;
      label1239: i48 = 0;
      break label678;
      label1245: i50 = 0;
      break label704;
      label1251: i52 = 0;
      break label730;
      label1257: i54 = 0;
      break label756;
      label1263: i56 = 0;
      break label782;
      label1269: i58 = 0;
      break label808;
      label1275: i60 = 0;
      break label834;
      i62 = 0;
      break label860;
      i64 = 0;
      break label886;
      i66 = i;
      break label914;
      i69 = 0;
      break label966;
      i71 = 0;
      break label992;
      i73 = 0;
      break label1018;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppDetail
 * JD-Core Version:    0.6.0
 */