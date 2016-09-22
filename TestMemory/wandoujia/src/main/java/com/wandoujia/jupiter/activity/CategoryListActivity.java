package com.wandoujia.jupiter.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.category.fragment.CategoryListFragment;
import com.wandoujia.jupiter.category.fragment.CategoryListFragment.CategoryType;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class CategoryListActivity extends BaseActivity
{
  private void a(Intent paramIntent)
  {
    CategoryListFragment.CategoryType localCategoryType = CategoryListFragment.CategoryType.parseFromString(paramIntent.getData().toString());
    if (localCategoryType == null)
      localCategoryType = CategoryListFragment.CategoryType.ALL;
    CategoryListFragment localCategoryListFragment = CategoryListFragment.a(localCategoryType);
    getSupportFragmentManager().a().b(16908290, localCategoryListFragment).a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.CategoryListActivity
 * JD-Core Version:    0.6.0
 */