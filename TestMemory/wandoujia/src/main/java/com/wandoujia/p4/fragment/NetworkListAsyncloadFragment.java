package com.wandoujia.p4.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.q;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.adapter.o;
import com.wandoujia.p4.c.a;
import com.wandoujia.p4.c.j;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.c.l;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.p4.views.FetchMoreFooterView;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class NetworkListAsyncloadFragment<M extends BaseModel> extends NetworkAsyncLoadFragment
{
  protected ContentListView a;
  protected com.wandoujia.p4.adapter.h<M> b;
  private FetchMoreFooterView c;
  private o d;
  private l<M> e;
  private List<M> f;
  private int g;
  private Parcelable h;
  private NetworkListAsyncloadFragment<M>.h i;
  private j<M> j = new c(this);

  private static void d()
  {
    if (q.b() != null)
      q.b().g();
  }

  private boolean e()
  {
    if ((getActivity() != null) && (!getActivity().isFinishing()))
    {
      Fragment localFragment = getParentFragment();
      if ((localFragment instanceof TabHostFragment))
      {
        TabHostFragment localTabHostFragment = (TabHostFragment)localFragment;
        return localTabHostFragment.b(localTabHostFragment.d()) == this;
      }
      return true;
    }
    return false;
  }

  private NetworkListAsyncloadFragment<M>.h f()
  {
    if (this.i == null)
      this.i = new h(this, JupiterApplication.d().getApplicationContext());
    return this.i;
  }

  protected static boolean p()
  {
    return false;
  }

  protected abstract a<M> a();

  protected ContentListView a(View paramView)
  {
    return (ContentListView)paramView.findViewById(2131493123);
  }

  protected void a(int paramInt1, int paramInt2, k<M> paramk)
  {
    d();
    if (paramk.a())
      if ((paramInt1 == 0) && (!paramk.a.isEmpty()) && (paramk.c.booleanValue()))
      {
        this.d.a(this.a, paramk.b.longValue());
        f().a(NetworkListAsyncloadFragment.Message.REFRESHING, 5000L);
        f().a(NetworkListAsyncloadFragment.Message.REFRESH_IS_SLOW, 10000L);
      }
    while (true)
    {
      if (!paramk.a.isEmpty())
      {
        this.d.b(this.c);
        this.c.a();
        this.f = CollectionUtils.replaceFromPosition(this.b.b(), paramk.a, paramInt1);
        this.b.a(this.f);
        this.f = null;
        this.d.notifyDataSetChanged();
      }
      if (this.h != null)
      {
        this.a.onRestoreInstanceState(this.h);
        this.h = null;
      }
      if ((o()) && (!paramk.a()) && (paramInt1 == 0) && (!paramk.a.isEmpty()) && (this.a.getSelectedItemPosition() != 0))
        this.a.setSelection(0);
      return;
      if (paramk.a.isEmpty())
      {
        if (paramInt1 == 0)
        {
          c();
          continue;
        }
        this.d.b(this.c);
        this.c.b();
        continue;
      }
      if (paramInt1 != 0)
        continue;
      this.d.a();
      if (this.b.isEmpty())
        continue;
      this.b.c();
      if ((!e()) || (!isResumed()))
        continue;
      if ((this.d.b()) && (h.a(f())))
      {
        f().a(NetworkListAsyncloadFragment.Message.REFRESH_SUCCESS);
        continue;
      }
      f().a();
    }
  }

  protected void a(int paramInt, ExecutionException paramExecutionException)
  {
    d();
    if (isAdded())
      p.a(getActivity(), new e(this), getString(2131625501)).a();
    if (paramInt == 0)
    {
      this.d.a();
      f().a(NetworkListAsyncloadFragment.Message.REFRESH_FAILED);
    }
  }

  protected final boolean a(int paramInt)
  {
    if ((this.g != paramInt) && (super.needToLoadData()));
    for (int k = 1; ; k = 0)
    {
      if (k != 0)
        this.g = paramInt;
      return k;
    }
  }

  protected abstract com.wandoujia.p4.adapter.h<M> b();

  protected abstract void c();

  protected void g()
  {
    this.g = 0;
    if ((this.e != null) && (this.e.d() != null))
      this.e.d().d();
    if (this.a != null)
      this.a.post(new f(this));
  }

  protected int getLayoutResId()
  {
    return 2130903056;
  }

  public final void h()
  {
    if (this.i != null)
      this.i.a();
  }

  protected final l<M> i()
  {
    if (this.e == null)
      this.e = new l(a(), this.j, 15, 15, o());
    return this.e;
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  protected final void j()
  {
    if (this.e != null)
    {
      this.e.e();
      this.e = null;
    }
  }

  protected final com.wandoujia.p4.adapter.h<M> k()
  {
    return this.b;
  }

  protected final m l()
  {
    return this.d;
  }

  protected final ContentListView m()
  {
    return this.a;
  }

  public final FetchMoreFooterView n()
  {
    return this.c;
  }

  protected boolean o()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.h = paramBundle.getParcelable("phoenix.intent.extra.LIST_STATE");
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    this.a = a(paramView);
    com.wandoujia.p4.utils.c.a(this.a);
    this.c = FetchMoreFooterView.a(this.a);
    ContentListView localContentListView = this.a;
    this.b = b();
    this.d = new o(this.b);
    localContentListView.setAdapter(this.d);
    this.a.setOnScrollListener(new d(this));
  }

  public void onPause()
  {
    super.onPause();
    h();
  }

  protected void onPrepareLoading()
  {
    this.g = 0;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if ((paramBundle != null) && (this.a != null))
      paramBundle.putParcelable("phoenix.intent.extra.LIST_STATE", this.a.onSaveInstanceState());
    super.onSaveInstanceState(paramBundle);
  }

  protected void onStartLoading()
  {
    if (!this.isInflated)
      return;
    i().a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.NetworkListAsyncloadFragment
 * JD-Core Version:    0.6.0
 */