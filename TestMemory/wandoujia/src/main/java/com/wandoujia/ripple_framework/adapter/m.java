package com.wandoujia.ripple_framework.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wandoujia.ripple_framework.view.slidingtab.e;

public class m
{
  public final Class<? extends Fragment> a;
  public final String b;
  public final Bundle c;
  public final String d;
  public final e e;

  public m(String paramString1, Class<? extends Fragment> paramClass, String paramString2, Bundle paramBundle)
  {
    this(paramString1, paramClass, paramString2, paramBundle, null);
  }

  public m(String paramString1, Class<? extends Fragment> paramClass, String paramString2, Bundle paramBundle, e parame)
  {
    this.a = paramClass;
    this.b = paramString1;
    this.d = paramString2;
    this.c = paramBundle;
    this.e = parame;
  }

  public void a(int paramInt, Fragment paramFragment)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.m
 * JD-Core Version:    0.6.0
 */