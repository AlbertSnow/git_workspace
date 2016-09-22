package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class StartpageCardPackage extends Message
{
  public static final String DEFAULT_STARTPAGE_CARD_FEED_NAME = "";
  public static final String DEFAULT_STARTPAGE_CARD_ID = "";
  public static final String DEFAULT_STARTPAGE_CARD_TEMPLATE = "";
  public static final String DEFAULT_STARTPAGE_SUB_CARD_LIST = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String startpage_card_feed_name;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String startpage_card_id;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String startpage_card_template;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String startpage_sub_card_list;

  private StartpageCardPackage(StartpageCardPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.startpage_card_feed_name = paramBuilder.startpage_card_feed_name;
    this.startpage_card_template = paramBuilder.startpage_card_template;
    this.startpage_card_id = paramBuilder.startpage_card_id;
    this.startpage_sub_card_list = paramBuilder.startpage_sub_card_list;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    StartpageCardPackage localStartpageCardPackage;
    do
    {
      return true;
      if (!(paramObject instanceof StartpageCardPackage))
        return false;
      localStartpageCardPackage = (StartpageCardPackage)paramObject;
    }
    while ((equals(this.startpage_card_feed_name, localStartpageCardPackage.startpage_card_feed_name)) && (equals(this.startpage_card_template, localStartpageCardPackage.startpage_card_template)) && (equals(this.startpage_card_id, localStartpageCardPackage.startpage_card_id)) && (equals(this.startpage_sub_card_list, localStartpageCardPackage.startpage_sub_card_list)));
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
      if (this.startpage_card_feed_name == null)
        break label116;
      j = this.startpage_card_feed_name.hashCode();
      int k = j * 37;
      if (this.startpage_card_template == null)
        break label121;
      m = this.startpage_card_template.hashCode();
      n = 37 * (m + k);
      if (this.startpage_card_id == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.startpage_card_id.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.startpage_sub_card_list;
      int i3 = 0;
      if (str != null)
        i3 = this.startpage_sub_card_list.hashCode();
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
 * Qualified Name:     com.wandoujia.logv3.model.packages.StartpageCardPackage
 * JD-Core Version:    0.6.0
 */