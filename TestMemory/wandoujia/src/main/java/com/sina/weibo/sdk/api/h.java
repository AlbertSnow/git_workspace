package com.sina.weibo.sdk.api;

import android.os.Bundle;

public final class h
{
  public TextObject a;
  public ImageObject b;
  public BaseMediaObject c;

  public final Bundle a(Bundle paramBundle)
  {
    if (this.a != null)
    {
      paramBundle.putParcelable("_weibo_message_text", this.a);
      paramBundle.putString("_weibo_message_text_extra", this.a.b());
    }
    if (this.b != null)
    {
      paramBundle.putParcelable("_weibo_message_image", this.b);
      paramBundle.putString("_weibo_message_image_extra", this.b.b());
    }
    if (this.c != null)
    {
      paramBundle.putParcelable("_weibo_message_media", this.c);
      paramBundle.putString("_weibo_message_media_extra", this.c.b());
    }
    return paramBundle;
  }

  public final boolean a()
  {
    if ((this.a != null) && (!this.a.a()));
    do
      return false;
    while (((this.b != null) && (!this.b.a())) || ((this.c != null) && (!this.c.a())) || ((this.a == null) && (this.b == null) && (this.c == null)));
    return true;
  }

  public final h b(Bundle paramBundle)
  {
    this.a = ((TextObject)paramBundle.getParcelable("_weibo_message_text"));
    if (this.a != null)
      this.a.a(paramBundle.getString("_weibo_message_text_extra"));
    this.b = ((ImageObject)paramBundle.getParcelable("_weibo_message_image"));
    if (this.b != null)
      this.b.a(paramBundle.getString("_weibo_message_image_extra"));
    this.c = ((BaseMediaObject)paramBundle.getParcelable("_weibo_message_media"));
    if (this.c != null)
      this.c.a(paramBundle.getString("_weibo_message_media_extra"));
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.h
 * JD-Core Version:    0.6.0
 */