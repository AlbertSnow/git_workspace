package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SubscribeItemPackage extends Message
{
  public static final String DEFAULT_ITEM_CREATETIME = "";
  public static final String DEFAULT_ITEM_FEEDNAME = "";
  public static final String DEFAULT_ITEM_ID = "";
  public static final String DEFAULT_ITEM_TYPE = "";
  public static final String DEFAULT_ITEM_UPDATETIME = "";

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String item_createTime;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String item_feedName;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String item_id;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String item_type;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String item_updateTime;

  private SubscribeItemPackage(SubscribeItemPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.item_type = paramBuilder.item_type;
    this.item_id = paramBuilder.item_id;
    this.item_createTime = paramBuilder.item_createTime;
    this.item_updateTime = paramBuilder.item_updateTime;
    this.item_feedName = paramBuilder.item_feedName;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SubscribeItemPackage localSubscribeItemPackage;
    do
    {
      return true;
      if (!(paramObject instanceof SubscribeItemPackage))
        return false;
      localSubscribeItemPackage = (SubscribeItemPackage)paramObject;
    }
    while ((equals(this.item_type, localSubscribeItemPackage.item_type)) && (equals(this.item_id, localSubscribeItemPackage.item_id)) && (equals(this.item_createTime, localSubscribeItemPackage.item_createTime)) && (equals(this.item_updateTime, localSubscribeItemPackage.item_updateTime)) && (equals(this.item_feedName, localSubscribeItemPackage.item_feedName)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.item_type == null)
        break label142;
      j = this.item_type.hashCode();
      int k = j * 37;
      if (this.item_id == null)
        break label147;
      m = this.item_id.hashCode();
      int n = 37 * (m + k);
      if (this.item_createTime == null)
        break label153;
      i1 = this.item_createTime.hashCode();
      i2 = 37 * (i1 + n);
      if (this.item_updateTime == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.item_updateTime.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      String str = this.item_feedName;
      int i5 = 0;
      if (str != null)
        i5 = this.item_feedName.hashCode();
      i = i4 + i5;
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribeItemPackage
 * JD-Core Version:    0.6.0
 */