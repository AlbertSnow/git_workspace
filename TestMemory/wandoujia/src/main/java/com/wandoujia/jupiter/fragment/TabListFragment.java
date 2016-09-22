package com.wandoujia.jupiter.fragment;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.fragment.CommonTabListFragment;
import com.wandoujia.ripple_framework.model.Model;

public class TabListFragment extends CommonTabListFragment
{
  protected final a a(String paramString)
  {
    return new com.wandoujia.jupiter.p(paramString);
  }

  protected m a(Model paramModel)
  {
    Bundle localBundle = new Bundle();
    if (getArguments() != null)
      localBundle.putAll(getArguments());
    String str1 = paramModel.t().intent;
    String str2 = paramModel.t().url;
    if (str2 == null)
      str2 = "";
    while (true)
    {
      localBundle.putAll(ListFragment.b(str1, str2));
      localBundle.putBoolean("force_close_toolbar", true);
      return new m(paramModel.n(), ListFragment.class, paramModel.t().intent, localBundle);
      if (!str2.startsWith("/"))
        continue;
      str2 = "http://ripple.wandoujia.com" + str2;
    }
  }

  protected final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    super.a(paramOp, paramException);
    if (isAdded())
      com.wandoujia.jupiter.view.p.a(getActivity(), this.a, paramException).a();
  }

  protected final int c()
  {
    return 2130903403;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (this.toolbarDeco != null)
      this.toolbarDeco.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.TabListFragment
 * JD-Core Version:    0.6.0
 */