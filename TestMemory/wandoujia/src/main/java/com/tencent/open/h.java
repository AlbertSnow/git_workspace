package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;

public abstract class h extends Dialog
{
  protected f a;

  @SuppressLint({"NewApi"})
  protected final WebChromeClient b = new b.1(this);

  public h(Context paramContext)
  {
    super(paramContext, 16973840);
  }

  protected abstract void a(String paramString);

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.h
 * JD-Core Version:    0.6.0
 */