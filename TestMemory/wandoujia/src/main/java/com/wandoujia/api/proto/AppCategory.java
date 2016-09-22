package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AppCategory extends Message
{
  public static final String DEFAULT_ALIAS = "";
  public static final Integer DEFAULT_LEVEL = Integer.valueOf(0);
  public static final String DEFAULT_NAME = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String alias;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer level;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String type;

  private AppCategory(AppCategory.Builder paramBuilder)
  {
    super(paramBuilder);
    this.alias = paramBuilder.alias;
    this.level = paramBuilder.level;
    this.name = paramBuilder.name;
    this.type = paramBuilder.type;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppCategory localAppCategory;
    do
    {
      return true;
      if (!(paramObject instanceof AppCategory))
        return false;
      localAppCategory = (AppCategory)paramObject;
    }
    while ((equals(this.alias, localAppCategory.alias)) && (equals(this.level, localAppCategory.level)) && (equals(this.name, localAppCategory.name)) && (equals(this.type, localAppCategory.type)));
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
      if (this.alias == null)
        break label116;
      j = this.alias.hashCode();
      int k = j * 37;
      if (this.level == null)
        break label121;
      m = this.level.hashCode();
      n = 37 * (m + k);
      if (this.name == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.name.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.type;
      int i3 = 0;
      if (str != null)
        i3 = this.type.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppCategory
 * JD-Core Version:    0.6.0
 */