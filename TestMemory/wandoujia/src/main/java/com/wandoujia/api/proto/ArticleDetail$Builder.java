package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ArticleDetail$Builder extends Message.Builder<ArticleDetail>
{
  public String author;
  public String content_html;
  public Boolean is_ad;
  public List<ParagraphEmoji> paragraph_emoji;
  public Long published_date;

  public ArticleDetail$Builder()
  {
  }

  public ArticleDetail$Builder(ArticleDetail paramArticleDetail)
  {
    super(paramArticleDetail);
    if (paramArticleDetail == null)
      return;
    this.published_date = paramArticleDetail.published_date;
    this.author = paramArticleDetail.author;
    this.is_ad = paramArticleDetail.is_ad;
    this.content_html = paramArticleDetail.content_html;
    this.paragraph_emoji = ArticleDetail.access$000(paramArticleDetail.paragraph_emoji);
  }

  public final Builder author(String paramString)
  {
    this.author = paramString;
    return this;
  }

  public final ArticleDetail build()
  {
    return new ArticleDetail(this, null);
  }

  public final Builder content_html(String paramString)
  {
    this.content_html = paramString;
    return this;
  }

  public final Builder is_ad(Boolean paramBoolean)
  {
    this.is_ad = paramBoolean;
    return this;
  }

  public final Builder paragraph_emoji(List<ParagraphEmoji> paramList)
  {
    this.paragraph_emoji = checkForNulls(paramList);
    return this;
  }

  public final Builder published_date(Long paramLong)
  {
    this.published_date = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ArticleDetail.Builder
 * JD-Core Version:    0.6.0
 */