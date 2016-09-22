package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AppAward$Builder extends Message.Builder<AppAward>
{
  public String author_desc;
  public String author_link;
  public String author_name;
  public String banner;
  public String blog_image;
  public String blog_link;
  public String blog_title;
  public String comment;
  public String cover;
  public Long creation;
  public String description;
  public Integer issue;
  public String markdown_comment;
  public Long modification;

  public AppAward$Builder()
  {
  }

  public AppAward$Builder(AppAward paramAppAward)
  {
    super(paramAppAward);
    if (paramAppAward == null)
      return;
    this.author_desc = paramAppAward.author_desc;
    this.author_link = paramAppAward.author_link;
    this.author_name = paramAppAward.author_name;
    this.banner = paramAppAward.banner;
    this.blog_image = paramAppAward.blog_image;
    this.blog_link = paramAppAward.blog_link;
    this.blog_title = paramAppAward.blog_title;
    this.comment = paramAppAward.comment;
    this.creation = paramAppAward.creation;
    this.issue = paramAppAward.issue;
    this.markdown_comment = paramAppAward.markdown_comment;
    this.modification = paramAppAward.modification;
    this.cover = paramAppAward.cover;
    this.description = paramAppAward.description;
  }

  public final Builder author_desc(String paramString)
  {
    this.author_desc = paramString;
    return this;
  }

  public final Builder author_link(String paramString)
  {
    this.author_link = paramString;
    return this;
  }

  public final Builder author_name(String paramString)
  {
    this.author_name = paramString;
    return this;
  }

  public final Builder banner(String paramString)
  {
    this.banner = paramString;
    return this;
  }

  public final Builder blog_image(String paramString)
  {
    this.blog_image = paramString;
    return this;
  }

  public final Builder blog_link(String paramString)
  {
    this.blog_link = paramString;
    return this;
  }

  public final Builder blog_title(String paramString)
  {
    this.blog_title = paramString;
    return this;
  }

  public final AppAward build()
  {
    return new AppAward(this, null);
  }

  public final Builder comment(String paramString)
  {
    this.comment = paramString;
    return this;
  }

  public final Builder cover(String paramString)
  {
    this.cover = paramString;
    return this;
  }

  public final Builder creation(Long paramLong)
  {
    this.creation = paramLong;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder issue(Integer paramInteger)
  {
    this.issue = paramInteger;
    return this;
  }

  public final Builder markdown_comment(String paramString)
  {
    this.markdown_comment = paramString;
    return this;
  }

  public final Builder modification(Long paramLong)
  {
    this.modification = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppAward.Builder
 * JD-Core Version:    0.6.0
 */