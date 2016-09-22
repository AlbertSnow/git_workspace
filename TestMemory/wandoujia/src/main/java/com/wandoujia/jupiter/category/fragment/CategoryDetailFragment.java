package com.wandoujia.jupiter.category.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.fragment.TabListFragment;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class CategoryDetailFragment extends TabListFragment
{
  private String b;

  protected final m a(Model paramModel)
  {
    Action localAction = paramModel.t();
    Bundle localBundle = ListFragment.b(localAction.intent, b.F(localAction.url));
    localBundle.putBoolean("force_close_toolbar", true);
    return new m(paramModel.n(), b(), localAction.intent, localBundle);
  }

  protected final String a()
  {
    if (getArguments() == null)
      return "";
    return b.F(getArguments().getString("page_api_url"));
  }

  public final void a(int paramInt)
  {
    if (this.e != null)
      this.e.setCurrentItem(paramInt);
  }

  protected final void a(List<Model> paramList, String paramString)
  {
    if ((CollectionUtils.isEmpty(paramList)) || (CollectionUtils.isEmpty(((Model)paramList.get(0)).B())) || (getView() == null))
      return;
    Model localModel = (Model)paramList.get(0);
    setTitle(localModel.n());
    getView().post(new a(this, localModel));
  }

  protected Class<? extends Fragment> b()
  {
    return ListFragment.class;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (getArguments() != null)
      this.b = getArguments().getString("subCategoryName");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.CategoryDetailFragment
 * JD-Core Version:    0.6.0
 */