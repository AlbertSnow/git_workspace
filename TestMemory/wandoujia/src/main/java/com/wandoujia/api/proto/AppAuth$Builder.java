package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AppAuth$Builder extends Message.Builder<AppAuth>
{
  public String auth_text;
  public String auth_url;
  public Dialog deauth_dialog;
  public String deauth_text;

  public AppAuth$Builder()
  {
  }

  public AppAuth$Builder(AppAuth paramAppAuth)
  {
    super(paramAppAuth);
    if (paramAppAuth == null)
      return;
    this.auth_url = paramAppAuth.auth_url;
    this.auth_text = paramAppAuth.auth_text;
    this.deauth_text = paramAppAuth.deauth_text;
    this.deauth_dialog = paramAppAuth.deauth_dialog;
  }

  public final Builder auth_text(String paramString)
  {
    this.auth_text = paramString;
    return this;
  }

  public final Builder auth_url(String paramString)
  {
    this.auth_url = paramString;
    return this;
  }

  public final AppAuth build()
  {
    return new AppAuth(this, null);
  }

  public final Builder deauth_dialog(Dialog paramDialog)
  {
    this.deauth_dialog = paramDialog;
    return this;
  }

  public final Builder deauth_text(String paramString)
  {
    this.deauth_text = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppAuth.Builder
 * JD-Core Version:    0.6.0
 */