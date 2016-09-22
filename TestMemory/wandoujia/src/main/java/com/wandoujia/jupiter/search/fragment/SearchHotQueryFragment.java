package com.wandoujia.jupiter.search.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cc;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.jupiter.a.g;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;
import com.wandoujia.jupiter.toolbar.JupiterToolbarForSearch;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public class SearchHotQueryFragment extends AutoHideInputMethodFragment
{
  private SearchTypeForHint b = SearchTypeForHint.ALL;
  private JupiterToolbarForSearch c;

  protected final int a()
  {
    return 2130903331;
  }

  protected final a<Model> a(String paramString)
  {
    String str = String.format("http://apis.wandoujia.com/five/v1/search/hot?format=proto", new Object[0]);
    HashMap localHashMap = new HashMap();
    localHashMap.put("timestamp", Long.toString(System.currentTimeMillis()));
    p localp = new p(str, localHashMap);
    localp.a(new String[] { "timestamp" });
    return localp;
  }

  protected final cc b()
  {
    return new g();
  }

  protected final LinearLayoutManager e_()
  {
    this.f.getContext();
    return new GridLayoutManager(2);
  }

  protected boolean initializePageUri(View paramView)
  {
    i.k().h().a(paramView, "wdj://search/hot");
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
      this.b = SearchTypeForHint.valueOf(str);
  }

  public void onResume()
  {
    super.onResume();
    this.j.j();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    ((SearchSuggestionTextView)paramView.findViewById(2131493984)).setHintType(this.b);
    this.c = ((JupiterToolbarForSearch)paramView.findViewById(2131493713));
    this.c.a(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.SearchHotQueryFragment
 * JD-Core Version:    0.6.0
 */