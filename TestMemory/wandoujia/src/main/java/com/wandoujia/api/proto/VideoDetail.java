package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoDetail extends Message
{
  public static final List<String> DEFAULT_ACTOR;
  public static final List<String> DEFAULT_COMMON_DOWNLOAD_SOURCE;
  public static final Long DEFAULT_CREATED_DATE;
  public static final String DEFAULT_DEFAULT_EPISODE = "";
  public static final Long DEFAULT_DOWNLOAD_COUNT;
  public static final Double DEFAULT_DURATION;
  public static final Long DEFAULT_EPISODE_DATE;
  public static final Integer DEFAULT_EPISODE_NUM;
  public static final Integer DEFAULT_HEIGHT;
  public static final String DEFAULT_LARGE_COVER_URL = "";
  public static final Long DEFAULT_LATEST_EPISODE_DATE;
  public static final Integer DEFAULT_LATEST_EPISODE_NUM;
  public static final String DEFAULT_NAME = "";
  public static final Boolean DEFAULT_NO_DOWNLOAD_URLS;
  public static final Boolean DEFAULT_NO_PLAY_INFOS = Boolean.valueOf(false);
  public static final Boolean DEFAULT_NO_PRIVATE_DOWNLOAD_URLS;
  public static final List<String> DEFAULT_PLAY_SOURCE_SET;
  public static final List<String> DEFAULT_PRIVATE_DOWNLOAD_SOURCE;
  public static final List<String> DEFAULT_PROVIDER_NAME;
  public static final String DEFAULT_RECOMMEND = "";
  public static final String DEFAULT_SECTION_RECOMMEND = "";
  public static final String DEFAULT_SMALL_COVER_URL = "";
  public static final String DEFAULT_SUBSCRIBE_URL = "";
  public static final String DEFAULT_SUB_TYPE = "";
  public static final Integer DEFAULT_TOTAL_EPISODES_NUM;
  public static final Long DEFAULT_TOTAL_SIZE;
  public static final Long DEFAULT_UPDATED_DATE;
  public static final Long DEFAULT_VIDEO_ID;
  public static final String DEFAULT_VIDEO_TITLE = "";
  public static final String DEFAULT_VIDEO_TYPE = "";
  public static final Integer DEFAULT_WIDTH;

  @ProtoField(label=Message.Label.REPEATED, tag=29, type=Message.Datatype.STRING)
  public final List<String> actor;

  @ProtoField(label=Message.Label.REPEATED, tag=25, type=Message.Datatype.STRING)
  public final List<String> common_download_source;

  @ProtoField(tag=28)
  public final Image cover;

  @ProtoField(tag=8, type=Message.Datatype.INT64)
  public final Long created_date;

  @ProtoField(tag=21, type=Message.Datatype.STRING)
  public final String default_episode;

  @ProtoField(tag=10, type=Message.Datatype.INT64)
  public final Long download_count;

  @ProtoField(tag=30, type=Message.Datatype.DOUBLE)
  public final Double duration;

  @ProtoField(tag=22, type=Message.Datatype.INT64)
  public final Long episode_date;

  @ProtoField(tag=23, type=Message.Datatype.INT32)
  public final Integer episode_num;

  @ProtoField(tag=32, type=Message.Datatype.INT32)
  public final Integer height;

  @ProtoField(tag=15, type=Message.Datatype.STRING)
  public final String large_cover_url;

  @ProtoField(tag=11, type=Message.Datatype.INT64)
  public final Long latest_episode_date;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer latest_episode_num;

  @ProtoField(tag=27, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=2, type=Message.Datatype.BOOL)
  public final Boolean no_download_urls;

  @ProtoField(tag=1, type=Message.Datatype.BOOL)
  public final Boolean no_play_infos;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean no_private_download_urls;

  @ProtoField(label=Message.Label.REPEATED, tag=26, type=Message.Datatype.STRING)
  public final List<String> play_source_set;

  @ProtoField(label=Message.Label.REPEATED, tag=24, type=Message.Datatype.STRING)
  public final List<String> private_download_source;

  @ProtoField(label=Message.Label.REPEATED, tag=18, type=Message.Datatype.STRING)
  public final List<String> provider_name;

  @ProtoField(tag=12, type=Message.Datatype.STRING)
  public final String recommend;

  @ProtoField(tag=17, type=Message.Datatype.STRING)
  public final String section_recommend;

  @ProtoField(tag=16, type=Message.Datatype.STRING)
  public final String small_cover_url;

  @ProtoField(tag=20, type=Message.Datatype.STRING)
  public final String sub_type;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String subscribe_url;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer total_episodes_num;

  @ProtoField(tag=7, type=Message.Datatype.INT64)
  public final Long total_size;

  @ProtoField(tag=9, type=Message.Datatype.INT64)
  public final Long updated_date;

  @ProtoField(tag=6, type=Message.Datatype.INT64)
  public final Long video_id;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String video_title;

  @ProtoField(tag=19, type=Message.Datatype.STRING)
  public final String video_type;

  @ProtoField(tag=31, type=Message.Datatype.INT32)
  public final Integer width;

  static
  {
    DEFAULT_NO_DOWNLOAD_URLS = Boolean.valueOf(false);
    DEFAULT_NO_PRIVATE_DOWNLOAD_URLS = Boolean.valueOf(false);
    DEFAULT_TOTAL_EPISODES_NUM = Integer.valueOf(0);
    DEFAULT_LATEST_EPISODE_NUM = Integer.valueOf(0);
    DEFAULT_VIDEO_ID = Long.valueOf(0L);
    DEFAULT_TOTAL_SIZE = Long.valueOf(0L);
    DEFAULT_CREATED_DATE = Long.valueOf(0L);
    DEFAULT_UPDATED_DATE = Long.valueOf(0L);
    DEFAULT_DOWNLOAD_COUNT = Long.valueOf(0L);
    DEFAULT_LATEST_EPISODE_DATE = Long.valueOf(0L);
    DEFAULT_PROVIDER_NAME = Collections.emptyList();
    DEFAULT_EPISODE_DATE = Long.valueOf(0L);
    DEFAULT_EPISODE_NUM = Integer.valueOf(0);
    DEFAULT_PRIVATE_DOWNLOAD_SOURCE = Collections.emptyList();
    DEFAULT_COMMON_DOWNLOAD_SOURCE = Collections.emptyList();
    DEFAULT_PLAY_SOURCE_SET = Collections.emptyList();
    DEFAULT_ACTOR = Collections.emptyList();
    DEFAULT_DURATION = Double.valueOf(0.0D);
    DEFAULT_WIDTH = Integer.valueOf(0);
    DEFAULT_HEIGHT = Integer.valueOf(0);
  }

  private VideoDetail(VideoDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.no_play_infos = paramBuilder.no_play_infos;
    this.no_download_urls = paramBuilder.no_download_urls;
    this.no_private_download_urls = paramBuilder.no_private_download_urls;
    this.total_episodes_num = paramBuilder.total_episodes_num;
    this.latest_episode_num = paramBuilder.latest_episode_num;
    this.video_id = paramBuilder.video_id;
    this.total_size = paramBuilder.total_size;
    this.created_date = paramBuilder.created_date;
    this.updated_date = paramBuilder.updated_date;
    this.download_count = paramBuilder.download_count;
    this.latest_episode_date = paramBuilder.latest_episode_date;
    this.recommend = paramBuilder.recommend;
    this.video_title = paramBuilder.video_title;
    this.subscribe_url = paramBuilder.subscribe_url;
    this.large_cover_url = paramBuilder.large_cover_url;
    this.small_cover_url = paramBuilder.small_cover_url;
    this.section_recommend = paramBuilder.section_recommend;
    this.provider_name = immutableCopyOf(paramBuilder.provider_name);
    this.video_type = paramBuilder.video_type;
    this.sub_type = paramBuilder.sub_type;
    this.default_episode = paramBuilder.default_episode;
    this.episode_date = paramBuilder.episode_date;
    this.episode_num = paramBuilder.episode_num;
    this.private_download_source = immutableCopyOf(paramBuilder.private_download_source);
    this.common_download_source = immutableCopyOf(paramBuilder.common_download_source);
    this.play_source_set = immutableCopyOf(paramBuilder.play_source_set);
    this.name = paramBuilder.name;
    this.cover = paramBuilder.cover;
    this.actor = immutableCopyOf(paramBuilder.actor);
    this.duration = paramBuilder.duration;
    this.width = paramBuilder.width;
    this.height = paramBuilder.height;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    VideoDetail localVideoDetail;
    do
    {
      return true;
      if (!(paramObject instanceof VideoDetail))
        return false;
      localVideoDetail = (VideoDetail)paramObject;
    }
    while ((equals(this.no_play_infos, localVideoDetail.no_play_infos)) && (equals(this.no_download_urls, localVideoDetail.no_download_urls)) && (equals(this.no_private_download_urls, localVideoDetail.no_private_download_urls)) && (equals(this.total_episodes_num, localVideoDetail.total_episodes_num)) && (equals(this.latest_episode_num, localVideoDetail.latest_episode_num)) && (equals(this.video_id, localVideoDetail.video_id)) && (equals(this.total_size, localVideoDetail.total_size)) && (equals(this.created_date, localVideoDetail.created_date)) && (equals(this.updated_date, localVideoDetail.updated_date)) && (equals(this.download_count, localVideoDetail.download_count)) && (equals(this.latest_episode_date, localVideoDetail.latest_episode_date)) && (equals(this.recommend, localVideoDetail.recommend)) && (equals(this.video_title, localVideoDetail.video_title)) && (equals(this.subscribe_url, localVideoDetail.subscribe_url)) && (equals(this.large_cover_url, localVideoDetail.large_cover_url)) && (equals(this.small_cover_url, localVideoDetail.small_cover_url)) && (equals(this.section_recommend, localVideoDetail.section_recommend)) && (equals(this.provider_name, localVideoDetail.provider_name)) && (equals(this.video_type, localVideoDetail.video_type)) && (equals(this.sub_type, localVideoDetail.sub_type)) && (equals(this.default_episode, localVideoDetail.default_episode)) && (equals(this.episode_date, localVideoDetail.episode_date)) && (equals(this.episode_num, localVideoDetail.episode_num)) && (equals(this.private_download_source, localVideoDetail.private_download_source)) && (equals(this.common_download_source, localVideoDetail.common_download_source)) && (equals(this.play_source_set, localVideoDetail.play_source_set)) && (equals(this.name, localVideoDetail.name)) && (equals(this.cover, localVideoDetail.cover)) && (equals(this.actor, localVideoDetail.actor)) && (equals(this.duration, localVideoDetail.duration)) && (equals(this.width, localVideoDetail.width)) && (equals(this.height, localVideoDetail.height)));
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
    label178: int i12;
    label204: int i14;
    label230: int i16;
    label256: int i18;
    label282: int i20;
    label308: int i22;
    label334: int i24;
    label360: int i26;
    label386: int i28;
    label412: int i30;
    label438: int i32;
    label466: int i34;
    label492: int i36;
    label518: int i38;
    label544: int i40;
    label570: int i42;
    label596: int i44;
    label624: int i46;
    label652: int i48;
    label680: int i50;
    label706: int i52;
    label732: int i55;
    label784: int i56;
    if (j == 0)
    {
      if (this.no_play_infos == null)
        break label856;
      k = this.no_play_infos.hashCode();
      int m = k * 37;
      if (this.no_download_urls == null)
        break label861;
      n = this.no_download_urls.hashCode();
      int i1 = 37 * (n + m);
      if (this.no_private_download_urls == null)
        break label867;
      i2 = this.no_private_download_urls.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.total_episodes_num == null)
        break label873;
      i4 = this.total_episodes_num.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.latest_episode_num == null)
        break label879;
      i6 = this.latest_episode_num.hashCode();
      int i7 = 37 * (i6 + i5);
      if (this.video_id == null)
        break label885;
      i8 = this.video_id.hashCode();
      int i9 = 37 * (i8 + i7);
      if (this.total_size == null)
        break label891;
      i10 = this.total_size.hashCode();
      int i11 = 37 * (i10 + i9);
      if (this.created_date == null)
        break label897;
      i12 = this.created_date.hashCode();
      int i13 = 37 * (i12 + i11);
      if (this.updated_date == null)
        break label903;
      i14 = this.updated_date.hashCode();
      int i15 = 37 * (i14 + i13);
      if (this.download_count == null)
        break label909;
      i16 = this.download_count.hashCode();
      int i17 = 37 * (i16 + i15);
      if (this.latest_episode_date == null)
        break label915;
      i18 = this.latest_episode_date.hashCode();
      int i19 = 37 * (i18 + i17);
      if (this.recommend == null)
        break label921;
      i20 = this.recommend.hashCode();
      int i21 = 37 * (i20 + i19);
      if (this.video_title == null)
        break label927;
      i22 = this.video_title.hashCode();
      int i23 = 37 * (i22 + i21);
      if (this.subscribe_url == null)
        break label933;
      i24 = this.subscribe_url.hashCode();
      int i25 = 37 * (i24 + i23);
      if (this.large_cover_url == null)
        break label939;
      i26 = this.large_cover_url.hashCode();
      int i27 = 37 * (i26 + i25);
      if (this.small_cover_url == null)
        break label945;
      i28 = this.small_cover_url.hashCode();
      int i29 = 37 * (i28 + i27);
      if (this.section_recommend == null)
        break label951;
      i30 = this.section_recommend.hashCode();
      int i31 = 37 * (i30 + i29);
      if (this.provider_name == null)
        break label957;
      i32 = this.provider_name.hashCode();
      int i33 = 37 * (i32 + i31);
      if (this.video_type == null)
        break label963;
      i34 = this.video_type.hashCode();
      int i35 = 37 * (i34 + i33);
      if (this.sub_type == null)
        break label969;
      i36 = this.sub_type.hashCode();
      int i37 = 37 * (i36 + i35);
      if (this.default_episode == null)
        break label975;
      i38 = this.default_episode.hashCode();
      int i39 = 37 * (i38 + i37);
      if (this.episode_date == null)
        break label981;
      i40 = this.episode_date.hashCode();
      int i41 = 37 * (i40 + i39);
      if (this.episode_num == null)
        break label987;
      i42 = this.episode_num.hashCode();
      int i43 = 37 * (i42 + i41);
      if (this.private_download_source == null)
        break label993;
      i44 = this.private_download_source.hashCode();
      int i45 = 37 * (i44 + i43);
      if (this.common_download_source == null)
        break label999;
      i46 = this.common_download_source.hashCode();
      int i47 = 37 * (i46 + i45);
      if (this.play_source_set == null)
        break label1005;
      i48 = this.play_source_set.hashCode();
      int i49 = 37 * (i48 + i47);
      if (this.name == null)
        break label1011;
      i50 = this.name.hashCode();
      int i51 = 37 * (i50 + i49);
      if (this.cover == null)
        break label1017;
      i52 = this.cover.hashCode();
      int i53 = 37 * (i52 + i51);
      if (this.actor != null)
        i = this.actor.hashCode();
      int i54 = 37 * (i53 + i);
      if (this.duration == null)
        break label1023;
      i55 = this.duration.hashCode();
      i56 = 37 * (i55 + i54);
      if (this.width == null)
        break label1029;
    }
    label897: label1029: for (int i57 = this.width.hashCode(); ; i57 = 0)
    {
      int i58 = 37 * (i57 + i56);
      Integer localInteger = this.height;
      int i59 = 0;
      if (localInteger != null)
        i59 = this.height.hashCode();
      j = i58 + i59;
      this.hashCode = j;
      return j;
      label856: k = 0;
      break;
      label861: n = 0;
      break label48;
      label867: i2 = 0;
      break label74;
      label873: i4 = 0;
      break label100;
      label879: i6 = 0;
      break label126;
      label885: i8 = 0;
      break label152;
      label891: i10 = 0;
      break label178;
      i12 = 0;
      break label204;
      label903: i14 = 0;
      break label230;
      label909: i16 = 0;
      break label256;
      label915: i18 = 0;
      break label282;
      label921: i20 = 0;
      break label308;
      label927: i22 = 0;
      break label334;
      label933: i24 = 0;
      break label360;
      label939: i26 = 0;
      break label386;
      label945: i28 = 0;
      break label412;
      label951: i30 = 0;
      break label438;
      label957: i32 = i;
      break label466;
      label963: i34 = 0;
      break label492;
      label969: i36 = 0;
      break label518;
      label975: i38 = 0;
      break label544;
      label981: i40 = 0;
      break label570;
      label987: i42 = 0;
      break label596;
      label993: i44 = i;
      break label624;
      label999: i46 = i;
      break label652;
      label1005: i48 = i;
      break label680;
      label1011: i50 = 0;
      break label706;
      label1017: i52 = 0;
      break label732;
      label1023: i55 = 0;
      break label784;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.VideoDetail
 * JD-Core Version:    0.6.0
 */