package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ReviewBean extends Message
{
  public static final String DEFAULT_HEAD_IMAGE = "";
  public static final String DEFAULT_OPERATION_TITLE = "";
  public static final String DEFAULT_RECOMMEND_WORDING = "";
  public static final List<StoryParagraph> DEFAULT_STORY = Collections.emptyList();

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String head_image;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String operation_title;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String recommend_wording;

  @ProtoField(label=Message.Label.REPEATED, tag=3)
  public final List<StoryParagraph> story;

  private ReviewBean(ReviewBean.Builder paramBuilder)
  {
    super(paramBuilder);
    this.operation_title = paramBuilder.operation_title;
    this.head_image = paramBuilder.head_image;
    this.story = immutableCopyOf(paramBuilder.story);
    this.recommend_wording = paramBuilder.recommend_wording;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ReviewBean localReviewBean;
    do
    {
      return true;
      if (!(paramObject instanceof ReviewBean))
        return false;
      localReviewBean = (ReviewBean)paramObject;
    }
    while ((equals(this.operation_title, localReviewBean.operation_title)) && (equals(this.head_image, localReviewBean.head_image)) && (equals(this.story, localReviewBean.story)) && (equals(this.recommend_wording, localReviewBean.recommend_wording)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.operation_title == null)
        break label118;
      j = this.operation_title.hashCode();
      int k = j * 37;
      if (this.head_image == null)
        break label123;
      m = this.head_image.hashCode();
      n = 37 * (m + k);
      if (this.story == null)
        break label129;
    }
    label129: for (int i1 = this.story.hashCode(); ; i1 = 1)
    {
      int i2 = 37 * (i1 + n);
      String str = this.recommend_wording;
      int i3 = 0;
      if (str != null)
        i3 = this.recommend_wording.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      label118: j = 0;
      break;
      label123: m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ReviewBean
 * JD-Core Version:    0.6.0
 */