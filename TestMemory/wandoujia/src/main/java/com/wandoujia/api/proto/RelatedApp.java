package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class RelatedApp extends Message
{
  public static final String DEFAULT_PACKAGENAME = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String packageName;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  private RelatedApp(RelatedApp.Builder paramBuilder)
  {
    super(paramBuilder);
    this.packageName = paramBuilder.packageName;
    this.title = paramBuilder.title;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    RelatedApp localRelatedApp;
    do
    {
      return true;
      if (!(paramObject instanceof RelatedApp))
        return false;
      localRelatedApp = (RelatedApp)paramObject;
    }
    while ((equals(this.packageName, localRelatedApp.packageName)) && (equals(this.title, localRelatedApp.title)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.packageName == null)
        break label64;
    label64: for (int j = this.packageName.hashCode(); ; j = 0)
    {
      int k = j * 37;
      String str = this.title;
      int m = 0;
      if (str != null)
        m = this.title.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.RelatedApp
 * JD-Core Version:    0.6.0
 */