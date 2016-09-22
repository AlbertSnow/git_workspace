package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TabPackage extends Message
{
  public static final String DEFAULT_NAME = "";
  public static final String DEFAULT_UNREAD_NUM = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String name;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String unread_num;

  private TabPackage(TabPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.name = paramBuilder.name;
    this.unread_num = paramBuilder.unread_num;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TabPackage localTabPackage;
    do
    {
      return true;
      if (!(paramObject instanceof TabPackage))
        return false;
      localTabPackage = (TabPackage)paramObject;
    }
    while ((equals(this.name, localTabPackage.name)) && (equals(this.unread_num, localTabPackage.unread_num)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.name == null)
        break label64;
    label64: for (int j = this.name.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.unread_num;
      int m = 0;
      if (str != null)
        m = this.unread_num.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TabPackage
 * JD-Core Version:    0.6.0
 */