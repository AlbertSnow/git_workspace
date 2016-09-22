package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class SecurityInfo extends Message
{
  public static final String DEFAULT_FAILED_INFO = "";
  public static final String DEFAULT_PROVIDER = "";
  public static final String DEFAULT_STATUS = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String failed_info;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String provider;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String status;

  private SecurityInfo(SecurityInfo.Builder paramBuilder)
  {
    super(paramBuilder);
    this.failed_info = paramBuilder.failed_info;
    this.provider = paramBuilder.provider;
    this.status = paramBuilder.status;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SecurityInfo localSecurityInfo;
    do
    {
      return true;
      if (!(paramObject instanceof SecurityInfo))
        return false;
      localSecurityInfo = (SecurityInfo)paramObject;
    }
    while ((equals(this.failed_info, localSecurityInfo.failed_info)) && (equals(this.provider, localSecurityInfo.provider)) && (equals(this.status, localSecurityInfo.status)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.failed_info == null)
        break label90;
      j = this.failed_info.hashCode();
      k = j * 37;
      if (this.provider == null)
        break label95;
    }
    label90: label95: for (int m = this.provider.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.status;
      int i1 = 0;
      if (str != null)
        i1 = this.status.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SecurityInfo
 * JD-Core Version:    0.6.0
 */