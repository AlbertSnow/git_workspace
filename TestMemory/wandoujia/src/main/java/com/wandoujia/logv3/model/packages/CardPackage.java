package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class CardPackage extends Message
{
  public static final String DEFAULT_IDENTITY = "";
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  public static final String DEFAULT_PARENT_ID = "";
  public static final String DEFAULT_STATUS = "";
  public static final String DEFAULT_SUB_STATUS = "";
  public static final String DEFAULT_SUB_TYPE = "";
  public static final String DEFAULT_TAG = "";
  public static final String DEFAULT_TYPE = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String identity;

  @ProtoField(tag=8, type=Message.Datatype.INT32)
  public final Integer num;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String parent_id;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String status;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String sub_status;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String sub_type;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String tag;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String type;

  private CardPackage(CardPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.identity = paramBuilder.identity;
    this.parent_id = paramBuilder.parent_id;
    this.type = paramBuilder.type;
    this.sub_type = paramBuilder.sub_type;
    this.tag = paramBuilder.tag;
    this.status = paramBuilder.status;
    this.sub_status = paramBuilder.sub_status;
    this.num = paramBuilder.num;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CardPackage localCardPackage;
    do
    {
      return true;
      if (!(paramObject instanceof CardPackage))
        return false;
      localCardPackage = (CardPackage)paramObject;
    }
    while ((equals(this.identity, localCardPackage.identity)) && (equals(this.parent_id, localCardPackage.parent_id)) && (equals(this.type, localCardPackage.type)) && (equals(this.sub_type, localCardPackage.sub_type)) && (equals(this.tag, localCardPackage.tag)) && (equals(this.status, localCardPackage.status)) && (equals(this.sub_status, localCardPackage.sub_status)) && (equals(this.num, localCardPackage.num)));
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
    label148: int i8;
    if (i == 0)
    {
      if (this.identity == null)
        break label220;
      j = this.identity.hashCode();
      int k = j * 37;
      if (this.parent_id == null)
        break label225;
      m = this.parent_id.hashCode();
      int n = 37 * (m + k);
      if (this.type == null)
        break label231;
      i1 = this.type.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.sub_type == null)
        break label237;
      i3 = this.sub_type.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.tag == null)
        break label243;
      i5 = this.tag.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.status == null)
        break label249;
      i7 = this.status.hashCode();
      i8 = 37 * (i7 + i6);
      if (this.sub_status == null)
        break label255;
    }
    label220: label225: label231: label237: label243: label249: label255: for (int i9 = this.sub_status.hashCode(); ; i9 = 0)
    {
      int i10 = 37 * (i9 + i8);
      Integer localInteger = this.num;
      int i11 = 0;
      if (localInteger != null)
        i11 = this.num.hashCode();
      i = i10 + i11;
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
      i7 = 0;
      break label148;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.CardPackage
 * JD-Core Version:    0.6.0
 */