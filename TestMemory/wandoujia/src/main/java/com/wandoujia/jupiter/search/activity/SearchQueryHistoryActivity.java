package com.wandoujia.jupiter.search.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.search.fragment.SearchQueryHistoryFragment;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;

public class SearchQueryHistoryActivity extends BaseActivity
{
  public static void a(Context paramContext, SearchTypeForHint paramSearchTypeForHint)
  {
    Intent localIntent = new Intent(paramContext, SearchQueryHistoryActivity.class);
    if (!(paramContext instanceof Activity))
    {
      localIntent.addFlags(268435456);
      localIntent.putExtra("KEY_SEARCH_TYPE_FOR_HINT", paramSearchTypeForHint.name());
    }
    paramContext.startActivity(localIntent);
  }

  protected boolean customSystemTintBar()
  {
    return true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    SearchQueryHistoryFragment localSearchQueryHistoryFragment = new SearchQueryHistoryFragment();
    localSearchQueryHistoryFragment.setArguments(ListFragment.c("wdj://search/history"));
    if ((getIntent() != null) && (getIntent().getExtras() != null))
    {
      if (localSearchQueryHistoryFragment.getArguments() == null)
        localSearchQueryHistoryFragment.setArguments(new Bundle());
      localSearchQueryHistoryFragment.getArguments().putAll(getIntent().getExtras());
    }
    BaseListFragment.ViewConfig localViewConfig = new BaseListFragment.ViewConfig();
    localViewConfig.swipeRefresh = false;
    localSearchQueryHistoryFragment.getArguments().putSerializable("view_config", localViewConfig);
    getSupportFragmentManager().a().b(16908290, localSearchQueryHistoryFragment).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.activity.SearchQueryHistoryActivity
 * JD-Core Version:    0.6.0
 */