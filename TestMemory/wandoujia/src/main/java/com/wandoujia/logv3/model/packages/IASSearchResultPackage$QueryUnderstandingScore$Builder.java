package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class IASSearchResultPackage$QueryUnderstandingScore$Builder extends Message.Builder<IASSearchResultPackage.QueryUnderstandingScore>
{
  public String content_vertical_type;
  public Float score;

  public IASSearchResultPackage$QueryUnderstandingScore$Builder()
  {
  }

  public IASSearchResultPackage$QueryUnderstandingScore$Builder(IASSearchResultPackage.QueryUnderstandingScore paramQueryUnderstandingScore)
  {
    super(paramQueryUnderstandingScore);
    if (paramQueryUnderstandingScore == null)
      return;
    this.content_vertical_type = paramQueryUnderstandingScore.content_vertical_type;
    this.score = paramQueryUnderstandingScore.score;
  }

  public final IASSearchResultPackage.QueryUnderstandingScore build()
  {
    checkRequiredFields();
    return new IASSearchResultPackage.QueryUnderstandingScore(this, null);
  }

  public final Builder content_vertical_type(String paramString)
  {
    this.content_vertical_type = paramString;
    return this;
  }

  public final Builder score(Float paramFloat)
  {
    this.score = paramFloat;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage.QueryUnderstandingScore.Builder
 * JD-Core Version:    0.6.0
 */