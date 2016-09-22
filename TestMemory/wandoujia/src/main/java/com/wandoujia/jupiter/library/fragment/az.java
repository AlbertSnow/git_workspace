package com.wandoujia.jupiter.library.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.view.slidingtab.e;

final class az extends m
{
  az(String paramString1, Class paramClass, String paramString2, Bundle paramBundle, e parame)
  {
    super(paramString1, paramClass, paramString2, paramBundle, parame);
  }

  public final void a(int paramInt, Fragment paramFragment)
  {
    super.a(paramInt, paramFragment);
    ((ListFragment)paramFragment).f();
    ((ListFragment)paramFragment).a(new ba());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.az
 * JD-Core Version:    0.6.0
 */