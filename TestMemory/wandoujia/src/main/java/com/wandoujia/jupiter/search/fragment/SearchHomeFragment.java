package com.wandoujia.jupiter.search.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.presenter.eh;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;
import com.wandoujia.jupiter.toolbar.JupiterToolbarForSearch;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchHomeFragment extends AutoHideInputMethodFragment
{
  private SearchSuggestionTextView b;
  private JupiterToolbarForSearch c;
  private com.wandoujia.jupiter.view.p m;

  protected final int a()
  {
    return 2130903331;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ch", Config.f());
    localHashMap.put("source", Config.f());
    localHashMap.put("timestamp", Long.toString(System.currentTimeMillis()));
    com.wandoujia.jupiter.p localp = new com.wandoujia.jupiter.p(paramString, localHashMap);
    localp.a(com.wandoujia.jupiter.d.a.f());
    localp.a(new String[] { "timestamp" });
    return localp;
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if ((com.wandoujia.nirvana.framework.network.page.a.b(paramOp, paramg)) && (this.g != null))
    {
      this.g.i();
      this.g.h();
    }
    this.h.setSwipeRefreshEnabled(true);
    if (this.m != null)
      this.m.b();
    Model localModel2;
    ViewGroup localViewGroup;
    if (!CollectionUtils.isEmpty(this.j.c()))
    {
      localModel2 = (Model)this.j.a(0);
      localViewGroup = (ViewGroup)this.f.findViewById(2131493691);
      if (localModel2.g() == TemplateTypeEnum.TemplateType.SEARCH_FILTER)
        break label201;
      localViewGroup.setVisibility(8);
    }
    while (true)
    {
      if (!CollectionUtils.isEmpty(this.j.c()))
      {
        Model localModel1 = (Model)this.j.a(0);
        if ((localModel1.f() == ContentTypeEnum.ContentType.SEARCH_DIRECT) && (localModel1.t() != null))
        {
          ((NavigationManager)i.k().a("navigation")).a(this.f.getContext(), localModel1.t());
          if (isAdded())
            getActivity().finish();
        }
      }
      pageLoaded();
      return;
      label201: localViewGroup.setVisibility(0);
      new com.wandoujia.nirvana.framework.ui.a(localViewGroup).a(new eh()).a(localModel2);
    }
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    super.a(paramOp, paramException);
    this.h.setSwipeRefreshEnabled(true);
    this.m = com.wandoujia.jupiter.view.p.a(getActivity(), this.j, paramException);
    this.m.a();
  }

  public final void a(com.wandoujia.nirvana.framework.network.page.a parama)
  {
    if (this.j != null)
    {
      this.j.c().clear();
      ((com.wandoujia.jupiter.p)this.j).o();
    }
    super.a(parama);
  }

  public final void e()
  {
    if (this.c != null)
      this.c.a(false);
  }

  protected void initializeToolbar(View paramView, Bundle paramBundle)
  {
    super.initializeToolbar(paramView, paramBundle);
    if (this.toolbar != null)
    {
      this.toolbar.setNavigationIcon(2130838123);
      this.toolbar.setBackgroundColor(Color.parseColor("#ffffffff"));
      this.toolbar.setTitleTextColor(Color.parseColor("#ff000000"));
    }
  }

  public boolean isSystemBarEnabled()
  {
    return true;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEmptyLayout(2130903419);
    this.h.setEmptyViewRender(new b(this));
    this.b = ((SearchSuggestionTextView)paramView.findViewById(2131493984));
    this.b.setHintType(SearchTypeForHint.ALL);
    this.c = ((JupiterToolbarForSearch)paramView.findViewById(2131493713));
    this.c.a(false);
    if ((getArguments() != null) && (getArguments().getString("extra_query") != null))
    {
      String str = getArguments().getString("extra_query");
      if ((str != null) && (this.b != null))
        this.b.a(str);
    }
    this.h.setSwipeRefreshEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.SearchHomeFragment
 * JD-Core Version:    0.6.0
 */