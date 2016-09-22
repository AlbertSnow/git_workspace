package com.wandoujia.p4.community;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.a;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;
import com.wandoujia.p4.views.ContentListView;
import java.util.concurrent.ExecutionException;

public abstract class PullToRefreshAsyncloadFragment<M extends BaseModel> extends NetworkListAsyncloadFragment<M>
{
  private static final int c;
  private int d = 0;
  private int e = 0;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private PullToRefreshHeaderView i;

  static
  {
    PullToRefreshAsyncloadFragment.class.getSimpleName();
    c = (int)a.a().getResources().getDimension(2131427558);
  }

  private void r()
  {
    if ((d()) && (this.i != null))
    {
      this.i.a();
      this.h = false;
    }
  }

  protected void a(int paramInt1, int paramInt2, k<M> paramk)
  {
    super.a(paramInt1, paramInt2, paramk);
    r();
  }

  protected void a(int paramInt, ExecutionException paramExecutionException)
  {
    super.a(paramInt, paramExecutionException);
    r();
  }

  protected boolean d()
  {
    return false;
  }

  protected void e()
  {
    if ((d()) && (this.i != null))
    {
      if ((!NetworkUtil.isWifiConnected(getActivity())) && (!NetworkUtil.isMobileNetworkConnected(getActivity())))
        this.i.a();
    }
    else
      return;
    this.h = true;
    this.i.a(PullToRefreshHeaderView.PullToRefreshState.LOADING);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    if ((getActivity() != null) && (d()))
    {
      this.i = PullToRefreshHeaderView.a(getActivity());
      this.i.a();
      l().a(this.i);
      if ((this.i != null) && (d()))
        break label64;
    }
    label64: ContentListView localContentListView;
    do
    {
      return;
      localContentListView = m();
    }
    while (localContentListView == null);
    localContentListView.setOnScrollListener(new d(this, localContentListView));
    localContentListView.setOnTouchListener(new e(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.PullToRefreshAsyncloadFragment
 * JD-Core Version:    0.6.0
 */