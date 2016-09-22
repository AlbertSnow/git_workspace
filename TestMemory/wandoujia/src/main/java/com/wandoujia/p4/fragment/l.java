package com.wandoujia.p4.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.support.v4.view.at;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.ripple_framework.view.slidingtab.e;
import com.wandoujia.ripple_framework.view.slidingtab.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l extends at
  implements g
{
  private final Context a;
  private final q b;
  private final List<k> c = new ArrayList();
  private ac d = null;
  private SparseArray<Fragment> e = new SparseArray();
  private SparseArray<Fragment.SavedState> f = new SparseArray();
  private SparseArray<Bundle> g = new SparseArray();
  private Fragment h = null;
  private boolean i = true;

  static
  {
    l.class.getSimpleName();
  }

  public l(Context paramContext, q paramq)
  {
    this.b = paramq;
    this.a = paramContext;
  }

  public final int a()
  {
    return this.c.size();
  }

  public final int a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      j = -1;
      return j;
    }
    for (int j = 0; ; j++)
    {
      if (j >= this.c.size())
        break label71;
      k localk = (k)this.c.get(j);
      if ((localk != null) && (localk.a() != null) && (paramString.equals(localk.a().c())))
        break;
    }
    label71: return -1;
  }

  public final void a(int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    Bundle localBundle = (Bundle)this.g.get(paramInt);
    if (localBundle == null);
    while (true)
    {
      this.g.put(paramInt, paramBundle);
      Fragment localFragment = b(paramInt);
      if (!(localFragment instanceof b))
        break;
      ((b)localFragment).a(paramBundle);
      return;
      localBundle.putAll(paramBundle);
      paramBundle = localBundle;
    }
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      SparseArray localSparseArray = localBundle.getSparseParcelableArray("states");
      this.f.clear();
      this.e.clear();
      if (localSparseArray != null)
        this.f = localSparseArray;
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!str.startsWith("f"))
          continue;
        int j = Integer.parseInt(str.substring(1));
        try
        {
          Fragment localFragment = this.b.a(localBundle, str);
          if (localFragment == null)
            continue;
          localFragment.setMenuVisibility(false);
          this.e.put(j, localFragment);
        }
        catch (IllegalStateException localIllegalStateException)
        {
        }
      }
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.d == null)
      this.d = this.b.a();
    this.f.put(paramInt, this.b.a(localFragment));
    this.e.remove(paramInt);
    this.d.a(localFragment);
  }

  public final void a(List<k> paramList)
  {
    this.c.clear();
    if (paramList == null)
      throw new RuntimeException("delegates should not be null for setFragments()");
    int j = this.c.size();
    int k = j + paramList.size();
    for (int m = j; m < k; m++)
    {
      k localk = (k)paramList.get(m - j);
      this.g.put(m, localk.c());
    }
    this.c.addAll(paramList);
    d();
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }

  public final Fragment b(int paramInt)
  {
    return (Fragment)this.e.get(paramInt);
  }

  public final void b()
  {
    if (this.d != null)
    {
      this.d.b();
      this.d = null;
      this.b.b();
    }
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (localFragment != this.h)
    {
      if (this.h != null)
      {
        this.h.setMenuVisibility(false);
        this.h.setUserVisibleHint(false);
      }
      if (localFragment != null)
      {
        localFragment.setMenuVisibility(true);
        localFragment.setUserVisibleHint(true);
      }
      this.h = localFragment;
    }
  }

  public final Parcelable c()
  {
    int j = this.f.size();
    Bundle localBundle1 = null;
    if (j > 0)
    {
      localBundle1 = new Bundle();
      localBundle1.putSparseParcelableArray("state", this.f);
    }
    int k = 0;
    Bundle localBundle2 = localBundle1;
    while (k < this.e.size())
    {
      Fragment localFragment = (Fragment)this.e.get(this.e.keyAt(k));
      if (localFragment != null)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        String str = "f" + this.e.keyAt(k);
        this.b.a(localBundle2, str, localFragment);
      }
      k++;
    }
    return localBundle2;
  }

  public final e c(int paramInt)
  {
    if (this.c.isEmpty());
    do
      return null;
    while ((paramInt < 0) || (paramInt >= this.c.size()));
    return ((k)this.c.get(paramInt)).a();
  }

  public final String d(int paramInt)
  {
    e locale = c(paramInt);
    if (locale == null)
      return "";
    if (locale.c() == null)
      return "";
    return locale.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.l
 * JD-Core Version:    0.6.0
 */