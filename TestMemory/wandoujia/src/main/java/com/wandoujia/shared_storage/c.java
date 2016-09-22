package com.wandoujia.shared_storage;

import android.os.FileObserver;

final class c extends FileObserver
{
  c(b paramb, String paramString)
  {
    super(paramString, 520);
  }

  public final void onEvent(int paramInt, String paramString)
  {
    int i = paramInt & 0xFFF;
    if ((i == 8) || (i == 512))
      this.a.e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.c
 * JD-Core Version:    0.6.0
 */