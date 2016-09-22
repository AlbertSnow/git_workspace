package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class UserCenterInfo extends Message
{
  public static final Boolean DEFAULT_ACTIVESINA = Boolean.valueOf(false);
  public static final String DEFAULT_AVATAR = "";
  public static final String DEFAULT_UID = "";
  public static final String DEFAULT_USERNAME = "";

  @ProtoField(tag=3, type=Message.Datatype.BOOL)
  public final Boolean activeSina;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String avatar;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String uid;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String username;

  private UserCenterInfo(UserCenterInfo.Builder paramBuilder)
  {
    super(paramBuilder);
    this.uid = paramBuilder.uid;
    this.username = paramBuilder.username;
    this.activeSina = paramBuilder.activeSina;
    this.avatar = paramBuilder.avatar;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    UserCenterInfo localUserCenterInfo;
    do
    {
      return true;
      if (!(paramObject instanceof UserCenterInfo))
        return false;
      localUserCenterInfo = (UserCenterInfo)paramObject;
    }
    while ((equals(this.uid, localUserCenterInfo.uid)) && (equals(this.username, localUserCenterInfo.username)) && (equals(this.activeSina, localUserCenterInfo.activeSina)) && (equals(this.avatar, localUserCenterInfo.avatar)));
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
      if (this.uid == null)
        break label116;
      j = this.uid.hashCode();
      int k = j * 37;
      if (this.username == null)
        break label121;
      m = this.username.hashCode();
      n = 37 * (m + k);
      if (this.activeSina == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.activeSina.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.avatar;
      int i3 = 0;
      if (str != null)
        i3 = this.avatar.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.UserCenterInfo
 * JD-Core Version:    0.6.0
 */