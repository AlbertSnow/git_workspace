package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ReviewBean$Builder extends Message.Builder<ReviewBean>
{
  public String head_image;
  public String operation_title;
  public String recommend_wording;
  public List<StoryParagraph> story;

  public ReviewBean$Builder()
  {
  }

  public ReviewBean$Builder(ReviewBean paramReviewBean)
  {
    super(paramReviewBean);
    if (paramReviewBean == null)
      return;
    this.operation_title = paramReviewBean.operation_title;
    this.head_image = paramReviewBean.head_image;
    this.story = ReviewBean.access$000(paramReviewBean.story);
    this.recommend_wording = paramReviewBean.recommend_wording;
  }

  public final ReviewBean build()
  {
    return new ReviewBean(this, null);
  }

  public final Builder head_image(String paramString)
  {
    this.head_image = paramString;
    return this;
  }

  public final Builder operation_title(String paramString)
  {
    this.operation_title = paramString;
    return this;
  }

  public final Builder recommend_wording(String paramString)
  {
    this.recommend_wording = paramString;
    return this;
  }

  public final Builder story(List<StoryParagraph> paramList)
  {
    this.story = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ReviewBean.Builder
 * JD-Core Version:    0.6.0
 */