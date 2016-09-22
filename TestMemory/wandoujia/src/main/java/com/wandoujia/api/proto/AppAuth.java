package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AppAuth extends Message
{
  public static final String DEFAULT_AUTH_TEXT = "";
  public static final String DEFAULT_AUTH_URL = "";
  public static final String DEFAULT_DEAUTH_TEXT = "";

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String auth_text;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String auth_url;

  @ProtoField(tag=4)
  public final Dialog deauth_dialog;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String deauth_text;

  private AppAuth(AppAuth.Builder paramBuilder)
  {
    super(paramBuilder);
    this.auth_url = paramBuilder.auth_url;
    this.auth_text = paramBuilder.auth_text;
    this.deauth_text = paramBuilder.deauth_text;
    this.deauth_dialog = paramBuilder.deauth_dialog;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AppAuth localAppAuth;
    do
    {
      return true;
      if (!(paramObject instanceof AppAuth))
        return false;
      localAppAuth = (AppAuth)paramObject;
    }
    while ((equals(this.auth_url, localAppAuth.auth_url)) && (equals(this.auth_text, localAppAuth.auth_text)) && (equals(this.deauth_text, localAppAuth.deauth_text)) && (equals(this.deauth_dialog, localAppAuth.deauth_dialog)));
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
      if (this.auth_url == null)
        break label116;
      j = this.auth_url.hashCode();
      int k = j * 37;
      if (this.auth_text == null)
        break label121;
      m = this.auth_text.hashCode();
      n = 37 * (m + k);
      if (this.deauth_text == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.deauth_text.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Dialog localDialog = this.deauth_dialog;
      int i3 = 0;
      if (localDialog != null)
        i3 = this.deauth_dialog.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.AppAuth
 * JD-Core Version:    0.6.0
 */