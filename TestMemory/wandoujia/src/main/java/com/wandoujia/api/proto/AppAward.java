package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AppAward extends Message
{
  public static final String DEFAULT_AUTHOR_DESC = "";
  public static final String DEFAULT_AUTHOR_LINK = "";
  public static final String DEFAULT_AUTHOR_NAME = "";
  public static final String DEFAULT_BANNER = "";
  public static final String DEFAULT_BLOG_IMAGE = "";
  public static final String DEFAULT_BLOG_LINK = "";
  public static final String DEFAULT_BLOG_TITLE = "";
  public static final String DEFAULT_COMMENT = "";
  public static final String DEFAULT_COVER = "";
  public static final Long DEFAULT_CREATION = Long.valueOf(0L);
  public static final String DEFAULT_DESCRIPTION = "";
  public static final Integer DEFAULT_ISSUE = Integer.valueOf(0);
  public static final String DEFAULT_MARKDOWN_COMMENT = "";
  public static final Long DEFAULT_MODIFICATION = Long.valueOf(0L);

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String author_desc;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String author_link;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String author_name;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String banner;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String blog_image;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String blog_link;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String blog_title;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String comment;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String cover;

  @ProtoField(tag=9, type=Message.Datatype.INT64)
  public final Long creation;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=10, type=Message.Datatype.INT32)
  public final Integer issue;

  @ProtoField(tag=11, type=Message.Datatype.STRING)
  public final String markdown_comment;

  @ProtoField(tag=12, type=Message.Datatype.INT64)
  public final Long modification;

  private AppAward(AppAward.Builder paramBuilder)
  {
    super(paramBuilder);
    this.author_desc = paramBuilder.author_desc;
    this.author_link = paramBuilder.author_link;
    this.author_name = paramBuilder.author_name;
    this.banner = paramBuilder.banner;
    this.blog_image = paramBuilder.blog_image;
    this.blog_link = paramBuilder.blog_link;
    this.blog_title = paramBuilder.blog_title;
    this.comment = paramBuilder.comment;
    this.creation = paramBuilder.creation;
    this.issue = paramBuilder.issue;
    this.markdown_comment = paramBuilder.markdown_comment;
    this.modification = paramBuilder.modification;
    this.cover = paramBuilder.cover;
    this.description = paramBuilder.description;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppAward localAppAward;
    do
    {
      return true;
      if (!(paramObject instanceof AppAward))
        return false;
      localAppAward = (AppAward)paramObject;
    }
    while ((equals(this.author_desc, localAppAward.author_desc)) && (equals(this.author_link, localAppAward.author_link)) && (equals(this.author_name, localAppAward.author_name)) && (equals(this.banner, localAppAward.banner)) && (equals(this.blog_image, localAppAward.blog_image)) && (equals(this.blog_link, localAppAward.blog_link)) && (equals(this.blog_title, localAppAward.blog_title)) && (equals(this.comment, localAppAward.comment)) && (equals(this.creation, localAppAward.creation)) && (equals(this.issue, localAppAward.issue)) && (equals(this.markdown_comment, localAppAward.markdown_comment)) && (equals(this.modification, localAppAward.modification)) && (equals(this.cover, localAppAward.cover)) && (equals(this.description, localAppAward.description)));
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
    label304: int i20;
    if (i == 0)
    {
      if (this.author_desc == null)
        break label376;
      j = this.author_desc.hashCode();
      int k = j * 37;
      if (this.author_link == null)
        break label381;
      m = this.author_link.hashCode();
      int n = 37 * (m + k);
      if (this.author_name == null)
        break label387;
      i1 = this.author_name.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.banner == null)
        break label393;
      i3 = this.banner.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.blog_image == null)
        break label399;
      i5 = this.blog_image.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.blog_link == null)
        break label405;
      i7 = this.blog_link.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.blog_title == null)
        break label411;
      i9 = this.blog_title.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.comment == null)
        break label417;
      i11 = this.comment.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.creation == null)
        break label423;
      i13 = this.creation.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.issue == null)
        break label429;
      i15 = this.issue.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.markdown_comment == null)
        break label435;
      i17 = this.markdown_comment.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.modification == null)
        break label441;
      i19 = this.modification.hashCode();
      i20 = 37 * (i19 + i18);
      if (this.cover == null)
        break label447;
    }
    label387: label393: label399: label405: label411: label417: label423: label429: label435: label441: label447: for (int i21 = this.cover.hashCode(); ; i21 = 0)
    {
      int i22 = 37 * (i21 + i20);
      String str = this.description;
      int i23 = 0;
      if (str != null)
        i23 = this.description.hashCode();
      i = i22 + i23;
      this.hashCode = i;
      return i;
      label376: j = 0;
      break;
      label381: m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
      i13 = 0;
      break label226;
      i15 = 0;
      break label252;
      i17 = 0;
      break label278;
      i19 = 0;
      break label304;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppAward
 * JD-Core Version:    0.6.0
 */