package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ArticleDetail extends Message
{
  public static final String DEFAULT_AUTHOR = "";
  public static final String DEFAULT_CONTENT_HTML = "";
  public static final Boolean DEFAULT_IS_AD;
  public static final List<ParagraphEmoji> DEFAULT_PARAGRAPH_EMOJI;
  public static final Long DEFAULT_PUBLISHED_DATE = Long.valueOf(0L);

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String author;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String content_html;

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean is_ad;

  @ProtoField(label=Message.Label.REPEATED, tag=5)
  public final List<ParagraphEmoji> paragraph_emoji;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long published_date;

  static
  {
    DEFAULT_IS_AD = Boolean.valueOf(false);
    DEFAULT_PARAGRAPH_EMOJI = Collections.emptyList();
  }

  private ArticleDetail(ArticleDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.published_date = paramBuilder.published_date;
    this.author = paramBuilder.author;
    this.is_ad = paramBuilder.is_ad;
    this.content_html = paramBuilder.content_html;
    this.paragraph_emoji = immutableCopyOf(paramBuilder.paragraph_emoji);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ArticleDetail localArticleDetail;
    do
    {
      return true;
      if (!(paramObject instanceof ArticleDetail))
        return false;
      localArticleDetail = (ArticleDetail)paramObject;
    }
    while ((equals(this.published_date, localArticleDetail.published_date)) && (equals(this.author, localArticleDetail.author)) && (equals(this.is_ad, localArticleDetail.is_ad)) && (equals(this.content_html, localArticleDetail.content_html)) && (equals(this.paragraph_emoji, localArticleDetail.paragraph_emoji)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i4;
    if (i == 0)
    {
      if (this.published_date == null)
        break label144;
      j = this.published_date.hashCode();
      int k = j * 37;
      if (this.author == null)
        break label149;
      m = this.author.hashCode();
      int n = 37 * (m + k);
      if (this.is_ad == null)
        break label155;
      i1 = this.is_ad.hashCode();
      int i2 = 37 * (i1 + n);
      String str = this.content_html;
      int i3 = 0;
      if (str != null)
        i3 = this.content_html.hashCode();
      i4 = 37 * (i2 + i3);
      if (this.paragraph_emoji == null)
        break label161;
    }
    label144: label149: label155: label161: for (int i5 = this.paragraph_emoji.hashCode(); ; i5 = 1)
    {
      i = i5 + i4;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ArticleDetail
 * JD-Core Version:    0.6.0
 */