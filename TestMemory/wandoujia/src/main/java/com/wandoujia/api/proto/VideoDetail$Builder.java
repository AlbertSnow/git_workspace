package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class VideoDetail$Builder extends Message.Builder<VideoDetail>
{
  public List<String> actor;
  public List<String> common_download_source;
  public Image cover;
  public Long created_date;
  public String default_episode;
  public Long download_count;
  public Double duration;
  public Long episode_date;
  public Integer episode_num;
  public Integer height;
  public String large_cover_url;
  public Long latest_episode_date;
  public Integer latest_episode_num;
  public String name;
  public Boolean no_download_urls;
  public Boolean no_play_infos;
  public Boolean no_private_download_urls;
  public List<String> play_source_set;
  public List<String> private_download_source;
  public List<String> provider_name;
  public String recommend;
  public String section_recommend;
  public String small_cover_url;
  public String sub_type;
  public String subscribe_url;
  public Integer total_episodes_num;
  public Long total_size;
  public Long updated_date;
  public Long video_id;
  public String video_title;
  public String video_type;
  public Integer width;

  public VideoDetail$Builder()
  {
  }

  public VideoDetail$Builder(VideoDetail paramVideoDetail)
  {
    super(paramVideoDetail);
    if (paramVideoDetail == null)
      return;
    this.no_play_infos = paramVideoDetail.no_play_infos;
    this.no_download_urls = paramVideoDetail.no_download_urls;
    this.no_private_download_urls = paramVideoDetail.no_private_download_urls;
    this.total_episodes_num = paramVideoDetail.total_episodes_num;
    this.latest_episode_num = paramVideoDetail.latest_episode_num;
    this.video_id = paramVideoDetail.video_id;
    this.total_size = paramVideoDetail.total_size;
    this.created_date = paramVideoDetail.created_date;
    this.updated_date = paramVideoDetail.updated_date;
    this.download_count = paramVideoDetail.download_count;
    this.latest_episode_date = paramVideoDetail.latest_episode_date;
    this.recommend = paramVideoDetail.recommend;
    this.video_title = paramVideoDetail.video_title;
    this.subscribe_url = paramVideoDetail.subscribe_url;
    this.large_cover_url = paramVideoDetail.large_cover_url;
    this.small_cover_url = paramVideoDetail.small_cover_url;
    this.section_recommend = paramVideoDetail.section_recommend;
    this.provider_name = VideoDetail.access$000(paramVideoDetail.provider_name);
    this.video_type = paramVideoDetail.video_type;
    this.sub_type = paramVideoDetail.sub_type;
    this.default_episode = paramVideoDetail.default_episode;
    this.episode_date = paramVideoDetail.episode_date;
    this.episode_num = paramVideoDetail.episode_num;
    this.private_download_source = VideoDetail.access$100(paramVideoDetail.private_download_source);
    this.common_download_source = VideoDetail.access$200(paramVideoDetail.common_download_source);
    this.play_source_set = VideoDetail.access$300(paramVideoDetail.play_source_set);
    this.name = paramVideoDetail.name;
    this.cover = paramVideoDetail.cover;
    this.actor = VideoDetail.access$400(paramVideoDetail.actor);
    this.duration = paramVideoDetail.duration;
    this.width = paramVideoDetail.width;
    this.height = paramVideoDetail.height;
  }

  public final Builder actor(List<String> paramList)
  {
    this.actor = checkForNulls(paramList);
    return this;
  }

  public final VideoDetail build()
  {
    return new VideoDetail(this, null);
  }

  public final Builder common_download_source(List<String> paramList)
  {
    this.common_download_source = checkForNulls(paramList);
    return this;
  }

  public final Builder cover(Image paramImage)
  {
    this.cover = paramImage;
    return this;
  }

  public final Builder created_date(Long paramLong)
  {
    this.created_date = paramLong;
    return this;
  }

  public final Builder default_episode(String paramString)
  {
    this.default_episode = paramString;
    return this;
  }

  public final Builder download_count(Long paramLong)
  {
    this.download_count = paramLong;
    return this;
  }

  public final Builder duration(Double paramDouble)
  {
    this.duration = paramDouble;
    return this;
  }

  public final Builder episode_date(Long paramLong)
  {
    this.episode_date = paramLong;
    return this;
  }

  public final Builder episode_num(Integer paramInteger)
  {
    this.episode_num = paramInteger;
    return this;
  }

  public final Builder height(Integer paramInteger)
  {
    this.height = paramInteger;
    return this;
  }

  public final Builder large_cover_url(String paramString)
  {
    this.large_cover_url = paramString;
    return this;
  }

  public final Builder latest_episode_date(Long paramLong)
  {
    this.latest_episode_date = paramLong;
    return this;
  }

  public final Builder latest_episode_num(Integer paramInteger)
  {
    this.latest_episode_num = paramInteger;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder no_download_urls(Boolean paramBoolean)
  {
    this.no_download_urls = paramBoolean;
    return this;
  }

  public final Builder no_play_infos(Boolean paramBoolean)
  {
    this.no_play_infos = paramBoolean;
    return this;
  }

  public final Builder no_private_download_urls(Boolean paramBoolean)
  {
    this.no_private_download_urls = paramBoolean;
    return this;
  }

  public final Builder play_source_set(List<String> paramList)
  {
    this.play_source_set = checkForNulls(paramList);
    return this;
  }

  public final Builder private_download_source(List<String> paramList)
  {
    this.private_download_source = checkForNulls(paramList);
    return this;
  }

  public final Builder provider_name(List<String> paramList)
  {
    this.provider_name = checkForNulls(paramList);
    return this;
  }

  public final Builder recommend(String paramString)
  {
    this.recommend = paramString;
    return this;
  }

  public final Builder section_recommend(String paramString)
  {
    this.section_recommend = paramString;
    return this;
  }

  public final Builder small_cover_url(String paramString)
  {
    this.small_cover_url = paramString;
    return this;
  }

  public final Builder sub_type(String paramString)
  {
    this.sub_type = paramString;
    return this;
  }

  public final Builder subscribe_url(String paramString)
  {
    this.subscribe_url = paramString;
    return this;
  }

  public final Builder total_episodes_num(Integer paramInteger)
  {
    this.total_episodes_num = paramInteger;
    return this;
  }

  public final Builder total_size(Long paramLong)
  {
    this.total_size = paramLong;
    return this;
  }

  public final Builder updated_date(Long paramLong)
  {
    this.updated_date = paramLong;
    return this;
  }

  public final Builder video_id(Long paramLong)
  {
    this.video_id = paramLong;
    return this;
  }

  public final Builder video_title(String paramString)
  {
    this.video_title = paramString;
    return this;
  }

  public final Builder video_type(String paramString)
  {
    this.video_type = paramString;
    return this;
  }

  public final Builder width(Integer paramInteger)
  {
    this.width = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.VideoDetail.Builder
 * JD-Core Version:    0.6.0
 */