package com.wandoujia.jupiter.category.fragment;

import android.content.Context;
import android.support.v7.widget.cc;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.homepage.HomeScrollFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;

public class CategoryListFragment extends HomeScrollFragment
{
  public static CategoryListFragment a(CategoryListFragment.CategoryType paramCategoryType)
  {
    CategoryListFragment localCategoryListFragment = new CategoryListFragment();
    String str;
    switch (b.a[paramCategoryType.ordinal()])
    {
    default:
      str = JupiterApplication.e().getString(2131624334);
    case 1:
    case 2:
    }
    while (true)
    {
      localCategoryListFragment.setArguments(BaseListFragment.b(CategoryListFragment.CategoryType.access$000(paramCategoryType), CategoryListFragment.CategoryType.access$100(paramCategoryType), str));
      return localCategoryListFragment;
      str = JupiterApplication.e().getString(2131624335);
      continue;
      str = JupiterApplication.e().getString(2131624337);
    }
  }

  protected final int a()
  {
    return 2130903332;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    p localp = new p(this.k);
    localp.a(new com.wandoujia.jupiter.category.b.a());
    return localp;
  }

  protected final cc b()
  {
    return new c(this, this.a, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.CategoryListFragment
 * JD-Core Version:    0.6.0
 */