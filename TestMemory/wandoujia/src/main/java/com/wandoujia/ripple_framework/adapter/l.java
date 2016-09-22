package com.wandoujia.ripple_framework.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.q;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.toolkit.ai;
import com.wandoujia.ripple_framework.fragment.AsyncLoadFragment;
import com.wandoujia.ripple_framework.view.slidingtab.e;
import com.wandoujia.ripple_framework.view.slidingtab.g;
import java.util.ArrayList;
import java.util.List;

public final class l extends d
  implements ai, g
{
  private List<m> b;
  private final Context c;
  private boolean d = true;

  public l(Context paramContext, q paramq)
  {
    super(paramq);
    this.c = paramContext;
  }

  public final int a()
  {
    if (this.b == null)
      return 0;
    return this.b.size();
  }

  public final CharSequence a(int paramInt)
  {
    return ((m)this.b.get(paramInt)).b;
  }

  public final void a(List<m> paramList)
  {
    this.b = paramList;
  }

  public final Fragment b(int paramInt)
  {
    m localm = (m)this.b.get(paramInt);
    Fragment localFragment = Fragment.instantiate(this.c, localm.a.getName());
    if (localm.c != null)
      localFragment.setArguments(localm.c);
    localm.a(paramInt, localFragment);
    return localFragment;
  }

  public final e c(int paramInt)
  {
    if (CollectionUtils.isEmpty(this.b));
    do
      return null;
    while ((paramInt < 0) || (paramInt >= this.b.size()));
    return ((m)this.b.get(paramInt)).e;
  }

  public final void d(int paramInt)
  {
    boolean bool = true;
    switch (paramInt)
    {
    case 0:
    default:
    case 1:
    case 2:
    }
    while (this.d != bool)
    {
      this.d = bool;
      for (int i = 0; i < this.a.size(); i++)
      {
        Fragment localFragment = (Fragment)this.a.get(i);
        if (!(localFragment instanceof AsyncLoadFragment))
          continue;
        ((AsyncLoadFragment)localFragment).a(bool);
      }
      bool = false;
    }
  }

  public final Fragment e(int paramInt)
  {
    return super.e(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.l
 * JD-Core Version:    0.6.0
 */