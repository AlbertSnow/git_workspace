package com.wandoujia.p4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wandoujia.ripple_framework.view.slidingtab.e;

public final class k
{
  private e a;
  private Class<? extends Fragment> b;
  private Bundle c;

  public k(e parame, Class<? extends Fragment> paramClass, Bundle paramBundle)
  {
    this.a = parame;
    this.b = paramClass;
    this.c = paramBundle;
  }

  public final e a()
  {
    return this.a;
  }

  public final void a(Bundle paramBundle)
  {
    this.c = paramBundle;
  }

  public final Class<? extends Fragment> b()
  {
    return this.b;
  }

  public final Bundle c()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.k
 * JD-Core Version:    0.6.0
 */