package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Entity$Builder extends Message.Builder<Entity>
{
  public Action action;
  public Action action_negative;
  public Action action_positive;
  public Boolean allow_save_image;
  public Boolean allow_share_image;
  public List<Entity> attach_entity;
  public List<Entity> attachment;
  public Author author;
  public Integer badge;
  public List<Entity> category;
  public List<Entity> channel;
  public Boolean closed_guess;
  public ContentPlatformEnum.ContentPlatform content_platform;
  public ContentTypeEnum.ContentType content_type;
  public List<Image> cover;
  public Integer cover_total_count;
  public Long datePublished;
  public String description;
  public Detail detail;
  public String detail_url;
  public FavoriteSummary favorite_summary;
  public Long follow_count;
  public String icon;
  public Image icon_image;
  public Long id;
  public String id_string;
  public List<Image> image;
  public Integer image_total_count;
  public Boolean is_highlight;
  public Boolean is_image;
  public Boolean is_short_video;
  public List<Music> music;
  public Integer music_total_count;
  public Boolean need_filter;
  public PreloadInfo preload_info;
  public Entity provider;
  public String recommend_reason;
  public String review_name;
  public Integer section_auto_grid_rows;
  public ShareSummary share_summary;
  public String snippet;
  public String strategy_name;
  public List<Entity> sub_entity;
  public String sub_title;
  public Boolean subscribed;
  public String summary;
  public Boolean support_ripple;
  public String symbol;
  public List<Tag> tag;
  public String tag_line;
  public Integer template;
  public String template_name;
  public TemplateTypeEnum.TemplateType template_type;
  public String title;
  public Integer type;
  public String vertical;
  public List<Video> video;
  public Integer video_total_count;

  public Entity$Builder()
  {
  }

  public Entity$Builder(Entity paramEntity)
  {
    super(paramEntity);
    if (paramEntity == null)
      return;
    this.id = paramEntity.id;
    this.type = paramEntity.type;
    this.template = paramEntity.template;
    this.icon = paramEntity.icon;
    this.icon_image = paramEntity.icon_image;
    this.provider = paramEntity.provider;
    this.image = Entity.access$000(paramEntity.image);
    this.cover = Entity.access$100(paramEntity.cover);
    this.title = paramEntity.title;
    this.sub_title = paramEntity.sub_title;
    this.summary = paramEntity.summary;
    this.snippet = paramEntity.snippet;
    this.tag_line = paramEntity.tag_line;
    this.detail = paramEntity.detail;
    this.action = paramEntity.action;
    this.datePublished = paramEntity.datePublished;
    this.detail_url = paramEntity.detail_url;
    this.sub_entity = Entity.access$200(paramEntity.sub_entity);
    this.template_name = paramEntity.template_name;
    this.support_ripple = paramEntity.support_ripple;
    this.vertical = paramEntity.vertical;
    this.badge = paramEntity.badge;
    this.description = paramEntity.description;
    this.action_positive = paramEntity.action_positive;
    this.action_negative = paramEntity.action_negative;
    this.attach_entity = Entity.access$300(paramEntity.attach_entity);
    this.tag = Entity.access$400(paramEntity.tag);
    this.symbol = paramEntity.symbol;
    this.content_type = paramEntity.content_type;
    this.template_type = paramEntity.template_type;
    this.id_string = paramEntity.id_string;
    this.strategy_name = paramEntity.strategy_name;
    this.video = Entity.access$500(paramEntity.video);
    this.music = Entity.access$600(paramEntity.music);
    this.image_total_count = paramEntity.image_total_count;
    this.cover_total_count = paramEntity.cover_total_count;
    this.video_total_count = paramEntity.video_total_count;
    this.music_total_count = paramEntity.music_total_count;
    this.channel = Entity.access$700(paramEntity.channel);
    this.subscribed = paramEntity.subscribed;
    this.attachment = Entity.access$800(paramEntity.attachment);
    this.favorite_summary = paramEntity.favorite_summary;
    this.share_summary = paramEntity.share_summary;
    this.recommend_reason = paramEntity.recommend_reason;
    this.follow_count = paramEntity.follow_count;
    this.closed_guess = paramEntity.closed_guess;
    this.allow_save_image = paramEntity.allow_save_image;
    this.allow_share_image = paramEntity.allow_share_image;
    this.need_filter = paramEntity.need_filter;
    this.author = paramEntity.author;
    this.section_auto_grid_rows = paramEntity.section_auto_grid_rows;
    this.preload_info = paramEntity.preload_info;
    this.is_image = paramEntity.is_image;
    this.is_short_video = paramEntity.is_short_video;
    this.is_highlight = paramEntity.is_highlight;
    this.category = Entity.access$900(paramEntity.category);
    this.content_platform = paramEntity.content_platform;
    this.review_name = paramEntity.review_name;
  }

  public final Builder action(Action paramAction)
  {
    this.action = paramAction;
    return this;
  }

  public final Builder action_negative(Action paramAction)
  {
    this.action_negative = paramAction;
    return this;
  }

  public final Builder action_positive(Action paramAction)
  {
    this.action_positive = paramAction;
    return this;
  }

  public final Builder allow_save_image(Boolean paramBoolean)
  {
    this.allow_save_image = paramBoolean;
    return this;
  }

  public final Builder allow_share_image(Boolean paramBoolean)
  {
    this.allow_share_image = paramBoolean;
    return this;
  }

  public final Builder attach_entity(List<Entity> paramList)
  {
    this.attach_entity = checkForNulls(paramList);
    return this;
  }

  public final Builder attachment(List<Entity> paramList)
  {
    this.attachment = checkForNulls(paramList);
    return this;
  }

  public final Builder author(Author paramAuthor)
  {
    this.author = paramAuthor;
    return this;
  }

  public final Builder badge(Integer paramInteger)
  {
    this.badge = paramInteger;
    return this;
  }

  public final Entity build()
  {
    return new Entity(this, null);
  }

  public final Builder category(List<Entity> paramList)
  {
    this.category = checkForNulls(paramList);
    return this;
  }

  public final Builder channel(List<Entity> paramList)
  {
    this.channel = checkForNulls(paramList);
    return this;
  }

  public final Builder closed_guess(Boolean paramBoolean)
  {
    this.closed_guess = paramBoolean;
    return this;
  }

  public final Builder content_platform(ContentPlatformEnum.ContentPlatform paramContentPlatform)
  {
    this.content_platform = paramContentPlatform;
    return this;
  }

  public final Builder content_type(ContentTypeEnum.ContentType paramContentType)
  {
    this.content_type = paramContentType;
    return this;
  }

  public final Builder cover(List<Image> paramList)
  {
    this.cover = checkForNulls(paramList);
    return this;
  }

  public final Builder cover_total_count(Integer paramInteger)
  {
    this.cover_total_count = paramInteger;
    return this;
  }

  public final Builder datePublished(Long paramLong)
  {
    this.datePublished = paramLong;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder detail(Detail paramDetail)
  {
    this.detail = paramDetail;
    return this;
  }

  public final Builder detail_url(String paramString)
  {
    this.detail_url = paramString;
    return this;
  }

  public final Builder favorite_summary(FavoriteSummary paramFavoriteSummary)
  {
    this.favorite_summary = paramFavoriteSummary;
    return this;
  }

  public final Builder follow_count(Long paramLong)
  {
    this.follow_count = paramLong;
    return this;
  }

  public final Builder icon(String paramString)
  {
    this.icon = paramString;
    return this;
  }

  public final Builder icon_image(Image paramImage)
  {
    this.icon_image = paramImage;
    return this;
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }

  public final Builder id_string(String paramString)
  {
    this.id_string = paramString;
    return this;
  }

  public final Builder image(List<Image> paramList)
  {
    this.image = checkForNulls(paramList);
    return this;
  }

  public final Builder image_total_count(Integer paramInteger)
  {
    this.image_total_count = paramInteger;
    return this;
  }

  public final Builder is_highlight(Boolean paramBoolean)
  {
    this.is_highlight = paramBoolean;
    return this;
  }

  public final Builder is_image(Boolean paramBoolean)
  {
    this.is_image = paramBoolean;
    return this;
  }

  public final Builder is_short_video(Boolean paramBoolean)
  {
    this.is_short_video = paramBoolean;
    return this;
  }

  public final Builder music(List<Music> paramList)
  {
    this.music = checkForNulls(paramList);
    return this;
  }

  public final Builder music_total_count(Integer paramInteger)
  {
    this.music_total_count = paramInteger;
    return this;
  }

  public final Builder need_filter(Boolean paramBoolean)
  {
    this.need_filter = paramBoolean;
    return this;
  }

  public final Builder preload_info(PreloadInfo paramPreloadInfo)
  {
    this.preload_info = paramPreloadInfo;
    return this;
  }

  public final Builder provider(Entity paramEntity)
  {
    this.provider = paramEntity;
    return this;
  }

  public final Builder recommend_reason(String paramString)
  {
    this.recommend_reason = paramString;
    return this;
  }

  public final Builder review_name(String paramString)
  {
    this.review_name = paramString;
    return this;
  }

  public final Builder section_auto_grid_rows(Integer paramInteger)
  {
    this.section_auto_grid_rows = paramInteger;
    return this;
  }

  public final Builder share_summary(ShareSummary paramShareSummary)
  {
    this.share_summary = paramShareSummary;
    return this;
  }

  public final Builder snippet(String paramString)
  {
    this.snippet = paramString;
    return this;
  }

  public final Builder strategy_name(String paramString)
  {
    this.strategy_name = paramString;
    return this;
  }

  public final Builder sub_entity(List<Entity> paramList)
  {
    this.sub_entity = checkForNulls(paramList);
    return this;
  }

  public final Builder sub_title(String paramString)
  {
    this.sub_title = paramString;
    return this;
  }

  public final Builder subscribed(Boolean paramBoolean)
  {
    this.subscribed = paramBoolean;
    return this;
  }

  public final Builder summary(String paramString)
  {
    this.summary = paramString;
    return this;
  }

  public final Builder support_ripple(Boolean paramBoolean)
  {
    this.support_ripple = paramBoolean;
    return this;
  }

  public final Builder symbol(String paramString)
  {
    this.symbol = paramString;
    return this;
  }

  public final Builder tag(List<Tag> paramList)
  {
    this.tag = checkForNulls(paramList);
    return this;
  }

  public final Builder tag_line(String paramString)
  {
    this.tag_line = paramString;
    return this;
  }

  @Deprecated
  public final Builder template(Integer paramInteger)
  {
    this.template = paramInteger;
    return this;
  }

  @Deprecated
  public final Builder template_name(String paramString)
  {
    this.template_name = paramString;
    return this;
  }

  public final Builder template_type(TemplateTypeEnum.TemplateType paramTemplateType)
  {
    this.template_type = paramTemplateType;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  @Deprecated
  public final Builder type(Integer paramInteger)
  {
    this.type = paramInteger;
    return this;
  }

  public final Builder vertical(String paramString)
  {
    this.vertical = paramString;
    return this;
  }

  public final Builder video(List<Video> paramList)
  {
    this.video = checkForNulls(paramList);
    return this;
  }

  public final Builder video_total_count(Integer paramInteger)
  {
    this.video_total_count = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Entity.Builder
 * JD-Core Version:    0.6.0
 */