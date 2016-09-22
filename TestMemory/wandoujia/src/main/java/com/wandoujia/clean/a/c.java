package com.wandoujia.clean.a;

import android.content.pm.IPackageDataObserver.Stub;
import android.support.v4.app.b;

final class c extends IPackageDataObserver.Stub
{
  public final void onRemoveCompleted(String paramString, boolean paramBoolean)
  {
    b.y("clean success : " + paramBoolean + " : " + paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.a.c
 * JD-Core Version:    0.6.0
 */