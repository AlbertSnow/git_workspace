package com.wandoujia.jupiter.subscribe.fragment;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class SubscribeListFragment extends ListFragment
{
  protected a<Model> a(String paramString)
  {
    p localp = new p(paramString);
    localp.a(false);
    return localp;
  }

  protected String e()
  {
    return getClass().getSimpleName();
  }

  public void onDestroyView()
  {
    ((BaseActivity)getActivity()).removeList(this.k);
    super.onDestroyView();
  }

  public void onResume()
  {
    super.onResume();
    SubscribeRefreshFlagChecker.a(getActivity());
    if (SubscribeRefreshFlagChecker.a(e()))
      this.j.j();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new f());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.SubscribeListFragment
 * JD-Core Version:    0.6.0
 */