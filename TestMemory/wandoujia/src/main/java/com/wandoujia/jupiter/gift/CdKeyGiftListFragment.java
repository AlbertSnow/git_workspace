package com.wandoujia.jupiter.gift;

import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class CdKeyGiftListFragment extends ListFragment
{
  protected final cc b()
  {
    return new c(this, this.a);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    RecyclerViewAutoLoadingLayout localRecyclerViewAutoLoadingLayout = this.h;
    a locala = new a();
    localRecyclerViewAutoLoadingLayout.setEmptyLayout(2130903418);
    localRecyclerViewAutoLoadingLayout.setEmptyViewRender(locala);
    this.h.setSwipeRefreshEnabled(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.CdKeyGiftListFragment
 * JD-Core Version:    0.6.0
 */