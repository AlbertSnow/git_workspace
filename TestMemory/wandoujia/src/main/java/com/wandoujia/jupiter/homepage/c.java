package com.wandoujia.jupiter.homepage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.util.SparseArray;
import com.wandoujia.api.proto.Action;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.ripple_framework.adapter.k;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.fragment.BaseListFragment.ViewConfig;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.slidingtab.e;
import com.wandoujia.ripple_framework.view.slidingtab.g;
import java.util.List;

public final class c extends k
  implements g
{
  private static final int a = "HomePageAdapter".hashCode();
  private List<Model> b;
  private SparseArray<e> c;
  private int d;

  public c(q paramq, int paramInt)
  {
    super(paramq);
    this.d = paramInt;
  }

  private static SharedPreferences e()
  {
    return JupiterApplication.e().getSharedPreferences("tab_visit_pref", 2);
  }

  public final int a()
  {
    if (this.b == null)
      return 0;
    return this.b.size();
  }

  public final CharSequence a(int paramInt)
  {
    if (this.b == null)
      return null;
    return ((Model)this.b.get(paramInt)).n();
  }

  public final void a(List<Model> paramList)
  {
    this.b = paramList;
    this.c = new SparseArray();
  }

  public final Fragment b(int paramInt)
  {
    if ((this.b == null) || (paramInt < 0) || (paramInt >= this.b.size()))
      return null;
    Model localModel = (Model)this.b.get(paramInt);
    String str4;
    Object localObject;
    label128: BaseListFragment.ViewConfig localViewConfig;
    Bundle localBundle1;
    Bundle localBundle2;
    if ((localModel.t() != null) && (!TextUtils.isEmpty(localModel.t().intent)))
      if (localModel.t().intent.startsWith(HomePageTabFragmentCreator.TabItem.access$000(HomePageTabFragmentCreator.TabItem.WEB_VIEW)))
        if (TextUtils.isEmpty(localModel.t().url))
        {
          str4 = HomePageTabFragmentCreator.TabItem.access$100(HomePageTabFragmentCreator.TabItem.WEB_VIEW);
          localObject = Fragment.instantiate(JupiterApplication.e(), HomePageTabFragmentCreator.TabItem.access$200(HomePageTabFragmentCreator.TabItem.WEB_VIEW).getName(), BaseListFragment.b(localModel.t().intent, str4));
          localViewConfig = new BaseListFragment.ViewConfig();
          localViewConfig.swipeRefresh = false;
          localViewConfig.firstSpace = this.d;
          localBundle1 = ((Fragment)localObject).getArguments();
          if (localBundle1 != null)
            break label376;
          String str1 = localModel.t().url;
          localBundle2 = ListFragment.a(localModel.t().intent, str1, localViewConfig);
          ((Fragment)localObject).setArguments(localBundle2);
        }
    while (true)
    {
      localBundle2.putBoolean("force_close_toolbar", true);
      return localObject;
      str4 = localModel.t().url;
      break;
      HomePageTabFragmentCreator.TabItem[] arrayOfTabItem = HomePageTabFragmentCreator.TabItem.values();
      int i = arrayOfTabItem.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label365;
        HomePageTabFragmentCreator.TabItem localTabItem = arrayOfTabItem[j];
        String str2 = localModel.t().intent;
        if (!TextUtils.isEmpty(str2))
        {
          int k = str2.indexOf('?');
          if (k > 0)
            str2 = str2.substring(0, k);
        }
        if (!HomePageTabFragmentCreator.TabItem.access$000(localTabItem).equals(str2))
          continue;
        if (TextUtils.isEmpty(localModel.t().url));
        for (String str3 = HomePageTabFragmentCreator.TabItem.access$100(localTabItem); ; str3 = localModel.t().url)
        {
          localObject = Fragment.instantiate(JupiterApplication.e(), HomePageTabFragmentCreator.TabItem.access$200(localTabItem).getName(), BaseListFragment.b(localModel.t().intent, str3));
          break;
        }
      }
      label365: localObject = new HomeScrollFragment();
      break label128;
      label376: localBundle1.putSerializable("view_config", localViewConfig);
      localBundle2 = localBundle1;
    }
  }

  public final e c(int paramInt)
  {
    Object localObject = (e)this.c.get(paramInt);
    if (localObject == null)
    {
      d locald = new d(this, ((Model)this.b.get(paramInt)).a());
      this.c.put(paramInt, locald);
      localObject = locald;
    }
    return (e)localObject;
  }

  public final void d(int paramInt)
  {
    Model localModel = (Model)this.b.get(paramInt);
    localModel.a(a, Boolean.valueOf(true));
    e locale = (e)this.c.get(paramInt);
    if ((locale instanceof d))
      ((d)locale).a();
    e().edit().putBoolean(localModel.a(), true).commit();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.c
 * JD-Core Version:    0.6.0
 */