package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Author$Builder extends Message.Builder<Author>
{
  public Image avatar;
  public String name;

  public Author$Builder()
  {
  }

  public Author$Builder(Author paramAuthor)
  {
    super(paramAuthor);
    if (paramAuthor == null)
      return;
    this.name = paramAuthor.name;
    this.avatar = paramAuthor.avatar;
  }

  public final Builder avatar(Image paramImage)
  {
    this.avatar = paramImage;
    return this;
  }

  public final Author build()
  {
    return new Author(this, null);
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Author.Builder
 * JD-Core Version:    0.6.0
 */