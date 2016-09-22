package com.wandoujia.ripple_framework.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.cc;
import android.support.v7.widget.cf;
import android.support.v7.widget.cg;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.toolkit.aj;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.adapter.decoration.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.video.ViewFocusManager;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.r;

public abstract class BaseListFragment extends AsyncLoadFragment
  implements aj, DataLoadListener<Model>
{
  private cc a;
  private Handler b;
  private boolean c;
  protected boolean e;
  protected View f;
  protected ObservableRecyclerView g;
  protected RecyclerViewAutoLoadingLayout h;
  protected ViewFocusManager i;
  protected a<Model> j;
  protected String k;
  protected com.wandoujia.ripple_framework.adapter.f l;
  private boolean m = false;
  private cf n = new e(this);
  private r o = new f(this);

  public static Bundle a(String paramString1, String paramString2, BaseListFragment.ViewConfig paramViewConfig)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("page_api_url", paramString2);
    localBundle.putString("page_intent_uri", paramString1);
    if (paramViewConfig != null)
      localBundle.putSerializable("view_config", paramViewConfig);
    return localBundle;
  }

  public static Bundle b(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, null);
  }

  public static Bundle b(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("page_api_url", paramString2);
    localBundle.putString("page_intent_uri", paramString1);
    localBundle.putSerializable("title", paramString3);
    return localBundle;
  }

  public static Bundle c(String paramString)
  {
    return a(paramString, null, null);
  }

  private void e()
  {
    if (this.j != null)
    {
      this.j.b(this.l);
      this.j.b(this.h);
      this.j.b(this);
    }
  }

  private void f()
  {
    if ((!isAdded()) || (this.i == null) || (!getUserVisibleHint()))
      return;
    this.b.removeCallbacksAndMessages(null);
    this.b.post(new g(this));
  }

  private void g()
  {
    if (this.i != null)
      this.i.c();
  }

  protected int a()
  {
    return R.layout.rip_recycler_auto_loading;
  }

  protected abstract a<Model> a(String paramString);

  protected void a(View paramView, Bundle paramBundle)
  {
  }

  public void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
  }

  public void a(a parama)
  {
    e();
    this.j = parama;
    if (this.j != null)
    {
      this.j.a(this.l);
      this.j.a(this.h);
      this.j.a(this);
    }
    this.h.setList(parama);
    this.l.a(parama);
    if (CollectionUtils.isEmpty(parama.c()))
    {
      this.j.i();
      return;
    }
    parama.f();
  }

  protected abstract cc b();

  protected final void b(int paramInt)
  {
    if (paramInt == 0)
      f();
    do
      return;
    while (this.b == null);
    this.b.removeCallbacksAndMessages(null);
  }

  public int c()
  {
    return 0;
  }

  public final void d_()
  {
    a(this.j);
  }

  protected LinearLayoutManager e_()
  {
    this.f.getContext();
    return new LinearLayoutManager();
  }

  protected abstract com.wandoujia.ripple_framework.adapter.f h();

  public final void i()
  {
    if (this.g == null)
      return;
    this.g.h();
  }

  public final void j()
  {
    if (this.g == null)
      return;
    this.g.i();
  }

  protected final void k()
  {
    super.k();
    if (this.m);
    BaseActivity localBaseActivity;
    do
    {
      return;
      this.m = true;
      localBaseActivity = (BaseActivity)getActivity();
    }
    while (localBaseActivity == null);
    boolean bool = TextUtils.isEmpty(this.k);
    a locala1 = null;
    if (!bool)
      locala1 = ((BaseActivity)getActivity()).findList(this.k);
    if (locala1 == null);
    for (a locala2 = localBaseActivity.addList(a(this.k)); ; locala2 = locala1)
    {
      this.j = locala2;
      return;
    }
  }

  protected final boolean l()
  {
    return this.d;
  }

  public final ObservableRecyclerView m()
  {
    return this.g;
  }

  protected final void n()
  {
    this.c = true;
  }

  protected final void o()
  {
    if (!this.c)
      f();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = getArguments().getString("page_api_url");
    this.e = getArguments().getBoolean("api_url_enable_cache", true);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.f = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.h = ((RecyclerViewAutoLoadingLayout)this.f.findViewById(R.id.loadable_recycler_view));
    this.g = ((ObservableRecyclerView)this.f.findViewById(R.id.recycler_view));
    ObservableRecyclerView localObservableRecyclerView = this.g;
    cg localcg = new cg();
    localcg.a(TemplateTypeEnum.TemplateType.APP.ordinal());
    localcg.a(TemplateTypeEnum.TemplateType.FEED_LITE.ordinal());
    localObservableRecyclerView.setRecycledViewPool(localcg);
    this.g.setItemViewCacheSize(2);
    this.g.setLayoutManager(e_());
    cc localcc = b();
    if (this.a != null)
      this.g.b(this.a);
    if (localcc != null)
    {
      this.a = localcc;
      this.g.a(this.a);
    }
    this.g.setItemAnimator(null);
    this.g.setNeedLogCardShow(p());
    return this.f;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    this.l.e();
    e();
  }

  public void onPause()
  {
    super.onPause();
    Log.d("ListFragment", "on pause", new Object[0]);
    g();
  }

  public void onResume()
  {
    super.onResume();
    Log.d("ListFragment", "on resume", new Object[0]);
    f();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.g.a(this.n);
    this.g.setOnLayoutListener(this.o);
    this.l = h();
    if ((q()) && (this.l.g() != null))
    {
      com.wandoujia.ripple_framework.k localk1 = this.l.g();
      if (this.i == null)
      {
        this.i = new ViewFocusManager();
        this.b = new Handler();
      }
      localk1.a(this.i);
    }
    com.wandoujia.ripple_framework.util.k localk = new com.wandoujia.ripple_framework.util.k(0);
    this.l.g().a(Integer.valueOf(R.id.recycler_pool), localk);
    this.h.setAdapter(this.l);
    BaseListFragment.ViewConfig localViewConfig = (BaseListFragment.ViewConfig)getArguments().getSerializable("view_config");
    if (localViewConfig != null)
    {
      if ((localViewConfig.firstSpace > 0) || (localViewConfig.lastSpace > 0) || (localViewConfig.betweenSpace > 0))
        this.g.a(new c(localViewConfig.firstSpace, localViewConfig.lastSpace, localViewConfig.betweenSpace));
      this.h.setSwipeRefreshEnabled(localViewConfig.swipeRefresh);
    }
    a(paramView, paramBundle);
  }

  protected boolean p()
  {
    return true;
  }

  protected boolean q()
  {
    return false;
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    Log.d("ListFragment", "set user visible hint %b", arrayOfObject);
    if (paramBoolean)
    {
      f();
      return;
    }
    g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.BaseListFragment
 * JD-Core Version:    0.6.0
 */