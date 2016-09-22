package com.wandoujia.jupiter.search.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cc;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.g;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.jupiter.search.manage.c;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public class SearchQueryHistoryFragment extends AutoHideInputMethodFragment
{
  private int b;
  private SearchTypeForHint c = SearchTypeForHint.ALL;
  private DataLoadListener m = new d(this);
  private c n = new e(this);

  protected final int a()
  {
    return 2130903330;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    JupiterApplication.d().f().a(this.n);
    String str = String.format("http://apis.wandoujia.com/five/v1/search/hot?format=proto&short=true", new Object[0]);
    HashMap localHashMap = new HashMap();
    localHashMap.put("timestamp", Long.toString(System.currentTimeMillis()));
    p localp = new p(str, localHashMap);
    localp.a(new String[] { "timestamp" });
    localp.a(new com.wandoujia.jupiter.search.c.a(this.c));
    localp.a(this.m);
    return localp;
  }

  protected final cc b()
  {
    return new g();
  }

  protected final LinearLayoutManager e_()
  {
    this.f.getContext();
    GridLayoutManager localGridLayoutManager = new GridLayoutManager(2);
    localGridLayoutManager.a(new f(this));
    return localGridLayoutManager;
  }

  protected boolean initializePageUri(View paramView)
  {
    i.k().h().a(paramView, "wdj://search/history");
    return true;
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

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getArguments().getString("KEY_SEARCH_TYPE_FOR_HINT");
    if (!TextUtils.isEmpty(str))
      this.c = SearchTypeForHint.valueOf(str);
  }

  public void onDestroy()
  {
    if ((this.j != null) && (this.m != null))
      this.j.b(this.m);
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    this.j.j();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    ((SearchSuggestionTextView)paramView.findViewById(2131493984)).setHintType(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.SearchQueryHistoryFragment
 * JD-Core Version:    0.6.0
 */