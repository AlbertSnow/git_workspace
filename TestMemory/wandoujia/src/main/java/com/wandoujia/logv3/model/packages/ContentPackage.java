package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class ContentPackage extends Message
{
  public static final String DEFAULT_IDENTITY = "";
  public static final Boolean DEFAULT_IS_FREE;
  public static final String DEFAULT_PARENT_ID = "";
  public static final String DEFAULT_PARENT_TYPE = "";
  public static final String DEFAULT_SUB_TYPE = "";
  public static final String DEFAULT_TITLE = "";
  public static final ContentPackage.Type DEFAULT_TYPE = ContentPackage.Type.APP;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String identity;

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean is_free;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String parent_id;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String parent_type;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String sub_type;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final ContentPackage.Type type;

  static
  {
    DEFAULT_IS_FREE = Boolean.valueOf(false);
  }

  private ContentPackage(ContentPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.title = paramBuilder.title;
    this.type = paramBuilder.type;
    this.sub_type = paramBuilder.sub_type;
    this.is_free = paramBuilder.is_free;
    this.parent_id = paramBuilder.parent_id;
    this.parent_type = paramBuilder.parent_type;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ContentPackage localContentPackage;
    do
    {
      return true;
      if (!(paramObject instanceof ContentPackage))
        return false;
      localContentPackage = (ContentPackage)paramObject;
    }
    while ((equals(this.identity, localContentPackage.identity)) && (equals(this.title, localContentPackage.title)) && (equals(this.type, localContentPackage.type)) && (equals(this.sub_type, localContentPackage.sub_type)) && (equals(this.is_free, localContentPackage.is_free)) && (equals(this.parent_id, localContentPackage.parent_id)) && (equals(this.parent_type, localContentPackage.parent_type)));
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
    label122: int i6;
    if (i == 0)
    {
      if (this.identity == null)
        break label194;
      j = this.identity.hashCode();
      int k = j * 37;
      if (this.title == null)
        break label199;
      m = this.title.hashCode();
      int n = 37 * (m + k);
      if (this.type == null)
        break label205;
      i1 = this.type.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.sub_type == null)
        break label211;
      i3 = this.sub_type.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.is_free == null)
        break label217;
      i5 = this.is_free.hashCode();
      i6 = 37 * (i5 + i4);
      if (this.parent_id == null)
        break label223;
    }
    label194: label199: label205: label211: label217: label223: for (int i7 = this.parent_id.hashCode(); ; i7 = 0)
    {
      int i8 = 37 * (i7 + i6);
      String str = this.parent_type;
      int i9 = 0;
      if (str != null)
        i9 = this.parent_type.hashCode();
      i = i8 + i9;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ContentPackage
 * JD-Core Version:    0.6.0
 */