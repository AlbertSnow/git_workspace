package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Detail$Builder extends Message.Builder<Detail>
{
  public AdDetail ad_detail;
  public CommentSummary app_comment;
  public AppDetail app_detail;
  public ArticleDetail article_detail;
  public GiftDetail gift_detail;
  public IOSAppDetail ios_app_detail;
  public MediaPressDetail media_press_detail;
  public MorphDetail morph_detail;
  public MusicDetail music_detail;
  public PublisherBundleDetail publisher_bundle_detail;
  public PublisherDetail publisher_detail;
  public PublisherTimeDetail publisher_time_detail;
  public SceneDetail scene_detail;
  public ShareDetail share_detail;
  public SuggestionDetail suggestion_detail;
  public TodayDetail today_detail;
  public VideoDetail video_detail;

  public Detail$Builder()
  {
  }

  public Detail$Builder(Detail paramDetail)
  {
    super(paramDetail);
    if (paramDetail == null)
      return;
    this.app_detail = paramDetail.app_detail;
    this.video_detail = paramDetail.video_detail;
    this.music_detail = paramDetail.music_detail;
    this.article_detail = paramDetail.article_detail;
    this.today_detail = paramDetail.today_detail;
    this.ios_app_detail = paramDetail.ios_app_detail;
    this.app_comment = paramDetail.app_comment;
    this.gift_detail = paramDetail.gift_detail;
    this.publisher_detail = paramDetail.publisher_detail;
    this.publisher_bundle_detail = paramDetail.publisher_bundle_detail;
    this.publisher_time_detail = paramDetail.publisher_time_detail;
    this.share_detail = paramDetail.share_detail;
    this.scene_detail = paramDetail.scene_detail;
    this.suggestion_detail = paramDetail.suggestion_detail;
    this.media_press_detail = paramDetail.media_press_detail;
    this.morph_detail = paramDetail.morph_detail;
    this.ad_detail = paramDetail.ad_detail;
  }

  public final Builder ad_detail(AdDetail paramAdDetail)
  {
    this.ad_detail = paramAdDetail;
    return this;
  }

  public final Builder app_comment(CommentSummary paramCommentSummary)
  {
    this.app_comment = paramCommentSummary;
    return this;
  }

  public final Builder app_detail(AppDetail paramAppDetail)
  {
    this.app_detail = paramAppDetail;
    return this;
  }

  public final Builder article_detail(ArticleDetail paramArticleDetail)
  {
    this.article_detail = paramArticleDetail;
    return this;
  }

  public final Detail build()
  {
    return new Detail(this, null);
  }

  public final Builder gift_detail(GiftDetail paramGiftDetail)
  {
    this.gift_detail = paramGiftDetail;
    return this;
  }

  public final Builder ios_app_detail(IOSAppDetail paramIOSAppDetail)
  {
    this.ios_app_detail = paramIOSAppDetail;
    return this;
  }

  public final Builder media_press_detail(MediaPressDetail paramMediaPressDetail)
  {
    this.media_press_detail = paramMediaPressDetail;
    return this;
  }

  public final Builder morph_detail(MorphDetail paramMorphDetail)
  {
    this.morph_detail = paramMorphDetail;
    return this;
  }

  public final Builder music_detail(MusicDetail paramMusicDetail)
  {
    this.music_detail = paramMusicDetail;
    return this;
  }

  public final Builder publisher_bundle_detail(PublisherBundleDetail paramPublisherBundleDetail)
  {
    this.publisher_bundle_detail = paramPublisherBundleDetail;
    return this;
  }

  public final Builder publisher_detail(PublisherDetail paramPublisherDetail)
  {
    this.publisher_detail = paramPublisherDetail;
    return this;
  }

  public final Builder publisher_time_detail(PublisherTimeDetail paramPublisherTimeDetail)
  {
    this.publisher_time_detail = paramPublisherTimeDetail;
    return this;
  }

  public final Builder scene_detail(SceneDetail paramSceneDetail)
  {
    this.scene_detail = paramSceneDetail;
    return this;
  }

  public final Builder share_detail(ShareDetail paramShareDetail)
  {
    this.share_detail = paramShareDetail;
    return this;
  }

  public final Builder suggestion_detail(SuggestionDetail paramSuggestionDetail)
  {
    this.suggestion_detail = paramSuggestionDetail;
    return this;
  }

  public final Builder today_detail(TodayDetail paramTodayDetail)
  {
    this.today_detail = paramTodayDetail;
    return this;
  }

  public final Builder video_detail(VideoDetail paramVideoDetail)
  {
    this.video_detail = paramVideoDetail;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Detail.Builder
 * JD-Core Version:    0.6.0
 */