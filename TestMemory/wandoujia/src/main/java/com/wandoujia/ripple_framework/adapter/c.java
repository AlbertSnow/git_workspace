package com.wandoujia.ripple_framework.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.support.v4.view.at;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.logv3.toolkit.ai;
import com.wandoujia.ripple_framework.fragment.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

public final class c extends at
  implements ai
{
  private final k a;
  private final q b;
  private ac c = null;
  private SparseArray<Fragment> d = new SparseArray();
  private SparseArray<Fragment.SavedState> e = new SparseArray();
  private Fragment f = null;
  private List<Model> g;

  public c(k paramk, q paramq)
  {
    this.a = paramk;
    this.b = paramq;
  }

  public final int a()
  {
    if (this.g == null)
      return 0;
    return this.g.size();
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      SparseArray localSparseArray = localBundle.getSparseParcelableArray("state");
      this.e.clear();
      this.d.clear();
      if (localSparseArray != null)
        this.e = localSparseArray;
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!str.startsWith("f"))
          continue;
        int i = Integer.parseInt(str.substring(1));
        Fragment localFragment = this.b.a(localBundle, str);
        if (localFragment == null)
          continue;
        localFragment.setMenuVisibility(false);
        this.d.put(i, localFragment);
      }
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.c == null)
      this.c = this.b.a();
    this.e.put(paramInt, this.b.a(localFragment));
    this.d.remove(paramInt);
    this.c.a(localFragment);
  }

  public final void a(List<Model> paramList)
  {
    this.g = paramList;
    d();
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }

  public final void b()
  {
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
      if (this.b != null)
        this.b.b();
    }
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (localFragment != this.f)
    {
      if (this.f != null)
      {
        this.f.setMenuVisibility(false);
        this.f.setUserVisibleHint(false);
      }
      if (localFragment != null)
      {
        localFragment.setMenuVisibility(true);
        localFragment.setUserVisibleHint(true);
      }
      this.f = localFragment;
    }
  }

  public final Parcelable c()
  {
    int i = this.e.size();
    Bundle localBundle1 = null;
    if (i > 0)
    {
      localBundle1 = new Bundle();
      localBundle1.putSparseParcelableArray("state", this.e);
    }
    int j = 0;
    Bundle localBundle2 = localBundle1;
    while (j < this.d.size())
    {
      Fragment localFragment = (Fragment)this.d.get(this.d.keyAt(j));
      if (localFragment != null)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        String str = "f" + this.d.keyAt(j);
        this.b.a(localBundle2, str, localFragment);
      }
      j++;
    }
    return localBundle2;
  }

  public final Fragment e(int paramInt)
  {
    return (Fragment)this.d.get(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.c
 * JD-Core Version:    0.6.0
 */