package com.wandoujia.jupiter.library.fragment;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class FavoriteFragment extends ListFragment
{
  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = com.wandoujia.account.a.t();
    p localp = new p(String.format("http://apis.wandoujia.com/five/v2/favorites/%s", arrayOfObject));
    localp.a(false);
    return localp;
  }

  public void onResume()
  {
    super.onResume();
    SubscribeRefreshFlagChecker.a(getActivity());
    if (SubscribeRefreshFlagChecker.a(getClass().getSimpleName(), "FAVORITE"))
      this.j.j();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new am());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.FavoriteFragment
 * JD-Core Version:    0.6.0
 */