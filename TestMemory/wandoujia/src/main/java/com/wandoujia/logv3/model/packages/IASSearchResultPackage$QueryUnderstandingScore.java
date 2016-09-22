package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class IASSearchResultPackage$QueryUnderstandingScore extends Message
{
  public static final String DEFAULT_CONTENT_VERTICAL_TYPE = "";
  public static final Float DEFAULT_SCORE = Float.valueOf(0.0F);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String content_vertical_type;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.FLOAT)
  public final Float score;

  private IASSearchResultPackage$QueryUnderstandingScore(IASSearchResultPackage.QueryUnderstandingScore.Builder paramBuilder)
  {
    super(paramBuilder);
    this.content_vertical_type = paramBuilder.content_vertical_type;
    this.score = paramBuilder.score;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    QueryUnderstandingScore localQueryUnderstandingScore;
    do
    {
      return true;
      if (!(paramObject instanceof QueryUnderstandingScore))
        return false;
      localQueryUnderstandingScore = (QueryUnderstandingScore)paramObject;
    }
    while ((equals(this.content_vertical_type, localQueryUnderstandingScore.content_vertical_type)) && (equals(this.score, localQueryUnderstandingScore.score)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.content_vertical_type == null)
        break label64;
    label64: for (int j = this.content_vertical_type.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Float localFloat = this.score;
      int m = 0;
      if (localFloat != null)
        m = this.score.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage.QueryUnderstandingScore
 * JD-Core Version:    0.6.0
 */