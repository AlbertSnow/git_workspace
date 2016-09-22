package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Dialog$Builder extends Message.Builder<Dialog>
{
  public String message;
  public String negative;
  public String positive;
  public String title;

  public Dialog$Builder()
  {
  }

  public Dialog$Builder(Dialog paramDialog)
  {
    super(paramDialog);
    if (paramDialog == null)
      return;
    this.title = paramDialog.title;
    this.message = paramDialog.message;
    this.positive = paramDialog.positive;
    this.negative = paramDialog.negative;
  }

  public final Dialog build()
  {
    return new Dialog(this, null);
  }

  public final Builder message(String paramString)
  {
    this.message = paramString;
    return this;
  }

  public final Builder negative(String paramString)
  {
    this.negative = paramString;
    return this;
  }

  public final Builder positive(String paramString)
  {
    this.positive = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Dialog.Builder
 * JD-Core Version:    0.6.0
 */