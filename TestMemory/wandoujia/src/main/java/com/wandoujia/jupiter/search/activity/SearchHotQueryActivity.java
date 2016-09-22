package com.wandoujia.jupiter.search.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.search.fragment.SearchHotQueryFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;

public class SearchHotQueryActivity extends BaseActivity
{
  protected boolean customSystemTintBar()
  {
    return true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    SearchHotQueryFragment localSearchHotQueryFragment = new SearchHotQueryFragment();
    localSearchHotQueryFragment.setArguments(ListFragment.c("wdj://search/hot"));
    if ((getIntent() != null) && (getIntent().getData() != null))
    {
      String str = getIntent().getData().getQueryParameter("KEY_SEARCH_TYPE_FOR_HINT");
      if (localSearchHotQueryFragment.getArguments() == null)
        localSearchHotQueryFragment.setArguments(new Bundle());
      localSearchHotQueryFragment.getArguments().putString("KEY_SEARCH_TYPE_FOR_HINT", str);
    }
    BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
    localViewConfig.swipeRefresh = false;
    localSearchHotQueryFragment.getArguments().putSerializable("view_config", localViewConfig);
    getSupportFragmentManager().a().b(16908290, localSearchHotQueryFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.activity.SearchHotQueryActivity
 * JD-Core Version:    0.6.0
 */