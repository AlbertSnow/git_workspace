package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Detail extends Message
{

  @ProtoField(tag=17)
  public final AdDetail ad_detail;

  @ProtoField(tag=7)
  public final CommentSummary app_comment;

  @ProtoField(tag=1)
  public final AppDetail app_detail;

  @ProtoField(tag=4)
  public final ArticleDetail article_detail;

  @ProtoField(tag=8)
  public final GiftDetail gift_detail;

  @ProtoField(tag=6)
  public final IOSAppDetail ios_app_detail;

  @ProtoField(tag=15)
  public final MediaPressDetail media_press_detail;

  @ProtoField(tag=16)
  public final MorphDetail morph_detail;

  @ProtoField(tag=3)
  public final MusicDetail music_detail;

  @ProtoField(tag=10)
  public final PublisherBundleDetail publisher_bundle_detail;

  @ProtoField(tag=9)
  public final PublisherDetail publisher_detail;

  @ProtoField(tag=11)
  public final PublisherTimeDetail publisher_time_detail;

  @ProtoField(tag=13)
  public final SceneDetail scene_detail;

  @ProtoField(tag=12)
  public final ShareDetail share_detail;

  @ProtoField(tag=14)
  public final SuggestionDetail suggestion_detail;

  @ProtoField(tag=5)
  public final TodayDetail today_detail;

  @ProtoField(tag=2)
  public final VideoDetail video_detail;

  private Detail(Detail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.app_detail = paramBuilder.app_detail;
    this.video_detail = paramBuilder.video_detail;
    this.music_detail = paramBuilder.music_detail;
    this.article_detail = paramBuilder.article_detail;
    this.today_detail = paramBuilder.today_detail;
    this.ios_app_detail = paramBuilder.ios_app_detail;
    this.app_comment = paramBuilder.app_comment;
    this.gift_detail = paramBuilder.gift_detail;
    this.publisher_detail = paramBuilder.publisher_detail;
    this.publisher_bundle_detail = paramBuilder.publisher_bundle_detail;
    this.publisher_time_detail = paramBuilder.publisher_time_detail;
    this.share_detail = paramBuilder.share_detail;
    this.scene_detail = paramBuilder.scene_detail;
    this.suggestion_detail = paramBuilder.suggestion_detail;
    this.media_press_detail = paramBuilder.media_press_detail;
    this.morph_detail = paramBuilder.morph_detail;
    this.ad_detail = paramBuilder.ad_detail;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Detail localDetail;
    do
    {
      return true;
      if (!(paramObject instanceof Detail))
        return false;
      localDetail = (Detail)paramObject;
    }
    while ((equals(this.app_detail, localDetail.app_detail)) && (equals(this.video_detail, localDetail.video_detail)) && (equals(this.music_detail, localDetail.music_detail)) && (equals(this.article_detail, localDetail.article_detail)) && (equals(this.today_detail, localDetail.today_detail)) && (equals(this.ios_app_detail, localDetail.ios_app_detail)) && (equals(this.app_comment, localDetail.app_comment)) && (equals(this.gift_detail, localDetail.gift_detail)) && (equals(this.publisher_detail, localDetail.publisher_detail)) && (equals(this.publisher_bundle_detail, localDetail.publisher_bundle_detail)) && (equals(this.publisher_time_detail, localDetail.publisher_time_detail)) && (equals(this.share_detail, localDetail.share_detail)) && (equals(this.scene_detail, localDetail.scene_detail)) && (equals(this.suggestion_detail, localDetail.suggestion_detail)) && (equals(this.media_press_detail, localDetail.media_press_detail)) && (equals(this.morph_detail, localDetail.morph_detail)) && (equals(this.ad_detail, localDetail.ad_detail)));
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
    label304: int i21;
    label330: int i23;
    label356: int i25;
    label382: int i26;
    if (i == 0)
    {
      if (this.app_detail == null)
        break label454;
      j = this.app_detail.hashCode();
      int k = j * 37;
      if (this.video_detail == null)
        break label459;
      m = this.video_detail.hashCode();
      int n = 37 * (m + k);
      if (this.music_detail == null)
        break label465;
      i1 = this.music_detail.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.article_detail == null)
        break label471;
      i3 = this.article_detail.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.today_detail == null)
        break label477;
      i5 = this.today_detail.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.ios_app_detail == null)
        break label483;
      i7 = this.ios_app_detail.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.app_comment == null)
        break label489;
      i9 = this.app_comment.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.gift_detail == null)
        break label495;
      i11 = this.gift_detail.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.publisher_detail == null)
        break label501;
      i13 = this.publisher_detail.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.publisher_bundle_detail == null)
        break label507;
      i15 = this.publisher_bundle_detail.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.publisher_time_detail == null)
        break label513;
      i17 = this.publisher_time_detail.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.share_detail == null)
        break label519;
      i19 = this.share_detail.hashCode();
      int i20 = 37 * (i19 + i18);
      if (this.scene_detail == null)
        break label525;
      i21 = this.scene_detail.hashCode();
      int i22 = 37 * (i21 + i20);
      if (this.suggestion_detail == null)
        break label531;
      i23 = this.suggestion_detail.hashCode();
      int i24 = 37 * (i23 + i22);
      if (this.media_press_detail == null)
        break label537;
      i25 = this.media_press_detail.hashCode();
      i26 = 37 * (i25 + i24);
      if (this.morph_detail == null)
        break label543;
    }
    label513: label519: label525: label531: label537: label543: for (int i27 = this.morph_detail.hashCode(); ; i27 = 0)
    {
      int i28 = 37 * (i27 + i26);
      AdDetail localAdDetail = this.ad_detail;
      int i29 = 0;
      if (localAdDetail != null)
        i29 = this.ad_detail.hashCode();
      i = i28 + i29;
      this.hashCode = i;
      return i;
      label454: j = 0;
      break;
      label459: m = 0;
      break label45;
      label465: i1 = 0;
      break label70;
      label471: i3 = 0;
      break label96;
      label477: i5 = 0;
      break label122;
      label483: i7 = 0;
      break label148;
      label489: i9 = 0;
      break label174;
      label495: i11 = 0;
      break label200;
      label501: i13 = 0;
      break label226;
      label507: i15 = 0;
      break label252;
      i17 = 0;
      break label278;
      i19 = 0;
      break label304;
      i21 = 0;
      break label330;
      i23 = 0;
      break label356;
      i25 = 0;
      break label382;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Detail
 * JD-Core Version:    0.6.0
 */