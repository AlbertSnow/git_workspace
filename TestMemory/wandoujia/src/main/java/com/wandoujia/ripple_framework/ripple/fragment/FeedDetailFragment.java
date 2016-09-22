package com.wandoujia.ripple_framework.ripple.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.cc;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.fragment.k;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.theme.ThemeType;
import com.wandoujia.ripple_framework.video.ViewFocusManager;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class FeedDetailFragment extends BaseListFragment
{
  public static final int a;
  private static final int b = com.wandoujia.ripple_framework.i.k().g().getResources().getDimensionPixelSize(R.dimen.feed_detail_margin_top);
  private static final int c = com.wandoujia.ripple_framework.i.k().g().getResources().getDimensionPixelSize(R.dimen.toolbar_height);
  private static final int m;
  private static int n;
  private boolean A = false;
  private Model o;
  private com.wandoujia.nirvana.framework.ui.a p;
  private ViewGroup q;
  private ImageView r;
  private FrameLayout s;
  private boolean t = false;
  private boolean u = false;
  private int v = 0;
  private int w = 0;
  private int x = 0;
  private int y = 1;
  private boolean z = false;

  static
  {
    com.wandoujia.ripple_framework.i.k().g().getResources().getDimensionPixelSize(R.dimen.detail_icon_margin);
    android.support.v4.app.b.c(com.wandoujia.ripple_framework.i.k().g(), 200.0F);
    m = (int)android.support.v4.app.b.c(com.wandoujia.ripple_framework.i.k().g(), 72.0F);
    a = b + c;
    n = b + c;
  }

  protected final int a()
  {
    return R.layout.rip_feed_page;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    return new com.wandoujia.ripple_framework.ripple.a.a(this.o);
  }

  protected void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.q = ((ViewGroup)paramView.findViewById(R.id.feed_action_bar));
    this.s = ((FrameLayout)paramView.findViewById(R.id.fake_icon_container));
    this.r = ((ImageView)paramView.findViewById(R.id.fake_icon));
    this.toolbarMargin.setBackgroundResource(R.color.transparent);
    this.h.setEnabled(false);
    this.g.a(new e(this));
    this.h.a(b, b + 2 * getResources().getDimensionPixelOffset(R.dimen.toolbar_height) + getResources().getDimensionPixelSize(R.dimen.pull_to_refresh_height));
    if (this.o == null);
  }

  public final void a(DataLoadListener.Op paramOp)
  {
    if (!isAdded())
      return;
    getView().findViewById(R.id.stub_background).setVisibility(0);
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    Model localModel = ((com.wandoujia.ripple_framework.ripple.a.a)this.j).n();
    if ((!paramg.f) && (!CollectionUtils.isEmpty(localModel.w())))
      this.y = 2;
    if (!isAdded());
    do
    {
      return;
      this.p = com.wandoujia.ripple_framework.c.h.h(this.toolbarContainer).a(new com.wandoujia.ripple_framework.theme.a().a(new i(this)));
      this.p.a(localModel);
      new com.wandoujia.nirvana.framework.ui.a(this.r).a(new af()).a(localModel);
      this.toolbarContainer.setOnClickListener(new j(this, 0));
      this.s.setOnClickListener(new j(this, 0));
      getView().post(new h(this));
    }
    while ((this.v == 0) && (this.w == 0));
    ((LinearLayoutManager)this.g.getLayoutManager()).e(this.v, this.w);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    if ((this.j == null) || (this.j.m()))
      this.h.e();
    if (!isAdded());
  }

  protected final cc b()
  {
    return new com.wandoujia.ripple_framework.adapter.decoration.b();
  }

  protected final LinearLayoutManager e_()
  {
    this.f.getContext();
    return new com.wandoujia.ripple_framework.view.b.a();
  }

  public com.wandoujia.ripple_framework.theme.a getThemePresenter()
  {
    return super.getThemePresenter().a(R.id.stub_background, ThemeType.BACKGROUND, R.color.bg_default).a(R.id.fake_icon_container, ThemeType.BACKGROUND, R.drawable.ic_icon_label);
  }

  protected boolean initializePageUri(View paramView)
  {
    if (this.o == null)
      return false;
    Logger localLogger = com.wandoujia.ripple_framework.i.k().h();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "ripple://items";
    arrayOfObject[1] = Long.valueOf(this.o.e());
    localLogger.a(paramView, String.format("%s/%d", arrayOfObject));
    return true;
  }

  public boolean isSystemBarEnabled()
  {
    return this.t;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (paramBundle != null)
    {
      this.v = paramBundle.getInt("item_position");
      this.w = paramBundle.getInt("item_offset");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() == null);
    do
    {
      return;
      this.o = ((k)getParentFragment()).a(this);
    }
    while (this.o != null);
    Toast.makeText(getActivity(), R.string.network_error, 0).show();
    getActivity().finish();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (this.p != null)
      this.p.a();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("TRANS_Y", this.x);
    paramBundle.putInt("item_position", this.g.getScrollItemIndex());
    paramBundle.putInt("item_offset", this.g.getScrollItemOffset());
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(R.layout.ripple_empty_view_for_detail);
    this.h.setEmptyViewRender(new d());
    this.i.a();
  }

  public void onViewStateRestored(Bundle paramBundle)
  {
    super.onViewStateRestored(paramBundle);
    if (paramBundle != null)
    {
      this.x = paramBundle.getInt("TRANS_Y", 0);
      ViewHelper.setTranslationY(this.q, -this.x);
    }
  }

  protected final boolean p()
  {
    return false;
  }

  protected final boolean q()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.FeedDetailFragment
 * JD-Core Version:    0.6.0
 */