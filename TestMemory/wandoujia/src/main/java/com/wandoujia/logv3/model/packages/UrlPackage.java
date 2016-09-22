package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class UrlPackage extends Message
{
  public static final String DEFAULT_NORMALIZED_URL = "";
  public static final String DEFAULT_URL = "";
  public static final UrlPackage.Vertical DEFAULT_VERTICAL = UrlPackage.Vertical.OTHERS;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String normalized_url;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String url;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final UrlPackage.Vertical vertical;

  private UrlPackage(UrlPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.url = paramBuilder.url;
    this.normalized_url = paramBuilder.normalized_url;
    this.vertical = paramBuilder.vertical;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    UrlPackage localUrlPackage;
    do
    {
      return true;
      if (!(paramObject instanceof UrlPackage))
        return false;
      localUrlPackage = (UrlPackage)paramObject;
    }
    while ((equals(this.url, localUrlPackage.url)) && (equals(this.normalized_url, localUrlPackage.normalized_url)) && (equals(this.vertical, localUrlPackage.vertical)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.url == null)
        break label90;
      j = this.url.hashCode();
      k = j * 37;
      if (this.normalized_url == null)
        break label95;
    }
    label90: label95: for (int m = this.normalized_url.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      UrlPackage.Vertical localVertical = this.vertical;
      int i1 = 0;
      if (localVertical != null)
        i1 = this.vertical.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.UrlPackage
 * JD-Core Version:    0.6.0
 */