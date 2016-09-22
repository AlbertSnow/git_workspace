package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class ContentPackage$Builder extends Message.Builder<ContentPackage>
{
  public String identity;
  public Boolean is_free;
  public String parent_id;
  public String parent_type;
  public String sub_type;
  public String title;
  public ContentPackage.Type type;

  public ContentPackage$Builder()
  {
  }

  public ContentPackage$Builder(ContentPackage paramContentPackage)
  {
    super(paramContentPackage);
    if (paramContentPackage == null)
      return;
    this.identity = paramContentPackage.identity;
    this.title = paramContentPackage.title;
    this.type = paramContentPackage.type;
    this.sub_type = paramContentPackage.sub_type;
    this.is_free = paramContentPackage.is_free;
    this.parent_id = paramContentPackage.parent_id;
    this.parent_type = paramContentPackage.parent_type;
  }

  public final ContentPackage build()
  {
    return new ContentPackage(this, null);
  }

  public final Builder identity(String paramString)
  {
    this.identity = paramString;
    return this;
  }

  public final Builder is_free(Boolean paramBoolean)
  {
    this.is_free = paramBoolean;
    return this;
  }

  public final Builder parent_id(String paramString)
  {
    this.parent_id = paramString;
    return this;
  }

  public final Builder parent_type(String paramString)
  {
    this.parent_type = paramString;
    return this;
  }

  public final Builder sub_type(String paramString)
  {
    this.sub_type = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  public final Builder type(ContentPackage.Type paramType)
  {
    this.type = paramType;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ContentPackage.Builder
 * JD-Core Version:    0.6.0
 */