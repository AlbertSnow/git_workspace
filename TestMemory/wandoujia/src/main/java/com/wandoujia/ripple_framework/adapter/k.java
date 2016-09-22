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
import com.wandoujia.ripple_framework.fragment.AsyncLoadFragment;
import java.util.Iterator;

public abstract class k extends at
  implements ai
{
  private final q a;
  private ac b = null;
  private SparseArray<Fragment> c = new SparseArray();
  private SparseArray<Fragment.SavedState> d = new SparseArray();
  private Fragment e = null;
  private boolean f = true;

  public k(q paramq)
  {
    this.a = paramq;
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      SparseArray localSparseArray = localBundle.getSparseParcelableArray("state");
      this.d.clear();
      this.c.clear();
      if (localSparseArray != null)
        this.d = localSparseArray;
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!str.startsWith("f"))
          continue;
        int i = Integer.parseInt(str.substring(1));
        Fragment localFragment = this.a.a(localBundle, str);
        if (localFragment == null)
          continue;
        localFragment.setMenuVisibility(false);
        this.c.put(i, localFragment);
      }
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.b == null)
      this.b = this.a.a();
    this.d.put(paramInt, this.a.a(localFragment));
    this.c.remove(paramInt);
    this.b.a(localFragment);
  }

  public final void a(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      for (int i = 0; i < this.c.size(); i++)
      {
        Fragment localFragment = (Fragment)this.c.valueAt(i);
        if (!(localFragment instanceof AsyncLoadFragment))
          continue;
        ((AsyncLoadFragment)localFragment).a(paramBoolean);
      }
    }
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }

  public abstract Fragment b(int paramInt);

  public final void b()
  {
    if (this.b != null)
    {
      this.b.b();
      this.b = null;
      if (this.a != null)
        this.a.b();
    }
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (localFragment != this.e)
    {
      if (this.e != null)
      {
        this.e.setMenuVisibility(false);
        this.e.setUserVisibleHint(false);
      }
      if (localFragment != null)
      {
        localFragment.setMenuVisibility(true);
        localFragment.setUserVisibleHint(true);
      }
      this.e = localFragment;
    }
  }

  public final Parcelable c()
  {
    int i = this.d.size();
    Bundle localBundle1 = null;
    if (i > 0)
    {
      localBundle1 = new Bundle();
      localBundle1.putSparseParcelableArray("state", this.d);
    }
    int j = 0;
    Bundle localBundle2 = localBundle1;
    while (j < this.c.size())
    {
      Fragment localFragment = (Fragment)this.c.get(this.c.keyAt(j));
      if (localFragment != null)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        String str = "f" + this.c.keyAt(j);
        this.a.a(localBundle2, str, localFragment);
      }
      j++;
    }
    return localBundle2;
  }

  public final Fragment e(int paramInt)
  {
    return (Fragment)this.c.get(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.k
 * JD-Core Version:    0.6.0
 */