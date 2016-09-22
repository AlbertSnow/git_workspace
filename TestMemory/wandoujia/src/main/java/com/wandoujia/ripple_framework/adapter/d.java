package com.wandoujia.ripple_framework.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.log.Log;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class d extends at
{
  protected ArrayList<Fragment> a = new ArrayList();
  private final q b;
  private ac c = null;
  private ArrayList<Fragment.SavedState> d = new ArrayList();
  private Fragment e = null;

  public d(q paramq)
  {
    this.b = paramq;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.a.size() > paramInt)
    {
      Fragment localFragment2 = (Fragment)this.a.get(paramInt);
      if (localFragment2 != null)
        return localFragment2;
    }
    if (this.c == null)
      this.c = this.b.a();
    Fragment localFragment1 = b(paramInt);
    if (this.d.size() > paramInt)
    {
      Fragment.SavedState localSavedState = (Fragment.SavedState)this.d.get(paramInt);
      if (localSavedState != null)
        localFragment1.setInitialSavedState(localSavedState);
    }
    while (this.a.size() <= paramInt)
      this.a.add(null);
    localFragment1.setMenuVisibility(false);
    localFragment1.setUserVisibleHint(false);
    this.a.set(paramInt, localFragment1);
    this.c.a(paramViewGroup.getId(), localFragment1);
    return localFragment1;
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = localBundle.getParcelableArray("states");
      this.d.clear();
      this.a.clear();
      if (arrayOfParcelable != null)
        for (int j = 0; j < arrayOfParcelable.length; j++)
          this.d.add((Fragment.SavedState)arrayOfParcelable[j]);
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!str.startsWith("f"))
          continue;
        int i = Integer.parseInt(str.substring(1));
        Fragment localFragment = this.b.a(localBundle, str);
        if (localFragment != null)
        {
          while (this.a.size() <= i)
            this.a.add(null);
          localFragment.setMenuVisibility(false);
          this.a.set(i, localFragment);
          continue;
        }
        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str, new Object[0]);
      }
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.c == null)
      this.c = this.b.a();
    while (this.d.size() <= paramInt)
      this.d.add(null);
    this.d.set(paramInt, this.b.a(localFragment));
    this.a.set(paramInt, null);
    this.c.a(localFragment);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }

  public abstract Fragment b(int paramInt);

  public final void b()
  {
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
      this.b.b();
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
      Fragment.SavedState[] arrayOfSavedState = new Fragment.SavedState[this.d.size()];
      this.d.toArray(arrayOfSavedState);
      localBundle1.putParcelableArray("states", arrayOfSavedState);
    }
    int j = 0;
    Bundle localBundle2 = localBundle1;
    while (j < this.a.size())
    {
      Fragment localFragment = (Fragment)this.a.get(j);
      if ((localFragment != null) && (localFragment.isAdded()))
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        String str = "f" + j;
        this.b.a(localBundle2, str, localFragment);
      }
      j++;
    }
    return localBundle2;
  }

  public Fragment e(int paramInt)
  {
    if (paramInt < this.a.size())
      return (Fragment)this.a.get(paramInt);
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.d
 * JD-Core Version:    0.6.0
 */