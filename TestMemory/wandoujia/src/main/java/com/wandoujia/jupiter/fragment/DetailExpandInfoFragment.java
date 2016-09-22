package com.wandoujia.jupiter.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.toolbar.JupiterToolbar;
import com.wandoujia.jupiter.toolbar.i;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.phoenix2.av.view.PairTextContainer;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.h;

public class DetailExpandInfoFragment extends BaseFragment
{
  private JupiterToolbar a;
  private Model b;
  private AppDetail c;

  public static DetailExpandInfoFragment a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("page_api_url", paramString);
    DetailExpandInfoFragment localDetailExpandInfoFragment = new DetailExpandInfoFragment();
    localDetailExpandInfoFragment.setArguments(localBundle);
    return localDetailExpandInfoFragment;
  }

  protected void finish()
  {
    if (getActivity() != null)
      getActivity().onBackPressed();
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getArguments().getString("page_api_url");
    if ((getActivity() instanceof h))
    {
      a locala = ((h)getActivity()).findList(str);
      if ((locala != null) && (!CollectionUtils.isEmpty(locala.c())))
      {
        this.b = ((Model)locala.a(0));
        this.c = this.b.F();
      }
    }
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = android.support.v4.app.b.a(paramViewGroup, 2130903286);
    PairTextContainer localPairTextContainer = (PairTextContainer)localView.findViewById(2131493634);
    localPairTextContainer.setLeftMiniWidth(getResources().getDimensionPixelSize(2131427613));
    if (this.c != null)
      localPairTextContainer.setData$2e5c089a(com.wandoujia.jupiter.util.b.b(this.c, getActivity()));
    localView.setFocusableInTouchMode(true);
    localView.requestFocus();
    localView.setOnKeyListener(new c(this));
    return localView;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (this.c != null)
      this.toolbar.setTitle(this.c.title);
    this.a = ((JupiterToolbar)paramView.findViewById(2131493121));
    if ((this.a != null) && (this.a.getListener() != null))
      this.a.getListener().a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.DetailExpandInfoFragment
 * JD-Core Version:    0.6.0
 */