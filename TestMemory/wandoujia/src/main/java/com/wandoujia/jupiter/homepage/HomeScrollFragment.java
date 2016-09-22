package com.wandoujia.jupiter.homepage;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class HomeScrollFragment extends ListFragment
  implements com.wandoujia.jupiter.homepage.a.a
{
  private b b;
  private int c = 0;
  private RecyclerViewAutoLoadingLayout m;

  protected int a()
  {
    return 2130903304;
  }

  protected com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    return new p(paramString, com.wandoujia.jupiter.d.a.b());
  }

  public final void a(int paramInt)
  {
    this.g.scrollBy(0, paramInt);
  }

  protected final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.c = 0;
    this.g.a(new z(this));
    this.h.setFullscreen(true);
  }

  public final void a(b paramb)
  {
    this.b = paramb;
  }

  public void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    HomePageRecyclerViewAutoLoadingLayout localHomePageRecyclerViewAutoLoadingLayout;
    if ((getParentFragment() != null) && ((getParentFragment() instanceof HomePageFragment)))
    {
      int i = ((HomePageFragment)getParentFragment()).a();
      this.g.post(new aa(this));
      if ((this.m instanceof HomePageRecyclerViewAutoLoadingLayout))
      {
        localHomePageRecyclerViewAutoLoadingLayout = (HomePageRecyclerViewAutoLoadingLayout)this.m;
        if (i < 0)
          break label84;
      }
    }
    label84: for (boolean bool = true; ; bool = false)
    {
      localHomePageRecyclerViewAutoLoadingLayout.setHomePageHeaderIsExpand(bool);
      return;
    }
  }

  public final void a_()
  {
    this.b = null;
  }

  public final int b_()
  {
    return this.c;
  }

  public final View c_()
  {
    return this.g;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.m = ((RecyclerViewAutoLoadingLayout)paramView.findViewById(2131493667));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.HomeScrollFragment
 * JD-Core Version:    0.6.0
 */