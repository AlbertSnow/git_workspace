package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Entity extends Message
{
  public static final Boolean DEFAULT_ALLOW_SAVE_IMAGE;
  public static final Boolean DEFAULT_ALLOW_SHARE_IMAGE;
  public static final List<Entity> DEFAULT_ATTACHMENT;
  public static final List<Entity> DEFAULT_ATTACH_ENTITY;
  public static final Integer DEFAULT_BADGE;
  public static final List<Entity> DEFAULT_CATEGORY;
  public static final List<Entity> DEFAULT_CHANNEL;
  public static final Boolean DEFAULT_CLOSED_GUESS;
  public static final ContentPlatformEnum.ContentPlatform DEFAULT_CONTENT_PLATFORM;
  public static final ContentTypeEnum.ContentType DEFAULT_CONTENT_TYPE;
  public static final List<Image> DEFAULT_COVER;
  public static final Integer DEFAULT_COVER_TOTAL_COUNT;
  public static final Long DEFAULT_DATEPUBLISHED;
  public static final String DEFAULT_DESCRIPTION = "";
  public static final String DEFAULT_DETAIL_URL = "";
  public static final Long DEFAULT_FOLLOW_COUNT;
  public static final String DEFAULT_ICON = "";
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  public static final String DEFAULT_ID_STRING = "";
  public static final List<Image> DEFAULT_IMAGE;
  public static final Integer DEFAULT_IMAGE_TOTAL_COUNT;
  public static final Boolean DEFAULT_IS_HIGHLIGHT;
  public static final Boolean DEFAULT_IS_IMAGE;
  public static final Boolean DEFAULT_IS_SHORT_VIDEO;
  public static final List<Music> DEFAULT_MUSIC;
  public static final Integer DEFAULT_MUSIC_TOTAL_COUNT;
  public static final Boolean DEFAULT_NEED_FILTER;
  public static final String DEFAULT_RECOMMEND_REASON = "";
  public static final String DEFAULT_REVIEW_NAME = "";
  public static final Integer DEFAULT_SECTION_AUTO_GRID_ROWS;
  public static final String DEFAULT_SNIPPET = "";
  public static final String DEFAULT_STRATEGY_NAME = "";
  public static final Boolean DEFAULT_SUBSCRIBED;
  public static final List<Entity> DEFAULT_SUB_ENTITY;
  public static final String DEFAULT_SUB_TITLE = "";
  public static final String DEFAULT_SUMMARY = "";
  public static final Boolean DEFAULT_SUPPORT_RIPPLE;
  public static final String DEFAULT_SYMBOL = "";
  public static final List<Tag> DEFAULT_TAG;
  public static final String DEFAULT_TAG_LINE = "";
  public static final Integer DEFAULT_TEMPLATE;
  public static final String DEFAULT_TEMPLATE_NAME = "";
  public static final TemplateTypeEnum.TemplateType DEFAULT_TEMPLATE_TYPE;
  public static final String DEFAULT_TITLE = "";
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  public static final String DEFAULT_VERTICAL = "";
  public static final List<Video> DEFAULT_VIDEO;
  public static final Integer DEFAULT_VIDEO_TOTAL_COUNT;

  @ProtoField(tag=15)
  public final Action action;

  @ProtoField(tag=51)
  public final Action action_negative;

  @ProtoField(tag=33)
  public final Action action_positive;

  @ProtoField(tag=47, type=Message.Datatype.BOOL)
  public final Boolean allow_save_image;

  @ProtoField(tag=48, type=Message.Datatype.BOOL)
  public final Boolean allow_share_image;

  @ProtoField(label=Message.Label.REPEATED, tag=34)
  public final List<Entity> attach_entity;

  @ProtoField(label=Message.Label.REPEATED, tag=12)
  public final List<Entity> attachment;

  @ProtoField(tag=52)
  public final Author author;

  @ProtoField(tag=31, type=Message.Datatype.INT32)
  public final Integer badge;

  @ProtoField(label=Message.Label.REPEATED, tag=57)
  public final List<Entity> category;

  @ProtoField(label=Message.Label.REPEATED, tag=24)
  public final List<Entity> channel;

  @ProtoField(tag=46, type=Message.Datatype.BOOL)
  public final Boolean closed_guess;

  @ProtoField(tag=58, type=Message.Datatype.ENUM)
  public final ContentPlatformEnum.ContentPlatform content_platform;

  @ProtoField(tag=37, type=Message.Datatype.ENUM)
  public final ContentTypeEnum.ContentType content_type;

  @ProtoField(label=Message.Label.REPEATED, tag=18)
  public final List<Image> cover;

  @ProtoField(tag=27, type=Message.Datatype.INT32)
  public final Integer cover_total_count;

  @ProtoField(tag=16, type=Message.Datatype.FIXED64)
  public final Long datePublished;

  @ProtoField(tag=32, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=14)
  public final Detail detail;

  @ProtoField(tag=17, type=Message.Datatype.STRING)
  public final String detail_url;

  @ProtoField(tag=13)
  public final FavoriteSummary favorite_summary;

  @ProtoField(tag=44, type=Message.Datatype.INT64)
  public final Long follow_count;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String icon;

  @ProtoField(tag=42)
  public final Image icon_image;

  @ProtoField(tag=1, type=Message.Datatype.SFIXED64)
  public final Long id;

  @ProtoField(tag=40, type=Message.Datatype.STRING)
  public final String id_string;

  @ProtoField(label=Message.Label.REPEATED, tag=6)
  public final List<Image> image;

  @ProtoField(tag=26, type=Message.Datatype.INT32)
  public final Integer image_total_count;

  @ProtoField(tag=56, type=Message.Datatype.BOOL)
  public final Boolean is_highlight;

  @ProtoField(tag=54, type=Message.Datatype.BOOL)
  public final Boolean is_image;

  @ProtoField(tag=55, type=Message.Datatype.BOOL)
  public final Boolean is_short_video;

  @ProtoField(label=Message.Label.REPEATED, tag=8)
  public final List<Music> music;

  @ProtoField(tag=29, type=Message.Datatype.INT32)
  public final Integer music_total_count;

  @ProtoField(tag=49, type=Message.Datatype.BOOL)
  public final Boolean need_filter;

  @ProtoField(tag=53)
  public final PreloadInfo preload_info;

  @ProtoField(tag=4)
  public final Entity provider;

  @ProtoField(tag=43, type=Message.Datatype.STRING)
  public final String recommend_reason;

  @ProtoField(tag=59, type=Message.Datatype.STRING)
  public final String review_name;

  @ProtoField(tag=50, type=Message.Datatype.INT32)
  public final Integer section_auto_grid_rows;

  @ProtoField(tag=25)
  public final ShareSummary share_summary;

  @ProtoField(tag=20, type=Message.Datatype.STRING)
  public final String snippet;

  @ProtoField(tag=45, type=Message.Datatype.STRING)
  public final String strategy_name;

  @ProtoField(label=Message.Label.REPEATED, tag=21)
  public final List<Entity> sub_entity;

  @ProtoField(tag=10, type=Message.Datatype.STRING)
  public final String sub_title;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean subscribed;

  @ProtoField(tag=11, type=Message.Datatype.STRING)
  public final String summary;

  @ProtoField(tag=23, type=Message.Datatype.BOOL)
  public final Boolean support_ripple;

  @ProtoField(tag=36, type=Message.Datatype.STRING)
  public final String symbol;

  @ProtoField(label=Message.Label.REPEATED, tag=35)
  public final List<Tag> tag;

  @ProtoField(tag=41, type=Message.Datatype.STRING)
  public final String tag_line;

  @ProtoField(deprecated=true, tag=19, type=Message.Datatype.INT32)
  @Deprecated
  public final Integer template;

  @ProtoField(deprecated=true, tag=22, type=Message.Datatype.STRING)
  @Deprecated
  public final String template_name;

  @ProtoField(tag=38, type=Message.Datatype.ENUM)
  public final TemplateTypeEnum.TemplateType template_type;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(deprecated=true, tag=2, type=Message.Datatype.INT32)
  @Deprecated
  public final Integer type;

  @ProtoField(tag=30, type=Message.Datatype.STRING)
  public final String vertical;

  @ProtoField(label=Message.Label.REPEATED, tag=7)
  public final List<Video> video;

  @ProtoField(tag=28, type=Message.Datatype.INT32)
  public final Integer video_total_count;

  static
  {
    DEFAULT_TEMPLATE = Integer.valueOf(0);
    DEFAULT_IMAGE = Collections.emptyList();
    DEFAULT_COVER = Collections.emptyList();
    DEFAULT_DATEPUBLISHED = Long.valueOf(0L);
    DEFAULT_SUB_ENTITY = Collections.emptyList();
    DEFAULT_SUPPORT_RIPPLE = Boolean.valueOf(false);
    DEFAULT_BADGE = Integer.valueOf(0);
    DEFAULT_ATTACH_ENTITY = Collections.emptyList();
    DEFAULT_TAG = Collections.emptyList();
    DEFAULT_CONTENT_TYPE = ContentTypeEnum.ContentType.NOT_SUPPORT;
    DEFAULT_TEMPLATE_TYPE = TemplateTypeEnum.TemplateType.NOT_SUPPORT;
    DEFAULT_VIDEO = Collections.emptyList();
    DEFAULT_MUSIC = Collections.emptyList();
    DEFAULT_IMAGE_TOTAL_COUNT = Integer.valueOf(0);
    DEFAULT_COVER_TOTAL_COUNT = Integer.valueOf(0);
    DEFAULT_VIDEO_TOTAL_COUNT = Integer.valueOf(0);
    DEFAULT_MUSIC_TOTAL_COUNT = Integer.valueOf(0);
    DEFAULT_CHANNEL = Collections.emptyList();
    DEFAULT_SUBSCRIBED = Boolean.valueOf(false);
    DEFAULT_ATTACHMENT = Collections.emptyList();
    DEFAULT_FOLLOW_COUNT = Long.valueOf(0L);
    DEFAULT_CLOSED_GUESS = Boolean.valueOf(false);
    DEFAULT_ALLOW_SAVE_IMAGE = Boolean.valueOf(false);
    DEFAULT_ALLOW_SHARE_IMAGE = Boolean.valueOf(false);
    DEFAULT_NEED_FILTER = Boolean.valueOf(false);
    DEFAULT_SECTION_AUTO_GRID_ROWS = Integer.valueOf(1);
    DEFAULT_IS_IMAGE = Boolean.valueOf(false);
    DEFAULT_IS_SHORT_VIDEO = Boolean.valueOf(false);
    DEFAULT_IS_HIGHLIGHT = Boolean.valueOf(false);
    DEFAULT_CATEGORY = Collections.emptyList();
    DEFAULT_CONTENT_PLATFORM = ContentPlatformEnum.ContentPlatform.NATIVE;
  }

  private Entity(Entity.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.type = paramBuilder.type;
    this.template = paramBuilder.template;
    this.icon = paramBuilder.icon;
    this.icon_image = paramBuilder.icon_image;
    this.provider = paramBuilder.provider;
    this.image = immutableCopyOf(paramBuilder.image);
    this.cover = immutableCopyOf(paramBuilder.cover);
    this.title = paramBuilder.title;
    this.sub_title = paramBuilder.sub_title;
    this.summary = paramBuilder.summary;
    this.snippet = paramBuilder.snippet;
    this.tag_line = paramBuilder.tag_line;
    this.detail = paramBuilder.detail;
    this.action = paramBuilder.action;
    this.datePublished = paramBuilder.datePublished;
    this.detail_url = paramBuilder.detail_url;
    this.sub_entity = immutableCopyOf(paramBuilder.sub_entity);
    this.template_name = paramBuilder.template_name;
    this.support_ripple = paramBuilder.support_ripple;
    this.vertical = paramBuilder.vertical;
    this.badge = paramBuilder.badge;
    this.description = paramBuilder.description;
    this.action_positive = paramBuilder.action_positive;
    this.action_negative = paramBuilder.action_negative;
    this.attach_entity = immutableCopyOf(paramBuilder.attach_entity);
    this.tag = immutableCopyOf(paramBuilder.tag);
    this.symbol = paramBuilder.symbol;
    this.content_type = paramBuilder.content_type;
    this.template_type = paramBuilder.template_type;
    this.id_string = paramBuilder.id_string;
    this.strategy_name = paramBuilder.strategy_name;
    this.video = immutableCopyOf(paramBuilder.video);
    this.music = immutableCopyOf(paramBuilder.music);
    this.image_total_count = paramBuilder.image_total_count;
    this.cover_total_count = paramBuilder.cover_total_count;
    this.video_total_count = paramBuilder.video_total_count;
    this.music_total_count = paramBuilder.music_total_count;
    this.channel = immutableCopyOf(paramBuilder.channel);
    this.subscribed = paramBuilder.subscribed;
    this.attachment = immutableCopyOf(paramBuilder.attachment);
    this.favorite_summary = paramBuilder.favorite_summary;
    this.share_summary = paramBuilder.share_summary;
    this.recommend_reason = paramBuilder.recommend_reason;
    this.follow_count = paramBuilder.follow_count;
    this.closed_guess = paramBuilder.closed_guess;
    this.allow_save_image = paramBuilder.allow_save_image;
    this.allow_share_image = paramBuilder.allow_share_image;
    this.need_filter = paramBuilder.need_filter;
    this.author = paramBuilder.author;
    this.section_auto_grid_rows = paramBuilder.section_auto_grid_rows;
    this.preload_info = paramBuilder.preload_info;
    this.is_image = paramBuilder.is_image;
    this.is_short_video = paramBuilder.is_short_video;
    this.is_highlight = paramBuilder.is_highlight;
    this.category = immutableCopyOf(paramBuilder.category);
    this.content_platform = paramBuilder.content_platform;
    this.review_name = paramBuilder.review_name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Entity localEntity;
    do
    {
      return true;
      if (!(paramObject instanceof Entity))
        return false;
      localEntity = (Entity)paramObject;
    }
    while ((equals(this.id, localEntity.id)) && (equals(this.type, localEntity.type)) && (equals(this.template, localEntity.template)) && (equals(this.icon, localEntity.icon)) && (equals(this.icon_image, localEntity.icon_image)) && (equals(this.provider, localEntity.provider)) && (equals(this.image, localEntity.image)) && (equals(this.cover, localEntity.cover)) && (equals(this.title, localEntity.title)) && (equals(this.sub_title, localEntity.sub_title)) && (equals(this.summary, localEntity.summary)) && (equals(this.snippet, localEntity.snippet)) && (equals(this.tag_line, localEntity.tag_line)) && (equals(this.detail, localEntity.detail)) && (equals(this.action, localEntity.action)) && (equals(this.datePublished, localEntity.datePublished)) && (equals(this.detail_url, localEntity.detail_url)) && (equals(this.sub_entity, localEntity.sub_entity)) && (equals(this.template_name, localEntity.template_name)) && (equals(this.support_ripple, localEntity.support_ripple)) && (equals(this.vertical, localEntity.vertical)) && (equals(this.badge, localEntity.badge)) && (equals(this.description, localEntity.description)) && (equals(this.action_positive, localEntity.action_positive)) && (equals(this.action_negative, localEntity.action_negative)) && (equals(this.attach_entity, localEntity.attach_entity)) && (equals(this.tag, localEntity.tag)) && (equals(this.symbol, localEntity.symbol)) && (equals(this.content_type, localEntity.content_type)) && (equals(this.template_type, localEntity.template_type)) && (equals(this.id_string, localEntity.id_string)) && (equals(this.strategy_name, localEntity.strategy_name)) && (equals(this.video, localEntity.video)) && (equals(this.music, localEntity.music)) && (equals(this.image_total_count, localEntity.image_total_count)) && (equals(this.cover_total_count, localEntity.cover_total_count)) && (equals(this.video_total_count, localEntity.video_total_count)) && (equals(this.music_total_count, localEntity.music_total_count)) && (equals(this.channel, localEntity.channel)) && (equals(this.subscribed, localEntity.subscribed)) && (equals(this.attachment, localEntity.attachment)) && (equals(this.favorite_summary, localEntity.favorite_summary)) && (equals(this.share_summary, localEntity.share_summary)) && (equals(this.recommend_reason, localEntity.recommend_reason)) && (equals(this.follow_count, localEntity.follow_count)) && (equals(this.closed_guess, localEntity.closed_guess)) && (equals(this.allow_save_image, localEntity.allow_save_image)) && (equals(this.allow_share_image, localEntity.allow_share_image)) && (equals(this.need_filter, localEntity.need_filter)) && (equals(this.author, localEntity.author)) && (equals(this.section_auto_grid_rows, localEntity.section_auto_grid_rows)) && (equals(this.preload_info, localEntity.preload_info)) && (equals(this.is_image, localEntity.is_image)) && (equals(this.is_short_video, localEntity.is_short_video)) && (equals(this.is_highlight, localEntity.is_highlight)) && (equals(this.category, localEntity.category)) && (equals(this.content_platform, localEntity.content_platform)) && (equals(this.review_name, localEntity.review_name)));
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
    label100: int i6;
    label126: int i8;
    label152: int i10;
    label180: int i12;
    label208: int i14;
    label234: int i16;
    label260: int i18;
    label286: int i20;
    label312: int i22;
    label338: int i24;
    label364: int i26;
    label390: int i28;
    label416: int i30;
    label442: int i32;
    label470: int i34;
    label496: int i36;
    label522: int i38;
    label548: int i40;
    label574: int i42;
    label600: int i44;
    label626: int i46;
    label652: int i48;
    label680: int i50;
    label708: int i52;
    label734: int i54;
    label760: int i56;
    label786: int i58;
    label812: int i60;
    label838: int i62;
    label866: int i64;
    label894: int i66;
    label920: int i68;
    label946: int i70;
    label972: int i72;
    label998: int i74;
    label1026: int i76;
    label1052: int i78;
    label1080: int i80;
    label1106: int i82;
    label1132: int i84;
    label1158: int i86;
    label1184: int i88;
    label1210: int i90;
    label1236: int i92;
    label1262: int i94;
    label1288: int i96;
    label1314: int i98;
    label1340: int i100;
    label1366: int i102;
    label1392: int i104;
    label1418: int i106;
    label1444: int i108;
    if (j == 0)
    {
      if (this.id == null)
        break label1542;
      k = this.id.hashCode();
      int m = k * 37;
      if (this.type == null)
        break label1547;
      n = this.type.hashCode();
      int i1 = 37 * (n + m);
      if (this.template == null)
        break label1553;
      i2 = this.template.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.icon == null)
        break label1559;
      i4 = this.icon.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.icon_image == null)
        break label1565;
      i6 = this.icon_image.hashCode();
      int i7 = 37 * (i6 + i5);
      if (this.provider == null)
        break label1571;
      i8 = this.provider.hashCode();
      int i9 = 37 * (i8 + i7);
      if (this.image == null)
        break label1577;
      i10 = this.image.hashCode();
      int i11 = 37 * (i10 + i9);
      if (this.cover == null)
        break label1583;
      i12 = this.cover.hashCode();
      int i13 = 37 * (i12 + i11);
      if (this.title == null)
        break label1589;
      i14 = this.title.hashCode();
      int i15 = 37 * (i14 + i13);
      if (this.sub_title == null)
        break label1595;
      i16 = this.sub_title.hashCode();
      int i17 = 37 * (i16 + i15);
      if (this.summary == null)
        break label1601;
      i18 = this.summary.hashCode();
      int i19 = 37 * (i18 + i17);
      if (this.snippet == null)
        break label1607;
      i20 = this.snippet.hashCode();
      int i21 = 37 * (i20 + i19);
      if (this.tag_line == null)
        break label1613;
      i22 = this.tag_line.hashCode();
      int i23 = 37 * (i22 + i21);
      if (this.detail == null)
        break label1619;
      i24 = this.detail.hashCode();
      int i25 = 37 * (i24 + i23);
      if (this.action == null)
        break label1625;
      i26 = this.action.hashCode();
      int i27 = 37 * (i26 + i25);
      if (this.datePublished == null)
        break label1631;
      i28 = this.datePublished.hashCode();
      int i29 = 37 * (i28 + i27);
      if (this.detail_url == null)
        break label1637;
      i30 = this.detail_url.hashCode();
      int i31 = 37 * (i30 + i29);
      if (this.sub_entity == null)
        break label1643;
      i32 = this.sub_entity.hashCode();
      int i33 = 37 * (i32 + i31);
      if (this.template_name == null)
        break label1649;
      i34 = this.template_name.hashCode();
      int i35 = 37 * (i34 + i33);
      if (this.support_ripple == null)
        break label1655;
      i36 = this.support_ripple.hashCode();
      int i37 = 37 * (i36 + i35);
      if (this.vertical == null)
        break label1661;
      i38 = this.vertical.hashCode();
      int i39 = 37 * (i38 + i37);
      if (this.badge == null)
        break label1667;
      i40 = this.badge.hashCode();
      int i41 = 37 * (i40 + i39);
      if (this.description == null)
        break label1673;
      i42 = this.description.hashCode();
      int i43 = 37 * (i42 + i41);
      if (this.action_positive == null)
        break label1679;
      i44 = this.action_positive.hashCode();
      int i45 = 37 * (i44 + i43);
      if (this.action_negative == null)
        break label1685;
      i46 = this.action_negative.hashCode();
      int i47 = 37 * (i46 + i45);
      if (this.attach_entity == null)
        break label1691;
      i48 = this.attach_entity.hashCode();
      int i49 = 37 * (i48 + i47);
      if (this.tag == null)
        break label1697;
      i50 = this.tag.hashCode();
      int i51 = 37 * (i50 + i49);
      if (this.symbol == null)
        break label1703;
      i52 = this.symbol.hashCode();
      int i53 = 37 * (i52 + i51);
      if (this.content_type == null)
        break label1709;
      i54 = this.content_type.hashCode();
      int i55 = 37 * (i54 + i53);
      if (this.template_type == null)
        break label1715;
      i56 = this.template_type.hashCode();
      int i57 = 37 * (i56 + i55);
      if (this.id_string == null)
        break label1721;
      i58 = this.id_string.hashCode();
      int i59 = 37 * (i58 + i57);
      if (this.strategy_name == null)
        break label1727;
      i60 = this.strategy_name.hashCode();
      int i61 = 37 * (i60 + i59);
      if (this.video == null)
        break label1733;
      i62 = this.video.hashCode();
      int i63 = 37 * (i62 + i61);
      if (this.music == null)
        break label1739;
      i64 = this.music.hashCode();
      int i65 = 37 * (i64 + i63);
      if (this.image_total_count == null)
        break label1745;
      i66 = this.image_total_count.hashCode();
      int i67 = 37 * (i66 + i65);
      if (this.cover_total_count == null)
        break label1751;
      i68 = this.cover_total_count.hashCode();
      int i69 = 37 * (i68 + i67);
      if (this.video_total_count == null)
        break label1757;
      i70 = this.video_total_count.hashCode();
      int i71 = 37 * (i70 + i69);
      if (this.music_total_count == null)
        break label1763;
      i72 = this.music_total_count.hashCode();
      int i73 = 37 * (i72 + i71);
      if (this.channel == null)
        break label1769;
      i74 = this.channel.hashCode();
      int i75 = 37 * (i74 + i73);
      if (this.subscribed == null)
        break label1775;
      i76 = this.subscribed.hashCode();
      int i77 = 37 * (i76 + i75);
      if (this.attachment == null)
        break label1781;
      i78 = this.attachment.hashCode();
      int i79 = 37 * (i78 + i77);
      if (this.favorite_summary == null)
        break label1787;
      i80 = this.favorite_summary.hashCode();
      int i81 = 37 * (i80 + i79);
      if (this.share_summary == null)
        break label1793;
      i82 = this.share_summary.hashCode();
      int i83 = 37 * (i82 + i81);
      if (this.recommend_reason == null)
        break label1799;
      i84 = this.recommend_reason.hashCode();
      int i85 = 37 * (i84 + i83);
      if (this.follow_count == null)
        break label1805;
      i86 = this.follow_count.hashCode();
      int i87 = 37 * (i86 + i85);
      if (this.closed_guess == null)
        break label1811;
      i88 = this.closed_guess.hashCode();
      int i89 = 37 * (i88 + i87);
      if (this.allow_save_image == null)
        break label1817;
      i90 = this.allow_save_image.hashCode();
      int i91 = 37 * (i90 + i89);
      if (this.allow_share_image == null)
        break label1823;
      i92 = this.allow_share_image.hashCode();
      int i93 = 37 * (i92 + i91);
      if (this.need_filter == null)
        break label1829;
      i94 = this.need_filter.hashCode();
      int i95 = 37 * (i94 + i93);
      if (this.author == null)
        break label1835;
      i96 = this.author.hashCode();
      int i97 = 37 * (i96 + i95);
      if (this.section_auto_grid_rows == null)
        break label1841;
      i98 = this.section_auto_grid_rows.hashCode();
      int i99 = 37 * (i98 + i97);
      if (this.preload_info == null)
        break label1847;
      i100 = this.preload_info.hashCode();
      int i101 = 37 * (i100 + i99);
      if (this.is_image == null)
        break label1853;
      i102 = this.is_image.hashCode();
      int i103 = 37 * (i102 + i101);
      if (this.is_short_video == null)
        break label1859;
      i104 = this.is_short_video.hashCode();
      int i105 = 37 * (i104 + i103);
      if (this.is_highlight == null)
        break label1865;
      i106 = this.is_highlight.hashCode();
      int i107 = 37 * (i106 + i105);
      if (this.category != null)
        i = this.category.hashCode();
      i108 = 37 * (i107 + i);
      if (this.content_platform == null)
        break label1871;
    }
    label1542: label1547: label1553: label1559: label1565: label1571: label1577: label1583: label1589: label1595: label1601: label1607: label1613: label1871: for (int i109 = this.content_platform.hashCode(); ; i109 = 0)
    {
      int i110 = 37 * (i109 + i108);
      String str = this.review_name;
      int i111 = 0;
      if (str != null)
        i111 = this.review_name.hashCode();
      j = i110 + i111;
      this.hashCode = j;
      return j;
      k = 0;
      break;
      n = 0;
      break label48;
      i2 = 0;
      break label74;
      i4 = 0;
      break label100;
      i6 = 0;
      break label126;
      i8 = 0;
      break label152;
      i10 = i;
      break label180;
      i12 = i;
      break label208;
      i14 = 0;
      break label234;
      i16 = 0;
      break label260;
      i18 = 0;
      break label286;
      i20 = 0;
      break label312;
      i22 = 0;
      break label338;
      label1619: i24 = 0;
      break label364;
      label1625: i26 = 0;
      break label390;
      label1631: i28 = 0;
      break label416;
      label1637: i30 = 0;
      break label442;
      label1643: i32 = i;
      break label470;
      label1649: i34 = 0;
      break label496;
      label1655: i36 = 0;
      break label522;
      label1661: i38 = 0;
      break label548;
      i40 = 0;
      break label574;
      i42 = 0;
      break label600;
      i44 = 0;
      break label626;
      i46 = 0;
      break label652;
      i48 = i;
      break label680;
      i50 = i;
      break label708;
      i52 = 0;
      break label734;
      i54 = 0;
      break label760;
      i56 = 0;
      break label786;
      i58 = 0;
      break label812;
      i60 = 0;
      break label838;
      i62 = i;
      break label866;
      i64 = i;
      break label894;
      label1745: i66 = 0;
      break label920;
      label1751: i68 = 0;
      break label946;
      label1757: i70 = 0;
      break label972;
      label1763: i72 = 0;
      break label998;
      label1769: i74 = i;
      break label1026;
      label1775: i76 = 0;
      break label1052;
      label1781: i78 = i;
      break label1080;
      label1787: i80 = 0;
      break label1106;
      i82 = 0;
      break label1132;
      i84 = 0;
      break label1158;
      i86 = 0;
      break label1184;
      i88 = 0;
      break label1210;
      i90 = 0;
      break label1236;
      i92 = 0;
      break label1262;
      i94 = 0;
      break label1288;
      i96 = 0;
      break label1314;
      i98 = 0;
      break label1340;
      i100 = 0;
      break label1366;
      i102 = 0;
      break label1392;
      i104 = 0;
      break label1418;
      i106 = 0;
      break label1444;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Entity
 * JD-Core Version:    0.6.0
 */